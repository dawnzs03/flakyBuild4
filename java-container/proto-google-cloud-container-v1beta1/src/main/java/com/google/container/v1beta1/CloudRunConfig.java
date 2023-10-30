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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

/**
 *
 *
 * <pre>
 * Configuration options for the Cloud Run feature.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.CloudRunConfig}
 */
public final class CloudRunConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.CloudRunConfig)
    CloudRunConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CloudRunConfig.newBuilder() to construct.
  private CloudRunConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CloudRunConfig() {
    loadBalancerType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CloudRunConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_CloudRunConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_CloudRunConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.CloudRunConfig.class,
            com.google.container.v1beta1.CloudRunConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Load balancer type of ingress service of Cloud Run.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1beta1.CloudRunConfig.LoadBalancerType}
   */
  public enum LoadBalancerType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Load balancer type for Cloud Run is unspecified.
     * </pre>
     *
     * <code>LOAD_BALANCER_TYPE_UNSPECIFIED = 0;</code>
     */
    LOAD_BALANCER_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Install external load balancer for Cloud Run.
     * </pre>
     *
     * <code>LOAD_BALANCER_TYPE_EXTERNAL = 1;</code>
     */
    LOAD_BALANCER_TYPE_EXTERNAL(1),
    /**
     *
     *
     * <pre>
     * Install internal load balancer for Cloud Run.
     * </pre>
     *
     * <code>LOAD_BALANCER_TYPE_INTERNAL = 2;</code>
     */
    LOAD_BALANCER_TYPE_INTERNAL(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Load balancer type for Cloud Run is unspecified.
     * </pre>
     *
     * <code>LOAD_BALANCER_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int LOAD_BALANCER_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Install external load balancer for Cloud Run.
     * </pre>
     *
     * <code>LOAD_BALANCER_TYPE_EXTERNAL = 1;</code>
     */
    public static final int LOAD_BALANCER_TYPE_EXTERNAL_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Install internal load balancer for Cloud Run.
     * </pre>
     *
     * <code>LOAD_BALANCER_TYPE_INTERNAL = 2;</code>
     */
    public static final int LOAD_BALANCER_TYPE_INTERNAL_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LoadBalancerType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LoadBalancerType forNumber(int value) {
      switch (value) {
        case 0:
          return LOAD_BALANCER_TYPE_UNSPECIFIED;
        case 1:
          return LOAD_BALANCER_TYPE_EXTERNAL;
        case 2:
          return LOAD_BALANCER_TYPE_INTERNAL;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LoadBalancerType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<LoadBalancerType>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<LoadBalancerType>() {
              public LoadBalancerType findValueByNumber(int number) {
                return LoadBalancerType.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.container.v1beta1.CloudRunConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final LoadBalancerType[] VALUES = values();

    public static LoadBalancerType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LoadBalancerType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1beta1.CloudRunConfig.LoadBalancerType)
  }

  public static final int DISABLED_FIELD_NUMBER = 1;
  private boolean disabled_ = false;
  /**
   *
   *
   * <pre>
   * Whether Cloud Run addon is enabled for this cluster.
   * </pre>
   *
   * <code>bool disabled = 1;</code>
   *
   * @return The disabled.
   */
  @java.lang.Override
  public boolean getDisabled() {
    return disabled_;
  }

  public static final int LOAD_BALANCER_TYPE_FIELD_NUMBER = 3;
  private int loadBalancerType_ = 0;
  /**
   *
   *
   * <pre>
   * Which load balancer type is installed for Cloud Run.
   * </pre>
   *
   * <code>.google.container.v1beta1.CloudRunConfig.LoadBalancerType load_balancer_type = 3;</code>
   *
   * @return The enum numeric value on the wire for loadBalancerType.
   */
  @java.lang.Override
  public int getLoadBalancerTypeValue() {
    return loadBalancerType_;
  }
  /**
   *
   *
   * <pre>
   * Which load balancer type is installed for Cloud Run.
   * </pre>
   *
   * <code>.google.container.v1beta1.CloudRunConfig.LoadBalancerType load_balancer_type = 3;</code>
   *
   * @return The loadBalancerType.
   */
  @java.lang.Override
  public com.google.container.v1beta1.CloudRunConfig.LoadBalancerType getLoadBalancerType() {
    com.google.container.v1beta1.CloudRunConfig.LoadBalancerType result =
        com.google.container.v1beta1.CloudRunConfig.LoadBalancerType.forNumber(loadBalancerType_);
    return result == null
        ? com.google.container.v1beta1.CloudRunConfig.LoadBalancerType.UNRECOGNIZED
        : result;
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
    if (disabled_ != false) {
      output.writeBool(1, disabled_);
    }
    if (loadBalancerType_
        != com.google.container.v1beta1.CloudRunConfig.LoadBalancerType
            .LOAD_BALANCER_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, loadBalancerType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (disabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, disabled_);
    }
    if (loadBalancerType_
        != com.google.container.v1beta1.CloudRunConfig.LoadBalancerType
            .LOAD_BALANCER_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, loadBalancerType_);
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
    if (!(obj instanceof com.google.container.v1beta1.CloudRunConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.CloudRunConfig other =
        (com.google.container.v1beta1.CloudRunConfig) obj;

    if (getDisabled() != other.getDisabled()) return false;
    if (loadBalancerType_ != other.loadBalancerType_) return false;
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
    hash = (37 * hash) + DISABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getDisabled());
    hash = (37 * hash) + LOAD_BALANCER_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + loadBalancerType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.CloudRunConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.CloudRunConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.CloudRunConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.CloudRunConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.CloudRunConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.CloudRunConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.CloudRunConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.CloudRunConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.CloudRunConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.CloudRunConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.CloudRunConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.CloudRunConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1beta1.CloudRunConfig prototype) {
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
   * Configuration options for the Cloud Run feature.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.CloudRunConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.CloudRunConfig)
      com.google.container.v1beta1.CloudRunConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_CloudRunConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_CloudRunConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.CloudRunConfig.class,
              com.google.container.v1beta1.CloudRunConfig.Builder.class);
    }

    // Construct using com.google.container.v1beta1.CloudRunConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      disabled_ = false;
      loadBalancerType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_CloudRunConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.CloudRunConfig getDefaultInstanceForType() {
      return com.google.container.v1beta1.CloudRunConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.CloudRunConfig build() {
      com.google.container.v1beta1.CloudRunConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.CloudRunConfig buildPartial() {
      com.google.container.v1beta1.CloudRunConfig result =
          new com.google.container.v1beta1.CloudRunConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1beta1.CloudRunConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.disabled_ = disabled_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.loadBalancerType_ = loadBalancerType_;
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
      if (other instanceof com.google.container.v1beta1.CloudRunConfig) {
        return mergeFrom((com.google.container.v1beta1.CloudRunConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.CloudRunConfig other) {
      if (other == com.google.container.v1beta1.CloudRunConfig.getDefaultInstance()) return this;
      if (other.getDisabled() != false) {
        setDisabled(other.getDisabled());
      }
      if (other.loadBalancerType_ != 0) {
        setLoadBalancerTypeValue(other.getLoadBalancerTypeValue());
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
            case 8:
              {
                disabled_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 24:
              {
                loadBalancerType_ = input.readEnum();
                bitField0_ |= 0x00000002;
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

    private boolean disabled_;
    /**
     *
     *
     * <pre>
     * Whether Cloud Run addon is enabled for this cluster.
     * </pre>
     *
     * <code>bool disabled = 1;</code>
     *
     * @return The disabled.
     */
    @java.lang.Override
    public boolean getDisabled() {
      return disabled_;
    }
    /**
     *
     *
     * <pre>
     * Whether Cloud Run addon is enabled for this cluster.
     * </pre>
     *
     * <code>bool disabled = 1;</code>
     *
     * @param value The disabled to set.
     * @return This builder for chaining.
     */
    public Builder setDisabled(boolean value) {

      disabled_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether Cloud Run addon is enabled for this cluster.
     * </pre>
     *
     * <code>bool disabled = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDisabled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      disabled_ = false;
      onChanged();
      return this;
    }

    private int loadBalancerType_ = 0;
    /**
     *
     *
     * <pre>
     * Which load balancer type is installed for Cloud Run.
     * </pre>
     *
     * <code>.google.container.v1beta1.CloudRunConfig.LoadBalancerType load_balancer_type = 3;
     * </code>
     *
     * @return The enum numeric value on the wire for loadBalancerType.
     */
    @java.lang.Override
    public int getLoadBalancerTypeValue() {
      return loadBalancerType_;
    }
    /**
     *
     *
     * <pre>
     * Which load balancer type is installed for Cloud Run.
     * </pre>
     *
     * <code>.google.container.v1beta1.CloudRunConfig.LoadBalancerType load_balancer_type = 3;
     * </code>
     *
     * @param value The enum numeric value on the wire for loadBalancerType to set.
     * @return This builder for chaining.
     */
    public Builder setLoadBalancerTypeValue(int value) {
      loadBalancerType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Which load balancer type is installed for Cloud Run.
     * </pre>
     *
     * <code>.google.container.v1beta1.CloudRunConfig.LoadBalancerType load_balancer_type = 3;
     * </code>
     *
     * @return The loadBalancerType.
     */
    @java.lang.Override
    public com.google.container.v1beta1.CloudRunConfig.LoadBalancerType getLoadBalancerType() {
      com.google.container.v1beta1.CloudRunConfig.LoadBalancerType result =
          com.google.container.v1beta1.CloudRunConfig.LoadBalancerType.forNumber(loadBalancerType_);
      return result == null
          ? com.google.container.v1beta1.CloudRunConfig.LoadBalancerType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Which load balancer type is installed for Cloud Run.
     * </pre>
     *
     * <code>.google.container.v1beta1.CloudRunConfig.LoadBalancerType load_balancer_type = 3;
     * </code>
     *
     * @param value The loadBalancerType to set.
     * @return This builder for chaining.
     */
    public Builder setLoadBalancerType(
        com.google.container.v1beta1.CloudRunConfig.LoadBalancerType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      loadBalancerType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Which load balancer type is installed for Cloud Run.
     * </pre>
     *
     * <code>.google.container.v1beta1.CloudRunConfig.LoadBalancerType load_balancer_type = 3;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLoadBalancerType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      loadBalancerType_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.CloudRunConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.CloudRunConfig)
  private static final com.google.container.v1beta1.CloudRunConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.CloudRunConfig();
  }

  public static com.google.container.v1beta1.CloudRunConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CloudRunConfig> PARSER =
      new com.google.protobuf.AbstractParser<CloudRunConfig>() {
        @java.lang.Override
        public CloudRunConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<CloudRunConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CloudRunConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.CloudRunConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
