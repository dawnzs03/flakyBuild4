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
// source: google/cloud/notebooks/v1/event.proto

package com.google.cloud.notebooks.v1;

public interface EventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.Event)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Event report time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp report_time = 1;</code>
   *
   * @return Whether the reportTime field is set.
   */
  boolean hasReportTime();
  /**
   *
   *
   * <pre>
   * Event report time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp report_time = 1;</code>
   *
   * @return The reportTime.
   */
  com.google.protobuf.Timestamp getReportTime();
  /**
   *
   *
   * <pre>
   * Event report time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp report_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReportTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Event type.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.Event.EventType type = 2;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Event type.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.Event.EventType type = 2;</code>
   *
   * @return The type.
   */
  com.google.cloud.notebooks.v1.Event.EventType getType();

  /**
   *
   *
   * <pre>
   * Optional. Event details. This field is used to pass event information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getDetailsCount();
  /**
   *
   *
   * <pre>
   * Optional. Event details. This field is used to pass event information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsDetails(java.lang.String key);
  /** Use {@link #getDetailsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getDetails();
  /**
   *
   *
   * <pre>
   * Optional. Event details. This field is used to pass event information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getDetailsMap();
  /**
   *
   *
   * <pre>
   * Optional. Event details. This field is used to pass event information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getDetailsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Event details. This field is used to pass event information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getDetailsOrThrow(java.lang.String key);
}
