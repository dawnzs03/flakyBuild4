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
// source: google/cloud/datalabeling/v1beta1/operations.proto

package com.google.cloud.datalabeling.v1beta1;

public interface CreateInstructionMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.CreateInstructionMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the created Instruction.
   * projects/{project_id}/instructions/{instruction_id}
   * </pre>
   *
   * <code>string instruction = 1;</code>
   *
   * @return The instruction.
   */
  java.lang.String getInstruction();
  /**
   *
   *
   * <pre>
   * The name of the created Instruction.
   * projects/{project_id}/instructions/{instruction_id}
   * </pre>
   *
   * <code>string instruction = 1;</code>
   *
   * @return The bytes for instruction.
   */
  com.google.protobuf.ByteString getInstructionBytes();

  /**
   *
   *
   * <pre>
   * Partial failures encountered.
   * E.g. single files that couldn't be read.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  java.util.List<com.google.rpc.Status> getPartialFailuresList();
  /**
   *
   *
   * <pre>
   * Partial failures encountered.
   * E.g. single files that couldn't be read.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  com.google.rpc.Status getPartialFailures(int index);
  /**
   *
   *
   * <pre>
   * Partial failures encountered.
   * E.g. single files that couldn't be read.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  int getPartialFailuresCount();
  /**
   *
   *
   * <pre>
   * Partial failures encountered.
   * E.g. single files that couldn't be read.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> getPartialFailuresOrBuilderList();
  /**
   *
   *
   * <pre>
   * Partial failures encountered.
   * E.g. single files that couldn't be read.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getPartialFailuresOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Timestamp when create instruction request was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Timestamp when create instruction request was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Timestamp when create instruction request was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();
}
