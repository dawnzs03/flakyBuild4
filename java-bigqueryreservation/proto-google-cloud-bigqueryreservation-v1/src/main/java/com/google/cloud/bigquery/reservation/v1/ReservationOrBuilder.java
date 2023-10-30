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
// source: google/cloud/bigquery/reservation/v1/reservation.proto

package com.google.cloud.bigquery.reservation.v1;

public interface ReservationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.reservation.v1.Reservation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the reservation, e.g.,
   * `projects/&#42;&#47;locations/&#42;&#47;reservations/team1-prod`.
   * The reservation_id must only contain lower case alphanumeric characters or
   * dashes. It must start with a letter and must not end with a dash. Its
   * maximum length is 64 characters.
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
   * The resource name of the reservation, e.g.,
   * `projects/&#42;&#47;locations/&#42;&#47;reservations/team1-prod`.
   * The reservation_id must only contain lower case alphanumeric characters or
   * dashes. It must start with a letter and must not end with a dash. Its
   * maximum length is 64 characters.
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
   * Minimum slots available to this reservation. A slot is a unit of
   * computational power in BigQuery, and serves as the unit of parallelism.
   *
   * Queries using this reservation might use more slots during runtime if
   * ignore_idle_slots is set to false.
   *
   * If total slot_capacity of the reservation and its siblings
   * exceeds the total slot_count of all capacity commitments, the request will
   * fail with `google.rpc.Code.RESOURCE_EXHAUSTED`.
   *
   *
   * NOTE: for reservations in US or EU multi-regions, slot capacity constraints
   * are checked separately for default and auxiliary regions. See
   * multi_region_auxiliary flag for more details.
   * </pre>
   *
   * <code>int64 slot_capacity = 2;</code>
   *
   * @return The slotCapacity.
   */
  long getSlotCapacity();

  /**
   *
   *
   * <pre>
   * If false, any query or pipeline job using this reservation will use idle
   * slots from other reservations within the same admin project. If true, a
   * query or pipeline job using this reservation will execute with the slot
   * capacity specified in the slot_capacity field at most.
   * </pre>
   *
   * <code>bool ignore_idle_slots = 4;</code>
   *
   * @return The ignoreIdleSlots.
   */
  boolean getIgnoreIdleSlots();

  /**
   *
   *
   * <pre>
   * The configuration parameters for the auto scaling feature. Note this is an
   * alpha feature.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.Reservation.Autoscale autoscale = 7;</code>
   *
   * @return Whether the autoscale field is set.
   */
  boolean hasAutoscale();
  /**
   *
   *
   * <pre>
   * The configuration parameters for the auto scaling feature. Note this is an
   * alpha feature.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.Reservation.Autoscale autoscale = 7;</code>
   *
   * @return The autoscale.
   */
  com.google.cloud.bigquery.reservation.v1.Reservation.Autoscale getAutoscale();
  /**
   *
   *
   * <pre>
   * The configuration parameters for the auto scaling feature. Note this is an
   * alpha feature.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.Reservation.Autoscale autoscale = 7;</code>
   */
  com.google.cloud.bigquery.reservation.v1.Reservation.AutoscaleOrBuilder getAutoscaleOrBuilder();

  /**
   *
   *
   * <pre>
   * Job concurrency target which sets a soft upper bound on the number of jobs
   * that can run concurrently in this reservation. This is a soft target due to
   * asynchronous nature of the system and various optimizations for small
   * queries.
   * Default value is 0 which means that concurrency target will be
   * automatically computed by the system.
   * NOTE: this field is exposed as `target_job_concurrency` in the Information
   * Schema, DDL and BQ CLI.
   * </pre>
   *
   * <code>int64 concurrency = 16;</code>
   *
   * @return The concurrency.
   */
  long getConcurrency();

  /**
   *
   *
   * <pre>
   * Output only. Creation time of the reservation.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp creation_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the creationTime field is set.
   */
  boolean hasCreationTime();
  /**
   *
   *
   * <pre>
   * Output only. Creation time of the reservation.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp creation_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The creationTime.
   */
  com.google.protobuf.Timestamp getCreationTime();
  /**
   *
   *
   * <pre>
   * Output only. Creation time of the reservation.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp creation_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreationTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Last update time of the reservation.
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
   * Output only. Last update time of the reservation.
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
   * Output only. Last update time of the reservation.
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
   * Applicable only for reservations located within one of the BigQuery
   * multi-regions (US or EU).
   *
   * If set to true, this reservation is placed in the organization's
   * secondary region which is designated for disaster recovery purposes.
   * If false, this reservation is placed in the organization's default region.
   *
   * NOTE: this is a preview feature. Project must be allow-listed in order to
   * set this field.
   * </pre>
   *
   * <code>bool multi_region_auxiliary = 14;</code>
   *
   * @return The multiRegionAuxiliary.
   */
  boolean getMultiRegionAuxiliary();

  /**
   *
   *
   * <pre>
   * Edition of the reservation.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.Edition edition = 17;</code>
   *
   * @return The enum numeric value on the wire for edition.
   */
  int getEditionValue();
  /**
   *
   *
   * <pre>
   * Edition of the reservation.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.Edition edition = 17;</code>
   *
   * @return The edition.
   */
  com.google.cloud.bigquery.reservation.v1.Edition getEdition();
}
