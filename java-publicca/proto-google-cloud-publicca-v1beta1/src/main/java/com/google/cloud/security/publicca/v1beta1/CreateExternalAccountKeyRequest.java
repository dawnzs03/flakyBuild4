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
// source: google/cloud/security/publicca/v1beta1/service.proto

package com.google.cloud.security.publicca.v1beta1;

/**
 *
 *
 * <pre>
 * Creates a new [ExternalAccountKey][google.cloud.security.publicca.v1beta1.ExternalAccountKey] in a given project.
 * </pre>
 *
 * Protobuf type {@code google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest}
 */
public final class CreateExternalAccountKeyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest)
    CreateExternalAccountKeyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateExternalAccountKeyRequest.newBuilder() to construct.
  private CreateExternalAccountKeyRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateExternalAccountKeyRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateExternalAccountKeyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.security.publicca.v1beta1.ServiceProto
        .internal_static_google_cloud_security_publicca_v1beta1_CreateExternalAccountKeyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.security.publicca.v1beta1.ServiceProto
        .internal_static_google_cloud_security_publicca_v1beta1_CreateExternalAccountKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest.class,
            com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest.Builder
                .class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent resource where this external_account_key will be created.
   * Format: projects/[project_id]/locations/[location].
   * At present only the "global" location is supported.
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
   * Required. The parent resource where this external_account_key will be created.
   * Format: projects/[project_id]/locations/[location].
   * At present only the "global" location is supported.
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

  public static final int EXTERNAL_ACCOUNT_KEY_FIELD_NUMBER = 2;
  private com.google.cloud.security.publicca.v1beta1.ExternalAccountKey externalAccountKey_;
  /**
   *
   *
   * <pre>
   * Required. The external account key to create. This field only exists to future-proof
   * the API. At present, all fields in ExternalAccountKey are output only and
   * all values are ignored. For the purpose of the
   * CreateExternalAccountKeyRequest, set it to a default/empty value.
   * </pre>
   *
   * <code>
   * .google.cloud.security.publicca.v1beta1.ExternalAccountKey external_account_key = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the externalAccountKey field is set.
   */
  @java.lang.Override
  public boolean hasExternalAccountKey() {
    return externalAccountKey_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The external account key to create. This field only exists to future-proof
   * the API. At present, all fields in ExternalAccountKey are output only and
   * all values are ignored. For the purpose of the
   * CreateExternalAccountKeyRequest, set it to a default/empty value.
   * </pre>
   *
   * <code>
   * .google.cloud.security.publicca.v1beta1.ExternalAccountKey external_account_key = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The externalAccountKey.
   */
  @java.lang.Override
  public com.google.cloud.security.publicca.v1beta1.ExternalAccountKey getExternalAccountKey() {
    return externalAccountKey_ == null
        ? com.google.cloud.security.publicca.v1beta1.ExternalAccountKey.getDefaultInstance()
        : externalAccountKey_;
  }
  /**
   *
   *
   * <pre>
   * Required. The external account key to create. This field only exists to future-proof
   * the API. At present, all fields in ExternalAccountKey are output only and
   * all values are ignored. For the purpose of the
   * CreateExternalAccountKeyRequest, set it to a default/empty value.
   * </pre>
   *
   * <code>
   * .google.cloud.security.publicca.v1beta1.ExternalAccountKey external_account_key = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.security.publicca.v1beta1.ExternalAccountKeyOrBuilder
      getExternalAccountKeyOrBuilder() {
    return externalAccountKey_ == null
        ? com.google.cloud.security.publicca.v1beta1.ExternalAccountKey.getDefaultInstance()
        : externalAccountKey_;
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
    if (externalAccountKey_ != null) {
      output.writeMessage(2, getExternalAccountKey());
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
    if (externalAccountKey_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getExternalAccountKey());
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
    if (!(obj
        instanceof com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest other =
        (com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasExternalAccountKey() != other.hasExternalAccountKey()) return false;
    if (hasExternalAccountKey()) {
      if (!getExternalAccountKey().equals(other.getExternalAccountKey())) return false;
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
    if (hasExternalAccountKey()) {
      hash = (37 * hash) + EXTERNAL_ACCOUNT_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getExternalAccountKey().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest
      parseFrom(
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
      com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest prototype) {
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
   * Creates a new [ExternalAccountKey][google.cloud.security.publicca.v1beta1.ExternalAccountKey] in a given project.
   * </pre>
   *
   * Protobuf type {@code google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest)
      com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.security.publicca.v1beta1.ServiceProto
          .internal_static_google_cloud_security_publicca_v1beta1_CreateExternalAccountKeyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.security.publicca.v1beta1.ServiceProto
          .internal_static_google_cloud_security_publicca_v1beta1_CreateExternalAccountKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest.class,
              com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      externalAccountKey_ = null;
      if (externalAccountKeyBuilder_ != null) {
        externalAccountKeyBuilder_.dispose();
        externalAccountKeyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.security.publicca.v1beta1.ServiceProto
          .internal_static_google_cloud_security_publicca_v1beta1_CreateExternalAccountKeyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest
        getDefaultInstanceForType() {
      return com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest build() {
      com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest
        buildPartial() {
      com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest result =
          new com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.externalAccountKey_ =
            externalAccountKeyBuilder_ == null
                ? externalAccountKey_
                : externalAccountKeyBuilder_.build();
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
      if (other
          instanceof com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest) {
        return mergeFrom(
            (com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest other) {
      if (other
          == com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasExternalAccountKey()) {
        mergeExternalAccountKey(other.getExternalAccountKey());
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
                input.readMessage(
                    getExternalAccountKeyFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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
     * Required. The parent resource where this external_account_key will be created.
     * Format: projects/[project_id]/locations/[location].
     * At present only the "global" location is supported.
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
     * Required. The parent resource where this external_account_key will be created.
     * Format: projects/[project_id]/locations/[location].
     * At present only the "global" location is supported.
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
     * Required. The parent resource where this external_account_key will be created.
     * Format: projects/[project_id]/locations/[location].
     * At present only the "global" location is supported.
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
     * Required. The parent resource where this external_account_key will be created.
     * Format: projects/[project_id]/locations/[location].
     * At present only the "global" location is supported.
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
     * Required. The parent resource where this external_account_key will be created.
     * Format: projects/[project_id]/locations/[location].
     * At present only the "global" location is supported.
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

    private com.google.cloud.security.publicca.v1beta1.ExternalAccountKey externalAccountKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.security.publicca.v1beta1.ExternalAccountKey,
            com.google.cloud.security.publicca.v1beta1.ExternalAccountKey.Builder,
            com.google.cloud.security.publicca.v1beta1.ExternalAccountKeyOrBuilder>
        externalAccountKeyBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The external account key to create. This field only exists to future-proof
     * the API. At present, all fields in ExternalAccountKey are output only and
     * all values are ignored. For the purpose of the
     * CreateExternalAccountKeyRequest, set it to a default/empty value.
     * </pre>
     *
     * <code>
     * .google.cloud.security.publicca.v1beta1.ExternalAccountKey external_account_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the externalAccountKey field is set.
     */
    public boolean hasExternalAccountKey() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The external account key to create. This field only exists to future-proof
     * the API. At present, all fields in ExternalAccountKey are output only and
     * all values are ignored. For the purpose of the
     * CreateExternalAccountKeyRequest, set it to a default/empty value.
     * </pre>
     *
     * <code>
     * .google.cloud.security.publicca.v1beta1.ExternalAccountKey external_account_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The externalAccountKey.
     */
    public com.google.cloud.security.publicca.v1beta1.ExternalAccountKey getExternalAccountKey() {
      if (externalAccountKeyBuilder_ == null) {
        return externalAccountKey_ == null
            ? com.google.cloud.security.publicca.v1beta1.ExternalAccountKey.getDefaultInstance()
            : externalAccountKey_;
      } else {
        return externalAccountKeyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The external account key to create. This field only exists to future-proof
     * the API. At present, all fields in ExternalAccountKey are output only and
     * all values are ignored. For the purpose of the
     * CreateExternalAccountKeyRequest, set it to a default/empty value.
     * </pre>
     *
     * <code>
     * .google.cloud.security.publicca.v1beta1.ExternalAccountKey external_account_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setExternalAccountKey(
        com.google.cloud.security.publicca.v1beta1.ExternalAccountKey value) {
      if (externalAccountKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        externalAccountKey_ = value;
      } else {
        externalAccountKeyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The external account key to create. This field only exists to future-proof
     * the API. At present, all fields in ExternalAccountKey are output only and
     * all values are ignored. For the purpose of the
     * CreateExternalAccountKeyRequest, set it to a default/empty value.
     * </pre>
     *
     * <code>
     * .google.cloud.security.publicca.v1beta1.ExternalAccountKey external_account_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setExternalAccountKey(
        com.google.cloud.security.publicca.v1beta1.ExternalAccountKey.Builder builderForValue) {
      if (externalAccountKeyBuilder_ == null) {
        externalAccountKey_ = builderForValue.build();
      } else {
        externalAccountKeyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The external account key to create. This field only exists to future-proof
     * the API. At present, all fields in ExternalAccountKey are output only and
     * all values are ignored. For the purpose of the
     * CreateExternalAccountKeyRequest, set it to a default/empty value.
     * </pre>
     *
     * <code>
     * .google.cloud.security.publicca.v1beta1.ExternalAccountKey external_account_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeExternalAccountKey(
        com.google.cloud.security.publicca.v1beta1.ExternalAccountKey value) {
      if (externalAccountKeyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && externalAccountKey_ != null
            && externalAccountKey_
                != com.google.cloud.security.publicca.v1beta1.ExternalAccountKey
                    .getDefaultInstance()) {
          getExternalAccountKeyBuilder().mergeFrom(value);
        } else {
          externalAccountKey_ = value;
        }
      } else {
        externalAccountKeyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The external account key to create. This field only exists to future-proof
     * the API. At present, all fields in ExternalAccountKey are output only and
     * all values are ignored. For the purpose of the
     * CreateExternalAccountKeyRequest, set it to a default/empty value.
     * </pre>
     *
     * <code>
     * .google.cloud.security.publicca.v1beta1.ExternalAccountKey external_account_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearExternalAccountKey() {
      bitField0_ = (bitField0_ & ~0x00000002);
      externalAccountKey_ = null;
      if (externalAccountKeyBuilder_ != null) {
        externalAccountKeyBuilder_.dispose();
        externalAccountKeyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The external account key to create. This field only exists to future-proof
     * the API. At present, all fields in ExternalAccountKey are output only and
     * all values are ignored. For the purpose of the
     * CreateExternalAccountKeyRequest, set it to a default/empty value.
     * </pre>
     *
     * <code>
     * .google.cloud.security.publicca.v1beta1.ExternalAccountKey external_account_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.security.publicca.v1beta1.ExternalAccountKey.Builder
        getExternalAccountKeyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getExternalAccountKeyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The external account key to create. This field only exists to future-proof
     * the API. At present, all fields in ExternalAccountKey are output only and
     * all values are ignored. For the purpose of the
     * CreateExternalAccountKeyRequest, set it to a default/empty value.
     * </pre>
     *
     * <code>
     * .google.cloud.security.publicca.v1beta1.ExternalAccountKey external_account_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.security.publicca.v1beta1.ExternalAccountKeyOrBuilder
        getExternalAccountKeyOrBuilder() {
      if (externalAccountKeyBuilder_ != null) {
        return externalAccountKeyBuilder_.getMessageOrBuilder();
      } else {
        return externalAccountKey_ == null
            ? com.google.cloud.security.publicca.v1beta1.ExternalAccountKey.getDefaultInstance()
            : externalAccountKey_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The external account key to create. This field only exists to future-proof
     * the API. At present, all fields in ExternalAccountKey are output only and
     * all values are ignored. For the purpose of the
     * CreateExternalAccountKeyRequest, set it to a default/empty value.
     * </pre>
     *
     * <code>
     * .google.cloud.security.publicca.v1beta1.ExternalAccountKey external_account_key = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.security.publicca.v1beta1.ExternalAccountKey,
            com.google.cloud.security.publicca.v1beta1.ExternalAccountKey.Builder,
            com.google.cloud.security.publicca.v1beta1.ExternalAccountKeyOrBuilder>
        getExternalAccountKeyFieldBuilder() {
      if (externalAccountKeyBuilder_ == null) {
        externalAccountKeyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.security.publicca.v1beta1.ExternalAccountKey,
                com.google.cloud.security.publicca.v1beta1.ExternalAccountKey.Builder,
                com.google.cloud.security.publicca.v1beta1.ExternalAccountKeyOrBuilder>(
                getExternalAccountKey(), getParentForChildren(), isClean());
        externalAccountKey_ = null;
      }
      return externalAccountKeyBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest)
  private static final com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest();
  }

  public static com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateExternalAccountKeyRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateExternalAccountKeyRequest>() {
        @java.lang.Override
        public CreateExternalAccountKeyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateExternalAccountKeyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateExternalAccountKeyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
