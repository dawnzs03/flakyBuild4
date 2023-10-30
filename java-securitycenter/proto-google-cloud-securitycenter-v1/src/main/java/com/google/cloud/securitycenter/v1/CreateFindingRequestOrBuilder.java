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
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1;

public interface CreateFindingRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.CreateFindingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the new finding's parent. Its format should be
   * "organizations/[organization_id]/sources/[source_id]".
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
   * Required. Resource name of the new finding's parent. Its format should be
   * "organizations/[organization_id]/sources/[source_id]".
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
   * Required. Unique identifier provided by the client within the parent scope.
   * It must be alphanumeric and less than or equal to 32 characters and
   * greater than 0 characters in length.
   * </pre>
   *
   * <code>string finding_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The findingId.
   */
  java.lang.String getFindingId();
  /**
   *
   *
   * <pre>
   * Required. Unique identifier provided by the client within the parent scope.
   * It must be alphanumeric and less than or equal to 32 characters and
   * greater than 0 characters in length.
   * </pre>
   *
   * <code>string finding_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for findingId.
   */
  com.google.protobuf.ByteString getFindingIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The Finding being created. The name and security_marks will be
   * ignored as they are both output only fields on this resource.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.Finding finding = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the finding field is set.
   */
  boolean hasFinding();
  /**
   *
   *
   * <pre>
   * Required. The Finding being created. The name and security_marks will be
   * ignored as they are both output only fields on this resource.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.Finding finding = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The finding.
   */
  com.google.cloud.securitycenter.v1.Finding getFinding();
  /**
   *
   *
   * <pre>
   * Required. The Finding being created. The name and security_marks will be
   * ignored as they are both output only fields on this resource.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.Finding finding = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.securitycenter.v1.FindingOrBuilder getFindingOrBuilder();
}
