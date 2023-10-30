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
// source: google/cloud/kms/v1/resources.proto

package com.google.cloud.kms.v1;

/**
 *
 *
 * <pre>
 * ExternalProtectionLevelOptions stores a group of additional fields for
 * configuring a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] that
 * are specific to the [EXTERNAL][google.cloud.kms.v1.ProtectionLevel.EXTERNAL]
 * protection level and
 * [EXTERNAL_VPC][google.cloud.kms.v1.ProtectionLevel.EXTERNAL_VPC] protection
 * levels.
 * </pre>
 *
 * Protobuf type {@code google.cloud.kms.v1.ExternalProtectionLevelOptions}
 */
public final class ExternalProtectionLevelOptions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.kms.v1.ExternalProtectionLevelOptions)
    ExternalProtectionLevelOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ExternalProtectionLevelOptions.newBuilder() to construct.
  private ExternalProtectionLevelOptions(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExternalProtectionLevelOptions() {
    externalKeyUri_ = "";
    ekmConnectionKeyPath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExternalProtectionLevelOptions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.kms.v1.KmsResourcesProto
        .internal_static_google_cloud_kms_v1_ExternalProtectionLevelOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.kms.v1.KmsResourcesProto
        .internal_static_google_cloud_kms_v1_ExternalProtectionLevelOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.kms.v1.ExternalProtectionLevelOptions.class,
            com.google.cloud.kms.v1.ExternalProtectionLevelOptions.Builder.class);
  }

  public static final int EXTERNAL_KEY_URI_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object externalKeyUri_ = "";
  /**
   *
   *
   * <pre>
   * The URI for an external resource that this
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] represents.
   * </pre>
   *
   * <code>string external_key_uri = 1;</code>
   *
   * @return The externalKeyUri.
   */
  @java.lang.Override
  public java.lang.String getExternalKeyUri() {
    java.lang.Object ref = externalKeyUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      externalKeyUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The URI for an external resource that this
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] represents.
   * </pre>
   *
   * <code>string external_key_uri = 1;</code>
   *
   * @return The bytes for externalKeyUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getExternalKeyUriBytes() {
    java.lang.Object ref = externalKeyUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      externalKeyUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EKM_CONNECTION_KEY_PATH_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object ekmConnectionKeyPath_ = "";
  /**
   *
   *
   * <pre>
   * The path to the external key material on the EKM when using
   * [EkmConnection][google.cloud.kms.v1.EkmConnection] e.g., "v0/my/key". Set
   * this field instead of external_key_uri when using an
   * [EkmConnection][google.cloud.kms.v1.EkmConnection].
   * </pre>
   *
   * <code>string ekm_connection_key_path = 2;</code>
   *
   * @return The ekmConnectionKeyPath.
   */
  @java.lang.Override
  public java.lang.String getEkmConnectionKeyPath() {
    java.lang.Object ref = ekmConnectionKeyPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ekmConnectionKeyPath_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The path to the external key material on the EKM when using
   * [EkmConnection][google.cloud.kms.v1.EkmConnection] e.g., "v0/my/key". Set
   * this field instead of external_key_uri when using an
   * [EkmConnection][google.cloud.kms.v1.EkmConnection].
   * </pre>
   *
   * <code>string ekm_connection_key_path = 2;</code>
   *
   * @return The bytes for ekmConnectionKeyPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEkmConnectionKeyPathBytes() {
    java.lang.Object ref = ekmConnectionKeyPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      ekmConnectionKeyPath_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(externalKeyUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, externalKeyUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ekmConnectionKeyPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ekmConnectionKeyPath_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(externalKeyUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, externalKeyUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ekmConnectionKeyPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ekmConnectionKeyPath_);
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
    if (!(obj instanceof com.google.cloud.kms.v1.ExternalProtectionLevelOptions)) {
      return super.equals(obj);
    }
    com.google.cloud.kms.v1.ExternalProtectionLevelOptions other =
        (com.google.cloud.kms.v1.ExternalProtectionLevelOptions) obj;

    if (!getExternalKeyUri().equals(other.getExternalKeyUri())) return false;
    if (!getEkmConnectionKeyPath().equals(other.getEkmConnectionKeyPath())) return false;
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
    hash = (37 * hash) + EXTERNAL_KEY_URI_FIELD_NUMBER;
    hash = (53 * hash) + getExternalKeyUri().hashCode();
    hash = (37 * hash) + EKM_CONNECTION_KEY_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getEkmConnectionKeyPath().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.kms.v1.ExternalProtectionLevelOptions parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.ExternalProtectionLevelOptions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.ExternalProtectionLevelOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.ExternalProtectionLevelOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.ExternalProtectionLevelOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.ExternalProtectionLevelOptions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.ExternalProtectionLevelOptions parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.ExternalProtectionLevelOptions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.ExternalProtectionLevelOptions parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.ExternalProtectionLevelOptions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.ExternalProtectionLevelOptions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.ExternalProtectionLevelOptions parseFrom(
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
      com.google.cloud.kms.v1.ExternalProtectionLevelOptions prototype) {
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
   * ExternalProtectionLevelOptions stores a group of additional fields for
   * configuring a [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] that
   * are specific to the [EXTERNAL][google.cloud.kms.v1.ProtectionLevel.EXTERNAL]
   * protection level and
   * [EXTERNAL_VPC][google.cloud.kms.v1.ProtectionLevel.EXTERNAL_VPC] protection
   * levels.
   * </pre>
   *
   * Protobuf type {@code google.cloud.kms.v1.ExternalProtectionLevelOptions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.kms.v1.ExternalProtectionLevelOptions)
      com.google.cloud.kms.v1.ExternalProtectionLevelOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.kms.v1.KmsResourcesProto
          .internal_static_google_cloud_kms_v1_ExternalProtectionLevelOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.kms.v1.KmsResourcesProto
          .internal_static_google_cloud_kms_v1_ExternalProtectionLevelOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.kms.v1.ExternalProtectionLevelOptions.class,
              com.google.cloud.kms.v1.ExternalProtectionLevelOptions.Builder.class);
    }

    // Construct using com.google.cloud.kms.v1.ExternalProtectionLevelOptions.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      externalKeyUri_ = "";
      ekmConnectionKeyPath_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.kms.v1.KmsResourcesProto
          .internal_static_google_cloud_kms_v1_ExternalProtectionLevelOptions_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.ExternalProtectionLevelOptions getDefaultInstanceForType() {
      return com.google.cloud.kms.v1.ExternalProtectionLevelOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.ExternalProtectionLevelOptions build() {
      com.google.cloud.kms.v1.ExternalProtectionLevelOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.ExternalProtectionLevelOptions buildPartial() {
      com.google.cloud.kms.v1.ExternalProtectionLevelOptions result =
          new com.google.cloud.kms.v1.ExternalProtectionLevelOptions(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.kms.v1.ExternalProtectionLevelOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.externalKeyUri_ = externalKeyUri_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ekmConnectionKeyPath_ = ekmConnectionKeyPath_;
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
      if (other instanceof com.google.cloud.kms.v1.ExternalProtectionLevelOptions) {
        return mergeFrom((com.google.cloud.kms.v1.ExternalProtectionLevelOptions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.kms.v1.ExternalProtectionLevelOptions other) {
      if (other == com.google.cloud.kms.v1.ExternalProtectionLevelOptions.getDefaultInstance())
        return this;
      if (!other.getExternalKeyUri().isEmpty()) {
        externalKeyUri_ = other.externalKeyUri_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getEkmConnectionKeyPath().isEmpty()) {
        ekmConnectionKeyPath_ = other.ekmConnectionKeyPath_;
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
            case 10:
              {
                externalKeyUri_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                ekmConnectionKeyPath_ = input.readStringRequireUtf8();
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

    private java.lang.Object externalKeyUri_ = "";
    /**
     *
     *
     * <pre>
     * The URI for an external resource that this
     * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] represents.
     * </pre>
     *
     * <code>string external_key_uri = 1;</code>
     *
     * @return The externalKeyUri.
     */
    public java.lang.String getExternalKeyUri() {
      java.lang.Object ref = externalKeyUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        externalKeyUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The URI for an external resource that this
     * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] represents.
     * </pre>
     *
     * <code>string external_key_uri = 1;</code>
     *
     * @return The bytes for externalKeyUri.
     */
    public com.google.protobuf.ByteString getExternalKeyUriBytes() {
      java.lang.Object ref = externalKeyUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        externalKeyUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The URI for an external resource that this
     * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] represents.
     * </pre>
     *
     * <code>string external_key_uri = 1;</code>
     *
     * @param value The externalKeyUri to set.
     * @return This builder for chaining.
     */
    public Builder setExternalKeyUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      externalKeyUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URI for an external resource that this
     * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] represents.
     * </pre>
     *
     * <code>string external_key_uri = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExternalKeyUri() {
      externalKeyUri_ = getDefaultInstance().getExternalKeyUri();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URI for an external resource that this
     * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] represents.
     * </pre>
     *
     * <code>string external_key_uri = 1;</code>
     *
     * @param value The bytes for externalKeyUri to set.
     * @return This builder for chaining.
     */
    public Builder setExternalKeyUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      externalKeyUri_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object ekmConnectionKeyPath_ = "";
    /**
     *
     *
     * <pre>
     * The path to the external key material on the EKM when using
     * [EkmConnection][google.cloud.kms.v1.EkmConnection] e.g., "v0/my/key". Set
     * this field instead of external_key_uri when using an
     * [EkmConnection][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>string ekm_connection_key_path = 2;</code>
     *
     * @return The ekmConnectionKeyPath.
     */
    public java.lang.String getEkmConnectionKeyPath() {
      java.lang.Object ref = ekmConnectionKeyPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ekmConnectionKeyPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The path to the external key material on the EKM when using
     * [EkmConnection][google.cloud.kms.v1.EkmConnection] e.g., "v0/my/key". Set
     * this field instead of external_key_uri when using an
     * [EkmConnection][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>string ekm_connection_key_path = 2;</code>
     *
     * @return The bytes for ekmConnectionKeyPath.
     */
    public com.google.protobuf.ByteString getEkmConnectionKeyPathBytes() {
      java.lang.Object ref = ekmConnectionKeyPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        ekmConnectionKeyPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The path to the external key material on the EKM when using
     * [EkmConnection][google.cloud.kms.v1.EkmConnection] e.g., "v0/my/key". Set
     * this field instead of external_key_uri when using an
     * [EkmConnection][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>string ekm_connection_key_path = 2;</code>
     *
     * @param value The ekmConnectionKeyPath to set.
     * @return This builder for chaining.
     */
    public Builder setEkmConnectionKeyPath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ekmConnectionKeyPath_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The path to the external key material on the EKM when using
     * [EkmConnection][google.cloud.kms.v1.EkmConnection] e.g., "v0/my/key". Set
     * this field instead of external_key_uri when using an
     * [EkmConnection][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>string ekm_connection_key_path = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEkmConnectionKeyPath() {
      ekmConnectionKeyPath_ = getDefaultInstance().getEkmConnectionKeyPath();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The path to the external key material on the EKM when using
     * [EkmConnection][google.cloud.kms.v1.EkmConnection] e.g., "v0/my/key". Set
     * this field instead of external_key_uri when using an
     * [EkmConnection][google.cloud.kms.v1.EkmConnection].
     * </pre>
     *
     * <code>string ekm_connection_key_path = 2;</code>
     *
     * @param value The bytes for ekmConnectionKeyPath to set.
     * @return This builder for chaining.
     */
    public Builder setEkmConnectionKeyPathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ekmConnectionKeyPath_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.kms.v1.ExternalProtectionLevelOptions)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.kms.v1.ExternalProtectionLevelOptions)
  private static final com.google.cloud.kms.v1.ExternalProtectionLevelOptions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.kms.v1.ExternalProtectionLevelOptions();
  }

  public static com.google.cloud.kms.v1.ExternalProtectionLevelOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExternalProtectionLevelOptions> PARSER =
      new com.google.protobuf.AbstractParser<ExternalProtectionLevelOptions>() {
        @java.lang.Override
        public ExternalProtectionLevelOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExternalProtectionLevelOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExternalProtectionLevelOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.kms.v1.ExternalProtectionLevelOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
