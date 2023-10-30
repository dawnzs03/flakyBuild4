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
// source: google/cloud/recommendationengine/v1beta1/user_event_service.proto

package com.google.cloud.recommendationengine.v1beta1;

public interface PurgeUserEventsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommendationengine.v1beta1.PurgeUserEventsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the event_store under which the events are
   * created. The format is
   * `projects/${projectId}/locations/global/catalogs/${catalogId}/eventStores/${eventStoreId}`
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
   * Required. The resource name of the event_store under which the events are
   * created. The format is
   * `projects/${projectId}/locations/global/catalogs/${catalogId}/eventStores/${eventStoreId}`
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
   * Required. The filter string to specify the events to be deleted. Empty
   * string filter is not allowed. This filter can also be used with
   * ListUserEvents API to list events that will be deleted. The eligible fields
   * for filtering are:
   * * eventType - UserEvent.eventType field of type string.
   * * eventTime - in ISO 8601 "zulu" format.
   * * visitorId - field of type string. Specifying this will delete all events
   * associated with a visitor.
   * * userId - field of type string. Specifying this will delete all events
   * associated with a user.
   * Example 1: Deleting all events in a time range.
   * `eventTime &gt; "2012-04-23T18:25:43.511Z" eventTime &lt;
   * "2012-04-23T18:30:43.511Z"`
   * Example 2: Deleting specific eventType in time range.
   * `eventTime &gt; "2012-04-23T18:25:43.511Z" eventType = "detail-page-view"`
   * Example 3: Deleting all events for a specific visitor
   * `visitorId = visitor1024`
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
   * Required. The filter string to specify the events to be deleted. Empty
   * string filter is not allowed. This filter can also be used with
   * ListUserEvents API to list events that will be deleted. The eligible fields
   * for filtering are:
   * * eventType - UserEvent.eventType field of type string.
   * * eventTime - in ISO 8601 "zulu" format.
   * * visitorId - field of type string. Specifying this will delete all events
   * associated with a visitor.
   * * userId - field of type string. Specifying this will delete all events
   * associated with a user.
   * Example 1: Deleting all events in a time range.
   * `eventTime &gt; "2012-04-23T18:25:43.511Z" eventTime &lt;
   * "2012-04-23T18:30:43.511Z"`
   * Example 2: Deleting specific eventType in time range.
   * `eventTime &gt; "2012-04-23T18:25:43.511Z" eventType = "detail-page-view"`
   * Example 3: Deleting all events for a specific visitor
   * `visitorId = visitor1024`
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
   * Optional. The default value is false. Override this flag to true to
   * actually perform the purge. If the field is not set to true, a sampling of
   * events to be deleted will be returned.
   * </pre>
   *
   * <code>bool force = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The force.
   */
  boolean getForce();
}
