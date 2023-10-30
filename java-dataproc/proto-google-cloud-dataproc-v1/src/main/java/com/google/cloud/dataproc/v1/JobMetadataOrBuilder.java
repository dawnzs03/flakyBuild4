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
// source: google/cloud/dataproc/v1/jobs.proto

package com.google.cloud.dataproc.v1;

public interface JobMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.JobMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The job id.
   * </pre>
   *
   * <code>string job_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The jobId.
   */
  java.lang.String getJobId();
  /**
   *
   *
   * <pre>
   * Output only. The job id.
   * </pre>
   *
   * <code>string job_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for jobId.
   */
  com.google.protobuf.ByteString getJobIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Most recent job status.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JobStatus status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * Output only. Most recent job status.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JobStatus status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The status.
   */
  com.google.cloud.dataproc.v1.JobStatus getStatus();
  /**
   *
   *
   * <pre>
   * Output only. Most recent job status.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JobStatus status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.JobStatusOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Operation type.
   * </pre>
   *
   * <code>string operation_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The operationType.
   */
  java.lang.String getOperationType();
  /**
   *
   *
   * <pre>
   * Output only. Operation type.
   * </pre>
   *
   * <code>string operation_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for operationType.
   */
  com.google.protobuf.ByteString getOperationTypeBytes();

  /**
   *
   *
   * <pre>
   * Output only. Job submission time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Job submission time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Job submission time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();
}
