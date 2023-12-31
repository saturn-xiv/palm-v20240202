// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: casbin.proto

// Protobuf Java Version: 3.25.0
package com.github.saturn_xiv.palm.plugins.casbin.v1;

/**
 * Protobuf type {@code palm.lily.v1.PermissionRequest}
 */
public final class PermissionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:palm.lily.v1.PermissionRequest)
    PermissionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PermissionRequest.newBuilder() to construct.
  private PermissionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PermissionRequest() {
    user_ = "";
    permissions_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    domain_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PermissionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.saturn_xiv.palm.plugins.casbin.v1.CasbinProto.internal_static_palm_lily_v1_PermissionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.saturn_xiv.palm.plugins.casbin.v1.CasbinProto.internal_static_palm_lily_v1_PermissionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest.class, com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest.Builder.class);
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

  public static final int USER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object user_ = "";
  /**
   * <code>string user = 2;</code>
   * @return The user.
   */
  @java.lang.Override
  public java.lang.String getUser() {
    java.lang.Object ref = user_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      user_ = s;
      return s;
    }
  }
  /**
   * <code>string user = 2;</code>
   * @return The bytes for user.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserBytes() {
    java.lang.Object ref = user_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      user_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PERMISSIONS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList permissions_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string permissions = 3;</code>
   * @return A list containing the permissions.
   */
  public com.google.protobuf.ProtocolStringList
      getPermissionsList() {
    return permissions_;
  }
  /**
   * <code>repeated string permissions = 3;</code>
   * @return The count of permissions.
   */
  public int getPermissionsCount() {
    return permissions_.size();
  }
  /**
   * <code>repeated string permissions = 3;</code>
   * @param index The index of the element to return.
   * @return The permissions at the given index.
   */
  public java.lang.String getPermissions(int index) {
    return permissions_.get(index);
  }
  /**
   * <code>repeated string permissions = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the permissions at the given index.
   */
  public com.google.protobuf.ByteString
      getPermissionsBytes(int index) {
    return permissions_.getByteString(index);
  }

  public static final int DOMAIN_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList domain_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string domain = 4;</code>
   * @return A list containing the domain.
   */
  public com.google.protobuf.ProtocolStringList
      getDomainList() {
    return domain_;
  }
  /**
   * <code>repeated string domain = 4;</code>
   * @return The count of domain.
   */
  public int getDomainCount() {
    return domain_.size();
  }
  /**
   * <code>repeated string domain = 4;</code>
   * @param index The index of the element to return.
   * @return The domain at the given index.
   */
  public java.lang.String getDomain(int index) {
    return domain_.get(index);
  }
  /**
   * <code>repeated string domain = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the domain at the given index.
   */
  public com.google.protobuf.ByteString
      getDomainBytes(int index) {
    return domain_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(user_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, user_);
    }
    for (int i = 0; i < permissions_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, permissions_.getRaw(i));
    }
    for (int i = 0; i < domain_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, domain_.getRaw(i));
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(user_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, user_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < permissions_.size(); i++) {
        dataSize += computeStringSizeNoTag(permissions_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPermissionsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < domain_.size(); i++) {
        dataSize += computeStringSizeNoTag(domain_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDomainList().size();
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
    if (!(obj instanceof com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest)) {
      return super.equals(obj);
    }
    com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest other = (com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest) obj;

    if (getEnforcerHandler()
        != other.getEnforcerHandler()) return false;
    if (!getUser()
        .equals(other.getUser())) return false;
    if (!getPermissionsList()
        .equals(other.getPermissionsList())) return false;
    if (!getDomainList()
        .equals(other.getDomainList())) return false;
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
    hash = (37 * hash) + USER_FIELD_NUMBER;
    hash = (53 * hash) + getUser().hashCode();
    if (getPermissionsCount() > 0) {
      hash = (37 * hash) + PERMISSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getPermissionsList().hashCode();
    }
    if (getDomainCount() > 0) {
      hash = (37 * hash) + DOMAIN_FIELD_NUMBER;
      hash = (53 * hash) + getDomainList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest parseFrom(
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
  public static Builder newBuilder(com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest prototype) {
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
   * Protobuf type {@code palm.lily.v1.PermissionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:palm.lily.v1.PermissionRequest)
      com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.saturn_xiv.palm.plugins.casbin.v1.CasbinProto.internal_static_palm_lily_v1_PermissionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.saturn_xiv.palm.plugins.casbin.v1.CasbinProto.internal_static_palm_lily_v1_PermissionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest.class, com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest.Builder.class);
    }

    // Construct using com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest.newBuilder()
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
      user_ = "";
      permissions_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      domain_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.saturn_xiv.palm.plugins.casbin.v1.CasbinProto.internal_static_palm_lily_v1_PermissionRequest_descriptor;
    }

    @java.lang.Override
    public com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest getDefaultInstanceForType() {
      return com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest build() {
      com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest buildPartial() {
      com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest result = new com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enforcerHandler_ = enforcerHandler_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.user_ = user_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        permissions_.makeImmutable();
        result.permissions_ = permissions_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        domain_.makeImmutable();
        result.domain_ = domain_;
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
      if (other instanceof com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest) {
        return mergeFrom((com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest other) {
      if (other == com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest.getDefaultInstance()) return this;
      if (other.getEnforcerHandler() != 0) {
        setEnforcerHandler(other.getEnforcerHandler());
      }
      if (!other.getUser().isEmpty()) {
        user_ = other.user_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.permissions_.isEmpty()) {
        if (permissions_.isEmpty()) {
          permissions_ = other.permissions_;
          bitField0_ |= 0x00000004;
        } else {
          ensurePermissionsIsMutable();
          permissions_.addAll(other.permissions_);
        }
        onChanged();
      }
      if (!other.domain_.isEmpty()) {
        if (domain_.isEmpty()) {
          domain_ = other.domain_;
          bitField0_ |= 0x00000008;
        } else {
          ensureDomainIsMutable();
          domain_.addAll(other.domain_);
        }
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
              user_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensurePermissionsIsMutable();
              permissions_.add(s);
              break;
            } // case 26
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureDomainIsMutable();
              domain_.add(s);
              break;
            } // case 34
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

    private java.lang.Object user_ = "";
    /**
     * <code>string user = 2;</code>
     * @return The user.
     */
    public java.lang.String getUser() {
      java.lang.Object ref = user_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        user_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user = 2;</code>
     * @return The bytes for user.
     */
    public com.google.protobuf.ByteString
        getUserBytes() {
      java.lang.Object ref = user_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        user_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user = 2;</code>
     * @param value The user to set.
     * @return This builder for chaining.
     */
    public Builder setUser(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      user_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string user = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUser() {
      user_ = getDefaultInstance().getUser();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string user = 2;</code>
     * @param value The bytes for user to set.
     * @return This builder for chaining.
     */
    public Builder setUserBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      user_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList permissions_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensurePermissionsIsMutable() {
      if (!permissions_.isModifiable()) {
        permissions_ = new com.google.protobuf.LazyStringArrayList(permissions_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <code>repeated string permissions = 3;</code>
     * @return A list containing the permissions.
     */
    public com.google.protobuf.ProtocolStringList
        getPermissionsList() {
      permissions_.makeImmutable();
      return permissions_;
    }
    /**
     * <code>repeated string permissions = 3;</code>
     * @return The count of permissions.
     */
    public int getPermissionsCount() {
      return permissions_.size();
    }
    /**
     * <code>repeated string permissions = 3;</code>
     * @param index The index of the element to return.
     * @return The permissions at the given index.
     */
    public java.lang.String getPermissions(int index) {
      return permissions_.get(index);
    }
    /**
     * <code>repeated string permissions = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the permissions at the given index.
     */
    public com.google.protobuf.ByteString
        getPermissionsBytes(int index) {
      return permissions_.getByteString(index);
    }
    /**
     * <code>repeated string permissions = 3;</code>
     * @param index The index to set the value at.
     * @param value The permissions to set.
     * @return This builder for chaining.
     */
    public Builder setPermissions(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensurePermissionsIsMutable();
      permissions_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string permissions = 3;</code>
     * @param value The permissions to add.
     * @return This builder for chaining.
     */
    public Builder addPermissions(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensurePermissionsIsMutable();
      permissions_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string permissions = 3;</code>
     * @param values The permissions to add.
     * @return This builder for chaining.
     */
    public Builder addAllPermissions(
        java.lang.Iterable<java.lang.String> values) {
      ensurePermissionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, permissions_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string permissions = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPermissions() {
      permissions_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string permissions = 3;</code>
     * @param value The bytes of the permissions to add.
     * @return This builder for chaining.
     */
    public Builder addPermissionsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensurePermissionsIsMutable();
      permissions_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList domain_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureDomainIsMutable() {
      if (!domain_.isModifiable()) {
        domain_ = new com.google.protobuf.LazyStringArrayList(domain_);
      }
      bitField0_ |= 0x00000008;
    }
    /**
     * <code>repeated string domain = 4;</code>
     * @return A list containing the domain.
     */
    public com.google.protobuf.ProtocolStringList
        getDomainList() {
      domain_.makeImmutable();
      return domain_;
    }
    /**
     * <code>repeated string domain = 4;</code>
     * @return The count of domain.
     */
    public int getDomainCount() {
      return domain_.size();
    }
    /**
     * <code>repeated string domain = 4;</code>
     * @param index The index of the element to return.
     * @return The domain at the given index.
     */
    public java.lang.String getDomain(int index) {
      return domain_.get(index);
    }
    /**
     * <code>repeated string domain = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the domain at the given index.
     */
    public com.google.protobuf.ByteString
        getDomainBytes(int index) {
      return domain_.getByteString(index);
    }
    /**
     * <code>repeated string domain = 4;</code>
     * @param index The index to set the value at.
     * @param value The domain to set.
     * @return This builder for chaining.
     */
    public Builder setDomain(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDomainIsMutable();
      domain_.set(index, value);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string domain = 4;</code>
     * @param value The domain to add.
     * @return This builder for chaining.
     */
    public Builder addDomain(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDomainIsMutable();
      domain_.add(value);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string domain = 4;</code>
     * @param values The domain to add.
     * @return This builder for chaining.
     */
    public Builder addAllDomain(
        java.lang.Iterable<java.lang.String> values) {
      ensureDomainIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, domain_);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string domain = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDomain() {
      domain_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000008);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string domain = 4;</code>
     * @param value The bytes of the domain to add.
     * @return This builder for chaining.
     */
    public Builder addDomainBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureDomainIsMutable();
      domain_.add(value);
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:palm.lily.v1.PermissionRequest)
  }

  // @@protoc_insertion_point(class_scope:palm.lily.v1.PermissionRequest)
  private static final com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest();
  }

  public static com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PermissionRequest>
      PARSER = new com.google.protobuf.AbstractParser<PermissionRequest>() {
    @java.lang.Override
    public PermissionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<PermissionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PermissionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.saturn_xiv.palm.plugins.casbin.v1.PermissionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

