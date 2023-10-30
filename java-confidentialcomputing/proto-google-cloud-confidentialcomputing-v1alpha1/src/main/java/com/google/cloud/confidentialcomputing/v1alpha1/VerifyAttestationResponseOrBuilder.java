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
// source: google/cloud/confidentialcomputing/v1alpha1/service.proto

package com.google.cloud.confidentialcomputing.v1alpha1;

public interface VerifyAttestationResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.confidentialcomputing.v1alpha1.VerifyAttestationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The OIDC token issued by this service. It contains specific
   * platform claims based on the contents of the provided attestation.
   * --
   * </pre>
   *
   * <code>bytes claims_token = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The claimsToken.
   */
  com.google.protobuf.ByteString getClaimsToken();
}
