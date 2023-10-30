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
// source: google/cloud/notebooks/v1/runtime.proto

package com.google.cloud.notebooks.v1;

public interface RuntimeAcceleratorConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.RuntimeAcceleratorConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Accelerator model.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Accelerator model.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType type = 1;</code>
   *
   * @return The type.
   */
  com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.AcceleratorType getType();

  /**
   *
   *
   * <pre>
   * Count of cores of this accelerator.
   * </pre>
   *
   * <code>int64 core_count = 2;</code>
   *
   * @return The coreCount.
   */
  long getCoreCount();
}
