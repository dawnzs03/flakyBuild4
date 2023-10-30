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
// source: google/cloud/baremetalsolution/v2/volume.proto

package com.google.cloud.baremetalsolution.v2;

public interface UpdateVolumeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.baremetalsolution.v2.UpdateVolumeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The volume to update.
   *
   * The `name` field is used to identify the volume to update.
   * Format: projects/{project}/locations/{location}/volumes/{volume}
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.Volume volume = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the volume field is set.
   */
  boolean hasVolume();
  /**
   *
   *
   * <pre>
   * Required. The volume to update.
   *
   * The `name` field is used to identify the volume to update.
   * Format: projects/{project}/locations/{location}/volumes/{volume}
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.Volume volume = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The volume.
   */
  com.google.cloud.baremetalsolution.v2.Volume getVolume();
  /**
   *
   *
   * <pre>
   * Required. The volume to update.
   *
   * The `name` field is used to identify the volume to update.
   * Format: projects/{project}/locations/{location}/volumes/{volume}
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.Volume volume = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.baremetalsolution.v2.VolumeOrBuilder getVolumeOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of fields to update.
   * The only currently supported fields are:
   *   `snapshot_auto_delete_behavior`
   *   `snapshot_schedule_policy_name`
   *   'labels'
   *   'snapshot_enabled'
   *   'snapshot_reservation_detail.reserved_space_percent'
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The list of fields to update.
   * The only currently supported fields are:
   *   `snapshot_auto_delete_behavior`
   *   `snapshot_schedule_policy_name`
   *   'labels'
   *   'snapshot_enabled'
   *   'snapshot_reservation_detail.reserved_space_percent'
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The list of fields to update.
   * The only currently supported fields are:
   *   `snapshot_auto_delete_behavior`
   *   `snapshot_schedule_policy_name`
   *   'labels'
   *   'snapshot_enabled'
   *   'snapshot_reservation_detail.reserved_space_percent'
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
