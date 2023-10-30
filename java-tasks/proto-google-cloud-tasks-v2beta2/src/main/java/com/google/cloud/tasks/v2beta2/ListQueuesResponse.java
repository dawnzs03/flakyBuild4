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
// source: google/cloud/tasks/v2beta2/cloudtasks.proto

package com.google.cloud.tasks.v2beta2;

/**
 *
 *
 * <pre>
 * Response message for
 * [ListQueues][google.cloud.tasks.v2beta2.CloudTasks.ListQueues].
 * </pre>
 *
 * Protobuf type {@code google.cloud.tasks.v2beta2.ListQueuesResponse}
 */
public final class ListQueuesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.tasks.v2beta2.ListQueuesResponse)
    ListQueuesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListQueuesResponse.newBuilder() to construct.
  private ListQueuesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListQueuesResponse() {
    queues_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListQueuesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.tasks.v2beta2.CloudTasksProto
        .internal_static_google_cloud_tasks_v2beta2_ListQueuesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tasks.v2beta2.CloudTasksProto
        .internal_static_google_cloud_tasks_v2beta2_ListQueuesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tasks.v2beta2.ListQueuesResponse.class,
            com.google.cloud.tasks.v2beta2.ListQueuesResponse.Builder.class);
  }

  public static final int QUEUES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.tasks.v2beta2.Queue> queues_;
  /**
   *
   *
   * <pre>
   * The list of queues.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.tasks.v2beta2.Queue> getQueuesList() {
    return queues_;
  }
  /**
   *
   *
   * <pre>
   * The list of queues.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.tasks.v2beta2.QueueOrBuilder>
      getQueuesOrBuilderList() {
    return queues_;
  }
  /**
   *
   *
   * <pre>
   * The list of queues.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
   */
  @java.lang.Override
  public int getQueuesCount() {
    return queues_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of queues.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.tasks.v2beta2.Queue getQueues(int index) {
    return queues_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of queues.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.tasks.v2beta2.QueueOrBuilder getQueuesOrBuilder(int index) {
    return queues_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   *
   * To return the next page of results, call
   * [ListQueues][google.cloud.tasks.v2beta2.CloudTasks.ListQueues] with this
   * value as the
   * [page_token][google.cloud.tasks.v2beta2.ListQueuesRequest.page_token].
   *
   * If the next_page_token is empty, there are no more results.
   *
   * The page token is valid for only 2 hours.
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
   * A token to retrieve next page of results.
   *
   * To return the next page of results, call
   * [ListQueues][google.cloud.tasks.v2beta2.CloudTasks.ListQueues] with this
   * value as the
   * [page_token][google.cloud.tasks.v2beta2.ListQueuesRequest.page_token].
   *
   * If the next_page_token is empty, there are no more results.
   *
   * The page token is valid for only 2 hours.
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
    for (int i = 0; i < queues_.size(); i++) {
      output.writeMessage(1, queues_.get(i));
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
    for (int i = 0; i < queues_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, queues_.get(i));
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
    if (!(obj instanceof com.google.cloud.tasks.v2beta2.ListQueuesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.tasks.v2beta2.ListQueuesResponse other =
        (com.google.cloud.tasks.v2beta2.ListQueuesResponse) obj;

    if (!getQueuesList().equals(other.getQueuesList())) return false;
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
    if (getQueuesCount() > 0) {
      hash = (37 * hash) + QUEUES_FIELD_NUMBER;
      hash = (53 * hash) + getQueuesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tasks.v2beta2.ListQueuesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta2.ListQueuesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.ListQueuesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta2.ListQueuesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.ListQueuesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta2.ListQueuesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.ListQueuesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta2.ListQueuesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.ListQueuesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta2.ListQueuesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta2.ListQueuesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta2.ListQueuesResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.tasks.v2beta2.ListQueuesResponse prototype) {
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
   * Response message for
   * [ListQueues][google.cloud.tasks.v2beta2.CloudTasks.ListQueues].
   * </pre>
   *
   * Protobuf type {@code google.cloud.tasks.v2beta2.ListQueuesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tasks.v2beta2.ListQueuesResponse)
      com.google.cloud.tasks.v2beta2.ListQueuesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.tasks.v2beta2.CloudTasksProto
          .internal_static_google_cloud_tasks_v2beta2_ListQueuesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tasks.v2beta2.CloudTasksProto
          .internal_static_google_cloud_tasks_v2beta2_ListQueuesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tasks.v2beta2.ListQueuesResponse.class,
              com.google.cloud.tasks.v2beta2.ListQueuesResponse.Builder.class);
    }

    // Construct using com.google.cloud.tasks.v2beta2.ListQueuesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (queuesBuilder_ == null) {
        queues_ = java.util.Collections.emptyList();
      } else {
        queues_ = null;
        queuesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.tasks.v2beta2.CloudTasksProto
          .internal_static_google_cloud_tasks_v2beta2_ListQueuesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.ListQueuesResponse getDefaultInstanceForType() {
      return com.google.cloud.tasks.v2beta2.ListQueuesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.ListQueuesResponse build() {
      com.google.cloud.tasks.v2beta2.ListQueuesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta2.ListQueuesResponse buildPartial() {
      com.google.cloud.tasks.v2beta2.ListQueuesResponse result =
          new com.google.cloud.tasks.v2beta2.ListQueuesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.tasks.v2beta2.ListQueuesResponse result) {
      if (queuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          queues_ = java.util.Collections.unmodifiableList(queues_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.queues_ = queues_;
      } else {
        result.queues_ = queuesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.tasks.v2beta2.ListQueuesResponse result) {
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
      if (other instanceof com.google.cloud.tasks.v2beta2.ListQueuesResponse) {
        return mergeFrom((com.google.cloud.tasks.v2beta2.ListQueuesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tasks.v2beta2.ListQueuesResponse other) {
      if (other == com.google.cloud.tasks.v2beta2.ListQueuesResponse.getDefaultInstance())
        return this;
      if (queuesBuilder_ == null) {
        if (!other.queues_.isEmpty()) {
          if (queues_.isEmpty()) {
            queues_ = other.queues_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureQueuesIsMutable();
            queues_.addAll(other.queues_);
          }
          onChanged();
        }
      } else {
        if (!other.queues_.isEmpty()) {
          if (queuesBuilder_.isEmpty()) {
            queuesBuilder_.dispose();
            queuesBuilder_ = null;
            queues_ = other.queues_;
            bitField0_ = (bitField0_ & ~0x00000001);
            queuesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getQueuesFieldBuilder()
                    : null;
          } else {
            queuesBuilder_.addAllMessages(other.queues_);
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
                com.google.cloud.tasks.v2beta2.Queue m =
                    input.readMessage(
                        com.google.cloud.tasks.v2beta2.Queue.parser(), extensionRegistry);
                if (queuesBuilder_ == null) {
                  ensureQueuesIsMutable();
                  queues_.add(m);
                } else {
                  queuesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.tasks.v2beta2.Queue> queues_ =
        java.util.Collections.emptyList();

    private void ensureQueuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        queues_ = new java.util.ArrayList<com.google.cloud.tasks.v2beta2.Queue>(queues_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.tasks.v2beta2.Queue,
            com.google.cloud.tasks.v2beta2.Queue.Builder,
            com.google.cloud.tasks.v2beta2.QueueOrBuilder>
        queuesBuilder_;

    /**
     *
     *
     * <pre>
     * The list of queues.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
     */
    public java.util.List<com.google.cloud.tasks.v2beta2.Queue> getQueuesList() {
      if (queuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(queues_);
      } else {
        return queuesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of queues.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
     */
    public int getQueuesCount() {
      if (queuesBuilder_ == null) {
        return queues_.size();
      } else {
        return queuesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of queues.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
     */
    public com.google.cloud.tasks.v2beta2.Queue getQueues(int index) {
      if (queuesBuilder_ == null) {
        return queues_.get(index);
      } else {
        return queuesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of queues.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
     */
    public Builder setQueues(int index, com.google.cloud.tasks.v2beta2.Queue value) {
      if (queuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureQueuesIsMutable();
        queues_.set(index, value);
        onChanged();
      } else {
        queuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of queues.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
     */
    public Builder setQueues(
        int index, com.google.cloud.tasks.v2beta2.Queue.Builder builderForValue) {
      if (queuesBuilder_ == null) {
        ensureQueuesIsMutable();
        queues_.set(index, builderForValue.build());
        onChanged();
      } else {
        queuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of queues.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
     */
    public Builder addQueues(com.google.cloud.tasks.v2beta2.Queue value) {
      if (queuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureQueuesIsMutable();
        queues_.add(value);
        onChanged();
      } else {
        queuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of queues.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
     */
    public Builder addQueues(int index, com.google.cloud.tasks.v2beta2.Queue value) {
      if (queuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureQueuesIsMutable();
        queues_.add(index, value);
        onChanged();
      } else {
        queuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of queues.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
     */
    public Builder addQueues(com.google.cloud.tasks.v2beta2.Queue.Builder builderForValue) {
      if (queuesBuilder_ == null) {
        ensureQueuesIsMutable();
        queues_.add(builderForValue.build());
        onChanged();
      } else {
        queuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of queues.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
     */
    public Builder addQueues(
        int index, com.google.cloud.tasks.v2beta2.Queue.Builder builderForValue) {
      if (queuesBuilder_ == null) {
        ensureQueuesIsMutable();
        queues_.add(index, builderForValue.build());
        onChanged();
      } else {
        queuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of queues.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
     */
    public Builder addAllQueues(
        java.lang.Iterable<? extends com.google.cloud.tasks.v2beta2.Queue> values) {
      if (queuesBuilder_ == null) {
        ensureQueuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, queues_);
        onChanged();
      } else {
        queuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of queues.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
     */
    public Builder clearQueues() {
      if (queuesBuilder_ == null) {
        queues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        queuesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of queues.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
     */
    public Builder removeQueues(int index) {
      if (queuesBuilder_ == null) {
        ensureQueuesIsMutable();
        queues_.remove(index);
        onChanged();
      } else {
        queuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of queues.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
     */
    public com.google.cloud.tasks.v2beta2.Queue.Builder getQueuesBuilder(int index) {
      return getQueuesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of queues.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
     */
    public com.google.cloud.tasks.v2beta2.QueueOrBuilder getQueuesOrBuilder(int index) {
      if (queuesBuilder_ == null) {
        return queues_.get(index);
      } else {
        return queuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of queues.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.tasks.v2beta2.QueueOrBuilder>
        getQueuesOrBuilderList() {
      if (queuesBuilder_ != null) {
        return queuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(queues_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of queues.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
     */
    public com.google.cloud.tasks.v2beta2.Queue.Builder addQueuesBuilder() {
      return getQueuesFieldBuilder()
          .addBuilder(com.google.cloud.tasks.v2beta2.Queue.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of queues.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
     */
    public com.google.cloud.tasks.v2beta2.Queue.Builder addQueuesBuilder(int index) {
      return getQueuesFieldBuilder()
          .addBuilder(index, com.google.cloud.tasks.v2beta2.Queue.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of queues.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta2.Queue queues = 1;</code>
     */
    public java.util.List<com.google.cloud.tasks.v2beta2.Queue.Builder> getQueuesBuilderList() {
      return getQueuesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.tasks.v2beta2.Queue,
            com.google.cloud.tasks.v2beta2.Queue.Builder,
            com.google.cloud.tasks.v2beta2.QueueOrBuilder>
        getQueuesFieldBuilder() {
      if (queuesBuilder_ == null) {
        queuesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.tasks.v2beta2.Queue,
                com.google.cloud.tasks.v2beta2.Queue.Builder,
                com.google.cloud.tasks.v2beta2.QueueOrBuilder>(
                queues_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        queues_ = null;
      }
      return queuesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     *
     * To return the next page of results, call
     * [ListQueues][google.cloud.tasks.v2beta2.CloudTasks.ListQueues] with this
     * value as the
     * [page_token][google.cloud.tasks.v2beta2.ListQueuesRequest.page_token].
     *
     * If the next_page_token is empty, there are no more results.
     *
     * The page token is valid for only 2 hours.
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
     * A token to retrieve next page of results.
     *
     * To return the next page of results, call
     * [ListQueues][google.cloud.tasks.v2beta2.CloudTasks.ListQueues] with this
     * value as the
     * [page_token][google.cloud.tasks.v2beta2.ListQueuesRequest.page_token].
     *
     * If the next_page_token is empty, there are no more results.
     *
     * The page token is valid for only 2 hours.
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
     * A token to retrieve next page of results.
     *
     * To return the next page of results, call
     * [ListQueues][google.cloud.tasks.v2beta2.CloudTasks.ListQueues] with this
     * value as the
     * [page_token][google.cloud.tasks.v2beta2.ListQueuesRequest.page_token].
     *
     * If the next_page_token is empty, there are no more results.
     *
     * The page token is valid for only 2 hours.
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
     * A token to retrieve next page of results.
     *
     * To return the next page of results, call
     * [ListQueues][google.cloud.tasks.v2beta2.CloudTasks.ListQueues] with this
     * value as the
     * [page_token][google.cloud.tasks.v2beta2.ListQueuesRequest.page_token].
     *
     * If the next_page_token is empty, there are no more results.
     *
     * The page token is valid for only 2 hours.
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
     * A token to retrieve next page of results.
     *
     * To return the next page of results, call
     * [ListQueues][google.cloud.tasks.v2beta2.CloudTasks.ListQueues] with this
     * value as the
     * [page_token][google.cloud.tasks.v2beta2.ListQueuesRequest.page_token].
     *
     * If the next_page_token is empty, there are no more results.
     *
     * The page token is valid for only 2 hours.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.tasks.v2beta2.ListQueuesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tasks.v2beta2.ListQueuesResponse)
  private static final com.google.cloud.tasks.v2beta2.ListQueuesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.tasks.v2beta2.ListQueuesResponse();
  }

  public static com.google.cloud.tasks.v2beta2.ListQueuesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListQueuesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListQueuesResponse>() {
        @java.lang.Override
        public ListQueuesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListQueuesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListQueuesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tasks.v2beta2.ListQueuesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
