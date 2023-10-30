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
// source: google/cloud/bigquery/dataexchange/v1beta1/dataexchange.proto

package com.google.cloud.bigquery.dataexchange.v1beta1;

/**
 *
 *
 * <pre>
 * Message for response to the list of Listings.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse}
 */
public final class ListListingsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse)
    ListListingsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListListingsResponse.newBuilder() to construct.
  private ListListingsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListListingsResponse() {
    listings_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListListingsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
        .internal_static_google_cloud_bigquery_dataexchange_v1beta1_ListListingsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
        .internal_static_google_cloud_bigquery_dataexchange_v1beta1_ListListingsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse.class,
            com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse.Builder.class);
  }

  public static final int LISTINGS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.bigquery.dataexchange.v1beta1.Listing> listings_;
  /**
   *
   *
   * <pre>
   * The list of Listing.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.bigquery.dataexchange.v1beta1.Listing> getListingsList() {
    return listings_;
  }
  /**
   *
   *
   * <pre>
   * The list of Listing.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.bigquery.dataexchange.v1beta1.ListingOrBuilder>
      getListingsOrBuilderList() {
    return listings_;
  }
  /**
   *
   *
   * <pre>
   * The list of Listing.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
   */
  @java.lang.Override
  public int getListingsCount() {
    return listings_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of Listing.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.dataexchange.v1beta1.Listing getListings(int index) {
    return listings_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of Listing.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.dataexchange.v1beta1.ListingOrBuilder getListingsOrBuilder(
      int index) {
    return listings_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token to request the next page of results.
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
   * A token to request the next page of results.
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
    for (int i = 0; i < listings_.size(); i++) {
      output.writeMessage(1, listings_.get(i));
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
    for (int i = 0; i < listings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, listings_.get(i));
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
    if (!(obj instanceof com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse other =
        (com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse) obj;

    if (!getListingsList().equals(other.getListingsList())) return false;
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
    if (getListingsCount() > 0) {
      hash = (37 * hash) + LISTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getListingsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse parseFrom(
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
      com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse prototype) {
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
   * Message for response to the list of Listings.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse)
      com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
          .internal_static_google_cloud_bigquery_dataexchange_v1beta1_ListListingsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
          .internal_static_google_cloud_bigquery_dataexchange_v1beta1_ListListingsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse.class,
              com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (listingsBuilder_ == null) {
        listings_ = java.util.Collections.emptyList();
      } else {
        listings_ = null;
        listingsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.dataexchange.v1beta1.DataExchangeProto
          .internal_static_google_cloud_bigquery_dataexchange_v1beta1_ListListingsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse build() {
      com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse buildPartial() {
      com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse result =
          new com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse result) {
      if (listingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          listings_ = java.util.Collections.unmodifiableList(listings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.listings_ = listings_;
      } else {
        result.listings_ = listingsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse result) {
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
      if (other instanceof com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse) {
        return mergeFrom(
            (com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse other) {
      if (other
          == com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse
              .getDefaultInstance()) return this;
      if (listingsBuilder_ == null) {
        if (!other.listings_.isEmpty()) {
          if (listings_.isEmpty()) {
            listings_ = other.listings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureListingsIsMutable();
            listings_.addAll(other.listings_);
          }
          onChanged();
        }
      } else {
        if (!other.listings_.isEmpty()) {
          if (listingsBuilder_.isEmpty()) {
            listingsBuilder_.dispose();
            listingsBuilder_ = null;
            listings_ = other.listings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            listingsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getListingsFieldBuilder()
                    : null;
          } else {
            listingsBuilder_.addAllMessages(other.listings_);
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
                com.google.cloud.bigquery.dataexchange.v1beta1.Listing m =
                    input.readMessage(
                        com.google.cloud.bigquery.dataexchange.v1beta1.Listing.parser(),
                        extensionRegistry);
                if (listingsBuilder_ == null) {
                  ensureListingsIsMutable();
                  listings_.add(m);
                } else {
                  listingsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.bigquery.dataexchange.v1beta1.Listing> listings_ =
        java.util.Collections.emptyList();

    private void ensureListingsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        listings_ =
            new java.util.ArrayList<com.google.cloud.bigquery.dataexchange.v1beta1.Listing>(
                listings_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.bigquery.dataexchange.v1beta1.Listing,
            com.google.cloud.bigquery.dataexchange.v1beta1.Listing.Builder,
            com.google.cloud.bigquery.dataexchange.v1beta1.ListingOrBuilder>
        listingsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of Listing.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
     */
    public java.util.List<com.google.cloud.bigquery.dataexchange.v1beta1.Listing>
        getListingsList() {
      if (listingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(listings_);
      } else {
        return listingsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Listing.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
     */
    public int getListingsCount() {
      if (listingsBuilder_ == null) {
        return listings_.size();
      } else {
        return listingsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Listing.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
     */
    public com.google.cloud.bigquery.dataexchange.v1beta1.Listing getListings(int index) {
      if (listingsBuilder_ == null) {
        return listings_.get(index);
      } else {
        return listingsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Listing.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
     */
    public Builder setListings(
        int index, com.google.cloud.bigquery.dataexchange.v1beta1.Listing value) {
      if (listingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListingsIsMutable();
        listings_.set(index, value);
        onChanged();
      } else {
        listingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Listing.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
     */
    public Builder setListings(
        int index, com.google.cloud.bigquery.dataexchange.v1beta1.Listing.Builder builderForValue) {
      if (listingsBuilder_ == null) {
        ensureListingsIsMutable();
        listings_.set(index, builderForValue.build());
        onChanged();
      } else {
        listingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Listing.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
     */
    public Builder addListings(com.google.cloud.bigquery.dataexchange.v1beta1.Listing value) {
      if (listingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListingsIsMutable();
        listings_.add(value);
        onChanged();
      } else {
        listingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Listing.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
     */
    public Builder addListings(
        int index, com.google.cloud.bigquery.dataexchange.v1beta1.Listing value) {
      if (listingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListingsIsMutable();
        listings_.add(index, value);
        onChanged();
      } else {
        listingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Listing.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
     */
    public Builder addListings(
        com.google.cloud.bigquery.dataexchange.v1beta1.Listing.Builder builderForValue) {
      if (listingsBuilder_ == null) {
        ensureListingsIsMutable();
        listings_.add(builderForValue.build());
        onChanged();
      } else {
        listingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Listing.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
     */
    public Builder addListings(
        int index, com.google.cloud.bigquery.dataexchange.v1beta1.Listing.Builder builderForValue) {
      if (listingsBuilder_ == null) {
        ensureListingsIsMutable();
        listings_.add(index, builderForValue.build());
        onChanged();
      } else {
        listingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Listing.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
     */
    public Builder addAllListings(
        java.lang.Iterable<? extends com.google.cloud.bigquery.dataexchange.v1beta1.Listing>
            values) {
      if (listingsBuilder_ == null) {
        ensureListingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, listings_);
        onChanged();
      } else {
        listingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Listing.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
     */
    public Builder clearListings() {
      if (listingsBuilder_ == null) {
        listings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        listingsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Listing.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
     */
    public Builder removeListings(int index) {
      if (listingsBuilder_ == null) {
        ensureListingsIsMutable();
        listings_.remove(index);
        onChanged();
      } else {
        listingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of Listing.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
     */
    public com.google.cloud.bigquery.dataexchange.v1beta1.Listing.Builder getListingsBuilder(
        int index) {
      return getListingsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of Listing.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
     */
    public com.google.cloud.bigquery.dataexchange.v1beta1.ListingOrBuilder getListingsOrBuilder(
        int index) {
      if (listingsBuilder_ == null) {
        return listings_.get(index);
      } else {
        return listingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Listing.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.bigquery.dataexchange.v1beta1.ListingOrBuilder>
        getListingsOrBuilderList() {
      if (listingsBuilder_ != null) {
        return listingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(listings_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of Listing.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
     */
    public com.google.cloud.bigquery.dataexchange.v1beta1.Listing.Builder addListingsBuilder() {
      return getListingsFieldBuilder()
          .addBuilder(com.google.cloud.bigquery.dataexchange.v1beta1.Listing.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of Listing.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
     */
    public com.google.cloud.bigquery.dataexchange.v1beta1.Listing.Builder addListingsBuilder(
        int index) {
      return getListingsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.bigquery.dataexchange.v1beta1.Listing.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of Listing.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.dataexchange.v1beta1.Listing listings = 1;</code>
     */
    public java.util.List<com.google.cloud.bigquery.dataexchange.v1beta1.Listing.Builder>
        getListingsBuilderList() {
      return getListingsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.bigquery.dataexchange.v1beta1.Listing,
            com.google.cloud.bigquery.dataexchange.v1beta1.Listing.Builder,
            com.google.cloud.bigquery.dataexchange.v1beta1.ListingOrBuilder>
        getListingsFieldBuilder() {
      if (listingsBuilder_ == null) {
        listingsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.bigquery.dataexchange.v1beta1.Listing,
                com.google.cloud.bigquery.dataexchange.v1beta1.Listing.Builder,
                com.google.cloud.bigquery.dataexchange.v1beta1.ListingOrBuilder>(
                listings_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        listings_ = null;
      }
      return listingsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to request the next page of results.
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
     * A token to request the next page of results.
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
     * A token to request the next page of results.
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
     * A token to request the next page of results.
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
     * A token to request the next page of results.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse)
  private static final com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse();
  }

  public static com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListListingsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListListingsResponse>() {
        @java.lang.Override
        public ListListingsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListListingsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListListingsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.dataexchange.v1beta1.ListListingsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
