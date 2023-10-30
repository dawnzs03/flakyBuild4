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
// source: google/cloud/baremetalsolution/v2/lun.proto

package com.google.cloud.baremetalsolution.v2;

public interface LunOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.baremetalsolution.v2.Lun)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of the LUN.
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
   * Output only. The name of the LUN.
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
   * An identifier for the LUN, generated by the backend.
   * </pre>
   *
   * <code>string id = 10;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * An identifier for the LUN, generated by the backend.
   * </pre>
   *
   * <code>string id = 10;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * The state of this storage volume.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.Lun.State state = 2;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The state of this storage volume.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.Lun.State state = 2;</code>
   *
   * @return The state.
   */
  com.google.cloud.baremetalsolution.v2.Lun.State getState();

  /**
   *
   *
   * <pre>
   * The size of this LUN, in gigabytes.
   * </pre>
   *
   * <code>int64 size_gb = 3;</code>
   *
   * @return The sizeGb.
   */
  long getSizeGb();

  /**
   *
   *
   * <pre>
   * The LUN multiprotocol type ensures the characteristics of the LUN are
   * optimized for each operating system.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.Lun.MultiprotocolType multiprotocol_type = 4;</code>
   *
   * @return The enum numeric value on the wire for multiprotocolType.
   */
  int getMultiprotocolTypeValue();
  /**
   *
   *
   * <pre>
   * The LUN multiprotocol type ensures the characteristics of the LUN are
   * optimized for each operating system.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.Lun.MultiprotocolType multiprotocol_type = 4;</code>
   *
   * @return The multiprotocolType.
   */
  com.google.cloud.baremetalsolution.v2.Lun.MultiprotocolType getMultiprotocolType();

  /**
   *
   *
   * <pre>
   * Display the storage volume for this LUN.
   * </pre>
   *
   * <code>string storage_volume = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The storageVolume.
   */
  java.lang.String getStorageVolume();
  /**
   *
   *
   * <pre>
   * Display the storage volume for this LUN.
   * </pre>
   *
   * <code>string storage_volume = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for storageVolume.
   */
  com.google.protobuf.ByteString getStorageVolumeBytes();

  /**
   *
   *
   * <pre>
   * Display if this LUN can be shared between multiple physical servers.
   * </pre>
   *
   * <code>bool shareable = 6;</code>
   *
   * @return The shareable.
   */
  boolean getShareable();

  /**
   *
   *
   * <pre>
   * Display if this LUN is a boot LUN.
   * </pre>
   *
   * <code>bool boot_lun = 7;</code>
   *
   * @return The bootLun.
   */
  boolean getBootLun();

  /**
   *
   *
   * <pre>
   * The storage type for this LUN.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.Lun.StorageType storage_type = 8;</code>
   *
   * @return The enum numeric value on the wire for storageType.
   */
  int getStorageTypeValue();
  /**
   *
   *
   * <pre>
   * The storage type for this LUN.
   * </pre>
   *
   * <code>.google.cloud.baremetalsolution.v2.Lun.StorageType storage_type = 8;</code>
   *
   * @return The storageType.
   */
  com.google.cloud.baremetalsolution.v2.Lun.StorageType getStorageType();

  /**
   *
   *
   * <pre>
   * The WWID for this LUN.
   * </pre>
   *
   * <code>string wwid = 9;</code>
   *
   * @return The wwid.
   */
  java.lang.String getWwid();
  /**
   *
   *
   * <pre>
   * The WWID for this LUN.
   * </pre>
   *
   * <code>string wwid = 9;</code>
   *
   * @return The bytes for wwid.
   */
  com.google.protobuf.ByteString getWwidBytes();
}
