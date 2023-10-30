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
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface IdentityConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.IdentityConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Map of user to service account.
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; user_service_account_mapping = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getUserServiceAccountMappingCount();
  /**
   *
   *
   * <pre>
   * Required. Map of user to service account.
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; user_service_account_mapping = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean containsUserServiceAccountMapping(java.lang.String key);
  /** Use {@link #getUserServiceAccountMappingMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getUserServiceAccountMapping();
  /**
   *
   *
   * <pre>
   * Required. Map of user to service account.
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; user_service_account_mapping = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getUserServiceAccountMappingMap();
  /**
   *
   *
   * <pre>
   * Required. Map of user to service account.
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; user_service_account_mapping = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  /* nullable */
  java.lang.String getUserServiceAccountMappingOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Required. Map of user to service account.
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; user_service_account_mapping = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.lang.String getUserServiceAccountMappingOrThrow(java.lang.String key);
}
