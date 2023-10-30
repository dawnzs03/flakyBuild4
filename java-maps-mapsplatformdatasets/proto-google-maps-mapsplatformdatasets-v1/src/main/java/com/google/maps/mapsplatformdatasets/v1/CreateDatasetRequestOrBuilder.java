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
// source: google/maps/mapsplatformdatasets/v1/maps_platform_datasets.proto

package com.google.maps.mapsplatformdatasets.v1;

public interface CreateDatasetRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.mapsplatformdatasets.v1.CreateDatasetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Parent project that will own the dataset.
   * Format: projects/{$project}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Parent project that will own the dataset.
   * Format: projects/{$project}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The dataset version to create.
   * </pre>
   *
   * <code>
   * .google.maps.mapsplatformdatasets.v1.Dataset dataset = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dataset field is set.
   */
  boolean hasDataset();
  /**
   *
   *
   * <pre>
   * Required. The dataset version to create.
   * </pre>
   *
   * <code>
   * .google.maps.mapsplatformdatasets.v1.Dataset dataset = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dataset.
   */
  com.google.maps.mapsplatformdatasets.v1.Dataset getDataset();
  /**
   *
   *
   * <pre>
   * Required. The dataset version to create.
   * </pre>
   *
   * <code>
   * .google.maps.mapsplatformdatasets.v1.Dataset dataset = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.maps.mapsplatformdatasets.v1.DatasetOrBuilder getDatasetOrBuilder();
}
