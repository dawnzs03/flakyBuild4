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
// source: google/cloud/aiplatform/v1beta1/data_labeling_job.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ActiveLearningConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ActiveLearningConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Max number of human labeled DataItems.
   * </pre>
   *
   * <code>int64 max_data_item_count = 1;</code>
   *
   * @return Whether the maxDataItemCount field is set.
   */
  boolean hasMaxDataItemCount();
  /**
   *
   *
   * <pre>
   * Max number of human labeled DataItems.
   * </pre>
   *
   * <code>int64 max_data_item_count = 1;</code>
   *
   * @return The maxDataItemCount.
   */
  long getMaxDataItemCount();

  /**
   *
   *
   * <pre>
   * Max percent of total DataItems for human labeling.
   * </pre>
   *
   * <code>int32 max_data_item_percentage = 2;</code>
   *
   * @return Whether the maxDataItemPercentage field is set.
   */
  boolean hasMaxDataItemPercentage();
  /**
   *
   *
   * <pre>
   * Max percent of total DataItems for human labeling.
   * </pre>
   *
   * <code>int32 max_data_item_percentage = 2;</code>
   *
   * @return The maxDataItemPercentage.
   */
  int getMaxDataItemPercentage();

  /**
   *
   *
   * <pre>
   * Active learning data sampling config. For every active learning labeling
   * iteration, it will select a batch of data based on the sampling strategy.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SampleConfig sample_config = 3;</code>
   *
   * @return Whether the sampleConfig field is set.
   */
  boolean hasSampleConfig();
  /**
   *
   *
   * <pre>
   * Active learning data sampling config. For every active learning labeling
   * iteration, it will select a batch of data based on the sampling strategy.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SampleConfig sample_config = 3;</code>
   *
   * @return The sampleConfig.
   */
  com.google.cloud.aiplatform.v1beta1.SampleConfig getSampleConfig();
  /**
   *
   *
   * <pre>
   * Active learning data sampling config. For every active learning labeling
   * iteration, it will select a batch of data based on the sampling strategy.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.SampleConfig sample_config = 3;</code>
   */
  com.google.cloud.aiplatform.v1beta1.SampleConfigOrBuilder getSampleConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * CMLE training config. For every active learning labeling iteration, system
   * will train a machine learning model on CMLE. The trained model will be used
   * by data sampling algorithm to select DataItems.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.TrainingConfig training_config = 4;</code>
   *
   * @return Whether the trainingConfig field is set.
   */
  boolean hasTrainingConfig();
  /**
   *
   *
   * <pre>
   * CMLE training config. For every active learning labeling iteration, system
   * will train a machine learning model on CMLE. The trained model will be used
   * by data sampling algorithm to select DataItems.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.TrainingConfig training_config = 4;</code>
   *
   * @return The trainingConfig.
   */
  com.google.cloud.aiplatform.v1beta1.TrainingConfig getTrainingConfig();
  /**
   *
   *
   * <pre>
   * CMLE training config. For every active learning labeling iteration, system
   * will train a machine learning model on CMLE. The trained model will be used
   * by data sampling algorithm to select DataItems.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.TrainingConfig training_config = 4;</code>
   */
  com.google.cloud.aiplatform.v1beta1.TrainingConfigOrBuilder getTrainingConfigOrBuilder();

  com.google.cloud.aiplatform.v1beta1.ActiveLearningConfig.HumanLabelingBudgetCase
      getHumanLabelingBudgetCase();
}
