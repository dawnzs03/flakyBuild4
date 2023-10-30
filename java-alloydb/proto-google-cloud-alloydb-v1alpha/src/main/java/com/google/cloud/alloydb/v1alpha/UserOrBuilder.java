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
// source: google/cloud/alloydb/v1alpha/resources.proto

package com.google.cloud.alloydb.v1alpha;

public interface UserOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1alpha.User)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Name of the resource in the form of
   * projects/{project}/locations/{location}/cluster/{cluster}/users/{user}.
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
   * Output only. Name of the resource in the form of
   * projects/{project}/locations/{location}/cluster/{cluster}/users/{user}.
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
   * Input only. Password for the user.
   * </pre>
   *
   * <code>string password = 2 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   *
   *
   * <pre>
   * Input only. Password for the user.
   * </pre>
   *
   * <code>string password = 2 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString getPasswordBytes();

  /**
   *
   *
   * <pre>
   * Optional. List of database roles this user has.
   * The database role strings are subject to the PostgreSQL naming conventions.
   * </pre>
   *
   * <code>repeated string database_roles = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the databaseRoles.
   */
  java.util.List<java.lang.String> getDatabaseRolesList();
  /**
   *
   *
   * <pre>
   * Optional. List of database roles this user has.
   * The database role strings are subject to the PostgreSQL naming conventions.
   * </pre>
   *
   * <code>repeated string database_roles = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of databaseRoles.
   */
  int getDatabaseRolesCount();
  /**
   *
   *
   * <pre>
   * Optional. List of database roles this user has.
   * The database role strings are subject to the PostgreSQL naming conventions.
   * </pre>
   *
   * <code>repeated string database_roles = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The databaseRoles at the given index.
   */
  java.lang.String getDatabaseRoles(int index);
  /**
   *
   *
   * <pre>
   * Optional. List of database roles this user has.
   * The database role strings are subject to the PostgreSQL naming conventions.
   * </pre>
   *
   * <code>repeated string database_roles = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the databaseRoles at the given index.
   */
  com.google.protobuf.ByteString getDatabaseRolesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Type of this user.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1alpha.User.UserType user_type = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for userType.
   */
  int getUserTypeValue();
  /**
   *
   *
   * <pre>
   * Optional. Type of this user.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1alpha.User.UserType user_type = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The userType.
   */
  com.google.cloud.alloydb.v1alpha.User.UserType getUserType();
}
