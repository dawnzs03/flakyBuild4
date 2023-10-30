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
// source: google/maps/addressvalidation/v1/address_validation_service.proto

package com.google.maps.addressvalidation.v1;

public interface ValidateAddressResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.addressvalidation.v1.ValidateAddressResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The result of the address validation.
   * </pre>
   *
   * <code>.google.maps.addressvalidation.v1.ValidationResult result = 1;</code>
   *
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   *
   *
   * <pre>
   * The result of the address validation.
   * </pre>
   *
   * <code>.google.maps.addressvalidation.v1.ValidationResult result = 1;</code>
   *
   * @return The result.
   */
  com.google.maps.addressvalidation.v1.ValidationResult getResult();
  /**
   *
   *
   * <pre>
   * The result of the address validation.
   * </pre>
   *
   * <code>.google.maps.addressvalidation.v1.ValidationResult result = 1;</code>
   */
  com.google.maps.addressvalidation.v1.ValidationResultOrBuilder getResultOrBuilder();

  /**
   *
   *
   * <pre>
   * The UUID that identifies this response. If the address needs to be
   * re-validated, this UUID *must* accompany the new request.
   * </pre>
   *
   * <code>string response_id = 2;</code>
   *
   * @return The responseId.
   */
  java.lang.String getResponseId();
  /**
   *
   *
   * <pre>
   * The UUID that identifies this response. If the address needs to be
   * re-validated, this UUID *must* accompany the new request.
   * </pre>
   *
   * <code>string response_id = 2;</code>
   *
   * @return The bytes for responseId.
   */
  com.google.protobuf.ByteString getResponseIdBytes();
}
