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
// source: google/cloud/accessapproval/v1/accessapproval.proto

package com.google.cloud.accessapproval.v1;

public interface DismissDecisionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.accessapproval.v1.DismissDecision)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The time at which the approval request was dismissed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp dismiss_time = 1;</code>
   *
   * @return Whether the dismissTime field is set.
   */
  boolean hasDismissTime();
  /**
   *
   *
   * <pre>
   * The time at which the approval request was dismissed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp dismiss_time = 1;</code>
   *
   * @return The dismissTime.
   */
  com.google.protobuf.Timestamp getDismissTime();
  /**
   *
   *
   * <pre>
   * The time at which the approval request was dismissed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp dismiss_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDismissTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * This field will be true if the ApprovalRequest was implicitly dismissed due
   * to inaction by the access approval approvers (the request is not acted
   * on by the approvers before the exiration time).
   * </pre>
   *
   * <code>bool implicit = 2;</code>
   *
   * @return The implicit.
   */
  boolean getImplicit();
}
