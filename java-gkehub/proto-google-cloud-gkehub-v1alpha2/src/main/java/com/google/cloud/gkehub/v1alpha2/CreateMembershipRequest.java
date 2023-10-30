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
// source: google/cloud/gkehub/v1alpha2/membership.proto

package com.google.cloud.gkehub.v1alpha2;

/**
 *
 *
 * <pre>
 * Request message for the `GkeHub.CreateMembership` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.v1alpha2.CreateMembershipRequest}
 */
public final class CreateMembershipRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.v1alpha2.CreateMembershipRequest)
    CreateMembershipRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateMembershipRequest.newBuilder() to construct.
  private CreateMembershipRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateMembershipRequest() {
    parent_ = "";
    membershipId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateMembershipRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkehub.v1alpha2.MembershipProto
        .internal_static_google_cloud_gkehub_v1alpha2_CreateMembershipRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.v1alpha2.MembershipProto
        .internal_static_google_cloud_gkehub_v1alpha2_CreateMembershipRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest.class,
            com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent (project and location) where the Memberships will be created.
   * Specified in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The parent (project and location) where the Memberships will be created.
   * Specified in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MEMBERSHIP_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object membershipId_ = "";
  /**
   *
   *
   * <pre>
   * Required. Client chosen ID for the membership. `membership_id` must be a valid RFC
   * 1123 compliant DNS label:
   *
   *   1. At most 63 characters in length
   *   2. It must consist of lower case alphanumeric characters or `-`
   *   3. It must start and end with an alphanumeric character
   *
   * Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`,
   * with a maximum length of 63 characters.
   * </pre>
   *
   * <code>string membership_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The membershipId.
   */
  @java.lang.Override
  public java.lang.String getMembershipId() {
    java.lang.Object ref = membershipId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      membershipId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Client chosen ID for the membership. `membership_id` must be a valid RFC
   * 1123 compliant DNS label:
   *
   *   1. At most 63 characters in length
   *   2. It must consist of lower case alphanumeric characters or `-`
   *   3. It must start and end with an alphanumeric character
   *
   * Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`,
   * with a maximum length of 63 characters.
   * </pre>
   *
   * <code>string membership_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for membershipId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMembershipIdBytes() {
    java.lang.Object ref = membershipId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      membershipId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_FIELD_NUMBER = 3;
  private com.google.cloud.gkehub.v1alpha2.Membership resource_;
  /**
   *
   *
   * <pre>
   * Required. The membership to create.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1alpha2.Membership resource = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the resource field is set.
   */
  @java.lang.Override
  public boolean hasResource() {
    return resource_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The membership to create.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1alpha2.Membership resource = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The resource.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.v1alpha2.Membership getResource() {
    return resource_ == null
        ? com.google.cloud.gkehub.v1alpha2.Membership.getDefaultInstance()
        : resource_;
  }
  /**
   *
   *
   * <pre>
   * Required. The membership to create.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1alpha2.Membership resource = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.v1alpha2.MembershipOrBuilder getResourceOrBuilder() {
    return resource_ == null
        ? com.google.cloud.gkehub.v1alpha2.Membership.getDefaultInstance()
        : resource_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(membershipId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, membershipId_);
    }
    if (resource_ != null) {
      output.writeMessage(3, getResource());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(membershipId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, membershipId_);
    }
    if (resource_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getResource());
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
    if (!(obj instanceof com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest other =
        (com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getMembershipId().equals(other.getMembershipId())) return false;
    if (hasResource() != other.hasResource()) return false;
    if (hasResource()) {
      if (!getResource().equals(other.getResource())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + MEMBERSHIP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getMembershipId().hashCode();
    if (hasResource()) {
      hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResource().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest parseFrom(
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
      com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest prototype) {
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
   * Request message for the `GkeHub.CreateMembership` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.v1alpha2.CreateMembershipRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.v1alpha2.CreateMembershipRequest)
      com.google.cloud.gkehub.v1alpha2.CreateMembershipRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.v1alpha2.MembershipProto
          .internal_static_google_cloud_gkehub_v1alpha2_CreateMembershipRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.v1alpha2.MembershipProto
          .internal_static_google_cloud_gkehub_v1alpha2_CreateMembershipRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest.class,
              com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      membershipId_ = "";
      resource_ = null;
      if (resourceBuilder_ != null) {
        resourceBuilder_.dispose();
        resourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.v1alpha2.MembershipProto
          .internal_static_google_cloud_gkehub_v1alpha2_CreateMembershipRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest getDefaultInstanceForType() {
      return com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest build() {
      com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest buildPartial() {
      com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest result =
          new com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.membershipId_ = membershipId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.resource_ = resourceBuilder_ == null ? resource_ : resourceBuilder_.build();
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
      if (other instanceof com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest) {
        return mergeFrom((com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest other) {
      if (other == com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getMembershipId().isEmpty()) {
        membershipId_ = other.membershipId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasResource()) {
        mergeResource(other.getResource());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                membershipId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getResourceFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent (project and location) where the Memberships will be created.
     * Specified in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent (project and location) where the Memberships will be created.
     * Specified in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent (project and location) where the Memberships will be created.
     * Specified in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent (project and location) where the Memberships will be created.
     * Specified in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent (project and location) where the Memberships will be created.
     * Specified in the format `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object membershipId_ = "";
    /**
     *
     *
     * <pre>
     * Required. Client chosen ID for the membership. `membership_id` must be a valid RFC
     * 1123 compliant DNS label:
     *
     *   1. At most 63 characters in length
     *   2. It must consist of lower case alphanumeric characters or `-`
     *   3. It must start and end with an alphanumeric character
     *
     * Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`,
     * with a maximum length of 63 characters.
     * </pre>
     *
     * <code>string membership_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The membershipId.
     */
    public java.lang.String getMembershipId() {
      java.lang.Object ref = membershipId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        membershipId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Client chosen ID for the membership. `membership_id` must be a valid RFC
     * 1123 compliant DNS label:
     *
     *   1. At most 63 characters in length
     *   2. It must consist of lower case alphanumeric characters or `-`
     *   3. It must start and end with an alphanumeric character
     *
     * Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`,
     * with a maximum length of 63 characters.
     * </pre>
     *
     * <code>string membership_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for membershipId.
     */
    public com.google.protobuf.ByteString getMembershipIdBytes() {
      java.lang.Object ref = membershipId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        membershipId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Client chosen ID for the membership. `membership_id` must be a valid RFC
     * 1123 compliant DNS label:
     *
     *   1. At most 63 characters in length
     *   2. It must consist of lower case alphanumeric characters or `-`
     *   3. It must start and end with an alphanumeric character
     *
     * Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`,
     * with a maximum length of 63 characters.
     * </pre>
     *
     * <code>string membership_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The membershipId to set.
     * @return This builder for chaining.
     */
    public Builder setMembershipId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      membershipId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Client chosen ID for the membership. `membership_id` must be a valid RFC
     * 1123 compliant DNS label:
     *
     *   1. At most 63 characters in length
     *   2. It must consist of lower case alphanumeric characters or `-`
     *   3. It must start and end with an alphanumeric character
     *
     * Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`,
     * with a maximum length of 63 characters.
     * </pre>
     *
     * <code>string membership_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMembershipId() {
      membershipId_ = getDefaultInstance().getMembershipId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Client chosen ID for the membership. `membership_id` must be a valid RFC
     * 1123 compliant DNS label:
     *
     *   1. At most 63 characters in length
     *   2. It must consist of lower case alphanumeric characters or `-`
     *   3. It must start and end with an alphanumeric character
     *
     * Which can be expressed as the regex: `[a-z0-9]([-a-z0-9]*[a-z0-9])?`,
     * with a maximum length of 63 characters.
     * </pre>
     *
     * <code>string membership_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for membershipId to set.
     * @return This builder for chaining.
     */
    public Builder setMembershipIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      membershipId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.gkehub.v1alpha2.Membership resource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.v1alpha2.Membership,
            com.google.cloud.gkehub.v1alpha2.Membership.Builder,
            com.google.cloud.gkehub.v1alpha2.MembershipOrBuilder>
        resourceBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The membership to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1alpha2.Membership resource = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the resource field is set.
     */
    public boolean hasResource() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The membership to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1alpha2.Membership resource = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The resource.
     */
    public com.google.cloud.gkehub.v1alpha2.Membership getResource() {
      if (resourceBuilder_ == null) {
        return resource_ == null
            ? com.google.cloud.gkehub.v1alpha2.Membership.getDefaultInstance()
            : resource_;
      } else {
        return resourceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The membership to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1alpha2.Membership resource = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setResource(com.google.cloud.gkehub.v1alpha2.Membership value) {
      if (resourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resource_ = value;
      } else {
        resourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The membership to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1alpha2.Membership resource = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setResource(
        com.google.cloud.gkehub.v1alpha2.Membership.Builder builderForValue) {
      if (resourceBuilder_ == null) {
        resource_ = builderForValue.build();
      } else {
        resourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The membership to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1alpha2.Membership resource = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeResource(com.google.cloud.gkehub.v1alpha2.Membership value) {
      if (resourceBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && resource_ != null
            && resource_ != com.google.cloud.gkehub.v1alpha2.Membership.getDefaultInstance()) {
          getResourceBuilder().mergeFrom(value);
        } else {
          resource_ = value;
        }
      } else {
        resourceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The membership to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1alpha2.Membership resource = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearResource() {
      bitField0_ = (bitField0_ & ~0x00000004);
      resource_ = null;
      if (resourceBuilder_ != null) {
        resourceBuilder_.dispose();
        resourceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The membership to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1alpha2.Membership resource = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.gkehub.v1alpha2.Membership.Builder getResourceBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getResourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The membership to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1alpha2.Membership resource = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.gkehub.v1alpha2.MembershipOrBuilder getResourceOrBuilder() {
      if (resourceBuilder_ != null) {
        return resourceBuilder_.getMessageOrBuilder();
      } else {
        return resource_ == null
            ? com.google.cloud.gkehub.v1alpha2.Membership.getDefaultInstance()
            : resource_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The membership to create.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1alpha2.Membership resource = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.v1alpha2.Membership,
            com.google.cloud.gkehub.v1alpha2.Membership.Builder,
            com.google.cloud.gkehub.v1alpha2.MembershipOrBuilder>
        getResourceFieldBuilder() {
      if (resourceBuilder_ == null) {
        resourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gkehub.v1alpha2.Membership,
                com.google.cloud.gkehub.v1alpha2.Membership.Builder,
                com.google.cloud.gkehub.v1alpha2.MembershipOrBuilder>(
                getResource(), getParentForChildren(), isClean());
        resource_ = null;
      }
      return resourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.v1alpha2.CreateMembershipRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1alpha2.CreateMembershipRequest)
  private static final com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest();
  }

  public static com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateMembershipRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateMembershipRequest>() {
        @java.lang.Override
        public CreateMembershipRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateMembershipRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateMembershipRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
