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
 * Represents the action responsible for remove a document from a specific
 * folder.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.RemoveFromFolderAction}
 */
public final class RemoveFromFolderAction extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.RemoveFromFolderAction)
    RemoveFromFolderActionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RemoveFromFolderAction.newBuilder() to construct.
  private RemoveFromFolderAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RemoveFromFolderAction() {
    condition_ = "";
    folder_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RemoveFromFolderAction();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.RuleEngineProto
        .internal_static_google_cloud_contentwarehouse_v1_RemoveFromFolderAction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.RuleEngineProto
        .internal_static_google_cloud_contentwarehouse_v1_RemoveFromFolderAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction.class,
            com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction.Builder.class);
  }

  public static final int CONDITION_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object condition_ = "";
  /**
   *
   *
   * <pre>
   * Condition of the action to be executed.
   * </pre>
   *
   * <code>string condition = 1;</code>
   *
   * @return The condition.
   */
  @java.lang.Override
  public java.lang.String getCondition() {
    java.lang.Object ref = condition_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      condition_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Condition of the action to be executed.
   * </pre>
   *
   * <code>string condition = 1;</code>
   *
   * @return The bytes for condition.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getConditionBytes() {
    java.lang.Object ref = condition_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      condition_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FOLDER_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object folder_ = "";
  /**
   *
   *
   * <pre>
   * Name of the folder under which new document is to be added.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document_id}.
   * </pre>
   *
   * <code>string folder = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The folder.
   */
  @java.lang.Override
  public java.lang.String getFolder() {
    java.lang.Object ref = folder_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      folder_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the folder under which new document is to be added.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document_id}.
   * </pre>
   *
   * <code>string folder = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for folder.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFolderBytes() {
    java.lang.Object ref = folder_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      folder_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(condition_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, condition_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(folder_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, folder_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(condition_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, condition_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(folder_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, folder_);
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction other =
        (com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction) obj;

    if (!getCondition().equals(other.getCondition())) return false;
    if (!getFolder().equals(other.getFolder())) return false;
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
    hash = (37 * hash) + CONDITION_FIELD_NUMBER;
    hash = (53 * hash) + getCondition().hashCode();
    hash = (37 * hash) + FOLDER_FIELD_NUMBER;
    hash = (53 * hash) + getFolder().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction parseFrom(
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
      com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction prototype) {
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
   * Represents the action responsible for remove a document from a specific
   * folder.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.RemoveFromFolderAction}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.RemoveFromFolderAction)
      com.google.cloud.contentwarehouse.v1.RemoveFromFolderActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_RemoveFromFolderAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_RemoveFromFolderAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction.class,
              com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      condition_ = "";
      folder_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_RemoveFromFolderAction_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction build() {
      com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction buildPartial() {
      com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction result =
          new com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.condition_ = condition_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.folder_ = folder_;
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction other) {
      if (other == com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction.getDefaultInstance())
        return this;
      if (!other.getCondition().isEmpty()) {
        condition_ = other.condition_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getFolder().isEmpty()) {
        folder_ = other.folder_;
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
                condition_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                folder_ = input.readStringRequireUtf8();
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

    private java.lang.Object condition_ = "";
    /**
     *
     *
     * <pre>
     * Condition of the action to be executed.
     * </pre>
     *
     * <code>string condition = 1;</code>
     *
     * @return The condition.
     */
    public java.lang.String getCondition() {
      java.lang.Object ref = condition_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        condition_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Condition of the action to be executed.
     * </pre>
     *
     * <code>string condition = 1;</code>
     *
     * @return The bytes for condition.
     */
    public com.google.protobuf.ByteString getConditionBytes() {
      java.lang.Object ref = condition_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        condition_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Condition of the action to be executed.
     * </pre>
     *
     * <code>string condition = 1;</code>
     *
     * @param value The condition to set.
     * @return This builder for chaining.
     */
    public Builder setCondition(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      condition_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Condition of the action to be executed.
     * </pre>
     *
     * <code>string condition = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCondition() {
      condition_ = getDefaultInstance().getCondition();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Condition of the action to be executed.
     * </pre>
     *
     * <code>string condition = 1;</code>
     *
     * @param value The bytes for condition to set.
     * @return This builder for chaining.
     */
    public Builder setConditionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      condition_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object folder_ = "";
    /**
     *
     *
     * <pre>
     * Name of the folder under which new document is to be added.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document_id}.
     * </pre>
     *
     * <code>string folder = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The folder.
     */
    public java.lang.String getFolder() {
      java.lang.Object ref = folder_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        folder_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the folder under which new document is to be added.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document_id}.
     * </pre>
     *
     * <code>string folder = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for folder.
     */
    public com.google.protobuf.ByteString getFolderBytes() {
      java.lang.Object ref = folder_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        folder_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the folder under which new document is to be added.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document_id}.
     * </pre>
     *
     * <code>string folder = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The folder to set.
     * @return This builder for chaining.
     */
    public Builder setFolder(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      folder_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the folder under which new document is to be added.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document_id}.
     * </pre>
     *
     * <code>string folder = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFolder() {
      folder_ = getDefaultInstance().getFolder();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the folder under which new document is to be added.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document_id}.
     * </pre>
     *
     * <code>string folder = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for folder to set.
     * @return This builder for chaining.
     */
    public Builder setFolderBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      folder_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.RemoveFromFolderAction)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.RemoveFromFolderAction)
  private static final com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction();
  }

  public static com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveFromFolderAction> PARSER =
      new com.google.protobuf.AbstractParser<RemoveFromFolderAction>() {
        @java.lang.Override
        public RemoveFromFolderAction parsePartialFrom(
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

  public static com.google.protobuf.Parser<RemoveFromFolderAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveFromFolderAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.RemoveFromFolderAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
