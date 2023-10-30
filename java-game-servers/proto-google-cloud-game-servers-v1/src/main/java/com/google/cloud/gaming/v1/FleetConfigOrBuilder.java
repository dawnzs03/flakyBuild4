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
// source: google/cloud/gaming/v1/game_server_configs.proto

package com.google.cloud.gaming.v1;

public interface FleetConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1.FleetConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Agones fleet spec. Example spec:
   * `https://agones.dev/site/docs/reference/fleet/`.
   * </pre>
   *
   * <code>string fleet_spec = 1;</code>
   *
   * @return The fleetSpec.
   */
  java.lang.String getFleetSpec();
  /**
   *
   *
   * <pre>
   * Agones fleet spec. Example spec:
   * `https://agones.dev/site/docs/reference/fleet/`.
   * </pre>
   *
   * <code>string fleet_spec = 1;</code>
   *
   * @return The bytes for fleetSpec.
   */
  com.google.protobuf.ByteString getFleetSpecBytes();

  /**
   *
   *
   * <pre>
   * The name of the FleetConfig.
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the FleetConfig.
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
