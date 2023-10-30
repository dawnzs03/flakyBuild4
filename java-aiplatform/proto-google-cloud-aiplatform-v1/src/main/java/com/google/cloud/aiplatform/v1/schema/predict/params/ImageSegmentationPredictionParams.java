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
// source: google/cloud/aiplatform/v1/schema/predict/params/image_segmentation.proto

package com.google.cloud.aiplatform.v1.schema.predict.params;

/**
 *
 *
 * <pre>
 * Prediction model parameters for Image Segmentation.
 * </pre>
 *
 * Protobuf type {@code
 * google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams}
 */
public final class ImageSegmentationPredictionParams extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams)
    ImageSegmentationPredictionParamsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImageSegmentationPredictionParams.newBuilder() to construct.
  private ImageSegmentationPredictionParams(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImageSegmentationPredictionParams() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImageSegmentationPredictionParams();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.schema.predict.params
        .ImageSegmentationPredictionParamsProto
        .internal_static_google_cloud_aiplatform_v1_schema_predict_params_ImageSegmentationPredictionParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.schema.predict.params
        .ImageSegmentationPredictionParamsProto
        .internal_static_google_cloud_aiplatform_v1_schema_predict_params_ImageSegmentationPredictionParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams
                .class,
            com.google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams
                .Builder.class);
  }

  public static final int CONFIDENCE_THRESHOLD_FIELD_NUMBER = 1;
  private float confidenceThreshold_ = 0F;
  /**
   *
   *
   * <pre>
   * When the model predicts category of pixels of the image, it will only
   * provide predictions for pixels that it is at least this much confident
   * about. All other pixels will be classified as background. Default value is
   * 0.5.
   * </pre>
   *
   * <code>float confidence_threshold = 1;</code>
   *
   * @return The confidenceThreshold.
   */
  @java.lang.Override
  public float getConfidenceThreshold() {
    return confidenceThreshold_;
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
    if (java.lang.Float.floatToRawIntBits(confidenceThreshold_) != 0) {
      output.writeFloat(1, confidenceThreshold_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(confidenceThreshold_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(1, confidenceThreshold_);
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
        instanceof
        com.google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams other =
        (com.google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams)
            obj;

    if (java.lang.Float.floatToIntBits(getConfidenceThreshold())
        != java.lang.Float.floatToIntBits(other.getConfidenceThreshold())) return false;
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
    hash = (37 * hash) + CONFIDENCE_THRESHOLD_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getConfidenceThreshold());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .ImageSegmentationPredictionParams
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .ImageSegmentationPredictionParams
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .ImageSegmentationPredictionParams
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .ImageSegmentationPredictionParams
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .ImageSegmentationPredictionParams
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .ImageSegmentationPredictionParams
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .ImageSegmentationPredictionParams
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .ImageSegmentationPredictionParams
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .ImageSegmentationPredictionParams
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .ImageSegmentationPredictionParams
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .ImageSegmentationPredictionParams
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .ImageSegmentationPredictionParams
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
      com.google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams
          prototype) {
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
   * Prediction model parameters for Image Segmentation.
   * </pre>
   *
   * Protobuf type {@code
   * google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams)
      com.google.cloud.aiplatform.v1.schema.predict.params
          .ImageSegmentationPredictionParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.schema.predict.params
          .ImageSegmentationPredictionParamsProto
          .internal_static_google_cloud_aiplatform_v1_schema_predict_params_ImageSegmentationPredictionParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.schema.predict.params
          .ImageSegmentationPredictionParamsProto
          .internal_static_google_cloud_aiplatform_v1_schema_predict_params_ImageSegmentationPredictionParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams
                  .class,
              com.google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams
                  .Builder.class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      confidenceThreshold_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.schema.predict.params
          .ImageSegmentationPredictionParamsProto
          .internal_static_google_cloud_aiplatform_v1_schema_predict_params_ImageSegmentationPredictionParams_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams
        build() {
      com.google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams
          result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams
        buildPartial() {
      com.google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams
          result =
              new com.google.cloud.aiplatform.v1.schema.predict.params
                  .ImageSegmentationPredictionParams(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams
            result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.confidenceThreshold_ = confidenceThreshold_;
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
          instanceof
          com.google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams) {
        return mergeFrom(
            (com.google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams
            other) {
      if (other
          == com.google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams
              .getDefaultInstance()) return this;
      if (other.getConfidenceThreshold() != 0F) {
        setConfidenceThreshold(other.getConfidenceThreshold());
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
            case 13:
              {
                confidenceThreshold_ = input.readFloat();
                bitField0_ |= 0x00000001;
                break;
              } // case 13
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

    private float confidenceThreshold_;
    /**
     *
     *
     * <pre>
     * When the model predicts category of pixels of the image, it will only
     * provide predictions for pixels that it is at least this much confident
     * about. All other pixels will be classified as background. Default value is
     * 0.5.
     * </pre>
     *
     * <code>float confidence_threshold = 1;</code>
     *
     * @return The confidenceThreshold.
     */
    @java.lang.Override
    public float getConfidenceThreshold() {
      return confidenceThreshold_;
    }
    /**
     *
     *
     * <pre>
     * When the model predicts category of pixels of the image, it will only
     * provide predictions for pixels that it is at least this much confident
     * about. All other pixels will be classified as background. Default value is
     * 0.5.
     * </pre>
     *
     * <code>float confidence_threshold = 1;</code>
     *
     * @param value The confidenceThreshold to set.
     * @return This builder for chaining.
     */
    public Builder setConfidenceThreshold(float value) {

      confidenceThreshold_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * When the model predicts category of pixels of the image, it will only
     * provide predictions for pixels that it is at least this much confident
     * about. All other pixels will be classified as background. Default value is
     * 0.5.
     * </pre>
     *
     * <code>float confidence_threshold = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConfidenceThreshold() {
      bitField0_ = (bitField0_ & ~0x00000001);
      confidenceThreshold_ = 0F;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams)
  private static final com.google.cloud.aiplatform.v1.schema.predict.params
          .ImageSegmentationPredictionParams
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.aiplatform.v1.schema.predict.params
            .ImageSegmentationPredictionParams();
  }

  public static com.google.cloud.aiplatform.v1.schema.predict.params
          .ImageSegmentationPredictionParams
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageSegmentationPredictionParams> PARSER =
      new com.google.protobuf.AbstractParser<ImageSegmentationPredictionParams>() {
        @java.lang.Override
        public ImageSegmentationPredictionParams parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImageSegmentationPredictionParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageSegmentationPredictionParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.schema.predict.params.ImageSegmentationPredictionParams
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
