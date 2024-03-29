#include "loquat/env.hpp"
#include "loquat/version.hpp"

#include <tink/aead.h>
#include <tink/aead/aead_config.h>
#include <tink/aead/aes_gcm_key_manager.h>
#include <tink/binary_keyset_reader.h>
#include <tink/binary_keyset_writer.h>
#include <tink/cleartext_keyset_handle.h>
#include <tink/jwt/internal/jwt_mac_impl.h>
#include <tink/jwt/internal/jwt_mac_internal.h>
#include <tink/jwt/jwt_key_templates.h>
#include <tink/jwt/jwt_validator.h>
#include <tink/jwt/raw_jwt.h>
#include <tink/mac/mac_factory.h>
#include <tink/public_key_sign.h>
#include <tink/public_key_verify.h>
#include <tink/signature/signature_key_templates.h>
#include <tink/tink_config.h>
#include <tink/util/status.h>

loquat::Config::Config(const std::filesystem::path& file) {
  spdlog::info("load config from {}", file.string());
  std::ifstream in(file);
  const auto root = toml::parse(in);
  this->_port = root["port"].value_or(8080);
  this->_jwt_secret_key = root["jwt-secret-key"].value<std::string>();
  {
    const auto items = root["clients"].as_array();
    for (const auto& el : *items) {
      const auto it = el.as_string();
      const std::string id = it->get();
      this->_clients.push_back(id);
    }
    spdlog::debug("available clients: {}", absl::StrJoin(this->_clients, ", "));
  }
}

std::string loquat::Jwt::sign(const std::string& subject,
                              const std::optional<std::string> audience,
                              const std::chrono::seconds& ttl) {
  auto now = absl::Now();
  auto raw_rb = crypto::tink::RawJwtBuilder()
                    .SetIssuer(loquat::PROJECT_NAME)
                    .SetSubject(subject)
                    .SetNotBefore(now - absl::Seconds(1))
                    .SetIssuedAt(now)
                    .SetExpiration(now + absl::Seconds(ttl.count()));
  if (audience) {
    raw_rb = raw_rb.AddAudience(audience.value());
  }
  auto raw_r = raw_rb.Build();
  this->check(raw_r);
  auto raw = std::move(raw_r.value());
  auto jwt = this->load();
  auto token_r = jwt->ComputeMacAndEncode(raw);
  this->check(token_r);
  auto token = std::move(token_r.value());
  return token;
}

std::string loquat::Jwt::verify(const std::string& token,
                                const std::optional<std::string> audience) {
  spdlog::debug("{}", token);
  auto validator_b =
      crypto::tink::JwtValidatorBuilder().IgnoreTypeHeader().IgnoreIssuer();
  if (audience) {
    spdlog::debug("test with audience({})", audience.value());
    validator_b = validator_b.ExpectAudience(audience.value());
  }
  auto validator_r = validator_b.Build();
  this->check(validator_r);
  auto validator = std::move(validator_r.value());

  auto jwt = this->load();
  auto payload_r = jwt->VerifyMacAndDecode(token, validator);
  this->check(payload_r);
  auto payload = std::move(payload_r.value());

  auto subject_r = payload.GetSubject();
  this->check(subject_r);
  auto subject = std::move(subject_r.value());
  spdlog::debug("get subject({})", subject);
  return subject;
}

std::unique_ptr<crypto::tink::JwtMac> loquat::Jwt::load() {
  auto keyset = this->Keyset::load(crypto::tink::JwtHs512Template());
  auto jwt_r = keyset->GetPrimitive<crypto::tink::JwtMac>();
  this->check(jwt_r);
  auto jwt = std::move(jwt_r.value());
  return jwt;
}

std::string loquat::HMac::sign(const std::string& plain) {
  auto mac = this->load();
  auto code_r = mac->ComputeMac(plain);
  this->check(code_r);
  auto code = std::move(code_r.value());
  return code;
}

void loquat::HMac::verify(const std::string& code, const std::string& plain) {
  auto mac = this->load();
  auto status = mac->VerifyMac(code, plain);
  this->check(status);
}

std::unique_ptr<crypto::tink::Mac> loquat::HMac::load() {
  auto keyset = this->Keyset::load(crypto::tink::MacKeyTemplates::HmacSha512());
  auto mac_r = keyset->GetPrimitive<crypto::tink::Mac>();
  this->check(mac_r);
  auto mac = std::move(mac_r.value());
  return mac;
}

std::string loquat::Aes::encrypt(const std::string& plain) {
  auto aes = this->load();
  auto code_r = aes->Encrypt(plain, "");
  this->check(code_r);
  auto code = std::move(code_r.value());
  return code;
}

std::string loquat::Aes::decrypt(const std::string& code) {
  auto aes = this->load();
  auto plain_r = aes->Decrypt(code, "");
  this->check(plain_r);
  auto plain = std::move(plain_r.value());
  return plain;
}

std::unique_ptr<crypto::tink::Aead> loquat::Aes::load() {
  auto keyset = this->Keyset::load(crypto::tink::AeadKeyTemplates::Aes256Gcm());
  auto aes_r = keyset->GetPrimitive<crypto::tink::Aead>();
  this->check(aes_r);
  auto aes = std::move(aes_r.value());
  return aes;
}

std::unique_ptr<crypto::tink::KeysetHandle> loquat::Keyset::load(
    const google::crypto::tink::KeyTemplate& tpl) {
  const std::lock_guard<std::mutex> lock(this->_locker);

  const auto file = this->keyset();
  if (std::filesystem::exists(file)) {
    spdlog::debug("load keyset from {}", file.string());

    if (std::filesystem::status(file).permissions() !=
        std::filesystem::perms::owner_read) {
      throw std::invalid_argument("key file too open");
    }

    std::unique_ptr<std::ifstream> in =
        std::make_unique<std::ifstream>(file, std::ios_base::binary);
    auto reader_r = crypto::tink::BinaryKeysetReader::New(std::move(in));
    this->check(reader_r);
    auto reader = std::move(reader_r.value());
    auto keyset_handle_r =
        crypto::tink::CleartextKeysetHandle::Read(std::move(reader));
    this->check(keyset_handle_r);
    auto keyset_handle = std::move(keyset_handle_r.value());
    return keyset_handle;

  } else {
    spdlog::warn("not exists, try to create {}", file.string());

    auto keyset_handle_r = crypto::tink::KeysetHandle::GenerateNew(tpl);
    this->check(keyset_handle_r);
    auto keyset_handler = std::move(keyset_handle_r.value());
    {
      std::unique_ptr<std::ofstream> out = std::make_unique<std::ofstream>();
      out->open(file, std::ios_base::binary);
      auto writer_r = crypto::tink::BinaryKeysetWriter::New(std::move(out));
      this->check(writer_r);
      auto writer = std::move(writer_r.value());
      const auto status = crypto::tink::CleartextKeysetHandle::Write(
          writer.get(), *keyset_handler.get());
      this->check(status);
    }
    std::filesystem::permissions(file, std::filesystem::perms::owner_read);
    return keyset_handler;
  }
}

std::string loquat::auth(const std::string& token) {
  loquat::Jwt jwt(loquat::PROJECT_NAME);
  const auto subject = jwt.verify(token);
  return subject;
}
