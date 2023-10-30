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
// source: google/cloud/datalabeling/v1beta1/data_payloads.proto

package com.google.cloud.datalabeling.v1beta1;

/**
 *
 *
 * <pre>
 * Container of information of a video thumbnail.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.VideoThumbnail}
 */
public final class VideoThumbnail extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.VideoThumbnail)
    VideoThumbnailOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VideoThumbnail.newBuilder() to construct.
  private VideoThumbnail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VideoThumbnail() {
    thumbnail_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VideoThumbnail();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.DataPayloads
        .internal_static_google_cloud_datalabeling_v1beta1_VideoThumbnail_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.DataPayloads
        .internal_static_google_cloud_datalabeling_v1beta1_VideoThumbnail_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.VideoThumbnail.class,
            com.google.cloud.datalabeling.v1beta1.VideoThumbnail.Builder.class);
  }

  public static final int THUMBNAIL_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString thumbnail_ = com.google.protobuf.ByteString.EMPTY;
  /**
   *
   *
   * <pre>
   * A byte string of the video frame.
   * </pre>
   *
   * <code>bytes thumbnail = 1;</code>
   *
   * @return The thumbnail.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getThumbnail() {
    return thumbnail_;
  }

  public static final int TIME_OFFSET_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration timeOffset_;
  /**
   *
   *
   * <pre>
   * Time offset relative to the beginning of the video, corresponding to the
   * video frame where the thumbnail has been extracted from.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   *
   * @return Whether the timeOffset field is set.
   */
  @java.lang.Override
  public boolean hasTimeOffset() {
    return timeOffset_ != null;
  }
  /**
   *
   *
   * <pre>
   * Time offset relative to the beginning of the video, corresponding to the
   * video frame where the thumbnail has been extracted from.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   *
   * @return The timeOffset.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getTimeOffset() {
    return timeOffset_ == null ? com.google.protobuf.Duration.getDefaultInstance() : timeOffset_;
  }
  /**
   *
   *
   * <pre>
   * Time offset relative to the beginning of the video, corresponding to the
   * video frame where the thumbnail has been extracted from.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getTimeOffsetOrBuilder() {
    return timeOffset_ == null ? com.google.protobuf.Duration.getDefaultInstance() : timeOffset_;
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
    if (!thumbnail_.isEmpty()) {
      output.writeBytes(1, thumbnail_);
    }
    if (timeOffset_ != null) {
      output.writeMessage(2, getTimeOffset());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!thumbnail_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, thumbnail_);
    }
    if (timeOffset_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getTimeOffset());
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.VideoThumbnail)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.VideoThumbnail other =
        (com.google.cloud.datalabeling.v1beta1.VideoThumbnail) obj;

    if (!getThumbnail().equals(other.getThumbnail())) return false;
    if (hasTimeOffset() != other.hasTimeOffset()) return false;
    if (hasTimeOffset()) {
      if (!getTimeOffset().equals(other.getTimeOffset())) return false;
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
    hash = (37 * hash) + THUMBNAIL_FIELD_NUMBER;
    hash = (53 * hash) + getThumbnail().hashCode();
    if (hasTimeOffset()) {
      hash = (37 * hash) + TIME_OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + getTimeOffset().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoThumbnail parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoThumbnail parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoThumbnail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoThumbnail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoThumbnail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoThumbnail parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoThumbnail parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoThumbnail parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoThumbnail parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoThumbnail parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoThumbnail parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoThumbnail parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datalabeling.v1beta1.VideoThumbnail prototype) {
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
   * Container of information of a video thumbnail.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.VideoThumbnail}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.VideoThumbnail)
      com.google.cloud.datalabeling.v1beta1.VideoThumbnailOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.DataPayloads
          .internal_static_google_cloud_datalabeling_v1beta1_VideoThumbnail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.DataPayloads
          .internal_static_google_cloud_datalabeling_v1beta1_VideoThumbnail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.VideoThumbnail.class,
              com.google.cloud.datalabeling.v1beta1.VideoThumbnail.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.VideoThumbnail.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      thumbnail_ = com.google.protobuf.ByteString.EMPTY;
      timeOffset_ = null;
      if (timeOffsetBuilder_ != null) {
        timeOffsetBuilder_.dispose();
        timeOffsetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.DataPayloads
          .internal_static_google_cloud_datalabeling_v1beta1_VideoThumbnail_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.VideoThumbnail getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.VideoThumbnail.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.VideoThumbnail build() {
      com.google.cloud.datalabeling.v1beta1.VideoThumbnail result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.VideoThumbnail buildPartial() {
      com.google.cloud.datalabeling.v1beta1.VideoThumbnail result =
          new com.google.cloud.datalabeling.v1beta1.VideoThumbnail(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datalabeling.v1beta1.VideoThumbnail result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.thumbnail_ = thumbnail_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.timeOffset_ = timeOffsetBuilder_ == null ? timeOffset_ : timeOffsetBuilder_.build();
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
      if (other instanceof com.google.cloud.datalabeling.v1beta1.VideoThumbnail) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.VideoThumbnail) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.VideoThumbnail other) {
      if (other == com.google.cloud.datalabeling.v1beta1.VideoThumbnail.getDefaultInstance())
        return this;
      if (other.getThumbnail() != com.google.protobuf.ByteString.EMPTY) {
        setThumbnail(other.getThumbnail());
      }
      if (other.hasTimeOffset()) {
        mergeTimeOffset(other.getTimeOffset());
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
                thumbnail_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getTimeOffsetFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.protobuf.ByteString thumbnail_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * A byte string of the video frame.
     * </pre>
     *
     * <code>bytes thumbnail = 1;</code>
     *
     * @return The thumbnail.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getThumbnail() {
      return thumbnail_;
    }
    /**
     *
     *
     * <pre>
     * A byte string of the video frame.
     * </pre>
     *
     * <code>bytes thumbnail = 1;</code>
     *
     * @param value The thumbnail to set.
     * @return This builder for chaining.
     */
    public Builder setThumbnail(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      thumbnail_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A byte string of the video frame.
     * </pre>
     *
     * <code>bytes thumbnail = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearThumbnail() {
      bitField0_ = (bitField0_ & ~0x00000001);
      thumbnail_ = getDefaultInstance().getThumbnail();
      onChanged();
      return this;
    }

    private com.google.protobuf.Duration timeOffset_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        timeOffsetBuilder_;
    /**
     *
     *
     * <pre>
     * Time offset relative to the beginning of the video, corresponding to the
     * video frame where the thumbnail has been extracted from.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     *
     * @return Whether the timeOffset field is set.
     */
    public boolean hasTimeOffset() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Time offset relative to the beginning of the video, corresponding to the
     * video frame where the thumbnail has been extracted from.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     *
     * @return The timeOffset.
     */
    public com.google.protobuf.Duration getTimeOffset() {
      if (timeOffsetBuilder_ == null) {
        return timeOffset_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : timeOffset_;
      } else {
        return timeOffsetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Time offset relative to the beginning of the video, corresponding to the
     * video frame where the thumbnail has been extracted from.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public Builder setTimeOffset(com.google.protobuf.Duration value) {
      if (timeOffsetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timeOffset_ = value;
      } else {
        timeOffsetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Time offset relative to the beginning of the video, corresponding to the
     * video frame where the thumbnail has been extracted from.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public Builder setTimeOffset(com.google.protobuf.Duration.Builder builderForValue) {
      if (timeOffsetBuilder_ == null) {
        timeOffset_ = builderForValue.build();
      } else {
        timeOffsetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Time offset relative to the beginning of the video, corresponding to the
     * video frame where the thumbnail has been extracted from.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public Builder mergeTimeOffset(com.google.protobuf.Duration value) {
      if (timeOffsetBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && timeOffset_ != null
            && timeOffset_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getTimeOffsetBuilder().mergeFrom(value);
        } else {
          timeOffset_ = value;
        }
      } else {
        timeOffsetBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Time offset relative to the beginning of the video, corresponding to the
     * video frame where the thumbnail has been extracted from.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public Builder clearTimeOffset() {
      bitField0_ = (bitField0_ & ~0x00000002);
      timeOffset_ = null;
      if (timeOffsetBuilder_ != null) {
        timeOffsetBuilder_.dispose();
        timeOffsetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Time offset relative to the beginning of the video, corresponding to the
     * video frame where the thumbnail has been extracted from.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public com.google.protobuf.Duration.Builder getTimeOffsetBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTimeOffsetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Time offset relative to the beginning of the video, corresponding to the
     * video frame where the thumbnail has been extracted from.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public com.google.protobuf.DurationOrBuilder getTimeOffsetOrBuilder() {
      if (timeOffsetBuilder_ != null) {
        return timeOffsetBuilder_.getMessageOrBuilder();
      } else {
        return timeOffset_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : timeOffset_;
      }
    }
    /**
     *
     *
     * <pre>
     * Time offset relative to the beginning of the video, corresponding to the
     * video frame where the thumbnail has been extracted from.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getTimeOffsetFieldBuilder() {
      if (timeOffsetBuilder_ == null) {
        timeOffsetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getTimeOffset(), getParentForChildren(), isClean());
        timeOffset_ = null;
      }
      return timeOffsetBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.VideoThumbnail)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.VideoThumbnail)
  private static final com.google.cloud.datalabeling.v1beta1.VideoThumbnail DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.VideoThumbnail();
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoThumbnail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoThumbnail> PARSER =
      new com.google.protobuf.AbstractParser<VideoThumbnail>() {
        @java.lang.Override
        public VideoThumbnail parsePartialFrom(
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

  public static com.google.protobuf.Parser<VideoThumbnail> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoThumbnail> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.VideoThumbnail getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
