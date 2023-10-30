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
// source: google/cloud/privatecatalog/v1beta1/private_catalog.proto

package com.google.cloud.privatecatalog.v1beta1;

public interface AssetReferenceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.privatecatalog.v1beta1.AssetReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. A unique identifier among asset references in a product.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Output only. A unique identifier among asset references in a product.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The human-readable description of the referenced asset. Maximum 256
   * characters in length.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Output only. The human-readable description of the referenced asset. Maximum 256
   * characters in length.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The definition of input parameters to hydrate the asset template.
   * </pre>
   *
   * <code>
   * .google.cloud.privatecatalog.v1beta1.Inputs inputs = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the inputs field is set.
   */
  boolean hasInputs();
  /**
   *
   *
   * <pre>
   * Output only. The definition of input parameters to hydrate the asset template.
   * </pre>
   *
   * <code>
   * .google.cloud.privatecatalog.v1beta1.Inputs inputs = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The inputs.
   */
  com.google.cloud.privatecatalog.v1beta1.Inputs getInputs();
  /**
   *
   *
   * <pre>
   * Output only. The definition of input parameters to hydrate the asset template.
   * </pre>
   *
   * <code>
   * .google.cloud.privatecatalog.v1beta1.Inputs inputs = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.privatecatalog.v1beta1.InputsOrBuilder getInputsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The current state of the asset reference.
   * </pre>
   *
   * <code>
   * .google.cloud.privatecatalog.v1beta1.AssetReference.AssetValidationState validation_status = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for validationStatus.
   */
  int getValidationStatusValue();
  /**
   *
   *
   * <pre>
   * Output only. The current state of the asset reference.
   * </pre>
   *
   * <code>
   * .google.cloud.privatecatalog.v1beta1.AssetReference.AssetValidationState validation_status = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The validationStatus.
   */
  com.google.cloud.privatecatalog.v1beta1.AssetReference.AssetValidationState getValidationStatus();

  /**
   *
   *
   * <pre>
   * Output only. The validation process metadata.
   * </pre>
   *
   * <code>
   * .google.longrunning.Operation validation_operation = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the validationOperation field is set.
   */
  boolean hasValidationOperation();
  /**
   *
   *
   * <pre>
   * Output only. The validation process metadata.
   * </pre>
   *
   * <code>
   * .google.longrunning.Operation validation_operation = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The validationOperation.
   */
  com.google.longrunning.Operation getValidationOperation();
  /**
   *
   *
   * <pre>
   * Output only. The validation process metadata.
   * </pre>
   *
   * <code>
   * .google.longrunning.Operation validation_operation = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.longrunning.OperationOrBuilder getValidationOperationOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The asset resource name if an asset is hosted by Private Catalog.
   * </pre>
   *
   * <code>string asset = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the asset field is set.
   */
  boolean hasAsset();
  /**
   *
   *
   * <pre>
   * Output only. The asset resource name if an asset is hosted by Private Catalog.
   * </pre>
   *
   * <code>string asset = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The asset.
   */
  java.lang.String getAsset();
  /**
   *
   *
   * <pre>
   * Output only. The asset resource name if an asset is hosted by Private Catalog.
   * </pre>
   *
   * <code>string asset = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for asset.
   */
  com.google.protobuf.ByteString getAssetBytes();

  /**
   *
   *
   * <pre>
   * Output only. The cloud storage object path.
   * </pre>
   *
   * <code>string gcs_path = 11 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @deprecated google.cloud.privatecatalog.v1beta1.AssetReference.gcs_path is deprecated. See
   *     google/cloud/privatecatalog/v1beta1/private_catalog.proto;l=461
   * @return Whether the gcsPath field is set.
   */
  @java.lang.Deprecated
  boolean hasGcsPath();
  /**
   *
   *
   * <pre>
   * Output only. The cloud storage object path.
   * </pre>
   *
   * <code>string gcs_path = 11 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @deprecated google.cloud.privatecatalog.v1beta1.AssetReference.gcs_path is deprecated. See
   *     google/cloud/privatecatalog/v1beta1/private_catalog.proto;l=461
   * @return The gcsPath.
   */
  @java.lang.Deprecated
  java.lang.String getGcsPath();
  /**
   *
   *
   * <pre>
   * Output only. The cloud storage object path.
   * </pre>
   *
   * <code>string gcs_path = 11 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @deprecated google.cloud.privatecatalog.v1beta1.AssetReference.gcs_path is deprecated. See
   *     google/cloud/privatecatalog/v1beta1/private_catalog.proto;l=461
   * @return The bytes for gcsPath.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getGcsPathBytes();

  /**
   *
   *
   * <pre>
   * Output only. The git source.
   * </pre>
   *
   * <code>
   * .google.cloud.privatecatalog.v1beta1.GitSource git_source = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the gitSource field is set.
   */
  boolean hasGitSource();
  /**
   *
   *
   * <pre>
   * Output only. The git source.
   * </pre>
   *
   * <code>
   * .google.cloud.privatecatalog.v1beta1.GitSource git_source = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The gitSource.
   */
  com.google.cloud.privatecatalog.v1beta1.GitSource getGitSource();
  /**
   *
   *
   * <pre>
   * Output only. The git source.
   * </pre>
   *
   * <code>
   * .google.cloud.privatecatalog.v1beta1.GitSource git_source = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.privatecatalog.v1beta1.GitSourceOrBuilder getGitSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The cloud storage source.
   * </pre>
   *
   * <code>
   * .google.cloud.privatecatalog.v1beta1.GcsSource gcs_source = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * Output only. The cloud storage source.
   * </pre>
   *
   * <code>
   * .google.cloud.privatecatalog.v1beta1.GcsSource gcs_source = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The gcsSource.
   */
  com.google.cloud.privatecatalog.v1beta1.GcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * Output only. The cloud storage source.
   * </pre>
   *
   * <code>
   * .google.cloud.privatecatalog.v1beta1.GcsSource gcs_source = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.privatecatalog.v1beta1.GcsSourceOrBuilder getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of the asset reference.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of the asset reference.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of the asset reference.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of the asset reference.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of the asset reference.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of the asset reference.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The version of the source used for this asset reference.
   * </pre>
   *
   * <code>string version = 14 [deprecated = true];</code>
   *
   * @deprecated google.cloud.privatecatalog.v1beta1.AssetReference.version is deprecated. See
   *     google/cloud/privatecatalog/v1beta1/private_catalog.proto;l=480
   * @return The version.
   */
  @java.lang.Deprecated
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * The version of the source used for this asset reference.
   * </pre>
   *
   * <code>string version = 14 [deprecated = true];</code>
   *
   * @deprecated google.cloud.privatecatalog.v1beta1.AssetReference.version is deprecated. See
   *     google/cloud/privatecatalog/v1beta1/private_catalog.proto;l=480
   * @return The bytes for version.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getVersionBytes();

  com.google.cloud.privatecatalog.v1beta1.AssetReference.SourceCase getSourceCase();
}
