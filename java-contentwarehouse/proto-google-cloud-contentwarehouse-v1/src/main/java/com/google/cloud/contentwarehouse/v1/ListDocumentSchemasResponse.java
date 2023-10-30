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
 * Response message for DocumentSchemaService.ListDocumentSchemas.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse}
 */
public final class ListDocumentSchemasResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse)
    ListDocumentSchemasResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListDocumentSchemasResponse.newBuilder() to construct.
  private ListDocumentSchemasResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListDocumentSchemasResponse() {
    documentSchemas_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListDocumentSchemasResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.DocumentSchemaServiceProto
        .internal_static_google_cloud_contentwarehouse_v1_ListDocumentSchemasResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.DocumentSchemaServiceProto
        .internal_static_google_cloud_contentwarehouse_v1_ListDocumentSchemasResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse.class,
            com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse.Builder.class);
  }

  public static final int DOCUMENT_SCHEMAS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.contentwarehouse.v1.DocumentSchema> documentSchemas_;
  /**
   *
   *
   * <pre>
   * The document schemas from the specified parent.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.contentwarehouse.v1.DocumentSchema>
      getDocumentSchemasList() {
    return documentSchemas_;
  }
  /**
   *
   *
   * <pre>
   * The document schemas from the specified parent.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.contentwarehouse.v1.DocumentSchemaOrBuilder>
      getDocumentSchemasOrBuilderList() {
    return documentSchemas_;
  }
  /**
   *
   *
   * <pre>
   * The document schemas from the specified parent.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
   */
  @java.lang.Override
  public int getDocumentSchemasCount() {
    return documentSchemas_.size();
  }
  /**
   *
   *
   * <pre>
   * The document schemas from the specified parent.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.DocumentSchema getDocumentSchemas(int index) {
    return documentSchemas_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The document schemas from the specified parent.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.DocumentSchemaOrBuilder getDocumentSchemasOrBuilder(
      int index) {
    return documentSchemas_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < documentSchemas_.size(); i++) {
      output.writeMessage(1, documentSchemas_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < documentSchemas_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, documentSchemas_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse other =
        (com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse) obj;

    if (!getDocumentSchemasList().equals(other.getDocumentSchemasList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getDocumentSchemasCount() > 0) {
      hash = (37 * hash) + DOCUMENT_SCHEMAS_FIELD_NUMBER;
      hash = (53 * hash) + getDocumentSchemasList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse parseFrom(
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
      com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse prototype) {
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
   * Response message for DocumentSchemaService.ListDocumentSchemas.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse)
      com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.DocumentSchemaServiceProto
          .internal_static_google_cloud_contentwarehouse_v1_ListDocumentSchemasResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.DocumentSchemaServiceProto
          .internal_static_google_cloud_contentwarehouse_v1_ListDocumentSchemasResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse.class,
              com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (documentSchemasBuilder_ == null) {
        documentSchemas_ = java.util.Collections.emptyList();
      } else {
        documentSchemas_ = null;
        documentSchemasBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.DocumentSchemaServiceProto
          .internal_static_google_cloud_contentwarehouse_v1_ListDocumentSchemasResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse
        getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse build() {
      com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse buildPartial() {
      com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse result =
          new com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse result) {
      if (documentSchemasBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          documentSchemas_ = java.util.Collections.unmodifiableList(documentSchemas_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.documentSchemas_ = documentSchemas_;
      } else {
        result.documentSchemas_ = documentSchemasBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse other) {
      if (other
          == com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse.getDefaultInstance())
        return this;
      if (documentSchemasBuilder_ == null) {
        if (!other.documentSchemas_.isEmpty()) {
          if (documentSchemas_.isEmpty()) {
            documentSchemas_ = other.documentSchemas_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDocumentSchemasIsMutable();
            documentSchemas_.addAll(other.documentSchemas_);
          }
          onChanged();
        }
      } else {
        if (!other.documentSchemas_.isEmpty()) {
          if (documentSchemasBuilder_.isEmpty()) {
            documentSchemasBuilder_.dispose();
            documentSchemasBuilder_ = null;
            documentSchemas_ = other.documentSchemas_;
            bitField0_ = (bitField0_ & ~0x00000001);
            documentSchemasBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDocumentSchemasFieldBuilder()
                    : null;
          } else {
            documentSchemasBuilder_.addAllMessages(other.documentSchemas_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.cloud.contentwarehouse.v1.DocumentSchema m =
                    input.readMessage(
                        com.google.cloud.contentwarehouse.v1.DocumentSchema.parser(),
                        extensionRegistry);
                if (documentSchemasBuilder_ == null) {
                  ensureDocumentSchemasIsMutable();
                  documentSchemas_.add(m);
                } else {
                  documentSchemasBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.contentwarehouse.v1.DocumentSchema> documentSchemas_ =
        java.util.Collections.emptyList();

    private void ensureDocumentSchemasIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        documentSchemas_ =
            new java.util.ArrayList<com.google.cloud.contentwarehouse.v1.DocumentSchema>(
                documentSchemas_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.DocumentSchema,
            com.google.cloud.contentwarehouse.v1.DocumentSchema.Builder,
            com.google.cloud.contentwarehouse.v1.DocumentSchemaOrBuilder>
        documentSchemasBuilder_;

    /**
     *
     *
     * <pre>
     * The document schemas from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
     */
    public java.util.List<com.google.cloud.contentwarehouse.v1.DocumentSchema>
        getDocumentSchemasList() {
      if (documentSchemasBuilder_ == null) {
        return java.util.Collections.unmodifiableList(documentSchemas_);
      } else {
        return documentSchemasBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The document schemas from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
     */
    public int getDocumentSchemasCount() {
      if (documentSchemasBuilder_ == null) {
        return documentSchemas_.size();
      } else {
        return documentSchemasBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The document schemas from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
     */
    public com.google.cloud.contentwarehouse.v1.DocumentSchema getDocumentSchemas(int index) {
      if (documentSchemasBuilder_ == null) {
        return documentSchemas_.get(index);
      } else {
        return documentSchemasBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The document schemas from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
     */
    public Builder setDocumentSchemas(
        int index, com.google.cloud.contentwarehouse.v1.DocumentSchema value) {
      if (documentSchemasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDocumentSchemasIsMutable();
        documentSchemas_.set(index, value);
        onChanged();
      } else {
        documentSchemasBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The document schemas from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
     */
    public Builder setDocumentSchemas(
        int index, com.google.cloud.contentwarehouse.v1.DocumentSchema.Builder builderForValue) {
      if (documentSchemasBuilder_ == null) {
        ensureDocumentSchemasIsMutable();
        documentSchemas_.set(index, builderForValue.build());
        onChanged();
      } else {
        documentSchemasBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The document schemas from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
     */
    public Builder addDocumentSchemas(com.google.cloud.contentwarehouse.v1.DocumentSchema value) {
      if (documentSchemasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDocumentSchemasIsMutable();
        documentSchemas_.add(value);
        onChanged();
      } else {
        documentSchemasBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The document schemas from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
     */
    public Builder addDocumentSchemas(
        int index, com.google.cloud.contentwarehouse.v1.DocumentSchema value) {
      if (documentSchemasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDocumentSchemasIsMutable();
        documentSchemas_.add(index, value);
        onChanged();
      } else {
        documentSchemasBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The document schemas from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
     */
    public Builder addDocumentSchemas(
        com.google.cloud.contentwarehouse.v1.DocumentSchema.Builder builderForValue) {
      if (documentSchemasBuilder_ == null) {
        ensureDocumentSchemasIsMutable();
        documentSchemas_.add(builderForValue.build());
        onChanged();
      } else {
        documentSchemasBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The document schemas from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
     */
    public Builder addDocumentSchemas(
        int index, com.google.cloud.contentwarehouse.v1.DocumentSchema.Builder builderForValue) {
      if (documentSchemasBuilder_ == null) {
        ensureDocumentSchemasIsMutable();
        documentSchemas_.add(index, builderForValue.build());
        onChanged();
      } else {
        documentSchemasBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The document schemas from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
     */
    public Builder addAllDocumentSchemas(
        java.lang.Iterable<? extends com.google.cloud.contentwarehouse.v1.DocumentSchema> values) {
      if (documentSchemasBuilder_ == null) {
        ensureDocumentSchemasIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, documentSchemas_);
        onChanged();
      } else {
        documentSchemasBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The document schemas from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
     */
    public Builder clearDocumentSchemas() {
      if (documentSchemasBuilder_ == null) {
        documentSchemas_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        documentSchemasBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The document schemas from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
     */
    public Builder removeDocumentSchemas(int index) {
      if (documentSchemasBuilder_ == null) {
        ensureDocumentSchemasIsMutable();
        documentSchemas_.remove(index);
        onChanged();
      } else {
        documentSchemasBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The document schemas from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
     */
    public com.google.cloud.contentwarehouse.v1.DocumentSchema.Builder getDocumentSchemasBuilder(
        int index) {
      return getDocumentSchemasFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The document schemas from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
     */
    public com.google.cloud.contentwarehouse.v1.DocumentSchemaOrBuilder getDocumentSchemasOrBuilder(
        int index) {
      if (documentSchemasBuilder_ == null) {
        return documentSchemas_.get(index);
      } else {
        return documentSchemasBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The document schemas from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.contentwarehouse.v1.DocumentSchemaOrBuilder>
        getDocumentSchemasOrBuilderList() {
      if (documentSchemasBuilder_ != null) {
        return documentSchemasBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(documentSchemas_);
      }
    }
    /**
     *
     *
     * <pre>
     * The document schemas from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
     */
    public com.google.cloud.contentwarehouse.v1.DocumentSchema.Builder addDocumentSchemasBuilder() {
      return getDocumentSchemasFieldBuilder()
          .addBuilder(com.google.cloud.contentwarehouse.v1.DocumentSchema.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The document schemas from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
     */
    public com.google.cloud.contentwarehouse.v1.DocumentSchema.Builder addDocumentSchemasBuilder(
        int index) {
      return getDocumentSchemasFieldBuilder()
          .addBuilder(
              index, com.google.cloud.contentwarehouse.v1.DocumentSchema.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The document schemas from the specified parent.
     * </pre>
     *
     * <code>repeated .google.cloud.contentwarehouse.v1.DocumentSchema document_schemas = 1;</code>
     */
    public java.util.List<com.google.cloud.contentwarehouse.v1.DocumentSchema.Builder>
        getDocumentSchemasBuilderList() {
      return getDocumentSchemasFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.DocumentSchema,
            com.google.cloud.contentwarehouse.v1.DocumentSchema.Builder,
            com.google.cloud.contentwarehouse.v1.DocumentSchemaOrBuilder>
        getDocumentSchemasFieldBuilder() {
      if (documentSchemasBuilder_ == null) {
        documentSchemasBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.contentwarehouse.v1.DocumentSchema,
                com.google.cloud.contentwarehouse.v1.DocumentSchema.Builder,
                com.google.cloud.contentwarehouse.v1.DocumentSchemaOrBuilder>(
                documentSchemas_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        documentSchemas_ = null;
      }
      return documentSchemasBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse)
  private static final com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse();
  }

  public static com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDocumentSchemasResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListDocumentSchemasResponse>() {
        @java.lang.Override
        public ListDocumentSchemasResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListDocumentSchemasResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDocumentSchemasResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.ListDocumentSchemasResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
