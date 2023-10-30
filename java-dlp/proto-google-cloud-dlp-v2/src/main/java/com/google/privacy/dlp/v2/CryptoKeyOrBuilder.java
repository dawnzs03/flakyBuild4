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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface CryptoKeyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.CryptoKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Transient crypto key
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransientCryptoKey transient = 1;</code>
   *
   * @return Whether the transient field is set.
   */
  boolean hasTransient();
  /**
   *
   *
   * <pre>
   * Transient crypto key
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransientCryptoKey transient = 1;</code>
   *
   * @return The transient.
   */
  com.google.privacy.dlp.v2.TransientCryptoKey getTransient();
  /**
   *
   *
   * <pre>
   * Transient crypto key
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransientCryptoKey transient = 1;</code>
   */
  com.google.privacy.dlp.v2.TransientCryptoKeyOrBuilder getTransientOrBuilder();

  /**
   *
   *
   * <pre>
   * Unwrapped crypto key
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.UnwrappedCryptoKey unwrapped = 2;</code>
   *
   * @return Whether the unwrapped field is set.
   */
  boolean hasUnwrapped();
  /**
   *
   *
   * <pre>
   * Unwrapped crypto key
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.UnwrappedCryptoKey unwrapped = 2;</code>
   *
   * @return The unwrapped.
   */
  com.google.privacy.dlp.v2.UnwrappedCryptoKey getUnwrapped();
  /**
   *
   *
   * <pre>
   * Unwrapped crypto key
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.UnwrappedCryptoKey unwrapped = 2;</code>
   */
  com.google.privacy.dlp.v2.UnwrappedCryptoKeyOrBuilder getUnwrappedOrBuilder();

  /**
   *
   *
   * <pre>
   * Key wrapped using Cloud KMS
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.KmsWrappedCryptoKey kms_wrapped = 3;</code>
   *
   * @return Whether the kmsWrapped field is set.
   */
  boolean hasKmsWrapped();
  /**
   *
   *
   * <pre>
   * Key wrapped using Cloud KMS
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.KmsWrappedCryptoKey kms_wrapped = 3;</code>
   *
   * @return The kmsWrapped.
   */
  com.google.privacy.dlp.v2.KmsWrappedCryptoKey getKmsWrapped();
  /**
   *
   *
   * <pre>
   * Key wrapped using Cloud KMS
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.KmsWrappedCryptoKey kms_wrapped = 3;</code>
   */
  com.google.privacy.dlp.v2.KmsWrappedCryptoKeyOrBuilder getKmsWrappedOrBuilder();

  com.google.privacy.dlp.v2.CryptoKey.SourceCase getSourceCase();
}
