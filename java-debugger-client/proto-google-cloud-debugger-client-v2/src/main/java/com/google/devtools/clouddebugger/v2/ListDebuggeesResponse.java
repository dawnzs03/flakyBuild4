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
// source: google/devtools/clouddebugger/v2/debugger.proto

package com.google.devtools.clouddebugger.v2;

/**
 *
 *
 * <pre>
 * Response for listing debuggees.
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouddebugger.v2.ListDebuggeesResponse}
 */
public final class ListDebuggeesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouddebugger.v2.ListDebuggeesResponse)
    ListDebuggeesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListDebuggeesResponse.newBuilder() to construct.
  private ListDebuggeesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListDebuggeesResponse() {
    debuggees_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListDebuggeesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.devtools.clouddebugger.v2.DebuggerProto
        .internal_static_google_devtools_clouddebugger_v2_ListDebuggeesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouddebugger.v2.DebuggerProto
        .internal_static_google_devtools_clouddebugger_v2_ListDebuggeesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouddebugger.v2.ListDebuggeesResponse.class,
            com.google.devtools.clouddebugger.v2.ListDebuggeesResponse.Builder.class);
  }

  public static final int DEBUGGEES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.devtools.clouddebugger.v2.Debuggee> debuggees_;
  /**
   *
   *
   * <pre>
   * List of debuggees accessible to the calling user.
   * The fields `debuggee.id` and `description` are guaranteed to be set.
   * The `description` field is a human readable field provided by agents and
   * can be displayed to users.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.devtools.clouddebugger.v2.Debuggee> getDebuggeesList() {
    return debuggees_;
  }
  /**
   *
   *
   * <pre>
   * List of debuggees accessible to the calling user.
   * The fields `debuggee.id` and `description` are guaranteed to be set.
   * The `description` field is a human readable field provided by agents and
   * can be displayed to users.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.devtools.clouddebugger.v2.DebuggeeOrBuilder>
      getDebuggeesOrBuilderList() {
    return debuggees_;
  }
  /**
   *
   *
   * <pre>
   * List of debuggees accessible to the calling user.
   * The fields `debuggee.id` and `description` are guaranteed to be set.
   * The `description` field is a human readable field provided by agents and
   * can be displayed to users.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
   */
  @java.lang.Override
  public int getDebuggeesCount() {
    return debuggees_.size();
  }
  /**
   *
   *
   * <pre>
   * List of debuggees accessible to the calling user.
   * The fields `debuggee.id` and `description` are guaranteed to be set.
   * The `description` field is a human readable field provided by agents and
   * can be displayed to users.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.Debuggee getDebuggees(int index) {
    return debuggees_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of debuggees accessible to the calling user.
   * The fields `debuggee.id` and `description` are guaranteed to be set.
   * The `description` field is a human readable field provided by agents and
   * can be displayed to users.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.DebuggeeOrBuilder getDebuggeesOrBuilder(int index) {
    return debuggees_.get(index);
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
    for (int i = 0; i < debuggees_.size(); i++) {
      output.writeMessage(1, debuggees_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < debuggees_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, debuggees_.get(i));
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
    if (!(obj instanceof com.google.devtools.clouddebugger.v2.ListDebuggeesResponse)) {
      return super.equals(obj);
    }
    com.google.devtools.clouddebugger.v2.ListDebuggeesResponse other =
        (com.google.devtools.clouddebugger.v2.ListDebuggeesResponse) obj;

    if (!getDebuggeesList().equals(other.getDebuggeesList())) return false;
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
    if (getDebuggeesCount() > 0) {
      hash = (37 * hash) + DEBUGGEES_FIELD_NUMBER;
      hash = (53 * hash) + getDebuggeesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouddebugger.v2.ListDebuggeesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouddebugger.v2.ListDebuggeesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.ListDebuggeesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouddebugger.v2.ListDebuggeesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.ListDebuggeesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouddebugger.v2.ListDebuggeesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.ListDebuggeesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouddebugger.v2.ListDebuggeesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.ListDebuggeesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouddebugger.v2.ListDebuggeesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouddebugger.v2.ListDebuggeesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouddebugger.v2.ListDebuggeesResponse parseFrom(
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
      com.google.devtools.clouddebugger.v2.ListDebuggeesResponse prototype) {
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
   * Response for listing debuggees.
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouddebugger.v2.ListDebuggeesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouddebugger.v2.ListDebuggeesResponse)
      com.google.devtools.clouddebugger.v2.ListDebuggeesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.clouddebugger.v2.DebuggerProto
          .internal_static_google_devtools_clouddebugger_v2_ListDebuggeesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouddebugger.v2.DebuggerProto
          .internal_static_google_devtools_clouddebugger_v2_ListDebuggeesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouddebugger.v2.ListDebuggeesResponse.class,
              com.google.devtools.clouddebugger.v2.ListDebuggeesResponse.Builder.class);
    }

    // Construct using com.google.devtools.clouddebugger.v2.ListDebuggeesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (debuggeesBuilder_ == null) {
        debuggees_ = java.util.Collections.emptyList();
      } else {
        debuggees_ = null;
        debuggeesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.clouddebugger.v2.DebuggerProto
          .internal_static_google_devtools_clouddebugger_v2_ListDebuggeesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.ListDebuggeesResponse getDefaultInstanceForType() {
      return com.google.devtools.clouddebugger.v2.ListDebuggeesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.ListDebuggeesResponse build() {
      com.google.devtools.clouddebugger.v2.ListDebuggeesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.clouddebugger.v2.ListDebuggeesResponse buildPartial() {
      com.google.devtools.clouddebugger.v2.ListDebuggeesResponse result =
          new com.google.devtools.clouddebugger.v2.ListDebuggeesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.devtools.clouddebugger.v2.ListDebuggeesResponse result) {
      if (debuggeesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          debuggees_ = java.util.Collections.unmodifiableList(debuggees_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.debuggees_ = debuggees_;
      } else {
        result.debuggees_ = debuggeesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.devtools.clouddebugger.v2.ListDebuggeesResponse result) {
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
      if (other instanceof com.google.devtools.clouddebugger.v2.ListDebuggeesResponse) {
        return mergeFrom((com.google.devtools.clouddebugger.v2.ListDebuggeesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.clouddebugger.v2.ListDebuggeesResponse other) {
      if (other == com.google.devtools.clouddebugger.v2.ListDebuggeesResponse.getDefaultInstance())
        return this;
      if (debuggeesBuilder_ == null) {
        if (!other.debuggees_.isEmpty()) {
          if (debuggees_.isEmpty()) {
            debuggees_ = other.debuggees_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDebuggeesIsMutable();
            debuggees_.addAll(other.debuggees_);
          }
          onChanged();
        }
      } else {
        if (!other.debuggees_.isEmpty()) {
          if (debuggeesBuilder_.isEmpty()) {
            debuggeesBuilder_.dispose();
            debuggeesBuilder_ = null;
            debuggees_ = other.debuggees_;
            bitField0_ = (bitField0_ & ~0x00000001);
            debuggeesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDebuggeesFieldBuilder()
                    : null;
          } else {
            debuggeesBuilder_.addAllMessages(other.debuggees_);
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
                com.google.devtools.clouddebugger.v2.Debuggee m =
                    input.readMessage(
                        com.google.devtools.clouddebugger.v2.Debuggee.parser(), extensionRegistry);
                if (debuggeesBuilder_ == null) {
                  ensureDebuggeesIsMutable();
                  debuggees_.add(m);
                } else {
                  debuggeesBuilder_.addMessage(m);
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

    private java.util.List<com.google.devtools.clouddebugger.v2.Debuggee> debuggees_ =
        java.util.Collections.emptyList();

    private void ensureDebuggeesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        debuggees_ =
            new java.util.ArrayList<com.google.devtools.clouddebugger.v2.Debuggee>(debuggees_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.devtools.clouddebugger.v2.Debuggee,
            com.google.devtools.clouddebugger.v2.Debuggee.Builder,
            com.google.devtools.clouddebugger.v2.DebuggeeOrBuilder>
        debuggeesBuilder_;

    /**
     *
     *
     * <pre>
     * List of debuggees accessible to the calling user.
     * The fields `debuggee.id` and `description` are guaranteed to be set.
     * The `description` field is a human readable field provided by agents and
     * can be displayed to users.
     * </pre>
     *
     * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
     */
    public java.util.List<com.google.devtools.clouddebugger.v2.Debuggee> getDebuggeesList() {
      if (debuggeesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(debuggees_);
      } else {
        return debuggeesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of debuggees accessible to the calling user.
     * The fields `debuggee.id` and `description` are guaranteed to be set.
     * The `description` field is a human readable field provided by agents and
     * can be displayed to users.
     * </pre>
     *
     * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
     */
    public int getDebuggeesCount() {
      if (debuggeesBuilder_ == null) {
        return debuggees_.size();
      } else {
        return debuggeesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of debuggees accessible to the calling user.
     * The fields `debuggee.id` and `description` are guaranteed to be set.
     * The `description` field is a human readable field provided by agents and
     * can be displayed to users.
     * </pre>
     *
     * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
     */
    public com.google.devtools.clouddebugger.v2.Debuggee getDebuggees(int index) {
      if (debuggeesBuilder_ == null) {
        return debuggees_.get(index);
      } else {
        return debuggeesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of debuggees accessible to the calling user.
     * The fields `debuggee.id` and `description` are guaranteed to be set.
     * The `description` field is a human readable field provided by agents and
     * can be displayed to users.
     * </pre>
     *
     * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
     */
    public Builder setDebuggees(int index, com.google.devtools.clouddebugger.v2.Debuggee value) {
      if (debuggeesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDebuggeesIsMutable();
        debuggees_.set(index, value);
        onChanged();
      } else {
        debuggeesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of debuggees accessible to the calling user.
     * The fields `debuggee.id` and `description` are guaranteed to be set.
     * The `description` field is a human readable field provided by agents and
     * can be displayed to users.
     * </pre>
     *
     * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
     */
    public Builder setDebuggees(
        int index, com.google.devtools.clouddebugger.v2.Debuggee.Builder builderForValue) {
      if (debuggeesBuilder_ == null) {
        ensureDebuggeesIsMutable();
        debuggees_.set(index, builderForValue.build());
        onChanged();
      } else {
        debuggeesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of debuggees accessible to the calling user.
     * The fields `debuggee.id` and `description` are guaranteed to be set.
     * The `description` field is a human readable field provided by agents and
     * can be displayed to users.
     * </pre>
     *
     * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
     */
    public Builder addDebuggees(com.google.devtools.clouddebugger.v2.Debuggee value) {
      if (debuggeesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDebuggeesIsMutable();
        debuggees_.add(value);
        onChanged();
      } else {
        debuggeesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of debuggees accessible to the calling user.
     * The fields `debuggee.id` and `description` are guaranteed to be set.
     * The `description` field is a human readable field provided by agents and
     * can be displayed to users.
     * </pre>
     *
     * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
     */
    public Builder addDebuggees(int index, com.google.devtools.clouddebugger.v2.Debuggee value) {
      if (debuggeesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDebuggeesIsMutable();
        debuggees_.add(index, value);
        onChanged();
      } else {
        debuggeesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of debuggees accessible to the calling user.
     * The fields `debuggee.id` and `description` are guaranteed to be set.
     * The `description` field is a human readable field provided by agents and
     * can be displayed to users.
     * </pre>
     *
     * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
     */
    public Builder addDebuggees(
        com.google.devtools.clouddebugger.v2.Debuggee.Builder builderForValue) {
      if (debuggeesBuilder_ == null) {
        ensureDebuggeesIsMutable();
        debuggees_.add(builderForValue.build());
        onChanged();
      } else {
        debuggeesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of debuggees accessible to the calling user.
     * The fields `debuggee.id` and `description` are guaranteed to be set.
     * The `description` field is a human readable field provided by agents and
     * can be displayed to users.
     * </pre>
     *
     * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
     */
    public Builder addDebuggees(
        int index, com.google.devtools.clouddebugger.v2.Debuggee.Builder builderForValue) {
      if (debuggeesBuilder_ == null) {
        ensureDebuggeesIsMutable();
        debuggees_.add(index, builderForValue.build());
        onChanged();
      } else {
        debuggeesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of debuggees accessible to the calling user.
     * The fields `debuggee.id` and `description` are guaranteed to be set.
     * The `description` field is a human readable field provided by agents and
     * can be displayed to users.
     * </pre>
     *
     * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
     */
    public Builder addAllDebuggees(
        java.lang.Iterable<? extends com.google.devtools.clouddebugger.v2.Debuggee> values) {
      if (debuggeesBuilder_ == null) {
        ensureDebuggeesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, debuggees_);
        onChanged();
      } else {
        debuggeesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of debuggees accessible to the calling user.
     * The fields `debuggee.id` and `description` are guaranteed to be set.
     * The `description` field is a human readable field provided by agents and
     * can be displayed to users.
     * </pre>
     *
     * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
     */
    public Builder clearDebuggees() {
      if (debuggeesBuilder_ == null) {
        debuggees_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        debuggeesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of debuggees accessible to the calling user.
     * The fields `debuggee.id` and `description` are guaranteed to be set.
     * The `description` field is a human readable field provided by agents and
     * can be displayed to users.
     * </pre>
     *
     * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
     */
    public Builder removeDebuggees(int index) {
      if (debuggeesBuilder_ == null) {
        ensureDebuggeesIsMutable();
        debuggees_.remove(index);
        onChanged();
      } else {
        debuggeesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of debuggees accessible to the calling user.
     * The fields `debuggee.id` and `description` are guaranteed to be set.
     * The `description` field is a human readable field provided by agents and
     * can be displayed to users.
     * </pre>
     *
     * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
     */
    public com.google.devtools.clouddebugger.v2.Debuggee.Builder getDebuggeesBuilder(int index) {
      return getDebuggeesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of debuggees accessible to the calling user.
     * The fields `debuggee.id` and `description` are guaranteed to be set.
     * The `description` field is a human readable field provided by agents and
     * can be displayed to users.
     * </pre>
     *
     * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
     */
    public com.google.devtools.clouddebugger.v2.DebuggeeOrBuilder getDebuggeesOrBuilder(int index) {
      if (debuggeesBuilder_ == null) {
        return debuggees_.get(index);
      } else {
        return debuggeesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of debuggees accessible to the calling user.
     * The fields `debuggee.id` and `description` are guaranteed to be set.
     * The `description` field is a human readable field provided by agents and
     * can be displayed to users.
     * </pre>
     *
     * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
     */
    public java.util.List<? extends com.google.devtools.clouddebugger.v2.DebuggeeOrBuilder>
        getDebuggeesOrBuilderList() {
      if (debuggeesBuilder_ != null) {
        return debuggeesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(debuggees_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of debuggees accessible to the calling user.
     * The fields `debuggee.id` and `description` are guaranteed to be set.
     * The `description` field is a human readable field provided by agents and
     * can be displayed to users.
     * </pre>
     *
     * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
     */
    public com.google.devtools.clouddebugger.v2.Debuggee.Builder addDebuggeesBuilder() {
      return getDebuggeesFieldBuilder()
          .addBuilder(com.google.devtools.clouddebugger.v2.Debuggee.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of debuggees accessible to the calling user.
     * The fields `debuggee.id` and `description` are guaranteed to be set.
     * The `description` field is a human readable field provided by agents and
     * can be displayed to users.
     * </pre>
     *
     * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
     */
    public com.google.devtools.clouddebugger.v2.Debuggee.Builder addDebuggeesBuilder(int index) {
      return getDebuggeesFieldBuilder()
          .addBuilder(index, com.google.devtools.clouddebugger.v2.Debuggee.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of debuggees accessible to the calling user.
     * The fields `debuggee.id` and `description` are guaranteed to be set.
     * The `description` field is a human readable field provided by agents and
     * can be displayed to users.
     * </pre>
     *
     * <code>repeated .google.devtools.clouddebugger.v2.Debuggee debuggees = 1;</code>
     */
    public java.util.List<com.google.devtools.clouddebugger.v2.Debuggee.Builder>
        getDebuggeesBuilderList() {
      return getDebuggeesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.devtools.clouddebugger.v2.Debuggee,
            com.google.devtools.clouddebugger.v2.Debuggee.Builder,
            com.google.devtools.clouddebugger.v2.DebuggeeOrBuilder>
        getDebuggeesFieldBuilder() {
      if (debuggeesBuilder_ == null) {
        debuggeesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.devtools.clouddebugger.v2.Debuggee,
                com.google.devtools.clouddebugger.v2.Debuggee.Builder,
                com.google.devtools.clouddebugger.v2.DebuggeeOrBuilder>(
                debuggees_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        debuggees_ = null;
      }
      return debuggeesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.clouddebugger.v2.ListDebuggeesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.clouddebugger.v2.ListDebuggeesResponse)
  private static final com.google.devtools.clouddebugger.v2.ListDebuggeesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.clouddebugger.v2.ListDebuggeesResponse();
  }

  public static com.google.devtools.clouddebugger.v2.ListDebuggeesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDebuggeesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListDebuggeesResponse>() {
        @java.lang.Override
        public ListDebuggeesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListDebuggeesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDebuggeesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.clouddebugger.v2.ListDebuggeesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
