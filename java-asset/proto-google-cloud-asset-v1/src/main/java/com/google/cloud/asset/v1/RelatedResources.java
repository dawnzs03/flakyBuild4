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
// source: google/cloud/asset/v1/assets.proto

package com.google.cloud.asset.v1;

/**
 *
 *
 * <pre>
 * The related resources of the primary resource.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1.RelatedResources}
 */
public final class RelatedResources extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1.RelatedResources)
    RelatedResourcesOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RelatedResources.newBuilder() to construct.
  private RelatedResources(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RelatedResources() {
    relatedResources_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RelatedResources();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.asset.v1.AssetProto
        .internal_static_google_cloud_asset_v1_RelatedResources_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1.AssetProto
        .internal_static_google_cloud_asset_v1_RelatedResources_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1.RelatedResources.class,
            com.google.cloud.asset.v1.RelatedResources.Builder.class);
  }

  public static final int RELATED_RESOURCES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.asset.v1.RelatedResource> relatedResources_;
  /**
   *
   *
   * <pre>
   * The detailed related resources of the primary resource.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.asset.v1.RelatedResource> getRelatedResourcesList() {
    return relatedResources_;
  }
  /**
   *
   *
   * <pre>
   * The detailed related resources of the primary resource.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.asset.v1.RelatedResourceOrBuilder>
      getRelatedResourcesOrBuilderList() {
    return relatedResources_;
  }
  /**
   *
   *
   * <pre>
   * The detailed related resources of the primary resource.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
   */
  @java.lang.Override
  public int getRelatedResourcesCount() {
    return relatedResources_.size();
  }
  /**
   *
   *
   * <pre>
   * The detailed related resources of the primary resource.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.RelatedResource getRelatedResources(int index) {
    return relatedResources_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The detailed related resources of the primary resource.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.RelatedResourceOrBuilder getRelatedResourcesOrBuilder(
      int index) {
    return relatedResources_.get(index);
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
    for (int i = 0; i < relatedResources_.size(); i++) {
      output.writeMessage(1, relatedResources_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < relatedResources_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, relatedResources_.get(i));
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
    if (!(obj instanceof com.google.cloud.asset.v1.RelatedResources)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1.RelatedResources other =
        (com.google.cloud.asset.v1.RelatedResources) obj;

    if (!getRelatedResourcesList().equals(other.getRelatedResourcesList())) return false;
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
    if (getRelatedResourcesCount() > 0) {
      hash = (37 * hash) + RELATED_RESOURCES_FIELD_NUMBER;
      hash = (53 * hash) + getRelatedResourcesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1.RelatedResources parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.RelatedResources parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.RelatedResources parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.RelatedResources parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.RelatedResources parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.RelatedResources parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.RelatedResources parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.RelatedResources parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.RelatedResources parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.RelatedResources parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.RelatedResources parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.RelatedResources parseFrom(
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

  public static Builder newBuilder(com.google.cloud.asset.v1.RelatedResources prototype) {
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
   * The related resources of the primary resource.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1.RelatedResources}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1.RelatedResources)
      com.google.cloud.asset.v1.RelatedResourcesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.asset.v1.AssetProto
          .internal_static_google_cloud_asset_v1_RelatedResources_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1.AssetProto
          .internal_static_google_cloud_asset_v1_RelatedResources_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1.RelatedResources.class,
              com.google.cloud.asset.v1.RelatedResources.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1.RelatedResources.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (relatedResourcesBuilder_ == null) {
        relatedResources_ = java.util.Collections.emptyList();
      } else {
        relatedResources_ = null;
        relatedResourcesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.asset.v1.AssetProto
          .internal_static_google_cloud_asset_v1_RelatedResources_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.RelatedResources getDefaultInstanceForType() {
      return com.google.cloud.asset.v1.RelatedResources.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.RelatedResources build() {
      com.google.cloud.asset.v1.RelatedResources result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.RelatedResources buildPartial() {
      com.google.cloud.asset.v1.RelatedResources result =
          new com.google.cloud.asset.v1.RelatedResources(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.asset.v1.RelatedResources result) {
      if (relatedResourcesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          relatedResources_ = java.util.Collections.unmodifiableList(relatedResources_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.relatedResources_ = relatedResources_;
      } else {
        result.relatedResources_ = relatedResourcesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.asset.v1.RelatedResources result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.asset.v1.RelatedResources) {
        return mergeFrom((com.google.cloud.asset.v1.RelatedResources) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1.RelatedResources other) {
      if (other == com.google.cloud.asset.v1.RelatedResources.getDefaultInstance()) return this;
      if (relatedResourcesBuilder_ == null) {
        if (!other.relatedResources_.isEmpty()) {
          if (relatedResources_.isEmpty()) {
            relatedResources_ = other.relatedResources_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRelatedResourcesIsMutable();
            relatedResources_.addAll(other.relatedResources_);
          }
          onChanged();
        }
      } else {
        if (!other.relatedResources_.isEmpty()) {
          if (relatedResourcesBuilder_.isEmpty()) {
            relatedResourcesBuilder_.dispose();
            relatedResourcesBuilder_ = null;
            relatedResources_ = other.relatedResources_;
            bitField0_ = (bitField0_ & ~0x00000001);
            relatedResourcesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getRelatedResourcesFieldBuilder()
                    : null;
          } else {
            relatedResourcesBuilder_.addAllMessages(other.relatedResources_);
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
                com.google.cloud.asset.v1.RelatedResource m =
                    input.readMessage(
                        com.google.cloud.asset.v1.RelatedResource.parser(), extensionRegistry);
                if (relatedResourcesBuilder_ == null) {
                  ensureRelatedResourcesIsMutable();
                  relatedResources_.add(m);
                } else {
                  relatedResourcesBuilder_.addMessage(m);
                }
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

    private java.util.List<com.google.cloud.asset.v1.RelatedResource> relatedResources_ =
        java.util.Collections.emptyList();

    private void ensureRelatedResourcesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        relatedResources_ =
            new java.util.ArrayList<com.google.cloud.asset.v1.RelatedResource>(relatedResources_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.asset.v1.RelatedResource,
            com.google.cloud.asset.v1.RelatedResource.Builder,
            com.google.cloud.asset.v1.RelatedResourceOrBuilder>
        relatedResourcesBuilder_;

    /**
     *
     *
     * <pre>
     * The detailed related resources of the primary resource.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
     */
    public java.util.List<com.google.cloud.asset.v1.RelatedResource> getRelatedResourcesList() {
      if (relatedResourcesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(relatedResources_);
      } else {
        return relatedResourcesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The detailed related resources of the primary resource.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
     */
    public int getRelatedResourcesCount() {
      if (relatedResourcesBuilder_ == null) {
        return relatedResources_.size();
      } else {
        return relatedResourcesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The detailed related resources of the primary resource.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
     */
    public com.google.cloud.asset.v1.RelatedResource getRelatedResources(int index) {
      if (relatedResourcesBuilder_ == null) {
        return relatedResources_.get(index);
      } else {
        return relatedResourcesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The detailed related resources of the primary resource.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
     */
    public Builder setRelatedResources(int index, com.google.cloud.asset.v1.RelatedResource value) {
      if (relatedResourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRelatedResourcesIsMutable();
        relatedResources_.set(index, value);
        onChanged();
      } else {
        relatedResourcesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The detailed related resources of the primary resource.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
     */
    public Builder setRelatedResources(
        int index, com.google.cloud.asset.v1.RelatedResource.Builder builderForValue) {
      if (relatedResourcesBuilder_ == null) {
        ensureRelatedResourcesIsMutable();
        relatedResources_.set(index, builderForValue.build());
        onChanged();
      } else {
        relatedResourcesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The detailed related resources of the primary resource.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
     */
    public Builder addRelatedResources(com.google.cloud.asset.v1.RelatedResource value) {
      if (relatedResourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRelatedResourcesIsMutable();
        relatedResources_.add(value);
        onChanged();
      } else {
        relatedResourcesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The detailed related resources of the primary resource.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
     */
    public Builder addRelatedResources(int index, com.google.cloud.asset.v1.RelatedResource value) {
      if (relatedResourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRelatedResourcesIsMutable();
        relatedResources_.add(index, value);
        onChanged();
      } else {
        relatedResourcesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The detailed related resources of the primary resource.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
     */
    public Builder addRelatedResources(
        com.google.cloud.asset.v1.RelatedResource.Builder builderForValue) {
      if (relatedResourcesBuilder_ == null) {
        ensureRelatedResourcesIsMutable();
        relatedResources_.add(builderForValue.build());
        onChanged();
      } else {
        relatedResourcesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The detailed related resources of the primary resource.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
     */
    public Builder addRelatedResources(
        int index, com.google.cloud.asset.v1.RelatedResource.Builder builderForValue) {
      if (relatedResourcesBuilder_ == null) {
        ensureRelatedResourcesIsMutable();
        relatedResources_.add(index, builderForValue.build());
        onChanged();
      } else {
        relatedResourcesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The detailed related resources of the primary resource.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
     */
    public Builder addAllRelatedResources(
        java.lang.Iterable<? extends com.google.cloud.asset.v1.RelatedResource> values) {
      if (relatedResourcesBuilder_ == null) {
        ensureRelatedResourcesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, relatedResources_);
        onChanged();
      } else {
        relatedResourcesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The detailed related resources of the primary resource.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
     */
    public Builder clearRelatedResources() {
      if (relatedResourcesBuilder_ == null) {
        relatedResources_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        relatedResourcesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The detailed related resources of the primary resource.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
     */
    public Builder removeRelatedResources(int index) {
      if (relatedResourcesBuilder_ == null) {
        ensureRelatedResourcesIsMutable();
        relatedResources_.remove(index);
        onChanged();
      } else {
        relatedResourcesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The detailed related resources of the primary resource.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
     */
    public com.google.cloud.asset.v1.RelatedResource.Builder getRelatedResourcesBuilder(int index) {
      return getRelatedResourcesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The detailed related resources of the primary resource.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
     */
    public com.google.cloud.asset.v1.RelatedResourceOrBuilder getRelatedResourcesOrBuilder(
        int index) {
      if (relatedResourcesBuilder_ == null) {
        return relatedResources_.get(index);
      } else {
        return relatedResourcesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The detailed related resources of the primary resource.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.asset.v1.RelatedResourceOrBuilder>
        getRelatedResourcesOrBuilderList() {
      if (relatedResourcesBuilder_ != null) {
        return relatedResourcesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(relatedResources_);
      }
    }
    /**
     *
     *
     * <pre>
     * The detailed related resources of the primary resource.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
     */
    public com.google.cloud.asset.v1.RelatedResource.Builder addRelatedResourcesBuilder() {
      return getRelatedResourcesFieldBuilder()
          .addBuilder(com.google.cloud.asset.v1.RelatedResource.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The detailed related resources of the primary resource.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
     */
    public com.google.cloud.asset.v1.RelatedResource.Builder addRelatedResourcesBuilder(int index) {
      return getRelatedResourcesFieldBuilder()
          .addBuilder(index, com.google.cloud.asset.v1.RelatedResource.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The detailed related resources of the primary resource.
     * </pre>
     *
     * <code>repeated .google.cloud.asset.v1.RelatedResource related_resources = 1;</code>
     */
    public java.util.List<com.google.cloud.asset.v1.RelatedResource.Builder>
        getRelatedResourcesBuilderList() {
      return getRelatedResourcesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.asset.v1.RelatedResource,
            com.google.cloud.asset.v1.RelatedResource.Builder,
            com.google.cloud.asset.v1.RelatedResourceOrBuilder>
        getRelatedResourcesFieldBuilder() {
      if (relatedResourcesBuilder_ == null) {
        relatedResourcesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.asset.v1.RelatedResource,
                com.google.cloud.asset.v1.RelatedResource.Builder,
                com.google.cloud.asset.v1.RelatedResourceOrBuilder>(
                relatedResources_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        relatedResources_ = null;
      }
      return relatedResourcesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1.RelatedResources)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1.RelatedResources)
  private static final com.google.cloud.asset.v1.RelatedResources DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1.RelatedResources();
  }

  public static com.google.cloud.asset.v1.RelatedResources getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RelatedResources> PARSER =
      new com.google.protobuf.AbstractParser<RelatedResources>() {
        @java.lang.Override
        public RelatedResources parsePartialFrom(
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

  public static com.google.protobuf.Parser<RelatedResources> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RelatedResources> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1.RelatedResources getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
