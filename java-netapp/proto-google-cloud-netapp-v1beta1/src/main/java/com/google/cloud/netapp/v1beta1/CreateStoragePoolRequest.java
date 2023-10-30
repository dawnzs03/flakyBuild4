/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/netapp/v1beta1/storage_pool.proto

package com.google.cloud.netapp.v1beta1;

/**
 *
 *
 * <pre>
 * CreateStoragePoolRequest
 * </pre>
 *
 * Protobuf type {@code google.cloud.netapp.v1beta1.CreateStoragePoolRequest}
 */
public final class CreateStoragePoolRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.netapp.v1beta1.CreateStoragePoolRequest)
    CreateStoragePoolRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateStoragePoolRequest.newBuilder() to construct.
  private CreateStoragePoolRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateStoragePoolRequest() {
    parent_ = "";
    storagePoolId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateStoragePoolRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.netapp.v1beta1.StoragePoolProto
        .internal_static_google_cloud_netapp_v1beta1_CreateStoragePoolRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.netapp.v1beta1.StoragePoolProto
        .internal_static_google_cloud_netapp_v1beta1_CreateStoragePoolRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest.class,
            com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. Value for parent.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Value for parent.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STORAGE_POOL_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object storagePoolId_ = "";
  /**
   *
   *
   * <pre>
   * Required. Id of the requesting storage pool
   * If auto-generating Id server-side, remove this field and
   * id from the method_signature of Create RPC
   * </pre>
   *
   * <code>string storage_pool_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The storagePoolId.
   */
  @java.lang.Override
  public java.lang.String getStoragePoolId() {
    java.lang.Object ref = storagePoolId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      storagePoolId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Id of the requesting storage pool
   * If auto-generating Id server-side, remove this field and
   * id from the method_signature of Create RPC
   * </pre>
   *
   * <code>string storage_pool_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for storagePoolId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getStoragePoolIdBytes() {
    java.lang.Object ref = storagePoolId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      storagePoolId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STORAGE_POOL_FIELD_NUMBER = 3;
  private com.google.cloud.netapp.v1beta1.StoragePool storagePool_;
  /**
   *
   *
   * <pre>
   * Required. The required parameters to create a new storage pool.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1beta1.StoragePool storage_pool = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the storagePool field is set.
   */
  @java.lang.Override
  public boolean hasStoragePool() {
    return storagePool_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The required parameters to create a new storage pool.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1beta1.StoragePool storage_pool = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The storagePool.
   */
  @java.lang.Override
  public com.google.cloud.netapp.v1beta1.StoragePool getStoragePool() {
    return storagePool_ == null
        ? com.google.cloud.netapp.v1beta1.StoragePool.getDefaultInstance()
        : storagePool_;
  }
  /**
   *
   *
   * <pre>
   * Required. The required parameters to create a new storage pool.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1beta1.StoragePool storage_pool = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.netapp.v1beta1.StoragePoolOrBuilder getStoragePoolOrBuilder() {
    return storagePool_ == null
        ? com.google.cloud.netapp.v1beta1.StoragePool.getDefaultInstance()
        : storagePool_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storagePoolId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, storagePoolId_);
    }
    if (storagePool_ != null) {
      output.writeMessage(3, getStoragePool());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(storagePoolId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, storagePoolId_);
    }
    if (storagePool_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getStoragePool());
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
    if (!(obj instanceof com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest other =
        (com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getStoragePoolId().equals(other.getStoragePoolId())) return false;
    if (hasStoragePool() != other.hasStoragePool()) return false;
    if (hasStoragePool()) {
      if (!getStoragePool().equals(other.getStoragePool())) return false;
    }
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + STORAGE_POOL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStoragePoolId().hashCode();
    if (hasStoragePool()) {
      hash = (37 * hash) + STORAGE_POOL_FIELD_NUMBER;
      hash = (53 * hash) + getStoragePool().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * CreateStoragePoolRequest
   * </pre>
   *
   * Protobuf type {@code google.cloud.netapp.v1beta1.CreateStoragePoolRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.netapp.v1beta1.CreateStoragePoolRequest)
      com.google.cloud.netapp.v1beta1.CreateStoragePoolRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.netapp.v1beta1.StoragePoolProto
          .internal_static_google_cloud_netapp_v1beta1_CreateStoragePoolRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.netapp.v1beta1.StoragePoolProto
          .internal_static_google_cloud_netapp_v1beta1_CreateStoragePoolRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest.class,
              com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest.Builder.class);
    }

    // Construct using com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      storagePoolId_ = "";
      storagePool_ = null;
      if (storagePoolBuilder_ != null) {
        storagePoolBuilder_.dispose();
        storagePoolBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.netapp.v1beta1.StoragePoolProto
          .internal_static_google_cloud_netapp_v1beta1_CreateStoragePoolRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest getDefaultInstanceForType() {
      return com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest build() {
      com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest buildPartial() {
      com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest result =
          new com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.storagePoolId_ = storagePoolId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.storagePool_ =
            storagePoolBuilder_ == null ? storagePool_ : storagePoolBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest) {
        return mergeFrom((com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest other) {
      if (other == com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getStoragePoolId().isEmpty()) {
        storagePoolId_ = other.storagePoolId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasStoragePool()) {
        mergeStoragePool(other.getStoragePool());
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
            case 10:
              {
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                storagePoolId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getStoragePoolFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            default:
              {
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Value for parent.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Value for parent.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Value for parent.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Value for parent.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Value for parent.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object storagePoolId_ = "";
    /**
     *
     *
     * <pre>
     * Required. Id of the requesting storage pool
     * If auto-generating Id server-side, remove this field and
     * id from the method_signature of Create RPC
     * </pre>
     *
     * <code>string storage_pool_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The storagePoolId.
     */
    public java.lang.String getStoragePoolId() {
      java.lang.Object ref = storagePoolId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        storagePoolId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Id of the requesting storage pool
     * If auto-generating Id server-side, remove this field and
     * id from the method_signature of Create RPC
     * </pre>
     *
     * <code>string storage_pool_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for storagePoolId.
     */
    public com.google.protobuf.ByteString getStoragePoolIdBytes() {
      java.lang.Object ref = storagePoolId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        storagePoolId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Id of the requesting storage pool
     * If auto-generating Id server-side, remove this field and
     * id from the method_signature of Create RPC
     * </pre>
     *
     * <code>string storage_pool_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The storagePoolId to set.
     * @return This builder for chaining.
     */
    public Builder setStoragePoolId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      storagePoolId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Id of the requesting storage pool
     * If auto-generating Id server-side, remove this field and
     * id from the method_signature of Create RPC
     * </pre>
     *
     * <code>string storage_pool_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStoragePoolId() {
      storagePoolId_ = getDefaultInstance().getStoragePoolId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Id of the requesting storage pool
     * If auto-generating Id server-side, remove this field and
     * id from the method_signature of Create RPC
     * </pre>
     *
     * <code>string storage_pool_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for storagePoolId to set.
     * @return This builder for chaining.
     */
    public Builder setStoragePoolIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      storagePoolId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.netapp.v1beta1.StoragePool storagePool_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.netapp.v1beta1.StoragePool,
            com.google.cloud.netapp.v1beta1.StoragePool.Builder,
            com.google.cloud.netapp.v1beta1.StoragePoolOrBuilder>
        storagePoolBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The required parameters to create a new storage pool.
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1beta1.StoragePool storage_pool = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the storagePool field is set.
     */
    public boolean hasStoragePool() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The required parameters to create a new storage pool.
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1beta1.StoragePool storage_pool = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The storagePool.
     */
    public com.google.cloud.netapp.v1beta1.StoragePool getStoragePool() {
      if (storagePoolBuilder_ == null) {
        return storagePool_ == null
            ? com.google.cloud.netapp.v1beta1.StoragePool.getDefaultInstance()
            : storagePool_;
      } else {
        return storagePoolBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The required parameters to create a new storage pool.
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1beta1.StoragePool storage_pool = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setStoragePool(com.google.cloud.netapp.v1beta1.StoragePool value) {
      if (storagePoolBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        storagePool_ = value;
      } else {
        storagePoolBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The required parameters to create a new storage pool.
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1beta1.StoragePool storage_pool = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setStoragePool(
        com.google.cloud.netapp.v1beta1.StoragePool.Builder builderForValue) {
      if (storagePoolBuilder_ == null) {
        storagePool_ = builderForValue.build();
      } else {
        storagePoolBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The required parameters to create a new storage pool.
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1beta1.StoragePool storage_pool = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeStoragePool(com.google.cloud.netapp.v1beta1.StoragePool value) {
      if (storagePoolBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && storagePool_ != null
            && storagePool_ != com.google.cloud.netapp.v1beta1.StoragePool.getDefaultInstance()) {
          getStoragePoolBuilder().mergeFrom(value);
        } else {
          storagePool_ = value;
        }
      } else {
        storagePoolBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The required parameters to create a new storage pool.
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1beta1.StoragePool storage_pool = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearStoragePool() {
      bitField0_ = (bitField0_ & ~0x00000004);
      storagePool_ = null;
      if (storagePoolBuilder_ != null) {
        storagePoolBuilder_.dispose();
        storagePoolBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The required parameters to create a new storage pool.
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1beta1.StoragePool storage_pool = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.netapp.v1beta1.StoragePool.Builder getStoragePoolBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getStoragePoolFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The required parameters to create a new storage pool.
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1beta1.StoragePool storage_pool = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.netapp.v1beta1.StoragePoolOrBuilder getStoragePoolOrBuilder() {
      if (storagePoolBuilder_ != null) {
        return storagePoolBuilder_.getMessageOrBuilder();
      } else {
        return storagePool_ == null
            ? com.google.cloud.netapp.v1beta1.StoragePool.getDefaultInstance()
            : storagePool_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The required parameters to create a new storage pool.
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1beta1.StoragePool storage_pool = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.netapp.v1beta1.StoragePool,
            com.google.cloud.netapp.v1beta1.StoragePool.Builder,
            com.google.cloud.netapp.v1beta1.StoragePoolOrBuilder>
        getStoragePoolFieldBuilder() {
      if (storagePoolBuilder_ == null) {
        storagePoolBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.netapp.v1beta1.StoragePool,
                com.google.cloud.netapp.v1beta1.StoragePool.Builder,
                com.google.cloud.netapp.v1beta1.StoragePoolOrBuilder>(
                getStoragePool(), getParentForChildren(), isClean());
        storagePool_ = null;
      }
      return storagePoolBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.netapp.v1beta1.CreateStoragePoolRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.netapp.v1beta1.CreateStoragePoolRequest)
  private static final com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest();
  }

  public static com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateStoragePoolRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateStoragePoolRequest>() {
        @java.lang.Override
        public CreateStoragePoolRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateStoragePoolRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateStoragePoolRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.netapp.v1beta1.CreateStoragePoolRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
