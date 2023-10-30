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
// source: google/cloud/dialogflow/v2/conversation_profile.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * Defines notification behavior.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.NotificationConfig}
 */
public final class NotificationConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.NotificationConfig)
    NotificationConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NotificationConfig.newBuilder() to construct.
  private NotificationConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NotificationConfig() {
    topic_ = "";
    messageFormat_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NotificationConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.ConversationProfileProto
        .internal_static_google_cloud_dialogflow_v2_NotificationConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ConversationProfileProto
        .internal_static_google_cloud_dialogflow_v2_NotificationConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.NotificationConfig.class,
            com.google.cloud.dialogflow.v2.NotificationConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Format of cloud pub/sub message.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.dialogflow.v2.NotificationConfig.MessageFormat}
   */
  public enum MessageFormat implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * If it is unspecified, PROTO will be used.
     * </pre>
     *
     * <code>MESSAGE_FORMAT_UNSPECIFIED = 0;</code>
     */
    MESSAGE_FORMAT_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Pub/Sub message will be serialized proto.
     * </pre>
     *
     * <code>PROTO = 1;</code>
     */
    PROTO(1),
    /**
     *
     *
     * <pre>
     * Pub/Sub message will be json.
     * </pre>
     *
     * <code>JSON = 2;</code>
     */
    JSON(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * If it is unspecified, PROTO will be used.
     * </pre>
     *
     * <code>MESSAGE_FORMAT_UNSPECIFIED = 0;</code>
     */
    public static final int MESSAGE_FORMAT_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Pub/Sub message will be serialized proto.
     * </pre>
     *
     * <code>PROTO = 1;</code>
     */
    public static final int PROTO_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Pub/Sub message will be json.
     * </pre>
     *
     * <code>JSON = 2;</code>
     */
    public static final int JSON_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MessageFormat valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MessageFormat forNumber(int value) {
      switch (value) {
        case 0:
          return MESSAGE_FORMAT_UNSPECIFIED;
        case 1:
          return PROTO;
        case 2:
          return JSON;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MessageFormat> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<MessageFormat> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MessageFormat>() {
          public MessageFormat findValueByNumber(int number) {
            return MessageFormat.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.NotificationConfig.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final MessageFormat[] VALUES = values();

    public static MessageFormat valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MessageFormat(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.dialogflow.v2.NotificationConfig.MessageFormat)
  }

  public static final int TOPIC_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object topic_ = "";
  /**
   *
   *
   * <pre>
   * Name of the Pub/Sub topic to publish conversation
   * events like
   * [CONVERSATION_STARTED][google.cloud.dialogflow.v2.ConversationEvent.Type.CONVERSATION_STARTED]
   * as serialized
   * [ConversationEvent][google.cloud.dialogflow.v2.ConversationEvent] protos.
   *
   * For telephony integration to receive notification, make sure either this
   * topic is in the same project as the conversation or you grant
   * `service-&lt;Conversation Project
   * Number&gt;&#64;gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow Service
   * Agent` role in the topic project.
   *
   * For chat integration to receive notification, make sure API caller has been
   * granted the `Dialogflow Service Agent` role for the topic.
   *
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/topics/&lt;Topic ID&gt;`.
   * </pre>
   *
   * <code>string topic = 1;</code>
   *
   * @return The topic.
   */
  @java.lang.Override
  public java.lang.String getTopic() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topic_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the Pub/Sub topic to publish conversation
   * events like
   * [CONVERSATION_STARTED][google.cloud.dialogflow.v2.ConversationEvent.Type.CONVERSATION_STARTED]
   * as serialized
   * [ConversationEvent][google.cloud.dialogflow.v2.ConversationEvent] protos.
   *
   * For telephony integration to receive notification, make sure either this
   * topic is in the same project as the conversation or you grant
   * `service-&lt;Conversation Project
   * Number&gt;&#64;gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow Service
   * Agent` role in the topic project.
   *
   * For chat integration to receive notification, make sure API caller has been
   * granted the `Dialogflow Service Agent` role for the topic.
   *
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/topics/&lt;Topic ID&gt;`.
   * </pre>
   *
   * <code>string topic = 1;</code>
   *
   * @return The bytes for topic.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTopicBytes() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      topic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_FORMAT_FIELD_NUMBER = 2;
  private int messageFormat_ = 0;
  /**
   *
   *
   * <pre>
   * Format of message.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.NotificationConfig.MessageFormat message_format = 2;</code>
   *
   * @return The enum numeric value on the wire for messageFormat.
   */
  @java.lang.Override
  public int getMessageFormatValue() {
    return messageFormat_;
  }
  /**
   *
   *
   * <pre>
   * Format of message.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.NotificationConfig.MessageFormat message_format = 2;</code>
   *
   * @return The messageFormat.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.NotificationConfig.MessageFormat getMessageFormat() {
    com.google.cloud.dialogflow.v2.NotificationConfig.MessageFormat result =
        com.google.cloud.dialogflow.v2.NotificationConfig.MessageFormat.forNumber(messageFormat_);
    return result == null
        ? com.google.cloud.dialogflow.v2.NotificationConfig.MessageFormat.UNRECOGNIZED
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topic_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, topic_);
    }
    if (messageFormat_
        != com.google.cloud.dialogflow.v2.NotificationConfig.MessageFormat
            .MESSAGE_FORMAT_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, messageFormat_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topic_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, topic_);
    }
    if (messageFormat_
        != com.google.cloud.dialogflow.v2.NotificationConfig.MessageFormat
            .MESSAGE_FORMAT_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, messageFormat_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.NotificationConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.NotificationConfig other =
        (com.google.cloud.dialogflow.v2.NotificationConfig) obj;

    if (!getTopic().equals(other.getTopic())) return false;
    if (messageFormat_ != other.messageFormat_) return false;
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
    hash = (37 * hash) + TOPIC_FIELD_NUMBER;
    hash = (53 * hash) + getTopic().hashCode();
    hash = (37 * hash) + MESSAGE_FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + messageFormat_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.NotificationConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.NotificationConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.NotificationConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.NotificationConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.NotificationConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.NotificationConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.NotificationConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.NotificationConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.NotificationConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.NotificationConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.NotificationConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.NotificationConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.v2.NotificationConfig prototype) {
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
   * Defines notification behavior.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.NotificationConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.NotificationConfig)
      com.google.cloud.dialogflow.v2.NotificationConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.ConversationProfileProto
          .internal_static_google_cloud_dialogflow_v2_NotificationConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ConversationProfileProto
          .internal_static_google_cloud_dialogflow_v2_NotificationConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.NotificationConfig.class,
              com.google.cloud.dialogflow.v2.NotificationConfig.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.NotificationConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      topic_ = "";
      messageFormat_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ConversationProfileProto
          .internal_static_google_cloud_dialogflow_v2_NotificationConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.NotificationConfig getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.NotificationConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.NotificationConfig build() {
      com.google.cloud.dialogflow.v2.NotificationConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.NotificationConfig buildPartial() {
      com.google.cloud.dialogflow.v2.NotificationConfig result =
          new com.google.cloud.dialogflow.v2.NotificationConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2.NotificationConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.topic_ = topic_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.messageFormat_ = messageFormat_;
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
      if (other instanceof com.google.cloud.dialogflow.v2.NotificationConfig) {
        return mergeFrom((com.google.cloud.dialogflow.v2.NotificationConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.NotificationConfig other) {
      if (other == com.google.cloud.dialogflow.v2.NotificationConfig.getDefaultInstance())
        return this;
      if (!other.getTopic().isEmpty()) {
        topic_ = other.topic_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.messageFormat_ != 0) {
        setMessageFormatValue(other.getMessageFormatValue());
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
                topic_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                messageFormat_ = input.readEnum();
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

    private java.lang.Object topic_ = "";
    /**
     *
     *
     * <pre>
     * Name of the Pub/Sub topic to publish conversation
     * events like
     * [CONVERSATION_STARTED][google.cloud.dialogflow.v2.ConversationEvent.Type.CONVERSATION_STARTED]
     * as serialized
     * [ConversationEvent][google.cloud.dialogflow.v2.ConversationEvent] protos.
     *
     * For telephony integration to receive notification, make sure either this
     * topic is in the same project as the conversation or you grant
     * `service-&lt;Conversation Project
     * Number&gt;&#64;gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow Service
     * Agent` role in the topic project.
     *
     * For chat integration to receive notification, make sure API caller has been
     * granted the `Dialogflow Service Agent` role for the topic.
     *
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/topics/&lt;Topic ID&gt;`.
     * </pre>
     *
     * <code>string topic = 1;</code>
     *
     * @return The topic.
     */
    public java.lang.String getTopic() {
      java.lang.Object ref = topic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the Pub/Sub topic to publish conversation
     * events like
     * [CONVERSATION_STARTED][google.cloud.dialogflow.v2.ConversationEvent.Type.CONVERSATION_STARTED]
     * as serialized
     * [ConversationEvent][google.cloud.dialogflow.v2.ConversationEvent] protos.
     *
     * For telephony integration to receive notification, make sure either this
     * topic is in the same project as the conversation or you grant
     * `service-&lt;Conversation Project
     * Number&gt;&#64;gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow Service
     * Agent` role in the topic project.
     *
     * For chat integration to receive notification, make sure API caller has been
     * granted the `Dialogflow Service Agent` role for the topic.
     *
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/topics/&lt;Topic ID&gt;`.
     * </pre>
     *
     * <code>string topic = 1;</code>
     *
     * @return The bytes for topic.
     */
    public com.google.protobuf.ByteString getTopicBytes() {
      java.lang.Object ref = topic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        topic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the Pub/Sub topic to publish conversation
     * events like
     * [CONVERSATION_STARTED][google.cloud.dialogflow.v2.ConversationEvent.Type.CONVERSATION_STARTED]
     * as serialized
     * [ConversationEvent][google.cloud.dialogflow.v2.ConversationEvent] protos.
     *
     * For telephony integration to receive notification, make sure either this
     * topic is in the same project as the conversation or you grant
     * `service-&lt;Conversation Project
     * Number&gt;&#64;gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow Service
     * Agent` role in the topic project.
     *
     * For chat integration to receive notification, make sure API caller has been
     * granted the `Dialogflow Service Agent` role for the topic.
     *
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/topics/&lt;Topic ID&gt;`.
     * </pre>
     *
     * <code>string topic = 1;</code>
     *
     * @param value The topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopic(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      topic_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the Pub/Sub topic to publish conversation
     * events like
     * [CONVERSATION_STARTED][google.cloud.dialogflow.v2.ConversationEvent.Type.CONVERSATION_STARTED]
     * as serialized
     * [ConversationEvent][google.cloud.dialogflow.v2.ConversationEvent] protos.
     *
     * For telephony integration to receive notification, make sure either this
     * topic is in the same project as the conversation or you grant
     * `service-&lt;Conversation Project
     * Number&gt;&#64;gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow Service
     * Agent` role in the topic project.
     *
     * For chat integration to receive notification, make sure API caller has been
     * granted the `Dialogflow Service Agent` role for the topic.
     *
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/topics/&lt;Topic ID&gt;`.
     * </pre>
     *
     * <code>string topic = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTopic() {
      topic_ = getDefaultInstance().getTopic();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the Pub/Sub topic to publish conversation
     * events like
     * [CONVERSATION_STARTED][google.cloud.dialogflow.v2.ConversationEvent.Type.CONVERSATION_STARTED]
     * as serialized
     * [ConversationEvent][google.cloud.dialogflow.v2.ConversationEvent] protos.
     *
     * For telephony integration to receive notification, make sure either this
     * topic is in the same project as the conversation or you grant
     * `service-&lt;Conversation Project
     * Number&gt;&#64;gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow Service
     * Agent` role in the topic project.
     *
     * For chat integration to receive notification, make sure API caller has been
     * granted the `Dialogflow Service Agent` role for the topic.
     *
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/topics/&lt;Topic ID&gt;`.
     * </pre>
     *
     * <code>string topic = 1;</code>
     *
     * @param value The bytes for topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopicBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      topic_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int messageFormat_ = 0;
    /**
     *
     *
     * <pre>
     * Format of message.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.NotificationConfig.MessageFormat message_format = 2;</code>
     *
     * @return The enum numeric value on the wire for messageFormat.
     */
    @java.lang.Override
    public int getMessageFormatValue() {
      return messageFormat_;
    }
    /**
     *
     *
     * <pre>
     * Format of message.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.NotificationConfig.MessageFormat message_format = 2;</code>
     *
     * @param value The enum numeric value on the wire for messageFormat to set.
     * @return This builder for chaining.
     */
    public Builder setMessageFormatValue(int value) {
      messageFormat_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Format of message.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.NotificationConfig.MessageFormat message_format = 2;</code>
     *
     * @return The messageFormat.
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.v2.NotificationConfig.MessageFormat getMessageFormat() {
      com.google.cloud.dialogflow.v2.NotificationConfig.MessageFormat result =
          com.google.cloud.dialogflow.v2.NotificationConfig.MessageFormat.forNumber(messageFormat_);
      return result == null
          ? com.google.cloud.dialogflow.v2.NotificationConfig.MessageFormat.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Format of message.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.NotificationConfig.MessageFormat message_format = 2;</code>
     *
     * @param value The messageFormat to set.
     * @return This builder for chaining.
     */
    public Builder setMessageFormat(
        com.google.cloud.dialogflow.v2.NotificationConfig.MessageFormat value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      messageFormat_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Format of message.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.NotificationConfig.MessageFormat message_format = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMessageFormat() {
      bitField0_ = (bitField0_ & ~0x00000002);
      messageFormat_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.NotificationConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.NotificationConfig)
  private static final com.google.cloud.dialogflow.v2.NotificationConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.NotificationConfig();
  }

  public static com.google.cloud.dialogflow.v2.NotificationConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NotificationConfig> PARSER =
      new com.google.protobuf.AbstractParser<NotificationConfig>() {
        @java.lang.Override
        public NotificationConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<NotificationConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NotificationConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.NotificationConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
