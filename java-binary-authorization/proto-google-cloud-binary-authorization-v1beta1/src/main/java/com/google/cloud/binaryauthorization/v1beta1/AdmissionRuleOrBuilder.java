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
// source: google/cloud/binaryauthorization/v1beta1/resources.proto

package com.google.cloud.binaryauthorization.v1beta1;

public interface AdmissionRuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.binaryauthorization.v1beta1.AdmissionRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. How this admission rule will be evaluated.
   * </pre>
   *
   * <code>
   * .google.cloud.binaryauthorization.v1beta1.AdmissionRule.EvaluationMode evaluation_mode = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for evaluationMode.
   */
  int getEvaluationModeValue();
  /**
   *
   *
   * <pre>
   * Required. How this admission rule will be evaluated.
   * </pre>
   *
   * <code>
   * .google.cloud.binaryauthorization.v1beta1.AdmissionRule.EvaluationMode evaluation_mode = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The evaluationMode.
   */
  com.google.cloud.binaryauthorization.v1beta1.AdmissionRule.EvaluationMode getEvaluationMode();

  /**
   *
   *
   * <pre>
   * Optional. The resource names of the attestors that must attest to
   * a container image, in the format `projects/&#42;&#47;attestors/&#42;`. Each
   * attestor must exist before a policy can reference it.  To add an attestor
   * to a policy the principal issuing the policy change request must be able
   * to read the attestor resource.
   *
   * Note: this field must be non-empty when the evaluation_mode field specifies
   * REQUIRE_ATTESTATION, otherwise it must be empty.
   * </pre>
   *
   * <code>repeated string require_attestations_by = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the requireAttestationsBy.
   */
  java.util.List<java.lang.String> getRequireAttestationsByList();
  /**
   *
   *
   * <pre>
   * Optional. The resource names of the attestors that must attest to
   * a container image, in the format `projects/&#42;&#47;attestors/&#42;`. Each
   * attestor must exist before a policy can reference it.  To add an attestor
   * to a policy the principal issuing the policy change request must be able
   * to read the attestor resource.
   *
   * Note: this field must be non-empty when the evaluation_mode field specifies
   * REQUIRE_ATTESTATION, otherwise it must be empty.
   * </pre>
   *
   * <code>repeated string require_attestations_by = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of requireAttestationsBy.
   */
  int getRequireAttestationsByCount();
  /**
   *
   *
   * <pre>
   * Optional. The resource names of the attestors that must attest to
   * a container image, in the format `projects/&#42;&#47;attestors/&#42;`. Each
   * attestor must exist before a policy can reference it.  To add an attestor
   * to a policy the principal issuing the policy change request must be able
   * to read the attestor resource.
   *
   * Note: this field must be non-empty when the evaluation_mode field specifies
   * REQUIRE_ATTESTATION, otherwise it must be empty.
   * </pre>
   *
   * <code>repeated string require_attestations_by = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The requireAttestationsBy at the given index.
   */
  java.lang.String getRequireAttestationsBy(int index);
  /**
   *
   *
   * <pre>
   * Optional. The resource names of the attestors that must attest to
   * a container image, in the format `projects/&#42;&#47;attestors/&#42;`. Each
   * attestor must exist before a policy can reference it.  To add an attestor
   * to a policy the principal issuing the policy change request must be able
   * to read the attestor resource.
   *
   * Note: this field must be non-empty when the evaluation_mode field specifies
   * REQUIRE_ATTESTATION, otherwise it must be empty.
   * </pre>
   *
   * <code>repeated string require_attestations_by = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the requireAttestationsBy at the given index.
   */
  com.google.protobuf.ByteString getRequireAttestationsByBytes(int index);

  /**
   *
   *
   * <pre>
   * Required. The action when a pod creation is denied by the admission rule.
   * </pre>
   *
   * <code>
   * .google.cloud.binaryauthorization.v1beta1.AdmissionRule.EnforcementMode enforcement_mode = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for enforcementMode.
   */
  int getEnforcementModeValue();
  /**
   *
   *
   * <pre>
   * Required. The action when a pod creation is denied by the admission rule.
   * </pre>
   *
   * <code>
   * .google.cloud.binaryauthorization.v1beta1.AdmissionRule.EnforcementMode enforcement_mode = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enforcementMode.
   */
  com.google.cloud.binaryauthorization.v1beta1.AdmissionRule.EnforcementMode getEnforcementMode();
}
