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
// source: google/cloud/retail/v2beta/serving_config_service.proto

package com.google.cloud.retail.v2beta;

public interface UpdateServingConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.UpdateServingConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The ServingConfig to update.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the servingConfig field is set.
   */
  boolean hasServingConfig();
  /**
   *
   *
   * <pre>
   * Required. The ServingConfig to update.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The servingConfig.
   */
  com.google.cloud.retail.v2beta.ServingConfig getServingConfig();
  /**
   *
   *
   * <pre>
   * Required. The ServingConfig to update.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.retail.v2beta.ServingConfigOrBuilder getServingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [ServingConfig][google.cloud.retail.v2beta.ServingConfig] to update. The
   * following are NOT supported:
   *
   * * [ServingConfig.name][google.cloud.retail.v2beta.ServingConfig.name]
   *
   * If not set, all supported fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [ServingConfig][google.cloud.retail.v2beta.ServingConfig] to update. The
   * following are NOT supported:
   *
   * * [ServingConfig.name][google.cloud.retail.v2beta.ServingConfig.name]
   *
   * If not set, all supported fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [ServingConfig][google.cloud.retail.v2beta.ServingConfig] to update. The
   * following are NOT supported:
   *
   * * [ServingConfig.name][google.cloud.retail.v2beta.ServingConfig.name]
   *
   * If not set, all supported fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
