// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: musa.proto

package com.github.saturn_xiv.palm.plugins.musa.v1;

/**
 * Protobuf type {@code palm.musa.v1.WechatPayTransferGetBillReceiptRequest}
 */
public final class WechatPayTransferGetBillReceiptRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:palm.musa.v1.WechatPayTransferGetBillReceiptRequest)
    WechatPayTransferGetBillReceiptRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WechatPayTransferGetBillReceiptRequest.newBuilder() to construct.
  private WechatPayTransferGetBillReceiptRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WechatPayTransferGetBillReceiptRequest() {
    outBatchNo_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WechatPayTransferGetBillReceiptRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.saturn_xiv.palm.plugins.musa.v1.Musa.internal_static_palm_musa_v1_WechatPayTransferGetBillReceiptRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.saturn_xiv.palm.plugins.musa.v1.Musa.internal_static_palm_musa_v1_WechatPayTransferGetBillReceiptRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest.class, com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest.Builder.class);
  }

  public static final int OUT_BATCH_NO_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object outBatchNo_ = "";
  /**
   * <code>string out_batch_no = 1;</code>
   * @return The outBatchNo.
   */
  @java.lang.Override
  public java.lang.String getOutBatchNo() {
    java.lang.Object ref = outBatchNo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      outBatchNo_ = s;
      return s;
    }
  }
  /**
   * <code>string out_batch_no = 1;</code>
   * @return The bytes for outBatchNo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOutBatchNoBytes() {
    java.lang.Object ref = outBatchNo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      outBatchNo_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(outBatchNo_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, outBatchNo_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(outBatchNo_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, outBatchNo_);
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
    if (!(obj instanceof com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest)) {
      return super.equals(obj);
    }
    com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest other = (com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest) obj;

    if (!getOutBatchNo()
        .equals(other.getOutBatchNo())) return false;
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
    hash = (37 * hash) + OUT_BATCH_NO_FIELD_NUMBER;
    hash = (53 * hash) + getOutBatchNo().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest parseFrom(
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
  public static Builder newBuilder(com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest prototype) {
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
   * Protobuf type {@code palm.musa.v1.WechatPayTransferGetBillReceiptRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:palm.musa.v1.WechatPayTransferGetBillReceiptRequest)
      com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.saturn_xiv.palm.plugins.musa.v1.Musa.internal_static_palm_musa_v1_WechatPayTransferGetBillReceiptRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.saturn_xiv.palm.plugins.musa.v1.Musa.internal_static_palm_musa_v1_WechatPayTransferGetBillReceiptRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest.class, com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest.Builder.class);
    }

    // Construct using com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest.newBuilder()
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
      outBatchNo_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.saturn_xiv.palm.plugins.musa.v1.Musa.internal_static_palm_musa_v1_WechatPayTransferGetBillReceiptRequest_descriptor;
    }

    @java.lang.Override
    public com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest getDefaultInstanceForType() {
      return com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest build() {
      com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest buildPartial() {
      com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest result = new com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.outBatchNo_ = outBatchNo_;
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
      if (other instanceof com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest) {
        return mergeFrom((com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest other) {
      if (other == com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest.getDefaultInstance()) return this;
      if (!other.getOutBatchNo().isEmpty()) {
        outBatchNo_ = other.outBatchNo_;
        bitField0_ |= 0x00000001;
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
            case 10: {
              outBatchNo_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private java.lang.Object outBatchNo_ = "";
    /**
     * <code>string out_batch_no = 1;</code>
     * @return The outBatchNo.
     */
    public java.lang.String getOutBatchNo() {
      java.lang.Object ref = outBatchNo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        outBatchNo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string out_batch_no = 1;</code>
     * @return The bytes for outBatchNo.
     */
    public com.google.protobuf.ByteString
        getOutBatchNoBytes() {
      java.lang.Object ref = outBatchNo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        outBatchNo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string out_batch_no = 1;</code>
     * @param value The outBatchNo to set.
     * @return This builder for chaining.
     */
    public Builder setOutBatchNo(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      outBatchNo_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string out_batch_no = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOutBatchNo() {
      outBatchNo_ = getDefaultInstance().getOutBatchNo();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string out_batch_no = 1;</code>
     * @param value The bytes for outBatchNo to set.
     * @return This builder for chaining.
     */
    public Builder setOutBatchNoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      outBatchNo_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:palm.musa.v1.WechatPayTransferGetBillReceiptRequest)
  }

  // @@protoc_insertion_point(class_scope:palm.musa.v1.WechatPayTransferGetBillReceiptRequest)
  private static final com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest();
  }

  public static com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WechatPayTransferGetBillReceiptRequest>
      PARSER = new com.google.protobuf.AbstractParser<WechatPayTransferGetBillReceiptRequest>() {
    @java.lang.Override
    public WechatPayTransferGetBillReceiptRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<WechatPayTransferGetBillReceiptRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WechatPayTransferGetBillReceiptRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.saturn_xiv.palm.plugins.musa.v1.WechatPayTransferGetBillReceiptRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
