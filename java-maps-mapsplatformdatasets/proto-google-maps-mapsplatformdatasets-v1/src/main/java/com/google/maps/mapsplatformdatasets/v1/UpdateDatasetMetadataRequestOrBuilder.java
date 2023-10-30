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

public interface UpdateDatasetMetadataRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.mapsplatformdatasets.v1.UpdateDatasetMetadataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The dataset to update. The dataset's name is used to identify the
   * dataset to be updated. The name has the format:
   * projects/{project}/datasets/{dataset_id}
   * </pre>
   *
   * <code>
   * .google.maps.mapsplatformdatasets.v1.Dataset dataset = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dataset field is set.
   */
  boolean hasDataset();
  /**
   *
   *
   * <pre>
   * Required. The dataset to update. The dataset's name is used to identify the
   * dataset to be updated. The name has the format:
   * projects/{project}/datasets/{dataset_id}
   * </pre>
   *
   * <code>
   * .google.maps.mapsplatformdatasets.v1.Dataset dataset = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dataset.
   */
  com.google.maps.mapsplatformdatasets.v1.Dataset getDataset();
  /**
   *
   *
   * <pre>
   * Required. The dataset to update. The dataset's name is used to identify the
   * dataset to be updated. The name has the format:
   * projects/{project}/datasets/{dataset_id}
   * </pre>
   *
   * <code>
   * .google.maps.mapsplatformdatasets.v1.Dataset dataset = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.maps.mapsplatformdatasets.v1.DatasetOrBuilder getDatasetOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of fields to be updated. Support the value "*" for full
   * replacement.
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
   * The list of fields to be updated. Support the value "*" for full
   * replacement.
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
   * The list of fields to be updated. Support the value "*" for full
   * replacement.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
