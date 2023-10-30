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
// source: google/maps/routing/v2/speed_reading_interval.proto

package com.google.maps.routing.v2;

public interface SpeedReadingIntervalOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.routing.v2.SpeedReadingInterval)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The starting index of this interval in the polyline.
   * </pre>
   *
   * <code>optional int32 start_polyline_point_index = 1;</code>
   *
   * @return Whether the startPolylinePointIndex field is set.
   */
  boolean hasStartPolylinePointIndex();
  /**
   *
   *
   * <pre>
   * The starting index of this interval in the polyline.
   * </pre>
   *
   * <code>optional int32 start_polyline_point_index = 1;</code>
   *
   * @return The startPolylinePointIndex.
   */
  int getStartPolylinePointIndex();

  /**
   *
   *
   * <pre>
   * The ending index of this interval in the polyline.
   * </pre>
   *
   * <code>optional int32 end_polyline_point_index = 2;</code>
   *
   * @return Whether the endPolylinePointIndex field is set.
   */
  boolean hasEndPolylinePointIndex();
  /**
   *
   *
   * <pre>
   * The ending index of this interval in the polyline.
   * </pre>
   *
   * <code>optional int32 end_polyline_point_index = 2;</code>
   *
   * @return The endPolylinePointIndex.
   */
  int getEndPolylinePointIndex();

  /**
   *
   *
   * <pre>
   * Traffic speed in this interval.
   * </pre>
   *
   * <code>.google.maps.routing.v2.SpeedReadingInterval.Speed speed = 3;</code>
   *
   * @return Whether the speed field is set.
   */
  boolean hasSpeed();
  /**
   *
   *
   * <pre>
   * Traffic speed in this interval.
   * </pre>
   *
   * <code>.google.maps.routing.v2.SpeedReadingInterval.Speed speed = 3;</code>
   *
   * @return The enum numeric value on the wire for speed.
   */
  int getSpeedValue();
  /**
   *
   *
   * <pre>
   * Traffic speed in this interval.
   * </pre>
   *
   * <code>.google.maps.routing.v2.SpeedReadingInterval.Speed speed = 3;</code>
   *
   * @return The speed.
   */
  com.google.maps.routing.v2.SpeedReadingInterval.Speed getSpeed();

  com.google.maps.routing.v2.SpeedReadingInterval.SpeedTypeCase getSpeedTypeCase();
}
