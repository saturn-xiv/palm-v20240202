#pragma once

#include <bits/stdc++.h>
#include <sys/utsname.h>
#include <unistd.h>
#include <algorithm>
#include <chrono>
#include <climits>
#include <cstdint>
#include <cstdlib>
#include <ctime>
#include <deque>
#include <exception>
#include <filesystem>
#include <fstream>
#include <functional>
#include <iomanip>
#include <iostream>
#include <map>
#include <memory>
#include <mutex>
#include <optional>
#include <random>
#include <ranges>
#include <set>
#include <sstream>
#include <stdexcept>
#include <string>
#include <typeinfo>
#include <unordered_map>
#include <utility>
#include <variant>
#include <vector>

#define TOML_EXCEPTIONS 1
#include <toml++/toml.h>

// deprecated: Since OpenSSL 3.0
#pragma GCC diagnostic push
#pragma GCC diagnostic ignored "-Wdeprecated-declarations"
#include <tink/internal/ssl_unique_ptr.h>
#pragma GCC diagnostic pop

#include <spdlog/spdlog.h>
#include <tink/aead/aead_key_templates.h>
#include <tink/jwt/jwt_mac.h>
#include <tink/keyset_handle.h>
#include <tink/mac.h>
#include <tink/mac/mac_key_templates.h>

namespace loquat {

class Config final {
 public:
  Config(const std::filesystem::path& file);
  inline uint32_t port() const { return this->_port; }
  inline std::vector<std::string> clients() const {
    const std::vector<std::string> items(this->_clients.begin(),
                                         this->_clients.end());
    return items;
  }

 private:
  uint16_t _port;
  std::optional<std::string> _jwt_secret_key;
  std::vector<std::string> _clients;
};

class Keyset {
 public:
  Keyset(const std::string& name) : _name(name) {}

 protected:
  std::unique_ptr<crypto::tink::KeysetHandle> load(
      const google::crypto::tink::KeyTemplate& tpl);
  inline std::filesystem::path keyset() const {
    std::filesystem::path it(this->_name);
    it.replace_extension("bin");
    return it;
  }

  template <class T>
  void check(const crypto::tink::util::StatusOr<T>& result) const {
    this->check(result.status());
  }
  inline void check(const crypto::tink::util::Status& status) const {
    const std::string_view it = status.message();
    std::string msg(it.begin(), it.end());
    if (!status.ok()) {
      spdlog::error("{}", msg);
      throw std::runtime_error("");
    }
  }

 private:
  std::string _name;
  std::mutex _locker;
};

// https://github.com/google/tink/blob/master/docs/JWT-HOWTO.md
class Jwt final : public Keyset {
 public:
  Jwt() : Keyset("jwt") {}
  std::tuple<std::string, std::string, std::string> verify(
      const std::string& token, const std::string& issuer,
      const std::string& audience);
  std::string sign(const std::string& issuer, const std::string& subject,
                   const std::string& audience, const std::chrono::seconds& ttl,
                   const std::string& payload = "");

 private:
  std::unique_ptr<crypto::tink::JwtMac> load();

  inline static const std::string PAYLOAD_CLAIM_NAME = "pad";
};

class HMac final : public Keyset {
 public:
  HMac() : Keyset("hmac") {}
  std::string sign(const std::string& plain);
  void verify(const std::string& code, const std::string& plain);

 private:
  std::unique_ptr<crypto::tink::Mac> load();
};

class Aes final : public Keyset {
 public:
  Aes() : Keyset("aes") {}
  std::string encrypt(const std::string& plain, const std::string& salt);
  std::string decrypt(const std::string& code, const std::string& salt);

 private:
  std::unique_ptr<crypto::tink::Aead> load();
};

std::string random(const size_t len);
std::string uuid();
}  // namespace loquat
