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
// source: google/cloud/datalabeling/v1beta1/evaluation.proto

package com.google.cloud.datalabeling.v1beta1;

public interface EvaluationMetricsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.EvaluationMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.cloud.datalabeling.v1beta1.ClassificationMetrics classification_metrics = 1;
   * </code>
   *
   * @return Whether the classificationMetrics field is set.
   */
  boolean hasClassificationMetrics();
  /**
   * <code>.google.cloud.datalabeling.v1beta1.ClassificationMetrics classification_metrics = 1;
   * </code>
   *
   * @return The classificationMetrics.
   */
  com.google.cloud.datalabeling.v1beta1.ClassificationMetrics getClassificationMetrics();
  /**
   * <code>.google.cloud.datalabeling.v1beta1.ClassificationMetrics classification_metrics = 1;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.ClassificationMetricsOrBuilder
      getClassificationMetricsOrBuilder();

  /**
   * <code>.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics object_detection_metrics = 2;
   * </code>
   *
   * @return Whether the objectDetectionMetrics field is set.
   */
  boolean hasObjectDetectionMetrics();
  /**
   * <code>.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics object_detection_metrics = 2;
   * </code>
   *
   * @return The objectDetectionMetrics.
   */
  com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics getObjectDetectionMetrics();
  /**
   * <code>.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics object_detection_metrics = 2;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetricsOrBuilder
      getObjectDetectionMetricsOrBuilder();

  com.google.cloud.datalabeling.v1beta1.EvaluationMetrics.MetricsCase getMetricsCase();
}
