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
// source: google/cloud/aiplatform/v1beta1/model_monitoring.proto

package com.google.cloud.aiplatform.v1beta1;

public interface SamplingStrategyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.SamplingStrategy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Random sample config. Will support more sampling strategies later.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SamplingStrategy.RandomSampleConfig random_sample_config = 1;
   * </code>
   *
   * @return Whether the randomSampleConfig field is set.
   */
  boolean hasRandomSampleConfig();
  /**
   *
   *
   * <pre>
   * Random sample config. Will support more sampling strategies later.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SamplingStrategy.RandomSampleConfig random_sample_config = 1;
   * </code>
   *
   * @return The randomSampleConfig.
   */
  com.google.cloud.aiplatform.v1beta1.SamplingStrategy.RandomSampleConfig getRandomSampleConfig();
  /**
   *
   *
   * <pre>
   * Random sample config. Will support more sampling strategies later.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SamplingStrategy.RandomSampleConfig random_sample_config = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.SamplingStrategy.RandomSampleConfigOrBuilder
      getRandomSampleConfigOrBuilder();
}
