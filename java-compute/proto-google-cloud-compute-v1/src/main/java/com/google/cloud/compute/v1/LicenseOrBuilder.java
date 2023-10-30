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

public interface LicenseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.License)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] Deprecated. This field no longer reflects whether a license charges a usage fee.
   * </pre>
   *
   * <code>optional bool charges_use_fee = 372412622;</code>
   *
   * @return Whether the chargesUseFee field is set.
   */
  boolean hasChargesUseFee();
  /**
   *
   *
   * <pre>
   * [Output Only] Deprecated. This field no longer reflects whether a license charges a usage fee.
   * </pre>
   *
   * <code>optional bool charges_use_fee = 372412622;</code>
   *
   * @return The chargesUseFee.
   */
  boolean getChargesUseFee();

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * An optional textual description of the resource; provided by the client when the resource is created.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * An optional textual description of the resource; provided by the client when the resource is created.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional textual description of the resource; provided by the client when the resource is created.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return The id.
   */
  long getId();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#license for licenses.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#license for licenses.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#license for licenses.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique code used to attach this license to images, snapshots, and disks.
   * </pre>
   *
   * <code>optional uint64 license_code = 1467179;</code>
   *
   * @return Whether the licenseCode field is set.
   */
  boolean hasLicenseCode();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique code used to attach this license to images, snapshots, and disks.
   * </pre>
   *
   * <code>optional uint64 license_code = 1467179;</code>
   *
   * @return The licenseCode.
   */
  long getLicenseCode();

  /**
   *
   *
   * <pre>
   * Name of the resource. The name must be 1-63 characters long and comply with RFC1035.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * Name of the resource. The name must be 1-63 characters long and comply with RFC1035.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of the resource. The name must be 1-63 characters long and comply with RFC1035.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   * <code>
   * optional .google.cloud.compute.v1.LicenseResourceRequirements resource_requirements = 214292769;
   * </code>
   *
   * @return Whether the resourceRequirements field is set.
   */
  boolean hasResourceRequirements();
  /**
   * <code>
   * optional .google.cloud.compute.v1.LicenseResourceRequirements resource_requirements = 214292769;
   * </code>
   *
   * @return The resourceRequirements.
   */
  com.google.cloud.compute.v1.LicenseResourceRequirements getResourceRequirements();
  /**
   * <code>
   * optional .google.cloud.compute.v1.LicenseResourceRequirements resource_requirements = 214292769;
   * </code>
   */
  com.google.cloud.compute.v1.LicenseResourceRequirementsOrBuilder
      getResourceRequirementsOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * If false, licenses will not be copied from the source resource when creating an image from a disk, disk from snapshot, or snapshot from disk.
   * </pre>
   *
   * <code>optional bool transferable = 4349893;</code>
   *
   * @return Whether the transferable field is set.
   */
  boolean hasTransferable();
  /**
   *
   *
   * <pre>
   * If false, licenses will not be copied from the source resource when creating an image from a disk, disk from snapshot, or snapshot from disk.
   * </pre>
   *
   * <code>optional bool transferable = 4349893;</code>
   *
   * @return The transferable.
   */
  boolean getTransferable();
}
