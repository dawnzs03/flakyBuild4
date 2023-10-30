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
// source: google/cloud/datastream/v1alpha1/datastream_resources.proto

package com.google.cloud.datastream.v1alpha1;

/**
 *
 *
 * <pre>
 * The configuration of the stream destination.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datastream.v1alpha1.DestinationConfig}
 */
public final class DestinationConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datastream.v1alpha1.DestinationConfig)
    DestinationConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DestinationConfig.newBuilder() to construct.
  private DestinationConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DestinationConfig() {
    destinationConnectionProfileName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DestinationConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
        .internal_static_google_cloud_datastream_v1alpha1_DestinationConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
        .internal_static_google_cloud_datastream_v1alpha1_DestinationConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datastream.v1alpha1.DestinationConfig.class,
            com.google.cloud.datastream.v1alpha1.DestinationConfig.Builder.class);
  }

  private int destinationStreamConfigCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object destinationStreamConfig_;

  public enum DestinationStreamConfigCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GCS_DESTINATION_CONFIG(100),
    DESTINATIONSTREAMCONFIG_NOT_SET(0);
    private final int value;

    private DestinationStreamConfigCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DestinationStreamConfigCase valueOf(int value) {
      return forNumber(value);
    }

    public static DestinationStreamConfigCase forNumber(int value) {
      switch (value) {
        case 100:
          return GCS_DESTINATION_CONFIG;
        case 0:
          return DESTINATIONSTREAMCONFIG_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public DestinationStreamConfigCase getDestinationStreamConfigCase() {
    return DestinationStreamConfigCase.forNumber(destinationStreamConfigCase_);
  }

  public static final int DESTINATION_CONNECTION_PROFILE_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object destinationConnectionProfileName_ = "";
  /**
   *
   *
   * <pre>
   * Required. Destination connection profile identifier.
   * </pre>
   *
   * <code>string destination_connection_profile_name = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The destinationConnectionProfileName.
   */
  @java.lang.Override
  public java.lang.String getDestinationConnectionProfileName() {
    java.lang.Object ref = destinationConnectionProfileName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destinationConnectionProfileName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Destination connection profile identifier.
   * </pre>
   *
   * <code>string destination_connection_profile_name = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The bytes for destinationConnectionProfileName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDestinationConnectionProfileNameBytes() {
    java.lang.Object ref = destinationConnectionProfileName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      destinationConnectionProfileName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GCS_DESTINATION_CONFIG_FIELD_NUMBER = 100;
  /**
   * <code>.google.cloud.datastream.v1alpha1.GcsDestinationConfig gcs_destination_config = 100;
   * </code>
   *
   * @return Whether the gcsDestinationConfig field is set.
   */
  @java.lang.Override
  public boolean hasGcsDestinationConfig() {
    return destinationStreamConfigCase_ == 100;
  }
  /**
   * <code>.google.cloud.datastream.v1alpha1.GcsDestinationConfig gcs_destination_config = 100;
   * </code>
   *
   * @return The gcsDestinationConfig.
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.GcsDestinationConfig getGcsDestinationConfig() {
    if (destinationStreamConfigCase_ == 100) {
      return (com.google.cloud.datastream.v1alpha1.GcsDestinationConfig) destinationStreamConfig_;
    }
    return com.google.cloud.datastream.v1alpha1.GcsDestinationConfig.getDefaultInstance();
  }
  /**
   * <code>.google.cloud.datastream.v1alpha1.GcsDestinationConfig gcs_destination_config = 100;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.GcsDestinationConfigOrBuilder
      getGcsDestinationConfigOrBuilder() {
    if (destinationStreamConfigCase_ == 100) {
      return (com.google.cloud.datastream.v1alpha1.GcsDestinationConfig) destinationStreamConfig_;
    }
    return com.google.cloud.datastream.v1alpha1.GcsDestinationConfig.getDefaultInstance();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destinationConnectionProfileName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(
          output, 1, destinationConnectionProfileName_);
    }
    if (destinationStreamConfigCase_ == 100) {
      output.writeMessage(
          100,
          (com.google.cloud.datastream.v1alpha1.GcsDestinationConfig) destinationStreamConfig_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destinationConnectionProfileName_)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(
              1, destinationConnectionProfileName_);
    }
    if (destinationStreamConfigCase_ == 100) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              100,
              (com.google.cloud.datastream.v1alpha1.GcsDestinationConfig) destinationStreamConfig_);
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
    if (!(obj instanceof com.google.cloud.datastream.v1alpha1.DestinationConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.datastream.v1alpha1.DestinationConfig other =
        (com.google.cloud.datastream.v1alpha1.DestinationConfig) obj;

    if (!getDestinationConnectionProfileName().equals(other.getDestinationConnectionProfileName()))
      return false;
    if (!getDestinationStreamConfigCase().equals(other.getDestinationStreamConfigCase()))
      return false;
    switch (destinationStreamConfigCase_) {
      case 100:
        if (!getGcsDestinationConfig().equals(other.getGcsDestinationConfig())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + DESTINATION_CONNECTION_PROFILE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDestinationConnectionProfileName().hashCode();
    switch (destinationStreamConfigCase_) {
      case 100:
        hash = (37 * hash) + GCS_DESTINATION_CONFIG_FIELD_NUMBER;
        hash = (53 * hash) + getGcsDestinationConfig().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datastream.v1alpha1.DestinationConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1alpha1.DestinationConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.DestinationConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1alpha1.DestinationConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.DestinationConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1alpha1.DestinationConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.DestinationConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1alpha1.DestinationConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.DestinationConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1alpha1.DestinationConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.DestinationConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1alpha1.DestinationConfig parseFrom(
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
      com.google.cloud.datastream.v1alpha1.DestinationConfig prototype) {
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
   * The configuration of the stream destination.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datastream.v1alpha1.DestinationConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datastream.v1alpha1.DestinationConfig)
      com.google.cloud.datastream.v1alpha1.DestinationConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
          .internal_static_google_cloud_datastream_v1alpha1_DestinationConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
          .internal_static_google_cloud_datastream_v1alpha1_DestinationConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datastream.v1alpha1.DestinationConfig.class,
              com.google.cloud.datastream.v1alpha1.DestinationConfig.Builder.class);
    }

    // Construct using com.google.cloud.datastream.v1alpha1.DestinationConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      destinationConnectionProfileName_ = "";
      if (gcsDestinationConfigBuilder_ != null) {
        gcsDestinationConfigBuilder_.clear();
      }
      destinationStreamConfigCase_ = 0;
      destinationStreamConfig_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
          .internal_static_google_cloud_datastream_v1alpha1_DestinationConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.DestinationConfig getDefaultInstanceForType() {
      return com.google.cloud.datastream.v1alpha1.DestinationConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.DestinationConfig build() {
      com.google.cloud.datastream.v1alpha1.DestinationConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.DestinationConfig buildPartial() {
      com.google.cloud.datastream.v1alpha1.DestinationConfig result =
          new com.google.cloud.datastream.v1alpha1.DestinationConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datastream.v1alpha1.DestinationConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.destinationConnectionProfileName_ = destinationConnectionProfileName_;
      }
    }

    private void buildPartialOneofs(com.google.cloud.datastream.v1alpha1.DestinationConfig result) {
      result.destinationStreamConfigCase_ = destinationStreamConfigCase_;
      result.destinationStreamConfig_ = this.destinationStreamConfig_;
      if (destinationStreamConfigCase_ == 100 && gcsDestinationConfigBuilder_ != null) {
        result.destinationStreamConfig_ = gcsDestinationConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.datastream.v1alpha1.DestinationConfig) {
        return mergeFrom((com.google.cloud.datastream.v1alpha1.DestinationConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datastream.v1alpha1.DestinationConfig other) {
      if (other == com.google.cloud.datastream.v1alpha1.DestinationConfig.getDefaultInstance())
        return this;
      if (!other.getDestinationConnectionProfileName().isEmpty()) {
        destinationConnectionProfileName_ = other.destinationConnectionProfileName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      switch (other.getDestinationStreamConfigCase()) {
        case GCS_DESTINATION_CONFIG:
          {
            mergeGcsDestinationConfig(other.getGcsDestinationConfig());
            break;
          }
        case DESTINATIONSTREAMCONFIG_NOT_SET:
          {
            break;
          }
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
                destinationConnectionProfileName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 802:
              {
                input.readMessage(
                    getGcsDestinationConfigFieldBuilder().getBuilder(), extensionRegistry);
                destinationStreamConfigCase_ = 100;
                break;
              } // case 802
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

    private int destinationStreamConfigCase_ = 0;
    private java.lang.Object destinationStreamConfig_;

    public DestinationStreamConfigCase getDestinationStreamConfigCase() {
      return DestinationStreamConfigCase.forNumber(destinationStreamConfigCase_);
    }

    public Builder clearDestinationStreamConfig() {
      destinationStreamConfigCase_ = 0;
      destinationStreamConfig_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object destinationConnectionProfileName_ = "";
    /**
     *
     *
     * <pre>
     * Required. Destination connection profile identifier.
     * </pre>
     *
     * <code>
     * string destination_connection_profile_name = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The destinationConnectionProfileName.
     */
    public java.lang.String getDestinationConnectionProfileName() {
      java.lang.Object ref = destinationConnectionProfileName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destinationConnectionProfileName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Destination connection profile identifier.
     * </pre>
     *
     * <code>
     * string destination_connection_profile_name = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The bytes for destinationConnectionProfileName.
     */
    public com.google.protobuf.ByteString getDestinationConnectionProfileNameBytes() {
      java.lang.Object ref = destinationConnectionProfileName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        destinationConnectionProfileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Destination connection profile identifier.
     * </pre>
     *
     * <code>
     * string destination_connection_profile_name = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The destinationConnectionProfileName to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationConnectionProfileName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      destinationConnectionProfileName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Destination connection profile identifier.
     * </pre>
     *
     * <code>
     * string destination_connection_profile_name = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDestinationConnectionProfileName() {
      destinationConnectionProfileName_ =
          getDefaultInstance().getDestinationConnectionProfileName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Destination connection profile identifier.
     * </pre>
     *
     * <code>
     * string destination_connection_profile_name = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The bytes for destinationConnectionProfileName to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationConnectionProfileNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      destinationConnectionProfileName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datastream.v1alpha1.GcsDestinationConfig,
            com.google.cloud.datastream.v1alpha1.GcsDestinationConfig.Builder,
            com.google.cloud.datastream.v1alpha1.GcsDestinationConfigOrBuilder>
        gcsDestinationConfigBuilder_;
    /**
     * <code>.google.cloud.datastream.v1alpha1.GcsDestinationConfig gcs_destination_config = 100;
     * </code>
     *
     * @return Whether the gcsDestinationConfig field is set.
     */
    @java.lang.Override
    public boolean hasGcsDestinationConfig() {
      return destinationStreamConfigCase_ == 100;
    }
    /**
     * <code>.google.cloud.datastream.v1alpha1.GcsDestinationConfig gcs_destination_config = 100;
     * </code>
     *
     * @return The gcsDestinationConfig.
     */
    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.GcsDestinationConfig getGcsDestinationConfig() {
      if (gcsDestinationConfigBuilder_ == null) {
        if (destinationStreamConfigCase_ == 100) {
          return (com.google.cloud.datastream.v1alpha1.GcsDestinationConfig)
              destinationStreamConfig_;
        }
        return com.google.cloud.datastream.v1alpha1.GcsDestinationConfig.getDefaultInstance();
      } else {
        if (destinationStreamConfigCase_ == 100) {
          return gcsDestinationConfigBuilder_.getMessage();
        }
        return com.google.cloud.datastream.v1alpha1.GcsDestinationConfig.getDefaultInstance();
      }
    }
    /**
     * <code>.google.cloud.datastream.v1alpha1.GcsDestinationConfig gcs_destination_config = 100;
     * </code>
     */
    public Builder setGcsDestinationConfig(
        com.google.cloud.datastream.v1alpha1.GcsDestinationConfig value) {
      if (gcsDestinationConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        destinationStreamConfig_ = value;
        onChanged();
      } else {
        gcsDestinationConfigBuilder_.setMessage(value);
      }
      destinationStreamConfigCase_ = 100;
      return this;
    }
    /**
     * <code>.google.cloud.datastream.v1alpha1.GcsDestinationConfig gcs_destination_config = 100;
     * </code>
     */
    public Builder setGcsDestinationConfig(
        com.google.cloud.datastream.v1alpha1.GcsDestinationConfig.Builder builderForValue) {
      if (gcsDestinationConfigBuilder_ == null) {
        destinationStreamConfig_ = builderForValue.build();
        onChanged();
      } else {
        gcsDestinationConfigBuilder_.setMessage(builderForValue.build());
      }
      destinationStreamConfigCase_ = 100;
      return this;
    }
    /**
     * <code>.google.cloud.datastream.v1alpha1.GcsDestinationConfig gcs_destination_config = 100;
     * </code>
     */
    public Builder mergeGcsDestinationConfig(
        com.google.cloud.datastream.v1alpha1.GcsDestinationConfig value) {
      if (gcsDestinationConfigBuilder_ == null) {
        if (destinationStreamConfigCase_ == 100
            && destinationStreamConfig_
                != com.google.cloud.datastream.v1alpha1.GcsDestinationConfig.getDefaultInstance()) {
          destinationStreamConfig_ =
              com.google.cloud.datastream.v1alpha1.GcsDestinationConfig.newBuilder(
                      (com.google.cloud.datastream.v1alpha1.GcsDestinationConfig)
                          destinationStreamConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          destinationStreamConfig_ = value;
        }
        onChanged();
      } else {
        if (destinationStreamConfigCase_ == 100) {
          gcsDestinationConfigBuilder_.mergeFrom(value);
        } else {
          gcsDestinationConfigBuilder_.setMessage(value);
        }
      }
      destinationStreamConfigCase_ = 100;
      return this;
    }
    /**
     * <code>.google.cloud.datastream.v1alpha1.GcsDestinationConfig gcs_destination_config = 100;
     * </code>
     */
    public Builder clearGcsDestinationConfig() {
      if (gcsDestinationConfigBuilder_ == null) {
        if (destinationStreamConfigCase_ == 100) {
          destinationStreamConfigCase_ = 0;
          destinationStreamConfig_ = null;
          onChanged();
        }
      } else {
        if (destinationStreamConfigCase_ == 100) {
          destinationStreamConfigCase_ = 0;
          destinationStreamConfig_ = null;
        }
        gcsDestinationConfigBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.google.cloud.datastream.v1alpha1.GcsDestinationConfig gcs_destination_config = 100;
     * </code>
     */
    public com.google.cloud.datastream.v1alpha1.GcsDestinationConfig.Builder
        getGcsDestinationConfigBuilder() {
      return getGcsDestinationConfigFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.cloud.datastream.v1alpha1.GcsDestinationConfig gcs_destination_config = 100;
     * </code>
     */
    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.GcsDestinationConfigOrBuilder
        getGcsDestinationConfigOrBuilder() {
      if ((destinationStreamConfigCase_ == 100) && (gcsDestinationConfigBuilder_ != null)) {
        return gcsDestinationConfigBuilder_.getMessageOrBuilder();
      } else {
        if (destinationStreamConfigCase_ == 100) {
          return (com.google.cloud.datastream.v1alpha1.GcsDestinationConfig)
              destinationStreamConfig_;
        }
        return com.google.cloud.datastream.v1alpha1.GcsDestinationConfig.getDefaultInstance();
      }
    }
    /**
     * <code>.google.cloud.datastream.v1alpha1.GcsDestinationConfig gcs_destination_config = 100;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datastream.v1alpha1.GcsDestinationConfig,
            com.google.cloud.datastream.v1alpha1.GcsDestinationConfig.Builder,
            com.google.cloud.datastream.v1alpha1.GcsDestinationConfigOrBuilder>
        getGcsDestinationConfigFieldBuilder() {
      if (gcsDestinationConfigBuilder_ == null) {
        if (!(destinationStreamConfigCase_ == 100)) {
          destinationStreamConfig_ =
              com.google.cloud.datastream.v1alpha1.GcsDestinationConfig.getDefaultInstance();
        }
        gcsDestinationConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datastream.v1alpha1.GcsDestinationConfig,
                com.google.cloud.datastream.v1alpha1.GcsDestinationConfig.Builder,
                com.google.cloud.datastream.v1alpha1.GcsDestinationConfigOrBuilder>(
                (com.google.cloud.datastream.v1alpha1.GcsDestinationConfig)
                    destinationStreamConfig_,
                getParentForChildren(),
                isClean());
        destinationStreamConfig_ = null;
      }
      destinationStreamConfigCase_ = 100;
      onChanged();
      return gcsDestinationConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datastream.v1alpha1.DestinationConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datastream.v1alpha1.DestinationConfig)
  private static final com.google.cloud.datastream.v1alpha1.DestinationConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datastream.v1alpha1.DestinationConfig();
  }

  public static com.google.cloud.datastream.v1alpha1.DestinationConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DestinationConfig> PARSER =
      new com.google.protobuf.AbstractParser<DestinationConfig>() {
        @java.lang.Override
        public DestinationConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<DestinationConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DestinationConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.DestinationConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
