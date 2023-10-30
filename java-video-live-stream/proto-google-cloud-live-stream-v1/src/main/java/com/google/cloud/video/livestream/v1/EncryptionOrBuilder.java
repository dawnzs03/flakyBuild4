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
// source: google/cloud/video/livestream/v1/resources.proto

package com.google.cloud.video.livestream.v1;

public interface EncryptionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.Encryption)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Identifier for this set of encryption options.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Required. Identifier for this set of encryption options.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * For keys stored in Google Secret Manager.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.Encryption.SecretManagerSource secret_manager_key_source = 7;
   * </code>
   *
   * @return Whether the secretManagerKeySource field is set.
   */
  boolean hasSecretManagerKeySource();
  /**
   *
   *
   * <pre>
   * For keys stored in Google Secret Manager.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.Encryption.SecretManagerSource secret_manager_key_source = 7;
   * </code>
   *
   * @return The secretManagerKeySource.
   */
  com.google.cloud.video.livestream.v1.Encryption.SecretManagerSource getSecretManagerKeySource();
  /**
   *
   *
   * <pre>
   * For keys stored in Google Secret Manager.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.Encryption.SecretManagerSource secret_manager_key_source = 7;
   * </code>
   */
  com.google.cloud.video.livestream.v1.Encryption.SecretManagerSourceOrBuilder
      getSecretManagerKeySourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Configuration for DRM systems.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.Encryption.DrmSystems drm_systems = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the drmSystems field is set.
   */
  boolean hasDrmSystems();
  /**
   *
   *
   * <pre>
   * Required. Configuration for DRM systems.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.Encryption.DrmSystems drm_systems = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The drmSystems.
   */
  com.google.cloud.video.livestream.v1.Encryption.DrmSystems getDrmSystems();
  /**
   *
   *
   * <pre>
   * Required. Configuration for DRM systems.
   * </pre>
   *
   * <code>
   * .google.cloud.video.livestream.v1.Encryption.DrmSystems drm_systems = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.video.livestream.v1.Encryption.DrmSystemsOrBuilder getDrmSystemsOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for HLS AES-128 encryption.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Encryption.Aes128Encryption aes128 = 4;</code>
   *
   * @return Whether the aes128 field is set.
   */
  boolean hasAes128();
  /**
   *
   *
   * <pre>
   * Configuration for HLS AES-128 encryption.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Encryption.Aes128Encryption aes128 = 4;</code>
   *
   * @return The aes128.
   */
  com.google.cloud.video.livestream.v1.Encryption.Aes128Encryption getAes128();
  /**
   *
   *
   * <pre>
   * Configuration for HLS AES-128 encryption.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Encryption.Aes128Encryption aes128 = 4;</code>
   */
  com.google.cloud.video.livestream.v1.Encryption.Aes128EncryptionOrBuilder getAes128OrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for HLS SAMPLE-AES encryption.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Encryption.SampleAesEncryption sample_aes = 5;</code>
   *
   * @return Whether the sampleAes field is set.
   */
  boolean hasSampleAes();
  /**
   *
   *
   * <pre>
   * Configuration for HLS SAMPLE-AES encryption.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Encryption.SampleAesEncryption sample_aes = 5;</code>
   *
   * @return The sampleAes.
   */
  com.google.cloud.video.livestream.v1.Encryption.SampleAesEncryption getSampleAes();
  /**
   *
   *
   * <pre>
   * Configuration for HLS SAMPLE-AES encryption.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Encryption.SampleAesEncryption sample_aes = 5;</code>
   */
  com.google.cloud.video.livestream.v1.Encryption.SampleAesEncryptionOrBuilder
      getSampleAesOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for MPEG-Dash Common Encryption (MPEG-CENC).
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Encryption.MpegCommonEncryption mpeg_cenc = 6;</code>
   *
   * @return Whether the mpegCenc field is set.
   */
  boolean hasMpegCenc();
  /**
   *
   *
   * <pre>
   * Configuration for MPEG-Dash Common Encryption (MPEG-CENC).
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Encryption.MpegCommonEncryption mpeg_cenc = 6;</code>
   *
   * @return The mpegCenc.
   */
  com.google.cloud.video.livestream.v1.Encryption.MpegCommonEncryption getMpegCenc();
  /**
   *
   *
   * <pre>
   * Configuration for MPEG-Dash Common Encryption (MPEG-CENC).
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.Encryption.MpegCommonEncryption mpeg_cenc = 6;</code>
   */
  com.google.cloud.video.livestream.v1.Encryption.MpegCommonEncryptionOrBuilder
      getMpegCencOrBuilder();

  com.google.cloud.video.livestream.v1.Encryption.SecretSourceCase getSecretSourceCase();

  com.google.cloud.video.livestream.v1.Encryption.EncryptionModeCase getEncryptionModeCase();
}
