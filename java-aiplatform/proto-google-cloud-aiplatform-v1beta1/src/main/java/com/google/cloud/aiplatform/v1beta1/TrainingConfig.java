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
// source: google/cloud/aiplatform/v1beta1/data_labeling_job.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * CMLE training config. For every active learning labeling iteration, system
 * will train a machine learning model on CMLE. The trained model will be used
 * by data sampling algorithm to select DataItems.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.TrainingConfig}
 */
public final class TrainingConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.TrainingConfig)
    TrainingConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TrainingConfig.newBuilder() to construct.
  private TrainingConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TrainingConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TrainingConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.DataLabelingJobProto
        .internal_static_google_cloud_aiplatform_v1beta1_TrainingConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.DataLabelingJobProto
        .internal_static_google_cloud_aiplatform_v1beta1_TrainingConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.TrainingConfig.class,
            com.google.cloud.aiplatform.v1beta1.TrainingConfig.Builder.class);
  }

  public static final int TIMEOUT_TRAINING_MILLI_HOURS_FIELD_NUMBER = 1;
  private long timeoutTrainingMilliHours_ = 0L;
  /**
   *
   *
   * <pre>
   * The timeout hours for the CMLE training job, expressed in milli hours
   * i.e. 1,000 value in this field means 1 hour.
   * </pre>
   *
   * <code>int64 timeout_training_milli_hours = 1;</code>
   *
   * @return The timeoutTrainingMilliHours.
   */
  @java.lang.Override
  public long getTimeoutTrainingMilliHours() {
    return timeoutTrainingMilliHours_;
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
    if (timeoutTrainingMilliHours_ != 0L) {
      output.writeInt64(1, timeoutTrainingMilliHours_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timeoutTrainingMilliHours_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, timeoutTrainingMilliHours_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.TrainingConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.TrainingConfig other =
        (com.google.cloud.aiplatform.v1beta1.TrainingConfig) obj;

    if (getTimeoutTrainingMilliHours() != other.getTimeoutTrainingMilliHours()) return false;
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
    hash = (37 * hash) + TIMEOUT_TRAINING_MILLI_HOURS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getTimeoutTrainingMilliHours());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.TrainingConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.TrainingConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.TrainingConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.TrainingConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.TrainingConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.TrainingConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.TrainingConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.TrainingConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.TrainingConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.TrainingConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.TrainingConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.TrainingConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.TrainingConfig prototype) {
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
   * CMLE training config. For every active learning labeling iteration, system
   * will train a machine learning model on CMLE. The trained model will be used
   * by data sampling algorithm to select DataItems.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.TrainingConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.TrainingConfig)
      com.google.cloud.aiplatform.v1beta1.TrainingConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.DataLabelingJobProto
          .internal_static_google_cloud_aiplatform_v1beta1_TrainingConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.DataLabelingJobProto
          .internal_static_google_cloud_aiplatform_v1beta1_TrainingConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.TrainingConfig.class,
              com.google.cloud.aiplatform.v1beta1.TrainingConfig.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.TrainingConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      timeoutTrainingMilliHours_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.DataLabelingJobProto
          .internal_static_google_cloud_aiplatform_v1beta1_TrainingConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.TrainingConfig getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.TrainingConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.TrainingConfig build() {
      com.google.cloud.aiplatform.v1beta1.TrainingConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.TrainingConfig buildPartial() {
      com.google.cloud.aiplatform.v1beta1.TrainingConfig result =
          new com.google.cloud.aiplatform.v1beta1.TrainingConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.TrainingConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.timeoutTrainingMilliHours_ = timeoutTrainingMilliHours_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.TrainingConfig) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.TrainingConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.TrainingConfig other) {
      if (other == com.google.cloud.aiplatform.v1beta1.TrainingConfig.getDefaultInstance())
        return this;
      if (other.getTimeoutTrainingMilliHours() != 0L) {
        setTimeoutTrainingMilliHours(other.getTimeoutTrainingMilliHours());
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
                timeoutTrainingMilliHours_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

    private long timeoutTrainingMilliHours_;
    /**
     *
     *
     * <pre>
     * The timeout hours for the CMLE training job, expressed in milli hours
     * i.e. 1,000 value in this field means 1 hour.
     * </pre>
     *
     * <code>int64 timeout_training_milli_hours = 1;</code>
     *
     * @return The timeoutTrainingMilliHours.
     */
    @java.lang.Override
    public long getTimeoutTrainingMilliHours() {
      return timeoutTrainingMilliHours_;
    }
    /**
     *
     *
     * <pre>
     * The timeout hours for the CMLE training job, expressed in milli hours
     * i.e. 1,000 value in this field means 1 hour.
     * </pre>
     *
     * <code>int64 timeout_training_milli_hours = 1;</code>
     *
     * @param value The timeoutTrainingMilliHours to set.
     * @return This builder for chaining.
     */
    public Builder setTimeoutTrainingMilliHours(long value) {

      timeoutTrainingMilliHours_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The timeout hours for the CMLE training job, expressed in milli hours
     * i.e. 1,000 value in this field means 1 hour.
     * </pre>
     *
     * <code>int64 timeout_training_milli_hours = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTimeoutTrainingMilliHours() {
      bitField0_ = (bitField0_ & ~0x00000001);
      timeoutTrainingMilliHours_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.TrainingConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.TrainingConfig)
  private static final com.google.cloud.aiplatform.v1beta1.TrainingConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.TrainingConfig();
  }

  public static com.google.cloud.aiplatform.v1beta1.TrainingConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrainingConfig> PARSER =
      new com.google.protobuf.AbstractParser<TrainingConfig>() {
        @java.lang.Override
        public TrainingConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<TrainingConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrainingConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.TrainingConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
