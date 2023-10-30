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
// source: google/cloud/notebooks/v1/runtime.proto

package com.google.cloud.notebooks.v1;

/**
 *
 *
 * <pre>
 * A set of Shielded Instance options.
 * Check [Images using supported Shielded VM
 * features](https://cloud.google.com/compute/docs/instances/modifying-shielded-vm).
 * Not all combinations are valid.
 * </pre>
 *
 * Protobuf type {@code google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig}
 */
public final class RuntimeShieldedInstanceConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig)
    RuntimeShieldedInstanceConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RuntimeShieldedInstanceConfig.newBuilder() to construct.
  private RuntimeShieldedInstanceConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RuntimeShieldedInstanceConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RuntimeShieldedInstanceConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.notebooks.v1.RuntimeProto
        .internal_static_google_cloud_notebooks_v1_RuntimeShieldedInstanceConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.notebooks.v1.RuntimeProto
        .internal_static_google_cloud_notebooks_v1_RuntimeShieldedInstanceConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig.class,
            com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig.Builder.class);
  }

  public static final int ENABLE_SECURE_BOOT_FIELD_NUMBER = 1;
  private boolean enableSecureBoot_ = false;
  /**
   *
   *
   * <pre>
   * Defines whether the instance has Secure Boot enabled.
   *
   * Secure Boot helps ensure that the system only runs authentic software by
   * verifying the digital signature of all boot components, and halting the
   * boot process if signature verification fails. Disabled by default.
   * </pre>
   *
   * <code>bool enable_secure_boot = 1;</code>
   *
   * @return The enableSecureBoot.
   */
  @java.lang.Override
  public boolean getEnableSecureBoot() {
    return enableSecureBoot_;
  }

  public static final int ENABLE_VTPM_FIELD_NUMBER = 2;
  private boolean enableVtpm_ = false;
  /**
   *
   *
   * <pre>
   * Defines whether the instance has the vTPM enabled. Enabled by default.
   * </pre>
   *
   * <code>bool enable_vtpm = 2;</code>
   *
   * @return The enableVtpm.
   */
  @java.lang.Override
  public boolean getEnableVtpm() {
    return enableVtpm_;
  }

  public static final int ENABLE_INTEGRITY_MONITORING_FIELD_NUMBER = 3;
  private boolean enableIntegrityMonitoring_ = false;
  /**
   *
   *
   * <pre>
   * Defines whether the instance has integrity monitoring enabled.
   *
   * Enables monitoring and attestation of the boot integrity of the instance.
   * The attestation is performed against the integrity policy baseline. This
   * baseline is initially derived from the implicitly trusted boot image when
   * the instance is created. Enabled by default.
   * </pre>
   *
   * <code>bool enable_integrity_monitoring = 3;</code>
   *
   * @return The enableIntegrityMonitoring.
   */
  @java.lang.Override
  public boolean getEnableIntegrityMonitoring() {
    return enableIntegrityMonitoring_;
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
    if (enableSecureBoot_ != false) {
      output.writeBool(1, enableSecureBoot_);
    }
    if (enableVtpm_ != false) {
      output.writeBool(2, enableVtpm_);
    }
    if (enableIntegrityMonitoring_ != false) {
      output.writeBool(3, enableIntegrityMonitoring_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableSecureBoot_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, enableSecureBoot_);
    }
    if (enableVtpm_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, enableVtpm_);
    }
    if (enableIntegrityMonitoring_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, enableIntegrityMonitoring_);
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
    if (!(obj instanceof com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig other =
        (com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig) obj;

    if (getEnableSecureBoot() != other.getEnableSecureBoot()) return false;
    if (getEnableVtpm() != other.getEnableVtpm()) return false;
    if (getEnableIntegrityMonitoring() != other.getEnableIntegrityMonitoring()) return false;
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
    hash = (37 * hash) + ENABLE_SECURE_BOOT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableSecureBoot());
    hash = (37 * hash) + ENABLE_VTPM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableVtpm());
    hash = (37 * hash) + ENABLE_INTEGRITY_MONITORING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableIntegrityMonitoring());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig parseFrom(
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
      com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig prototype) {
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
   * A set of Shielded Instance options.
   * Check [Images using supported Shielded VM
   * features](https://cloud.google.com/compute/docs/instances/modifying-shielded-vm).
   * Not all combinations are valid.
   * </pre>
   *
   * Protobuf type {@code google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig)
      com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.notebooks.v1.RuntimeProto
          .internal_static_google_cloud_notebooks_v1_RuntimeShieldedInstanceConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.notebooks.v1.RuntimeProto
          .internal_static_google_cloud_notebooks_v1_RuntimeShieldedInstanceConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig.class,
              com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig.Builder.class);
    }

    // Construct using com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enableSecureBoot_ = false;
      enableVtpm_ = false;
      enableIntegrityMonitoring_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.notebooks.v1.RuntimeProto
          .internal_static_google_cloud_notebooks_v1_RuntimeShieldedInstanceConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig getDefaultInstanceForType() {
      return com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig build() {
      com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig buildPartial() {
      com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig result =
          new com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enableSecureBoot_ = enableSecureBoot_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.enableVtpm_ = enableVtpm_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.enableIntegrityMonitoring_ = enableIntegrityMonitoring_;
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
      if (other instanceof com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig) {
        return mergeFrom((com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig other) {
      if (other == com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig.getDefaultInstance())
        return this;
      if (other.getEnableSecureBoot() != false) {
        setEnableSecureBoot(other.getEnableSecureBoot());
      }
      if (other.getEnableVtpm() != false) {
        setEnableVtpm(other.getEnableVtpm());
      }
      if (other.getEnableIntegrityMonitoring() != false) {
        setEnableIntegrityMonitoring(other.getEnableIntegrityMonitoring());
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
            case 8:
              {
                enableSecureBoot_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                enableVtpm_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                enableIntegrityMonitoring_ = input.readBool();
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

    private boolean enableSecureBoot_;
    /**
     *
     *
     * <pre>
     * Defines whether the instance has Secure Boot enabled.
     *
     * Secure Boot helps ensure that the system only runs authentic software by
     * verifying the digital signature of all boot components, and halting the
     * boot process if signature verification fails. Disabled by default.
     * </pre>
     *
     * <code>bool enable_secure_boot = 1;</code>
     *
     * @return The enableSecureBoot.
     */
    @java.lang.Override
    public boolean getEnableSecureBoot() {
      return enableSecureBoot_;
    }
    /**
     *
     *
     * <pre>
     * Defines whether the instance has Secure Boot enabled.
     *
     * Secure Boot helps ensure that the system only runs authentic software by
     * verifying the digital signature of all boot components, and halting the
     * boot process if signature verification fails. Disabled by default.
     * </pre>
     *
     * <code>bool enable_secure_boot = 1;</code>
     *
     * @param value The enableSecureBoot to set.
     * @return This builder for chaining.
     */
    public Builder setEnableSecureBoot(boolean value) {

      enableSecureBoot_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines whether the instance has Secure Boot enabled.
     *
     * Secure Boot helps ensure that the system only runs authentic software by
     * verifying the digital signature of all boot components, and halting the
     * boot process if signature verification fails. Disabled by default.
     * </pre>
     *
     * <code>bool enable_secure_boot = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableSecureBoot() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enableSecureBoot_ = false;
      onChanged();
      return this;
    }

    private boolean enableVtpm_;
    /**
     *
     *
     * <pre>
     * Defines whether the instance has the vTPM enabled. Enabled by default.
     * </pre>
     *
     * <code>bool enable_vtpm = 2;</code>
     *
     * @return The enableVtpm.
     */
    @java.lang.Override
    public boolean getEnableVtpm() {
      return enableVtpm_;
    }
    /**
     *
     *
     * <pre>
     * Defines whether the instance has the vTPM enabled. Enabled by default.
     * </pre>
     *
     * <code>bool enable_vtpm = 2;</code>
     *
     * @param value The enableVtpm to set.
     * @return This builder for chaining.
     */
    public Builder setEnableVtpm(boolean value) {

      enableVtpm_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines whether the instance has the vTPM enabled. Enabled by default.
     * </pre>
     *
     * <code>bool enable_vtpm = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableVtpm() {
      bitField0_ = (bitField0_ & ~0x00000002);
      enableVtpm_ = false;
      onChanged();
      return this;
    }

    private boolean enableIntegrityMonitoring_;
    /**
     *
     *
     * <pre>
     * Defines whether the instance has integrity monitoring enabled.
     *
     * Enables monitoring and attestation of the boot integrity of the instance.
     * The attestation is performed against the integrity policy baseline. This
     * baseline is initially derived from the implicitly trusted boot image when
     * the instance is created. Enabled by default.
     * </pre>
     *
     * <code>bool enable_integrity_monitoring = 3;</code>
     *
     * @return The enableIntegrityMonitoring.
     */
    @java.lang.Override
    public boolean getEnableIntegrityMonitoring() {
      return enableIntegrityMonitoring_;
    }
    /**
     *
     *
     * <pre>
     * Defines whether the instance has integrity monitoring enabled.
     *
     * Enables monitoring and attestation of the boot integrity of the instance.
     * The attestation is performed against the integrity policy baseline. This
     * baseline is initially derived from the implicitly trusted boot image when
     * the instance is created. Enabled by default.
     * </pre>
     *
     * <code>bool enable_integrity_monitoring = 3;</code>
     *
     * @param value The enableIntegrityMonitoring to set.
     * @return This builder for chaining.
     */
    public Builder setEnableIntegrityMonitoring(boolean value) {

      enableIntegrityMonitoring_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines whether the instance has integrity monitoring enabled.
     *
     * Enables monitoring and attestation of the boot integrity of the instance.
     * The attestation is performed against the integrity policy baseline. This
     * baseline is initially derived from the implicitly trusted boot image when
     * the instance is created. Enabled by default.
     * </pre>
     *
     * <code>bool enable_integrity_monitoring = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableIntegrityMonitoring() {
      bitField0_ = (bitField0_ & ~0x00000004);
      enableIntegrityMonitoring_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig)
  private static final com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig();
  }

  public static com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RuntimeShieldedInstanceConfig> PARSER =
      new com.google.protobuf.AbstractParser<RuntimeShieldedInstanceConfig>() {
        @java.lang.Override
        public RuntimeShieldedInstanceConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<RuntimeShieldedInstanceConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RuntimeShieldedInstanceConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.notebooks.v1.RuntimeShieldedInstanceConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
