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
// source: google/cloud/datafusion/v1/datafusion.proto

package com.google.cloud.datafusion.v1;

/**
 *
 *
 * <pre>
 * Network configuration for a Data Fusion instance. These configurations
 * are used for peering with the customer network. Configurations are optional
 * when a public Data Fusion instance is to be created. However, providing
 * these configurations allows several benefits, such as reduced network latency
 * while accessing the customer resources from managed Data Fusion instance
 * nodes, as well as access to the customer on-prem resources.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datafusion.v1.NetworkConfig}
 */
public final class NetworkConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datafusion.v1.NetworkConfig)
    NetworkConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NetworkConfig.newBuilder() to construct.
  private NetworkConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NetworkConfig() {
    network_ = "";
    ipAllocation_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NetworkConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datafusion.v1.Datafusion
        .internal_static_google_cloud_datafusion_v1_NetworkConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datafusion.v1.Datafusion
        .internal_static_google_cloud_datafusion_v1_NetworkConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datafusion.v1.NetworkConfig.class,
            com.google.cloud.datafusion.v1.NetworkConfig.Builder.class);
  }

  public static final int NETWORK_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object network_ = "";
  /**
   *
   *
   * <pre>
   * Name of the network in the customer project with which the Tenant Project
   * will be peered for executing pipelines. In case of shared VPC where the
   * network resides in another host project the network should specified in
   * the form of projects/{host-project-id}/global/networks/{network}
   * </pre>
   *
   * <code>string network = 1;</code>
   *
   * @return The network.
   */
  @java.lang.Override
  public java.lang.String getNetwork() {
    java.lang.Object ref = network_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      network_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the network in the customer project with which the Tenant Project
   * will be peered for executing pipelines. In case of shared VPC where the
   * network resides in another host project the network should specified in
   * the form of projects/{host-project-id}/global/networks/{network}
   * </pre>
   *
   * <code>string network = 1;</code>
   *
   * @return The bytes for network.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNetworkBytes() {
    java.lang.Object ref = network_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      network_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IP_ALLOCATION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object ipAllocation_ = "";
  /**
   *
   *
   * <pre>
   * The IP range in CIDR notation to use for the managed Data Fusion instance
   * nodes. This range must not overlap with any other ranges used in the
   * customer network.
   * </pre>
   *
   * <code>string ip_allocation = 2;</code>
   *
   * @return The ipAllocation.
   */
  @java.lang.Override
  public java.lang.String getIpAllocation() {
    java.lang.Object ref = ipAllocation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipAllocation_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The IP range in CIDR notation to use for the managed Data Fusion instance
   * nodes. This range must not overlap with any other ranges used in the
   * customer network.
   * </pre>
   *
   * <code>string ip_allocation = 2;</code>
   *
   * @return The bytes for ipAllocation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIpAllocationBytes() {
    java.lang.Object ref = ipAllocation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      ipAllocation_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(network_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, network_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ipAllocation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ipAllocation_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(network_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, network_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ipAllocation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ipAllocation_);
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
    if (!(obj instanceof com.google.cloud.datafusion.v1.NetworkConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.datafusion.v1.NetworkConfig other =
        (com.google.cloud.datafusion.v1.NetworkConfig) obj;

    if (!getNetwork().equals(other.getNetwork())) return false;
    if (!getIpAllocation().equals(other.getIpAllocation())) return false;
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
    hash = (37 * hash) + NETWORK_FIELD_NUMBER;
    hash = (53 * hash) + getNetwork().hashCode();
    hash = (37 * hash) + IP_ALLOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getIpAllocation().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datafusion.v1.NetworkConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datafusion.v1.NetworkConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1.NetworkConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datafusion.v1.NetworkConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1.NetworkConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datafusion.v1.NetworkConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1.NetworkConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datafusion.v1.NetworkConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1.NetworkConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datafusion.v1.NetworkConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1.NetworkConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datafusion.v1.NetworkConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datafusion.v1.NetworkConfig prototype) {
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
   * Network configuration for a Data Fusion instance. These configurations
   * are used for peering with the customer network. Configurations are optional
   * when a public Data Fusion instance is to be created. However, providing
   * these configurations allows several benefits, such as reduced network latency
   * while accessing the customer resources from managed Data Fusion instance
   * nodes, as well as access to the customer on-prem resources.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datafusion.v1.NetworkConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datafusion.v1.NetworkConfig)
      com.google.cloud.datafusion.v1.NetworkConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datafusion.v1.Datafusion
          .internal_static_google_cloud_datafusion_v1_NetworkConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datafusion.v1.Datafusion
          .internal_static_google_cloud_datafusion_v1_NetworkConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datafusion.v1.NetworkConfig.class,
              com.google.cloud.datafusion.v1.NetworkConfig.Builder.class);
    }

    // Construct using com.google.cloud.datafusion.v1.NetworkConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      network_ = "";
      ipAllocation_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datafusion.v1.Datafusion
          .internal_static_google_cloud_datafusion_v1_NetworkConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1.NetworkConfig getDefaultInstanceForType() {
      return com.google.cloud.datafusion.v1.NetworkConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1.NetworkConfig build() {
      com.google.cloud.datafusion.v1.NetworkConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1.NetworkConfig buildPartial() {
      com.google.cloud.datafusion.v1.NetworkConfig result =
          new com.google.cloud.datafusion.v1.NetworkConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datafusion.v1.NetworkConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.network_ = network_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ipAllocation_ = ipAllocation_;
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
      if (other instanceof com.google.cloud.datafusion.v1.NetworkConfig) {
        return mergeFrom((com.google.cloud.datafusion.v1.NetworkConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datafusion.v1.NetworkConfig other) {
      if (other == com.google.cloud.datafusion.v1.NetworkConfig.getDefaultInstance()) return this;
      if (!other.getNetwork().isEmpty()) {
        network_ = other.network_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getIpAllocation().isEmpty()) {
        ipAllocation_ = other.ipAllocation_;
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
                network_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                ipAllocation_ = input.readStringRequireUtf8();
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

    private java.lang.Object network_ = "";
    /**
     *
     *
     * <pre>
     * Name of the network in the customer project with which the Tenant Project
     * will be peered for executing pipelines. In case of shared VPC where the
     * network resides in another host project the network should specified in
     * the form of projects/{host-project-id}/global/networks/{network}
     * </pre>
     *
     * <code>string network = 1;</code>
     *
     * @return The network.
     */
    public java.lang.String getNetwork() {
      java.lang.Object ref = network_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        network_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the network in the customer project with which the Tenant Project
     * will be peered for executing pipelines. In case of shared VPC where the
     * network resides in another host project the network should specified in
     * the form of projects/{host-project-id}/global/networks/{network}
     * </pre>
     *
     * <code>string network = 1;</code>
     *
     * @return The bytes for network.
     */
    public com.google.protobuf.ByteString getNetworkBytes() {
      java.lang.Object ref = network_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        network_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the network in the customer project with which the Tenant Project
     * will be peered for executing pipelines. In case of shared VPC where the
     * network resides in another host project the network should specified in
     * the form of projects/{host-project-id}/global/networks/{network}
     * </pre>
     *
     * <code>string network = 1;</code>
     *
     * @param value The network to set.
     * @return This builder for chaining.
     */
    public Builder setNetwork(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      network_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the network in the customer project with which the Tenant Project
     * will be peered for executing pipelines. In case of shared VPC where the
     * network resides in another host project the network should specified in
     * the form of projects/{host-project-id}/global/networks/{network}
     * </pre>
     *
     * <code>string network = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNetwork() {
      network_ = getDefaultInstance().getNetwork();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the network in the customer project with which the Tenant Project
     * will be peered for executing pipelines. In case of shared VPC where the
     * network resides in another host project the network should specified in
     * the form of projects/{host-project-id}/global/networks/{network}
     * </pre>
     *
     * <code>string network = 1;</code>
     *
     * @param value The bytes for network to set.
     * @return This builder for chaining.
     */
    public Builder setNetworkBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      network_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object ipAllocation_ = "";
    /**
     *
     *
     * <pre>
     * The IP range in CIDR notation to use for the managed Data Fusion instance
     * nodes. This range must not overlap with any other ranges used in the
     * customer network.
     * </pre>
     *
     * <code>string ip_allocation = 2;</code>
     *
     * @return The ipAllocation.
     */
    public java.lang.String getIpAllocation() {
      java.lang.Object ref = ipAllocation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipAllocation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The IP range in CIDR notation to use for the managed Data Fusion instance
     * nodes. This range must not overlap with any other ranges used in the
     * customer network.
     * </pre>
     *
     * <code>string ip_allocation = 2;</code>
     *
     * @return The bytes for ipAllocation.
     */
    public com.google.protobuf.ByteString getIpAllocationBytes() {
      java.lang.Object ref = ipAllocation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        ipAllocation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The IP range in CIDR notation to use for the managed Data Fusion instance
     * nodes. This range must not overlap with any other ranges used in the
     * customer network.
     * </pre>
     *
     * <code>string ip_allocation = 2;</code>
     *
     * @param value The ipAllocation to set.
     * @return This builder for chaining.
     */
    public Builder setIpAllocation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ipAllocation_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The IP range in CIDR notation to use for the managed Data Fusion instance
     * nodes. This range must not overlap with any other ranges used in the
     * customer network.
     * </pre>
     *
     * <code>string ip_allocation = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIpAllocation() {
      ipAllocation_ = getDefaultInstance().getIpAllocation();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The IP range in CIDR notation to use for the managed Data Fusion instance
     * nodes. This range must not overlap with any other ranges used in the
     * customer network.
     * </pre>
     *
     * <code>string ip_allocation = 2;</code>
     *
     * @param value The bytes for ipAllocation to set.
     * @return This builder for chaining.
     */
    public Builder setIpAllocationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ipAllocation_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datafusion.v1.NetworkConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datafusion.v1.NetworkConfig)
  private static final com.google.cloud.datafusion.v1.NetworkConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datafusion.v1.NetworkConfig();
  }

  public static com.google.cloud.datafusion.v1.NetworkConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworkConfig> PARSER =
      new com.google.protobuf.AbstractParser<NetworkConfig>() {
        @java.lang.Override
        public NetworkConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<NetworkConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetworkConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datafusion.v1.NetworkConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
