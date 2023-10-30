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
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

package com.google.cloud.contactcenterinsights.v1;

/**
 *
 *
 * <pre>
 * The request to update an issue.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.UpdateIssueRequest}
 */
public final class UpdateIssueRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.UpdateIssueRequest)
    UpdateIssueRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateIssueRequest.newBuilder() to construct.
  private UpdateIssueRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateIssueRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateIssueRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
        .internal_static_google_cloud_contactcenterinsights_v1_UpdateIssueRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
        .internal_static_google_cloud_contactcenterinsights_v1_UpdateIssueRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest.class,
            com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest.Builder.class);
  }

  public static final int ISSUE_FIELD_NUMBER = 1;
  private com.google.cloud.contactcenterinsights.v1.Issue issue_;
  /**
   *
   *
   * <pre>
   * Required. The new values for the issue.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Issue issue = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the issue field is set.
   */
  @java.lang.Override
  public boolean hasIssue() {
    return issue_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The new values for the issue.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Issue issue = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The issue.
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.Issue getIssue() {
    return issue_ == null
        ? com.google.cloud.contactcenterinsights.v1.Issue.getDefaultInstance()
        : issue_;
  }
  /**
   *
   *
   * <pre>
   * Required. The new values for the issue.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Issue issue = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.IssueOrBuilder getIssueOrBuilder() {
    return issue_ == null
        ? com.google.cloud.contactcenterinsights.v1.Issue.getDefaultInstance()
        : issue_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
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
   * The list of fields to be updated.
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
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
    if (issue_ != null) {
      output.writeMessage(1, getIssue());
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
    if (issue_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getIssue());
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest other =
        (com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest) obj;

    if (hasIssue() != other.hasIssue()) return false;
    if (hasIssue()) {
      if (!getIssue().equals(other.getIssue())) return false;
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
    if (hasIssue()) {
      hash = (37 * hash) + ISSUE_FIELD_NUMBER;
      hash = (53 * hash) + getIssue().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest parseFrom(
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
      com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest prototype) {
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
   * The request to update an issue.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.UpdateIssueRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.UpdateIssueRequest)
      com.google.cloud.contactcenterinsights.v1.UpdateIssueRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_UpdateIssueRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_UpdateIssueRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest.class,
              com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest.Builder.class);
    }

    // Construct using com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      issue_ = null;
      if (issueBuilder_ != null) {
        issueBuilder_.dispose();
        issueBuilder_ = null;
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
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_UpdateIssueRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest
        getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest build() {
      com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest buildPartial() {
      com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest result =
          new com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.issue_ = issueBuilder_ == null ? issue_ : issueBuilder_.build();
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
      if (other instanceof com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest other) {
      if (other
          == com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest.getDefaultInstance())
        return this;
      if (other.hasIssue()) {
        mergeIssue(other.getIssue());
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
                input.readMessage(getIssueFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.contactcenterinsights.v1.Issue issue_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.Issue,
            com.google.cloud.contactcenterinsights.v1.Issue.Builder,
            com.google.cloud.contactcenterinsights.v1.IssueOrBuilder>
        issueBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The new values for the issue.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Issue issue = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the issue field is set.
     */
    public boolean hasIssue() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the issue.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Issue issue = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The issue.
     */
    public com.google.cloud.contactcenterinsights.v1.Issue getIssue() {
      if (issueBuilder_ == null) {
        return issue_ == null
            ? com.google.cloud.contactcenterinsights.v1.Issue.getDefaultInstance()
            : issue_;
      } else {
        return issueBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the issue.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Issue issue = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setIssue(com.google.cloud.contactcenterinsights.v1.Issue value) {
      if (issueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        issue_ = value;
      } else {
        issueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the issue.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Issue issue = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setIssue(
        com.google.cloud.contactcenterinsights.v1.Issue.Builder builderForValue) {
      if (issueBuilder_ == null) {
        issue_ = builderForValue.build();
      } else {
        issueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the issue.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Issue issue = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeIssue(com.google.cloud.contactcenterinsights.v1.Issue value) {
      if (issueBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && issue_ != null
            && issue_ != com.google.cloud.contactcenterinsights.v1.Issue.getDefaultInstance()) {
          getIssueBuilder().mergeFrom(value);
        } else {
          issue_ = value;
        }
      } else {
        issueBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the issue.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Issue issue = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearIssue() {
      bitField0_ = (bitField0_ & ~0x00000001);
      issue_ = null;
      if (issueBuilder_ != null) {
        issueBuilder_.dispose();
        issueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the issue.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Issue issue = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.contactcenterinsights.v1.Issue.Builder getIssueBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getIssueFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the issue.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Issue issue = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.contactcenterinsights.v1.IssueOrBuilder getIssueOrBuilder() {
      if (issueBuilder_ != null) {
        return issueBuilder_.getMessageOrBuilder();
      } else {
        return issue_ == null
            ? com.google.cloud.contactcenterinsights.v1.Issue.getDefaultInstance()
            : issue_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the issue.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Issue issue = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.Issue,
            com.google.cloud.contactcenterinsights.v1.Issue.Builder,
            com.google.cloud.contactcenterinsights.v1.IssueOrBuilder>
        getIssueFieldBuilder() {
      if (issueBuilder_ == null) {
        issueBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.contactcenterinsights.v1.Issue,
                com.google.cloud.contactcenterinsights.v1.Issue.Builder,
                com.google.cloud.contactcenterinsights.v1.IssueOrBuilder>(
                getIssue(), getParentForChildren(), isClean());
        issue_ = null;
      }
      return issueBuilder_;
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
     * The list of fields to be updated.
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
     * The list of fields to be updated.
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
     * The list of fields to be updated.
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
     * The list of fields to be updated.
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
     * The list of fields to be updated.
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
     * The list of fields to be updated.
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
     * The list of fields to be updated.
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
     * The list of fields to be updated.
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
     * The list of fields to be updated.
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

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.UpdateIssueRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.UpdateIssueRequest)
  private static final com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest();
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateIssueRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateIssueRequest>() {
        @java.lang.Override
        public UpdateIssueRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateIssueRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateIssueRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.UpdateIssueRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
