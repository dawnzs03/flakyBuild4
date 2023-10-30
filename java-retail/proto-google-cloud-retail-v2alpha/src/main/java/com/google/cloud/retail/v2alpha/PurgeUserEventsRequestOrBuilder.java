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
// source: google/cloud/retail/v2alpha/purge_config.proto

package com.google.cloud.retail.v2alpha;

public interface PurgeUserEventsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.PurgeUserEventsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the catalog under which the events are
   * created. The format is
   * `projects/${projectId}/locations/global/catalogs/${catalogId}`
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
   * Required. The resource name of the catalog under which the events are
   * created. The format is
   * `projects/${projectId}/locations/global/catalogs/${catalogId}`
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
   * Required. The filter string to specify the events to be deleted with a
   * length limit of 5,000 characters. Empty string filter is not allowed. The
   * eligible fields for filtering are:
   *
   * * `eventType`: Double quoted
   * [UserEvent.event_type][google.cloud.retail.v2alpha.UserEvent.event_type]
   * string.
   * * `eventTime`: in ISO 8601 "zulu" format.
   * * `visitorId`: Double quoted string. Specifying this will delete all
   *   events associated with a visitor.
   * * `userId`: Double quoted string. Specifying this will delete all events
   *   associated with a user.
   *
   * Examples:
   *
   * * Deleting all events in a time range:
   *   `eventTime &gt; "2012-04-23T18:25:43.511Z"
   *   eventTime &lt; "2012-04-23T18:30:43.511Z"`
   * * Deleting specific eventType in time range:
   *   `eventTime &gt; "2012-04-23T18:25:43.511Z" eventType = "detail-page-view"`
   * * Deleting all events for a specific visitor:
   *   `visitorId = "visitor1024"`
   *
   * The filtering fields are assumed to have an implicit AND.
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Required. The filter string to specify the events to be deleted with a
   * length limit of 5,000 characters. Empty string filter is not allowed. The
   * eligible fields for filtering are:
   *
   * * `eventType`: Double quoted
   * [UserEvent.event_type][google.cloud.retail.v2alpha.UserEvent.event_type]
   * string.
   * * `eventTime`: in ISO 8601 "zulu" format.
   * * `visitorId`: Double quoted string. Specifying this will delete all
   *   events associated with a visitor.
   * * `userId`: Double quoted string. Specifying this will delete all events
   *   associated with a user.
   *
   * Examples:
   *
   * * Deleting all events in a time range:
   *   `eventTime &gt; "2012-04-23T18:25:43.511Z"
   *   eventTime &lt; "2012-04-23T18:30:43.511Z"`
   * * Deleting specific eventType in time range:
   *   `eventTime &gt; "2012-04-23T18:25:43.511Z" eventType = "detail-page-view"`
   * * Deleting all events for a specific visitor:
   *   `visitorId = "visitor1024"`
   *
   * The filtering fields are assumed to have an implicit AND.
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Actually perform the purge.
   * If `force` is set to false, the method will return the expected purge count
   * without deleting any user events.
   * </pre>
   *
   * <code>bool force = 3;</code>
   *
   * @return The force.
   */
  boolean getForce();
}
