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
 * Represents the action responsible for adding document under a folder.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.AddToFolderAction}
 */
public final class AddToFolderAction extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.AddToFolderAction)
    AddToFolderActionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AddToFolderAction.newBuilder() to construct.
  private AddToFolderAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AddToFolderAction() {
    folders_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AddToFolderAction();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.RuleEngineProto
        .internal_static_google_cloud_contentwarehouse_v1_AddToFolderAction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.RuleEngineProto
        .internal_static_google_cloud_contentwarehouse_v1_AddToFolderAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.AddToFolderAction.class,
            com.google.cloud.contentwarehouse.v1.AddToFolderAction.Builder.class);
  }

  public static final int FOLDERS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList folders_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Names of the folder under which new document is to be added.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document_id}.
   * </pre>
   *
   * <code>repeated string folders = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return A list containing the folders.
   */
  public com.google.protobuf.ProtocolStringList getFoldersList() {
    return folders_;
  }
  /**
   *
   *
   * <pre>
   * Names of the folder under which new document is to be added.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document_id}.
   * </pre>
   *
   * <code>repeated string folders = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The count of folders.
   */
  public int getFoldersCount() {
    return folders_.size();
  }
  /**
   *
   *
   * <pre>
   * Names of the folder under which new document is to be added.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document_id}.
   * </pre>
   *
   * <code>repeated string folders = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the element to return.
   * @return The folders at the given index.
   */
  public java.lang.String getFolders(int index) {
    return folders_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Names of the folder under which new document is to be added.
   * Format:
   * projects/{project_number}/locations/{location}/documents/{document_id}.
   * </pre>
   *
   * <code>repeated string folders = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the folders at the given index.
   */
  public com.google.protobuf.ByteString getFoldersBytes(int index) {
    return folders_.getByteString(index);
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
    for (int i = 0; i < folders_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, folders_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < folders_.size(); i++) {
        dataSize += computeStringSizeNoTag(folders_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getFoldersList().size();
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.AddToFolderAction)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.AddToFolderAction other =
        (com.google.cloud.contentwarehouse.v1.AddToFolderAction) obj;

    if (!getFoldersList().equals(other.getFoldersList())) return false;
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
    if (getFoldersCount() > 0) {
      hash = (37 * hash) + FOLDERS_FIELD_NUMBER;
      hash = (53 * hash) + getFoldersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.AddToFolderAction parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.AddToFolderAction parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.AddToFolderAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.AddToFolderAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.AddToFolderAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.AddToFolderAction parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.AddToFolderAction parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.AddToFolderAction parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.AddToFolderAction parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.AddToFolderAction parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.AddToFolderAction parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.AddToFolderAction parseFrom(
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
      com.google.cloud.contentwarehouse.v1.AddToFolderAction prototype) {
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
   * Represents the action responsible for adding document under a folder.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.AddToFolderAction}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.AddToFolderAction)
      com.google.cloud.contentwarehouse.v1.AddToFolderActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_AddToFolderAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_AddToFolderAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.AddToFolderAction.class,
              com.google.cloud.contentwarehouse.v1.AddToFolderAction.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.AddToFolderAction.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      folders_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_AddToFolderAction_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.AddToFolderAction getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.AddToFolderAction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.AddToFolderAction build() {
      com.google.cloud.contentwarehouse.v1.AddToFolderAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.AddToFolderAction buildPartial() {
      com.google.cloud.contentwarehouse.v1.AddToFolderAction result =
          new com.google.cloud.contentwarehouse.v1.AddToFolderAction(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contentwarehouse.v1.AddToFolderAction result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        folders_.makeImmutable();
        result.folders_ = folders_;
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.AddToFolderAction) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.AddToFolderAction) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.AddToFolderAction other) {
      if (other == com.google.cloud.contentwarehouse.v1.AddToFolderAction.getDefaultInstance())
        return this;
      if (!other.folders_.isEmpty()) {
        if (folders_.isEmpty()) {
          folders_ = other.folders_;
          bitField0_ |= 0x00000001;
        } else {
          ensureFoldersIsMutable();
          folders_.addAll(other.folders_);
        }
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
                java.lang.String s = input.readStringRequireUtf8();
                ensureFoldersIsMutable();
                folders_.add(s);
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

    private int bitField0_;

    private com.google.protobuf.LazyStringArrayList folders_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureFoldersIsMutable() {
      if (!folders_.isModifiable()) {
        folders_ = new com.google.protobuf.LazyStringArrayList(folders_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * Names of the folder under which new document is to be added.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document_id}.
     * </pre>
     *
     * <code>repeated string folders = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return A list containing the folders.
     */
    public com.google.protobuf.ProtocolStringList getFoldersList() {
      folders_.makeImmutable();
      return folders_;
    }
    /**
     *
     *
     * <pre>
     * Names of the folder under which new document is to be added.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document_id}.
     * </pre>
     *
     * <code>repeated string folders = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The count of folders.
     */
    public int getFoldersCount() {
      return folders_.size();
    }
    /**
     *
     *
     * <pre>
     * Names of the folder under which new document is to be added.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document_id}.
     * </pre>
     *
     * <code>repeated string folders = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param index The index of the element to return.
     * @return The folders at the given index.
     */
    public java.lang.String getFolders(int index) {
      return folders_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Names of the folder under which new document is to be added.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document_id}.
     * </pre>
     *
     * <code>repeated string folders = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the folders at the given index.
     */
    public com.google.protobuf.ByteString getFoldersBytes(int index) {
      return folders_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Names of the folder under which new document is to be added.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document_id}.
     * </pre>
     *
     * <code>repeated string folders = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param index The index to set the value at.
     * @param value The folders to set.
     * @return This builder for chaining.
     */
    public Builder setFolders(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFoldersIsMutable();
      folders_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Names of the folder under which new document is to be added.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document_id}.
     * </pre>
     *
     * <code>repeated string folders = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The folders to add.
     * @return This builder for chaining.
     */
    public Builder addFolders(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureFoldersIsMutable();
      folders_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Names of the folder under which new document is to be added.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document_id}.
     * </pre>
     *
     * <code>repeated string folders = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param values The folders to add.
     * @return This builder for chaining.
     */
    public Builder addAllFolders(java.lang.Iterable<java.lang.String> values) {
      ensureFoldersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, folders_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Names of the folder under which new document is to be added.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document_id}.
     * </pre>
     *
     * <code>repeated string folders = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFolders() {
      folders_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Names of the folder under which new document is to be added.
     * Format:
     * projects/{project_number}/locations/{location}/documents/{document_id}.
     * </pre>
     *
     * <code>repeated string folders = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes of the folders to add.
     * @return This builder for chaining.
     */
    public Builder addFoldersBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureFoldersIsMutable();
      folders_.add(value);
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.AddToFolderAction)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.AddToFolderAction)
  private static final com.google.cloud.contentwarehouse.v1.AddToFolderAction DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.AddToFolderAction();
  }

  public static com.google.cloud.contentwarehouse.v1.AddToFolderAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddToFolderAction> PARSER =
      new com.google.protobuf.AbstractParser<AddToFolderAction>() {
        @java.lang.Override
        public AddToFolderAction parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddToFolderAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddToFolderAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.AddToFolderAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
