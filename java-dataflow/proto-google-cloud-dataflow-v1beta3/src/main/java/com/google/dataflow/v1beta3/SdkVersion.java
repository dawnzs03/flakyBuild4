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
// source: google/dataflow/v1beta3/jobs.proto

package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * The version of the SDK used to run the job.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.SdkVersion}
 */
public final class SdkVersion extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.SdkVersion)
    SdkVersionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SdkVersion.newBuilder() to construct.
  private SdkVersion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SdkVersion() {
    version_ = "";
    versionDisplayName_ = "";
    sdkSupportStatus_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SdkVersion();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.dataflow.v1beta3.JobsProto
        .internal_static_google_dataflow_v1beta3_SdkVersion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.JobsProto
        .internal_static_google_dataflow_v1beta3_SdkVersion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.SdkVersion.class,
            com.google.dataflow.v1beta3.SdkVersion.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The support status of the SDK used to run the job.
   * </pre>
   *
   * Protobuf enum {@code google.dataflow.v1beta3.SdkVersion.SdkSupportStatus}
   */
  public enum SdkSupportStatus implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Cloud Dataflow is unaware of this version.
     * </pre>
     *
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     *
     *
     * <pre>
     * This is a known version of an SDK, and is supported.
     * </pre>
     *
     * <code>SUPPORTED = 1;</code>
     */
    SUPPORTED(1),
    /**
     *
     *
     * <pre>
     * A newer version of the SDK family exists, and an update is recommended.
     * </pre>
     *
     * <code>STALE = 2;</code>
     */
    STALE(2),
    /**
     *
     *
     * <pre>
     * This version of the SDK is deprecated and will eventually be
     * unsupported.
     * </pre>
     *
     * <code>DEPRECATED = 3;</code>
     */
    DEPRECATED(3),
    /**
     *
     *
     * <pre>
     * Support for this SDK version has ended and it should no longer be used.
     * </pre>
     *
     * <code>UNSUPPORTED = 4;</code>
     */
    UNSUPPORTED(4),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Cloud Dataflow is unaware of this version.
     * </pre>
     *
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     *
     *
     * <pre>
     * This is a known version of an SDK, and is supported.
     * </pre>
     *
     * <code>SUPPORTED = 1;</code>
     */
    public static final int SUPPORTED_VALUE = 1;
    /**
     *
     *
     * <pre>
     * A newer version of the SDK family exists, and an update is recommended.
     * </pre>
     *
     * <code>STALE = 2;</code>
     */
    public static final int STALE_VALUE = 2;
    /**
     *
     *
     * <pre>
     * This version of the SDK is deprecated and will eventually be
     * unsupported.
     * </pre>
     *
     * <code>DEPRECATED = 3;</code>
     */
    public static final int DEPRECATED_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Support for this SDK version has ended and it should no longer be used.
     * </pre>
     *
     * <code>UNSUPPORTED = 4;</code>
     */
    public static final int UNSUPPORTED_VALUE = 4;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SdkSupportStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SdkSupportStatus forNumber(int value) {
      switch (value) {
        case 0:
          return UNKNOWN;
        case 1:
          return SUPPORTED;
        case 2:
          return STALE;
        case 3:
          return DEPRECATED;
        case 4:
          return UNSUPPORTED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SdkSupportStatus> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<SdkSupportStatus>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<SdkSupportStatus>() {
              public SdkSupportStatus findValueByNumber(int number) {
                return SdkSupportStatus.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.dataflow.v1beta3.SdkVersion.getDescriptor().getEnumTypes().get(0);
    }

    private static final SdkSupportStatus[] VALUES = values();

    public static SdkSupportStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private SdkSupportStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.dataflow.v1beta3.SdkVersion.SdkSupportStatus)
  }

  public static final int VERSION_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object version_ = "";
  /**
   *
   *
   * <pre>
   * The version of the SDK used to run the job.
   * </pre>
   *
   * <code>string version = 1;</code>
   *
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The version of the SDK used to run the job.
   * </pre>
   *
   * <code>string version = 1;</code>
   *
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_DISPLAY_NAME_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object versionDisplayName_ = "";
  /**
   *
   *
   * <pre>
   * A readable string describing the version of the SDK.
   * </pre>
   *
   * <code>string version_display_name = 2;</code>
   *
   * @return The versionDisplayName.
   */
  @java.lang.Override
  public java.lang.String getVersionDisplayName() {
    java.lang.Object ref = versionDisplayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      versionDisplayName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A readable string describing the version of the SDK.
   * </pre>
   *
   * <code>string version_display_name = 2;</code>
   *
   * @return The bytes for versionDisplayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVersionDisplayNameBytes() {
    java.lang.Object ref = versionDisplayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      versionDisplayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SDK_SUPPORT_STATUS_FIELD_NUMBER = 3;
  private int sdkSupportStatus_ = 0;
  /**
   *
   *
   * <pre>
   * The support status for this SDK version.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.SdkVersion.SdkSupportStatus sdk_support_status = 3;</code>
   *
   * @return The enum numeric value on the wire for sdkSupportStatus.
   */
  @java.lang.Override
  public int getSdkSupportStatusValue() {
    return sdkSupportStatus_;
  }
  /**
   *
   *
   * <pre>
   * The support status for this SDK version.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.SdkVersion.SdkSupportStatus sdk_support_status = 3;</code>
   *
   * @return The sdkSupportStatus.
   */
  @java.lang.Override
  public com.google.dataflow.v1beta3.SdkVersion.SdkSupportStatus getSdkSupportStatus() {
    com.google.dataflow.v1beta3.SdkVersion.SdkSupportStatus result =
        com.google.dataflow.v1beta3.SdkVersion.SdkSupportStatus.forNumber(sdkSupportStatus_);
    return result == null
        ? com.google.dataflow.v1beta3.SdkVersion.SdkSupportStatus.UNRECOGNIZED
        : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, version_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(versionDisplayName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, versionDisplayName_);
    }
    if (sdkSupportStatus_
        != com.google.dataflow.v1beta3.SdkVersion.SdkSupportStatus.UNKNOWN.getNumber()) {
      output.writeEnum(3, sdkSupportStatus_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, version_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(versionDisplayName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, versionDisplayName_);
    }
    if (sdkSupportStatus_
        != com.google.dataflow.v1beta3.SdkVersion.SdkSupportStatus.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, sdkSupportStatus_);
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
    if (!(obj instanceof com.google.dataflow.v1beta3.SdkVersion)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.SdkVersion other = (com.google.dataflow.v1beta3.SdkVersion) obj;

    if (!getVersion().equals(other.getVersion())) return false;
    if (!getVersionDisplayName().equals(other.getVersionDisplayName())) return false;
    if (sdkSupportStatus_ != other.sdkSupportStatus_) return false;
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
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (37 * hash) + VERSION_DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getVersionDisplayName().hashCode();
    hash = (37 * hash) + SDK_SUPPORT_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + sdkSupportStatus_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.SdkVersion parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.SdkVersion parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.SdkVersion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.SdkVersion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.SdkVersion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.SdkVersion parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.SdkVersion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.SdkVersion parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.SdkVersion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.SdkVersion parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.SdkVersion parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.SdkVersion parseFrom(
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

  public static Builder newBuilder(com.google.dataflow.v1beta3.SdkVersion prototype) {
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
   * The version of the SDK used to run the job.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.SdkVersion}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.SdkVersion)
      com.google.dataflow.v1beta3.SdkVersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.dataflow.v1beta3.JobsProto
          .internal_static_google_dataflow_v1beta3_SdkVersion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.JobsProto
          .internal_static_google_dataflow_v1beta3_SdkVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.SdkVersion.class,
              com.google.dataflow.v1beta3.SdkVersion.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.SdkVersion.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      version_ = "";
      versionDisplayName_ = "";
      sdkSupportStatus_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.dataflow.v1beta3.JobsProto
          .internal_static_google_dataflow_v1beta3_SdkVersion_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.SdkVersion getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.SdkVersion.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.SdkVersion build() {
      com.google.dataflow.v1beta3.SdkVersion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.SdkVersion buildPartial() {
      com.google.dataflow.v1beta3.SdkVersion result =
          new com.google.dataflow.v1beta3.SdkVersion(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.dataflow.v1beta3.SdkVersion result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.version_ = version_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.versionDisplayName_ = versionDisplayName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.sdkSupportStatus_ = sdkSupportStatus_;
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
      if (other instanceof com.google.dataflow.v1beta3.SdkVersion) {
        return mergeFrom((com.google.dataflow.v1beta3.SdkVersion) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.SdkVersion other) {
      if (other == com.google.dataflow.v1beta3.SdkVersion.getDefaultInstance()) return this;
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getVersionDisplayName().isEmpty()) {
        versionDisplayName_ = other.versionDisplayName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.sdkSupportStatus_ != 0) {
        setSdkSupportStatusValue(other.getSdkSupportStatusValue());
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
                version_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                versionDisplayName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                sdkSupportStatus_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private java.lang.Object version_ = "";
    /**
     *
     *
     * <pre>
     * The version of the SDK used to run the job.
     * </pre>
     *
     * <code>string version = 1;</code>
     *
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The version of the SDK used to run the job.
     * </pre>
     *
     * <code>string version = 1;</code>
     *
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The version of the SDK used to run the job.
     * </pre>
     *
     * <code>string version = 1;</code>
     *
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      version_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The version of the SDK used to run the job.
     * </pre>
     *
     * <code>string version = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      version_ = getDefaultInstance().getVersion();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The version of the SDK used to run the job.
     * </pre>
     *
     * <code>string version = 1;</code>
     *
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      version_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object versionDisplayName_ = "";
    /**
     *
     *
     * <pre>
     * A readable string describing the version of the SDK.
     * </pre>
     *
     * <code>string version_display_name = 2;</code>
     *
     * @return The versionDisplayName.
     */
    public java.lang.String getVersionDisplayName() {
      java.lang.Object ref = versionDisplayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        versionDisplayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A readable string describing the version of the SDK.
     * </pre>
     *
     * <code>string version_display_name = 2;</code>
     *
     * @return The bytes for versionDisplayName.
     */
    public com.google.protobuf.ByteString getVersionDisplayNameBytes() {
      java.lang.Object ref = versionDisplayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        versionDisplayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A readable string describing the version of the SDK.
     * </pre>
     *
     * <code>string version_display_name = 2;</code>
     *
     * @param value The versionDisplayName to set.
     * @return This builder for chaining.
     */
    public Builder setVersionDisplayName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      versionDisplayName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A readable string describing the version of the SDK.
     * </pre>
     *
     * <code>string version_display_name = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVersionDisplayName() {
      versionDisplayName_ = getDefaultInstance().getVersionDisplayName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A readable string describing the version of the SDK.
     * </pre>
     *
     * <code>string version_display_name = 2;</code>
     *
     * @param value The bytes for versionDisplayName to set.
     * @return This builder for chaining.
     */
    public Builder setVersionDisplayNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      versionDisplayName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int sdkSupportStatus_ = 0;
    /**
     *
     *
     * <pre>
     * The support status for this SDK version.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.SdkVersion.SdkSupportStatus sdk_support_status = 3;</code>
     *
     * @return The enum numeric value on the wire for sdkSupportStatus.
     */
    @java.lang.Override
    public int getSdkSupportStatusValue() {
      return sdkSupportStatus_;
    }
    /**
     *
     *
     * <pre>
     * The support status for this SDK version.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.SdkVersion.SdkSupportStatus sdk_support_status = 3;</code>
     *
     * @param value The enum numeric value on the wire for sdkSupportStatus to set.
     * @return This builder for chaining.
     */
    public Builder setSdkSupportStatusValue(int value) {
      sdkSupportStatus_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The support status for this SDK version.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.SdkVersion.SdkSupportStatus sdk_support_status = 3;</code>
     *
     * @return The sdkSupportStatus.
     */
    @java.lang.Override
    public com.google.dataflow.v1beta3.SdkVersion.SdkSupportStatus getSdkSupportStatus() {
      com.google.dataflow.v1beta3.SdkVersion.SdkSupportStatus result =
          com.google.dataflow.v1beta3.SdkVersion.SdkSupportStatus.forNumber(sdkSupportStatus_);
      return result == null
          ? com.google.dataflow.v1beta3.SdkVersion.SdkSupportStatus.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The support status for this SDK version.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.SdkVersion.SdkSupportStatus sdk_support_status = 3;</code>
     *
     * @param value The sdkSupportStatus to set.
     * @return This builder for chaining.
     */
    public Builder setSdkSupportStatus(
        com.google.dataflow.v1beta3.SdkVersion.SdkSupportStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      sdkSupportStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The support status for this SDK version.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.SdkVersion.SdkSupportStatus sdk_support_status = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSdkSupportStatus() {
      bitField0_ = (bitField0_ & ~0x00000004);
      sdkSupportStatus_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.SdkVersion)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.SdkVersion)
  private static final com.google.dataflow.v1beta3.SdkVersion DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.SdkVersion();
  }

  public static com.google.dataflow.v1beta3.SdkVersion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SdkVersion> PARSER =
      new com.google.protobuf.AbstractParser<SdkVersion>() {
        @java.lang.Override
        public SdkVersion parsePartialFrom(
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

  public static com.google.protobuf.Parser<SdkVersion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SdkVersion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.SdkVersion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
