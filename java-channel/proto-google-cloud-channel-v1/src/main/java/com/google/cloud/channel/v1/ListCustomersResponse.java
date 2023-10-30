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
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [CloudChannelService.ListCustomers][google.cloud.channel.v1.CloudChannelService.ListCustomers].
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.ListCustomersResponse}
 */
public final class ListCustomersResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.ListCustomersResponse)
    ListCustomersResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListCustomersResponse.newBuilder() to construct.
  private ListCustomersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListCustomersResponse() {
    customers_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListCustomersResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_ListCustomersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_ListCustomersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.ListCustomersResponse.class,
            com.google.cloud.channel.v1.ListCustomersResponse.Builder.class);
  }

  public static final int CUSTOMERS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.channel.v1.Customer> customers_;
  /**
   *
   *
   * <pre>
   * The customers belonging to a reseller or distributor.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.channel.v1.Customer> getCustomersList() {
    return customers_;
  }
  /**
   *
   *
   * <pre>
   * The customers belonging to a reseller or distributor.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.channel.v1.CustomerOrBuilder>
      getCustomersOrBuilderList() {
    return customers_;
  }
  /**
   *
   *
   * <pre>
   * The customers belonging to a reseller or distributor.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
   */
  @java.lang.Override
  public int getCustomersCount() {
    return customers_.size();
  }
  /**
   *
   *
   * <pre>
   * The customers belonging to a reseller or distributor.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.Customer getCustomers(int index) {
    return customers_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The customers belonging to a reseller or distributor.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.CustomerOrBuilder getCustomersOrBuilder(int index) {
    return customers_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to
   * [ListCustomersRequest.page_token][google.cloud.channel.v1.ListCustomersRequest.page_token]
   * to obtain that page.
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
   * A token to retrieve the next page of results.
   * Pass to
   * [ListCustomersRequest.page_token][google.cloud.channel.v1.ListCustomersRequest.page_token]
   * to obtain that page.
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
    for (int i = 0; i < customers_.size(); i++) {
      output.writeMessage(1, customers_.get(i));
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
    for (int i = 0; i < customers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, customers_.get(i));
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
    if (!(obj instanceof com.google.cloud.channel.v1.ListCustomersResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.ListCustomersResponse other =
        (com.google.cloud.channel.v1.ListCustomersResponse) obj;

    if (!getCustomersList().equals(other.getCustomersList())) return false;
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
    if (getCustomersCount() > 0) {
      hash = (37 * hash) + CUSTOMERS_FIELD_NUMBER;
      hash = (53 * hash) + getCustomersList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.ListCustomersResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ListCustomersResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListCustomersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ListCustomersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListCustomersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ListCustomersResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListCustomersResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ListCustomersResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListCustomersResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ListCustomersResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListCustomersResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ListCustomersResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.channel.v1.ListCustomersResponse prototype) {
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
   * [CloudChannelService.ListCustomers][google.cloud.channel.v1.CloudChannelService.ListCustomers].
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.ListCustomersResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.ListCustomersResponse)
      com.google.cloud.channel.v1.ListCustomersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_ListCustomersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_ListCustomersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.ListCustomersResponse.class,
              com.google.cloud.channel.v1.ListCustomersResponse.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.ListCustomersResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (customersBuilder_ == null) {
        customers_ = java.util.Collections.emptyList();
      } else {
        customers_ = null;
        customersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_ListCustomersResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListCustomersResponse getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.ListCustomersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListCustomersResponse build() {
      com.google.cloud.channel.v1.ListCustomersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListCustomersResponse buildPartial() {
      com.google.cloud.channel.v1.ListCustomersResponse result =
          new com.google.cloud.channel.v1.ListCustomersResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.channel.v1.ListCustomersResponse result) {
      if (customersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          customers_ = java.util.Collections.unmodifiableList(customers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.customers_ = customers_;
      } else {
        result.customers_ = customersBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.channel.v1.ListCustomersResponse result) {
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
      if (other instanceof com.google.cloud.channel.v1.ListCustomersResponse) {
        return mergeFrom((com.google.cloud.channel.v1.ListCustomersResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.ListCustomersResponse other) {
      if (other == com.google.cloud.channel.v1.ListCustomersResponse.getDefaultInstance())
        return this;
      if (customersBuilder_ == null) {
        if (!other.customers_.isEmpty()) {
          if (customers_.isEmpty()) {
            customers_ = other.customers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCustomersIsMutable();
            customers_.addAll(other.customers_);
          }
          onChanged();
        }
      } else {
        if (!other.customers_.isEmpty()) {
          if (customersBuilder_.isEmpty()) {
            customersBuilder_.dispose();
            customersBuilder_ = null;
            customers_ = other.customers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            customersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getCustomersFieldBuilder()
                    : null;
          } else {
            customersBuilder_.addAllMessages(other.customers_);
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
                com.google.cloud.channel.v1.Customer m =
                    input.readMessage(
                        com.google.cloud.channel.v1.Customer.parser(), extensionRegistry);
                if (customersBuilder_ == null) {
                  ensureCustomersIsMutable();
                  customers_.add(m);
                } else {
                  customersBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.channel.v1.Customer> customers_ =
        java.util.Collections.emptyList();

    private void ensureCustomersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        customers_ = new java.util.ArrayList<com.google.cloud.channel.v1.Customer>(customers_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.channel.v1.Customer,
            com.google.cloud.channel.v1.Customer.Builder,
            com.google.cloud.channel.v1.CustomerOrBuilder>
        customersBuilder_;

    /**
     *
     *
     * <pre>
     * The customers belonging to a reseller or distributor.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
     */
    public java.util.List<com.google.cloud.channel.v1.Customer> getCustomersList() {
      if (customersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(customers_);
      } else {
        return customersBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The customers belonging to a reseller or distributor.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
     */
    public int getCustomersCount() {
      if (customersBuilder_ == null) {
        return customers_.size();
      } else {
        return customersBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The customers belonging to a reseller or distributor.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
     */
    public com.google.cloud.channel.v1.Customer getCustomers(int index) {
      if (customersBuilder_ == null) {
        return customers_.get(index);
      } else {
        return customersBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The customers belonging to a reseller or distributor.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
     */
    public Builder setCustomers(int index, com.google.cloud.channel.v1.Customer value) {
      if (customersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCustomersIsMutable();
        customers_.set(index, value);
        onChanged();
      } else {
        customersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The customers belonging to a reseller or distributor.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
     */
    public Builder setCustomers(
        int index, com.google.cloud.channel.v1.Customer.Builder builderForValue) {
      if (customersBuilder_ == null) {
        ensureCustomersIsMutable();
        customers_.set(index, builderForValue.build());
        onChanged();
      } else {
        customersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The customers belonging to a reseller or distributor.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
     */
    public Builder addCustomers(com.google.cloud.channel.v1.Customer value) {
      if (customersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCustomersIsMutable();
        customers_.add(value);
        onChanged();
      } else {
        customersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The customers belonging to a reseller or distributor.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
     */
    public Builder addCustomers(int index, com.google.cloud.channel.v1.Customer value) {
      if (customersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCustomersIsMutable();
        customers_.add(index, value);
        onChanged();
      } else {
        customersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The customers belonging to a reseller or distributor.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
     */
    public Builder addCustomers(com.google.cloud.channel.v1.Customer.Builder builderForValue) {
      if (customersBuilder_ == null) {
        ensureCustomersIsMutable();
        customers_.add(builderForValue.build());
        onChanged();
      } else {
        customersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The customers belonging to a reseller or distributor.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
     */
    public Builder addCustomers(
        int index, com.google.cloud.channel.v1.Customer.Builder builderForValue) {
      if (customersBuilder_ == null) {
        ensureCustomersIsMutable();
        customers_.add(index, builderForValue.build());
        onChanged();
      } else {
        customersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The customers belonging to a reseller or distributor.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
     */
    public Builder addAllCustomers(
        java.lang.Iterable<? extends com.google.cloud.channel.v1.Customer> values) {
      if (customersBuilder_ == null) {
        ensureCustomersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, customers_);
        onChanged();
      } else {
        customersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The customers belonging to a reseller or distributor.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
     */
    public Builder clearCustomers() {
      if (customersBuilder_ == null) {
        customers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        customersBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The customers belonging to a reseller or distributor.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
     */
    public Builder removeCustomers(int index) {
      if (customersBuilder_ == null) {
        ensureCustomersIsMutable();
        customers_.remove(index);
        onChanged();
      } else {
        customersBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The customers belonging to a reseller or distributor.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
     */
    public com.google.cloud.channel.v1.Customer.Builder getCustomersBuilder(int index) {
      return getCustomersFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The customers belonging to a reseller or distributor.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
     */
    public com.google.cloud.channel.v1.CustomerOrBuilder getCustomersOrBuilder(int index) {
      if (customersBuilder_ == null) {
        return customers_.get(index);
      } else {
        return customersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The customers belonging to a reseller or distributor.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.channel.v1.CustomerOrBuilder>
        getCustomersOrBuilderList() {
      if (customersBuilder_ != null) {
        return customersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(customers_);
      }
    }
    /**
     *
     *
     * <pre>
     * The customers belonging to a reseller or distributor.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
     */
    public com.google.cloud.channel.v1.Customer.Builder addCustomersBuilder() {
      return getCustomersFieldBuilder()
          .addBuilder(com.google.cloud.channel.v1.Customer.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The customers belonging to a reseller or distributor.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
     */
    public com.google.cloud.channel.v1.Customer.Builder addCustomersBuilder(int index) {
      return getCustomersFieldBuilder()
          .addBuilder(index, com.google.cloud.channel.v1.Customer.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The customers belonging to a reseller or distributor.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.Customer customers = 1;</code>
     */
    public java.util.List<com.google.cloud.channel.v1.Customer.Builder> getCustomersBuilderList() {
      return getCustomersFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.channel.v1.Customer,
            com.google.cloud.channel.v1.Customer.Builder,
            com.google.cloud.channel.v1.CustomerOrBuilder>
        getCustomersFieldBuilder() {
      if (customersBuilder_ == null) {
        customersBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.channel.v1.Customer,
                com.google.cloud.channel.v1.Customer.Builder,
                com.google.cloud.channel.v1.CustomerOrBuilder>(
                customers_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        customers_ = null;
      }
      return customersBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to
     * [ListCustomersRequest.page_token][google.cloud.channel.v1.ListCustomersRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve the next page of results.
     * Pass to
     * [ListCustomersRequest.page_token][google.cloud.channel.v1.ListCustomersRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve the next page of results.
     * Pass to
     * [ListCustomersRequest.page_token][google.cloud.channel.v1.ListCustomersRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve the next page of results.
     * Pass to
     * [ListCustomersRequest.page_token][google.cloud.channel.v1.ListCustomersRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve the next page of results.
     * Pass to
     * [ListCustomersRequest.page_token][google.cloud.channel.v1.ListCustomersRequest.page_token]
     * to obtain that page.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.ListCustomersResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.ListCustomersResponse)
  private static final com.google.cloud.channel.v1.ListCustomersResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.ListCustomersResponse();
  }

  public static com.google.cloud.channel.v1.ListCustomersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCustomersResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListCustomersResponse>() {
        @java.lang.Override
        public ListCustomersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListCustomersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCustomersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.ListCustomersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
