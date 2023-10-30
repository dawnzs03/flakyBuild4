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
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

/**
 *
 *
 * <pre>
 * Response message for the
 * [ListRecognizers][google.cloud.speech.v2.Speech.ListRecognizers] method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v2.ListRecognizersResponse}
 */
public final class ListRecognizersResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v2.ListRecognizersResponse)
    ListRecognizersResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListRecognizersResponse.newBuilder() to construct.
  private ListRecognizersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListRecognizersResponse() {
    recognizers_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListRecognizersResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.speech.v2.CloudSpeechProto
        .internal_static_google_cloud_speech_v2_ListRecognizersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v2.CloudSpeechProto
        .internal_static_google_cloud_speech_v2_ListRecognizersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v2.ListRecognizersResponse.class,
            com.google.cloud.speech.v2.ListRecognizersResponse.Builder.class);
  }

  public static final int RECOGNIZERS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.speech.v2.Recognizer> recognizers_;
  /**
   *
   *
   * <pre>
   * The list of requested Recognizers.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.speech.v2.Recognizer> getRecognizersList() {
    return recognizers_;
  }
  /**
   *
   *
   * <pre>
   * The list of requested Recognizers.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.speech.v2.RecognizerOrBuilder>
      getRecognizersOrBuilderList() {
    return recognizers_;
  }
  /**
   *
   *
   * <pre>
   * The list of requested Recognizers.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
   */
  @java.lang.Override
  public int getRecognizersCount() {
    return recognizers_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of requested Recognizers.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.speech.v2.Recognizer getRecognizers(int index) {
    return recognizers_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of requested Recognizers.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.speech.v2.RecognizerOrBuilder getRecognizersOrBuilder(int index) {
    return recognizers_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token, which can be sent as
   * [page_token][google.cloud.speech.v2.ListRecognizersRequest.page_token] to
   * retrieve the next page. If this field is omitted, there are no subsequent
   * pages. This token expires after 72 hours.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token, which can be sent as
   * [page_token][google.cloud.speech.v2.ListRecognizersRequest.page_token] to
   * retrieve the next page. If this field is omitted, there are no subsequent
   * pages. This token expires after 72 hours.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < recognizers_.size(); i++) {
      output.writeMessage(1, recognizers_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < recognizers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, recognizers_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.speech.v2.ListRecognizersResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v2.ListRecognizersResponse other =
        (com.google.cloud.speech.v2.ListRecognizersResponse) obj;

    if (!getRecognizersList().equals(other.getRecognizersList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getRecognizersCount() > 0) {
      hash = (37 * hash) + RECOGNIZERS_FIELD_NUMBER;
      hash = (53 * hash) + getRecognizersList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v2.ListRecognizersResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v2.ListRecognizersResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.ListRecognizersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v2.ListRecognizersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.ListRecognizersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v2.ListRecognizersResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.ListRecognizersResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.ListRecognizersResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.ListRecognizersResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.ListRecognizersResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.ListRecognizersResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.ListRecognizersResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.speech.v2.ListRecognizersResponse prototype) {
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
   * Response message for the
   * [ListRecognizers][google.cloud.speech.v2.Speech.ListRecognizers] method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v2.ListRecognizersResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v2.ListRecognizersResponse)
      com.google.cloud.speech.v2.ListRecognizersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.speech.v2.CloudSpeechProto
          .internal_static_google_cloud_speech_v2_ListRecognizersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v2.CloudSpeechProto
          .internal_static_google_cloud_speech_v2_ListRecognizersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v2.ListRecognizersResponse.class,
              com.google.cloud.speech.v2.ListRecognizersResponse.Builder.class);
    }

    // Construct using com.google.cloud.speech.v2.ListRecognizersResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (recognizersBuilder_ == null) {
        recognizers_ = java.util.Collections.emptyList();
      } else {
        recognizers_ = null;
        recognizersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.speech.v2.CloudSpeechProto
          .internal_static_google_cloud_speech_v2_ListRecognizersResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.ListRecognizersResponse getDefaultInstanceForType() {
      return com.google.cloud.speech.v2.ListRecognizersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.ListRecognizersResponse build() {
      com.google.cloud.speech.v2.ListRecognizersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.ListRecognizersResponse buildPartial() {
      com.google.cloud.speech.v2.ListRecognizersResponse result =
          new com.google.cloud.speech.v2.ListRecognizersResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.speech.v2.ListRecognizersResponse result) {
      if (recognizersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          recognizers_ = java.util.Collections.unmodifiableList(recognizers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.recognizers_ = recognizers_;
      } else {
        result.recognizers_ = recognizersBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.speech.v2.ListRecognizersResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.speech.v2.ListRecognizersResponse) {
        return mergeFrom((com.google.cloud.speech.v2.ListRecognizersResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v2.ListRecognizersResponse other) {
      if (other == com.google.cloud.speech.v2.ListRecognizersResponse.getDefaultInstance())
        return this;
      if (recognizersBuilder_ == null) {
        if (!other.recognizers_.isEmpty()) {
          if (recognizers_.isEmpty()) {
            recognizers_ = other.recognizers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRecognizersIsMutable();
            recognizers_.addAll(other.recognizers_);
          }
          onChanged();
        }
      } else {
        if (!other.recognizers_.isEmpty()) {
          if (recognizersBuilder_.isEmpty()) {
            recognizersBuilder_.dispose();
            recognizersBuilder_ = null;
            recognizers_ = other.recognizers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            recognizersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getRecognizersFieldBuilder()
                    : null;
          } else {
            recognizersBuilder_.addAllMessages(other.recognizers_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.cloud.speech.v2.Recognizer m =
                    input.readMessage(
                        com.google.cloud.speech.v2.Recognizer.parser(), extensionRegistry);
                if (recognizersBuilder_ == null) {
                  ensureRecognizersIsMutable();
                  recognizers_.add(m);
                } else {
                  recognizersBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.speech.v2.Recognizer> recognizers_ =
        java.util.Collections.emptyList();

    private void ensureRecognizersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        recognizers_ = new java.util.ArrayList<com.google.cloud.speech.v2.Recognizer>(recognizers_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.speech.v2.Recognizer,
            com.google.cloud.speech.v2.Recognizer.Builder,
            com.google.cloud.speech.v2.RecognizerOrBuilder>
        recognizersBuilder_;

    /**
     *
     *
     * <pre>
     * The list of requested Recognizers.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
     */
    public java.util.List<com.google.cloud.speech.v2.Recognizer> getRecognizersList() {
      if (recognizersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(recognizers_);
      } else {
        return recognizersBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of requested Recognizers.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
     */
    public int getRecognizersCount() {
      if (recognizersBuilder_ == null) {
        return recognizers_.size();
      } else {
        return recognizersBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of requested Recognizers.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
     */
    public com.google.cloud.speech.v2.Recognizer getRecognizers(int index) {
      if (recognizersBuilder_ == null) {
        return recognizers_.get(index);
      } else {
        return recognizersBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of requested Recognizers.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
     */
    public Builder setRecognizers(int index, com.google.cloud.speech.v2.Recognizer value) {
      if (recognizersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecognizersIsMutable();
        recognizers_.set(index, value);
        onChanged();
      } else {
        recognizersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested Recognizers.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
     */
    public Builder setRecognizers(
        int index, com.google.cloud.speech.v2.Recognizer.Builder builderForValue) {
      if (recognizersBuilder_ == null) {
        ensureRecognizersIsMutable();
        recognizers_.set(index, builderForValue.build());
        onChanged();
      } else {
        recognizersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested Recognizers.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
     */
    public Builder addRecognizers(com.google.cloud.speech.v2.Recognizer value) {
      if (recognizersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecognizersIsMutable();
        recognizers_.add(value);
        onChanged();
      } else {
        recognizersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested Recognizers.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
     */
    public Builder addRecognizers(int index, com.google.cloud.speech.v2.Recognizer value) {
      if (recognizersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecognizersIsMutable();
        recognizers_.add(index, value);
        onChanged();
      } else {
        recognizersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested Recognizers.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
     */
    public Builder addRecognizers(com.google.cloud.speech.v2.Recognizer.Builder builderForValue) {
      if (recognizersBuilder_ == null) {
        ensureRecognizersIsMutable();
        recognizers_.add(builderForValue.build());
        onChanged();
      } else {
        recognizersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested Recognizers.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
     */
    public Builder addRecognizers(
        int index, com.google.cloud.speech.v2.Recognizer.Builder builderForValue) {
      if (recognizersBuilder_ == null) {
        ensureRecognizersIsMutable();
        recognizers_.add(index, builderForValue.build());
        onChanged();
      } else {
        recognizersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested Recognizers.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
     */
    public Builder addAllRecognizers(
        java.lang.Iterable<? extends com.google.cloud.speech.v2.Recognizer> values) {
      if (recognizersBuilder_ == null) {
        ensureRecognizersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, recognizers_);
        onChanged();
      } else {
        recognizersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested Recognizers.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
     */
    public Builder clearRecognizers() {
      if (recognizersBuilder_ == null) {
        recognizers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        recognizersBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested Recognizers.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
     */
    public Builder removeRecognizers(int index) {
      if (recognizersBuilder_ == null) {
        ensureRecognizersIsMutable();
        recognizers_.remove(index);
        onChanged();
      } else {
        recognizersBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of requested Recognizers.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
     */
    public com.google.cloud.speech.v2.Recognizer.Builder getRecognizersBuilder(int index) {
      return getRecognizersFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of requested Recognizers.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
     */
    public com.google.cloud.speech.v2.RecognizerOrBuilder getRecognizersOrBuilder(int index) {
      if (recognizersBuilder_ == null) {
        return recognizers_.get(index);
      } else {
        return recognizersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of requested Recognizers.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.speech.v2.RecognizerOrBuilder>
        getRecognizersOrBuilderList() {
      if (recognizersBuilder_ != null) {
        return recognizersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(recognizers_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of requested Recognizers.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
     */
    public com.google.cloud.speech.v2.Recognizer.Builder addRecognizersBuilder() {
      return getRecognizersFieldBuilder()
          .addBuilder(com.google.cloud.speech.v2.Recognizer.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of requested Recognizers.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
     */
    public com.google.cloud.speech.v2.Recognizer.Builder addRecognizersBuilder(int index) {
      return getRecognizersFieldBuilder()
          .addBuilder(index, com.google.cloud.speech.v2.Recognizer.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of requested Recognizers.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v2.Recognizer recognizers = 1;</code>
     */
    public java.util.List<com.google.cloud.speech.v2.Recognizer.Builder>
        getRecognizersBuilderList() {
      return getRecognizersFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.speech.v2.Recognizer,
            com.google.cloud.speech.v2.Recognizer.Builder,
            com.google.cloud.speech.v2.RecognizerOrBuilder>
        getRecognizersFieldBuilder() {
      if (recognizersBuilder_ == null) {
        recognizersBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.speech.v2.Recognizer,
                com.google.cloud.speech.v2.Recognizer.Builder,
                com.google.cloud.speech.v2.RecognizerOrBuilder>(
                recognizers_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        recognizers_ = null;
      }
      return recognizersBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [page_token][google.cloud.speech.v2.ListRecognizersRequest.page_token] to
     * retrieve the next page. If this field is omitted, there are no subsequent
     * pages. This token expires after 72 hours.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [page_token][google.cloud.speech.v2.ListRecognizersRequest.page_token] to
     * retrieve the next page. If this field is omitted, there are no subsequent
     * pages. This token expires after 72 hours.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [page_token][google.cloud.speech.v2.ListRecognizersRequest.page_token] to
     * retrieve the next page. If this field is omitted, there are no subsequent
     * pages. This token expires after 72 hours.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [page_token][google.cloud.speech.v2.ListRecognizersRequest.page_token] to
     * retrieve the next page. If this field is omitted, there are no subsequent
     * pages. This token expires after 72 hours.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as
     * [page_token][google.cloud.speech.v2.ListRecognizersRequest.page_token] to
     * retrieve the next page. If this field is omitted, there are no subsequent
     * pages. This token expires after 72 hours.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v2.ListRecognizersResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v2.ListRecognizersResponse)
  private static final com.google.cloud.speech.v2.ListRecognizersResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v2.ListRecognizersResponse();
  }

  public static com.google.cloud.speech.v2.ListRecognizersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListRecognizersResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListRecognizersResponse>() {
        @java.lang.Override
        public ListRecognizersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListRecognizersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListRecognizersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v2.ListRecognizersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
