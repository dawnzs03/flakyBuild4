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
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

package com.google.cloud.contactcenterinsights.v1;

public interface CreateIssueModelRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.CreateIssueModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource of the issue model.
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
   * Required. The parent resource of the issue model.
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
   * Required. The issue model to create.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.IssueModel issue_model = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the issueModel field is set.
   */
  boolean hasIssueModel();
  /**
   *
   *
   * <pre>
   * Required. The issue model to create.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.IssueModel issue_model = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The issueModel.
   */
  com.google.cloud.contactcenterinsights.v1.IssueModel getIssueModel();
  /**
   *
   *
   * <pre>
   * Required. The issue model to create.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.IssueModel issue_model = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.contactcenterinsights.v1.IssueModelOrBuilder getIssueModelOrBuilder();
}
