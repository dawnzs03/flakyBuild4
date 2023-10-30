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
// source: google/cloud/aiplatform/v1beta1/evaluated_annotation.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Explanation result of the prediction produced by the Model.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation}
 */
public final class EvaluatedAnnotationExplanation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation)
    EvaluatedAnnotationExplanationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EvaluatedAnnotationExplanation.newBuilder() to construct.
  private EvaluatedAnnotationExplanation(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EvaluatedAnnotationExplanation() {
    explanationType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EvaluatedAnnotationExplanation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationProto
        .internal_static_google_cloud_aiplatform_v1beta1_EvaluatedAnnotationExplanation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationProto
        .internal_static_google_cloud_aiplatform_v1beta1_EvaluatedAnnotationExplanation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation.class,
            com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation.Builder.class);
  }

  public static final int EXPLANATION_TYPE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object explanationType_ = "";
  /**
   *
   *
   * <pre>
   * Explanation type.
   *
   * For AutoML Image Classification models, possible values are:
   *
   *   * `image-integrated-gradients`
   *   * `image-xrai`
   * </pre>
   *
   * <code>string explanation_type = 1;</code>
   *
   * @return The explanationType.
   */
  @java.lang.Override
  public java.lang.String getExplanationType() {
    java.lang.Object ref = explanationType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      explanationType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Explanation type.
   *
   * For AutoML Image Classification models, possible values are:
   *
   *   * `image-integrated-gradients`
   *   * `image-xrai`
   * </pre>
   *
   * <code>string explanation_type = 1;</code>
   *
   * @return The bytes for explanationType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getExplanationTypeBytes() {
    java.lang.Object ref = explanationType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      explanationType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPLANATION_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1beta1.Explanation explanation_;
  /**
   *
   *
   * <pre>
   * Explanation attribution response details.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Explanation explanation = 2;</code>
   *
   * @return Whether the explanation field is set.
   */
  @java.lang.Override
  public boolean hasExplanation() {
    return explanation_ != null;
  }
  /**
   *
   *
   * <pre>
   * Explanation attribution response details.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Explanation explanation = 2;</code>
   *
   * @return The explanation.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.Explanation getExplanation() {
    return explanation_ == null
        ? com.google.cloud.aiplatform.v1beta1.Explanation.getDefaultInstance()
        : explanation_;
  }
  /**
   *
   *
   * <pre>
   * Explanation attribution response details.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Explanation explanation = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ExplanationOrBuilder getExplanationOrBuilder() {
    return explanation_ == null
        ? com.google.cloud.aiplatform.v1beta1.Explanation.getDefaultInstance()
        : explanation_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(explanationType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, explanationType_);
    }
    if (explanation_ != null) {
      output.writeMessage(2, getExplanation());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(explanationType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, explanationType_);
    }
    if (explanation_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getExplanation());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation other =
        (com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation) obj;

    if (!getExplanationType().equals(other.getExplanationType())) return false;
    if (hasExplanation() != other.hasExplanation()) return false;
    if (hasExplanation()) {
      if (!getExplanation().equals(other.getExplanation())) return false;
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
    hash = (37 * hash) + EXPLANATION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getExplanationType().hashCode();
    if (hasExplanation()) {
      hash = (37 * hash) + EXPLANATION_FIELD_NUMBER;
      hash = (53 * hash) + getExplanation().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation prototype) {
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
   * Explanation result of the prediction produced by the Model.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation)
      com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationProto
          .internal_static_google_cloud_aiplatform_v1beta1_EvaluatedAnnotationExplanation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationProto
          .internal_static_google_cloud_aiplatform_v1beta1_EvaluatedAnnotationExplanation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation.class,
              com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation.Builder.class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      explanationType_ = "";
      explanation_ = null;
      if (explanationBuilder_ != null) {
        explanationBuilder_.dispose();
        explanationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationProto
          .internal_static_google_cloud_aiplatform_v1beta1_EvaluatedAnnotationExplanation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation build() {
      com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation buildPartial() {
      com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation result =
          new com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.explanationType_ = explanationType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.explanation_ =
            explanationBuilder_ == null ? explanation_ : explanationBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation) {
        return mergeFrom(
            (com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation
              .getDefaultInstance()) return this;
      if (!other.getExplanationType().isEmpty()) {
        explanationType_ = other.explanationType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasExplanation()) {
        mergeExplanation(other.getExplanation());
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
                explanationType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getExplanationFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object explanationType_ = "";
    /**
     *
     *
     * <pre>
     * Explanation type.
     *
     * For AutoML Image Classification models, possible values are:
     *
     *   * `image-integrated-gradients`
     *   * `image-xrai`
     * </pre>
     *
     * <code>string explanation_type = 1;</code>
     *
     * @return The explanationType.
     */
    public java.lang.String getExplanationType() {
      java.lang.Object ref = explanationType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        explanationType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Explanation type.
     *
     * For AutoML Image Classification models, possible values are:
     *
     *   * `image-integrated-gradients`
     *   * `image-xrai`
     * </pre>
     *
     * <code>string explanation_type = 1;</code>
     *
     * @return The bytes for explanationType.
     */
    public com.google.protobuf.ByteString getExplanationTypeBytes() {
      java.lang.Object ref = explanationType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        explanationType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Explanation type.
     *
     * For AutoML Image Classification models, possible values are:
     *
     *   * `image-integrated-gradients`
     *   * `image-xrai`
     * </pre>
     *
     * <code>string explanation_type = 1;</code>
     *
     * @param value The explanationType to set.
     * @return This builder for chaining.
     */
    public Builder setExplanationType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      explanationType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Explanation type.
     *
     * For AutoML Image Classification models, possible values are:
     *
     *   * `image-integrated-gradients`
     *   * `image-xrai`
     * </pre>
     *
     * <code>string explanation_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExplanationType() {
      explanationType_ = getDefaultInstance().getExplanationType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Explanation type.
     *
     * For AutoML Image Classification models, possible values are:
     *
     *   * `image-integrated-gradients`
     *   * `image-xrai`
     * </pre>
     *
     * <code>string explanation_type = 1;</code>
     *
     * @param value The bytes for explanationType to set.
     * @return This builder for chaining.
     */
    public Builder setExplanationTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      explanationType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1beta1.Explanation explanation_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Explanation,
            com.google.cloud.aiplatform.v1beta1.Explanation.Builder,
            com.google.cloud.aiplatform.v1beta1.ExplanationOrBuilder>
        explanationBuilder_;
    /**
     *
     *
     * <pre>
     * Explanation attribution response details.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Explanation explanation = 2;</code>
     *
     * @return Whether the explanation field is set.
     */
    public boolean hasExplanation() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Explanation attribution response details.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Explanation explanation = 2;</code>
     *
     * @return The explanation.
     */
    public com.google.cloud.aiplatform.v1beta1.Explanation getExplanation() {
      if (explanationBuilder_ == null) {
        return explanation_ == null
            ? com.google.cloud.aiplatform.v1beta1.Explanation.getDefaultInstance()
            : explanation_;
      } else {
        return explanationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Explanation attribution response details.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Explanation explanation = 2;</code>
     */
    public Builder setExplanation(com.google.cloud.aiplatform.v1beta1.Explanation value) {
      if (explanationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        explanation_ = value;
      } else {
        explanationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Explanation attribution response details.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Explanation explanation = 2;</code>
     */
    public Builder setExplanation(
        com.google.cloud.aiplatform.v1beta1.Explanation.Builder builderForValue) {
      if (explanationBuilder_ == null) {
        explanation_ = builderForValue.build();
      } else {
        explanationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Explanation attribution response details.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Explanation explanation = 2;</code>
     */
    public Builder mergeExplanation(com.google.cloud.aiplatform.v1beta1.Explanation value) {
      if (explanationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && explanation_ != null
            && explanation_
                != com.google.cloud.aiplatform.v1beta1.Explanation.getDefaultInstance()) {
          getExplanationBuilder().mergeFrom(value);
        } else {
          explanation_ = value;
        }
      } else {
        explanationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Explanation attribution response details.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Explanation explanation = 2;</code>
     */
    public Builder clearExplanation() {
      bitField0_ = (bitField0_ & ~0x00000002);
      explanation_ = null;
      if (explanationBuilder_ != null) {
        explanationBuilder_.dispose();
        explanationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Explanation attribution response details.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Explanation explanation = 2;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.Explanation.Builder getExplanationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getExplanationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Explanation attribution response details.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Explanation explanation = 2;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.ExplanationOrBuilder getExplanationOrBuilder() {
      if (explanationBuilder_ != null) {
        return explanationBuilder_.getMessageOrBuilder();
      } else {
        return explanation_ == null
            ? com.google.cloud.aiplatform.v1beta1.Explanation.getDefaultInstance()
            : explanation_;
      }
    }
    /**
     *
     *
     * <pre>
     * Explanation attribution response details.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.Explanation explanation = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.Explanation,
            com.google.cloud.aiplatform.v1beta1.Explanation.Builder,
            com.google.cloud.aiplatform.v1beta1.ExplanationOrBuilder>
        getExplanationFieldBuilder() {
      if (explanationBuilder_ == null) {
        explanationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.Explanation,
                com.google.cloud.aiplatform.v1beta1.Explanation.Builder,
                com.google.cloud.aiplatform.v1beta1.ExplanationOrBuilder>(
                getExplanation(), getParentForChildren(), isClean());
        explanation_ = null;
      }
      return explanationBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation)
  private static final com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation();
  }

  public static com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EvaluatedAnnotationExplanation> PARSER =
      new com.google.protobuf.AbstractParser<EvaluatedAnnotationExplanation>() {
        @java.lang.Override
        public EvaluatedAnnotationExplanation parsePartialFrom(
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

  public static com.google.protobuf.Parser<EvaluatedAnnotationExplanation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EvaluatedAnnotationExplanation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
