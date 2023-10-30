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
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

/**
 *
 *
 * <pre>
 * Configuration information of a phrase match rule.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig}
 */
public final class PhraseMatchRuleConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig)
    PhraseMatchRuleConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PhraseMatchRuleConfig.newBuilder() to construct.
  private PhraseMatchRuleConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PhraseMatchRuleConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PhraseMatchRuleConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto
        .internal_static_google_cloud_contactcenterinsights_v1_PhraseMatchRuleConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto
        .internal_static_google_cloud_contactcenterinsights_v1_PhraseMatchRuleConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig.class,
            com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig.Builder.class);
  }

  private int configCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object config_;

  public enum ConfigCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    EXACT_MATCH_CONFIG(1),
    CONFIG_NOT_SET(0);
    private final int value;

    private ConfigCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ConfigCase valueOf(int value) {
      return forNumber(value);
    }

    public static ConfigCase forNumber(int value) {
      switch (value) {
        case 1:
          return EXACT_MATCH_CONFIG;
        case 0:
          return CONFIG_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ConfigCase getConfigCase() {
    return ConfigCase.forNumber(configCase_);
  }

  public static final int EXACT_MATCH_CONFIG_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * The configuration for the exact match rule.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.ExactMatchConfig exact_match_config = 1;</code>
   *
   * @return Whether the exactMatchConfig field is set.
   */
  @java.lang.Override
  public boolean hasExactMatchConfig() {
    return configCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * The configuration for the exact match rule.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.ExactMatchConfig exact_match_config = 1;</code>
   *
   * @return The exactMatchConfig.
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.ExactMatchConfig getExactMatchConfig() {
    if (configCase_ == 1) {
      return (com.google.cloud.contactcenterinsights.v1.ExactMatchConfig) config_;
    }
    return com.google.cloud.contactcenterinsights.v1.ExactMatchConfig.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * The configuration for the exact match rule.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.ExactMatchConfig exact_match_config = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.ExactMatchConfigOrBuilder
      getExactMatchConfigOrBuilder() {
    if (configCase_ == 1) {
      return (com.google.cloud.contactcenterinsights.v1.ExactMatchConfig) config_;
    }
    return com.google.cloud.contactcenterinsights.v1.ExactMatchConfig.getDefaultInstance();
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
    if (configCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.contactcenterinsights.v1.ExactMatchConfig) config_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (configCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.contactcenterinsights.v1.ExactMatchConfig) config_);
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig other =
        (com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig) obj;

    if (!getConfigCase().equals(other.getConfigCase())) return false;
    switch (configCase_) {
      case 1:
        if (!getExactMatchConfig().equals(other.getExactMatchConfig())) return false;
        break;
      case 0:
      default:
    }
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
    switch (configCase_) {
      case 1:
        hash = (37 * hash) + EXACT_MATCH_CONFIG_FIELD_NUMBER;
        hash = (53 * hash) + getExactMatchConfig().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig parseFrom(
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
      com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig prototype) {
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
   * Configuration information of a phrase match rule.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig)
      com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto
          .internal_static_google_cloud_contactcenterinsights_v1_PhraseMatchRuleConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto
          .internal_static_google_cloud_contactcenterinsights_v1_PhraseMatchRuleConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig.class,
              com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig.Builder.class);
    }

    // Construct using com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (exactMatchConfigBuilder_ != null) {
        exactMatchConfigBuilder_.clear();
      }
      configCase_ = 0;
      config_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto
          .internal_static_google_cloud_contactcenterinsights_v1_PhraseMatchRuleConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig
        getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig build() {
      com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig buildPartial() {
      com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig result =
          new com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(
        com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig result) {
      result.configCase_ = configCase_;
      result.config_ = this.config_;
      if (configCase_ == 1 && exactMatchConfigBuilder_ != null) {
        result.config_ = exactMatchConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig other) {
      if (other
          == com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig.getDefaultInstance())
        return this;
      switch (other.getConfigCase()) {
        case EXACT_MATCH_CONFIG:
          {
            mergeExactMatchConfig(other.getExactMatchConfig());
            break;
          }
        case CONFIG_NOT_SET:
          {
            break;
          }
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
                input.readMessage(
                    getExactMatchConfigFieldBuilder().getBuilder(), extensionRegistry);
                configCase_ = 1;
                break;
              } // case 10
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

    private int configCase_ = 0;
    private java.lang.Object config_;

    public ConfigCase getConfigCase() {
      return ConfigCase.forNumber(configCase_);
    }

    public Builder clearConfig() {
      configCase_ = 0;
      config_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.ExactMatchConfig,
            com.google.cloud.contactcenterinsights.v1.ExactMatchConfig.Builder,
            com.google.cloud.contactcenterinsights.v1.ExactMatchConfigOrBuilder>
        exactMatchConfigBuilder_;
    /**
     *
     *
     * <pre>
     * The configuration for the exact match rule.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.ExactMatchConfig exact_match_config = 1;</code>
     *
     * @return Whether the exactMatchConfig field is set.
     */
    @java.lang.Override
    public boolean hasExactMatchConfig() {
      return configCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * The configuration for the exact match rule.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.ExactMatchConfig exact_match_config = 1;</code>
     *
     * @return The exactMatchConfig.
     */
    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.ExactMatchConfig getExactMatchConfig() {
      if (exactMatchConfigBuilder_ == null) {
        if (configCase_ == 1) {
          return (com.google.cloud.contactcenterinsights.v1.ExactMatchConfig) config_;
        }
        return com.google.cloud.contactcenterinsights.v1.ExactMatchConfig.getDefaultInstance();
      } else {
        if (configCase_ == 1) {
          return exactMatchConfigBuilder_.getMessage();
        }
        return com.google.cloud.contactcenterinsights.v1.ExactMatchConfig.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The configuration for the exact match rule.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.ExactMatchConfig exact_match_config = 1;</code>
     */
    public Builder setExactMatchConfig(
        com.google.cloud.contactcenterinsights.v1.ExactMatchConfig value) {
      if (exactMatchConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
        onChanged();
      } else {
        exactMatchConfigBuilder_.setMessage(value);
      }
      configCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The configuration for the exact match rule.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.ExactMatchConfig exact_match_config = 1;</code>
     */
    public Builder setExactMatchConfig(
        com.google.cloud.contactcenterinsights.v1.ExactMatchConfig.Builder builderForValue) {
      if (exactMatchConfigBuilder_ == null) {
        config_ = builderForValue.build();
        onChanged();
      } else {
        exactMatchConfigBuilder_.setMessage(builderForValue.build());
      }
      configCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The configuration for the exact match rule.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.ExactMatchConfig exact_match_config = 1;</code>
     */
    public Builder mergeExactMatchConfig(
        com.google.cloud.contactcenterinsights.v1.ExactMatchConfig value) {
      if (exactMatchConfigBuilder_ == null) {
        if (configCase_ == 1
            && config_
                != com.google.cloud.contactcenterinsights.v1.ExactMatchConfig
                    .getDefaultInstance()) {
          config_ =
              com.google.cloud.contactcenterinsights.v1.ExactMatchConfig.newBuilder(
                      (com.google.cloud.contactcenterinsights.v1.ExactMatchConfig) config_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          config_ = value;
        }
        onChanged();
      } else {
        if (configCase_ == 1) {
          exactMatchConfigBuilder_.mergeFrom(value);
        } else {
          exactMatchConfigBuilder_.setMessage(value);
        }
      }
      configCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The configuration for the exact match rule.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.ExactMatchConfig exact_match_config = 1;</code>
     */
    public Builder clearExactMatchConfig() {
      if (exactMatchConfigBuilder_ == null) {
        if (configCase_ == 1) {
          configCase_ = 0;
          config_ = null;
          onChanged();
        }
      } else {
        if (configCase_ == 1) {
          configCase_ = 0;
          config_ = null;
        }
        exactMatchConfigBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The configuration for the exact match rule.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.ExactMatchConfig exact_match_config = 1;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.ExactMatchConfig.Builder
        getExactMatchConfigBuilder() {
      return getExactMatchConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The configuration for the exact match rule.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.ExactMatchConfig exact_match_config = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.ExactMatchConfigOrBuilder
        getExactMatchConfigOrBuilder() {
      if ((configCase_ == 1) && (exactMatchConfigBuilder_ != null)) {
        return exactMatchConfigBuilder_.getMessageOrBuilder();
      } else {
        if (configCase_ == 1) {
          return (com.google.cloud.contactcenterinsights.v1.ExactMatchConfig) config_;
        }
        return com.google.cloud.contactcenterinsights.v1.ExactMatchConfig.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The configuration for the exact match rule.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.ExactMatchConfig exact_match_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.ExactMatchConfig,
            com.google.cloud.contactcenterinsights.v1.ExactMatchConfig.Builder,
            com.google.cloud.contactcenterinsights.v1.ExactMatchConfigOrBuilder>
        getExactMatchConfigFieldBuilder() {
      if (exactMatchConfigBuilder_ == null) {
        if (!(configCase_ == 1)) {
          config_ = com.google.cloud.contactcenterinsights.v1.ExactMatchConfig.getDefaultInstance();
        }
        exactMatchConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.contactcenterinsights.v1.ExactMatchConfig,
                com.google.cloud.contactcenterinsights.v1.ExactMatchConfig.Builder,
                com.google.cloud.contactcenterinsights.v1.ExactMatchConfigOrBuilder>(
                (com.google.cloud.contactcenterinsights.v1.ExactMatchConfig) config_,
                getParentForChildren(),
                isClean());
        config_ = null;
      }
      configCase_ = 1;
      onChanged();
      return exactMatchConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig)
  private static final com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig();
  }

  public static com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PhraseMatchRuleConfig> PARSER =
      new com.google.protobuf.AbstractParser<PhraseMatchRuleConfig>() {
        @java.lang.Override
        public PhraseMatchRuleConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<PhraseMatchRuleConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PhraseMatchRuleConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
