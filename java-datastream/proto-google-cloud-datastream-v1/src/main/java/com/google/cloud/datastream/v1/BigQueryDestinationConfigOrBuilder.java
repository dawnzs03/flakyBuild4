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
// source: google/cloud/datastream/v1/datastream_resources.proto

package com.google.cloud.datastream.v1;

public interface BigQueryDestinationConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.BigQueryDestinationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Single destination dataset.
   * </pre>
   *
   * <code>
   * .google.cloud.datastream.v1.BigQueryDestinationConfig.SingleTargetDataset single_target_dataset = 201;
   * </code>
   *
   * @return Whether the singleTargetDataset field is set.
   */
  boolean hasSingleTargetDataset();
  /**
   *
   *
   * <pre>
   * Single destination dataset.
   * </pre>
   *
   * <code>
   * .google.cloud.datastream.v1.BigQueryDestinationConfig.SingleTargetDataset single_target_dataset = 201;
   * </code>
   *
   * @return The singleTargetDataset.
   */
  com.google.cloud.datastream.v1.BigQueryDestinationConfig.SingleTargetDataset
      getSingleTargetDataset();
  /**
   *
   *
   * <pre>
   * Single destination dataset.
   * </pre>
   *
   * <code>
   * .google.cloud.datastream.v1.BigQueryDestinationConfig.SingleTargetDataset single_target_dataset = 201;
   * </code>
   */
  com.google.cloud.datastream.v1.BigQueryDestinationConfig.SingleTargetDatasetOrBuilder
      getSingleTargetDatasetOrBuilder();

  /**
   *
   *
   * <pre>
   * Source hierarchy datasets.
   * </pre>
   *
   * <code>
   * .google.cloud.datastream.v1.BigQueryDestinationConfig.SourceHierarchyDatasets source_hierarchy_datasets = 202;
   * </code>
   *
   * @return Whether the sourceHierarchyDatasets field is set.
   */
  boolean hasSourceHierarchyDatasets();
  /**
   *
   *
   * <pre>
   * Source hierarchy datasets.
   * </pre>
   *
   * <code>
   * .google.cloud.datastream.v1.BigQueryDestinationConfig.SourceHierarchyDatasets source_hierarchy_datasets = 202;
   * </code>
   *
   * @return The sourceHierarchyDatasets.
   */
  com.google.cloud.datastream.v1.BigQueryDestinationConfig.SourceHierarchyDatasets
      getSourceHierarchyDatasets();
  /**
   *
   *
   * <pre>
   * Source hierarchy datasets.
   * </pre>
   *
   * <code>
   * .google.cloud.datastream.v1.BigQueryDestinationConfig.SourceHierarchyDatasets source_hierarchy_datasets = 202;
   * </code>
   */
  com.google.cloud.datastream.v1.BigQueryDestinationConfig.SourceHierarchyDatasetsOrBuilder
      getSourceHierarchyDatasetsOrBuilder();

  /**
   *
   *
   * <pre>
   * The guaranteed data freshness (in seconds) when querying tables created by
   * the stream. Editing this field will only affect new tables created in the
   * future, but existing tables will not be impacted. Lower values mean that
   * queries will return fresher data, but may result in higher cost.
   * </pre>
   *
   * <code>.google.protobuf.Duration data_freshness = 300;</code>
   *
   * @return Whether the dataFreshness field is set.
   */
  boolean hasDataFreshness();
  /**
   *
   *
   * <pre>
   * The guaranteed data freshness (in seconds) when querying tables created by
   * the stream. Editing this field will only affect new tables created in the
   * future, but existing tables will not be impacted. Lower values mean that
   * queries will return fresher data, but may result in higher cost.
   * </pre>
   *
   * <code>.google.protobuf.Duration data_freshness = 300;</code>
   *
   * @return The dataFreshness.
   */
  com.google.protobuf.Duration getDataFreshness();
  /**
   *
   *
   * <pre>
   * The guaranteed data freshness (in seconds) when querying tables created by
   * the stream. Editing this field will only affect new tables created in the
   * future, but existing tables will not be impacted. Lower values mean that
   * queries will return fresher data, but may result in higher cost.
   * </pre>
   *
   * <code>.google.protobuf.Duration data_freshness = 300;</code>
   */
  com.google.protobuf.DurationOrBuilder getDataFreshnessOrBuilder();

  com.google.cloud.datastream.v1.BigQueryDestinationConfig.DatasetConfigCase getDatasetConfigCase();
}
