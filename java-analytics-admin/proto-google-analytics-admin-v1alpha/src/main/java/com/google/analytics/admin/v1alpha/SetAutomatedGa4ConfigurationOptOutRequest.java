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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Request for setting the opt out status for the automated GA4 setup process.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest}
 */
public final class SetAutomatedGa4ConfigurationOptOutRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest)
    SetAutomatedGa4ConfigurationOptOutRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SetAutomatedGa4ConfigurationOptOutRequest.newBuilder() to construct.
  private SetAutomatedGa4ConfigurationOptOutRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SetAutomatedGa4ConfigurationOptOutRequest() {
    property_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SetAutomatedGa4ConfigurationOptOutRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_SetAutomatedGa4ConfigurationOptOutRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_SetAutomatedGa4ConfigurationOptOutRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest.class,
            com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest.Builder
                .class);
  }

  public static final int PROPERTY_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object property_ = "";
  /**
   *
   *
   * <pre>
   * Required. The UA property to set the opt out status. Note this request uses
   * the internal property ID, not the tracking ID of the form UA-XXXXXX-YY.
   * Format: properties/{internalWebPropertyId}
   * Example: properties/1234
   * </pre>
   *
   * <code>string property = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The property.
   */
  @java.lang.Override
  public java.lang.String getProperty() {
    java.lang.Object ref = property_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      property_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The UA property to set the opt out status. Note this request uses
   * the internal property ID, not the tracking ID of the form UA-XXXXXX-YY.
   * Format: properties/{internalWebPropertyId}
   * Example: properties/1234
   * </pre>
   *
   * <code>string property = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for property.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPropertyBytes() {
    java.lang.Object ref = property_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      property_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPT_OUT_FIELD_NUMBER = 2;
  private boolean optOut_ = false;
  /**
   *
   *
   * <pre>
   * The status to set.
   * </pre>
   *
   * <code>bool opt_out = 2;</code>
   *
   * @return The optOut.
   */
  @java.lang.Override
  public boolean getOptOut() {
    return optOut_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(property_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, property_);
    }
    if (optOut_ != false) {
      output.writeBool(2, optOut_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(property_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, property_);
    }
    if (optOut_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, optOut_);
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
    if (!(obj
        instanceof com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest other =
        (com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest) obj;

    if (!getProperty().equals(other.getProperty())) return false;
    if (getOptOut() != other.getOptOut()) return false;
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
    hash = (37 * hash) + PROPERTY_FIELD_NUMBER;
    hash = (53 * hash) + getProperty().hashCode();
    hash = (37 * hash) + OPT_OUT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getOptOut());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest
      parseFrom(
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
      com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest prototype) {
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
   * Request for setting the opt out status for the automated GA4 setup process.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest)
      com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_SetAutomatedGa4ConfigurationOptOutRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_SetAutomatedGa4ConfigurationOptOutRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest.class,
              com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      property_ = "";
      optOut_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_SetAutomatedGa4ConfigurationOptOutRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest build() {
      com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest
        buildPartial() {
      com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest result =
          new com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.property_ = property_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.optOut_ = optOut_;
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
      if (other
          instanceof com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest) {
        return mergeFrom(
            (com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest other) {
      if (other
          == com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest
              .getDefaultInstance()) return this;
      if (!other.getProperty().isEmpty()) {
        property_ = other.property_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getOptOut() != false) {
        setOptOut(other.getOptOut());
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
                property_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                optOut_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private java.lang.Object property_ = "";
    /**
     *
     *
     * <pre>
     * Required. The UA property to set the opt out status. Note this request uses
     * the internal property ID, not the tracking ID of the form UA-XXXXXX-YY.
     * Format: properties/{internalWebPropertyId}
     * Example: properties/1234
     * </pre>
     *
     * <code>string property = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The property.
     */
    public java.lang.String getProperty() {
      java.lang.Object ref = property_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        property_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The UA property to set the opt out status. Note this request uses
     * the internal property ID, not the tracking ID of the form UA-XXXXXX-YY.
     * Format: properties/{internalWebPropertyId}
     * Example: properties/1234
     * </pre>
     *
     * <code>string property = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for property.
     */
    public com.google.protobuf.ByteString getPropertyBytes() {
      java.lang.Object ref = property_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        property_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The UA property to set the opt out status. Note this request uses
     * the internal property ID, not the tracking ID of the form UA-XXXXXX-YY.
     * Format: properties/{internalWebPropertyId}
     * Example: properties/1234
     * </pre>
     *
     * <code>string property = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The property to set.
     * @return This builder for chaining.
     */
    public Builder setProperty(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      property_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The UA property to set the opt out status. Note this request uses
     * the internal property ID, not the tracking ID of the form UA-XXXXXX-YY.
     * Format: properties/{internalWebPropertyId}
     * Example: properties/1234
     * </pre>
     *
     * <code>string property = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProperty() {
      property_ = getDefaultInstance().getProperty();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The UA property to set the opt out status. Note this request uses
     * the internal property ID, not the tracking ID of the form UA-XXXXXX-YY.
     * Format: properties/{internalWebPropertyId}
     * Example: properties/1234
     * </pre>
     *
     * <code>string property = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for property to set.
     * @return This builder for chaining.
     */
    public Builder setPropertyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      property_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean optOut_;
    /**
     *
     *
     * <pre>
     * The status to set.
     * </pre>
     *
     * <code>bool opt_out = 2;</code>
     *
     * @return The optOut.
     */
    @java.lang.Override
    public boolean getOptOut() {
      return optOut_;
    }
    /**
     *
     *
     * <pre>
     * The status to set.
     * </pre>
     *
     * <code>bool opt_out = 2;</code>
     *
     * @param value The optOut to set.
     * @return This builder for chaining.
     */
    public Builder setOptOut(boolean value) {

      optOut_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The status to set.
     * </pre>
     *
     * <code>bool opt_out = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOptOut() {
      bitField0_ = (bitField0_ & ~0x00000002);
      optOut_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest)
  private static final com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest();
  }

  public static com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetAutomatedGa4ConfigurationOptOutRequest>
      PARSER =
          new com.google.protobuf.AbstractParser<SetAutomatedGa4ConfigurationOptOutRequest>() {
            @java.lang.Override
            public SetAutomatedGa4ConfigurationOptOutRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<SetAutomatedGa4ConfigurationOptOutRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetAutomatedGa4ConfigurationOptOutRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.SetAutomatedGa4ConfigurationOptOutRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
