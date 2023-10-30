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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

public interface CreateKeyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.CreateKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the project in which the key will be created, in the
   * format "projects/{project}".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of the project in which the key will be created, in the
   * format "projects/{project}".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Information to create a reCAPTCHA Enterprise key.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.Key key = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the key field is set.
   */
  boolean hasKey();
  /**
   *
   *
   * <pre>
   * Required. Information to create a reCAPTCHA Enterprise key.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.Key key = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The key.
   */
  com.google.recaptchaenterprise.v1.Key getKey();
  /**
   *
   *
   * <pre>
   * Required. Information to create a reCAPTCHA Enterprise key.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.Key key = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.recaptchaenterprise.v1.KeyOrBuilder getKeyOrBuilder();
}
