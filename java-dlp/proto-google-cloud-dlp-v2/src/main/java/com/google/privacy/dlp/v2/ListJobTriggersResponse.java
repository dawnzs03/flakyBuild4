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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Response message for ListJobTriggers.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.ListJobTriggersResponse}
 */
public final class ListJobTriggersResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.ListJobTriggersResponse)
    ListJobTriggersResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListJobTriggersResponse.newBuilder() to construct.
  private ListJobTriggersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListJobTriggersResponse() {
    jobTriggers_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListJobTriggersResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_ListJobTriggersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_ListJobTriggersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.ListJobTriggersResponse.class,
            com.google.privacy.dlp.v2.ListJobTriggersResponse.Builder.class);
  }

  public static final int JOB_TRIGGERS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.privacy.dlp.v2.JobTrigger> jobTriggers_;
  /**
   *
   *
   * <pre>
   * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.privacy.dlp.v2.JobTrigger> getJobTriggersList() {
    return jobTriggers_;
  }
  /**
   *
   *
   * <pre>
   * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.privacy.dlp.v2.JobTriggerOrBuilder>
      getJobTriggersOrBuilderList() {
    return jobTriggers_;
  }
  /**
   *
   *
   * <pre>
   * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
   */
  @java.lang.Override
  public int getJobTriggersCount() {
    return jobTriggers_.size();
  }
  /**
   *
   *
   * <pre>
   * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.JobTrigger getJobTriggers(int index) {
    return jobTriggers_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.JobTriggerOrBuilder getJobTriggersOrBuilder(int index) {
    return jobTriggers_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * If the next page is available then the next page token to be used
   * in following ListJobTriggers request.
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
   * If the next page is available then the next page token to be used
   * in following ListJobTriggers request.
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
    for (int i = 0; i < jobTriggers_.size(); i++) {
      output.writeMessage(1, jobTriggers_.get(i));
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
    for (int i = 0; i < jobTriggers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, jobTriggers_.get(i));
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
    if (!(obj instanceof com.google.privacy.dlp.v2.ListJobTriggersResponse)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.ListJobTriggersResponse other =
        (com.google.privacy.dlp.v2.ListJobTriggersResponse) obj;

    if (!getJobTriggersList().equals(other.getJobTriggersList())) return false;
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
    if (getJobTriggersCount() > 0) {
      hash = (37 * hash) + JOB_TRIGGERS_FIELD_NUMBER;
      hash = (53 * hash) + getJobTriggersList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.ListJobTriggersResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ListJobTriggersResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ListJobTriggersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ListJobTriggersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ListJobTriggersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ListJobTriggersResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ListJobTriggersResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ListJobTriggersResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ListJobTriggersResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ListJobTriggersResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ListJobTriggersResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ListJobTriggersResponse parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.ListJobTriggersResponse prototype) {
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
   * Response message for ListJobTriggers.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.ListJobTriggersResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.ListJobTriggersResponse)
      com.google.privacy.dlp.v2.ListJobTriggersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ListJobTriggersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ListJobTriggersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.ListJobTriggersResponse.class,
              com.google.privacy.dlp.v2.ListJobTriggersResponse.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.ListJobTriggersResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (jobTriggersBuilder_ == null) {
        jobTriggers_ = java.util.Collections.emptyList();
      } else {
        jobTriggers_ = null;
        jobTriggersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ListJobTriggersResponse_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ListJobTriggersResponse getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.ListJobTriggersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ListJobTriggersResponse build() {
      com.google.privacy.dlp.v2.ListJobTriggersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ListJobTriggersResponse buildPartial() {
      com.google.privacy.dlp.v2.ListJobTriggersResponse result =
          new com.google.privacy.dlp.v2.ListJobTriggersResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.privacy.dlp.v2.ListJobTriggersResponse result) {
      if (jobTriggersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          jobTriggers_ = java.util.Collections.unmodifiableList(jobTriggers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.jobTriggers_ = jobTriggers_;
      } else {
        result.jobTriggers_ = jobTriggersBuilder_.build();
      }
    }

    private void buildPartial0(com.google.privacy.dlp.v2.ListJobTriggersResponse result) {
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
      if (other instanceof com.google.privacy.dlp.v2.ListJobTriggersResponse) {
        return mergeFrom((com.google.privacy.dlp.v2.ListJobTriggersResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.ListJobTriggersResponse other) {
      if (other == com.google.privacy.dlp.v2.ListJobTriggersResponse.getDefaultInstance())
        return this;
      if (jobTriggersBuilder_ == null) {
        if (!other.jobTriggers_.isEmpty()) {
          if (jobTriggers_.isEmpty()) {
            jobTriggers_ = other.jobTriggers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureJobTriggersIsMutable();
            jobTriggers_.addAll(other.jobTriggers_);
          }
          onChanged();
        }
      } else {
        if (!other.jobTriggers_.isEmpty()) {
          if (jobTriggersBuilder_.isEmpty()) {
            jobTriggersBuilder_.dispose();
            jobTriggersBuilder_ = null;
            jobTriggers_ = other.jobTriggers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            jobTriggersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getJobTriggersFieldBuilder()
                    : null;
          } else {
            jobTriggersBuilder_.addAllMessages(other.jobTriggers_);
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
                com.google.privacy.dlp.v2.JobTrigger m =
                    input.readMessage(
                        com.google.privacy.dlp.v2.JobTrigger.parser(), extensionRegistry);
                if (jobTriggersBuilder_ == null) {
                  ensureJobTriggersIsMutable();
                  jobTriggers_.add(m);
                } else {
                  jobTriggersBuilder_.addMessage(m);
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

    private java.util.List<com.google.privacy.dlp.v2.JobTrigger> jobTriggers_ =
        java.util.Collections.emptyList();

    private void ensureJobTriggersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        jobTriggers_ = new java.util.ArrayList<com.google.privacy.dlp.v2.JobTrigger>(jobTriggers_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.privacy.dlp.v2.JobTrigger,
            com.google.privacy.dlp.v2.JobTrigger.Builder,
            com.google.privacy.dlp.v2.JobTriggerOrBuilder>
        jobTriggersBuilder_;

    /**
     *
     *
     * <pre>
     * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2.JobTrigger> getJobTriggersList() {
      if (jobTriggersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(jobTriggers_);
      } else {
        return jobTriggersBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
     */
    public int getJobTriggersCount() {
      if (jobTriggersBuilder_ == null) {
        return jobTriggers_.size();
      } else {
        return jobTriggersBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
     */
    public com.google.privacy.dlp.v2.JobTrigger getJobTriggers(int index) {
      if (jobTriggersBuilder_ == null) {
        return jobTriggers_.get(index);
      } else {
        return jobTriggersBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
     */
    public Builder setJobTriggers(int index, com.google.privacy.dlp.v2.JobTrigger value) {
      if (jobTriggersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobTriggersIsMutable();
        jobTriggers_.set(index, value);
        onChanged();
      } else {
        jobTriggersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
     */
    public Builder setJobTriggers(
        int index, com.google.privacy.dlp.v2.JobTrigger.Builder builderForValue) {
      if (jobTriggersBuilder_ == null) {
        ensureJobTriggersIsMutable();
        jobTriggers_.set(index, builderForValue.build());
        onChanged();
      } else {
        jobTriggersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
     */
    public Builder addJobTriggers(com.google.privacy.dlp.v2.JobTrigger value) {
      if (jobTriggersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobTriggersIsMutable();
        jobTriggers_.add(value);
        onChanged();
      } else {
        jobTriggersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
     */
    public Builder addJobTriggers(int index, com.google.privacy.dlp.v2.JobTrigger value) {
      if (jobTriggersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobTriggersIsMutable();
        jobTriggers_.add(index, value);
        onChanged();
      } else {
        jobTriggersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
     */
    public Builder addJobTriggers(com.google.privacy.dlp.v2.JobTrigger.Builder builderForValue) {
      if (jobTriggersBuilder_ == null) {
        ensureJobTriggersIsMutable();
        jobTriggers_.add(builderForValue.build());
        onChanged();
      } else {
        jobTriggersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
     */
    public Builder addJobTriggers(
        int index, com.google.privacy.dlp.v2.JobTrigger.Builder builderForValue) {
      if (jobTriggersBuilder_ == null) {
        ensureJobTriggersIsMutable();
        jobTriggers_.add(index, builderForValue.build());
        onChanged();
      } else {
        jobTriggersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
     */
    public Builder addAllJobTriggers(
        java.lang.Iterable<? extends com.google.privacy.dlp.v2.JobTrigger> values) {
      if (jobTriggersBuilder_ == null) {
        ensureJobTriggersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, jobTriggers_);
        onChanged();
      } else {
        jobTriggersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
     */
    public Builder clearJobTriggers() {
      if (jobTriggersBuilder_ == null) {
        jobTriggers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        jobTriggersBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
     */
    public Builder removeJobTriggers(int index) {
      if (jobTriggersBuilder_ == null) {
        ensureJobTriggersIsMutable();
        jobTriggers_.remove(index);
        onChanged();
      } else {
        jobTriggersBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
     */
    public com.google.privacy.dlp.v2.JobTrigger.Builder getJobTriggersBuilder(int index) {
      return getJobTriggersFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
     */
    public com.google.privacy.dlp.v2.JobTriggerOrBuilder getJobTriggersOrBuilder(int index) {
      if (jobTriggersBuilder_ == null) {
        return jobTriggers_.get(index);
      } else {
        return jobTriggersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
     */
    public java.util.List<? extends com.google.privacy.dlp.v2.JobTriggerOrBuilder>
        getJobTriggersOrBuilderList() {
      if (jobTriggersBuilder_ != null) {
        return jobTriggersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(jobTriggers_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
     */
    public com.google.privacy.dlp.v2.JobTrigger.Builder addJobTriggersBuilder() {
      return getJobTriggersFieldBuilder()
          .addBuilder(com.google.privacy.dlp.v2.JobTrigger.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
     */
    public com.google.privacy.dlp.v2.JobTrigger.Builder addJobTriggersBuilder(int index) {
      return getJobTriggersFieldBuilder()
          .addBuilder(index, com.google.privacy.dlp.v2.JobTrigger.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
     */
    public java.util.List<com.google.privacy.dlp.v2.JobTrigger.Builder>
        getJobTriggersBuilderList() {
      return getJobTriggersFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.privacy.dlp.v2.JobTrigger,
            com.google.privacy.dlp.v2.JobTrigger.Builder,
            com.google.privacy.dlp.v2.JobTriggerOrBuilder>
        getJobTriggersFieldBuilder() {
      if (jobTriggersBuilder_ == null) {
        jobTriggersBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.privacy.dlp.v2.JobTrigger,
                com.google.privacy.dlp.v2.JobTrigger.Builder,
                com.google.privacy.dlp.v2.JobTriggerOrBuilder>(
                jobTriggers_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        jobTriggers_ = null;
      }
      return jobTriggersBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * If the next page is available then the next page token to be used
     * in following ListJobTriggers request.
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
     * If the next page is available then the next page token to be used
     * in following ListJobTriggers request.
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
     * If the next page is available then the next page token to be used
     * in following ListJobTriggers request.
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
     * If the next page is available then the next page token to be used
     * in following ListJobTriggers request.
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
     * If the next page is available then the next page token to be used
     * in following ListJobTriggers request.
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.ListJobTriggersResponse)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.ListJobTriggersResponse)
  private static final com.google.privacy.dlp.v2.ListJobTriggersResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.ListJobTriggersResponse();
  }

  public static com.google.privacy.dlp.v2.ListJobTriggersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListJobTriggersResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListJobTriggersResponse>() {
        @java.lang.Override
        public ListJobTriggersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListJobTriggersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListJobTriggersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.ListJobTriggersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
