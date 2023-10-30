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
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

/**
 *
 *
 * <pre>
 * The list of all clusters in a project.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.ListClustersResponse}
 */
public final class ListClustersResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.ListClustersResponse)
    ListClustersResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListClustersResponse.newBuilder() to construct.
  private ListClustersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListClustersResponse() {
    clusters_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListClustersResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1.ClustersProto
        .internal_static_google_cloud_dataproc_v1_ListClustersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.ClustersProto
        .internal_static_google_cloud_dataproc_v1_ListClustersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.ListClustersResponse.class,
            com.google.cloud.dataproc.v1.ListClustersResponse.Builder.class);
  }

  public static final int CLUSTERS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dataproc.v1.Cluster> clusters_;
  /**
   *
   *
   * <pre>
   * Output only. The clusters in the project.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dataproc.v1.Cluster> getClustersList() {
    return clusters_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The clusters in the project.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dataproc.v1.ClusterOrBuilder>
      getClustersOrBuilderList() {
    return clusters_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The clusters in the project.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public int getClustersCount() {
    return clusters_.size();
  }
  /**
   *
   *
   * <pre>
   * Output only. The clusters in the project.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.Cluster getClusters(int index) {
    return clusters_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Output only. The clusters in the project.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.ClusterOrBuilder getClustersOrBuilder(int index) {
    return clusters_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * Output only. This token is included in the response if there are more
   * results to fetch. To fetch additional results, provide this value as the
   * `page_token` in a subsequent `ListClustersRequest`.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
   * Output only. This token is included in the response if there are more
   * results to fetch. To fetch additional results, provide this value as the
   * `page_token` in a subsequent `ListClustersRequest`.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
    for (int i = 0; i < clusters_.size(); i++) {
      output.writeMessage(1, clusters_.get(i));
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
    for (int i = 0; i < clusters_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, clusters_.get(i));
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.ListClustersResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.ListClustersResponse other =
        (com.google.cloud.dataproc.v1.ListClustersResponse) obj;

    if (!getClustersList().equals(other.getClustersList())) return false;
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
    if (getClustersCount() > 0) {
      hash = (37 * hash) + CLUSTERS_FIELD_NUMBER;
      hash = (53 * hash) + getClustersList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.ListClustersResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.ListClustersResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ListClustersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.ListClustersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ListClustersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.ListClustersResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ListClustersResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.ListClustersResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ListClustersResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.ListClustersResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.ListClustersResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.ListClustersResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataproc.v1.ListClustersResponse prototype) {
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
   * The list of all clusters in a project.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.ListClustersResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.ListClustersResponse)
      com.google.cloud.dataproc.v1.ListClustersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_ListClustersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_ListClustersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.ListClustersResponse.class,
              com.google.cloud.dataproc.v1.ListClustersResponse.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.ListClustersResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (clustersBuilder_ == null) {
        clusters_ = java.util.Collections.emptyList();
      } else {
        clusters_ = null;
        clustersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_ListClustersResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.ListClustersResponse getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.ListClustersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.ListClustersResponse build() {
      com.google.cloud.dataproc.v1.ListClustersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.ListClustersResponse buildPartial() {
      com.google.cloud.dataproc.v1.ListClustersResponse result =
          new com.google.cloud.dataproc.v1.ListClustersResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.dataproc.v1.ListClustersResponse result) {
      if (clustersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          clusters_ = java.util.Collections.unmodifiableList(clusters_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.clusters_ = clusters_;
      } else {
        result.clusters_ = clustersBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dataproc.v1.ListClustersResponse result) {
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
      if (other instanceof com.google.cloud.dataproc.v1.ListClustersResponse) {
        return mergeFrom((com.google.cloud.dataproc.v1.ListClustersResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.ListClustersResponse other) {
      if (other == com.google.cloud.dataproc.v1.ListClustersResponse.getDefaultInstance())
        return this;
      if (clustersBuilder_ == null) {
        if (!other.clusters_.isEmpty()) {
          if (clusters_.isEmpty()) {
            clusters_ = other.clusters_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureClustersIsMutable();
            clusters_.addAll(other.clusters_);
          }
          onChanged();
        }
      } else {
        if (!other.clusters_.isEmpty()) {
          if (clustersBuilder_.isEmpty()) {
            clustersBuilder_.dispose();
            clustersBuilder_ = null;
            clusters_ = other.clusters_;
            bitField0_ = (bitField0_ & ~0x00000001);
            clustersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getClustersFieldBuilder()
                    : null;
          } else {
            clustersBuilder_.addAllMessages(other.clusters_);
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
                com.google.cloud.dataproc.v1.Cluster m =
                    input.readMessage(
                        com.google.cloud.dataproc.v1.Cluster.parser(), extensionRegistry);
                if (clustersBuilder_ == null) {
                  ensureClustersIsMutable();
                  clusters_.add(m);
                } else {
                  clustersBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.dataproc.v1.Cluster> clusters_ =
        java.util.Collections.emptyList();

    private void ensureClustersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        clusters_ = new java.util.ArrayList<com.google.cloud.dataproc.v1.Cluster>(clusters_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dataproc.v1.Cluster,
            com.google.cloud.dataproc.v1.Cluster.Builder,
            com.google.cloud.dataproc.v1.ClusterOrBuilder>
        clustersBuilder_;

    /**
     *
     *
     * <pre>
     * Output only. The clusters in the project.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<com.google.cloud.dataproc.v1.Cluster> getClustersList() {
      if (clustersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(clusters_);
      } else {
        return clustersBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The clusters in the project.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public int getClustersCount() {
      if (clustersBuilder_ == null) {
        return clusters_.size();
      } else {
        return clustersBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The clusters in the project.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.dataproc.v1.Cluster getClusters(int index) {
      if (clustersBuilder_ == null) {
        return clusters_.get(index);
      } else {
        return clustersBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The clusters in the project.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setClusters(int index, com.google.cloud.dataproc.v1.Cluster value) {
      if (clustersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClustersIsMutable();
        clusters_.set(index, value);
        onChanged();
      } else {
        clustersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The clusters in the project.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setClusters(
        int index, com.google.cloud.dataproc.v1.Cluster.Builder builderForValue) {
      if (clustersBuilder_ == null) {
        ensureClustersIsMutable();
        clusters_.set(index, builderForValue.build());
        onChanged();
      } else {
        clustersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The clusters in the project.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addClusters(com.google.cloud.dataproc.v1.Cluster value) {
      if (clustersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClustersIsMutable();
        clusters_.add(value);
        onChanged();
      } else {
        clustersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The clusters in the project.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addClusters(int index, com.google.cloud.dataproc.v1.Cluster value) {
      if (clustersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClustersIsMutable();
        clusters_.add(index, value);
        onChanged();
      } else {
        clustersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The clusters in the project.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addClusters(com.google.cloud.dataproc.v1.Cluster.Builder builderForValue) {
      if (clustersBuilder_ == null) {
        ensureClustersIsMutable();
        clusters_.add(builderForValue.build());
        onChanged();
      } else {
        clustersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The clusters in the project.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addClusters(
        int index, com.google.cloud.dataproc.v1.Cluster.Builder builderForValue) {
      if (clustersBuilder_ == null) {
        ensureClustersIsMutable();
        clusters_.add(index, builderForValue.build());
        onChanged();
      } else {
        clustersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The clusters in the project.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addAllClusters(
        java.lang.Iterable<? extends com.google.cloud.dataproc.v1.Cluster> values) {
      if (clustersBuilder_ == null) {
        ensureClustersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, clusters_);
        onChanged();
      } else {
        clustersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The clusters in the project.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearClusters() {
      if (clustersBuilder_ == null) {
        clusters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        clustersBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The clusters in the project.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder removeClusters(int index) {
      if (clustersBuilder_ == null) {
        ensureClustersIsMutable();
        clusters_.remove(index);
        onChanged();
      } else {
        clustersBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The clusters in the project.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.dataproc.v1.Cluster.Builder getClustersBuilder(int index) {
      return getClustersFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Output only. The clusters in the project.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.dataproc.v1.ClusterOrBuilder getClustersOrBuilder(int index) {
      if (clustersBuilder_ == null) {
        return clusters_.get(index);
      } else {
        return clustersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The clusters in the project.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<? extends com.google.cloud.dataproc.v1.ClusterOrBuilder>
        getClustersOrBuilderList() {
      if (clustersBuilder_ != null) {
        return clustersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(clusters_);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The clusters in the project.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.dataproc.v1.Cluster.Builder addClustersBuilder() {
      return getClustersFieldBuilder()
          .addBuilder(com.google.cloud.dataproc.v1.Cluster.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Output only. The clusters in the project.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.dataproc.v1.Cluster.Builder addClustersBuilder(int index) {
      return getClustersFieldBuilder()
          .addBuilder(index, com.google.cloud.dataproc.v1.Cluster.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Output only. The clusters in the project.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.Cluster clusters = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<com.google.cloud.dataproc.v1.Cluster.Builder> getClustersBuilderList() {
      return getClustersFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dataproc.v1.Cluster,
            com.google.cloud.dataproc.v1.Cluster.Builder,
            com.google.cloud.dataproc.v1.ClusterOrBuilder>
        getClustersFieldBuilder() {
      if (clustersBuilder_ == null) {
        clustersBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.dataproc.v1.Cluster,
                com.google.cloud.dataproc.v1.Cluster.Builder,
                com.google.cloud.dataproc.v1.ClusterOrBuilder>(
                clusters_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        clusters_ = null;
      }
      return clustersBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Output only. This token is included in the response if there are more
     * results to fetch. To fetch additional results, provide this value as the
     * `page_token` in a subsequent `ListClustersRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. This token is included in the response if there are more
     * results to fetch. To fetch additional results, provide this value as the
     * `page_token` in a subsequent `ListClustersRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. This token is included in the response if there are more
     * results to fetch. To fetch additional results, provide this value as the
     * `page_token` in a subsequent `ListClustersRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. This token is included in the response if there are more
     * results to fetch. To fetch additional results, provide this value as the
     * `page_token` in a subsequent `ListClustersRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. This token is included in the response if there are more
     * results to fetch. To fetch additional results, provide this value as the
     * `page_token` in a subsequent `ListClustersRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.ListClustersResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.ListClustersResponse)
  private static final com.google.cloud.dataproc.v1.ListClustersResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.ListClustersResponse();
  }

  public static com.google.cloud.dataproc.v1.ListClustersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListClustersResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListClustersResponse>() {
        @java.lang.Override
        public ListClustersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListClustersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListClustersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.ListClustersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
