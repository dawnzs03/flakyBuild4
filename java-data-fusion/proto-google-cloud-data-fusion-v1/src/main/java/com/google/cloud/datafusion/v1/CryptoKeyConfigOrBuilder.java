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
// source: google/cloud/datafusion/v1/datafusion.proto

package com.google.cloud.datafusion.v1;

public interface CryptoKeyConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datafusion.v1.CryptoKeyConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the key which is used to encrypt/decrypt customer data. For key
   * in Cloud KMS, the key should be in the format of
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;`.
   * </pre>
   *
   * <code>string key_reference = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The keyReference.
   */
  java.lang.String getKeyReference();
  /**
   *
   *
   * <pre>
   * The name of the key which is used to encrypt/decrypt customer data. For key
   * in Cloud KMS, the key should be in the format of
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;`.
   * </pre>
   *
   * <code>string key_reference = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for keyReference.
   */
  com.google.protobuf.ByteString getKeyReferenceBytes();
}
