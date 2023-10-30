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
// source: google/cloud/alloydb/v1beta/resources.proto

package com.google.cloud.alloydb.v1beta;

public interface ContinuousBackupInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1beta.ContinuousBackupInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The encryption information for the WALs and backups required
   * for ContinuousBackup.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.EncryptionInfo encryption_info = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the encryptionInfo field is set.
   */
  boolean hasEncryptionInfo();
  /**
   *
   *
   * <pre>
   * Output only. The encryption information for the WALs and backups required
   * for ContinuousBackup.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.EncryptionInfo encryption_info = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The encryptionInfo.
   */
  com.google.cloud.alloydb.v1beta.EncryptionInfo getEncryptionInfo();
  /**
   *
   *
   * <pre>
   * Output only. The encryption information for the WALs and backups required
   * for ContinuousBackup.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.EncryptionInfo encryption_info = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.alloydb.v1beta.EncryptionInfoOrBuilder getEncryptionInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. When ContinuousBackup was most recently enabled. Set to null
   * if ContinuousBackup is not enabled.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp enabled_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the enabledTime field is set.
   */
  boolean hasEnabledTime();
  /**
   *
   *
   * <pre>
   * Output only. When ContinuousBackup was most recently enabled. Set to null
   * if ContinuousBackup is not enabled.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp enabled_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enabledTime.
   */
  com.google.protobuf.Timestamp getEnabledTime();
  /**
   *
   *
   * <pre>
   * Output only. When ContinuousBackup was most recently enabled. Set to null
   * if ContinuousBackup is not enabled.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp enabled_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEnabledTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Days of the week on which a continuous backup is taken. Output
   * only field. Ignored if passed into the request.
   * </pre>
   *
   * <code>
   * repeated .google.type.DayOfWeek schedule = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the schedule.
   */
  java.util.List<com.google.type.DayOfWeek> getScheduleList();
  /**
   *
   *
   * <pre>
   * Output only. Days of the week on which a continuous backup is taken. Output
   * only field. Ignored if passed into the request.
   * </pre>
   *
   * <code>
   * repeated .google.type.DayOfWeek schedule = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of schedule.
   */
  int getScheduleCount();
  /**
   *
   *
   * <pre>
   * Output only. Days of the week on which a continuous backup is taken. Output
   * only field. Ignored if passed into the request.
   * </pre>
   *
   * <code>
   * repeated .google.type.DayOfWeek schedule = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The schedule at the given index.
   */
  com.google.type.DayOfWeek getSchedule(int index);
  /**
   *
   *
   * <pre>
   * Output only. Days of the week on which a continuous backup is taken. Output
   * only field. Ignored if passed into the request.
   * </pre>
   *
   * <code>
   * repeated .google.type.DayOfWeek schedule = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for schedule.
   */
  java.util.List<java.lang.Integer> getScheduleValueList();
  /**
   *
   *
   * <pre>
   * Output only. Days of the week on which a continuous backup is taken. Output
   * only field. Ignored if passed into the request.
   * </pre>
   *
   * <code>
   * repeated .google.type.DayOfWeek schedule = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of schedule at the given index.
   */
  int getScheduleValue(int index);

  /**
   *
   *
   * <pre>
   * Output only. The earliest restorable time that can be restored to. Output
   * only field.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp earliest_restorable_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the earliestRestorableTime field is set.
   */
  boolean hasEarliestRestorableTime();
  /**
   *
   *
   * <pre>
   * Output only. The earliest restorable time that can be restored to. Output
   * only field.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp earliest_restorable_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The earliestRestorableTime.
   */
  com.google.protobuf.Timestamp getEarliestRestorableTime();
  /**
   *
   *
   * <pre>
   * Output only. The earliest restorable time that can be restored to. Output
   * only field.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp earliest_restorable_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEarliestRestorableTimeOrBuilder();
}
