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
// source: google/analytics/admin/v1alpha/resources.proto

package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Settings values for Google Signals.  This is a singleton resource.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.GoogleSignalsSettings}
 */
public final class GoogleSignalsSettings extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.GoogleSignalsSettings)
    GoogleSignalsSettingsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GoogleSignalsSettings.newBuilder() to construct.
  private GoogleSignalsSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GoogleSignalsSettings() {
    name_ = "";
    state_ = 0;
    consent_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GoogleSignalsSettings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.ResourcesProto
        .internal_static_google_analytics_admin_v1alpha_GoogleSignalsSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.ResourcesProto
        .internal_static_google_analytics_admin_v1alpha_GoogleSignalsSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.GoogleSignalsSettings.class,
            com.google.analytics.admin.v1alpha.GoogleSignalsSettings.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Output only. Resource name of this setting.
   * Format: properties/{property_id}/googleSignalsSettings
   * Example: "properties/1000/googleSignalsSettings"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
   * Output only. Resource name of this setting.
   * Format: properties/{property_id}/googleSignalsSettings
   * Example: "properties/1000/googleSignalsSettings"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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

  public static final int STATE_FIELD_NUMBER = 3;
  private int state_ = 0;
  /**
   *
   *
   * <pre>
   * Status of this setting.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.GoogleSignalsState state = 3;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override
  public int getStateValue() {
    return state_;
  }
  /**
   *
   *
   * <pre>
   * Status of this setting.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.GoogleSignalsState state = 3;</code>
   *
   * @return The state.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.GoogleSignalsState getState() {
    com.google.analytics.admin.v1alpha.GoogleSignalsState result =
        com.google.analytics.admin.v1alpha.GoogleSignalsState.forNumber(state_);
    return result == null
        ? com.google.analytics.admin.v1alpha.GoogleSignalsState.UNRECOGNIZED
        : result;
  }

  public static final int CONSENT_FIELD_NUMBER = 4;
  private int consent_ = 0;
  /**
   *
   *
   * <pre>
   * Output only. Terms of Service acceptance.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.GoogleSignalsConsent consent = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for consent.
   */
  @java.lang.Override
  public int getConsentValue() {
    return consent_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Terms of Service acceptance.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.GoogleSignalsConsent consent = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The consent.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.GoogleSignalsConsent getConsent() {
    com.google.analytics.admin.v1alpha.GoogleSignalsConsent result =
        com.google.analytics.admin.v1alpha.GoogleSignalsConsent.forNumber(consent_);
    return result == null
        ? com.google.analytics.admin.v1alpha.GoogleSignalsConsent.UNRECOGNIZED
        : result;
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
    if (state_
        != com.google.analytics.admin.v1alpha.GoogleSignalsState.GOOGLE_SIGNALS_STATE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, state_);
    }
    if (consent_
        != com.google.analytics.admin.v1alpha.GoogleSignalsConsent
            .GOOGLE_SIGNALS_CONSENT_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(4, consent_);
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
    if (state_
        != com.google.analytics.admin.v1alpha.GoogleSignalsState.GOOGLE_SIGNALS_STATE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, state_);
    }
    if (consent_
        != com.google.analytics.admin.v1alpha.GoogleSignalsConsent
            .GOOGLE_SIGNALS_CONSENT_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(4, consent_);
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.GoogleSignalsSettings)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.GoogleSignalsSettings other =
        (com.google.analytics.admin.v1alpha.GoogleSignalsSettings) obj;

    if (!getName().equals(other.getName())) return false;
    if (state_ != other.state_) return false;
    if (consent_ != other.consent_) return false;
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
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (37 * hash) + CONSENT_FIELD_NUMBER;
    hash = (53 * hash) + consent_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.GoogleSignalsSettings parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.GoogleSignalsSettings parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.GoogleSignalsSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.GoogleSignalsSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.GoogleSignalsSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.GoogleSignalsSettings parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.GoogleSignalsSettings parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.GoogleSignalsSettings parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.GoogleSignalsSettings parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.GoogleSignalsSettings parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.GoogleSignalsSettings parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.GoogleSignalsSettings parseFrom(
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
      com.google.analytics.admin.v1alpha.GoogleSignalsSettings prototype) {
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
   * Settings values for Google Signals.  This is a singleton resource.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.GoogleSignalsSettings}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.GoogleSignalsSettings)
      com.google.analytics.admin.v1alpha.GoogleSignalsSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_GoogleSignalsSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_GoogleSignalsSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.GoogleSignalsSettings.class,
              com.google.analytics.admin.v1alpha.GoogleSignalsSettings.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.GoogleSignalsSettings.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      state_ = 0;
      consent_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.ResourcesProto
          .internal_static_google_analytics_admin_v1alpha_GoogleSignalsSettings_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.GoogleSignalsSettings getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.GoogleSignalsSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.GoogleSignalsSettings build() {
      com.google.analytics.admin.v1alpha.GoogleSignalsSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.GoogleSignalsSettings buildPartial() {
      com.google.analytics.admin.v1alpha.GoogleSignalsSettings result =
          new com.google.analytics.admin.v1alpha.GoogleSignalsSettings(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.admin.v1alpha.GoogleSignalsSettings result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.state_ = state_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.consent_ = consent_;
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
      if (other instanceof com.google.analytics.admin.v1alpha.GoogleSignalsSettings) {
        return mergeFrom((com.google.analytics.admin.v1alpha.GoogleSignalsSettings) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.GoogleSignalsSettings other) {
      if (other == com.google.analytics.admin.v1alpha.GoogleSignalsSettings.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (other.consent_ != 0) {
        setConsentValue(other.getConsentValue());
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
            case 24:
              {
                state_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 24
            case 32:
              {
                consent_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 32
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
     * Output only. Resource name of this setting.
     * Format: properties/{property_id}/googleSignalsSettings
     * Example: "properties/1000/googleSignalsSettings"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. Resource name of this setting.
     * Format: properties/{property_id}/googleSignalsSettings
     * Example: "properties/1000/googleSignalsSettings"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. Resource name of this setting.
     * Format: properties/{property_id}/googleSignalsSettings
     * Example: "properties/1000/googleSignalsSettings"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. Resource name of this setting.
     * Format: properties/{property_id}/googleSignalsSettings
     * Example: "properties/1000/googleSignalsSettings"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
     * Output only. Resource name of this setting.
     * Format: properties/{property_id}/googleSignalsSettings
     * Example: "properties/1000/googleSignalsSettings"
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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

    private int state_ = 0;
    /**
     *
     *
     * <pre>
     * Status of this setting.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.GoogleSignalsState state = 3;</code>
     *
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override
    public int getStateValue() {
      return state_;
    }
    /**
     *
     *
     * <pre>
     * Status of this setting.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.GoogleSignalsState state = 3;</code>
     *
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Status of this setting.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.GoogleSignalsState state = 3;</code>
     *
     * @return The state.
     */
    @java.lang.Override
    public com.google.analytics.admin.v1alpha.GoogleSignalsState getState() {
      com.google.analytics.admin.v1alpha.GoogleSignalsState result =
          com.google.analytics.admin.v1alpha.GoogleSignalsState.forNumber(state_);
      return result == null
          ? com.google.analytics.admin.v1alpha.GoogleSignalsState.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Status of this setting.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.GoogleSignalsState state = 3;</code>
     *
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.google.analytics.admin.v1alpha.GoogleSignalsState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Status of this setting.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.GoogleSignalsState state = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      state_ = 0;
      onChanged();
      return this;
    }

    private int consent_ = 0;
    /**
     *
     *
     * <pre>
     * Output only. Terms of Service acceptance.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.GoogleSignalsConsent consent = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The enum numeric value on the wire for consent.
     */
    @java.lang.Override
    public int getConsentValue() {
      return consent_;
    }
    /**
     *
     *
     * <pre>
     * Output only. Terms of Service acceptance.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.GoogleSignalsConsent consent = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The enum numeric value on the wire for consent to set.
     * @return This builder for chaining.
     */
    public Builder setConsentValue(int value) {
      consent_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Terms of Service acceptance.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.GoogleSignalsConsent consent = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The consent.
     */
    @java.lang.Override
    public com.google.analytics.admin.v1alpha.GoogleSignalsConsent getConsent() {
      com.google.analytics.admin.v1alpha.GoogleSignalsConsent result =
          com.google.analytics.admin.v1alpha.GoogleSignalsConsent.forNumber(consent_);
      return result == null
          ? com.google.analytics.admin.v1alpha.GoogleSignalsConsent.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Output only. Terms of Service acceptance.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.GoogleSignalsConsent consent = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The consent to set.
     * @return This builder for chaining.
     */
    public Builder setConsent(com.google.analytics.admin.v1alpha.GoogleSignalsConsent value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      consent_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Terms of Service acceptance.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.GoogleSignalsConsent consent = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConsent() {
      bitField0_ = (bitField0_ & ~0x00000004);
      consent_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.GoogleSignalsSettings)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.GoogleSignalsSettings)
  private static final com.google.analytics.admin.v1alpha.GoogleSignalsSettings DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.GoogleSignalsSettings();
  }

  public static com.google.analytics.admin.v1alpha.GoogleSignalsSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GoogleSignalsSettings> PARSER =
      new com.google.protobuf.AbstractParser<GoogleSignalsSettings>() {
        @java.lang.Override
        public GoogleSignalsSettings parsePartialFrom(
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

  public static com.google.protobuf.Parser<GoogleSignalsSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GoogleSignalsSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.GoogleSignalsSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
