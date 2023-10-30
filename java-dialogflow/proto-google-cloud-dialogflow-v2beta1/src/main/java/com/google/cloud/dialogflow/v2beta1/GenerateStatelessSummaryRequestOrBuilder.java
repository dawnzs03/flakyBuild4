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
// source: google/cloud/dialogflow/v2beta1/conversation.proto

package com.google.cloud.dialogflow.v2beta1;

public interface GenerateStatelessSummaryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.GenerateStatelessSummaryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The conversation to suggest a summary for.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.GenerateStatelessSummaryRequest.MinimalConversation stateless_conversation = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the statelessConversation field is set.
   */
  boolean hasStatelessConversation();
  /**
   *
   *
   * <pre>
   * Required. The conversation to suggest a summary for.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.GenerateStatelessSummaryRequest.MinimalConversation stateless_conversation = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The statelessConversation.
   */
  com.google.cloud.dialogflow.v2beta1.GenerateStatelessSummaryRequest.MinimalConversation
      getStatelessConversation();
  /**
   *
   *
   * <pre>
   * Required. The conversation to suggest a summary for.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.GenerateStatelessSummaryRequest.MinimalConversation stateless_conversation = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.GenerateStatelessSummaryRequest.MinimalConversationOrBuilder
      getStatelessConversationOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. A ConversationProfile containing information required for Summary
   * generation.
   * Required fields: {language_code, security_settings}
   * Optional fields: {agent_assistant_config}
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.ConversationProfile conversation_profile = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the conversationProfile field is set.
   */
  boolean hasConversationProfile();
  /**
   *
   *
   * <pre>
   * Required. A ConversationProfile containing information required for Summary
   * generation.
   * Required fields: {language_code, security_settings}
   * Optional fields: {agent_assistant_config}
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.ConversationProfile conversation_profile = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The conversationProfile.
   */
  com.google.cloud.dialogflow.v2beta1.ConversationProfile getConversationProfile();
  /**
   *
   *
   * <pre>
   * Required. A ConversationProfile containing information required for Summary
   * generation.
   * Required fields: {language_code, security_settings}
   * Optional fields: {agent_assistant_config}
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.ConversationProfile conversation_profile = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.ConversationProfileOrBuilder
      getConversationProfileOrBuilder();

  /**
   *
   *
   * <pre>
   * The name of the latest conversation message used as context for
   * generating a Summary. If empty, the latest message of the conversation will
   * be used. The format is specific to the user and the names of the messages
   * provided.
   * </pre>
   *
   * <code>string latest_message = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The latestMessage.
   */
  java.lang.String getLatestMessage();
  /**
   *
   *
   * <pre>
   * The name of the latest conversation message used as context for
   * generating a Summary. If empty, the latest message of the conversation will
   * be used. The format is specific to the user and the names of the messages
   * provided.
   * </pre>
   *
   * <code>string latest_message = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for latestMessage.
   */
  com.google.protobuf.ByteString getLatestMessageBytes();

  /**
   *
   *
   * <pre>
   * Max number of messages prior to and including
   * [latest_message] to use as context when compiling the
   * suggestion. By default 500 and at most 1000.
   * </pre>
   *
   * <code>int32 max_context_size = 4;</code>
   *
   * @return The maxContextSize.
   */
  int getMaxContextSize();
}
