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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface ShieldedInstanceIntegrityPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Updates the integrity policy baseline using the measurements from the VM instance's most recent boot.
   * </pre>
   *
   * <code>optional bool update_auto_learn_policy = 245490215;</code>
   *
   * @return Whether the updateAutoLearnPolicy field is set.
   */
  boolean hasUpdateAutoLearnPolicy();
  /**
   *
   *
   * <pre>
   * Updates the integrity policy baseline using the measurements from the VM instance's most recent boot.
   * </pre>
   *
   * <code>optional bool update_auto_learn_policy = 245490215;</code>
   *
   * @return The updateAutoLearnPolicy.
   */
  boolean getUpdateAutoLearnPolicy();
}
