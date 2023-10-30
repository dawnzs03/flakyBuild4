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
// source: google/api/apikeys/v2/resources.proto

package com.google.api.apikeys.v2;

public interface AndroidKeyRestrictionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.apikeys.v2.AndroidKeyRestrictions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of Android applications that are allowed to make API calls with
   * this key.
   * </pre>
   *
   * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
   */
  java.util.List<com.google.api.apikeys.v2.AndroidApplication> getAllowedApplicationsList();
  /**
   *
   *
   * <pre>
   * A list of Android applications that are allowed to make API calls with
   * this key.
   * </pre>
   *
   * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
   */
  com.google.api.apikeys.v2.AndroidApplication getAllowedApplications(int index);
  /**
   *
   *
   * <pre>
   * A list of Android applications that are allowed to make API calls with
   * this key.
   * </pre>
   *
   * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
   */
  int getAllowedApplicationsCount();
  /**
   *
   *
   * <pre>
   * A list of Android applications that are allowed to make API calls with
   * this key.
   * </pre>
   *
   * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
   */
  java.util.List<? extends com.google.api.apikeys.v2.AndroidApplicationOrBuilder>
      getAllowedApplicationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of Android applications that are allowed to make API calls with
   * this key.
   * </pre>
   *
   * <code>repeated .google.api.apikeys.v2.AndroidApplication allowed_applications = 1;</code>
   */
  com.google.api.apikeys.v2.AndroidApplicationOrBuilder getAllowedApplicationsOrBuilder(int index);
}
