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
// source: google/cloud/contentwarehouse/v1/document_schema_service.proto

package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * Request message for DocumentSchemaService.UpdateDocumentSchema.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest}
 */
public final class UpdateDocumentSchemaRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest)
    UpdateDocumentSchemaRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateDocumentSchemaRequest.newBuilder() to construct.
  private UpdateDocumentSchemaRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateDocumentSchemaRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateDocumentSchemaRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.DocumentSchemaServiceProto
        .internal_static_google_cloud_contentwarehouse_v1_UpdateDocumentSchemaRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.DocumentSchemaServiceProto
        .internal_static_google_cloud_contentwarehouse_v1_UpdateDocumentSchemaRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest.class,
            com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the document schema to update.
   * Format:
   * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the document schema to update.
   * Format:
   * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOCUMENT_SCHEMA_FIELD_NUMBER = 2;
  private com.google.cloud.contentwarehouse.v1.DocumentSchema documentSchema_;
  /**
   *
   *
   * <pre>
   * Required. The document schema to update with.
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.DocumentSchema document_schema = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the documentSchema field is set.
   */
  @java.lang.Override
  public boolean hasDocumentSchema() {
    return documentSchema_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The document schema to update with.
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.DocumentSchema document_schema = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The documentSchema.
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.DocumentSchema getDocumentSchema() {
    return documentSchema_ == null
        ? com.google.cloud.contentwarehouse.v1.DocumentSchema.getDefaultInstance()
        : documentSchema_;
  }
  /**
   *
   *
   * <pre>
   * Required. The document schema to update with.
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.DocumentSchema document_schema = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.DocumentSchemaOrBuilder getDocumentSchemaOrBuilder() {
    return documentSchema_ == null
        ? com.google.cloud.contentwarehouse.v1.DocumentSchema.getDefaultInstance()
        : documentSchema_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (documentSchema_ != null) {
      output.writeMessage(2, getDocumentSchema());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (documentSchema_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getDocumentSchema());
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest other =
        (com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasDocumentSchema() != other.hasDocumentSchema()) return false;
    if (hasDocumentSchema()) {
      if (!getDocumentSchema().equals(other.getDocumentSchema())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasDocumentSchema()) {
      hash = (37 * hash) + DOCUMENT_SCHEMA_FIELD_NUMBER;
      hash = (53 * hash) + getDocumentSchema().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest parseFrom(
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
      com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest prototype) {
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
   * Request message for DocumentSchemaService.UpdateDocumentSchema.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest)
      com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.DocumentSchemaServiceProto
          .internal_static_google_cloud_contentwarehouse_v1_UpdateDocumentSchemaRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.DocumentSchemaServiceProto
          .internal_static_google_cloud_contentwarehouse_v1_UpdateDocumentSchemaRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest.class,
              com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      documentSchema_ = null;
      if (documentSchemaBuilder_ != null) {
        documentSchemaBuilder_.dispose();
        documentSchemaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.DocumentSchemaServiceProto
          .internal_static_google_cloud_contentwarehouse_v1_UpdateDocumentSchemaRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest
        getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest build() {
      com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest buildPartial() {
      com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest result =
          new com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.documentSchema_ =
            documentSchemaBuilder_ == null ? documentSchema_ : documentSchemaBuilder_.build();
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest other) {
      if (other
          == com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasDocumentSchema()) {
        mergeDocumentSchema(other.getDocumentSchema());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getDocumentSchemaFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the document schema to update.
     * Format:
     * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the document schema to update.
     * Format:
     * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the document schema to update.
     * Format:
     * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the document schema to update.
     * Format:
     * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the document schema to update.
     * Format:
     * projects/{project_number}/locations/{location}/documentSchemas/{document_schema_id}.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.contentwarehouse.v1.DocumentSchema documentSchema_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.DocumentSchema,
            com.google.cloud.contentwarehouse.v1.DocumentSchema.Builder,
            com.google.cloud.contentwarehouse.v1.DocumentSchemaOrBuilder>
        documentSchemaBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The document schema to update with.
     * </pre>
     *
     * <code>
     * .google.cloud.contentwarehouse.v1.DocumentSchema document_schema = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the documentSchema field is set.
     */
    public boolean hasDocumentSchema() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The document schema to update with.
     * </pre>
     *
     * <code>
     * .google.cloud.contentwarehouse.v1.DocumentSchema document_schema = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The documentSchema.
     */
    public com.google.cloud.contentwarehouse.v1.DocumentSchema getDocumentSchema() {
      if (documentSchemaBuilder_ == null) {
        return documentSchema_ == null
            ? com.google.cloud.contentwarehouse.v1.DocumentSchema.getDefaultInstance()
            : documentSchema_;
      } else {
        return documentSchemaBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The document schema to update with.
     * </pre>
     *
     * <code>
     * .google.cloud.contentwarehouse.v1.DocumentSchema document_schema = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDocumentSchema(com.google.cloud.contentwarehouse.v1.DocumentSchema value) {
      if (documentSchemaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        documentSchema_ = value;
      } else {
        documentSchemaBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The document schema to update with.
     * </pre>
     *
     * <code>
     * .google.cloud.contentwarehouse.v1.DocumentSchema document_schema = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDocumentSchema(
        com.google.cloud.contentwarehouse.v1.DocumentSchema.Builder builderForValue) {
      if (documentSchemaBuilder_ == null) {
        documentSchema_ = builderForValue.build();
      } else {
        documentSchemaBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The document schema to update with.
     * </pre>
     *
     * <code>
     * .google.cloud.contentwarehouse.v1.DocumentSchema document_schema = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeDocumentSchema(com.google.cloud.contentwarehouse.v1.DocumentSchema value) {
      if (documentSchemaBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && documentSchema_ != null
            && documentSchema_
                != com.google.cloud.contentwarehouse.v1.DocumentSchema.getDefaultInstance()) {
          getDocumentSchemaBuilder().mergeFrom(value);
        } else {
          documentSchema_ = value;
        }
      } else {
        documentSchemaBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The document schema to update with.
     * </pre>
     *
     * <code>
     * .google.cloud.contentwarehouse.v1.DocumentSchema document_schema = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearDocumentSchema() {
      bitField0_ = (bitField0_ & ~0x00000002);
      documentSchema_ = null;
      if (documentSchemaBuilder_ != null) {
        documentSchemaBuilder_.dispose();
        documentSchemaBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The document schema to update with.
     * </pre>
     *
     * <code>
     * .google.cloud.contentwarehouse.v1.DocumentSchema document_schema = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.contentwarehouse.v1.DocumentSchema.Builder getDocumentSchemaBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDocumentSchemaFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The document schema to update with.
     * </pre>
     *
     * <code>
     * .google.cloud.contentwarehouse.v1.DocumentSchema document_schema = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.contentwarehouse.v1.DocumentSchemaOrBuilder
        getDocumentSchemaOrBuilder() {
      if (documentSchemaBuilder_ != null) {
        return documentSchemaBuilder_.getMessageOrBuilder();
      } else {
        return documentSchema_ == null
            ? com.google.cloud.contentwarehouse.v1.DocumentSchema.getDefaultInstance()
            : documentSchema_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The document schema to update with.
     * </pre>
     *
     * <code>
     * .google.cloud.contentwarehouse.v1.DocumentSchema document_schema = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.DocumentSchema,
            com.google.cloud.contentwarehouse.v1.DocumentSchema.Builder,
            com.google.cloud.contentwarehouse.v1.DocumentSchemaOrBuilder>
        getDocumentSchemaFieldBuilder() {
      if (documentSchemaBuilder_ == null) {
        documentSchemaBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.contentwarehouse.v1.DocumentSchema,
                com.google.cloud.contentwarehouse.v1.DocumentSchema.Builder,
                com.google.cloud.contentwarehouse.v1.DocumentSchemaOrBuilder>(
                getDocumentSchema(), getParentForChildren(), isClean());
        documentSchema_ = null;
      }
      return documentSchemaBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest)
  private static final com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest();
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateDocumentSchemaRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateDocumentSchemaRequest>() {
        @java.lang.Override
        public UpdateDocumentSchemaRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateDocumentSchemaRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateDocumentSchemaRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.UpdateDocumentSchemaRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
