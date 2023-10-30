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
// source: google/area120/tables/v1alpha1/tables.proto

package com.google.area120.tables.v1alpha1;

/**
 *
 *
 * <pre>
 * Request message for TablesService.UpdateRow.
 * </pre>
 *
 * Protobuf type {@code google.area120.tables.v1alpha1.UpdateRowRequest}
 */
public final class UpdateRowRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.area120.tables.v1alpha1.UpdateRowRequest)
    UpdateRowRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateRowRequest.newBuilder() to construct.
  private UpdateRowRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateRowRequest() {
    view_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateRowRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.area120.tables.v1alpha1.TablesProto
        .internal_static_google_area120_tables_v1alpha1_UpdateRowRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.area120.tables.v1alpha1.TablesProto
        .internal_static_google_area120_tables_v1alpha1_UpdateRowRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.area120.tables.v1alpha1.UpdateRowRequest.class,
            com.google.area120.tables.v1alpha1.UpdateRowRequest.Builder.class);
  }

  public static final int ROW_FIELD_NUMBER = 1;
  private com.google.area120.tables.v1alpha1.Row row_;
  /**
   *
   *
   * <pre>
   * Required. The row to update.
   * </pre>
   *
   * <code>.google.area120.tables.v1alpha1.Row row = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the row field is set.
   */
  @java.lang.Override
  public boolean hasRow() {
    return row_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The row to update.
   * </pre>
   *
   * <code>.google.area120.tables.v1alpha1.Row row = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The row.
   */
  @java.lang.Override
  public com.google.area120.tables.v1alpha1.Row getRow() {
    return row_ == null ? com.google.area120.tables.v1alpha1.Row.getDefaultInstance() : row_;
  }
  /**
   *
   *
   * <pre>
   * Required. The row to update.
   * </pre>
   *
   * <code>.google.area120.tables.v1alpha1.Row row = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.area120.tables.v1alpha1.RowOrBuilder getRowOrBuilder() {
    return row_ == null ? com.google.area120.tables.v1alpha1.Row.getDefaultInstance() : row_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int VIEW_FIELD_NUMBER = 3;
  private int view_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. Column key to use for values in the row.
   * Defaults to user entered name.
   * </pre>
   *
   * <code>.google.area120.tables.v1alpha1.View view = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for view.
   */
  @java.lang.Override
  public int getViewValue() {
    return view_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Column key to use for values in the row.
   * Defaults to user entered name.
   * </pre>
   *
   * <code>.google.area120.tables.v1alpha1.View view = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The view.
   */
  @java.lang.Override
  public com.google.area120.tables.v1alpha1.View getView() {
    com.google.area120.tables.v1alpha1.View result =
        com.google.area120.tables.v1alpha1.View.forNumber(view_);
    return result == null ? com.google.area120.tables.v1alpha1.View.UNRECOGNIZED : result;
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
    if (row_ != null) {
      output.writeMessage(1, getRow());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    if (view_ != com.google.area120.tables.v1alpha1.View.VIEW_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, view_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (row_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getRow());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    if (view_ != com.google.area120.tables.v1alpha1.View.VIEW_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, view_);
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
    if (!(obj instanceof com.google.area120.tables.v1alpha1.UpdateRowRequest)) {
      return super.equals(obj);
    }
    com.google.area120.tables.v1alpha1.UpdateRowRequest other =
        (com.google.area120.tables.v1alpha1.UpdateRowRequest) obj;

    if (hasRow() != other.hasRow()) return false;
    if (hasRow()) {
      if (!getRow().equals(other.getRow())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (view_ != other.view_) return false;
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
    if (hasRow()) {
      hash = (37 * hash) + ROW_FIELD_NUMBER;
      hash = (53 * hash) + getRow().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (37 * hash) + VIEW_FIELD_NUMBER;
    hash = (53 * hash) + view_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.area120.tables.v1alpha1.UpdateRowRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.area120.tables.v1alpha1.UpdateRowRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.area120.tables.v1alpha1.UpdateRowRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.area120.tables.v1alpha1.UpdateRowRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.area120.tables.v1alpha1.UpdateRowRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.area120.tables.v1alpha1.UpdateRowRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.area120.tables.v1alpha1.UpdateRowRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.area120.tables.v1alpha1.UpdateRowRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.area120.tables.v1alpha1.UpdateRowRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.area120.tables.v1alpha1.UpdateRowRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.area120.tables.v1alpha1.UpdateRowRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.area120.tables.v1alpha1.UpdateRowRequest parseFrom(
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

  public static Builder newBuilder(com.google.area120.tables.v1alpha1.UpdateRowRequest prototype) {
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
   * Request message for TablesService.UpdateRow.
   * </pre>
   *
   * Protobuf type {@code google.area120.tables.v1alpha1.UpdateRowRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.area120.tables.v1alpha1.UpdateRowRequest)
      com.google.area120.tables.v1alpha1.UpdateRowRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.area120.tables.v1alpha1.TablesProto
          .internal_static_google_area120_tables_v1alpha1_UpdateRowRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.area120.tables.v1alpha1.TablesProto
          .internal_static_google_area120_tables_v1alpha1_UpdateRowRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.area120.tables.v1alpha1.UpdateRowRequest.class,
              com.google.area120.tables.v1alpha1.UpdateRowRequest.Builder.class);
    }

    // Construct using com.google.area120.tables.v1alpha1.UpdateRowRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      row_ = null;
      if (rowBuilder_ != null) {
        rowBuilder_.dispose();
        rowBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      view_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.area120.tables.v1alpha1.TablesProto
          .internal_static_google_area120_tables_v1alpha1_UpdateRowRequest_descriptor;
    }

    @java.lang.Override
    public com.google.area120.tables.v1alpha1.UpdateRowRequest getDefaultInstanceForType() {
      return com.google.area120.tables.v1alpha1.UpdateRowRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.area120.tables.v1alpha1.UpdateRowRequest build() {
      com.google.area120.tables.v1alpha1.UpdateRowRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.area120.tables.v1alpha1.UpdateRowRequest buildPartial() {
      com.google.area120.tables.v1alpha1.UpdateRowRequest result =
          new com.google.area120.tables.v1alpha1.UpdateRowRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.area120.tables.v1alpha1.UpdateRowRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.row_ = rowBuilder_ == null ? row_ : rowBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.view_ = view_;
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
      if (other instanceof com.google.area120.tables.v1alpha1.UpdateRowRequest) {
        return mergeFrom((com.google.area120.tables.v1alpha1.UpdateRowRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.area120.tables.v1alpha1.UpdateRowRequest other) {
      if (other == com.google.area120.tables.v1alpha1.UpdateRowRequest.getDefaultInstance())
        return this;
      if (other.hasRow()) {
        mergeRow(other.getRow());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.view_ != 0) {
        setViewValue(other.getViewValue());
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
                input.readMessage(getRowFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                view_ = input.readEnum();
                bitField0_ |= 0x00000004;
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

    private com.google.area120.tables.v1alpha1.Row row_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.area120.tables.v1alpha1.Row,
            com.google.area120.tables.v1alpha1.Row.Builder,
            com.google.area120.tables.v1alpha1.RowOrBuilder>
        rowBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The row to update.
     * </pre>
     *
     * <code>.google.area120.tables.v1alpha1.Row row = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the row field is set.
     */
    public boolean hasRow() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The row to update.
     * </pre>
     *
     * <code>.google.area120.tables.v1alpha1.Row row = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The row.
     */
    public com.google.area120.tables.v1alpha1.Row getRow() {
      if (rowBuilder_ == null) {
        return row_ == null ? com.google.area120.tables.v1alpha1.Row.getDefaultInstance() : row_;
      } else {
        return rowBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The row to update.
     * </pre>
     *
     * <code>.google.area120.tables.v1alpha1.Row row = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRow(com.google.area120.tables.v1alpha1.Row value) {
      if (rowBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        row_ = value;
      } else {
        rowBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The row to update.
     * </pre>
     *
     * <code>.google.area120.tables.v1alpha1.Row row = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRow(com.google.area120.tables.v1alpha1.Row.Builder builderForValue) {
      if (rowBuilder_ == null) {
        row_ = builderForValue.build();
      } else {
        rowBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The row to update.
     * </pre>
     *
     * <code>.google.area120.tables.v1alpha1.Row row = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeRow(com.google.area120.tables.v1alpha1.Row value) {
      if (rowBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && row_ != null
            && row_ != com.google.area120.tables.v1alpha1.Row.getDefaultInstance()) {
          getRowBuilder().mergeFrom(value);
        } else {
          row_ = value;
        }
      } else {
        rowBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The row to update.
     * </pre>
     *
     * <code>.google.area120.tables.v1alpha1.Row row = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearRow() {
      bitField0_ = (bitField0_ & ~0x00000001);
      row_ = null;
      if (rowBuilder_ != null) {
        rowBuilder_.dispose();
        rowBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The row to update.
     * </pre>
     *
     * <code>.google.area120.tables.v1alpha1.Row row = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.area120.tables.v1alpha1.Row.Builder getRowBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRowFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The row to update.
     * </pre>
     *
     * <code>.google.area120.tables.v1alpha1.Row row = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.area120.tables.v1alpha1.RowOrBuilder getRowOrBuilder() {
      if (rowBuilder_ != null) {
        return rowBuilder_.getMessageOrBuilder();
      } else {
        return row_ == null ? com.google.area120.tables.v1alpha1.Row.getDefaultInstance() : row_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The row to update.
     * </pre>
     *
     * <code>.google.area120.tables.v1alpha1.Row row = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.area120.tables.v1alpha1.Row,
            com.google.area120.tables.v1alpha1.Row.Builder,
            com.google.area120.tables.v1alpha1.RowOrBuilder>
        getRowFieldBuilder() {
      if (rowBuilder_ == null) {
        rowBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.area120.tables.v1alpha1.Row,
                com.google.area120.tables.v1alpha1.Row.Builder,
                com.google.area120.tables.v1alpha1.RowOrBuilder>(
                getRow(), getParentForChildren(), isClean());
        row_ = null;
      }
      return rowBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * The list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private int view_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. Column key to use for values in the row.
     * Defaults to user entered name.
     * </pre>
     *
     * <code>
     * .google.area120.tables.v1alpha1.View view = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for view.
     */
    @java.lang.Override
    public int getViewValue() {
      return view_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Column key to use for values in the row.
     * Defaults to user entered name.
     * </pre>
     *
     * <code>
     * .google.area120.tables.v1alpha1.View view = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for view to set.
     * @return This builder for chaining.
     */
    public Builder setViewValue(int value) {
      view_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Column key to use for values in the row.
     * Defaults to user entered name.
     * </pre>
     *
     * <code>
     * .google.area120.tables.v1alpha1.View view = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The view.
     */
    @java.lang.Override
    public com.google.area120.tables.v1alpha1.View getView() {
      com.google.area120.tables.v1alpha1.View result =
          com.google.area120.tables.v1alpha1.View.forNumber(view_);
      return result == null ? com.google.area120.tables.v1alpha1.View.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. Column key to use for values in the row.
     * Defaults to user entered name.
     * </pre>
     *
     * <code>
     * .google.area120.tables.v1alpha1.View view = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The view to set.
     * @return This builder for chaining.
     */
    public Builder setView(com.google.area120.tables.v1alpha1.View value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      view_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Column key to use for values in the row.
     * Defaults to user entered name.
     * </pre>
     *
     * <code>
     * .google.area120.tables.v1alpha1.View view = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearView() {
      bitField0_ = (bitField0_ & ~0x00000004);
      view_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.area120.tables.v1alpha1.UpdateRowRequest)
  }

  // @@protoc_insertion_point(class_scope:google.area120.tables.v1alpha1.UpdateRowRequest)
  private static final com.google.area120.tables.v1alpha1.UpdateRowRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.area120.tables.v1alpha1.UpdateRowRequest();
  }

  public static com.google.area120.tables.v1alpha1.UpdateRowRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateRowRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateRowRequest>() {
        @java.lang.Override
        public UpdateRowRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateRowRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateRowRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.area120.tables.v1alpha1.UpdateRowRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
