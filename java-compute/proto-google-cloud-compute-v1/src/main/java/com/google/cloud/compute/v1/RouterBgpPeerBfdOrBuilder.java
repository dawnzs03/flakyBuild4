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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface RouterBgpPeerBfdOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RouterBgpPeerBfd)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The minimum interval, in milliseconds, between BFD control packets received from the peer router. The actual value is negotiated between the two routers and is equal to the greater of this value and the transmit interval of the other router. If set, this value must be between 1000 and 30000. The default is 1000.
   * </pre>
   *
   * <code>optional uint32 min_receive_interval = 186981614;</code>
   *
   * @return Whether the minReceiveInterval field is set.
   */
  boolean hasMinReceiveInterval();
  /**
   *
   *
   * <pre>
   * The minimum interval, in milliseconds, between BFD control packets received from the peer router. The actual value is negotiated between the two routers and is equal to the greater of this value and the transmit interval of the other router. If set, this value must be between 1000 and 30000. The default is 1000.
   * </pre>
   *
   * <code>optional uint32 min_receive_interval = 186981614;</code>
   *
   * @return The minReceiveInterval.
   */
  int getMinReceiveInterval();

  /**
   *
   *
   * <pre>
   * The minimum interval, in milliseconds, between BFD control packets transmitted to the peer router. The actual value is negotiated between the two routers and is equal to the greater of this value and the corresponding receive interval of the other router. If set, this value must be between 1000 and 30000. The default is 1000.
   * </pre>
   *
   * <code>optional uint32 min_transmit_interval = 523282631;</code>
   *
   * @return Whether the minTransmitInterval field is set.
   */
  boolean hasMinTransmitInterval();
  /**
   *
   *
   * <pre>
   * The minimum interval, in milliseconds, between BFD control packets transmitted to the peer router. The actual value is negotiated between the two routers and is equal to the greater of this value and the corresponding receive interval of the other router. If set, this value must be between 1000 and 30000. The default is 1000.
   * </pre>
   *
   * <code>optional uint32 min_transmit_interval = 523282631;</code>
   *
   * @return The minTransmitInterval.
   */
  int getMinTransmitInterval();

  /**
   *
   *
   * <pre>
   * The number of consecutive BFD packets that must be missed before BFD declares that a peer is unavailable. If set, the value must be a value between 5 and 16. The default is 5.
   * </pre>
   *
   * <code>optional uint32 multiplier = 191331777;</code>
   *
   * @return Whether the multiplier field is set.
   */
  boolean hasMultiplier();
  /**
   *
   *
   * <pre>
   * The number of consecutive BFD packets that must be missed before BFD declares that a peer is unavailable. If set, the value must be a value between 5 and 16. The default is 5.
   * </pre>
   *
   * <code>optional uint32 multiplier = 191331777;</code>
   *
   * @return The multiplier.
   */
  int getMultiplier();

  /**
   *
   *
   * <pre>
   * The BFD session initialization mode for this BGP peer. If set to ACTIVE, the Cloud Router will initiate the BFD session for this BGP peer. If set to PASSIVE, the Cloud Router will wait for the peer router to initiate the BFD session for this BGP peer. If set to DISABLED, BFD is disabled for this BGP peer. The default is DISABLED.
   * Check the SessionInitializationMode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string session_initialization_mode = 105957049;</code>
   *
   * @return Whether the sessionInitializationMode field is set.
   */
  boolean hasSessionInitializationMode();
  /**
   *
   *
   * <pre>
   * The BFD session initialization mode for this BGP peer. If set to ACTIVE, the Cloud Router will initiate the BFD session for this BGP peer. If set to PASSIVE, the Cloud Router will wait for the peer router to initiate the BFD session for this BGP peer. If set to DISABLED, BFD is disabled for this BGP peer. The default is DISABLED.
   * Check the SessionInitializationMode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string session_initialization_mode = 105957049;</code>
   *
   * @return The sessionInitializationMode.
   */
  java.lang.String getSessionInitializationMode();
  /**
   *
   *
   * <pre>
   * The BFD session initialization mode for this BGP peer. If set to ACTIVE, the Cloud Router will initiate the BFD session for this BGP peer. If set to PASSIVE, the Cloud Router will wait for the peer router to initiate the BFD session for this BGP peer. If set to DISABLED, BFD is disabled for this BGP peer. The default is DISABLED.
   * Check the SessionInitializationMode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string session_initialization_mode = 105957049;</code>
   *
   * @return The bytes for sessionInitializationMode.
   */
  com.google.protobuf.ByteString getSessionInitializationModeBytes();
}
