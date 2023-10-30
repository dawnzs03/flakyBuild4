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
 * LoggingVariantConfig specifies the behaviour of the logging component.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.LoggingVariantConfig}
 */
public final class LoggingVariantConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.LoggingVariantConfig)
    LoggingVariantConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LoggingVariantConfig.newBuilder() to construct.
  private LoggingVariantConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LoggingVariantConfig() {
    variant_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LoggingVariantConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_LoggingVariantConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_LoggingVariantConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.LoggingVariantConfig.class,
            com.google.container.v1beta1.LoggingVariantConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Logging component variants.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1beta1.LoggingVariantConfig.Variant}
   */
  public enum Variant implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default value. This shouldn't be used.
     * </pre>
     *
     * <code>VARIANT_UNSPECIFIED = 0;</code>
     */
    VARIANT_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * default logging variant.
     * </pre>
     *
     * <code>DEFAULT = 1;</code>
     */
    DEFAULT(1),
    /**
     *
     *
     * <pre>
     * maximum logging throughput variant.
     * </pre>
     *
     * <code>MAX_THROUGHPUT = 2;</code>
     */
    MAX_THROUGHPUT(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default value. This shouldn't be used.
     * </pre>
     *
     * <code>VARIANT_UNSPECIFIED = 0;</code>
     */
    public static final int VARIANT_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * default logging variant.
     * </pre>
     *
     * <code>DEFAULT = 1;</code>
     */
    public static final int DEFAULT_VALUE = 1;
    /**
     *
     *
     * <pre>
     * maximum logging throughput variant.
     * </pre>
     *
     * <code>MAX_THROUGHPUT = 2;</code>
     */
    public static final int MAX_THROUGHPUT_VALUE = 2;

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
    public static Variant valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Variant forNumber(int value) {
      switch (value) {
        case 0:
          return VARIANT_UNSPECIFIED;
        case 1:
          return DEFAULT;
        case 2:
          return MAX_THROUGHPUT;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Variant> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Variant> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Variant>() {
          public Variant findValueByNumber(int number) {
            return Variant.forNumber(number);
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
      return com.google.container.v1beta1.LoggingVariantConfig.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final Variant[] VALUES = values();

    public static Variant valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Variant(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1beta1.LoggingVariantConfig.Variant)
  }

  public static final int VARIANT_FIELD_NUMBER = 1;
  private int variant_ = 0;
  /**
   *
   *
   * <pre>
   * Logging variant deployed on nodes.
   * </pre>
   *
   * <code>.google.container.v1beta1.LoggingVariantConfig.Variant variant = 1;</code>
   *
   * @return The enum numeric value on the wire for variant.
   */
  @java.lang.Override
  public int getVariantValue() {
    return variant_;
  }
  /**
   *
   *
   * <pre>
   * Logging variant deployed on nodes.
   * </pre>
   *
   * <code>.google.container.v1beta1.LoggingVariantConfig.Variant variant = 1;</code>
   *
   * @return The variant.
   */
  @java.lang.Override
  public com.google.container.v1beta1.LoggingVariantConfig.Variant getVariant() {
    com.google.container.v1beta1.LoggingVariantConfig.Variant result =
        com.google.container.v1beta1.LoggingVariantConfig.Variant.forNumber(variant_);
    return result == null
        ? com.google.container.v1beta1.LoggingVariantConfig.Variant.UNRECOGNIZED
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
    if (variant_
        != com.google.container.v1beta1.LoggingVariantConfig.Variant.VARIANT_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, variant_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (variant_
        != com.google.container.v1beta1.LoggingVariantConfig.Variant.VARIANT_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, variant_);
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
    if (!(obj instanceof com.google.container.v1beta1.LoggingVariantConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.LoggingVariantConfig other =
        (com.google.container.v1beta1.LoggingVariantConfig) obj;

    if (variant_ != other.variant_) return false;
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
    hash = (37 * hash) + VARIANT_FIELD_NUMBER;
    hash = (53 * hash) + variant_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.LoggingVariantConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.LoggingVariantConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.LoggingVariantConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.LoggingVariantConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.LoggingVariantConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.LoggingVariantConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.LoggingVariantConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.LoggingVariantConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.LoggingVariantConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.LoggingVariantConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.LoggingVariantConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.LoggingVariantConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1beta1.LoggingVariantConfig prototype) {
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
   * LoggingVariantConfig specifies the behaviour of the logging component.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.LoggingVariantConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.LoggingVariantConfig)
      com.google.container.v1beta1.LoggingVariantConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_LoggingVariantConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_LoggingVariantConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.LoggingVariantConfig.class,
              com.google.container.v1beta1.LoggingVariantConfig.Builder.class);
    }

    // Construct using com.google.container.v1beta1.LoggingVariantConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      variant_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_LoggingVariantConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.LoggingVariantConfig getDefaultInstanceForType() {
      return com.google.container.v1beta1.LoggingVariantConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.LoggingVariantConfig build() {
      com.google.container.v1beta1.LoggingVariantConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.LoggingVariantConfig buildPartial() {
      com.google.container.v1beta1.LoggingVariantConfig result =
          new com.google.container.v1beta1.LoggingVariantConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1beta1.LoggingVariantConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.variant_ = variant_;
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
      if (other instanceof com.google.container.v1beta1.LoggingVariantConfig) {
        return mergeFrom((com.google.container.v1beta1.LoggingVariantConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.LoggingVariantConfig other) {
      if (other == com.google.container.v1beta1.LoggingVariantConfig.getDefaultInstance())
        return this;
      if (other.variant_ != 0) {
        setVariantValue(other.getVariantValue());
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
                variant_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

    private int variant_ = 0;
    /**
     *
     *
     * <pre>
     * Logging variant deployed on nodes.
     * </pre>
     *
     * <code>.google.container.v1beta1.LoggingVariantConfig.Variant variant = 1;</code>
     *
     * @return The enum numeric value on the wire for variant.
     */
    @java.lang.Override
    public int getVariantValue() {
      return variant_;
    }
    /**
     *
     *
     * <pre>
     * Logging variant deployed on nodes.
     * </pre>
     *
     * <code>.google.container.v1beta1.LoggingVariantConfig.Variant variant = 1;</code>
     *
     * @param value The enum numeric value on the wire for variant to set.
     * @return This builder for chaining.
     */
    public Builder setVariantValue(int value) {
      variant_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Logging variant deployed on nodes.
     * </pre>
     *
     * <code>.google.container.v1beta1.LoggingVariantConfig.Variant variant = 1;</code>
     *
     * @return The variant.
     */
    @java.lang.Override
    public com.google.container.v1beta1.LoggingVariantConfig.Variant getVariant() {
      com.google.container.v1beta1.LoggingVariantConfig.Variant result =
          com.google.container.v1beta1.LoggingVariantConfig.Variant.forNumber(variant_);
      return result == null
          ? com.google.container.v1beta1.LoggingVariantConfig.Variant.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Logging variant deployed on nodes.
     * </pre>
     *
     * <code>.google.container.v1beta1.LoggingVariantConfig.Variant variant = 1;</code>
     *
     * @param value The variant to set.
     * @return This builder for chaining.
     */
    public Builder setVariant(com.google.container.v1beta1.LoggingVariantConfig.Variant value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      variant_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Logging variant deployed on nodes.
     * </pre>
     *
     * <code>.google.container.v1beta1.LoggingVariantConfig.Variant variant = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVariant() {
      bitField0_ = (bitField0_ & ~0x00000001);
      variant_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.LoggingVariantConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.LoggingVariantConfig)
  private static final com.google.container.v1beta1.LoggingVariantConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.LoggingVariantConfig();
  }

  public static com.google.container.v1beta1.LoggingVariantConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoggingVariantConfig> PARSER =
      new com.google.protobuf.AbstractParser<LoggingVariantConfig>() {
        @java.lang.Override
        public LoggingVariantConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<LoggingVariantConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoggingVariantConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.LoggingVariantConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
