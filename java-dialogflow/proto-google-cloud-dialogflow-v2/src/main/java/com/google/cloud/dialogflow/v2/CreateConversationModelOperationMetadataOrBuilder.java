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
// source: google/cloud/dialogflow/v2/conversation_model.proto

package com.google.cloud.dialogflow.v2;

public interface CreateConversationModelOperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.CreateConversationModelOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the conversation model. Format:
   * `projects/&lt;Project ID&gt;/conversationModels/&lt;Conversation Model Id&gt;`
   * </pre>
   *
   * <code>string conversation_model = 1;</code>
   *
   * @return The conversationModel.
   */
  java.lang.String getConversationModel();
  /**
   *
   *
   * <pre>
   * The resource name of the conversation model. Format:
   * `projects/&lt;Project ID&gt;/conversationModels/&lt;Conversation Model Id&gt;`
   * </pre>
   *
   * <code>string conversation_model = 1;</code>
   *
   * @return The bytes for conversationModel.
   */
  com.google.protobuf.ByteString getConversationModelBytes();

  /**
   *
   *
   * <pre>
   * State of CreateConversationModel operation.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.CreateConversationModelOperationMetadata.State state = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * State of CreateConversationModel operation.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.CreateConversationModelOperationMetadata.State state = 2;
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.dialogflow.v2.CreateConversationModelOperationMetadata.State getState();

  /**
   *
   *
   * <pre>
   * Timestamp when the request to create conversation model is submitted. The
   * time is measured on server side.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Timestamp when the request to create conversation model is submitted. The
   * time is measured on server side.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Timestamp when the request to create conversation model is submitted. The
   * time is measured on server side.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();
}
