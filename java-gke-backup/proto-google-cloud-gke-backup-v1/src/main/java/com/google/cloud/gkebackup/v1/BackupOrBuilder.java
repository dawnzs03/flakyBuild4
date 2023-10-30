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
// source: google/cloud/gkebackup/v1/backup.proto

package com.google.cloud.gkebackup.v1;

public interface BackupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkebackup.v1.Backup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The fully qualified name of the Backup.
   * `projects/&#42;&#47;locations/&#42;&#47;backupPlans/&#42;&#47;backups/&#42;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The fully qualified name of the Backup.
   * `projects/&#42;&#47;locations/&#42;&#47;backupPlans/&#42;&#47;backups/&#42;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Server generated global unique identifier of
   * [UUID4](https://en.wikipedia.org/wiki/Universally_unique_identifier)
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. Server generated global unique identifier of
   * [UUID4](https://en.wikipedia.org/wiki/Universally_unique_identifier)
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this Backup resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this Backup resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this Backup resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this Backup resource was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this Backup resource was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this Backup resource was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. This flag indicates whether this Backup resource was created
   * manually by a user or via a schedule in the BackupPlan. A value of True
   * means that the Backup was created manually.
   * </pre>
   *
   * <code>bool manual = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The manual.
   */
  boolean getManual();

  /**
   *
   *
   * <pre>
   * A set of custom labels supplied by user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * A set of custom labels supplied by user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * A set of custom labels supplied by user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * A set of custom labels supplied by user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * A set of custom labels supplied by user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Minimum age for this Backup (in days). If this field is set to a non-zero
   * value, the Backup will be "locked" against deletion (either manual or
   * automatic deletion) for the number of days provided (measured from the
   * creation time of the Backup).  MUST be an integer value between 0-90
   * (inclusive).
   *
   * Defaults to parent BackupPlan's
   * [backup_delete_lock_days][google.cloud.gkebackup.v1.BackupPlan.RetentionPolicy.backup_delete_lock_days]
   * setting and may only be increased
   * (either at creation time or in a subsequent update).
   * </pre>
   *
   * <code>int32 delete_lock_days = 7;</code>
   *
   * @return The deleteLockDays.
   */
  int getDeleteLockDays();

  /**
   *
   *
   * <pre>
   * Output only. The time at which an existing delete lock will expire for this
   * backup (calculated from create_time +
   * [delete_lock_days][google.cloud.gkebackup.v1.Backup.delete_lock_days]).
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp delete_lock_expire_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deleteLockExpireTime field is set.
   */
  boolean hasDeleteLockExpireTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which an existing delete lock will expire for this
   * backup (calculated from create_time +
   * [delete_lock_days][google.cloud.gkebackup.v1.Backup.delete_lock_days]).
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp delete_lock_expire_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deleteLockExpireTime.
   */
  com.google.protobuf.Timestamp getDeleteLockExpireTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which an existing delete lock will expire for this
   * backup (calculated from create_time +
   * [delete_lock_days][google.cloud.gkebackup.v1.Backup.delete_lock_days]).
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp delete_lock_expire_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteLockExpireTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The age (in days) after which this Backup will be automatically deleted.
   * Must be an integer value &gt;= 0:
   *
   * - If 0, no automatic deletion will occur for this Backup.
   * - If not 0, this must be &gt;=
   * [delete_lock_days][google.cloud.gkebackup.v1.Backup.delete_lock_days] and
   * &lt;= 365.
   *
   * Once a Backup is created, this value may only be increased.
   *
   * Defaults to the parent BackupPlan's
   * [backup_retain_days][google.cloud.gkebackup.v1.BackupPlan.RetentionPolicy.backup_retain_days]
   * value.
   * </pre>
   *
   * <code>int32 retain_days = 9;</code>
   *
   * @return The retainDays.
   */
  int getRetainDays();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this Backup will be automatically deleted
   * (calculated from create_time +
   * [retain_days][google.cloud.gkebackup.v1.Backup.retain_days]).
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp retain_expire_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the retainExpireTime field is set.
   */
  boolean hasRetainExpireTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this Backup will be automatically deleted
   * (calculated from create_time +
   * [retain_days][google.cloud.gkebackup.v1.Backup.retain_days]).
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp retain_expire_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The retainExpireTime.
   */
  com.google.protobuf.Timestamp getRetainExpireTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this Backup will be automatically deleted
   * (calculated from create_time +
   * [retain_days][google.cloud.gkebackup.v1.Backup.retain_days]).
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp retain_expire_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getRetainExpireTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The customer managed encryption key that was used to encrypt
   * the Backup's artifacts.  Inherited from the parent BackupPlan's
   * [encryption_key][google.cloud.gkebackup.v1.BackupPlan.BackupConfig.encryption_key]
   * value.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.EncryptionKey encryption_key = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the encryptionKey field is set.
   */
  boolean hasEncryptionKey();
  /**
   *
   *
   * <pre>
   * Output only. The customer managed encryption key that was used to encrypt
   * the Backup's artifacts.  Inherited from the parent BackupPlan's
   * [encryption_key][google.cloud.gkebackup.v1.BackupPlan.BackupConfig.encryption_key]
   * value.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.EncryptionKey encryption_key = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The encryptionKey.
   */
  com.google.cloud.gkebackup.v1.EncryptionKey getEncryptionKey();
  /**
   *
   *
   * <pre>
   * Output only. The customer managed encryption key that was used to encrypt
   * the Backup's artifacts.  Inherited from the parent BackupPlan's
   * [encryption_key][google.cloud.gkebackup.v1.BackupPlan.BackupConfig.encryption_key]
   * value.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.EncryptionKey encryption_key = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gkebackup.v1.EncryptionKeyOrBuilder getEncryptionKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. If True, all namespaces were included in the Backup.
   * </pre>
   *
   * <code>bool all_namespaces = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the allNamespaces field is set.
   */
  boolean hasAllNamespaces();
  /**
   *
   *
   * <pre>
   * Output only. If True, all namespaces were included in the Backup.
   * </pre>
   *
   * <code>bool all_namespaces = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The allNamespaces.
   */
  boolean getAllNamespaces();

  /**
   *
   *
   * <pre>
   * Output only. If set, the list of namespaces that were included in the
   * Backup.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.Namespaces selected_namespaces = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the selectedNamespaces field is set.
   */
  boolean hasSelectedNamespaces();
  /**
   *
   *
   * <pre>
   * Output only. If set, the list of namespaces that were included in the
   * Backup.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.Namespaces selected_namespaces = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The selectedNamespaces.
   */
  com.google.cloud.gkebackup.v1.Namespaces getSelectedNamespaces();
  /**
   *
   *
   * <pre>
   * Output only. If set, the list of namespaces that were included in the
   * Backup.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.Namespaces selected_namespaces = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gkebackup.v1.NamespacesOrBuilder getSelectedNamespacesOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. If set, the list of ProtectedApplications whose resources
   * were included in the Backup.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.NamespacedNames selected_applications = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the selectedApplications field is set.
   */
  boolean hasSelectedApplications();
  /**
   *
   *
   * <pre>
   * Output only. If set, the list of ProtectedApplications whose resources
   * were included in the Backup.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.NamespacedNames selected_applications = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The selectedApplications.
   */
  com.google.cloud.gkebackup.v1.NamespacedNames getSelectedApplications();
  /**
   *
   *
   * <pre>
   * Output only. If set, the list of ProtectedApplications whose resources
   * were included in the Backup.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.NamespacedNames selected_applications = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gkebackup.v1.NamespacedNamesOrBuilder getSelectedApplicationsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Whether or not the Backup contains volume data.  Controlled by
   * the parent BackupPlan's
   * [include_volume_data][google.cloud.gkebackup.v1.BackupPlan.BackupConfig.include_volume_data]
   * value.
   * </pre>
   *
   * <code>bool contains_volume_data = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The containsVolumeData.
   */
  boolean getContainsVolumeData();

  /**
   *
   *
   * <pre>
   * Output only. Whether or not the Backup contains Kubernetes Secrets.
   * Controlled by the parent BackupPlan's
   * [include_secrets][google.cloud.gkebackup.v1.BackupPlan.BackupConfig.include_secrets]
   * value.
   * </pre>
   *
   * <code>bool contains_secrets = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The containsSecrets.
   */
  boolean getContainsSecrets();

  /**
   *
   *
   * <pre>
   * Output only. Information about the GKE cluster from which this Backup was
   * created.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.Backup.ClusterMetadata cluster_metadata = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the clusterMetadata field is set.
   */
  boolean hasClusterMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Information about the GKE cluster from which this Backup was
   * created.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.Backup.ClusterMetadata cluster_metadata = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The clusterMetadata.
   */
  com.google.cloud.gkebackup.v1.Backup.ClusterMetadata getClusterMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Information about the GKE cluster from which this Backup was
   * created.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.Backup.ClusterMetadata cluster_metadata = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gkebackup.v1.Backup.ClusterMetadataOrBuilder getClusterMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Current state of the Backup
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.Backup.State state = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. Current state of the Backup
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.Backup.State state = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.gkebackup.v1.Backup.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Human-readable description of why the backup is in the current
   * `state`.
   * </pre>
   *
   * <code>string state_reason = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The stateReason.
   */
  java.lang.String getStateReason();
  /**
   *
   *
   * <pre>
   * Output only. Human-readable description of why the backup is in the current
   * `state`.
   * </pre>
   *
   * <code>string state_reason = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for stateReason.
   */
  com.google.protobuf.ByteString getStateReasonBytes();

  /**
   *
   *
   * <pre>
   * Output only. Completion time of the Backup
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp complete_time = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the completeTime field is set.
   */
  boolean hasCompleteTime();
  /**
   *
   *
   * <pre>
   * Output only. Completion time of the Backup
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp complete_time = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The completeTime.
   */
  com.google.protobuf.Timestamp getCompleteTime();
  /**
   *
   *
   * <pre>
   * Output only. Completion time of the Backup
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp complete_time = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCompleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The total number of Kubernetes resources included in the
   * Backup.
   * </pre>
   *
   * <code>int32 resource_count = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The resourceCount.
   */
  int getResourceCount();

  /**
   *
   *
   * <pre>
   * Output only. The total number of volume backups contained in the Backup.
   * </pre>
   *
   * <code>int32 volume_count = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The volumeCount.
   */
  int getVolumeCount();

  /**
   *
   *
   * <pre>
   * Output only. The total size of the Backup in bytes = config backup size +
   * sum(volume backup sizes)
   * </pre>
   *
   * <code>int64 size_bytes = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The sizeBytes.
   */
  long getSizeBytes();

  /**
   *
   *
   * <pre>
   * Output only. `etag` is used for optimistic concurrency control as a way to
   * help prevent simultaneous updates of a backup from overwriting each other.
   * It is strongly suggested that systems make use of the `etag` in the
   * read-modify-write cycle to perform backup updates in order to avoid
   * race conditions: An `etag` is returned in the response to `GetBackup`,
   * and systems are expected to put that etag in the request to
   * `UpdateBackup` or `DeleteBackup` to ensure that their change will be
   * applied to the same version of the resource.
   * </pre>
   *
   * <code>string etag = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Output only. `etag` is used for optimistic concurrency control as a way to
   * help prevent simultaneous updates of a backup from overwriting each other.
   * It is strongly suggested that systems make use of the `etag` in the
   * read-modify-write cycle to perform backup updates in order to avoid
   * race conditions: An `etag` is returned in the response to `GetBackup`,
   * and systems are expected to put that etag in the request to
   * `UpdateBackup` or `DeleteBackup` to ensure that their change will be
   * applied to the same version of the resource.
   * </pre>
   *
   * <code>string etag = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * User specified descriptive string for this Backup.
   * </pre>
   *
   * <code>string description = 25;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * User specified descriptive string for this Backup.
   * </pre>
   *
   * <code>string description = 25;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The total number of Kubernetes Pods contained in the Backup.
   * </pre>
   *
   * <code>int32 pod_count = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The podCount.
   */
  int getPodCount();

  /**
   *
   *
   * <pre>
   * Output only. The size of the config backup in bytes.
   * </pre>
   *
   * <code>int64 config_backup_size_bytes = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The configBackupSizeBytes.
   */
  long getConfigBackupSizeBytes();

  com.google.cloud.gkebackup.v1.Backup.BackupScopeCase getBackupScopeCase();
}
