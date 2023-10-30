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
// source: google/cloud/datastream/v1alpha1/datastream_resources.proto

package com.google.cloud.datastream.v1alpha1;

/**
 *
 *
 * <pre>
 * Oracle table.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datastream.v1alpha1.OracleTable}
 */
public final class OracleTable extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datastream.v1alpha1.OracleTable)
    OracleTableOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use OracleTable.newBuilder() to construct.
  private OracleTable(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private OracleTable() {
    tableName_ = "";
    oracleColumns_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new OracleTable();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
        .internal_static_google_cloud_datastream_v1alpha1_OracleTable_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
        .internal_static_google_cloud_datastream_v1alpha1_OracleTable_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datastream.v1alpha1.OracleTable.class,
            com.google.cloud.datastream.v1alpha1.OracleTable.Builder.class);
  }

  public static final int TABLE_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object tableName_ = "";
  /**
   *
   *
   * <pre>
   * Table name.
   * </pre>
   *
   * <code>string table_name = 1;</code>
   *
   * @return The tableName.
   */
  @java.lang.Override
  public java.lang.String getTableName() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tableName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Table name.
   * </pre>
   *
   * <code>string table_name = 1;</code>
   *
   * @return The bytes for tableName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTableNameBytes() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      tableName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORACLE_COLUMNS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.datastream.v1alpha1.OracleColumn> oracleColumns_;
  /**
   *
   *
   * <pre>
   * Oracle columns in the schema.
   * When unspecified as part of inclue/exclude lists, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.datastream.v1alpha1.OracleColumn> getOracleColumnsList() {
    return oracleColumns_;
  }
  /**
   *
   *
   * <pre>
   * Oracle columns in the schema.
   * When unspecified as part of inclue/exclude lists, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.datastream.v1alpha1.OracleColumnOrBuilder>
      getOracleColumnsOrBuilderList() {
    return oracleColumns_;
  }
  /**
   *
   *
   * <pre>
   * Oracle columns in the schema.
   * When unspecified as part of inclue/exclude lists, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
   */
  @java.lang.Override
  public int getOracleColumnsCount() {
    return oracleColumns_.size();
  }
  /**
   *
   *
   * <pre>
   * Oracle columns in the schema.
   * When unspecified as part of inclue/exclude lists, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.OracleColumn getOracleColumns(int index) {
    return oracleColumns_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Oracle columns in the schema.
   * When unspecified as part of inclue/exclude lists, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.OracleColumnOrBuilder getOracleColumnsOrBuilder(
      int index) {
    return oracleColumns_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tableName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tableName_);
    }
    for (int i = 0; i < oracleColumns_.size(); i++) {
      output.writeMessage(2, oracleColumns_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tableName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tableName_);
    }
    for (int i = 0; i < oracleColumns_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, oracleColumns_.get(i));
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
    if (!(obj instanceof com.google.cloud.datastream.v1alpha1.OracleTable)) {
      return super.equals(obj);
    }
    com.google.cloud.datastream.v1alpha1.OracleTable other =
        (com.google.cloud.datastream.v1alpha1.OracleTable) obj;

    if (!getTableName().equals(other.getTableName())) return false;
    if (!getOracleColumnsList().equals(other.getOracleColumnsList())) return false;
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
    hash = (37 * hash) + TABLE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTableName().hashCode();
    if (getOracleColumnsCount() > 0) {
      hash = (37 * hash) + ORACLE_COLUMNS_FIELD_NUMBER;
      hash = (53 * hash) + getOracleColumnsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datastream.v1alpha1.OracleTable parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1alpha1.OracleTable parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.OracleTable parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1alpha1.OracleTable parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.OracleTable parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1alpha1.OracleTable parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.OracleTable parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1alpha1.OracleTable parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.OracleTable parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1alpha1.OracleTable parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.OracleTable parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1alpha1.OracleTable parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datastream.v1alpha1.OracleTable prototype) {
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
   * Oracle table.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datastream.v1alpha1.OracleTable}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datastream.v1alpha1.OracleTable)
      com.google.cloud.datastream.v1alpha1.OracleTableOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
          .internal_static_google_cloud_datastream_v1alpha1_OracleTable_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
          .internal_static_google_cloud_datastream_v1alpha1_OracleTable_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datastream.v1alpha1.OracleTable.class,
              com.google.cloud.datastream.v1alpha1.OracleTable.Builder.class);
    }

    // Construct using com.google.cloud.datastream.v1alpha1.OracleTable.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      tableName_ = "";
      if (oracleColumnsBuilder_ == null) {
        oracleColumns_ = java.util.Collections.emptyList();
      } else {
        oracleColumns_ = null;
        oracleColumnsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
          .internal_static_google_cloud_datastream_v1alpha1_OracleTable_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.OracleTable getDefaultInstanceForType() {
      return com.google.cloud.datastream.v1alpha1.OracleTable.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.OracleTable build() {
      com.google.cloud.datastream.v1alpha1.OracleTable result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.OracleTable buildPartial() {
      com.google.cloud.datastream.v1alpha1.OracleTable result =
          new com.google.cloud.datastream.v1alpha1.OracleTable(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.datastream.v1alpha1.OracleTable result) {
      if (oracleColumnsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          oracleColumns_ = java.util.Collections.unmodifiableList(oracleColumns_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.oracleColumns_ = oracleColumns_;
      } else {
        result.oracleColumns_ = oracleColumnsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.datastream.v1alpha1.OracleTable result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tableName_ = tableName_;
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
      if (other instanceof com.google.cloud.datastream.v1alpha1.OracleTable) {
        return mergeFrom((com.google.cloud.datastream.v1alpha1.OracleTable) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datastream.v1alpha1.OracleTable other) {
      if (other == com.google.cloud.datastream.v1alpha1.OracleTable.getDefaultInstance())
        return this;
      if (!other.getTableName().isEmpty()) {
        tableName_ = other.tableName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (oracleColumnsBuilder_ == null) {
        if (!other.oracleColumns_.isEmpty()) {
          if (oracleColumns_.isEmpty()) {
            oracleColumns_ = other.oracleColumns_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureOracleColumnsIsMutable();
            oracleColumns_.addAll(other.oracleColumns_);
          }
          onChanged();
        }
      } else {
        if (!other.oracleColumns_.isEmpty()) {
          if (oracleColumnsBuilder_.isEmpty()) {
            oracleColumnsBuilder_.dispose();
            oracleColumnsBuilder_ = null;
            oracleColumns_ = other.oracleColumns_;
            bitField0_ = (bitField0_ & ~0x00000002);
            oracleColumnsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getOracleColumnsFieldBuilder()
                    : null;
          } else {
            oracleColumnsBuilder_.addAllMessages(other.oracleColumns_);
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
                tableName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                com.google.cloud.datastream.v1alpha1.OracleColumn m =
                    input.readMessage(
                        com.google.cloud.datastream.v1alpha1.OracleColumn.parser(),
                        extensionRegistry);
                if (oracleColumnsBuilder_ == null) {
                  ensureOracleColumnsIsMutable();
                  oracleColumns_.add(m);
                } else {
                  oracleColumnsBuilder_.addMessage(m);
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

    private java.lang.Object tableName_ = "";
    /**
     *
     *
     * <pre>
     * Table name.
     * </pre>
     *
     * <code>string table_name = 1;</code>
     *
     * @return The tableName.
     */
    public java.lang.String getTableName() {
      java.lang.Object ref = tableName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tableName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Table name.
     * </pre>
     *
     * <code>string table_name = 1;</code>
     *
     * @return The bytes for tableName.
     */
    public com.google.protobuf.ByteString getTableNameBytes() {
      java.lang.Object ref = tableName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        tableName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Table name.
     * </pre>
     *
     * <code>string table_name = 1;</code>
     *
     * @param value The tableName to set.
     * @return This builder for chaining.
     */
    public Builder setTableName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      tableName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Table name.
     * </pre>
     *
     * <code>string table_name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTableName() {
      tableName_ = getDefaultInstance().getTableName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Table name.
     * </pre>
     *
     * <code>string table_name = 1;</code>
     *
     * @param value The bytes for tableName to set.
     * @return This builder for chaining.
     */
    public Builder setTableNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      tableName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.datastream.v1alpha1.OracleColumn> oracleColumns_ =
        java.util.Collections.emptyList();

    private void ensureOracleColumnsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        oracleColumns_ =
            new java.util.ArrayList<com.google.cloud.datastream.v1alpha1.OracleColumn>(
                oracleColumns_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datastream.v1alpha1.OracleColumn,
            com.google.cloud.datastream.v1alpha1.OracleColumn.Builder,
            com.google.cloud.datastream.v1alpha1.OracleColumnOrBuilder>
        oracleColumnsBuilder_;

    /**
     *
     *
     * <pre>
     * Oracle columns in the schema.
     * When unspecified as part of inclue/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
     */
    public java.util.List<com.google.cloud.datastream.v1alpha1.OracleColumn>
        getOracleColumnsList() {
      if (oracleColumnsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(oracleColumns_);
      } else {
        return oracleColumnsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Oracle columns in the schema.
     * When unspecified as part of inclue/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
     */
    public int getOracleColumnsCount() {
      if (oracleColumnsBuilder_ == null) {
        return oracleColumns_.size();
      } else {
        return oracleColumnsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Oracle columns in the schema.
     * When unspecified as part of inclue/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
     */
    public com.google.cloud.datastream.v1alpha1.OracleColumn getOracleColumns(int index) {
      if (oracleColumnsBuilder_ == null) {
        return oracleColumns_.get(index);
      } else {
        return oracleColumnsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Oracle columns in the schema.
     * When unspecified as part of inclue/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
     */
    public Builder setOracleColumns(
        int index, com.google.cloud.datastream.v1alpha1.OracleColumn value) {
      if (oracleColumnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOracleColumnsIsMutable();
        oracleColumns_.set(index, value);
        onChanged();
      } else {
        oracleColumnsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Oracle columns in the schema.
     * When unspecified as part of inclue/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
     */
    public Builder setOracleColumns(
        int index, com.google.cloud.datastream.v1alpha1.OracleColumn.Builder builderForValue) {
      if (oracleColumnsBuilder_ == null) {
        ensureOracleColumnsIsMutable();
        oracleColumns_.set(index, builderForValue.build());
        onChanged();
      } else {
        oracleColumnsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Oracle columns in the schema.
     * When unspecified as part of inclue/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
     */
    public Builder addOracleColumns(com.google.cloud.datastream.v1alpha1.OracleColumn value) {
      if (oracleColumnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOracleColumnsIsMutable();
        oracleColumns_.add(value);
        onChanged();
      } else {
        oracleColumnsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Oracle columns in the schema.
     * When unspecified as part of inclue/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
     */
    public Builder addOracleColumns(
        int index, com.google.cloud.datastream.v1alpha1.OracleColumn value) {
      if (oracleColumnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOracleColumnsIsMutable();
        oracleColumns_.add(index, value);
        onChanged();
      } else {
        oracleColumnsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Oracle columns in the schema.
     * When unspecified as part of inclue/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
     */
    public Builder addOracleColumns(
        com.google.cloud.datastream.v1alpha1.OracleColumn.Builder builderForValue) {
      if (oracleColumnsBuilder_ == null) {
        ensureOracleColumnsIsMutable();
        oracleColumns_.add(builderForValue.build());
        onChanged();
      } else {
        oracleColumnsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Oracle columns in the schema.
     * When unspecified as part of inclue/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
     */
    public Builder addOracleColumns(
        int index, com.google.cloud.datastream.v1alpha1.OracleColumn.Builder builderForValue) {
      if (oracleColumnsBuilder_ == null) {
        ensureOracleColumnsIsMutable();
        oracleColumns_.add(index, builderForValue.build());
        onChanged();
      } else {
        oracleColumnsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Oracle columns in the schema.
     * When unspecified as part of inclue/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
     */
    public Builder addAllOracleColumns(
        java.lang.Iterable<? extends com.google.cloud.datastream.v1alpha1.OracleColumn> values) {
      if (oracleColumnsBuilder_ == null) {
        ensureOracleColumnsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, oracleColumns_);
        onChanged();
      } else {
        oracleColumnsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Oracle columns in the schema.
     * When unspecified as part of inclue/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
     */
    public Builder clearOracleColumns() {
      if (oracleColumnsBuilder_ == null) {
        oracleColumns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        oracleColumnsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Oracle columns in the schema.
     * When unspecified as part of inclue/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
     */
    public Builder removeOracleColumns(int index) {
      if (oracleColumnsBuilder_ == null) {
        ensureOracleColumnsIsMutable();
        oracleColumns_.remove(index);
        onChanged();
      } else {
        oracleColumnsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Oracle columns in the schema.
     * When unspecified as part of inclue/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
     */
    public com.google.cloud.datastream.v1alpha1.OracleColumn.Builder getOracleColumnsBuilder(
        int index) {
      return getOracleColumnsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Oracle columns in the schema.
     * When unspecified as part of inclue/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
     */
    public com.google.cloud.datastream.v1alpha1.OracleColumnOrBuilder getOracleColumnsOrBuilder(
        int index) {
      if (oracleColumnsBuilder_ == null) {
        return oracleColumns_.get(index);
      } else {
        return oracleColumnsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Oracle columns in the schema.
     * When unspecified as part of inclue/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
     */
    public java.util.List<? extends com.google.cloud.datastream.v1alpha1.OracleColumnOrBuilder>
        getOracleColumnsOrBuilderList() {
      if (oracleColumnsBuilder_ != null) {
        return oracleColumnsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(oracleColumns_);
      }
    }
    /**
     *
     *
     * <pre>
     * Oracle columns in the schema.
     * When unspecified as part of inclue/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
     */
    public com.google.cloud.datastream.v1alpha1.OracleColumn.Builder addOracleColumnsBuilder() {
      return getOracleColumnsFieldBuilder()
          .addBuilder(com.google.cloud.datastream.v1alpha1.OracleColumn.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Oracle columns in the schema.
     * When unspecified as part of inclue/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
     */
    public com.google.cloud.datastream.v1alpha1.OracleColumn.Builder addOracleColumnsBuilder(
        int index) {
      return getOracleColumnsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.datastream.v1alpha1.OracleColumn.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Oracle columns in the schema.
     * When unspecified as part of inclue/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
     */
    public java.util.List<com.google.cloud.datastream.v1alpha1.OracleColumn.Builder>
        getOracleColumnsBuilderList() {
      return getOracleColumnsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datastream.v1alpha1.OracleColumn,
            com.google.cloud.datastream.v1alpha1.OracleColumn.Builder,
            com.google.cloud.datastream.v1alpha1.OracleColumnOrBuilder>
        getOracleColumnsFieldBuilder() {
      if (oracleColumnsBuilder_ == null) {
        oracleColumnsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.datastream.v1alpha1.OracleColumn,
                com.google.cloud.datastream.v1alpha1.OracleColumn.Builder,
                com.google.cloud.datastream.v1alpha1.OracleColumnOrBuilder>(
                oracleColumns_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        oracleColumns_ = null;
      }
      return oracleColumnsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datastream.v1alpha1.OracleTable)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datastream.v1alpha1.OracleTable)
  private static final com.google.cloud.datastream.v1alpha1.OracleTable DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datastream.v1alpha1.OracleTable();
  }

  public static com.google.cloud.datastream.v1alpha1.OracleTable getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OracleTable> PARSER =
      new com.google.protobuf.AbstractParser<OracleTable>() {
        @java.lang.Override
        public OracleTable parsePartialFrom(
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

  public static com.google.protobuf.Parser<OracleTable> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OracleTable> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.OracleTable getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
