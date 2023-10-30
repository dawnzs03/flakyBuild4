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
// source: google/cloud/aiplatform/v1/prediction_service.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [PredictionService.RawPredict][google.cloud.aiplatform.v1.PredictionService.RawPredict].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.RawPredictRequest}
 */
public final class RawPredictRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.RawPredictRequest)
    RawPredictRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RawPredictRequest.newBuilder() to construct.
  private RawPredictRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RawPredictRequest() {
    endpoint_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RawPredictRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.PredictionServiceProto
        .internal_static_google_cloud_aiplatform_v1_RawPredictRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.PredictionServiceProto
        .internal_static_google_cloud_aiplatform_v1_RawPredictRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.RawPredictRequest.class,
            com.google.cloud.aiplatform.v1.RawPredictRequest.Builder.class);
  }

  public static final int ENDPOINT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object endpoint_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the Endpoint requested to serve the prediction.
   * Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>
   * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The endpoint.
   */
  @java.lang.Override
  public java.lang.String getEndpoint() {
    java.lang.Object ref = endpoint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endpoint_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the Endpoint requested to serve the prediction.
   * Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>
   * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for endpoint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEndpointBytes() {
    java.lang.Object ref = endpoint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      endpoint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HTTP_BODY_FIELD_NUMBER = 2;
  private com.google.api.HttpBody httpBody_;
  /**
   *
   *
   * <pre>
   * The prediction input. Supports HTTP headers and arbitrary data payload.
   *
   * A [DeployedModel][google.cloud.aiplatform.v1.DeployedModel] may have an
   * upper limit on the number of instances it supports per request. When this
   * limit it is exceeded for an AutoML model, the
   * [RawPredict][google.cloud.aiplatform.v1.PredictionService.RawPredict]
   * method returns an error. When this limit is exceeded for a custom-trained
   * model, the behavior varies depending on the model.
   *
   * You can specify the schema for each instance in the
   * [predict_schemata.instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri]
   * field when you create a [Model][google.cloud.aiplatform.v1.Model]. This
   * schema applies when you deploy the `Model` as a `DeployedModel` to an
   * [Endpoint][google.cloud.aiplatform.v1.Endpoint] and use the `RawPredict`
   * method.
   * </pre>
   *
   * <code>.google.api.HttpBody http_body = 2;</code>
   *
   * @return Whether the httpBody field is set.
   */
  @java.lang.Override
  public boolean hasHttpBody() {
    return httpBody_ != null;
  }
  /**
   *
   *
   * <pre>
   * The prediction input. Supports HTTP headers and arbitrary data payload.
   *
   * A [DeployedModel][google.cloud.aiplatform.v1.DeployedModel] may have an
   * upper limit on the number of instances it supports per request. When this
   * limit it is exceeded for an AutoML model, the
   * [RawPredict][google.cloud.aiplatform.v1.PredictionService.RawPredict]
   * method returns an error. When this limit is exceeded for a custom-trained
   * model, the behavior varies depending on the model.
   *
   * You can specify the schema for each instance in the
   * [predict_schemata.instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri]
   * field when you create a [Model][google.cloud.aiplatform.v1.Model]. This
   * schema applies when you deploy the `Model` as a `DeployedModel` to an
   * [Endpoint][google.cloud.aiplatform.v1.Endpoint] and use the `RawPredict`
   * method.
   * </pre>
   *
   * <code>.google.api.HttpBody http_body = 2;</code>
   *
   * @return The httpBody.
   */
  @java.lang.Override
  public com.google.api.HttpBody getHttpBody() {
    return httpBody_ == null ? com.google.api.HttpBody.getDefaultInstance() : httpBody_;
  }
  /**
   *
   *
   * <pre>
   * The prediction input. Supports HTTP headers and arbitrary data payload.
   *
   * A [DeployedModel][google.cloud.aiplatform.v1.DeployedModel] may have an
   * upper limit on the number of instances it supports per request. When this
   * limit it is exceeded for an AutoML model, the
   * [RawPredict][google.cloud.aiplatform.v1.PredictionService.RawPredict]
   * method returns an error. When this limit is exceeded for a custom-trained
   * model, the behavior varies depending on the model.
   *
   * You can specify the schema for each instance in the
   * [predict_schemata.instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri]
   * field when you create a [Model][google.cloud.aiplatform.v1.Model]. This
   * schema applies when you deploy the `Model` as a `DeployedModel` to an
   * [Endpoint][google.cloud.aiplatform.v1.Endpoint] and use the `RawPredict`
   * method.
   * </pre>
   *
   * <code>.google.api.HttpBody http_body = 2;</code>
   */
  @java.lang.Override
  public com.google.api.HttpBodyOrBuilder getHttpBodyOrBuilder() {
    return httpBody_ == null ? com.google.api.HttpBody.getDefaultInstance() : httpBody_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endpoint_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, endpoint_);
    }
    if (httpBody_ != null) {
      output.writeMessage(2, getHttpBody());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endpoint_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, endpoint_);
    }
    if (httpBody_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getHttpBody());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.RawPredictRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.RawPredictRequest other =
        (com.google.cloud.aiplatform.v1.RawPredictRequest) obj;

    if (!getEndpoint().equals(other.getEndpoint())) return false;
    if (hasHttpBody() != other.hasHttpBody()) return false;
    if (hasHttpBody()) {
      if (!getHttpBody().equals(other.getHttpBody())) return false;
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
    hash = (37 * hash) + ENDPOINT_FIELD_NUMBER;
    hash = (53 * hash) + getEndpoint().hashCode();
    if (hasHttpBody()) {
      hash = (37 * hash) + HTTP_BODY_FIELD_NUMBER;
      hash = (53 * hash) + getHttpBody().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.RawPredictRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.RawPredictRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.RawPredictRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.RawPredictRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.RawPredictRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.RawPredictRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.RawPredictRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.RawPredictRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.RawPredictRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.RawPredictRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.RawPredictRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.RawPredictRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.RawPredictRequest prototype) {
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
   * Request message for
   * [PredictionService.RawPredict][google.cloud.aiplatform.v1.PredictionService.RawPredict].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.RawPredictRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.RawPredictRequest)
      com.google.cloud.aiplatform.v1.RawPredictRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.PredictionServiceProto
          .internal_static_google_cloud_aiplatform_v1_RawPredictRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.PredictionServiceProto
          .internal_static_google_cloud_aiplatform_v1_RawPredictRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.RawPredictRequest.class,
              com.google.cloud.aiplatform.v1.RawPredictRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.RawPredictRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      endpoint_ = "";
      httpBody_ = null;
      if (httpBodyBuilder_ != null) {
        httpBodyBuilder_.dispose();
        httpBodyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.PredictionServiceProto
          .internal_static_google_cloud_aiplatform_v1_RawPredictRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.RawPredictRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.RawPredictRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.RawPredictRequest build() {
      com.google.cloud.aiplatform.v1.RawPredictRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.RawPredictRequest buildPartial() {
      com.google.cloud.aiplatform.v1.RawPredictRequest result =
          new com.google.cloud.aiplatform.v1.RawPredictRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.RawPredictRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.endpoint_ = endpoint_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.httpBody_ = httpBodyBuilder_ == null ? httpBody_ : httpBodyBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1.RawPredictRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1.RawPredictRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.RawPredictRequest other) {
      if (other == com.google.cloud.aiplatform.v1.RawPredictRequest.getDefaultInstance())
        return this;
      if (!other.getEndpoint().isEmpty()) {
        endpoint_ = other.endpoint_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasHttpBody()) {
        mergeHttpBody(other.getHttpBody());
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
                endpoint_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getHttpBodyFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object endpoint_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the Endpoint requested to serve the prediction.
     * Format:
     * `projects/{project}/locations/{location}/endpoints/{endpoint}`
     * </pre>
     *
     * <code>
     * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The endpoint.
     */
    public java.lang.String getEndpoint() {
      java.lang.Object ref = endpoint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endpoint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Endpoint requested to serve the prediction.
     * Format:
     * `projects/{project}/locations/{location}/endpoints/{endpoint}`
     * </pre>
     *
     * <code>
     * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for endpoint.
     */
    public com.google.protobuf.ByteString getEndpointBytes() {
      java.lang.Object ref = endpoint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        endpoint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Endpoint requested to serve the prediction.
     * Format:
     * `projects/{project}/locations/{location}/endpoints/{endpoint}`
     * </pre>
     *
     * <code>
     * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The endpoint to set.
     * @return This builder for chaining.
     */
    public Builder setEndpoint(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      endpoint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Endpoint requested to serve the prediction.
     * Format:
     * `projects/{project}/locations/{location}/endpoints/{endpoint}`
     * </pre>
     *
     * <code>
     * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEndpoint() {
      endpoint_ = getDefaultInstance().getEndpoint();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Endpoint requested to serve the prediction.
     * Format:
     * `projects/{project}/locations/{location}/endpoints/{endpoint}`
     * </pre>
     *
     * <code>
     * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for endpoint to set.
     * @return This builder for chaining.
     */
    public Builder setEndpointBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      endpoint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.api.HttpBody httpBody_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.HttpBody,
            com.google.api.HttpBody.Builder,
            com.google.api.HttpBodyOrBuilder>
        httpBodyBuilder_;
    /**
     *
     *
     * <pre>
     * The prediction input. Supports HTTP headers and arbitrary data payload.
     *
     * A [DeployedModel][google.cloud.aiplatform.v1.DeployedModel] may have an
     * upper limit on the number of instances it supports per request. When this
     * limit it is exceeded for an AutoML model, the
     * [RawPredict][google.cloud.aiplatform.v1.PredictionService.RawPredict]
     * method returns an error. When this limit is exceeded for a custom-trained
     * model, the behavior varies depending on the model.
     *
     * You can specify the schema for each instance in the
     * [predict_schemata.instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri]
     * field when you create a [Model][google.cloud.aiplatform.v1.Model]. This
     * schema applies when you deploy the `Model` as a `DeployedModel` to an
     * [Endpoint][google.cloud.aiplatform.v1.Endpoint] and use the `RawPredict`
     * method.
     * </pre>
     *
     * <code>.google.api.HttpBody http_body = 2;</code>
     *
     * @return Whether the httpBody field is set.
     */
    public boolean hasHttpBody() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The prediction input. Supports HTTP headers and arbitrary data payload.
     *
     * A [DeployedModel][google.cloud.aiplatform.v1.DeployedModel] may have an
     * upper limit on the number of instances it supports per request. When this
     * limit it is exceeded for an AutoML model, the
     * [RawPredict][google.cloud.aiplatform.v1.PredictionService.RawPredict]
     * method returns an error. When this limit is exceeded for a custom-trained
     * model, the behavior varies depending on the model.
     *
     * You can specify the schema for each instance in the
     * [predict_schemata.instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri]
     * field when you create a [Model][google.cloud.aiplatform.v1.Model]. This
     * schema applies when you deploy the `Model` as a `DeployedModel` to an
     * [Endpoint][google.cloud.aiplatform.v1.Endpoint] and use the `RawPredict`
     * method.
     * </pre>
     *
     * <code>.google.api.HttpBody http_body = 2;</code>
     *
     * @return The httpBody.
     */
    public com.google.api.HttpBody getHttpBody() {
      if (httpBodyBuilder_ == null) {
        return httpBody_ == null ? com.google.api.HttpBody.getDefaultInstance() : httpBody_;
      } else {
        return httpBodyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The prediction input. Supports HTTP headers and arbitrary data payload.
     *
     * A [DeployedModel][google.cloud.aiplatform.v1.DeployedModel] may have an
     * upper limit on the number of instances it supports per request. When this
     * limit it is exceeded for an AutoML model, the
     * [RawPredict][google.cloud.aiplatform.v1.PredictionService.RawPredict]
     * method returns an error. When this limit is exceeded for a custom-trained
     * model, the behavior varies depending on the model.
     *
     * You can specify the schema for each instance in the
     * [predict_schemata.instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri]
     * field when you create a [Model][google.cloud.aiplatform.v1.Model]. This
     * schema applies when you deploy the `Model` as a `DeployedModel` to an
     * [Endpoint][google.cloud.aiplatform.v1.Endpoint] and use the `RawPredict`
     * method.
     * </pre>
     *
     * <code>.google.api.HttpBody http_body = 2;</code>
     */
    public Builder setHttpBody(com.google.api.HttpBody value) {
      if (httpBodyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        httpBody_ = value;
      } else {
        httpBodyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The prediction input. Supports HTTP headers and arbitrary data payload.
     *
     * A [DeployedModel][google.cloud.aiplatform.v1.DeployedModel] may have an
     * upper limit on the number of instances it supports per request. When this
     * limit it is exceeded for an AutoML model, the
     * [RawPredict][google.cloud.aiplatform.v1.PredictionService.RawPredict]
     * method returns an error. When this limit is exceeded for a custom-trained
     * model, the behavior varies depending on the model.
     *
     * You can specify the schema for each instance in the
     * [predict_schemata.instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri]
     * field when you create a [Model][google.cloud.aiplatform.v1.Model]. This
     * schema applies when you deploy the `Model` as a `DeployedModel` to an
     * [Endpoint][google.cloud.aiplatform.v1.Endpoint] and use the `RawPredict`
     * method.
     * </pre>
     *
     * <code>.google.api.HttpBody http_body = 2;</code>
     */
    public Builder setHttpBody(com.google.api.HttpBody.Builder builderForValue) {
      if (httpBodyBuilder_ == null) {
        httpBody_ = builderForValue.build();
      } else {
        httpBodyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The prediction input. Supports HTTP headers and arbitrary data payload.
     *
     * A [DeployedModel][google.cloud.aiplatform.v1.DeployedModel] may have an
     * upper limit on the number of instances it supports per request. When this
     * limit it is exceeded for an AutoML model, the
     * [RawPredict][google.cloud.aiplatform.v1.PredictionService.RawPredict]
     * method returns an error. When this limit is exceeded for a custom-trained
     * model, the behavior varies depending on the model.
     *
     * You can specify the schema for each instance in the
     * [predict_schemata.instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri]
     * field when you create a [Model][google.cloud.aiplatform.v1.Model]. This
     * schema applies when you deploy the `Model` as a `DeployedModel` to an
     * [Endpoint][google.cloud.aiplatform.v1.Endpoint] and use the `RawPredict`
     * method.
     * </pre>
     *
     * <code>.google.api.HttpBody http_body = 2;</code>
     */
    public Builder mergeHttpBody(com.google.api.HttpBody value) {
      if (httpBodyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && httpBody_ != null
            && httpBody_ != com.google.api.HttpBody.getDefaultInstance()) {
          getHttpBodyBuilder().mergeFrom(value);
        } else {
          httpBody_ = value;
        }
      } else {
        httpBodyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The prediction input. Supports HTTP headers and arbitrary data payload.
     *
     * A [DeployedModel][google.cloud.aiplatform.v1.DeployedModel] may have an
     * upper limit on the number of instances it supports per request. When this
     * limit it is exceeded for an AutoML model, the
     * [RawPredict][google.cloud.aiplatform.v1.PredictionService.RawPredict]
     * method returns an error. When this limit is exceeded for a custom-trained
     * model, the behavior varies depending on the model.
     *
     * You can specify the schema for each instance in the
     * [predict_schemata.instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri]
     * field when you create a [Model][google.cloud.aiplatform.v1.Model]. This
     * schema applies when you deploy the `Model` as a `DeployedModel` to an
     * [Endpoint][google.cloud.aiplatform.v1.Endpoint] and use the `RawPredict`
     * method.
     * </pre>
     *
     * <code>.google.api.HttpBody http_body = 2;</code>
     */
    public Builder clearHttpBody() {
      bitField0_ = (bitField0_ & ~0x00000002);
      httpBody_ = null;
      if (httpBodyBuilder_ != null) {
        httpBodyBuilder_.dispose();
        httpBodyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The prediction input. Supports HTTP headers and arbitrary data payload.
     *
     * A [DeployedModel][google.cloud.aiplatform.v1.DeployedModel] may have an
     * upper limit on the number of instances it supports per request. When this
     * limit it is exceeded for an AutoML model, the
     * [RawPredict][google.cloud.aiplatform.v1.PredictionService.RawPredict]
     * method returns an error. When this limit is exceeded for a custom-trained
     * model, the behavior varies depending on the model.
     *
     * You can specify the schema for each instance in the
     * [predict_schemata.instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri]
     * field when you create a [Model][google.cloud.aiplatform.v1.Model]. This
     * schema applies when you deploy the `Model` as a `DeployedModel` to an
     * [Endpoint][google.cloud.aiplatform.v1.Endpoint] and use the `RawPredict`
     * method.
     * </pre>
     *
     * <code>.google.api.HttpBody http_body = 2;</code>
     */
    public com.google.api.HttpBody.Builder getHttpBodyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getHttpBodyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The prediction input. Supports HTTP headers and arbitrary data payload.
     *
     * A [DeployedModel][google.cloud.aiplatform.v1.DeployedModel] may have an
     * upper limit on the number of instances it supports per request. When this
     * limit it is exceeded for an AutoML model, the
     * [RawPredict][google.cloud.aiplatform.v1.PredictionService.RawPredict]
     * method returns an error. When this limit is exceeded for a custom-trained
     * model, the behavior varies depending on the model.
     *
     * You can specify the schema for each instance in the
     * [predict_schemata.instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri]
     * field when you create a [Model][google.cloud.aiplatform.v1.Model]. This
     * schema applies when you deploy the `Model` as a `DeployedModel` to an
     * [Endpoint][google.cloud.aiplatform.v1.Endpoint] and use the `RawPredict`
     * method.
     * </pre>
     *
     * <code>.google.api.HttpBody http_body = 2;</code>
     */
    public com.google.api.HttpBodyOrBuilder getHttpBodyOrBuilder() {
      if (httpBodyBuilder_ != null) {
        return httpBodyBuilder_.getMessageOrBuilder();
      } else {
        return httpBody_ == null ? com.google.api.HttpBody.getDefaultInstance() : httpBody_;
      }
    }
    /**
     *
     *
     * <pre>
     * The prediction input. Supports HTTP headers and arbitrary data payload.
     *
     * A [DeployedModel][google.cloud.aiplatform.v1.DeployedModel] may have an
     * upper limit on the number of instances it supports per request. When this
     * limit it is exceeded for an AutoML model, the
     * [RawPredict][google.cloud.aiplatform.v1.PredictionService.RawPredict]
     * method returns an error. When this limit is exceeded for a custom-trained
     * model, the behavior varies depending on the model.
     *
     * You can specify the schema for each instance in the
     * [predict_schemata.instance_schema_uri][google.cloud.aiplatform.v1.PredictSchemata.instance_schema_uri]
     * field when you create a [Model][google.cloud.aiplatform.v1.Model]. This
     * schema applies when you deploy the `Model` as a `DeployedModel` to an
     * [Endpoint][google.cloud.aiplatform.v1.Endpoint] and use the `RawPredict`
     * method.
     * </pre>
     *
     * <code>.google.api.HttpBody http_body = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.HttpBody,
            com.google.api.HttpBody.Builder,
            com.google.api.HttpBodyOrBuilder>
        getHttpBodyFieldBuilder() {
      if (httpBodyBuilder_ == null) {
        httpBodyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.api.HttpBody,
                com.google.api.HttpBody.Builder,
                com.google.api.HttpBodyOrBuilder>(getHttpBody(), getParentForChildren(), isClean());
        httpBody_ = null;
      }
      return httpBodyBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.RawPredictRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.RawPredictRequest)
  private static final com.google.cloud.aiplatform.v1.RawPredictRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.RawPredictRequest();
  }

  public static com.google.cloud.aiplatform.v1.RawPredictRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RawPredictRequest> PARSER =
      new com.google.protobuf.AbstractParser<RawPredictRequest>() {
        @java.lang.Override
        public RawPredictRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RawPredictRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RawPredictRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.RawPredictRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
