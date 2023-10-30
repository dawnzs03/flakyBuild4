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
// source: google/cloud/filestore/v1beta1/cloud_filestore_service.proto

package com.google.cloud.filestore.v1beta1;

public interface RestoreInstanceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.filestore.v1beta1.RestoreInstanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the instance, in the format
   * `projects/{project_id}/locations/{location_id}/instances/{instance_id}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the instance, in the format
   * `projects/{project_id}/locations/{location_id}/instances/{instance_id}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Name of the file share in the Filestore instance that the snapshot
   * is being restored to.
   * </pre>
   *
   * <code>string file_share = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The fileShare.
   */
  java.lang.String getFileShare();
  /**
   *
   *
   * <pre>
   * Required. Name of the file share in the Filestore instance that the snapshot
   * is being restored to.
   * </pre>
   *
   * <code>string file_share = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for fileShare.
   */
  com.google.protobuf.ByteString getFileShareBytes();

  /**
   *
   *
   * <pre>
   * The resource name of the snapshot, in the format
   * `projects/{project_id}/locations/{location_id}/snapshots/{snapshot_id}`.
   * </pre>
   *
   * <code>string source_snapshot = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the sourceSnapshot field is set.
   */
  boolean hasSourceSnapshot();
  /**
   *
   *
   * <pre>
   * The resource name of the snapshot, in the format
   * `projects/{project_id}/locations/{location_id}/snapshots/{snapshot_id}`.
   * </pre>
   *
   * <code>string source_snapshot = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The sourceSnapshot.
   */
  java.lang.String getSourceSnapshot();
  /**
   *
   *
   * <pre>
   * The resource name of the snapshot, in the format
   * `projects/{project_id}/locations/{location_id}/snapshots/{snapshot_id}`.
   * </pre>
   *
   * <code>string source_snapshot = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for sourceSnapshot.
   */
  com.google.protobuf.ByteString getSourceSnapshotBytes();

  /**
   *
   *
   * <pre>
   * The resource name of the backup, in the format
   * `projects/{project_id}/locations/{location_id}/backups/{backup_id}`.
   * </pre>
   *
   * <code>string source_backup = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the sourceBackup field is set.
   */
  boolean hasSourceBackup();
  /**
   *
   *
   * <pre>
   * The resource name of the backup, in the format
   * `projects/{project_id}/locations/{location_id}/backups/{backup_id}`.
   * </pre>
   *
   * <code>string source_backup = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The sourceBackup.
   */
  java.lang.String getSourceBackup();
  /**
   *
   *
   * <pre>
   * The resource name of the backup, in the format
   * `projects/{project_id}/locations/{location_id}/backups/{backup_id}`.
   * </pre>
   *
   * <code>string source_backup = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for sourceBackup.
   */
  com.google.protobuf.ByteString getSourceBackupBytes();

  com.google.cloud.filestore.v1beta1.RestoreInstanceRequest.SourceCase getSourceCase();
}
