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
// source: google/maps/mapsplatformdatasets/v1alpha/dataset.proto

package com.google.maps.mapsplatformdatasets.v1alpha;

public interface DatasetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.mapsplatformdatasets.v1alpha.Dataset)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name,
   * projects/{project}/datasets/{dataset_id}
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Resource name,
   * projects/{project}/datasets/{dataset_id}
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Human readable name, shown in the console UI. Set by customer.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Human readable name, shown in the console UI. Set by customer.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * A description of this dataset; set by the customer.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * A description of this dataset; set by the customer.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The version of the dataset.
   * </pre>
   *
   * <code>string version_id = 4;</code>
   *
   * @return The versionId.
   */
  java.lang.String getVersionId();
  /**
   *
   *
   * <pre>
   * The version of the dataset.
   * </pre>
   *
   * <code>string version_id = 4;</code>
   *
   * @return The bytes for versionId.
   */
  com.google.protobuf.ByteString getVersionIdBytes();

  /**
   *
   *
   * <pre>
   * Specified use case(s) for this dataset.
   * </pre>
   *
   * <code>repeated .google.maps.mapsplatformdatasets.v1alpha.Usage usage = 5;</code>
   *
   * @return A list containing the usage.
   */
  java.util.List<com.google.maps.mapsplatformdatasets.v1alpha.Usage> getUsageList();
  /**
   *
   *
   * <pre>
   * Specified use case(s) for this dataset.
   * </pre>
   *
   * <code>repeated .google.maps.mapsplatformdatasets.v1alpha.Usage usage = 5;</code>
   *
   * @return The count of usage.
   */
  int getUsageCount();
  /**
   *
   *
   * <pre>
   * Specified use case(s) for this dataset.
   * </pre>
   *
   * <code>repeated .google.maps.mapsplatformdatasets.v1alpha.Usage usage = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The usage at the given index.
   */
  com.google.maps.mapsplatformdatasets.v1alpha.Usage getUsage(int index);
  /**
   *
   *
   * <pre>
   * Specified use case(s) for this dataset.
   * </pre>
   *
   * <code>repeated .google.maps.mapsplatformdatasets.v1alpha.Usage usage = 5;</code>
   *
   * @return A list containing the enum numeric values on the wire for usage.
   */
  java.util.List<java.lang.Integer> getUsageValueList();
  /**
   *
   *
   * <pre>
   * Specified use case(s) for this dataset.
   * </pre>
   *
   * <code>repeated .google.maps.mapsplatformdatasets.v1alpha.Usage usage = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of usage at the given index.
   */
  int getUsageValue(int index);

  /**
   *
   *
   * <pre>
   * A local file source for the dataset for a single upload.
   * </pre>
   *
   * <code>.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource local_file_source = 6;</code>
   *
   * @return Whether the localFileSource field is set.
   */
  boolean hasLocalFileSource();
  /**
   *
   *
   * <pre>
   * A local file source for the dataset for a single upload.
   * </pre>
   *
   * <code>.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource local_file_source = 6;</code>
   *
   * @return The localFileSource.
   */
  com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource getLocalFileSource();
  /**
   *
   *
   * <pre>
   * A local file source for the dataset for a single upload.
   * </pre>
   *
   * <code>.google.maps.mapsplatformdatasets.v1alpha.LocalFileSource local_file_source = 6;</code>
   */
  com.google.maps.mapsplatformdatasets.v1alpha.LocalFileSourceOrBuilder
      getLocalFileSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * A Google Cloud Storage file source for the dataset for a single upload.
   * </pre>
   *
   * <code>.google.maps.mapsplatformdatasets.v1alpha.GcsSource gcs_source = 7;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * A Google Cloud Storage file source for the dataset for a single upload.
   * </pre>
   *
   * <code>.google.maps.mapsplatformdatasets.v1alpha.GcsSource gcs_source = 7;</code>
   *
   * @return The gcsSource.
   */
  com.google.maps.mapsplatformdatasets.v1alpha.GcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * A Google Cloud Storage file source for the dataset for a single upload.
   * </pre>
   *
   * <code>.google.maps.mapsplatformdatasets.v1alpha.GcsSource gcs_source = 7;</code>
   */
  com.google.maps.mapsplatformdatasets.v1alpha.GcsSourceOrBuilder getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * The status of the import of the latest dataset version.
   * </pre>
   *
   * <code>.google.maps.mapsplatformdatasets.v1alpha.State status = 12;</code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * The status of the import of the latest dataset version.
   * </pre>
   *
   * <code>.google.maps.mapsplatformdatasets.v1alpha.State status = 12;</code>
   *
   * @return The status.
   */
  com.google.maps.mapsplatformdatasets.v1alpha.State getStatus();

  /**
   *
   *
   * <pre>
   * Output only. Time when the dataset was first created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the dataset was first created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the dataset was first created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when the dataset metadata was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the dataset metadata was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the dataset metadata was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when this version of dataset was created. (It happened when importing
   * data to the dataset)
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp version_create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the versionCreateTime field is set.
   */
  boolean hasVersionCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this version of dataset was created. (It happened when importing
   * data to the dataset)
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp version_create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The versionCreateTime.
   */
  com.google.protobuf.Timestamp getVersionCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this version of dataset was created. (It happened when importing
   * data to the dataset)
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp version_create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getVersionCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The description for this version of dataset. It is provided when importing
   * data to the dataset.
   * </pre>
   *
   * <code>string version_description = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The versionDescription.
   */
  java.lang.String getVersionDescription();
  /**
   *
   *
   * <pre>
   * Output only. The description for this version of dataset. It is provided when importing
   * data to the dataset.
   * </pre>
   *
   * <code>string version_description = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for versionDescription.
   */
  com.google.protobuf.ByteString getVersionDescriptionBytes();

  com.google.maps.mapsplatformdatasets.v1alpha.Dataset.DataSourceCase getDataSourceCase();
}
