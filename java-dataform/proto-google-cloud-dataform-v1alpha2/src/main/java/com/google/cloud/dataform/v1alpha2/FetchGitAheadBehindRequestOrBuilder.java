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
// source: google/cloud/dataform/v1alpha2/dataform.proto

package com.google.cloud.dataform.v1alpha2;

public interface FetchGitAheadBehindRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1alpha2.FetchGitAheadBehindRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The workspace's name.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The workspace's name.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The name of the branch in the Git remote against which this workspace
   * should be compared. If left unset, the repository's default branch name
   * will be used.
   * </pre>
   *
   * <code>string remote_branch = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The remoteBranch.
   */
  java.lang.String getRemoteBranch();
  /**
   *
   *
   * <pre>
   * Optional. The name of the branch in the Git remote against which this workspace
   * should be compared. If left unset, the repository's default branch name
   * will be used.
   * </pre>
   *
   * <code>string remote_branch = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for remoteBranch.
   */
  com.google.protobuf.ByteString getRemoteBranchBytes();
}
