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
// source: google/devtools/cloudprofiler/v2/profiler.proto

package com.google.devtools.cloudprofiler.v2;

public interface CreateOfflineProfileRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Parent project to create the profile in.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Parent project to create the profile in.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Contents of the profile to create.
   * </pre>
   *
   * <code>.google.devtools.cloudprofiler.v2.Profile profile = 2;</code>
   *
   * @return Whether the profile field is set.
   */
  boolean hasProfile();
  /**
   *
   *
   * <pre>
   * Contents of the profile to create.
   * </pre>
   *
   * <code>.google.devtools.cloudprofiler.v2.Profile profile = 2;</code>
   *
   * @return The profile.
   */
  com.google.devtools.cloudprofiler.v2.Profile getProfile();
  /**
   *
   *
   * <pre>
   * Contents of the profile to create.
   * </pre>
   *
   * <code>.google.devtools.cloudprofiler.v2.Profile profile = 2;</code>
   */
  com.google.devtools.cloudprofiler.v2.ProfileOrBuilder getProfileOrBuilder();
}
