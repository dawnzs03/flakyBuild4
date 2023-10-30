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
// source: google/cloud/contentwarehouse/v1/document.proto

package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * DateTime values.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.DateTimeArray}
 */
public final class DateTimeArray extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.DateTimeArray)
    DateTimeArrayOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DateTimeArray.newBuilder() to construct.
  private DateTimeArray(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DateTimeArray() {
    values_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DateTimeArray();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.DocumentProto
        .internal_static_google_cloud_contentwarehouse_v1_DateTimeArray_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.DocumentProto
        .internal_static_google_cloud_contentwarehouse_v1_DateTimeArray_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.DateTimeArray.class,
            com.google.cloud.contentwarehouse.v1.DateTimeArray.Builder.class);
  }

  public static final int VALUES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.type.DateTime> values_;
  /**
   *
   *
   * <pre>
   * List of datetime values.
   * Both OffsetDateTime and ZonedDateTime are supported.
   * </pre>
   *
   * <code>repeated .google.type.DateTime values = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.type.DateTime> getValuesList() {
    return values_;
  }
  /**
   *
   *
   * <pre>
   * List of datetime values.
   * Both OffsetDateTime and ZonedDateTime are supported.
   * </pre>
   *
   * <code>repeated .google.type.DateTime values = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.type.DateTimeOrBuilder> getValuesOrBuilderList() {
    return values_;
  }
  /**
   *
   *
   * <pre>
   * List of datetime values.
   * Both OffsetDateTime and ZonedDateTime are supported.
   * </pre>
   *
   * <code>repeated .google.type.DateTime values = 1;</code>
   */
  @java.lang.Override
  public int getValuesCount() {
    return values_.size();
  }
  /**
   *
   *
   * <pre>
   * List of datetime values.
   * Both OffsetDateTime and ZonedDateTime are supported.
   * </pre>
   *
   * <code>repeated .google.type.DateTime values = 1;</code>
   */
  @java.lang.Override
  public com.google.type.DateTime getValues(int index) {
    return values_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of datetime values.
   * Both OffsetDateTime and ZonedDateTime are supported.
   * </pre>
   *
   * <code>repeated .google.type.DateTime values = 1;</code>
   */
  @java.lang.Override
  public com.google.type.DateTimeOrBuilder getValuesOrBuilder(int index) {
    return values_.get(index);
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
    for (int i = 0; i < values_.size(); i++) {
      output.writeMessage(1, values_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < values_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, values_.get(i));
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.DateTimeArray)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.DateTimeArray other =
        (com.google.cloud.contentwarehouse.v1.DateTimeArray) obj;

    if (!getValuesList().equals(other.getValuesList())) return false;
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
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.DateTimeArray parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.DateTimeArray parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.DateTimeArray parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.DateTimeArray parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.DateTimeArray parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.DateTimeArray parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.DateTimeArray parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.DateTimeArray parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.DateTimeArray parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.DateTimeArray parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.DateTimeArray parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.DateTimeArray parseFrom(
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

  public static Builder newBuilder(com.google.cloud.contentwarehouse.v1.DateTimeArray prototype) {
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
   * DateTime values.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.DateTimeArray}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.DateTimeArray)
      com.google.cloud.contentwarehouse.v1.DateTimeArrayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.DocumentProto
          .internal_static_google_cloud_contentwarehouse_v1_DateTimeArray_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.DocumentProto
          .internal_static_google_cloud_contentwarehouse_v1_DateTimeArray_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.DateTimeArray.class,
              com.google.cloud.contentwarehouse.v1.DateTimeArray.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.DateTimeArray.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
      } else {
        values_ = null;
        valuesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.DocumentProto
          .internal_static_google_cloud_contentwarehouse_v1_DateTimeArray_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.DateTimeArray getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.DateTimeArray.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.DateTimeArray build() {
      com.google.cloud.contentwarehouse.v1.DateTimeArray result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.DateTimeArray buildPartial() {
      com.google.cloud.contentwarehouse.v1.DateTimeArray result =
          new com.google.cloud.contentwarehouse.v1.DateTimeArray(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.contentwarehouse.v1.DateTimeArray result) {
      if (valuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          values_ = java.util.Collections.unmodifiableList(values_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.values_ = values_;
      } else {
        result.values_ = valuesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.contentwarehouse.v1.DateTimeArray result) {
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.DateTimeArray) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.DateTimeArray) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.DateTimeArray other) {
      if (other == com.google.cloud.contentwarehouse.v1.DateTimeArray.getDefaultInstance())
        return this;
      if (valuesBuilder_ == null) {
        if (!other.values_.isEmpty()) {
          if (values_.isEmpty()) {
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureValuesIsMutable();
            values_.addAll(other.values_);
          }
          onChanged();
        }
      } else {
        if (!other.values_.isEmpty()) {
          if (valuesBuilder_.isEmpty()) {
            valuesBuilder_.dispose();
            valuesBuilder_ = null;
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000001);
            valuesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getValuesFieldBuilder()
                    : null;
          } else {
            valuesBuilder_.addAllMessages(other.values_);
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
                com.google.type.DateTime m =
                    input.readMessage(com.google.type.DateTime.parser(), extensionRegistry);
                if (valuesBuilder_ == null) {
                  ensureValuesIsMutable();
                  values_.add(m);
                } else {
                  valuesBuilder_.addMessage(m);
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

    private java.util.List<com.google.type.DateTime> values_ = java.util.Collections.emptyList();

    private void ensureValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        values_ = new java.util.ArrayList<com.google.type.DateTime>(values_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.type.DateTime,
            com.google.type.DateTime.Builder,
            com.google.type.DateTimeOrBuilder>
        valuesBuilder_;

    /**
     *
     *
     * <pre>
     * List of datetime values.
     * Both OffsetDateTime and ZonedDateTime are supported.
     * </pre>
     *
     * <code>repeated .google.type.DateTime values = 1;</code>
     */
    public java.util.List<com.google.type.DateTime> getValuesList() {
      if (valuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(values_);
      } else {
        return valuesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of datetime values.
     * Both OffsetDateTime and ZonedDateTime are supported.
     * </pre>
     *
     * <code>repeated .google.type.DateTime values = 1;</code>
     */
    public int getValuesCount() {
      if (valuesBuilder_ == null) {
        return values_.size();
      } else {
        return valuesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of datetime values.
     * Both OffsetDateTime and ZonedDateTime are supported.
     * </pre>
     *
     * <code>repeated .google.type.DateTime values = 1;</code>
     */
    public com.google.type.DateTime getValues(int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);
      } else {
        return valuesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of datetime values.
     * Both OffsetDateTime and ZonedDateTime are supported.
     * </pre>
     *
     * <code>repeated .google.type.DateTime values = 1;</code>
     */
    public Builder setValues(int index, com.google.type.DateTime value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.set(index, value);
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of datetime values.
     * Both OffsetDateTime and ZonedDateTime are supported.
     * </pre>
     *
     * <code>repeated .google.type.DateTime values = 1;</code>
     */
    public Builder setValues(int index, com.google.type.DateTime.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.set(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of datetime values.
     * Both OffsetDateTime and ZonedDateTime are supported.
     * </pre>
     *
     * <code>repeated .google.type.DateTime values = 1;</code>
     */
    public Builder addValues(com.google.type.DateTime value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of datetime values.
     * Both OffsetDateTime and ZonedDateTime are supported.
     * </pre>
     *
     * <code>repeated .google.type.DateTime values = 1;</code>
     */
    public Builder addValues(int index, com.google.type.DateTime value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(index, value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of datetime values.
     * Both OffsetDateTime and ZonedDateTime are supported.
     * </pre>
     *
     * <code>repeated .google.type.DateTime values = 1;</code>
     */
    public Builder addValues(com.google.type.DateTime.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of datetime values.
     * Both OffsetDateTime and ZonedDateTime are supported.
     * </pre>
     *
     * <code>repeated .google.type.DateTime values = 1;</code>
     */
    public Builder addValues(int index, com.google.type.DateTime.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of datetime values.
     * Both OffsetDateTime and ZonedDateTime are supported.
     * </pre>
     *
     * <code>repeated .google.type.DateTime values = 1;</code>
     */
    public Builder addAllValues(java.lang.Iterable<? extends com.google.type.DateTime> values) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, values_);
        onChanged();
      } else {
        valuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of datetime values.
     * Both OffsetDateTime and ZonedDateTime are supported.
     * </pre>
     *
     * <code>repeated .google.type.DateTime values = 1;</code>
     */
    public Builder clearValues() {
      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        valuesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of datetime values.
     * Both OffsetDateTime and ZonedDateTime are supported.
     * </pre>
     *
     * <code>repeated .google.type.DateTime values = 1;</code>
     */
    public Builder removeValues(int index) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.remove(index);
        onChanged();
      } else {
        valuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of datetime values.
     * Both OffsetDateTime and ZonedDateTime are supported.
     * </pre>
     *
     * <code>repeated .google.type.DateTime values = 1;</code>
     */
    public com.google.type.DateTime.Builder getValuesBuilder(int index) {
      return getValuesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of datetime values.
     * Both OffsetDateTime and ZonedDateTime are supported.
     * </pre>
     *
     * <code>repeated .google.type.DateTime values = 1;</code>
     */
    public com.google.type.DateTimeOrBuilder getValuesOrBuilder(int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);
      } else {
        return valuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of datetime values.
     * Both OffsetDateTime and ZonedDateTime are supported.
     * </pre>
     *
     * <code>repeated .google.type.DateTime values = 1;</code>
     */
    public java.util.List<? extends com.google.type.DateTimeOrBuilder> getValuesOrBuilderList() {
      if (valuesBuilder_ != null) {
        return valuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(values_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of datetime values.
     * Both OffsetDateTime and ZonedDateTime are supported.
     * </pre>
     *
     * <code>repeated .google.type.DateTime values = 1;</code>
     */
    public com.google.type.DateTime.Builder addValuesBuilder() {
      return getValuesFieldBuilder().addBuilder(com.google.type.DateTime.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of datetime values.
     * Both OffsetDateTime and ZonedDateTime are supported.
     * </pre>
     *
     * <code>repeated .google.type.DateTime values = 1;</code>
     */
    public com.google.type.DateTime.Builder addValuesBuilder(int index) {
      return getValuesFieldBuilder()
          .addBuilder(index, com.google.type.DateTime.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of datetime values.
     * Both OffsetDateTime and ZonedDateTime are supported.
     * </pre>
     *
     * <code>repeated .google.type.DateTime values = 1;</code>
     */
    public java.util.List<com.google.type.DateTime.Builder> getValuesBuilderList() {
      return getValuesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.type.DateTime,
            com.google.type.DateTime.Builder,
            com.google.type.DateTimeOrBuilder>
        getValuesFieldBuilder() {
      if (valuesBuilder_ == null) {
        valuesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.type.DateTime,
                com.google.type.DateTime.Builder,
                com.google.type.DateTimeOrBuilder>(
                values_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        values_ = null;
      }
      return valuesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.DateTimeArray)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.DateTimeArray)
  private static final com.google.cloud.contentwarehouse.v1.DateTimeArray DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.DateTimeArray();
  }

  public static com.google.cloud.contentwarehouse.v1.DateTimeArray getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DateTimeArray> PARSER =
      new com.google.protobuf.AbstractParser<DateTimeArray>() {
        @java.lang.Override
        public DateTimeArray parsePartialFrom(
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

  public static com.google.protobuf.Parser<DateTimeArray> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DateTimeArray> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.DateTimeArray getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
