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
// source: google/dataflow/v1beta3/jobs.proto

package com.google.dataflow.v1beta3;

public interface ListJobsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.ListJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A subset of the requested job information.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Job jobs = 1;</code>
   */
  java.util.List<com.google.dataflow.v1beta3.Job> getJobsList();
  /**
   *
   *
   * <pre>
   * A subset of the requested job information.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Job jobs = 1;</code>
   */
  com.google.dataflow.v1beta3.Job getJobs(int index);
  /**
   *
   *
   * <pre>
   * A subset of the requested job information.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Job jobs = 1;</code>
   */
  int getJobsCount();
  /**
   *
   *
   * <pre>
   * A subset of the requested job information.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Job jobs = 1;</code>
   */
  java.util.List<? extends com.google.dataflow.v1beta3.JobOrBuilder> getJobsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A subset of the requested job information.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.Job jobs = 1;</code>
   */
  com.google.dataflow.v1beta3.JobOrBuilder getJobsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Set if there may be more results than fit in this response.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Set if there may be more results than fit in this response.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Zero or more messages describing the [regional endpoints]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
   * failed to respond.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.FailedLocation failed_location = 3;</code>
   */
  java.util.List<com.google.dataflow.v1beta3.FailedLocation> getFailedLocationList();
  /**
   *
   *
   * <pre>
   * Zero or more messages describing the [regional endpoints]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
   * failed to respond.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.FailedLocation failed_location = 3;</code>
   */
  com.google.dataflow.v1beta3.FailedLocation getFailedLocation(int index);
  /**
   *
   *
   * <pre>
   * Zero or more messages describing the [regional endpoints]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
   * failed to respond.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.FailedLocation failed_location = 3;</code>
   */
  int getFailedLocationCount();
  /**
   *
   *
   * <pre>
   * Zero or more messages describing the [regional endpoints]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
   * failed to respond.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.FailedLocation failed_location = 3;</code>
   */
  java.util.List<? extends com.google.dataflow.v1beta3.FailedLocationOrBuilder>
      getFailedLocationOrBuilderList();
  /**
   *
   *
   * <pre>
   * Zero or more messages describing the [regional endpoints]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
   * failed to respond.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.FailedLocation failed_location = 3;</code>
   */
  com.google.dataflow.v1beta3.FailedLocationOrBuilder getFailedLocationOrBuilder(int index);
}
