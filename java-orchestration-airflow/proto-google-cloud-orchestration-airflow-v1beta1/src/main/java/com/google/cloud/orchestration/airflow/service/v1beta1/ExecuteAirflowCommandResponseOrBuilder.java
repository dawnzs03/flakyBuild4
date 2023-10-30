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

public interface ExecuteAirflowCommandResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1beta1.ExecuteAirflowCommandResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique ID of the command execution for polling.
   * </pre>
   *
   * <code>string execution_id = 1;</code>
   *
   * @return The executionId.
   */
  java.lang.String getExecutionId();
  /**
   *
   *
   * <pre>
   * The unique ID of the command execution for polling.
   * </pre>
   *
   * <code>string execution_id = 1;</code>
   *
   * @return The bytes for executionId.
   */
  com.google.protobuf.ByteString getExecutionIdBytes();

  /**
   *
   *
   * <pre>
   * The name of the pod where the command is executed.
   * </pre>
   *
   * <code>string pod = 2;</code>
   *
   * @return The pod.
   */
  java.lang.String getPod();
  /**
   *
   *
   * <pre>
   * The name of the pod where the command is executed.
   * </pre>
   *
   * <code>string pod = 2;</code>
   *
   * @return The bytes for pod.
   */
  com.google.protobuf.ByteString getPodBytes();

  /**
   *
   *
   * <pre>
   * The namespace of the pod where the command is executed.
   * </pre>
   *
   * <code>string pod_namespace = 3;</code>
   *
   * @return The podNamespace.
   */
  java.lang.String getPodNamespace();
  /**
   *
   *
   * <pre>
   * The namespace of the pod where the command is executed.
   * </pre>
   *
   * <code>string pod_namespace = 3;</code>
   *
   * @return The bytes for podNamespace.
   */
  com.google.protobuf.ByteString getPodNamespaceBytes();

  /**
   *
   *
   * <pre>
   * Error message. Empty if there was no error.
   * </pre>
   *
   * <code>string error = 4;</code>
   *
   * @return The error.
   */
  java.lang.String getError();
  /**
   *
   *
   * <pre>
   * Error message. Empty if there was no error.
   * </pre>
   *
   * <code>string error = 4;</code>
   *
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString getErrorBytes();
}
