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
// source: google/cloud/orgpolicy/v2/orgpolicy.proto

package com.google.cloud.orgpolicy.v2;

/**
 *
 *
 * <pre>
 * The request sent to the [UpdatePolicyRequest]
 * [google.cloud.orgpolicy.v2.OrgPolicy.UpdatePolicy] method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.orgpolicy.v2.UpdatePolicyRequest}
 */
public final class UpdatePolicyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.orgpolicy.v2.UpdatePolicyRequest)
    UpdatePolicyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdatePolicyRequest.newBuilder() to construct.
  private UpdatePolicyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdatePolicyRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdatePolicyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.orgpolicy.v2.OrgPolicyProto
        .internal_static_google_cloud_orgpolicy_v2_UpdatePolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.orgpolicy.v2.OrgPolicyProto
        .internal_static_google_cloud_orgpolicy_v2_UpdatePolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.orgpolicy.v2.UpdatePolicyRequest.class,
            com.google.cloud.orgpolicy.v2.UpdatePolicyRequest.Builder.class);
  }

  public static final int POLICY_FIELD_NUMBER = 1;
  private com.google.cloud.orgpolicy.v2.Policy policy_;
  /**
   *
   *
   * <pre>
   * Required. `Policy` to update.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];
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
   * Required. `Policy` to update.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The policy.
   */
  @java.lang.Override
  public com.google.cloud.orgpolicy.v2.Policy getPolicy() {
    return policy_ == null ? com.google.cloud.orgpolicy.v2.Policy.getDefaultInstance() : policy_;
  }
  /**
   *
   *
   * <pre>
   * Required. `Policy` to update.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.orgpolicy.v2.PolicyOrBuilder getPolicyOrBuilder() {
    return policy_ == null ? com.google.cloud.orgpolicy.v2.Policy.getDefaultInstance() : policy_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Field mask used to specify the fields to be overwritten in the policy
   * by the set. The fields specified in the update_mask are relative to the
   * policy, not the full request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
   * Field mask used to specify the fields to be overwritten in the policy
   * by the set. The fields specified in the update_mask are relative to the
   * policy, not the full request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
   * Field mask used to specify the fields to be overwritten in the policy
   * by the set. The fields specified in the update_mask are relative to the
   * policy, not the full request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
      output.writeMessage(3, getUpdateMask());
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.orgpolicy.v2.UpdatePolicyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.orgpolicy.v2.UpdatePolicyRequest other =
        (com.google.cloud.orgpolicy.v2.UpdatePolicyRequest) obj;

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

  public static com.google.cloud.orgpolicy.v2.UpdatePolicyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orgpolicy.v2.UpdatePolicyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orgpolicy.v2.UpdatePolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orgpolicy.v2.UpdatePolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orgpolicy.v2.UpdatePolicyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orgpolicy.v2.UpdatePolicyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orgpolicy.v2.UpdatePolicyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.orgpolicy.v2.UpdatePolicyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orgpolicy.v2.UpdatePolicyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.orgpolicy.v2.UpdatePolicyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orgpolicy.v2.UpdatePolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.orgpolicy.v2.UpdatePolicyRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.orgpolicy.v2.UpdatePolicyRequest prototype) {
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
   * The request sent to the [UpdatePolicyRequest]
   * [google.cloud.orgpolicy.v2.OrgPolicy.UpdatePolicy] method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.orgpolicy.v2.UpdatePolicyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.orgpolicy.v2.UpdatePolicyRequest)
      com.google.cloud.orgpolicy.v2.UpdatePolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.orgpolicy.v2.OrgPolicyProto
          .internal_static_google_cloud_orgpolicy_v2_UpdatePolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.orgpolicy.v2.OrgPolicyProto
          .internal_static_google_cloud_orgpolicy_v2_UpdatePolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.orgpolicy.v2.UpdatePolicyRequest.class,
              com.google.cloud.orgpolicy.v2.UpdatePolicyRequest.Builder.class);
    }

    // Construct using com.google.cloud.orgpolicy.v2.UpdatePolicyRequest.newBuilder()
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
      return com.google.cloud.orgpolicy.v2.OrgPolicyProto
          .internal_static_google_cloud_orgpolicy_v2_UpdatePolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.orgpolicy.v2.UpdatePolicyRequest getDefaultInstanceForType() {
      return com.google.cloud.orgpolicy.v2.UpdatePolicyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.orgpolicy.v2.UpdatePolicyRequest build() {
      com.google.cloud.orgpolicy.v2.UpdatePolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.orgpolicy.v2.UpdatePolicyRequest buildPartial() {
      com.google.cloud.orgpolicy.v2.UpdatePolicyRequest result =
          new com.google.cloud.orgpolicy.v2.UpdatePolicyRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.orgpolicy.v2.UpdatePolicyRequest result) {
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
      if (other instanceof com.google.cloud.orgpolicy.v2.UpdatePolicyRequest) {
        return mergeFrom((com.google.cloud.orgpolicy.v2.UpdatePolicyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.orgpolicy.v2.UpdatePolicyRequest other) {
      if (other == com.google.cloud.orgpolicy.v2.UpdatePolicyRequest.getDefaultInstance())
        return this;
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
            case 26:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 26
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

    private com.google.cloud.orgpolicy.v2.Policy policy_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.orgpolicy.v2.Policy,
            com.google.cloud.orgpolicy.v2.Policy.Builder,
            com.google.cloud.orgpolicy.v2.PolicyOrBuilder>
        policyBuilder_;
    /**
     *
     *
     * <pre>
     * Required. `Policy` to update.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];
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
     * Required. `Policy` to update.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The policy.
     */
    public com.google.cloud.orgpolicy.v2.Policy getPolicy() {
      if (policyBuilder_ == null) {
        return policy_ == null
            ? com.google.cloud.orgpolicy.v2.Policy.getDefaultInstance()
            : policy_;
      } else {
        return policyBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. `Policy` to update.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPolicy(com.google.cloud.orgpolicy.v2.Policy value) {
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
     * Required. `Policy` to update.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPolicy(com.google.cloud.orgpolicy.v2.Policy.Builder builderForValue) {
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
     * Required. `Policy` to update.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergePolicy(com.google.cloud.orgpolicy.v2.Policy value) {
      if (policyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && policy_ != null
            && policy_ != com.google.cloud.orgpolicy.v2.Policy.getDefaultInstance()) {
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
     * Required. `Policy` to update.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];
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
     * Required. `Policy` to update.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.orgpolicy.v2.Policy.Builder getPolicyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPolicyFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. `Policy` to update.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.orgpolicy.v2.PolicyOrBuilder getPolicyOrBuilder() {
      if (policyBuilder_ != null) {
        return policyBuilder_.getMessageOrBuilder();
      } else {
        return policy_ == null
            ? com.google.cloud.orgpolicy.v2.Policy.getDefaultInstance()
            : policy_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. `Policy` to update.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.Policy policy = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.orgpolicy.v2.Policy,
            com.google.cloud.orgpolicy.v2.Policy.Builder,
            com.google.cloud.orgpolicy.v2.PolicyOrBuilder>
        getPolicyFieldBuilder() {
      if (policyBuilder_ == null) {
        policyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.orgpolicy.v2.Policy,
                com.google.cloud.orgpolicy.v2.Policy.Builder,
                com.google.cloud.orgpolicy.v2.PolicyOrBuilder>(
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
     * Field mask used to specify the fields to be overwritten in the policy
     * by the set. The fields specified in the update_mask are relative to the
     * policy, not the full request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Field mask used to specify the fields to be overwritten in the policy
     * by the set. The fields specified in the update_mask are relative to the
     * policy, not the full request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Field mask used to specify the fields to be overwritten in the policy
     * by the set. The fields specified in the update_mask are relative to the
     * policy, not the full request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Field mask used to specify the fields to be overwritten in the policy
     * by the set. The fields specified in the update_mask are relative to the
     * policy, not the full request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Field mask used to specify the fields to be overwritten in the policy
     * by the set. The fields specified in the update_mask are relative to the
     * policy, not the full request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Field mask used to specify the fields to be overwritten in the policy
     * by the set. The fields specified in the update_mask are relative to the
     * policy, not the full request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Field mask used to specify the fields to be overwritten in the policy
     * by the set. The fields specified in the update_mask are relative to the
     * policy, not the full request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Field mask used to specify the fields to be overwritten in the policy
     * by the set. The fields specified in the update_mask are relative to the
     * policy, not the full request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Field mask used to specify the fields to be overwritten in the policy
     * by the set. The fields specified in the update_mask are relative to the
     * policy, not the full request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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

    // @@protoc_insertion_point(builder_scope:google.cloud.orgpolicy.v2.UpdatePolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.orgpolicy.v2.UpdatePolicyRequest)
  private static final com.google.cloud.orgpolicy.v2.UpdatePolicyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.orgpolicy.v2.UpdatePolicyRequest();
  }

  public static com.google.cloud.orgpolicy.v2.UpdatePolicyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdatePolicyRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdatePolicyRequest>() {
        @java.lang.Override
        public UpdatePolicyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdatePolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdatePolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.orgpolicy.v2.UpdatePolicyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
