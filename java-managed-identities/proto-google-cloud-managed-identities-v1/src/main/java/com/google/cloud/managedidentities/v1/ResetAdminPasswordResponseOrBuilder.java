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
// source: google/cloud/managedidentities/v1/managed_identities_service.proto

package com.google.cloud.managedidentities.v1;

public interface ResetAdminPasswordResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.managedidentities.v1.ResetAdminPasswordResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A random password. See [admin][google.cloud.managedidentities.v1.Domain.admin] for more information.
   * </pre>
   *
   * <code>string password = 1;</code>
   *
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   *
   *
   * <pre>
   * A random password. See [admin][google.cloud.managedidentities.v1.Domain.admin] for more information.
   * </pre>
   *
   * <code>string password = 1;</code>
   *
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString getPasswordBytes();
}
