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
// source: google/cloud/dialogflow/v2beta1/answer_record.proto

package com.google.cloud.dialogflow.v2beta1;

public interface AnswerFeedbackOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.AnswerFeedback)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The correctness level of the specific answer.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AnswerFeedback.CorrectnessLevel correctness_level = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for correctnessLevel.
   */
  int getCorrectnessLevelValue();
  /**
   *
   *
   * <pre>
   * The correctness level of the specific answer.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AnswerFeedback.CorrectnessLevel correctness_level = 1;
   * </code>
   *
   * @return The correctnessLevel.
   */
  com.google.cloud.dialogflow.v2beta1.AnswerFeedback.CorrectnessLevel getCorrectnessLevel();

  /**
   *
   *
   * <pre>
   * Optional. Detail feedback of agent assistant suggestions.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AgentAssistantFeedback agent_assistant_detail_feedback = 2;
   * </code>
   *
   * @return Whether the agentAssistantDetailFeedback field is set.
   */
  boolean hasAgentAssistantDetailFeedback();
  /**
   *
   *
   * <pre>
   * Optional. Detail feedback of agent assistant suggestions.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AgentAssistantFeedback agent_assistant_detail_feedback = 2;
   * </code>
   *
   * @return The agentAssistantDetailFeedback.
   */
  com.google.cloud.dialogflow.v2beta1.AgentAssistantFeedback getAgentAssistantDetailFeedback();
  /**
   *
   *
   * <pre>
   * Optional. Detail feedback of agent assistant suggestions.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.AgentAssistantFeedback agent_assistant_detail_feedback = 2;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.AgentAssistantFeedbackOrBuilder
      getAgentAssistantDetailFeedbackOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicates whether the answer/item was clicked by the human agent
   * or not. Default to false.
   * For knowledge search, the answer record is considered to be clicked if the
   * answer was copied or any URI was clicked.
   * </pre>
   *
   * <code>bool clicked = 3;</code>
   *
   * @return The clicked.
   */
  boolean getClicked();

  /**
   *
   *
   * <pre>
   * Time when the answer/item was clicked.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp click_time = 5;</code>
   *
   * @return Whether the clickTime field is set.
   */
  boolean hasClickTime();
  /**
   *
   *
   * <pre>
   * Time when the answer/item was clicked.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp click_time = 5;</code>
   *
   * @return The clickTime.
   */
  com.google.protobuf.Timestamp getClickTime();
  /**
   *
   *
   * <pre>
   * Time when the answer/item was clicked.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp click_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getClickTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicates whether the answer/item was displayed to the human
   * agent in the agent desktop UI. Default to false.
   * </pre>
   *
   * <code>bool displayed = 4;</code>
   *
   * @return The displayed.
   */
  boolean getDisplayed();

  /**
   *
   *
   * <pre>
   * Time when the answer/item was displayed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp display_time = 6;</code>
   *
   * @return Whether the displayTime field is set.
   */
  boolean hasDisplayTime();
  /**
   *
   *
   * <pre>
   * Time when the answer/item was displayed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp display_time = 6;</code>
   *
   * @return The displayTime.
   */
  com.google.protobuf.Timestamp getDisplayTime();
  /**
   *
   *
   * <pre>
   * Time when the answer/item was displayed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp display_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDisplayTimeOrBuilder();

  com.google.cloud.dialogflow.v2beta1.AnswerFeedback.DetailFeedbackCase getDetailFeedbackCase();
}
