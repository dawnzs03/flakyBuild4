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
// source: google/cloud/vision/v1p4beta1/image_annotator.proto

package com.google.cloud.vision.v1p4beta1;

/**
 *
 *
 * <pre>
 * The desired output location and metadata.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p4beta1.OutputConfig}
 */
public final class OutputConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p4beta1.OutputConfig)
    OutputConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use OutputConfig.newBuilder() to construct.
  private OutputConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private OutputConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new OutputConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1p4beta1_OutputConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1p4beta1_OutputConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p4beta1.OutputConfig.class,
            com.google.cloud.vision.v1p4beta1.OutputConfig.Builder.class);
  }

  public static final int GCS_DESTINATION_FIELD_NUMBER = 1;
  private com.google.cloud.vision.v1p4beta1.GcsDestination gcsDestination_;
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to write the output(s) to.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.GcsDestination gcs_destination = 1;</code>
   *
   * @return Whether the gcsDestination field is set.
   */
  @java.lang.Override
  public boolean hasGcsDestination() {
    return gcsDestination_ != null;
  }
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to write the output(s) to.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.GcsDestination gcs_destination = 1;</code>
   *
   * @return The gcsDestination.
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.GcsDestination getGcsDestination() {
    return gcsDestination_ == null
        ? com.google.cloud.vision.v1p4beta1.GcsDestination.getDefaultInstance()
        : gcsDestination_;
  }
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to write the output(s) to.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.GcsDestination gcs_destination = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.GcsDestinationOrBuilder getGcsDestinationOrBuilder() {
    return gcsDestination_ == null
        ? com.google.cloud.vision.v1p4beta1.GcsDestination.getDefaultInstance()
        : gcsDestination_;
  }

  public static final int BATCH_SIZE_FIELD_NUMBER = 2;
  private int batchSize_ = 0;
  /**
   *
   *
   * <pre>
   * The max number of response protos to put into each output JSON file on
   * Google Cloud Storage.
   * The valid range is [1, 100]. If not specified, the default value is 20.
   *
   * For example, for one pdf file with 100 pages, 100 response protos will
   * be generated. If `batch_size` = 20, then 5 json files each
   * containing 20 response protos will be written under the prefix
   * `gcs_destination`.`uri`.
   *
   * Currently, batch_size only applies to GcsDestination, with potential future
   * support for other output configurations.
   * </pre>
   *
   * <code>int32 batch_size = 2;</code>
   *
   * @return The batchSize.
   */
  @java.lang.Override
  public int getBatchSize() {
    return batchSize_;
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
    if (gcsDestination_ != null) {
      output.writeMessage(1, getGcsDestination());
    }
    if (batchSize_ != 0) {
      output.writeInt32(2, batchSize_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gcsDestination_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getGcsDestination());
    }
    if (batchSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, batchSize_);
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
    if (!(obj instanceof com.google.cloud.vision.v1p4beta1.OutputConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p4beta1.OutputConfig other =
        (com.google.cloud.vision.v1p4beta1.OutputConfig) obj;

    if (hasGcsDestination() != other.hasGcsDestination()) return false;
    if (hasGcsDestination()) {
      if (!getGcsDestination().equals(other.getGcsDestination())) return false;
    }
    if (getBatchSize() != other.getBatchSize()) return false;
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
    if (hasGcsDestination()) {
      hash = (37 * hash) + GCS_DESTINATION_FIELD_NUMBER;
      hash = (53 * hash) + getGcsDestination().hashCode();
    }
    hash = (37 * hash) + BATCH_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getBatchSize();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p4beta1.OutputConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.OutputConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.OutputConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.OutputConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.OutputConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.OutputConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.OutputConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.OutputConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.OutputConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.OutputConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.OutputConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.OutputConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vision.v1p4beta1.OutputConfig prototype) {
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
   * The desired output location and metadata.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p4beta1.OutputConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p4beta1.OutputConfig)
      com.google.cloud.vision.v1p4beta1.OutputConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p4beta1_OutputConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p4beta1_OutputConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p4beta1.OutputConfig.class,
              com.google.cloud.vision.v1p4beta1.OutputConfig.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p4beta1.OutputConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      gcsDestination_ = null;
      if (gcsDestinationBuilder_ != null) {
        gcsDestinationBuilder_.dispose();
        gcsDestinationBuilder_ = null;
      }
      batchSize_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p4beta1_OutputConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.OutputConfig getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p4beta1.OutputConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.OutputConfig build() {
      com.google.cloud.vision.v1p4beta1.OutputConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.OutputConfig buildPartial() {
      com.google.cloud.vision.v1p4beta1.OutputConfig result =
          new com.google.cloud.vision.v1p4beta1.OutputConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vision.v1p4beta1.OutputConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.gcsDestination_ =
            gcsDestinationBuilder_ == null ? gcsDestination_ : gcsDestinationBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.batchSize_ = batchSize_;
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
      if (other instanceof com.google.cloud.vision.v1p4beta1.OutputConfig) {
        return mergeFrom((com.google.cloud.vision.v1p4beta1.OutputConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p4beta1.OutputConfig other) {
      if (other == com.google.cloud.vision.v1p4beta1.OutputConfig.getDefaultInstance()) return this;
      if (other.hasGcsDestination()) {
        mergeGcsDestination(other.getGcsDestination());
      }
      if (other.getBatchSize() != 0) {
        setBatchSize(other.getBatchSize());
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
                input.readMessage(getGcsDestinationFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                batchSize_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private com.google.cloud.vision.v1p4beta1.GcsDestination gcsDestination_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1p4beta1.GcsDestination,
            com.google.cloud.vision.v1p4beta1.GcsDestination.Builder,
            com.google.cloud.vision.v1p4beta1.GcsDestinationOrBuilder>
        gcsDestinationBuilder_;
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to write the output(s) to.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.GcsDestination gcs_destination = 1;</code>
     *
     * @return Whether the gcsDestination field is set.
     */
    public boolean hasGcsDestination() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to write the output(s) to.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.GcsDestination gcs_destination = 1;</code>
     *
     * @return The gcsDestination.
     */
    public com.google.cloud.vision.v1p4beta1.GcsDestination getGcsDestination() {
      if (gcsDestinationBuilder_ == null) {
        return gcsDestination_ == null
            ? com.google.cloud.vision.v1p4beta1.GcsDestination.getDefaultInstance()
            : gcsDestination_;
      } else {
        return gcsDestinationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to write the output(s) to.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.GcsDestination gcs_destination = 1;</code>
     */
    public Builder setGcsDestination(com.google.cloud.vision.v1p4beta1.GcsDestination value) {
      if (gcsDestinationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gcsDestination_ = value;
      } else {
        gcsDestinationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to write the output(s) to.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.GcsDestination gcs_destination = 1;</code>
     */
    public Builder setGcsDestination(
        com.google.cloud.vision.v1p4beta1.GcsDestination.Builder builderForValue) {
      if (gcsDestinationBuilder_ == null) {
        gcsDestination_ = builderForValue.build();
      } else {
        gcsDestinationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to write the output(s) to.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.GcsDestination gcs_destination = 1;</code>
     */
    public Builder mergeGcsDestination(com.google.cloud.vision.v1p4beta1.GcsDestination value) {
      if (gcsDestinationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && gcsDestination_ != null
            && gcsDestination_
                != com.google.cloud.vision.v1p4beta1.GcsDestination.getDefaultInstance()) {
          getGcsDestinationBuilder().mergeFrom(value);
        } else {
          gcsDestination_ = value;
        }
      } else {
        gcsDestinationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to write the output(s) to.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.GcsDestination gcs_destination = 1;</code>
     */
    public Builder clearGcsDestination() {
      bitField0_ = (bitField0_ & ~0x00000001);
      gcsDestination_ = null;
      if (gcsDestinationBuilder_ != null) {
        gcsDestinationBuilder_.dispose();
        gcsDestinationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to write the output(s) to.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.GcsDestination gcs_destination = 1;</code>
     */
    public com.google.cloud.vision.v1p4beta1.GcsDestination.Builder getGcsDestinationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getGcsDestinationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to write the output(s) to.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.GcsDestination gcs_destination = 1;</code>
     */
    public com.google.cloud.vision.v1p4beta1.GcsDestinationOrBuilder getGcsDestinationOrBuilder() {
      if (gcsDestinationBuilder_ != null) {
        return gcsDestinationBuilder_.getMessageOrBuilder();
      } else {
        return gcsDestination_ == null
            ? com.google.cloud.vision.v1p4beta1.GcsDestination.getDefaultInstance()
            : gcsDestination_;
      }
    }
    /**
     *
     *
     * <pre>
     * The Google Cloud Storage location to write the output(s) to.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.GcsDestination gcs_destination = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1p4beta1.GcsDestination,
            com.google.cloud.vision.v1p4beta1.GcsDestination.Builder,
            com.google.cloud.vision.v1p4beta1.GcsDestinationOrBuilder>
        getGcsDestinationFieldBuilder() {
      if (gcsDestinationBuilder_ == null) {
        gcsDestinationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.vision.v1p4beta1.GcsDestination,
                com.google.cloud.vision.v1p4beta1.GcsDestination.Builder,
                com.google.cloud.vision.v1p4beta1.GcsDestinationOrBuilder>(
                getGcsDestination(), getParentForChildren(), isClean());
        gcsDestination_ = null;
      }
      return gcsDestinationBuilder_;
    }

    private int batchSize_;
    /**
     *
     *
     * <pre>
     * The max number of response protos to put into each output JSON file on
     * Google Cloud Storage.
     * The valid range is [1, 100]. If not specified, the default value is 20.
     *
     * For example, for one pdf file with 100 pages, 100 response protos will
     * be generated. If `batch_size` = 20, then 5 json files each
     * containing 20 response protos will be written under the prefix
     * `gcs_destination`.`uri`.
     *
     * Currently, batch_size only applies to GcsDestination, with potential future
     * support for other output configurations.
     * </pre>
     *
     * <code>int32 batch_size = 2;</code>
     *
     * @return The batchSize.
     */
    @java.lang.Override
    public int getBatchSize() {
      return batchSize_;
    }
    /**
     *
     *
     * <pre>
     * The max number of response protos to put into each output JSON file on
     * Google Cloud Storage.
     * The valid range is [1, 100]. If not specified, the default value is 20.
     *
     * For example, for one pdf file with 100 pages, 100 response protos will
     * be generated. If `batch_size` = 20, then 5 json files each
     * containing 20 response protos will be written under the prefix
     * `gcs_destination`.`uri`.
     *
     * Currently, batch_size only applies to GcsDestination, with potential future
     * support for other output configurations.
     * </pre>
     *
     * <code>int32 batch_size = 2;</code>
     *
     * @param value The batchSize to set.
     * @return This builder for chaining.
     */
    public Builder setBatchSize(int value) {

      batchSize_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The max number of response protos to put into each output JSON file on
     * Google Cloud Storage.
     * The valid range is [1, 100]. If not specified, the default value is 20.
     *
     * For example, for one pdf file with 100 pages, 100 response protos will
     * be generated. If `batch_size` = 20, then 5 json files each
     * containing 20 response protos will be written under the prefix
     * `gcs_destination`.`uri`.
     *
     * Currently, batch_size only applies to GcsDestination, with potential future
     * support for other output configurations.
     * </pre>
     *
     * <code>int32 batch_size = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBatchSize() {
      bitField0_ = (bitField0_ & ~0x00000002);
      batchSize_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p4beta1.OutputConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p4beta1.OutputConfig)
  private static final com.google.cloud.vision.v1p4beta1.OutputConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p4beta1.OutputConfig();
  }

  public static com.google.cloud.vision.v1p4beta1.OutputConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OutputConfig> PARSER =
      new com.google.protobuf.AbstractParser<OutputConfig>() {
        @java.lang.Override
        public OutputConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<OutputConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OutputConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.OutputConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
