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
// source: google/cloud/orchestration/airflow/service/v1beta1/environments.proto

package com.google.cloud.orchestration.airflow.service.v1beta1;

public interface MaintenanceWindowOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1beta1.MaintenanceWindow)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Start time of the first recurrence of the maintenance window.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Required. Start time of the first recurrence of the maintenance window.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Required. Start time of the first recurrence of the maintenance window.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Maintenance window end time. It is used only to calculate the
   * duration of the maintenance window. The value for end_time must be in the
   * future, relative to `start_time`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Required. Maintenance window end time. It is used only to calculate the
   * duration of the maintenance window. The value for end_time must be in the
   * future, relative to `start_time`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Required. Maintenance window end time. It is used only to calculate the
   * duration of the maintenance window. The value for end_time must be in the
   * future, relative to `start_time`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Maintenance window recurrence. Format is a subset of
   * [RFC-5545](https://tools.ietf.org/html/rfc5545) `RRULE`. The only allowed
   * values for `FREQ` field are `FREQ=DAILY` and `FREQ=WEEKLY;BYDAY=...`
   * Example values: `FREQ=WEEKLY;BYDAY=TU,WE`, `FREQ=DAILY`.
   * </pre>
   *
   * <code>string recurrence = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The recurrence.
   */
  java.lang.String getRecurrence();
  /**
   *
   *
   * <pre>
   * Required. Maintenance window recurrence. Format is a subset of
   * [RFC-5545](https://tools.ietf.org/html/rfc5545) `RRULE`. The only allowed
   * values for `FREQ` field are `FREQ=DAILY` and `FREQ=WEEKLY;BYDAY=...`
   * Example values: `FREQ=WEEKLY;BYDAY=TU,WE`, `FREQ=DAILY`.
   * </pre>
   *
   * <code>string recurrence = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for recurrence.
   */
  com.google.protobuf.ByteString getRecurrenceBytes();
}
