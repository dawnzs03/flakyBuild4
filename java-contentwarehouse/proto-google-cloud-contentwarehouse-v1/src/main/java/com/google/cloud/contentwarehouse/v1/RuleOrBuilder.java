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
// source: google/cloud/contentwarehouse/v1/rule_engine.proto

package com.google.cloud.contentwarehouse.v1;

public interface RuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.Rule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Short description of the rule and its context.
   * </pre>
   *
   * <code>string description = 1;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Short description of the rule and its context.
   * </pre>
   *
   * <code>string description = 1;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * ID of the rule. It has to be unique across all the examples.
   * This is managed internally.
   * </pre>
   *
   * <code>string rule_id = 2;</code>
   *
   * @return The ruleId.
   */
  java.lang.String getRuleId();
  /**
   *
   *
   * <pre>
   * ID of the rule. It has to be unique across all the examples.
   * This is managed internally.
   * </pre>
   *
   * <code>string rule_id = 2;</code>
   *
   * @return The bytes for ruleId.
   */
  com.google.protobuf.ByteString getRuleIdBytes();

  /**
   *
   *
   * <pre>
   * Identifies the trigger type for running the policy.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.Rule.TriggerType trigger_type = 3;</code>
   *
   * @return The enum numeric value on the wire for triggerType.
   */
  int getTriggerTypeValue();
  /**
   *
   *
   * <pre>
   * Identifies the trigger type for running the policy.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.Rule.TriggerType trigger_type = 3;</code>
   *
   * @return The triggerType.
   */
  com.google.cloud.contentwarehouse.v1.Rule.TriggerType getTriggerType();

  /**
   *
   *
   * <pre>
   * Represents the conditional expression to be evaluated.
   * Expression should evaluate to a boolean result.
   * When the condition is true actions are executed.
   * Example: user_role = "hsbc_role_1" AND doc.salary &gt; 20000
   * </pre>
   *
   * <code>string condition = 4;</code>
   *
   * @return The condition.
   */
  java.lang.String getCondition();
  /**
   *
   *
   * <pre>
   * Represents the conditional expression to be evaluated.
   * Expression should evaluate to a boolean result.
   * When the condition is true actions are executed.
   * Example: user_role = "hsbc_role_1" AND doc.salary &gt; 20000
   * </pre>
   *
   * <code>string condition = 4;</code>
   *
   * @return The bytes for condition.
   */
  com.google.protobuf.ByteString getConditionBytes();

  /**
   *
   *
   * <pre>
   * List of actions that are executed when the rule is satisfied.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Action actions = 5;</code>
   */
  java.util.List<com.google.cloud.contentwarehouse.v1.Action> getActionsList();
  /**
   *
   *
   * <pre>
   * List of actions that are executed when the rule is satisfied.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Action actions = 5;</code>
   */
  com.google.cloud.contentwarehouse.v1.Action getActions(int index);
  /**
   *
   *
   * <pre>
   * List of actions that are executed when the rule is satisfied.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Action actions = 5;</code>
   */
  int getActionsCount();
  /**
   *
   *
   * <pre>
   * List of actions that are executed when the rule is satisfied.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Action actions = 5;</code>
   */
  java.util.List<? extends com.google.cloud.contentwarehouse.v1.ActionOrBuilder>
      getActionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of actions that are executed when the rule is satisfied.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Action actions = 5;</code>
   */
  com.google.cloud.contentwarehouse.v1.ActionOrBuilder getActionsOrBuilder(int index);
}
