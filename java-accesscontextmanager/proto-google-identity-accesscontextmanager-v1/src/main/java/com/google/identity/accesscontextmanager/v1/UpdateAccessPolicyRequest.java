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
// source: google/identity/accesscontextmanager/v1/access_context_manager.proto

package com.google.identity.accesscontextmanager.v1;

/**
 *
 *
 * <pre>
 * A request to update an `AccessPolicy`.
 * </pre>
 *
 * Protobuf type {@code google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest}
 */
public final class UpdateAccessPolicyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest)
    UpdateAccessPolicyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateAccessPolicyRequest.newBuilder() to construct.
  private UpdateAccessPolicyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateAccessPolicyRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateAccessPolicyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
        .internal_static_google_identity_accesscontextmanager_v1_UpdateAccessPolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
        .internal_static_google_identity_accesscontextmanager_v1_UpdateAccessPolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest.class,
            com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest.Builder.class);
  }

  public static final int POLICY_FIELD_NUMBER = 1;
  private com.google.identity.accesscontextmanager.v1.AccessPolicy policy_;
  /**
   *
   *
   * <pre>
   * Required. The updated AccessPolicy.
   * </pre>
   *
   * <code>
   * .google.identity.accesscontextmanager.v1.AccessPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the policy field is set.
   */
  @java.lang.Override
  public boolean hasPolicy() {
    return policy_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The updated AccessPolicy.
   * </pre>
   *
   * <code>
   * .google.identity.accesscontextmanager.v1.AccessPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The policy.
   */
  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.AccessPolicy getPolicy() {
    return policy_ == null
        ? com.google.identity.accesscontextmanager.v1.AccessPolicy.getDefaultInstance()
        : policy_;
  }
  /**
   *
   *
   * <pre>
   * Required. The updated AccessPolicy.
   * </pre>
   *
   * <code>
   * .google.identity.accesscontextmanager.v1.AccessPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.AccessPolicyOrBuilder getPolicyOrBuilder() {
    return policy_ == null
        ? com.google.identity.accesscontextmanager.v1.AccessPolicy.getDefaultInstance()
        : policy_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. Mask to control which fields get updated. Must be non-empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
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
   * Required. Mask to control which fields get updated. Must be non-empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
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
   * Required. Mask to control which fields get updated. Must be non-empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (policy_ != null) {
      output.writeMessage(1, getPolicy());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (policy_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getPolicy());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest)) {
      return super.equals(obj);
    }
    com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest other =
        (com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest) obj;

    if (hasPolicy() != other.hasPolicy()) return false;
    if (hasPolicy()) {
      if (!getPolicy().equals(other.getPolicy())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasPolicy()) {
      hash = (37 * hash) + POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getPolicy().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest parseFrom(
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
      com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest prototype) {
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
   * A request to update an `AccessPolicy`.
   * </pre>
   *
   * Protobuf type {@code google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest)
      com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
          .internal_static_google_identity_accesscontextmanager_v1_UpdateAccessPolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
          .internal_static_google_identity_accesscontextmanager_v1_UpdateAccessPolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest.class,
              com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest.Builder.class);
    }

    // Construct using
    // com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      policy_ = null;
      if (policyBuilder_ != null) {
        policyBuilder_.dispose();
        policyBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.identity.accesscontextmanager.v1.AccessContextManagerProto
          .internal_static_google_identity_accesscontextmanager_v1_UpdateAccessPolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest
        getDefaultInstanceForType() {
      return com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest build() {
      com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest buildPartial() {
      com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest result =
          new com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.policy_ = policyBuilder_ == null ? policy_ : policyBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
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
      if (other instanceof com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest) {
        return mergeFrom(
            (com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest other) {
      if (other
          == com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest
              .getDefaultInstance()) return this;
      if (other.hasPolicy()) {
        mergePolicy(other.getPolicy());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(getPolicyFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.identity.accesscontextmanager.v1.AccessPolicy policy_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.identity.accesscontextmanager.v1.AccessPolicy,
            com.google.identity.accesscontextmanager.v1.AccessPolicy.Builder,
            com.google.identity.accesscontextmanager.v1.AccessPolicyOrBuilder>
        policyBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The updated AccessPolicy.
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.AccessPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the policy field is set.
     */
    public boolean hasPolicy() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The updated AccessPolicy.
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.AccessPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The policy.
     */
    public com.google.identity.accesscontextmanager.v1.AccessPolicy getPolicy() {
      if (policyBuilder_ == null) {
        return policy_ == null
            ? com.google.identity.accesscontextmanager.v1.AccessPolicy.getDefaultInstance()
            : policy_;
      } else {
        return policyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The updated AccessPolicy.
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.AccessPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPolicy(com.google.identity.accesscontextmanager.v1.AccessPolicy value) {
      if (policyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        policy_ = value;
      } else {
        policyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated AccessPolicy.
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.AccessPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPolicy(
        com.google.identity.accesscontextmanager.v1.AccessPolicy.Builder builderForValue) {
      if (policyBuilder_ == null) {
        policy_ = builderForValue.build();
      } else {
        policyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated AccessPolicy.
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.AccessPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergePolicy(com.google.identity.accesscontextmanager.v1.AccessPolicy value) {
      if (policyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && policy_ != null
            && policy_
                != com.google.identity.accesscontextmanager.v1.AccessPolicy.getDefaultInstance()) {
          getPolicyBuilder().mergeFrom(value);
        } else {
          policy_ = value;
        }
      } else {
        policyBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated AccessPolicy.
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.AccessPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearPolicy() {
      bitField0_ = (bitField0_ & ~0x00000001);
      policy_ = null;
      if (policyBuilder_ != null) {
        policyBuilder_.dispose();
        policyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated AccessPolicy.
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.AccessPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.identity.accesscontextmanager.v1.AccessPolicy.Builder getPolicyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPolicyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The updated AccessPolicy.
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.AccessPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.identity.accesscontextmanager.v1.AccessPolicyOrBuilder getPolicyOrBuilder() {
      if (policyBuilder_ != null) {
        return policyBuilder_.getMessageOrBuilder();
      } else {
        return policy_ == null
            ? com.google.identity.accesscontextmanager.v1.AccessPolicy.getDefaultInstance()
            : policy_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The updated AccessPolicy.
     * </pre>
     *
     * <code>
     * .google.identity.accesscontextmanager.v1.AccessPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.identity.accesscontextmanager.v1.AccessPolicy,
            com.google.identity.accesscontextmanager.v1.AccessPolicy.Builder,
            com.google.identity.accesscontextmanager.v1.AccessPolicyOrBuilder>
        getPolicyFieldBuilder() {
      if (policyBuilder_ == null) {
        policyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.identity.accesscontextmanager.v1.AccessPolicy,
                com.google.identity.accesscontextmanager.v1.AccessPolicy.Builder,
                com.google.identity.accesscontextmanager.v1.AccessPolicyOrBuilder>(
                getPolicy(), getParentForChildren(), isClean());
        policy_ = null;
      }
      return policyBuilder_;
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
     * Required. Mask to control which fields get updated. Must be non-empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask to control which fields get updated. Must be non-empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask to control which fields get updated. Must be non-empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask to control which fields get updated. Must be non-empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask to control which fields get updated. Must be non-empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask to control which fields get updated. Must be non-empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask to control which fields get updated. Must be non-empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask to control which fields get updated. Must be non-empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     * Required. Mask to control which fields get updated. Must be non-empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest)
  private static final com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest();
  }

  public static com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateAccessPolicyRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateAccessPolicyRequest>() {
        @java.lang.Override
        public UpdateAccessPolicyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateAccessPolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateAccessPolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.identity.accesscontextmanager.v1.UpdateAccessPolicyRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
