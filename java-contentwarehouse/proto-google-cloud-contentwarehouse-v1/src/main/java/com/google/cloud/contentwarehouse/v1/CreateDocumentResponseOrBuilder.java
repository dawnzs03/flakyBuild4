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
// source: google/cloud/contentwarehouse/v1/document_service.proto

package com.google.cloud.contentwarehouse.v1;

public interface CreateDocumentResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.CreateDocumentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Document created after executing create request.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.Document document = 1;</code>
   *
   * @return Whether the document field is set.
   */
  boolean hasDocument();
  /**
   *
   *
   * <pre>
   * Document created after executing create request.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.Document document = 1;</code>
   *
   * @return The document.
   */
  com.google.cloud.contentwarehouse.v1.Document getDocument();
  /**
   *
   *
   * <pre>
   * Document created after executing create request.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.Document document = 1;</code>
   */
  com.google.cloud.contentwarehouse.v1.DocumentOrBuilder getDocumentOrBuilder();

  /**
   *
   *
   * <pre>
   * Output from Rule Engine recording the rule evaluator and action executor's
   * output.
   *
   * Refer format in: google/cloud/contentwarehouse/v1/rule_engine.proto
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RuleEngineOutput rule_engine_output = 2;</code>
   *
   * @return Whether the ruleEngineOutput field is set.
   */
  boolean hasRuleEngineOutput();
  /**
   *
   *
   * <pre>
   * Output from Rule Engine recording the rule evaluator and action executor's
   * output.
   *
   * Refer format in: google/cloud/contentwarehouse/v1/rule_engine.proto
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RuleEngineOutput rule_engine_output = 2;</code>
   *
   * @return The ruleEngineOutput.
   */
  com.google.cloud.contentwarehouse.v1.RuleEngineOutput getRuleEngineOutput();
  /**
   *
   *
   * <pre>
   * Output from Rule Engine recording the rule evaluator and action executor's
   * output.
   *
   * Refer format in: google/cloud/contentwarehouse/v1/rule_engine.proto
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RuleEngineOutput rule_engine_output = 2;</code>
   */
  com.google.cloud.contentwarehouse.v1.RuleEngineOutputOrBuilder getRuleEngineOutputOrBuilder();

  /**
   *
   *
   * <pre>
   * Additional information for the API invocation, such as the request tracking
   * id.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.ResponseMetadata metadata = 3;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * Additional information for the API invocation, such as the request tracking
   * id.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.ResponseMetadata metadata = 3;</code>
   *
   * @return The metadata.
   */
  com.google.cloud.contentwarehouse.v1.ResponseMetadata getMetadata();
  /**
   *
   *
   * <pre>
   * Additional information for the API invocation, such as the request tracking
   * id.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.ResponseMetadata metadata = 3;</code>
   */
  com.google.cloud.contentwarehouse.v1.ResponseMetadataOrBuilder getMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * post-processing LROs
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation long_running_operations = 4;</code>
   */
  java.util.List<com.google.longrunning.Operation> getLongRunningOperationsList();
  /**
   *
   *
   * <pre>
   * post-processing LROs
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation long_running_operations = 4;</code>
   */
  com.google.longrunning.Operation getLongRunningOperations(int index);
  /**
   *
   *
   * <pre>
   * post-processing LROs
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation long_running_operations = 4;</code>
   */
  int getLongRunningOperationsCount();
  /**
   *
   *
   * <pre>
   * post-processing LROs
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation long_running_operations = 4;</code>
   */
  java.util.List<? extends com.google.longrunning.OperationOrBuilder>
      getLongRunningOperationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * post-processing LROs
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation long_running_operations = 4;</code>
   */
  com.google.longrunning.OperationOrBuilder getLongRunningOperationsOrBuilder(int index);
}
