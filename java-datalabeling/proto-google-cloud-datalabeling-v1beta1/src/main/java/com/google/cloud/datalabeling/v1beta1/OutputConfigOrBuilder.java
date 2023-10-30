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
// source: google/cloud/datalabeling/v1beta1/dataset.proto

package com.google.cloud.datalabeling.v1beta1;

public interface OutputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.OutputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output to a file in Cloud Storage. Should be used for labeling output
   * other than image segmentation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.GcsDestination gcs_destination = 1;</code>
   *
   * @return Whether the gcsDestination field is set.
   */
  boolean hasGcsDestination();
  /**
   *
   *
   * <pre>
   * Output to a file in Cloud Storage. Should be used for labeling output
   * other than image segmentation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.GcsDestination gcs_destination = 1;</code>
   *
   * @return The gcsDestination.
   */
  com.google.cloud.datalabeling.v1beta1.GcsDestination getGcsDestination();
  /**
   *
   *
   * <pre>
   * Output to a file in Cloud Storage. Should be used for labeling output
   * other than image segmentation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.GcsDestination gcs_destination = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.GcsDestinationOrBuilder getGcsDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * Output to a folder in Cloud Storage. Should be used for image
   * segmentation labeling output.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.GcsFolderDestination gcs_folder_destination = 2;
   * </code>
   *
   * @return Whether the gcsFolderDestination field is set.
   */
  boolean hasGcsFolderDestination();
  /**
   *
   *
   * <pre>
   * Output to a folder in Cloud Storage. Should be used for image
   * segmentation labeling output.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.GcsFolderDestination gcs_folder_destination = 2;
   * </code>
   *
   * @return The gcsFolderDestination.
   */
  com.google.cloud.datalabeling.v1beta1.GcsFolderDestination getGcsFolderDestination();
  /**
   *
   *
   * <pre>
   * Output to a folder in Cloud Storage. Should be used for image
   * segmentation labeling output.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.GcsFolderDestination gcs_folder_destination = 2;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.GcsFolderDestinationOrBuilder
      getGcsFolderDestinationOrBuilder();

  com.google.cloud.datalabeling.v1beta1.OutputConfig.DestinationCase getDestinationCase();
}
