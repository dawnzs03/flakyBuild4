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

public interface DeprecationStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.DeprecationStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DELETED. This is only informational and the status will not change unless the client explicitly changes it.
   * </pre>
   *
   * <code>optional string deleted = 476721177;</code>
   *
   * @return Whether the deleted field is set.
   */
  boolean hasDeleted();
  /**
   *
   *
   * <pre>
   * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DELETED. This is only informational and the status will not change unless the client explicitly changes it.
   * </pre>
   *
   * <code>optional string deleted = 476721177;</code>
   *
   * @return The deleted.
   */
  java.lang.String getDeleted();
  /**
   *
   *
   * <pre>
   * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DELETED. This is only informational and the status will not change unless the client explicitly changes it.
   * </pre>
   *
   * <code>optional string deleted = 476721177;</code>
   *
   * @return The bytes for deleted.
   */
  com.google.protobuf.ByteString getDeletedBytes();

  /**
   *
   *
   * <pre>
   * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DEPRECATED. This is only informational and the status will not change unless the client explicitly changes it.
   * </pre>
   *
   * <code>optional string deprecated = 515138995;</code>
   *
   * @return Whether the deprecated field is set.
   */
  boolean hasDeprecated();
  /**
   *
   *
   * <pre>
   * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DEPRECATED. This is only informational and the status will not change unless the client explicitly changes it.
   * </pre>
   *
   * <code>optional string deprecated = 515138995;</code>
   *
   * @return The deprecated.
   */
  java.lang.String getDeprecated();
  /**
   *
   *
   * <pre>
   * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DEPRECATED. This is only informational and the status will not change unless the client explicitly changes it.
   * </pre>
   *
   * <code>optional string deprecated = 515138995;</code>
   *
   * @return The bytes for deprecated.
   */
  com.google.protobuf.ByteString getDeprecatedBytes();

  /**
   *
   *
   * <pre>
   * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to OBSOLETE. This is only informational and the status will not change unless the client explicitly changes it.
   * </pre>
   *
   * <code>optional string obsolete = 357647769;</code>
   *
   * @return Whether the obsolete field is set.
   */
  boolean hasObsolete();
  /**
   *
   *
   * <pre>
   * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to OBSOLETE. This is only informational and the status will not change unless the client explicitly changes it.
   * </pre>
   *
   * <code>optional string obsolete = 357647769;</code>
   *
   * @return The obsolete.
   */
  java.lang.String getObsolete();
  /**
   *
   *
   * <pre>
   * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to OBSOLETE. This is only informational and the status will not change unless the client explicitly changes it.
   * </pre>
   *
   * <code>optional string obsolete = 357647769;</code>
   *
   * @return The bytes for obsolete.
   */
  com.google.protobuf.ByteString getObsoleteBytes();

  /**
   *
   *
   * <pre>
   * The URL of the suggested replacement for a deprecated resource. The suggested replacement resource must be the same kind of resource as the deprecated resource.
   * </pre>
   *
   * <code>optional string replacement = 430919186;</code>
   *
   * @return Whether the replacement field is set.
   */
  boolean hasReplacement();
  /**
   *
   *
   * <pre>
   * The URL of the suggested replacement for a deprecated resource. The suggested replacement resource must be the same kind of resource as the deprecated resource.
   * </pre>
   *
   * <code>optional string replacement = 430919186;</code>
   *
   * @return The replacement.
   */
  java.lang.String getReplacement();
  /**
   *
   *
   * <pre>
   * The URL of the suggested replacement for a deprecated resource. The suggested replacement resource must be the same kind of resource as the deprecated resource.
   * </pre>
   *
   * <code>optional string replacement = 430919186;</code>
   *
   * @return The bytes for replacement.
   */
  com.google.protobuf.ByteString getReplacementBytes();

  /**
   *
   *
   * <pre>
   * The deprecation state of this resource. This can be ACTIVE, DEPRECATED, OBSOLETE, or DELETED. Operations which communicate the end of life date for an image, can use ACTIVE. Operations which create a new resource using a DEPRECATED resource will return successfully, but with a warning indicating the deprecated resource and recommending its replacement. Operations which use OBSOLETE or DELETED resources will be rejected and result in an error.
   * Check the State enum for the list of possible values.
   * </pre>
   *
   * <code>optional string state = 109757585;</code>
   *
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   *
   *
   * <pre>
   * The deprecation state of this resource. This can be ACTIVE, DEPRECATED, OBSOLETE, or DELETED. Operations which communicate the end of life date for an image, can use ACTIVE. Operations which create a new resource using a DEPRECATED resource will return successfully, but with a warning indicating the deprecated resource and recommending its replacement. Operations which use OBSOLETE or DELETED resources will be rejected and result in an error.
   * Check the State enum for the list of possible values.
   * </pre>
   *
   * <code>optional string state = 109757585;</code>
   *
   * @return The state.
   */
  java.lang.String getState();
  /**
   *
   *
   * <pre>
   * The deprecation state of this resource. This can be ACTIVE, DEPRECATED, OBSOLETE, or DELETED. Operations which communicate the end of life date for an image, can use ACTIVE. Operations which create a new resource using a DEPRECATED resource will return successfully, but with a warning indicating the deprecated resource and recommending its replacement. Operations which use OBSOLETE or DELETED resources will be rejected and result in an error.
   * Check the State enum for the list of possible values.
   * </pre>
   *
   * <code>optional string state = 109757585;</code>
   *
   * @return The bytes for state.
   */
  com.google.protobuf.ByteString getStateBytes();
}
