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
// source: google/monitoring/v3/metric.proto

package com.google.monitoring.v3;

public interface TextLocatorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.TextLocator)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The source of the text. The source may be a field in the request, in which
   * case its format is the format of the
   * google.rpc.BadRequest.FieldViolation.field field in
   * https://cloud.google.com/apis/design/errors#error_details. It may also be
   * be a source other than the request field (e.g. a macro definition
   * referenced in the text of the query), in which case this is the name of
   * the source (e.g. the macro name).
   * </pre>
   *
   * <code>string source = 1;</code>
   *
   * @return The source.
   */
  java.lang.String getSource();
  /**
   *
   *
   * <pre>
   * The source of the text. The source may be a field in the request, in which
   * case its format is the format of the
   * google.rpc.BadRequest.FieldViolation.field field in
   * https://cloud.google.com/apis/design/errors#error_details. It may also be
   * be a source other than the request field (e.g. a macro definition
   * referenced in the text of the query), in which case this is the name of
   * the source (e.g. the macro name).
   * </pre>
   *
   * <code>string source = 1;</code>
   *
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString getSourceBytes();

  /**
   *
   *
   * <pre>
   * The position of the first byte within the text.
   * </pre>
   *
   * <code>.google.monitoring.v3.TextLocator.Position start_position = 2;</code>
   *
   * @return Whether the startPosition field is set.
   */
  boolean hasStartPosition();
  /**
   *
   *
   * <pre>
   * The position of the first byte within the text.
   * </pre>
   *
   * <code>.google.monitoring.v3.TextLocator.Position start_position = 2;</code>
   *
   * @return The startPosition.
   */
  com.google.monitoring.v3.TextLocator.Position getStartPosition();
  /**
   *
   *
   * <pre>
   * The position of the first byte within the text.
   * </pre>
   *
   * <code>.google.monitoring.v3.TextLocator.Position start_position = 2;</code>
   */
  com.google.monitoring.v3.TextLocator.PositionOrBuilder getStartPositionOrBuilder();

  /**
   *
   *
   * <pre>
   * The position of the last byte within the text.
   * </pre>
   *
   * <code>.google.monitoring.v3.TextLocator.Position end_position = 3;</code>
   *
   * @return Whether the endPosition field is set.
   */
  boolean hasEndPosition();
  /**
   *
   *
   * <pre>
   * The position of the last byte within the text.
   * </pre>
   *
   * <code>.google.monitoring.v3.TextLocator.Position end_position = 3;</code>
   *
   * @return The endPosition.
   */
  com.google.monitoring.v3.TextLocator.Position getEndPosition();
  /**
   *
   *
   * <pre>
   * The position of the last byte within the text.
   * </pre>
   *
   * <code>.google.monitoring.v3.TextLocator.Position end_position = 3;</code>
   */
  com.google.monitoring.v3.TextLocator.PositionOrBuilder getEndPositionOrBuilder();

  /**
   *
   *
   * <pre>
   * If `source`, `start_position`, and `end_position` describe a call on
   * some object (e.g. a macro in the time series query language text) and a
   * location is to be designated in that object's text, `nested_locator`
   * identifies the location within that object.
   * </pre>
   *
   * <code>.google.monitoring.v3.TextLocator nested_locator = 4;</code>
   *
   * @return Whether the nestedLocator field is set.
   */
  boolean hasNestedLocator();
  /**
   *
   *
   * <pre>
   * If `source`, `start_position`, and `end_position` describe a call on
   * some object (e.g. a macro in the time series query language text) and a
   * location is to be designated in that object's text, `nested_locator`
   * identifies the location within that object.
   * </pre>
   *
   * <code>.google.monitoring.v3.TextLocator nested_locator = 4;</code>
   *
   * @return The nestedLocator.
   */
  com.google.monitoring.v3.TextLocator getNestedLocator();
  /**
   *
   *
   * <pre>
   * If `source`, `start_position`, and `end_position` describe a call on
   * some object (e.g. a macro in the time series query language text) and a
   * location is to be designated in that object's text, `nested_locator`
   * identifies the location within that object.
   * </pre>
   *
   * <code>.google.monitoring.v3.TextLocator nested_locator = 4;</code>
   */
  com.google.monitoring.v3.TextLocatorOrBuilder getNestedLocatorOrBuilder();

  /**
   *
   *
   * <pre>
   * When `nested_locator` is set, this field gives the reason for the nesting.
   * Usually, the reason is a macro invocation. In that case, the macro name
   * (including the leading '&#64;') signals the location of the macro call
   * in the text and a macro argument name (including the leading '$') signals
   * the location of the macro argument inside the macro body that got
   * substituted away.
   * </pre>
   *
   * <code>string nesting_reason = 5;</code>
   *
   * @return The nestingReason.
   */
  java.lang.String getNestingReason();
  /**
   *
   *
   * <pre>
   * When `nested_locator` is set, this field gives the reason for the nesting.
   * Usually, the reason is a macro invocation. In that case, the macro name
   * (including the leading '&#64;') signals the location of the macro call
   * in the text and a macro argument name (including the leading '$') signals
   * the location of the macro argument inside the macro body that got
   * substituted away.
   * </pre>
   *
   * <code>string nesting_reason = 5;</code>
   *
   * @return The bytes for nestingReason.
   */
  com.google.protobuf.ByteString getNestingReasonBytes();
}
