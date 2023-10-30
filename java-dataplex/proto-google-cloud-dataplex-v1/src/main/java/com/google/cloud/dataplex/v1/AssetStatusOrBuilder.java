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
// source: google/cloud/dataplex/v1/resources.proto

package com.google.cloud.dataplex.v1;

public interface AssetStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.AssetStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Last update time of the status.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Last update time of the status.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Last update time of the status.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Number of active assets.
   * </pre>
   *
   * <code>int32 active_assets = 2;</code>
   *
   * @return The activeAssets.
   */
  int getActiveAssets();

  /**
   *
   *
   * <pre>
   * Number of assets that are in process of updating the security policy on
   * attached resources.
   * </pre>
   *
   * <code>int32 security_policy_applying_assets = 3;</code>
   *
   * @return The securityPolicyApplyingAssets.
   */
  int getSecurityPolicyApplyingAssets();
}
