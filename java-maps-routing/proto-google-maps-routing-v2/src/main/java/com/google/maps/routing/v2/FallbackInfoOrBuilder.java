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
// source: google/maps/routing/v2/fallback_info.proto

package com.google.maps.routing.v2;

public interface FallbackInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.routing.v2.FallbackInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Routing mode used for the response. If fallback was triggered, the mode
   * may be different from routing preference set in the original client
   * request.
   * </pre>
   *
   * <code>.google.maps.routing.v2.FallbackRoutingMode routing_mode = 1;</code>
   *
   * @return The enum numeric value on the wire for routingMode.
   */
  int getRoutingModeValue();
  /**
   *
   *
   * <pre>
   * Routing mode used for the response. If fallback was triggered, the mode
   * may be different from routing preference set in the original client
   * request.
   * </pre>
   *
   * <code>.google.maps.routing.v2.FallbackRoutingMode routing_mode = 1;</code>
   *
   * @return The routingMode.
   */
  com.google.maps.routing.v2.FallbackRoutingMode getRoutingMode();

  /**
   *
   *
   * <pre>
   * The reason why fallback response was used instead of the original response.
   * This field is only populated when the fallback mode is triggered and the
   * fallback response is returned.
   * </pre>
   *
   * <code>.google.maps.routing.v2.FallbackReason reason = 2;</code>
   *
   * @return The enum numeric value on the wire for reason.
   */
  int getReasonValue();
  /**
   *
   *
   * <pre>
   * The reason why fallback response was used instead of the original response.
   * This field is only populated when the fallback mode is triggered and the
   * fallback response is returned.
   * </pre>
   *
   * <code>.google.maps.routing.v2.FallbackReason reason = 2;</code>
   *
   * @return The reason.
   */
  com.google.maps.routing.v2.FallbackReason getReason();
}
