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
// source: google/cloud/functions/v2beta/functions.proto

package com.google.cloud.functions.v2beta;

public interface StageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v2beta.Stage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the Stage. This will be unique for each Stage.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.Stage.Name name = 1;</code>
   *
   * @return The enum numeric value on the wire for name.
   */
  int getNameValue();
  /**
   *
   *
   * <pre>
   * Name of the Stage. This will be unique for each Stage.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.Stage.Name name = 1;</code>
   *
   * @return The name.
   */
  com.google.cloud.functions.v2beta.Stage.Name getName();

  /**
   *
   *
   * <pre>
   * Message describing the Stage
   * </pre>
   *
   * <code>string message = 2;</code>
   *
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   *
   *
   * <pre>
   * Message describing the Stage
   * </pre>
   *
   * <code>string message = 2;</code>
   *
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString getMessageBytes();

  /**
   *
   *
   * <pre>
   * Current state of the Stage
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.Stage.State state = 3;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Current state of the Stage
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.Stage.State state = 3;</code>
   *
   * @return The state.
   */
  com.google.cloud.functions.v2beta.Stage.State getState();

  /**
   *
   *
   * <pre>
   * Resource of the Stage
   * </pre>
   *
   * <code>string resource = 4;</code>
   *
   * @return The resource.
   */
  java.lang.String getResource();
  /**
   *
   *
   * <pre>
   * Resource of the Stage
   * </pre>
   *
   * <code>string resource = 4;</code>
   *
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString getResourceBytes();

  /**
   *
   *
   * <pre>
   * Link to the current Stage resource
   * </pre>
   *
   * <code>string resource_uri = 5;</code>
   *
   * @return The resourceUri.
   */
  java.lang.String getResourceUri();
  /**
   *
   *
   * <pre>
   * Link to the current Stage resource
   * </pre>
   *
   * <code>string resource_uri = 5;</code>
   *
   * @return The bytes for resourceUri.
   */
  com.google.protobuf.ByteString getResourceUriBytes();

  /**
   *
   *
   * <pre>
   * State messages from the current Stage.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.StateMessage state_messages = 6;</code>
   */
  java.util.List<com.google.cloud.functions.v2beta.StateMessage> getStateMessagesList();
  /**
   *
   *
   * <pre>
   * State messages from the current Stage.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.StateMessage state_messages = 6;</code>
   */
  com.google.cloud.functions.v2beta.StateMessage getStateMessages(int index);
  /**
   *
   *
   * <pre>
   * State messages from the current Stage.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.StateMessage state_messages = 6;</code>
   */
  int getStateMessagesCount();
  /**
   *
   *
   * <pre>
   * State messages from the current Stage.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.StateMessage state_messages = 6;</code>
   */
  java.util.List<? extends com.google.cloud.functions.v2beta.StateMessageOrBuilder>
      getStateMessagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * State messages from the current Stage.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.StateMessage state_messages = 6;</code>
   */
  com.google.cloud.functions.v2beta.StateMessageOrBuilder getStateMessagesOrBuilder(int index);
}
