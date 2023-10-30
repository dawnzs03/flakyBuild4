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
// source: google/identity/accesscontextmanager/v1/access_context_manager.proto

package com.google.identity.accesscontextmanager.v1;

public interface CommitServicePerimetersRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.identity.accesscontextmanager.v1.CommitServicePerimetersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name for the parent [Access Policy]
   * [google.identity.accesscontextmanager.v1.AccessPolicy] which owns all
   * [Service Perimeters]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] in scope for
   * the commit operation.
   *
   * Format: `accessPolicies/{policy_id}`
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
   * Required. Resource name for the parent [Access Policy]
   * [google.identity.accesscontextmanager.v1.AccessPolicy] which owns all
   * [Service Perimeters]
   * [google.identity.accesscontextmanager.v1.ServicePerimeter] in scope for
   * the commit operation.
   *
   * Format: `accessPolicies/{policy_id}`
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
   * Optional. The etag for the version of the [Access Policy]
   * [google.identity.accesscontextmanager.v1.AccessPolicy] that this
   * commit operation is to be performed on. If, at the time of commit, the
   * etag for the Access Policy stored in Access Context Manager is different
   * from the specified etag, then the commit operation will not be performed
   * and the call will fail. This field is not required. If etag is not
   * provided, the operation will be performed as if a valid etag is provided.
   * </pre>
   *
   * <code>string etag = 2;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Optional. The etag for the version of the [Access Policy]
   * [google.identity.accesscontextmanager.v1.AccessPolicy] that this
   * commit operation is to be performed on. If, at the time of commit, the
   * etag for the Access Policy stored in Access Context Manager is different
   * from the specified etag, then the commit operation will not be performed
   * and the call will fail. This field is not required. If etag is not
   * provided, the operation will be performed as if a valid etag is provided.
   * </pre>
   *
   * <code>string etag = 2;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}
