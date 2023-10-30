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
// source: google/cloud/apigeeconnect/v1/connection.proto

package com.google.cloud.apigeeconnect.v1;

/** Protobuf type {@code google.cloud.apigeeconnect.v1.Connection} */
public final class Connection extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.apigeeconnect.v1.Connection)
    ConnectionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Connection.newBuilder() to construct.
  private Connection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Connection() {
    endpoint_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Connection();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.apigeeconnect.v1.ConnectionProto
        .internal_static_google_cloud_apigeeconnect_v1_Connection_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.apigeeconnect.v1.ConnectionProto
        .internal_static_google_cloud_apigeeconnect_v1_Connection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.apigeeconnect.v1.Connection.class,
            com.google.cloud.apigeeconnect.v1.Connection.Builder.class);
  }

  public static final int ENDPOINT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object endpoint_ = "";
  /**
   *
   *
   * <pre>
   * The endpoint that the connection is made against.
   * Format: `projects/{project_number}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>string endpoint = 1;</code>
   *
   * @return The endpoint.
   */
  @java.lang.Override
  public java.lang.String getEndpoint() {
    java.lang.Object ref = endpoint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endpoint_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The endpoint that the connection is made against.
   * Format: `projects/{project_number}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>string endpoint = 1;</code>
   *
   * @return The bytes for endpoint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEndpointBytes() {
    java.lang.Object ref = endpoint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      endpoint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLUSTER_FIELD_NUMBER = 2;
  private com.google.cloud.apigeeconnect.v1.Cluster cluster_;
  /**
   *
   *
   * <pre>
   * Cluster information.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.Cluster cluster = 2;</code>
   *
   * @return Whether the cluster field is set.
   */
  @java.lang.Override
  public boolean hasCluster() {
    return cluster_ != null;
  }
  /**
   *
   *
   * <pre>
   * Cluster information.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.Cluster cluster = 2;</code>
   *
   * @return The cluster.
   */
  @java.lang.Override
  public com.google.cloud.apigeeconnect.v1.Cluster getCluster() {
    return cluster_ == null
        ? com.google.cloud.apigeeconnect.v1.Cluster.getDefaultInstance()
        : cluster_;
  }
  /**
   *
   *
   * <pre>
   * Cluster information.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.Cluster cluster = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.apigeeconnect.v1.ClusterOrBuilder getClusterOrBuilder() {
    return cluster_ == null
        ? com.google.cloud.apigeeconnect.v1.Cluster.getDefaultInstance()
        : cluster_;
  }

  public static final int STREAM_COUNT_FIELD_NUMBER = 3;
  private int streamCount_ = 0;
  /**
   *
   *
   * <pre>
   * The count of streams.
   * </pre>
   *
   * <code>int32 stream_count = 3;</code>
   *
   * @return The streamCount.
   */
  @java.lang.Override
  public int getStreamCount() {
    return streamCount_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endpoint_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, endpoint_);
    }
    if (cluster_ != null) {
      output.writeMessage(2, getCluster());
    }
    if (streamCount_ != 0) {
      output.writeInt32(3, streamCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endpoint_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, endpoint_);
    }
    if (cluster_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getCluster());
    }
    if (streamCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, streamCount_);
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
    if (!(obj instanceof com.google.cloud.apigeeconnect.v1.Connection)) {
      return super.equals(obj);
    }
    com.google.cloud.apigeeconnect.v1.Connection other =
        (com.google.cloud.apigeeconnect.v1.Connection) obj;

    if (!getEndpoint().equals(other.getEndpoint())) return false;
    if (hasCluster() != other.hasCluster()) return false;
    if (hasCluster()) {
      if (!getCluster().equals(other.getCluster())) return false;
    }
    if (getStreamCount() != other.getStreamCount()) return false;
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
    hash = (37 * hash) + ENDPOINT_FIELD_NUMBER;
    hash = (53 * hash) + getEndpoint().hashCode();
    if (hasCluster()) {
      hash = (37 * hash) + CLUSTER_FIELD_NUMBER;
      hash = (53 * hash) + getCluster().hashCode();
    }
    hash = (37 * hash) + STREAM_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getStreamCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.apigeeconnect.v1.Connection parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apigeeconnect.v1.Connection parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apigeeconnect.v1.Connection parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apigeeconnect.v1.Connection parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apigeeconnect.v1.Connection parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apigeeconnect.v1.Connection parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apigeeconnect.v1.Connection parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apigeeconnect.v1.Connection parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apigeeconnect.v1.Connection parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.apigeeconnect.v1.Connection parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apigeeconnect.v1.Connection parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apigeeconnect.v1.Connection parseFrom(
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

  public static Builder newBuilder(com.google.cloud.apigeeconnect.v1.Connection prototype) {
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
  /** Protobuf type {@code google.cloud.apigeeconnect.v1.Connection} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.apigeeconnect.v1.Connection)
      com.google.cloud.apigeeconnect.v1.ConnectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.apigeeconnect.v1.ConnectionProto
          .internal_static_google_cloud_apigeeconnect_v1_Connection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.apigeeconnect.v1.ConnectionProto
          .internal_static_google_cloud_apigeeconnect_v1_Connection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.apigeeconnect.v1.Connection.class,
              com.google.cloud.apigeeconnect.v1.Connection.Builder.class);
    }

    // Construct using com.google.cloud.apigeeconnect.v1.Connection.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      endpoint_ = "";
      cluster_ = null;
      if (clusterBuilder_ != null) {
        clusterBuilder_.dispose();
        clusterBuilder_ = null;
      }
      streamCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.apigeeconnect.v1.ConnectionProto
          .internal_static_google_cloud_apigeeconnect_v1_Connection_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.apigeeconnect.v1.Connection getDefaultInstanceForType() {
      return com.google.cloud.apigeeconnect.v1.Connection.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.apigeeconnect.v1.Connection build() {
      com.google.cloud.apigeeconnect.v1.Connection result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.apigeeconnect.v1.Connection buildPartial() {
      com.google.cloud.apigeeconnect.v1.Connection result =
          new com.google.cloud.apigeeconnect.v1.Connection(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.apigeeconnect.v1.Connection result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.endpoint_ = endpoint_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cluster_ = clusterBuilder_ == null ? cluster_ : clusterBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.streamCount_ = streamCount_;
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
      if (other instanceof com.google.cloud.apigeeconnect.v1.Connection) {
        return mergeFrom((com.google.cloud.apigeeconnect.v1.Connection) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.apigeeconnect.v1.Connection other) {
      if (other == com.google.cloud.apigeeconnect.v1.Connection.getDefaultInstance()) return this;
      if (!other.getEndpoint().isEmpty()) {
        endpoint_ = other.endpoint_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCluster()) {
        mergeCluster(other.getCluster());
      }
      if (other.getStreamCount() != 0) {
        setStreamCount(other.getStreamCount());
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
                endpoint_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getClusterFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                streamCount_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private java.lang.Object endpoint_ = "";
    /**
     *
     *
     * <pre>
     * The endpoint that the connection is made against.
     * Format: `projects/{project_number}/endpoints/{endpoint}`
     * </pre>
     *
     * <code>string endpoint = 1;</code>
     *
     * @return The endpoint.
     */
    public java.lang.String getEndpoint() {
      java.lang.Object ref = endpoint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endpoint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The endpoint that the connection is made against.
     * Format: `projects/{project_number}/endpoints/{endpoint}`
     * </pre>
     *
     * <code>string endpoint = 1;</code>
     *
     * @return The bytes for endpoint.
     */
    public com.google.protobuf.ByteString getEndpointBytes() {
      java.lang.Object ref = endpoint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        endpoint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The endpoint that the connection is made against.
     * Format: `projects/{project_number}/endpoints/{endpoint}`
     * </pre>
     *
     * <code>string endpoint = 1;</code>
     *
     * @param value The endpoint to set.
     * @return This builder for chaining.
     */
    public Builder setEndpoint(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      endpoint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The endpoint that the connection is made against.
     * Format: `projects/{project_number}/endpoints/{endpoint}`
     * </pre>
     *
     * <code>string endpoint = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEndpoint() {
      endpoint_ = getDefaultInstance().getEndpoint();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The endpoint that the connection is made against.
     * Format: `projects/{project_number}/endpoints/{endpoint}`
     * </pre>
     *
     * <code>string endpoint = 1;</code>
     *
     * @param value The bytes for endpoint to set.
     * @return This builder for chaining.
     */
    public Builder setEndpointBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      endpoint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.apigeeconnect.v1.Cluster cluster_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apigeeconnect.v1.Cluster,
            com.google.cloud.apigeeconnect.v1.Cluster.Builder,
            com.google.cloud.apigeeconnect.v1.ClusterOrBuilder>
        clusterBuilder_;
    /**
     *
     *
     * <pre>
     * Cluster information.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.Cluster cluster = 2;</code>
     *
     * @return Whether the cluster field is set.
     */
    public boolean hasCluster() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Cluster information.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.Cluster cluster = 2;</code>
     *
     * @return The cluster.
     */
    public com.google.cloud.apigeeconnect.v1.Cluster getCluster() {
      if (clusterBuilder_ == null) {
        return cluster_ == null
            ? com.google.cloud.apigeeconnect.v1.Cluster.getDefaultInstance()
            : cluster_;
      } else {
        return clusterBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Cluster information.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.Cluster cluster = 2;</code>
     */
    public Builder setCluster(com.google.cloud.apigeeconnect.v1.Cluster value) {
      if (clusterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cluster_ = value;
      } else {
        clusterBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cluster information.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.Cluster cluster = 2;</code>
     */
    public Builder setCluster(com.google.cloud.apigeeconnect.v1.Cluster.Builder builderForValue) {
      if (clusterBuilder_ == null) {
        cluster_ = builderForValue.build();
      } else {
        clusterBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cluster information.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.Cluster cluster = 2;</code>
     */
    public Builder mergeCluster(com.google.cloud.apigeeconnect.v1.Cluster value) {
      if (clusterBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && cluster_ != null
            && cluster_ != com.google.cloud.apigeeconnect.v1.Cluster.getDefaultInstance()) {
          getClusterBuilder().mergeFrom(value);
        } else {
          cluster_ = value;
        }
      } else {
        clusterBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cluster information.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.Cluster cluster = 2;</code>
     */
    public Builder clearCluster() {
      bitField0_ = (bitField0_ & ~0x00000002);
      cluster_ = null;
      if (clusterBuilder_ != null) {
        clusterBuilder_.dispose();
        clusterBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cluster information.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.Cluster cluster = 2;</code>
     */
    public com.google.cloud.apigeeconnect.v1.Cluster.Builder getClusterBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getClusterFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Cluster information.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.Cluster cluster = 2;</code>
     */
    public com.google.cloud.apigeeconnect.v1.ClusterOrBuilder getClusterOrBuilder() {
      if (clusterBuilder_ != null) {
        return clusterBuilder_.getMessageOrBuilder();
      } else {
        return cluster_ == null
            ? com.google.cloud.apigeeconnect.v1.Cluster.getDefaultInstance()
            : cluster_;
      }
    }
    /**
     *
     *
     * <pre>
     * Cluster information.
     * </pre>
     *
     * <code>.google.cloud.apigeeconnect.v1.Cluster cluster = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apigeeconnect.v1.Cluster,
            com.google.cloud.apigeeconnect.v1.Cluster.Builder,
            com.google.cloud.apigeeconnect.v1.ClusterOrBuilder>
        getClusterFieldBuilder() {
      if (clusterBuilder_ == null) {
        clusterBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.apigeeconnect.v1.Cluster,
                com.google.cloud.apigeeconnect.v1.Cluster.Builder,
                com.google.cloud.apigeeconnect.v1.ClusterOrBuilder>(
                getCluster(), getParentForChildren(), isClean());
        cluster_ = null;
      }
      return clusterBuilder_;
    }

    private int streamCount_;
    /**
     *
     *
     * <pre>
     * The count of streams.
     * </pre>
     *
     * <code>int32 stream_count = 3;</code>
     *
     * @return The streamCount.
     */
    @java.lang.Override
    public int getStreamCount() {
      return streamCount_;
    }
    /**
     *
     *
     * <pre>
     * The count of streams.
     * </pre>
     *
     * <code>int32 stream_count = 3;</code>
     *
     * @param value The streamCount to set.
     * @return This builder for chaining.
     */
    public Builder setStreamCount(int value) {

      streamCount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The count of streams.
     * </pre>
     *
     * <code>int32 stream_count = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStreamCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      streamCount_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.apigeeconnect.v1.Connection)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.apigeeconnect.v1.Connection)
  private static final com.google.cloud.apigeeconnect.v1.Connection DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.apigeeconnect.v1.Connection();
  }

  public static com.google.cloud.apigeeconnect.v1.Connection getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Connection> PARSER =
      new com.google.protobuf.AbstractParser<Connection>() {
        @java.lang.Override
        public Connection parsePartialFrom(
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

  public static com.google.protobuf.Parser<Connection> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Connection> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.apigeeconnect.v1.Connection getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
