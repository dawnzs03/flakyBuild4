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

public interface LogConfigCloudAuditOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.LogConfigCloudAuditOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.AuthorizationLoggingOptions authorization_logging_options = 217861624;
   * </code>
   *
   * @return Whether the authorizationLoggingOptions field is set.
   */
  boolean hasAuthorizationLoggingOptions();
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.AuthorizationLoggingOptions authorization_logging_options = 217861624;
   * </code>
   *
   * @return The authorizationLoggingOptions.
   */
  com.google.cloud.compute.v1.AuthorizationLoggingOptions getAuthorizationLoggingOptions();
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.AuthorizationLoggingOptions authorization_logging_options = 217861624;
   * </code>
   */
  com.google.cloud.compute.v1.AuthorizationLoggingOptionsOrBuilder
      getAuthorizationLoggingOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * Check the LogName enum for the list of possible values.
   * </pre>
   *
   * <code>optional string log_name = 402913958;</code>
   *
   * @return Whether the logName field is set.
   */
  boolean hasLogName();
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * Check the LogName enum for the list of possible values.
   * </pre>
   *
   * <code>optional string log_name = 402913958;</code>
   *
   * @return The logName.
   */
  java.lang.String getLogName();
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * Check the LogName enum for the list of possible values.
   * </pre>
   *
   * <code>optional string log_name = 402913958;</code>
   *
   * @return The bytes for logName.
   */
  com.google.protobuf.ByteString getLogNameBytes();
}
