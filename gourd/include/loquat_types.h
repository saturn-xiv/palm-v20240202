/**
 * Autogenerated by Thrift Compiler (0.19.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#ifndef loquat_TYPES_H
#define loquat_TYPES_H

#include <iosfwd>

#include <thrift/Thrift.h>
#include <thrift/TApplicationException.h>
#include <thrift/TBase.h>
#include <thrift/protocol/TProtocol.h>
#include <thrift/transport/TTransport.h>

#include <functional>
#include <memory>


namespace loquat { namespace v1 {

class JwtVerfifyResponse;

typedef struct _JwtVerfifyResponse__isset {
  _JwtVerfifyResponse__isset() : subject(false), payload(false) {}
  bool subject :1;
  bool payload :1;
} _JwtVerfifyResponse__isset;

class JwtVerfifyResponse : public virtual ::apache::thrift::TBase {
 public:

  JwtVerfifyResponse(const JwtVerfifyResponse&);
  JwtVerfifyResponse& operator=(const JwtVerfifyResponse&);
  JwtVerfifyResponse() noexcept
                     : subject(),
                       payload() {
  }

  virtual ~JwtVerfifyResponse() noexcept;
  std::string subject;
  std::string payload;

  _JwtVerfifyResponse__isset __isset;

  void __set_subject(const std::string& val);

  void __set_payload(const std::string& val);

  bool operator == (const JwtVerfifyResponse & rhs) const
  {
    if (!(subject == rhs.subject))
      return false;
    if (!(payload == rhs.payload))
      return false;
    return true;
  }
  bool operator != (const JwtVerfifyResponse &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const JwtVerfifyResponse & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot) override;
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const override;

  virtual void printTo(std::ostream& out) const;
};

void swap(JwtVerfifyResponse &a, JwtVerfifyResponse &b);

std::ostream& operator<<(std::ostream& out, const JwtVerfifyResponse& obj);

}} // namespace

#endif