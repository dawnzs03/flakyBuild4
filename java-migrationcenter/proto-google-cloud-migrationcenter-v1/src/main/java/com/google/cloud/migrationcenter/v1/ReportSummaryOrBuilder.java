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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

package com.google.cloud.migrationcenter.v1;

public interface ReportSummaryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.ReportSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Aggregate statistics for all the assets across all the groups.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.ReportSummary.AssetAggregateStats all_assets_stats = 1;
   * </code>
   *
   * @return Whether the allAssetsStats field is set.
   */
  boolean hasAllAssetsStats();
  /**
   *
   *
   * <pre>
   * Aggregate statistics for all the assets across all the groups.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.ReportSummary.AssetAggregateStats all_assets_stats = 1;
   * </code>
   *
   * @return The allAssetsStats.
   */
  com.google.cloud.migrationcenter.v1.ReportSummary.AssetAggregateStats getAllAssetsStats();
  /**
   *
   *
   * <pre>
   * Aggregate statistics for all the assets across all the groups.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.ReportSummary.AssetAggregateStats all_assets_stats = 1;
   * </code>
   */
  com.google.cloud.migrationcenter.v1.ReportSummary.AssetAggregateStatsOrBuilder
      getAllAssetsStatsOrBuilder();

  /**
   *
   *
   * <pre>
   * Findings for each Group included in this report.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ReportSummary.GroupFinding group_findings = 2;
   * </code>
   */
  java.util.List<com.google.cloud.migrationcenter.v1.ReportSummary.GroupFinding>
      getGroupFindingsList();
  /**
   *
   *
   * <pre>
   * Findings for each Group included in this report.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ReportSummary.GroupFinding group_findings = 2;
   * </code>
   */
  com.google.cloud.migrationcenter.v1.ReportSummary.GroupFinding getGroupFindings(int index);
  /**
   *
   *
   * <pre>
   * Findings for each Group included in this report.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ReportSummary.GroupFinding group_findings = 2;
   * </code>
   */
  int getGroupFindingsCount();
  /**
   *
   *
   * <pre>
   * Findings for each Group included in this report.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ReportSummary.GroupFinding group_findings = 2;
   * </code>
   */
  java.util.List<? extends com.google.cloud.migrationcenter.v1.ReportSummary.GroupFindingOrBuilder>
      getGroupFindingsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Findings for each Group included in this report.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ReportSummary.GroupFinding group_findings = 2;
   * </code>
   */
  com.google.cloud.migrationcenter.v1.ReportSummary.GroupFindingOrBuilder getGroupFindingsOrBuilder(
      int index);
}
