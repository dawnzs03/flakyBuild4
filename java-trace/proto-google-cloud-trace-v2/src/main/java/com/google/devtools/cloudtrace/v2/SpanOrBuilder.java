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
// source: google/devtools/cloudtrace/v2/trace.proto

package com.google.devtools.cloudtrace.v2;

public interface SpanOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudtrace.v2.Span)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the span in the following format:
   *
   *  * `projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/[SPAN_ID]`
   *
   * `[TRACE_ID]` is a unique identifier for a trace within a project;
   * it is a 32-character hexadecimal encoding of a 16-byte array. It should
   * not be zero.
   *
   * `[SPAN_ID]` is a unique identifier for a span within a trace; it
   * is a 16-character hexadecimal encoding of an 8-byte array. It should not
   * be zero.
   * .
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the span in the following format:
   *
   *  * `projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/[SPAN_ID]`
   *
   * `[TRACE_ID]` is a unique identifier for a trace within a project;
   * it is a 32-character hexadecimal encoding of a 16-byte array. It should
   * not be zero.
   *
   * `[SPAN_ID]` is a unique identifier for a span within a trace; it
   * is a 16-character hexadecimal encoding of an 8-byte array. It should not
   * be zero.
   * .
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The `[SPAN_ID]` portion of the span's resource name.
   * </pre>
   *
   * <code>string span_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The spanId.
   */
  java.lang.String getSpanId();
  /**
   *
   *
   * <pre>
   * Required. The `[SPAN_ID]` portion of the span's resource name.
   * </pre>
   *
   * <code>string span_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for spanId.
   */
  com.google.protobuf.ByteString getSpanIdBytes();

  /**
   *
   *
   * <pre>
   * The `[SPAN_ID]` of this span's parent span. If this is a root span,
   * then this field must be empty.
   * </pre>
   *
   * <code>string parent_span_id = 3;</code>
   *
   * @return The parentSpanId.
   */
  java.lang.String getParentSpanId();
  /**
   *
   *
   * <pre>
   * The `[SPAN_ID]` of this span's parent span. If this is a root span,
   * then this field must be empty.
   * </pre>
   *
   * <code>string parent_span_id = 3;</code>
   *
   * @return The bytes for parentSpanId.
   */
  com.google.protobuf.ByteString getParentSpanIdBytes();

  /**
   *
   *
   * <pre>
   * Required. A description of the span's operation (up to 128 bytes).
   * Cloud Trace displays the description in the
   * Cloud console.
   * For example, the display name can be a qualified method name or a file name
   * and a line number where the operation is called. A best practice is to use
   * the same display name within an application and at the same call point.
   * This makes it easier to correlate spans in different traces.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudtrace.v2.TruncatableString display_name = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the displayName field is set.
   */
  boolean hasDisplayName();
  /**
   *
   *
   * <pre>
   * Required. A description of the span's operation (up to 128 bytes).
   * Cloud Trace displays the description in the
   * Cloud console.
   * For example, the display name can be a qualified method name or a file name
   * and a line number where the operation is called. A best practice is to use
   * the same display name within an application and at the same call point.
   * This makes it easier to correlate spans in different traces.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudtrace.v2.TruncatableString display_name = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The displayName.
   */
  com.google.devtools.cloudtrace.v2.TruncatableString getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. A description of the span's operation (up to 128 bytes).
   * Cloud Trace displays the description in the
   * Cloud console.
   * For example, the display name can be a qualified method name or a file name
   * and a line number where the operation is called. A best practice is to use
   * the same display name within an application and at the same call point.
   * This makes it easier to correlate spans in different traces.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudtrace.v2.TruncatableString display_name = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.devtools.cloudtrace.v2.TruncatableStringOrBuilder getDisplayNameOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The start time of the span. On the client side, this is the time
   * kept by the local machine where the span execution starts. On the server
   * side, this is the time when the server's application handler starts
   * running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Required. The start time of the span. On the client side, this is the time
   * kept by the local machine where the span execution starts. On the server
   * side, this is the time when the server's application handler starts
   * running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Required. The start time of the span. On the client side, this is the time
   * kept by the local machine where the span execution starts. On the server
   * side, this is the time when the server's application handler starts
   * running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The end time of the span. On the client side, this is the time
   * kept by the local machine where the span execution ends. On the server
   * side, this is the time when the server application handler stops running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Required. The end time of the span. On the client side, this is the time
   * kept by the local machine where the span execution ends. On the server
   * side, this is the time when the server application handler stops running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Required. The end time of the span. On the client side, this is the time
   * kept by the local machine where the span execution ends. On the server
   * side, this is the time when the server application handler stops running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * A set of attributes on the span. You can have up to 32 attributes per
   * span.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.Span.Attributes attributes = 7;</code>
   *
   * @return Whether the attributes field is set.
   */
  boolean hasAttributes();
  /**
   *
   *
   * <pre>
   * A set of attributes on the span. You can have up to 32 attributes per
   * span.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.Span.Attributes attributes = 7;</code>
   *
   * @return The attributes.
   */
  com.google.devtools.cloudtrace.v2.Span.Attributes getAttributes();
  /**
   *
   *
   * <pre>
   * A set of attributes on the span. You can have up to 32 attributes per
   * span.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.Span.Attributes attributes = 7;</code>
   */
  com.google.devtools.cloudtrace.v2.Span.AttributesOrBuilder getAttributesOrBuilder();

  /**
   *
   *
   * <pre>
   * Stack trace captured at the start of the span.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.StackTrace stack_trace = 8;</code>
   *
   * @return Whether the stackTrace field is set.
   */
  boolean hasStackTrace();
  /**
   *
   *
   * <pre>
   * Stack trace captured at the start of the span.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.StackTrace stack_trace = 8;</code>
   *
   * @return The stackTrace.
   */
  com.google.devtools.cloudtrace.v2.StackTrace getStackTrace();
  /**
   *
   *
   * <pre>
   * Stack trace captured at the start of the span.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.StackTrace stack_trace = 8;</code>
   */
  com.google.devtools.cloudtrace.v2.StackTraceOrBuilder getStackTraceOrBuilder();

  /**
   *
   *
   * <pre>
   * A set of time events. You can have up to 32 annotations and 128 message
   * events per span.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.Span.TimeEvents time_events = 9;</code>
   *
   * @return Whether the timeEvents field is set.
   */
  boolean hasTimeEvents();
  /**
   *
   *
   * <pre>
   * A set of time events. You can have up to 32 annotations and 128 message
   * events per span.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.Span.TimeEvents time_events = 9;</code>
   *
   * @return The timeEvents.
   */
  com.google.devtools.cloudtrace.v2.Span.TimeEvents getTimeEvents();
  /**
   *
   *
   * <pre>
   * A set of time events. You can have up to 32 annotations and 128 message
   * events per span.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.Span.TimeEvents time_events = 9;</code>
   */
  com.google.devtools.cloudtrace.v2.Span.TimeEventsOrBuilder getTimeEventsOrBuilder();

  /**
   *
   *
   * <pre>
   * Links associated with the span. You can have up to 128 links per Span.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.Span.Links links = 10;</code>
   *
   * @return Whether the links field is set.
   */
  boolean hasLinks();
  /**
   *
   *
   * <pre>
   * Links associated with the span. You can have up to 128 links per Span.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.Span.Links links = 10;</code>
   *
   * @return The links.
   */
  com.google.devtools.cloudtrace.v2.Span.Links getLinks();
  /**
   *
   *
   * <pre>
   * Links associated with the span. You can have up to 128 links per Span.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.Span.Links links = 10;</code>
   */
  com.google.devtools.cloudtrace.v2.Span.LinksOrBuilder getLinksOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The final status for this span.
   * </pre>
   *
   * <code>.google.rpc.Status status = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * Optional. The final status for this span.
   * </pre>
   *
   * <code>.google.rpc.Status status = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The status.
   */
  com.google.rpc.Status getStatus();
  /**
   *
   *
   * <pre>
   * Optional. The final status for this span.
   * </pre>
   *
   * <code>.google.rpc.Status status = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.rpc.StatusOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Set this parameter to indicate whether this span is in
   * the same process as its parent. If you do not set this parameter,
   * Trace is unable to take advantage of this helpful information.
   * </pre>
   *
   * <code>
   * .google.protobuf.BoolValue same_process_as_parent_span = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sameProcessAsParentSpan field is set.
   */
  boolean hasSameProcessAsParentSpan();
  /**
   *
   *
   * <pre>
   * Optional. Set this parameter to indicate whether this span is in
   * the same process as its parent. If you do not set this parameter,
   * Trace is unable to take advantage of this helpful information.
   * </pre>
   *
   * <code>
   * .google.protobuf.BoolValue same_process_as_parent_span = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sameProcessAsParentSpan.
   */
  com.google.protobuf.BoolValue getSameProcessAsParentSpan();
  /**
   *
   *
   * <pre>
   * Optional. Set this parameter to indicate whether this span is in
   * the same process as its parent. If you do not set this parameter,
   * Trace is unable to take advantage of this helpful information.
   * </pre>
   *
   * <code>
   * .google.protobuf.BoolValue same_process_as_parent_span = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.BoolValueOrBuilder getSameProcessAsParentSpanOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The number of child spans that were generated while this span
   * was active. If set, allows implementation to detect missing child spans.
   * </pre>
   *
   * <code>
   * .google.protobuf.Int32Value child_span_count = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the childSpanCount field is set.
   */
  boolean hasChildSpanCount();
  /**
   *
   *
   * <pre>
   * Optional. The number of child spans that were generated while this span
   * was active. If set, allows implementation to detect missing child spans.
   * </pre>
   *
   * <code>
   * .google.protobuf.Int32Value child_span_count = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The childSpanCount.
   */
  com.google.protobuf.Int32Value getChildSpanCount();
  /**
   *
   *
   * <pre>
   * Optional. The number of child spans that were generated while this span
   * was active. If set, allows implementation to detect missing child spans.
   * </pre>
   *
   * <code>
   * .google.protobuf.Int32Value child_span_count = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.Int32ValueOrBuilder getChildSpanCountOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Distinguishes between spans generated in a particular context.
   * For example, two spans with the same name may be distinguished using
   * `CLIENT` (caller) and `SERVER` (callee) to identify an RPC call.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudtrace.v2.Span.SpanKind span_kind = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for spanKind.
   */
  int getSpanKindValue();
  /**
   *
   *
   * <pre>
   * Optional. Distinguishes between spans generated in a particular context.
   * For example, two spans with the same name may be distinguished using
   * `CLIENT` (caller) and `SERVER` (callee) to identify an RPC call.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudtrace.v2.Span.SpanKind span_kind = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The spanKind.
   */
  com.google.devtools.cloudtrace.v2.Span.SpanKind getSpanKind();
}
