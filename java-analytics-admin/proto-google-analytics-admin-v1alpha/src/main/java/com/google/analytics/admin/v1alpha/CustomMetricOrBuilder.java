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
// source: google/analytics/admin/v1alpha/resources.proto

package com.google.analytics.admin.v1alpha;

public interface CustomMetricOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.CustomMetric)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name for this CustomMetric resource.
   * Format: properties/{property}/customMetrics/{customMetric}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Resource name for this CustomMetric resource.
   * Format: properties/{property}/customMetrics/{customMetric}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. Tagging name for this custom metric.
   *
   * If this is an event-scoped metric, then this is the event parameter
   * name.
   *
   * May only contain alphanumeric and underscore charactes, starting with a
   * letter. Max length of 40 characters for event-scoped metrics.
   * </pre>
   *
   * <code>
   * string parameter_name = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The parameterName.
   */
  java.lang.String getParameterName();
  /**
   *
   *
   * <pre>
   * Required. Immutable. Tagging name for this custom metric.
   *
   * If this is an event-scoped metric, then this is the event parameter
   * name.
   *
   * May only contain alphanumeric and underscore charactes, starting with a
   * letter. Max length of 40 characters for event-scoped metrics.
   * </pre>
   *
   * <code>
   * string parameter_name = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for parameterName.
   */
  com.google.protobuf.ByteString getParameterNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Display name for this custom metric as shown in the Analytics UI.
   * Max length of 82 characters, alphanumeric plus space and underscore
   * starting with a letter. Legacy system-generated display names may contain
   * square brackets, but updates to this field will never permit square
   * brackets.
   * </pre>
   *
   * <code>string display_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. Display name for this custom metric as shown in the Analytics UI.
   * Max length of 82 characters, alphanumeric plus space and underscore
   * starting with a letter. Legacy system-generated display names may contain
   * square brackets, but updates to this field will never permit square
   * brackets.
   * </pre>
   *
   * <code>string display_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Description for this custom dimension.
   * Max length of 150 characters.
   * </pre>
   *
   * <code>string description = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. Description for this custom dimension.
   * Max length of 150 characters.
   * </pre>
   *
   * <code>string description = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Required. The type for the custom metric's value.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.CustomMetric.MeasurementUnit measurement_unit = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for measurementUnit.
   */
  int getMeasurementUnitValue();
  /**
   *
   *
   * <pre>
   * Required. The type for the custom metric's value.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.CustomMetric.MeasurementUnit measurement_unit = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The measurementUnit.
   */
  com.google.analytics.admin.v1alpha.CustomMetric.MeasurementUnit getMeasurementUnit();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The scope of this custom metric.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.CustomMetric.MetricScope scope = 6 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for scope.
   */
  int getScopeValue();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The scope of this custom metric.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.CustomMetric.MetricScope scope = 6 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The scope.
   */
  com.google.analytics.admin.v1alpha.CustomMetric.MetricScope getScope();

  /**
   *
   *
   * <pre>
   * Optional. Types of restricted data that this metric may contain. Required
   * for metrics with CURRENCY measurement unit. Must be empty for metrics with
   * a non-CURRENCY measurement unit.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.CustomMetric.RestrictedMetricType restricted_metric_type = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the restrictedMetricType.
   */
  java.util.List<com.google.analytics.admin.v1alpha.CustomMetric.RestrictedMetricType>
      getRestrictedMetricTypeList();
  /**
   *
   *
   * <pre>
   * Optional. Types of restricted data that this metric may contain. Required
   * for metrics with CURRENCY measurement unit. Must be empty for metrics with
   * a non-CURRENCY measurement unit.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.CustomMetric.RestrictedMetricType restricted_metric_type = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of restrictedMetricType.
   */
  int getRestrictedMetricTypeCount();
  /**
   *
   *
   * <pre>
   * Optional. Types of restricted data that this metric may contain. Required
   * for metrics with CURRENCY measurement unit. Must be empty for metrics with
   * a non-CURRENCY measurement unit.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.CustomMetric.RestrictedMetricType restricted_metric_type = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The restrictedMetricType at the given index.
   */
  com.google.analytics.admin.v1alpha.CustomMetric.RestrictedMetricType getRestrictedMetricType(
      int index);
  /**
   *
   *
   * <pre>
   * Optional. Types of restricted data that this metric may contain. Required
   * for metrics with CURRENCY measurement unit. Must be empty for metrics with
   * a non-CURRENCY measurement unit.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.CustomMetric.RestrictedMetricType restricted_metric_type = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for restrictedMetricType.
   */
  java.util.List<java.lang.Integer> getRestrictedMetricTypeValueList();
  /**
   *
   *
   * <pre>
   * Optional. Types of restricted data that this metric may contain. Required
   * for metrics with CURRENCY measurement unit. Must be empty for metrics with
   * a non-CURRENCY measurement unit.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.CustomMetric.RestrictedMetricType restricted_metric_type = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of restrictedMetricType at the given index.
   */
  int getRestrictedMetricTypeValue(int index);
}
