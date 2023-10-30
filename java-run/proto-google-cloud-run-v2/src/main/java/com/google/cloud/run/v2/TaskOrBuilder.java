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
// source: google/cloud/run/v2/task.proto

package com.google.cloud.run.v2;

public interface TaskOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.Task)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The unique name of this Task.
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
   * Output only. The unique name of this Task.
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
   * Output only. Server assigned unique identifier for the Task. The value is a
   * UUID4 string and guaranteed to remain unchanged until the resource is
   * deleted.
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
   * Output only. Server assigned unique identifier for the Task. The value is a
   * UUID4 string and guaranteed to remain unchanged until the resource is
   * deleted.
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
   * Output only. A number that monotonically increases every time the user
   * modifies the desired state.
   * </pre>
   *
   * <code>int64 generation = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The generation.
   */
  long getGeneration();

  /**
   *
   *
   * <pre>
   * Output only. Unstructured key value map that can be used to organize and
   * categorize objects. User-provided labels are shared with Google's billing
   * system, so they can be used to filter, or break down billing charges by
   * team, component, environment, state, etc. For more information, visit
   * https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Output only. Unstructured key value map that can be used to organize and
   * categorize objects. User-provided labels are shared with Google's billing
   * system, so they can be used to filter, or break down billing charges by
   * team, component, environment, state, etc. For more information, visit
   * https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Output only. Unstructured key value map that can be used to organize and
   * categorize objects. User-provided labels are shared with Google's billing
   * system, so they can be used to filter, or break down billing charges by
   * team, component, environment, state, etc. For more information, visit
   * https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Output only. Unstructured key value map that can be used to organize and
   * categorize objects. User-provided labels are shared with Google's billing
   * system, so they can be used to filter, or break down billing charges by
   * team, component, environment, state, etc. For more information, visit
   * https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
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
   * Output only. Unstructured key value map that can be used to organize and
   * categorize objects. User-provided labels are shared with Google's billing
   * system, so they can be used to filter, or break down billing charges by
   * team, component, environment, state, etc. For more information, visit
   * https://cloud.google.com/resource-manager/docs/creating-managing-labels or
   * https://cloud.google.com/run/docs/configuring/labels
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Unstructured key value map that may
   * be set by external tools to store and arbitrary metadata.
   * They are not queryable and should be preserved
   * when modifying objects.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Output only. Unstructured key value map that may
   * be set by external tools to store and arbitrary metadata.
   * They are not queryable and should be preserved
   * when modifying objects.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * Output only. Unstructured key value map that may
   * be set by external tools to store and arbitrary metadata.
   * They are not queryable and should be preserved
   * when modifying objects.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * Output only. Unstructured key value map that may
   * be set by external tools to store and arbitrary metadata.
   * They are not queryable and should be preserved
   * when modifying objects.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Output only. Unstructured key value map that may
   * be set by external tools to store and arbitrary metadata.
   * They are not queryable and should be preserved
   * when modifying objects.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Represents time when the task was created by the job
   * controller. It is not guaranteed to be set in happens-before order across
   * separate operations.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Represents time when the task was created by the job
   * controller. It is not guaranteed to be set in happens-before order across
   * separate operations.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Represents time when the task was created by the job
   * controller. It is not guaranteed to be set in happens-before order across
   * separate operations.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Represents time when the task started to run.
   * It is not guaranteed to be set in happens-before order across separate
   * operations.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Represents time when the task started to run.
   * It is not guaranteed to be set in happens-before order across separate
   * operations.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Represents time when the task started to run.
   * It is not guaranteed to be set in happens-before order across separate
   * operations.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 27 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Represents time when the Task was completed. It is not
   * guaranteed to be set in happens-before order across separate operations.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp completion_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the completionTime field is set.
   */
  boolean hasCompletionTime();
  /**
   *
   *
   * <pre>
   * Output only. Represents time when the Task was completed. It is not
   * guaranteed to be set in happens-before order across separate operations.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp completion_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The completionTime.
   */
  com.google.protobuf.Timestamp getCompletionTime();
  /**
   *
   *
   * <pre>
   * Output only. Represents time when the Task was completed. It is not
   * guaranteed to be set in happens-before order across separate operations.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp completion_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCompletionTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. For a deleted resource, the deletion time. It is only
   * populated as a response to a Delete request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. For a deleted resource, the deletion time. It is only
   * populated as a response to a Delete request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. For a deleted resource, the deletion time. It is only
   * populated as a response to a Delete request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. For a deleted resource, the time after which it will be
   * permamently deleted. It is only populated as a response to a Delete
   * request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   *
   *
   * <pre>
   * Output only. For a deleted resource, the time after which it will be
   * permamently deleted. It is only populated as a response to a Delete
   * request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   *
   *
   * <pre>
   * Output only. For a deleted resource, the time after which it will be
   * permamently deleted. It is only populated as a response to a Delete
   * request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The name of the parent Job.
   * </pre>
   *
   * <code>
   * string job = 12 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The job.
   */
  java.lang.String getJob();
  /**
   *
   *
   * <pre>
   * Output only. The name of the parent Job.
   * </pre>
   *
   * <code>
   * string job = 12 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for job.
   */
  com.google.protobuf.ByteString getJobBytes();

  /**
   *
   *
   * <pre>
   * Output only. The name of the parent Execution.
   * </pre>
   *
   * <code>
   * string execution = 13 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The execution.
   */
  java.lang.String getExecution();
  /**
   *
   *
   * <pre>
   * Output only. The name of the parent Execution.
   * </pre>
   *
   * <code>
   * string execution = 13 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for execution.
   */
  com.google.protobuf.ByteString getExecutionBytes();

  /**
   *
   *
   * <pre>
   * Holds the single container that defines the unit of execution for this
   * task.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Container containers = 14;</code>
   */
  java.util.List<com.google.cloud.run.v2.Container> getContainersList();
  /**
   *
   *
   * <pre>
   * Holds the single container that defines the unit of execution for this
   * task.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Container containers = 14;</code>
   */
  com.google.cloud.run.v2.Container getContainers(int index);
  /**
   *
   *
   * <pre>
   * Holds the single container that defines the unit of execution for this
   * task.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Container containers = 14;</code>
   */
  int getContainersCount();
  /**
   *
   *
   * <pre>
   * Holds the single container that defines the unit of execution for this
   * task.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Container containers = 14;</code>
   */
  java.util.List<? extends com.google.cloud.run.v2.ContainerOrBuilder> getContainersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Holds the single container that defines the unit of execution for this
   * task.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Container containers = 14;</code>
   */
  com.google.cloud.run.v2.ContainerOrBuilder getContainersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A list of Volumes to make available to containers.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Volume volumes = 15;</code>
   */
  java.util.List<com.google.cloud.run.v2.Volume> getVolumesList();
  /**
   *
   *
   * <pre>
   * A list of Volumes to make available to containers.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Volume volumes = 15;</code>
   */
  com.google.cloud.run.v2.Volume getVolumes(int index);
  /**
   *
   *
   * <pre>
   * A list of Volumes to make available to containers.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Volume volumes = 15;</code>
   */
  int getVolumesCount();
  /**
   *
   *
   * <pre>
   * A list of Volumes to make available to containers.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Volume volumes = 15;</code>
   */
  java.util.List<? extends com.google.cloud.run.v2.VolumeOrBuilder> getVolumesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of Volumes to make available to containers.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Volume volumes = 15;</code>
   */
  com.google.cloud.run.v2.VolumeOrBuilder getVolumesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Number of retries allowed per Task, before marking this Task failed.
   * </pre>
   *
   * <code>int32 max_retries = 16;</code>
   *
   * @return The maxRetries.
   */
  int getMaxRetries();

  /**
   *
   *
   * <pre>
   * Max allowed time duration the Task may be active before the system will
   * actively try to mark it failed and kill associated containers. This applies
   * per attempt of a task, meaning each retry can run for the full timeout.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 17;</code>
   *
   * @return Whether the timeout field is set.
   */
  boolean hasTimeout();
  /**
   *
   *
   * <pre>
   * Max allowed time duration the Task may be active before the system will
   * actively try to mark it failed and kill associated containers. This applies
   * per attempt of a task, meaning each retry can run for the full timeout.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 17;</code>
   *
   * @return The timeout.
   */
  com.google.protobuf.Duration getTimeout();
  /**
   *
   *
   * <pre>
   * Max allowed time duration the Task may be active before the system will
   * actively try to mark it failed and kill associated containers. This applies
   * per attempt of a task, meaning each retry can run for the full timeout.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 17;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeoutOrBuilder();

  /**
   *
   *
   * <pre>
   * Email address of the IAM service account associated with the Task of a
   * Job. The service account represents the identity of the
   * running task, and determines what permissions the task has. If
   * not provided, the task will use the project's default service account.
   * </pre>
   *
   * <code>string service_account = 18;</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * Email address of the IAM service account associated with the Task of a
   * Job. The service account represents the identity of the
   * running task, and determines what permissions the task has. If
   * not provided, the task will use the project's default service account.
   * </pre>
   *
   * <code>string service_account = 18;</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * The execution environment being used to host this Task.
   * </pre>
   *
   * <code>.google.cloud.run.v2.ExecutionEnvironment execution_environment = 20;</code>
   *
   * @return The enum numeric value on the wire for executionEnvironment.
   */
  int getExecutionEnvironmentValue();
  /**
   *
   *
   * <pre>
   * The execution environment being used to host this Task.
   * </pre>
   *
   * <code>.google.cloud.run.v2.ExecutionEnvironment execution_environment = 20;</code>
   *
   * @return The executionEnvironment.
   */
  com.google.cloud.run.v2.ExecutionEnvironment getExecutionEnvironment();

  /**
   *
   *
   * <pre>
   * Output only. Indicates whether the resource's reconciliation is still in
   * progress. See comments in `Job.reconciling` for additional information on
   * reconciliation process in Cloud Run.
   * </pre>
   *
   * <code>bool reconciling = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The reconciling.
   */
  boolean getReconciling();

  /**
   *
   *
   * <pre>
   * Output only. The Condition of this Task, containing its readiness status,
   * and detailed error information in case it did not reach the desired state.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Condition conditions = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.run.v2.Condition> getConditionsList();
  /**
   *
   *
   * <pre>
   * Output only. The Condition of this Task, containing its readiness status,
   * and detailed error information in case it did not reach the desired state.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Condition conditions = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.run.v2.Condition getConditions(int index);
  /**
   *
   *
   * <pre>
   * Output only. The Condition of this Task, containing its readiness status,
   * and detailed error information in case it did not reach the desired state.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Condition conditions = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getConditionsCount();
  /**
   *
   *
   * <pre>
   * Output only. The Condition of this Task, containing its readiness status,
   * and detailed error information in case it did not reach the desired state.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Condition conditions = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.run.v2.ConditionOrBuilder> getConditionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The Condition of this Task, containing its readiness status,
   * and detailed error information in case it did not reach the desired state.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Condition conditions = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.run.v2.ConditionOrBuilder getConditionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The generation of this Task. See comments in `Job.reconciling`
   * for additional information on reconciliation process in Cloud Run.
   * </pre>
   *
   * <code>int64 observed_generation = 23 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The observedGeneration.
   */
  long getObservedGeneration();

  /**
   *
   *
   * <pre>
   * Output only. Index of the Task, unique per execution, and beginning at 0.
   * </pre>
   *
   * <code>int32 index = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The index.
   */
  int getIndex();

  /**
   *
   *
   * <pre>
   * Output only. The number of times this Task was retried.
   * Tasks are retried when they fail up to the maxRetries limit.
   * </pre>
   *
   * <code>int32 retried = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The retried.
   */
  int getRetried();

  /**
   *
   *
   * <pre>
   * Output only. Result of the last attempt of this Task.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.TaskAttemptResult last_attempt_result = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the lastAttemptResult field is set.
   */
  boolean hasLastAttemptResult();
  /**
   *
   *
   * <pre>
   * Output only. Result of the last attempt of this Task.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.TaskAttemptResult last_attempt_result = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lastAttemptResult.
   */
  com.google.cloud.run.v2.TaskAttemptResult getLastAttemptResult();
  /**
   *
   *
   * <pre>
   * Output only. Result of the last attempt of this Task.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.TaskAttemptResult last_attempt_result = 26 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.run.v2.TaskAttemptResultOrBuilder getLastAttemptResultOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A reference to a customer managed encryption key (CMEK) to use
   * to encrypt this container image. For more information, go to
   * https://cloud.google.com/run/docs/securing/using-cmek
   * </pre>
   *
   * <code>
   * string encryption_key = 28 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The encryptionKey.
   */
  java.lang.String getEncryptionKey();
  /**
   *
   *
   * <pre>
   * Output only. A reference to a customer managed encryption key (CMEK) to use
   * to encrypt this container image. For more information, go to
   * https://cloud.google.com/run/docs/securing/using-cmek
   * </pre>
   *
   * <code>
   * string encryption_key = 28 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for encryptionKey.
   */
  com.google.protobuf.ByteString getEncryptionKeyBytes();

  /**
   *
   *
   * <pre>
   * Output only. VPC Access configuration to use for this Task. For more
   * information, visit
   * https://cloud.google.com/run/docs/configuring/connecting-vpc.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.VpcAccess vpc_access = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the vpcAccess field is set.
   */
  boolean hasVpcAccess();
  /**
   *
   *
   * <pre>
   * Output only. VPC Access configuration to use for this Task. For more
   * information, visit
   * https://cloud.google.com/run/docs/configuring/connecting-vpc.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.VpcAccess vpc_access = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The vpcAccess.
   */
  com.google.cloud.run.v2.VpcAccess getVpcAccess();
  /**
   *
   *
   * <pre>
   * Output only. VPC Access configuration to use for this Task. For more
   * information, visit
   * https://cloud.google.com/run/docs/configuring/connecting-vpc.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.VpcAccess vpc_access = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.run.v2.VpcAccessOrBuilder getVpcAccessOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. URI where logs for this execution can be found in Cloud
   * Console.
   * </pre>
   *
   * <code>string log_uri = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The logUri.
   */
  java.lang.String getLogUri();
  /**
   *
   *
   * <pre>
   * Output only. URI where logs for this execution can be found in Cloud
   * Console.
   * </pre>
   *
   * <code>string log_uri = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for logUri.
   */
  com.google.protobuf.ByteString getLogUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. Reserved for future use.
   * </pre>
   *
   * <code>bool satisfies_pzs = 33 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The satisfiesPzs.
   */
  boolean getSatisfiesPzs();

  /**
   *
   *
   * <pre>
   * Output only. A system-generated fingerprint for this version of the
   * resource. May be used to detect modification conflict during updates.
   * </pre>
   *
   * <code>string etag = 99 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Output only. A system-generated fingerprint for this version of the
   * resource. May be used to detect modification conflict during updates.
   * </pre>
   *
   * <code>string etag = 99 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}
