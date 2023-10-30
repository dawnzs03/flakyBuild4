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
// source: google/analytics/admin/v1beta/analytics_admin.proto

package com.google.analytics.admin.v1beta;

/**
 *
 *
 * <pre>
 * Response message for ListConversionEvents RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1beta.ListConversionEventsResponse}
 */
public final class ListConversionEventsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1beta.ListConversionEventsResponse)
    ListConversionEventsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListConversionEventsResponse.newBuilder() to construct.
  private ListConversionEventsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListConversionEventsResponse() {
    conversionEvents_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListConversionEventsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1beta.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1beta_ListConversionEventsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1beta.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1beta_ListConversionEventsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1beta.ListConversionEventsResponse.class,
            com.google.analytics.admin.v1beta.ListConversionEventsResponse.Builder.class);
  }

  public static final int CONVERSION_EVENTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.analytics.admin.v1beta.ConversionEvent> conversionEvents_;
  /**
   *
   *
   * <pre>
   * The requested conversion events
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.admin.v1beta.ConversionEvent>
      getConversionEventsList() {
    return conversionEvents_;
  }
  /**
   *
   *
   * <pre>
   * The requested conversion events
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.admin.v1beta.ConversionEventOrBuilder>
      getConversionEventsOrBuilderList() {
    return conversionEvents_;
  }
  /**
   *
   *
   * <pre>
   * The requested conversion events
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
   */
  @java.lang.Override
  public int getConversionEventsCount() {
    return conversionEvents_.size();
  }
  /**
   *
   *
   * <pre>
   * The requested conversion events
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1beta.ConversionEvent getConversionEvents(int index) {
    return conversionEvents_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The requested conversion events
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1beta.ConversionEventOrBuilder getConversionEventsOrBuilder(
      int index) {
    return conversionEvents_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
    for (int i = 0; i < conversionEvents_.size(); i++) {
      output.writeMessage(1, conversionEvents_.get(i));
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
    for (int i = 0; i < conversionEvents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, conversionEvents_.get(i));
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
    if (!(obj instanceof com.google.analytics.admin.v1beta.ListConversionEventsResponse)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1beta.ListConversionEventsResponse other =
        (com.google.analytics.admin.v1beta.ListConversionEventsResponse) obj;

    if (!getConversionEventsList().equals(other.getConversionEventsList())) return false;
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
    if (getConversionEventsCount() > 0) {
      hash = (37 * hash) + CONVERSION_EVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getConversionEventsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1beta.ListConversionEventsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.ListConversionEventsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.ListConversionEventsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.ListConversionEventsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.ListConversionEventsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.ListConversionEventsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.ListConversionEventsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.ListConversionEventsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.ListConversionEventsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.ListConversionEventsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.ListConversionEventsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.ListConversionEventsResponse parseFrom(
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
      com.google.analytics.admin.v1beta.ListConversionEventsResponse prototype) {
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
   * Response message for ListConversionEvents RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1beta.ListConversionEventsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1beta.ListConversionEventsResponse)
      com.google.analytics.admin.v1beta.ListConversionEventsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1beta_ListConversionEventsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1beta_ListConversionEventsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1beta.ListConversionEventsResponse.class,
              com.google.analytics.admin.v1beta.ListConversionEventsResponse.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1beta.ListConversionEventsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (conversionEventsBuilder_ == null) {
        conversionEvents_ = java.util.Collections.emptyList();
      } else {
        conversionEvents_ = null;
        conversionEventsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1beta.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1beta_ListConversionEventsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.ListConversionEventsResponse
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1beta.ListConversionEventsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.ListConversionEventsResponse build() {
      com.google.analytics.admin.v1beta.ListConversionEventsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.ListConversionEventsResponse buildPartial() {
      com.google.analytics.admin.v1beta.ListConversionEventsResponse result =
          new com.google.analytics.admin.v1beta.ListConversionEventsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.analytics.admin.v1beta.ListConversionEventsResponse result) {
      if (conversionEventsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          conversionEvents_ = java.util.Collections.unmodifiableList(conversionEvents_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.conversionEvents_ = conversionEvents_;
      } else {
        result.conversionEvents_ = conversionEventsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.analytics.admin.v1beta.ListConversionEventsResponse result) {
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
      if (other instanceof com.google.analytics.admin.v1beta.ListConversionEventsResponse) {
        return mergeFrom((com.google.analytics.admin.v1beta.ListConversionEventsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1beta.ListConversionEventsResponse other) {
      if (other
          == com.google.analytics.admin.v1beta.ListConversionEventsResponse.getDefaultInstance())
        return this;
      if (conversionEventsBuilder_ == null) {
        if (!other.conversionEvents_.isEmpty()) {
          if (conversionEvents_.isEmpty()) {
            conversionEvents_ = other.conversionEvents_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConversionEventsIsMutable();
            conversionEvents_.addAll(other.conversionEvents_);
          }
          onChanged();
        }
      } else {
        if (!other.conversionEvents_.isEmpty()) {
          if (conversionEventsBuilder_.isEmpty()) {
            conversionEventsBuilder_.dispose();
            conversionEventsBuilder_ = null;
            conversionEvents_ = other.conversionEvents_;
            bitField0_ = (bitField0_ & ~0x00000001);
            conversionEventsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getConversionEventsFieldBuilder()
                    : null;
          } else {
            conversionEventsBuilder_.addAllMessages(other.conversionEvents_);
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
                com.google.analytics.admin.v1beta.ConversionEvent m =
                    input.readMessage(
                        com.google.analytics.admin.v1beta.ConversionEvent.parser(),
                        extensionRegistry);
                if (conversionEventsBuilder_ == null) {
                  ensureConversionEventsIsMutable();
                  conversionEvents_.add(m);
                } else {
                  conversionEventsBuilder_.addMessage(m);
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

    private java.util.List<com.google.analytics.admin.v1beta.ConversionEvent> conversionEvents_ =
        java.util.Collections.emptyList();

    private void ensureConversionEventsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        conversionEvents_ =
            new java.util.ArrayList<com.google.analytics.admin.v1beta.ConversionEvent>(
                conversionEvents_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1beta.ConversionEvent,
            com.google.analytics.admin.v1beta.ConversionEvent.Builder,
            com.google.analytics.admin.v1beta.ConversionEventOrBuilder>
        conversionEventsBuilder_;

    /**
     *
     *
     * <pre>
     * The requested conversion events
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1beta.ConversionEvent>
        getConversionEventsList() {
      if (conversionEventsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(conversionEvents_);
      } else {
        return conversionEventsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The requested conversion events
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
     */
    public int getConversionEventsCount() {
      if (conversionEventsBuilder_ == null) {
        return conversionEvents_.size();
      } else {
        return conversionEventsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The requested conversion events
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
     */
    public com.google.analytics.admin.v1beta.ConversionEvent getConversionEvents(int index) {
      if (conversionEventsBuilder_ == null) {
        return conversionEvents_.get(index);
      } else {
        return conversionEventsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The requested conversion events
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
     */
    public Builder setConversionEvents(
        int index, com.google.analytics.admin.v1beta.ConversionEvent value) {
      if (conversionEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConversionEventsIsMutable();
        conversionEvents_.set(index, value);
        onChanged();
      } else {
        conversionEventsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested conversion events
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
     */
    public Builder setConversionEvents(
        int index, com.google.analytics.admin.v1beta.ConversionEvent.Builder builderForValue) {
      if (conversionEventsBuilder_ == null) {
        ensureConversionEventsIsMutable();
        conversionEvents_.set(index, builderForValue.build());
        onChanged();
      } else {
        conversionEventsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested conversion events
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
     */
    public Builder addConversionEvents(com.google.analytics.admin.v1beta.ConversionEvent value) {
      if (conversionEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConversionEventsIsMutable();
        conversionEvents_.add(value);
        onChanged();
      } else {
        conversionEventsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested conversion events
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
     */
    public Builder addConversionEvents(
        int index, com.google.analytics.admin.v1beta.ConversionEvent value) {
      if (conversionEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConversionEventsIsMutable();
        conversionEvents_.add(index, value);
        onChanged();
      } else {
        conversionEventsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested conversion events
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
     */
    public Builder addConversionEvents(
        com.google.analytics.admin.v1beta.ConversionEvent.Builder builderForValue) {
      if (conversionEventsBuilder_ == null) {
        ensureConversionEventsIsMutable();
        conversionEvents_.add(builderForValue.build());
        onChanged();
      } else {
        conversionEventsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested conversion events
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
     */
    public Builder addConversionEvents(
        int index, com.google.analytics.admin.v1beta.ConversionEvent.Builder builderForValue) {
      if (conversionEventsBuilder_ == null) {
        ensureConversionEventsIsMutable();
        conversionEvents_.add(index, builderForValue.build());
        onChanged();
      } else {
        conversionEventsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested conversion events
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
     */
    public Builder addAllConversionEvents(
        java.lang.Iterable<? extends com.google.analytics.admin.v1beta.ConversionEvent> values) {
      if (conversionEventsBuilder_ == null) {
        ensureConversionEventsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, conversionEvents_);
        onChanged();
      } else {
        conversionEventsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested conversion events
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
     */
    public Builder clearConversionEvents() {
      if (conversionEventsBuilder_ == null) {
        conversionEvents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        conversionEventsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested conversion events
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
     */
    public Builder removeConversionEvents(int index) {
      if (conversionEventsBuilder_ == null) {
        ensureConversionEventsIsMutable();
        conversionEvents_.remove(index);
        onChanged();
      } else {
        conversionEventsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested conversion events
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
     */
    public com.google.analytics.admin.v1beta.ConversionEvent.Builder getConversionEventsBuilder(
        int index) {
      return getConversionEventsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The requested conversion events
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
     */
    public com.google.analytics.admin.v1beta.ConversionEventOrBuilder getConversionEventsOrBuilder(
        int index) {
      if (conversionEventsBuilder_ == null) {
        return conversionEvents_.get(index);
      } else {
        return conversionEventsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The requested conversion events
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
     */
    public java.util.List<? extends com.google.analytics.admin.v1beta.ConversionEventOrBuilder>
        getConversionEventsOrBuilderList() {
      if (conversionEventsBuilder_ != null) {
        return conversionEventsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(conversionEvents_);
      }
    }
    /**
     *
     *
     * <pre>
     * The requested conversion events
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
     */
    public com.google.analytics.admin.v1beta.ConversionEvent.Builder addConversionEventsBuilder() {
      return getConversionEventsFieldBuilder()
          .addBuilder(com.google.analytics.admin.v1beta.ConversionEvent.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The requested conversion events
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
     */
    public com.google.analytics.admin.v1beta.ConversionEvent.Builder addConversionEventsBuilder(
        int index) {
      return getConversionEventsFieldBuilder()
          .addBuilder(
              index, com.google.analytics.admin.v1beta.ConversionEvent.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The requested conversion events
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.ConversionEvent conversion_events = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1beta.ConversionEvent.Builder>
        getConversionEventsBuilderList() {
      return getConversionEventsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1beta.ConversionEvent,
            com.google.analytics.admin.v1beta.ConversionEvent.Builder,
            com.google.analytics.admin.v1beta.ConversionEventOrBuilder>
        getConversionEventsFieldBuilder() {
      if (conversionEventsBuilder_ == null) {
        conversionEventsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.admin.v1beta.ConversionEvent,
                com.google.analytics.admin.v1beta.ConversionEvent.Builder,
                com.google.analytics.admin.v1beta.ConversionEventOrBuilder>(
                conversionEvents_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        conversionEvents_ = null;
      }
      return conversionEventsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1beta.ListConversionEventsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1beta.ListConversionEventsResponse)
  private static final com.google.analytics.admin.v1beta.ListConversionEventsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1beta.ListConversionEventsResponse();
  }

  public static com.google.analytics.admin.v1beta.ListConversionEventsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListConversionEventsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListConversionEventsResponse>() {
        @java.lang.Override
        public ListConversionEventsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListConversionEventsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListConversionEventsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1beta.ListConversionEventsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
