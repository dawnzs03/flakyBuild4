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
// source: google/cloud/support/v2/case_service.proto

package com.google.cloud.support.v2;

public interface SearchCasesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.support.v2.SearchCasesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The fully qualified name of parent resource to search cases under.
   * </pre>
   *
   * <code>string parent = 4;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The fully qualified name of parent resource to search cases under.
   * </pre>
   *
   * <code>string parent = 4;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * An expression written in filter language.
   *
   * A query uses the following fields with the operators equals (`=`) and
   * `AND`:
   *
   * - `organization`: An organization name in the form
   * `organizations/&lt;organization_id&gt;`.
   * - `project`: A project name in the form `projects/&lt;project_id&gt;`.
   * - `state`: The accepted values are `OPEN` or `CLOSED`.
   * - `priority`: The accepted values are `P0`, `P1`, `P2`, `P3`, or `P4`. You
   * can specify multiple values for priority using the `OR` operator. For
   * example, `priority=P1 OR priority=P2`.
   * - `creator.email`: The email address of the case creator.
   * - `billingAccount`: A billing account in the form
   * `billingAccounts/&lt;billing_account_id&gt;`
   *
   * You must specify either `organization` or `project`.
   *
   * To search across `displayName`, `description`, and comments, use a global
   * restriction with no keyword or operator. For example, `"my search"`.
   *
   * To search only cases updated after a certain date, use `update_time`
   * restricted with that particular date, time, and timezone in ISO datetime
   * format. For example, `update_time&gt;"2020-01-01T00:00:00-05:00"`.
   * `update_time` only supports the greater than operator (`&gt;`).
   *
   * Examples:
   *
   * - `organization="organizations/123456789"`
   * - `project="projects/my-project-id"`
   * - `project="projects/123456789"`
   * - `billing_account="billingAccounts/123456-A0B0C0-CUZ789"`
   * - `organization="organizations/123456789" AND state=CLOSED`
   * - `project="projects/my-project-id" AND creator.email="tester&#64;example.com"`
   * - `project="projects/my-project-id" AND (priority=P0 OR priority=P1)`
   * </pre>
   *
   * <code>string query = 1;</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * An expression written in filter language.
   *
   * A query uses the following fields with the operators equals (`=`) and
   * `AND`:
   *
   * - `organization`: An organization name in the form
   * `organizations/&lt;organization_id&gt;`.
   * - `project`: A project name in the form `projects/&lt;project_id&gt;`.
   * - `state`: The accepted values are `OPEN` or `CLOSED`.
   * - `priority`: The accepted values are `P0`, `P1`, `P2`, `P3`, or `P4`. You
   * can specify multiple values for priority using the `OR` operator. For
   * example, `priority=P1 OR priority=P2`.
   * - `creator.email`: The email address of the case creator.
   * - `billingAccount`: A billing account in the form
   * `billingAccounts/&lt;billing_account_id&gt;`
   *
   * You must specify either `organization` or `project`.
   *
   * To search across `displayName`, `description`, and comments, use a global
   * restriction with no keyword or operator. For example, `"my search"`.
   *
   * To search only cases updated after a certain date, use `update_time`
   * restricted with that particular date, time, and timezone in ISO datetime
   * format. For example, `update_time&gt;"2020-01-01T00:00:00-05:00"`.
   * `update_time` only supports the greater than operator (`&gt;`).
   *
   * Examples:
   *
   * - `organization="organizations/123456789"`
   * - `project="projects/my-project-id"`
   * - `project="projects/123456789"`
   * - `billing_account="billingAccounts/123456-A0B0C0-CUZ789"`
   * - `organization="organizations/123456789" AND state=CLOSED`
   * - `project="projects/my-project-id" AND creator.email="tester&#64;example.com"`
   * - `project="projects/my-project-id" AND (priority=P0 OR priority=P1)`
   * </pre>
   *
   * <code>string query = 1;</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of cases fetched with each request. The default page
   * size is 10.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A token identifying the page of results to return. If unspecified, the
   * first page is retrieved.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A token identifying the page of results to return. If unspecified, the
   * first page is retrieved.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
