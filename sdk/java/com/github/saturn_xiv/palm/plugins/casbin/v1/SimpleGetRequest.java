// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: casbin.proto

// Protobuf Java Version: 3.25.0
package com.github.saturn_xiv.palm.plugins.casbin.v1;

/**
 * Protobuf type {@code palm.lily.v1.SimpleGetRequest}
 */
public final class SimpleGetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:palm.lily.v1.SimpleGetRequest)
    SimpleGetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SimpleGetRequest.newBuilder() to construct.
  private SimpleGetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SimpleGetRequest() {
    pType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SimpleGetRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.saturn_xiv.palm.plugins.casbin.v1.CasbinProto.internal_static_palm_lily_v1_SimpleGetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.saturn_xiv.palm.plugins.casbin.v1.CasbinProto.internal_static_palm_lily_v1_SimpleGetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest.class, com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest.Builder.class);
  }

  public static final int ENFORCERHANDLER_FIELD_NUMBER = 1;
  private int enforcerHandler_ = 0;
  /**
   * <code>int32 enforcerHandler = 1;</code>
   * @return The enforcerHandler.
   */
  @java.lang.Override
  public int getEnforcerHandler() {
    return enforcerHandler_;
  }

  public static final int PTYPE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pType_ = "";
  /**
   * <code>string pType = 2;</code>
   * @return The pType.
   */
  @java.lang.Override
  public java.lang.String getPType() {
    java.lang.Object ref = pType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pType_ = s;
      return s;
    }
  }
  /**
   * <code>string pType = 2;</code>
   * @return The bytes for pType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPTypeBytes() {
    java.lang.Object ref = pType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (enforcerHandler_ != 0) {
      output.writeInt32(1, enforcerHandler_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, pType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enforcerHandler_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, enforcerHandler_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, pType_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest)) {
      return super.equals(obj);
    }
    com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest other = (com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest) obj;

    if (getEnforcerHandler()
        != other.getEnforcerHandler()) return false;
    if (!getPType()
        .equals(other.getPType())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ENFORCERHANDLER_FIELD_NUMBER;
    hash = (53 * hash) + getEnforcerHandler();
    hash = (37 * hash) + PTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getPType().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code palm.lily.v1.SimpleGetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:palm.lily.v1.SimpleGetRequest)
      com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.saturn_xiv.palm.plugins.casbin.v1.CasbinProto.internal_static_palm_lily_v1_SimpleGetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.saturn_xiv.palm.plugins.casbin.v1.CasbinProto.internal_static_palm_lily_v1_SimpleGetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest.class, com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest.Builder.class);
    }

    // Construct using com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enforcerHandler_ = 0;
      pType_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.saturn_xiv.palm.plugins.casbin.v1.CasbinProto.internal_static_palm_lily_v1_SimpleGetRequest_descriptor;
    }

    @java.lang.Override
    public com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest getDefaultInstanceForType() {
      return com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest build() {
      com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest buildPartial() {
      com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest result = new com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enforcerHandler_ = enforcerHandler_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pType_ = pType_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest) {
        return mergeFrom((com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest other) {
      if (other == com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest.getDefaultInstance()) return this;
      if (other.getEnforcerHandler() != 0) {
        setEnforcerHandler(other.getEnforcerHandler());
      }
      if (!other.getPType().isEmpty()) {
        pType_ = other.pType_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              enforcerHandler_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              pType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int enforcerHandler_ ;
    /**
     * <code>int32 enforcerHandler = 1;</code>
     * @return The enforcerHandler.
     */
    @java.lang.Override
    public int getEnforcerHandler() {
      return enforcerHandler_;
    }
    /**
     * <code>int32 enforcerHandler = 1;</code>
     * @param value The enforcerHandler to set.
     * @return This builder for chaining.
     */
    public Builder setEnforcerHandler(int value) {

      enforcerHandler_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 enforcerHandler = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnforcerHandler() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enforcerHandler_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pType_ = "";
    /**
     * <code>string pType = 2;</code>
     * @return The pType.
     */
    public java.lang.String getPType() {
      java.lang.Object ref = pType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pType = 2;</code>
     * @return The bytes for pType.
     */
    public com.google.protobuf.ByteString
        getPTypeBytes() {
      java.lang.Object ref = pType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pType = 2;</code>
     * @param value The pType to set.
     * @return This builder for chaining.
     */
    public Builder setPType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string pType = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPType() {
      pType_ = getDefaultInstance().getPType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string pType = 2;</code>
     * @param value The bytes for pType to set.
     * @return This builder for chaining.
     */
    public Builder setPTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:palm.lily.v1.SimpleGetRequest)
  }

  // @@protoc_insertion_point(class_scope:palm.lily.v1.SimpleGetRequest)
  private static final com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest();
  }

  public static com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SimpleGetRequest>
      PARSER = new com.google.protobuf.AbstractParser<SimpleGetRequest>() {
    @java.lang.Override
    public SimpleGetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<SimpleGetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SimpleGetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.saturn_xiv.palm.plugins.casbin.v1.SimpleGetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

