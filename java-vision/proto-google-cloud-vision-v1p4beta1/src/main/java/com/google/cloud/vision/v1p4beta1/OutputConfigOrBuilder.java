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
// source: google/cloud/vision/v1p4beta1/image_annotator.proto

package com.google.cloud.vision.v1p4beta1;

public interface OutputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p4beta1.OutputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to write the output(s) to.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.GcsDestination gcs_destination = 1;</code>
   *
   * @return Whether the gcsDestination field is set.
   */
  boolean hasGcsDestination();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to write the output(s) to.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.GcsDestination gcs_destination = 1;</code>
   *
   * @return The gcsDestination.
   */
  com.google.cloud.vision.v1p4beta1.GcsDestination getGcsDestination();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to write the output(s) to.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.GcsDestination gcs_destination = 1;</code>
   */
  com.google.cloud.vision.v1p4beta1.GcsDestinationOrBuilder getGcsDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * The max number of response protos to put into each output JSON file on
   * Google Cloud Storage.
   * The valid range is [1, 100]. If not specified, the default value is 20.
   *
   * For example, for one pdf file with 100 pages, 100 response protos will
   * be generated. If `batch_size` = 20, then 5 json files each
   * containing 20 response protos will be written under the prefix
   * `gcs_destination`.`uri`.
   *
   * Currently, batch_size only applies to GcsDestination, with potential future
   * support for other output configurations.
   * </pre>
   *
   * <code>int32 batch_size = 2;</code>
   *
   * @return The batchSize.
   */
  int getBatchSize();
}
