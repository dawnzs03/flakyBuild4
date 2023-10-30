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
// source: google/cloud/contentwarehouse/v1/rule_engine.proto

package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * Represents a rule and outputs of associated actions.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.RuleActionsPair}
 */
public final class RuleActionsPair extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.RuleActionsPair)
    RuleActionsPairOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RuleActionsPair.newBuilder() to construct.
  private RuleActionsPair(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RuleActionsPair() {
    actionOutputs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RuleActionsPair();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.RuleEngineProto
        .internal_static_google_cloud_contentwarehouse_v1_RuleActionsPair_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.RuleEngineProto
        .internal_static_google_cloud_contentwarehouse_v1_RuleActionsPair_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.RuleActionsPair.class,
            com.google.cloud.contentwarehouse.v1.RuleActionsPair.Builder.class);
  }

  public static final int RULE_FIELD_NUMBER = 1;
  private com.google.cloud.contentwarehouse.v1.Rule rule_;
  /**
   *
   *
   * <pre>
   * Represents the rule.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
   *
   * @return Whether the rule field is set.
   */
  @java.lang.Override
  public boolean hasRule() {
    return rule_ != null;
  }
  /**
   *
   *
   * <pre>
   * Represents the rule.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
   *
   * @return The rule.
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.Rule getRule() {
    return rule_ == null ? com.google.cloud.contentwarehouse.v1.Rule.getDefaultInstance() : rule_;
  }
  /**
   *
   *
   * <pre>
   * Represents the rule.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.RuleOrBuilder getRuleOrBuilder() {
    return rule_ == null ? com.google.cloud.contentwarehouse.v1.Rule.getDefaultInstance() : rule_;
  }

  public static final int ACTION_OUTPUTS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.contentwarehouse.v1.ActionOutput> actionOutputs_;
  /**
   *
   *
   * <pre>
   * Outputs of executing the actions associated with the above rule.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.contentwarehouse.v1.ActionOutput> getActionOutputsList() {
    return actionOutputs_;
  }
  /**
   *
   *
   * <pre>
   * Outputs of executing the actions associated with the above rule.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.contentwarehouse.v1.ActionOutputOrBuilder>
      getActionOutputsOrBuilderList() {
    return actionOutputs_;
  }
  /**
   *
   *
   * <pre>
   * Outputs of executing the actions associated with the above rule.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
   */
  @java.lang.Override
  public int getActionOutputsCount() {
    return actionOutputs_.size();
  }
  /**
   *
   *
   * <pre>
   * Outputs of executing the actions associated with the above rule.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.ActionOutput getActionOutputs(int index) {
    return actionOutputs_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Outputs of executing the actions associated with the above rule.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.ActionOutputOrBuilder getActionOutputsOrBuilder(
      int index) {
    return actionOutputs_.get(index);
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
    if (rule_ != null) {
      output.writeMessage(1, getRule());
    }
    for (int i = 0; i < actionOutputs_.size(); i++) {
      output.writeMessage(2, actionOutputs_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rule_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getRule());
    }
    for (int i = 0; i < actionOutputs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, actionOutputs_.get(i));
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.RuleActionsPair)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.RuleActionsPair other =
        (com.google.cloud.contentwarehouse.v1.RuleActionsPair) obj;

    if (hasRule() != other.hasRule()) return false;
    if (hasRule()) {
      if (!getRule().equals(other.getRule())) return false;
    }
    if (!getActionOutputsList().equals(other.getActionOutputsList())) return false;
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
    if (hasRule()) {
      hash = (37 * hash) + RULE_FIELD_NUMBER;
      hash = (53 * hash) + getRule().hashCode();
    }
    if (getActionOutputsCount() > 0) {
      hash = (37 * hash) + ACTION_OUTPUTS_FIELD_NUMBER;
      hash = (53 * hash) + getActionOutputsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.RuleActionsPair parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.RuleActionsPair parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.RuleActionsPair parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.RuleActionsPair parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.RuleActionsPair parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.RuleActionsPair parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.RuleActionsPair parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.RuleActionsPair parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.RuleActionsPair parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.RuleActionsPair parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.RuleActionsPair parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.RuleActionsPair parseFrom(
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

  public static Builder newBuilder(com.google.cloud.contentwarehouse.v1.RuleActionsPair prototype) {
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
   * Represents a rule and outputs of associated actions.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.RuleActionsPair}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.RuleActionsPair)
      com.google.cloud.contentwarehouse.v1.RuleActionsPairOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_RuleActionsPair_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_RuleActionsPair_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.RuleActionsPair.class,
              com.google.cloud.contentwarehouse.v1.RuleActionsPair.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.RuleActionsPair.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      rule_ = null;
      if (ruleBuilder_ != null) {
        ruleBuilder_.dispose();
        ruleBuilder_ = null;
      }
      if (actionOutputsBuilder_ == null) {
        actionOutputs_ = java.util.Collections.emptyList();
      } else {
        actionOutputs_ = null;
        actionOutputsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_RuleActionsPair_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.RuleActionsPair getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.RuleActionsPair.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.RuleActionsPair build() {
      com.google.cloud.contentwarehouse.v1.RuleActionsPair result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.RuleActionsPair buildPartial() {
      com.google.cloud.contentwarehouse.v1.RuleActionsPair result =
          new com.google.cloud.contentwarehouse.v1.RuleActionsPair(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.contentwarehouse.v1.RuleActionsPair result) {
      if (actionOutputsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          actionOutputs_ = java.util.Collections.unmodifiableList(actionOutputs_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.actionOutputs_ = actionOutputs_;
      } else {
        result.actionOutputs_ = actionOutputsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.contentwarehouse.v1.RuleActionsPair result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rule_ = ruleBuilder_ == null ? rule_ : ruleBuilder_.build();
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.RuleActionsPair) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.RuleActionsPair) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.RuleActionsPair other) {
      if (other == com.google.cloud.contentwarehouse.v1.RuleActionsPair.getDefaultInstance())
        return this;
      if (other.hasRule()) {
        mergeRule(other.getRule());
      }
      if (actionOutputsBuilder_ == null) {
        if (!other.actionOutputs_.isEmpty()) {
          if (actionOutputs_.isEmpty()) {
            actionOutputs_ = other.actionOutputs_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureActionOutputsIsMutable();
            actionOutputs_.addAll(other.actionOutputs_);
          }
          onChanged();
        }
      } else {
        if (!other.actionOutputs_.isEmpty()) {
          if (actionOutputsBuilder_.isEmpty()) {
            actionOutputsBuilder_.dispose();
            actionOutputsBuilder_ = null;
            actionOutputs_ = other.actionOutputs_;
            bitField0_ = (bitField0_ & ~0x00000002);
            actionOutputsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getActionOutputsFieldBuilder()
                    : null;
          } else {
            actionOutputsBuilder_.addAllMessages(other.actionOutputs_);
          }
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
                input.readMessage(getRuleFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                com.google.cloud.contentwarehouse.v1.ActionOutput m =
                    input.readMessage(
                        com.google.cloud.contentwarehouse.v1.ActionOutput.parser(),
                        extensionRegistry);
                if (actionOutputsBuilder_ == null) {
                  ensureActionOutputsIsMutable();
                  actionOutputs_.add(m);
                } else {
                  actionOutputsBuilder_.addMessage(m);
                }
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

    private com.google.cloud.contentwarehouse.v1.Rule rule_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.Rule,
            com.google.cloud.contentwarehouse.v1.Rule.Builder,
            com.google.cloud.contentwarehouse.v1.RuleOrBuilder>
        ruleBuilder_;
    /**
     *
     *
     * <pre>
     * Represents the rule.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
     *
     * @return Whether the rule field is set.
     */
    public boolean hasRule() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Represents the rule.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
     *
     * @return The rule.
     */
    public com.google.cloud.contentwarehouse.v1.Rule getRule() {
      if (ruleBuilder_ == null) {
        return rule_ == null
            ? com.google.cloud.contentwarehouse.v1.Rule.getDefaultInstance()
            : rule_;
      } else {
        return ruleBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Represents the rule.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
     */
    public Builder setRule(com.google.cloud.contentwarehouse.v1.Rule value) {
      if (ruleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rule_ = value;
      } else {
        ruleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents the rule.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
     */
    public Builder setRule(com.google.cloud.contentwarehouse.v1.Rule.Builder builderForValue) {
      if (ruleBuilder_ == null) {
        rule_ = builderForValue.build();
      } else {
        ruleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents the rule.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
     */
    public Builder mergeRule(com.google.cloud.contentwarehouse.v1.Rule value) {
      if (ruleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && rule_ != null
            && rule_ != com.google.cloud.contentwarehouse.v1.Rule.getDefaultInstance()) {
          getRuleBuilder().mergeFrom(value);
        } else {
          rule_ = value;
        }
      } else {
        ruleBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents the rule.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
     */
    public Builder clearRule() {
      bitField0_ = (bitField0_ & ~0x00000001);
      rule_ = null;
      if (ruleBuilder_ != null) {
        ruleBuilder_.dispose();
        ruleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents the rule.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
     */
    public com.google.cloud.contentwarehouse.v1.Rule.Builder getRuleBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRuleFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Represents the rule.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
     */
    public com.google.cloud.contentwarehouse.v1.RuleOrBuilder getRuleOrBuilder() {
      if (ruleBuilder_ != null) {
        return ruleBuilder_.getMessageOrBuilder();
      } else {
        return rule_ == null
            ? com.google.cloud.contentwarehouse.v1.Rule.getDefaultInstance()
            : rule_;
      }
    }
    /**
     *
     *
     * <pre>
     * Represents the rule.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.Rule,
            com.google.cloud.contentwarehouse.v1.Rule.Builder,
            com.google.cloud.contentwarehouse.v1.RuleOrBuilder>
        getRuleFieldBuilder() {
      if (ruleBuilder_ == null) {
        ruleBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.contentwarehouse.v1.Rule,
                com.google.cloud.contentwarehouse.v1.Rule.Builder,
                com.google.cloud.contentwarehouse.v1.RuleOrBuilder>(
                getRule(), getParentForChildren(), isClean());
        rule_ = null;
      }
      return ruleBuilder_;
    }

    private java.util.List<com.google.cloud.contentwarehouse.v1.ActionOutput> actionOutputs_ =
        java.util.Collections.emptyList();

    private void ensureActionOutputsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        actionOutputs_ =
            new java.util.ArrayList<com.google.cloud.contentwarehouse.v1.ActionOutput>(
                actionOutputs_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.ActionOutput,
            com.google.cloud.contentwarehouse.v1.ActionOutput.Builder,
            com.google.cloud.contentwarehouse.v1.ActionOutputOrBuilder>
        actionOutputsBuilder_;

    /**
     *
     *
     * <pre>
     * Outputs of executing the actions associated with the above rule.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
     */
    public java.util.List<com.google.cloud.contentwarehouse.v1.ActionOutput>
        getActionOutputsList() {
      if (actionOutputsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(actionOutputs_);
      } else {
        return actionOutputsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Outputs of executing the actions associated with the above rule.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
     */
    public int getActionOutputsCount() {
      if (actionOutputsBuilder_ == null) {
        return actionOutputs_.size();
      } else {
        return actionOutputsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Outputs of executing the actions associated with the above rule.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
     */
    public com.google.cloud.contentwarehouse.v1.ActionOutput getActionOutputs(int index) {
      if (actionOutputsBuilder_ == null) {
        return actionOutputs_.get(index);
      } else {
        return actionOutputsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Outputs of executing the actions associated with the above rule.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
     */
    public Builder setActionOutputs(
        int index, com.google.cloud.contentwarehouse.v1.ActionOutput value) {
      if (actionOutputsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActionOutputsIsMutable();
        actionOutputs_.set(index, value);
        onChanged();
      } else {
        actionOutputsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Outputs of executing the actions associated with the above rule.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
     */
    public Builder setActionOutputs(
        int index, com.google.cloud.contentwarehouse.v1.ActionOutput.Builder builderForValue) {
      if (actionOutputsBuilder_ == null) {
        ensureActionOutputsIsMutable();
        actionOutputs_.set(index, builderForValue.build());
        onChanged();
      } else {
        actionOutputsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Outputs of executing the actions associated with the above rule.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
     */
    public Builder addActionOutputs(com.google.cloud.contentwarehouse.v1.ActionOutput value) {
      if (actionOutputsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActionOutputsIsMutable();
        actionOutputs_.add(value);
        onChanged();
      } else {
        actionOutputsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Outputs of executing the actions associated with the above rule.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
     */
    public Builder addActionOutputs(
        int index, com.google.cloud.contentwarehouse.v1.ActionOutput value) {
      if (actionOutputsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActionOutputsIsMutable();
        actionOutputs_.add(index, value);
        onChanged();
      } else {
        actionOutputsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Outputs of executing the actions associated with the above rule.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
     */
    public Builder addActionOutputs(
        com.google.cloud.contentwarehouse.v1.ActionOutput.Builder builderForValue) {
      if (actionOutputsBuilder_ == null) {
        ensureActionOutputsIsMutable();
        actionOutputs_.add(builderForValue.build());
        onChanged();
      } else {
        actionOutputsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Outputs of executing the actions associated with the above rule.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
     */
    public Builder addActionOutputs(
        int index, com.google.cloud.contentwarehouse.v1.ActionOutput.Builder builderForValue) {
      if (actionOutputsBuilder_ == null) {
        ensureActionOutputsIsMutable();
        actionOutputs_.add(index, builderForValue.build());
        onChanged();
      } else {
        actionOutputsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Outputs of executing the actions associated with the above rule.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
     */
    public Builder addAllActionOutputs(
        java.lang.Iterable<? extends com.google.cloud.contentwarehouse.v1.ActionOutput> values) {
      if (actionOutputsBuilder_ == null) {
        ensureActionOutputsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, actionOutputs_);
        onChanged();
      } else {
        actionOutputsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Outputs of executing the actions associated with the above rule.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
     */
    public Builder clearActionOutputs() {
      if (actionOutputsBuilder_ == null) {
        actionOutputs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        actionOutputsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Outputs of executing the actions associated with the above rule.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
     */
    public Builder removeActionOutputs(int index) {
      if (actionOutputsBuilder_ == null) {
        ensureActionOutputsIsMutable();
        actionOutputs_.remove(index);
        onChanged();
      } else {
        actionOutputsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Outputs of executing the actions associated with the above rule.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
     */
    public com.google.cloud.contentwarehouse.v1.ActionOutput.Builder getActionOutputsBuilder(
        int index) {
      return getActionOutputsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Outputs of executing the actions associated with the above rule.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
     */
    public com.google.cloud.contentwarehouse.v1.ActionOutputOrBuilder getActionOutputsOrBuilder(
        int index) {
      if (actionOutputsBuilder_ == null) {
        return actionOutputs_.get(index);
      } else {
        return actionOutputsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Outputs of executing the actions associated with the above rule.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
     */
    public java.util.List<? extends com.google.cloud.contentwarehouse.v1.ActionOutputOrBuilder>
        getActionOutputsOrBuilderList() {
      if (actionOutputsBuilder_ != null) {
        return actionOutputsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(actionOutputs_);
      }
    }
    /**
     *
     *
     * <pre>
     * Outputs of executing the actions associated with the above rule.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
     */
    public com.google.cloud.contentwarehouse.v1.ActionOutput.Builder addActionOutputsBuilder() {
      return getActionOutputsFieldBuilder()
          .addBuilder(com.google.cloud.contentwarehouse.v1.ActionOutput.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Outputs of executing the actions associated with the above rule.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
     */
    public com.google.cloud.contentwarehouse.v1.ActionOutput.Builder addActionOutputsBuilder(
        int index) {
      return getActionOutputsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.contentwarehouse.v1.ActionOutput.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Outputs of executing the actions associated with the above rule.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.ActionOutput action_outputs = 2;</code>
     */
    public java.util.List<com.google.cloud.contentwarehouse.v1.ActionOutput.Builder>
        getActionOutputsBuilderList() {
      return getActionOutputsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.ActionOutput,
            com.google.cloud.contentwarehouse.v1.ActionOutput.Builder,
            com.google.cloud.contentwarehouse.v1.ActionOutputOrBuilder>
        getActionOutputsFieldBuilder() {
      if (actionOutputsBuilder_ == null) {
        actionOutputsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.contentwarehouse.v1.ActionOutput,
                com.google.cloud.contentwarehouse.v1.ActionOutput.Builder,
                com.google.cloud.contentwarehouse.v1.ActionOutputOrBuilder>(
                actionOutputs_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        actionOutputs_ = null;
      }
      return actionOutputsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.RuleActionsPair)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.RuleActionsPair)
  private static final com.google.cloud.contentwarehouse.v1.RuleActionsPair DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.RuleActionsPair();
  }

  public static com.google.cloud.contentwarehouse.v1.RuleActionsPair getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RuleActionsPair> PARSER =
      new com.google.protobuf.AbstractParser<RuleActionsPair>() {
        @java.lang.Override
        public RuleActionsPair parsePartialFrom(
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

  public static com.google.protobuf.Parser<RuleActionsPair> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RuleActionsPair> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.RuleActionsPair getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
