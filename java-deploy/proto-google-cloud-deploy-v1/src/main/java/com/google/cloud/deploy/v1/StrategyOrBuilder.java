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
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

public interface StrategyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.Strategy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Standard deployment strategy executes a single deploy and allows
   * verifying the deployment.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Standard standard = 1;</code>
   *
   * @return Whether the standard field is set.
   */
  boolean hasStandard();
  /**
   *
   *
   * <pre>
   * Standard deployment strategy executes a single deploy and allows
   * verifying the deployment.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Standard standard = 1;</code>
   *
   * @return The standard.
   */
  com.google.cloud.deploy.v1.Standard getStandard();
  /**
   *
   *
   * <pre>
   * Standard deployment strategy executes a single deploy and allows
   * verifying the deployment.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Standard standard = 1;</code>
   */
  com.google.cloud.deploy.v1.StandardOrBuilder getStandardOrBuilder();

  /**
   *
   *
   * <pre>
   * Canary deployment strategy provides progressive percentage based
   * deployments to a Target.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Canary canary = 2;</code>
   *
   * @return Whether the canary field is set.
   */
  boolean hasCanary();
  /**
   *
   *
   * <pre>
   * Canary deployment strategy provides progressive percentage based
   * deployments to a Target.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Canary canary = 2;</code>
   *
   * @return The canary.
   */
  com.google.cloud.deploy.v1.Canary getCanary();
  /**
   *
   *
   * <pre>
   * Canary deployment strategy provides progressive percentage based
   * deployments to a Target.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.Canary canary = 2;</code>
   */
  com.google.cloud.deploy.v1.CanaryOrBuilder getCanaryOrBuilder();

  com.google.cloud.deploy.v1.Strategy.DeploymentStrategyCase getDeploymentStrategyCase();
}
