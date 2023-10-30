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
// source: google/iam/admin/v1/iam.proto

package com.google.iam.admin.v1;

public interface ServiceAccountKeyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.ServiceAccountKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the service account key in the following format
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the service account key in the following format
   * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The output format for the private key.
   * Only provided in `CreateServiceAccountKey` responses, not
   * in `GetServiceAccountKey` or `ListServiceAccountKey` responses.
   *
   * Google never exposes system-managed private keys, and never retains
   * user-managed private keys.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccountPrivateKeyType private_key_type = 2;</code>
   *
   * @return The enum numeric value on the wire for privateKeyType.
   */
  int getPrivateKeyTypeValue();
  /**
   *
   *
   * <pre>
   * The output format for the private key.
   * Only provided in `CreateServiceAccountKey` responses, not
   * in `GetServiceAccountKey` or `ListServiceAccountKey` responses.
   *
   * Google never exposes system-managed private keys, and never retains
   * user-managed private keys.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccountPrivateKeyType private_key_type = 2;</code>
   *
   * @return The privateKeyType.
   */
  com.google.iam.admin.v1.ServiceAccountPrivateKeyType getPrivateKeyType();

  /**
   *
   *
   * <pre>
   * Specifies the algorithm (and possibly key size) for the key.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccountKeyAlgorithm key_algorithm = 8;</code>
   *
   * @return The enum numeric value on the wire for keyAlgorithm.
   */
  int getKeyAlgorithmValue();
  /**
   *
   *
   * <pre>
   * Specifies the algorithm (and possibly key size) for the key.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccountKeyAlgorithm key_algorithm = 8;</code>
   *
   * @return The keyAlgorithm.
   */
  com.google.iam.admin.v1.ServiceAccountKeyAlgorithm getKeyAlgorithm();

  /**
   *
   *
   * <pre>
   * The private key data. Only provided in `CreateServiceAccountKey`
   * responses. Make sure to keep the private key data secure because it
   * allows for the assertion of the service account identity.
   * When base64 decoded, the private key data can be used to authenticate with
   * Google API client libraries and with
   * &lt;a href="/sdk/gcloud/reference/auth/activate-service-account"&gt;gcloud
   * auth activate-service-account&lt;/a&gt;.
   * </pre>
   *
   * <code>bytes private_key_data = 3;</code>
   *
   * @return The privateKeyData.
   */
  com.google.protobuf.ByteString getPrivateKeyData();

  /**
   *
   *
   * <pre>
   * The public key data. Only provided in `GetServiceAccountKey` responses.
   * </pre>
   *
   * <code>bytes public_key_data = 7;</code>
   *
   * @return The publicKeyData.
   */
  com.google.protobuf.ByteString getPublicKeyData();

  /**
   *
   *
   * <pre>
   * The key can be used after this timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp valid_after_time = 4;</code>
   *
   * @return Whether the validAfterTime field is set.
   */
  boolean hasValidAfterTime();
  /**
   *
   *
   * <pre>
   * The key can be used after this timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp valid_after_time = 4;</code>
   *
   * @return The validAfterTime.
   */
  com.google.protobuf.Timestamp getValidAfterTime();
  /**
   *
   *
   * <pre>
   * The key can be used after this timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp valid_after_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getValidAfterTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The key can be used before this timestamp.
   * For system-managed key pairs, this timestamp is the end time for the
   * private key signing operation. The public key could still be used
   * for verification for a few hours after this time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp valid_before_time = 5;</code>
   *
   * @return Whether the validBeforeTime field is set.
   */
  boolean hasValidBeforeTime();
  /**
   *
   *
   * <pre>
   * The key can be used before this timestamp.
   * For system-managed key pairs, this timestamp is the end time for the
   * private key signing operation. The public key could still be used
   * for verification for a few hours after this time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp valid_before_time = 5;</code>
   *
   * @return The validBeforeTime.
   */
  com.google.protobuf.Timestamp getValidBeforeTime();
  /**
   *
   *
   * <pre>
   * The key can be used before this timestamp.
   * For system-managed key pairs, this timestamp is the end time for the
   * private key signing operation. The public key could still be used
   * for verification for a few hours after this time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp valid_before_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getValidBeforeTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The key origin.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccountKeyOrigin key_origin = 9;</code>
   *
   * @return The enum numeric value on the wire for keyOrigin.
   */
  int getKeyOriginValue();
  /**
   *
   *
   * <pre>
   * The key origin.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ServiceAccountKeyOrigin key_origin = 9;</code>
   *
   * @return The keyOrigin.
   */
  com.google.iam.admin.v1.ServiceAccountKeyOrigin getKeyOrigin();

  /**
   *
   *
   * <pre>
   * The key type.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ListServiceAccountKeysRequest.KeyType key_type = 10;</code>
   *
   * @return The enum numeric value on the wire for keyType.
   */
  int getKeyTypeValue();
  /**
   *
   *
   * <pre>
   * The key type.
   * </pre>
   *
   * <code>.google.iam.admin.v1.ListServiceAccountKeysRequest.KeyType key_type = 10;</code>
   *
   * @return The keyType.
   */
  com.google.iam.admin.v1.ListServiceAccountKeysRequest.KeyType getKeyType();

  /**
   *
   *
   * <pre>
   * The key status.
   * </pre>
   *
   * <code>bool disabled = 11;</code>
   *
   * @return The disabled.
   */
  boolean getDisabled();
}
