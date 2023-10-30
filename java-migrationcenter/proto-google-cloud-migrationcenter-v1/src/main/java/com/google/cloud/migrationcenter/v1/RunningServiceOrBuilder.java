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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

package com.google.cloud.migrationcenter.v1;

public interface RunningServiceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.RunningService)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Service name.
   * </pre>
   *
   * <code>string service_name = 1;</code>
   *
   * @return The serviceName.
   */
  java.lang.String getServiceName();
  /**
   *
   *
   * <pre>
   * Service name.
   * </pre>
   *
   * <code>string service_name = 1;</code>
   *
   * @return The bytes for serviceName.
   */
  com.google.protobuf.ByteString getServiceNameBytes();

  /**
   *
   *
   * <pre>
   * Service state (OS-agnostic).
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.RunningService.State state = 2;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Service state (OS-agnostic).
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.RunningService.State state = 2;</code>
   *
   * @return The state.
   */
  com.google.cloud.migrationcenter.v1.RunningService.State getState();

  /**
   *
   *
   * <pre>
   * Service start mode (OS-agnostic).
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.RunningService.StartMode start_mode = 3;</code>
   *
   * @return The enum numeric value on the wire for startMode.
   */
  int getStartModeValue();
  /**
   *
   *
   * <pre>
   * Service start mode (OS-agnostic).
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.RunningService.StartMode start_mode = 3;</code>
   *
   * @return The startMode.
   */
  com.google.cloud.migrationcenter.v1.RunningService.StartMode getStartMode();

  /**
   *
   *
   * <pre>
   * Service binary path.
   * </pre>
   *
   * <code>string exe_path = 4;</code>
   *
   * @return The exePath.
   */
  java.lang.String getExePath();
  /**
   *
   *
   * <pre>
   * Service binary path.
   * </pre>
   *
   * <code>string exe_path = 4;</code>
   *
   * @return The bytes for exePath.
   */
  com.google.protobuf.ByteString getExePathBytes();

  /**
   *
   *
   * <pre>
   * Service command line.
   * </pre>
   *
   * <code>string cmdline = 5;</code>
   *
   * @return The cmdline.
   */
  java.lang.String getCmdline();
  /**
   *
   *
   * <pre>
   * Service command line.
   * </pre>
   *
   * <code>string cmdline = 5;</code>
   *
   * @return The bytes for cmdline.
   */
  com.google.protobuf.ByteString getCmdlineBytes();

  /**
   *
   *
   * <pre>
   * Service pid.
   * </pre>
   *
   * <code>int64 pid = 6;</code>
   *
   * @return The pid.
   */
  long getPid();
}
