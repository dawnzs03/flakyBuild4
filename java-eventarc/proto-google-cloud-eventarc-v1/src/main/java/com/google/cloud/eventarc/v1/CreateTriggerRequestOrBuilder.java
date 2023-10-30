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
// source: google/cloud/eventarc/v1/eventarc.proto

package com.google.cloud.eventarc.v1;

public interface CreateTriggerRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.eventarc.v1.CreateTriggerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent collection in which to add this trigger.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent collection in which to add this trigger.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The trigger to create.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.Trigger trigger = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the trigger field is set.
   */
  boolean hasTrigger();
  /**
   *
   *
   * <pre>
   * Required. The trigger to create.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.Trigger trigger = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The trigger.
   */
  com.google.cloud.eventarc.v1.Trigger getTrigger();
  /**
   *
   *
   * <pre>
   * Required. The trigger to create.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.Trigger trigger = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.eventarc.v1.TriggerOrBuilder getTriggerOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The user-provided ID to be assigned to the trigger.
   * </pre>
   *
   * <code>string trigger_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The triggerId.
   */
  java.lang.String getTriggerId();
  /**
   *
   *
   * <pre>
   * Required. The user-provided ID to be assigned to the trigger.
   * </pre>
   *
   * <code>string trigger_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for triggerId.
   */
  com.google.protobuf.ByteString getTriggerIdBytes();

  /**
   *
   *
   * <pre>
   * Required. If set, validate the request and preview the review, but do not
   * post it.
   * </pre>
   *
   * <code>bool validate_only = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
