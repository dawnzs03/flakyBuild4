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
// source: google/cloud/gkehub/v1alpha/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1alpha;

public interface BinauthzStateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1alpha.BinauthzState)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The state of the binauthz webhook.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState webhook = 1;</code>
   *
   * @return The enum numeric value on the wire for webhook.
   */
  int getWebhookValue();
  /**
   *
   *
   * <pre>
   * The state of the binauthz webhook.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState webhook = 1;</code>
   *
   * @return The webhook.
   */
  com.google.cloud.gkehub.configmanagement.v1alpha.DeploymentState getWebhook();

  /**
   *
   *
   * <pre>
   * The version of binauthz that is installed.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion version = 2;</code>
   *
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   *
   *
   * <pre>
   * The version of binauthz that is installed.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion version = 2;</code>
   *
   * @return The version.
   */
  com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion getVersion();
  /**
   *
   *
   * <pre>
   * The version of binauthz that is installed.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersion version = 2;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1alpha.BinauthzVersionOrBuilder getVersionOrBuilder();
}
