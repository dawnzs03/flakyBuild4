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
// source: google/cloud/asset/v1/assets.proto

package com.google.cloud.asset.v1;

public interface AttachedResourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.AttachedResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The type of this attached resource.
   *
   * Example: `osconfig.googleapis.com/Inventory`
   *
   * You can find the supported attached asset types of each resource in this
   * table:
   * `https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types`
   * </pre>
   *
   * <code>string asset_type = 1;</code>
   *
   * @return The assetType.
   */
  java.lang.String getAssetType();
  /**
   *
   *
   * <pre>
   * The type of this attached resource.
   *
   * Example: `osconfig.googleapis.com/Inventory`
   *
   * You can find the supported attached asset types of each resource in this
   * table:
   * `https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types`
   * </pre>
   *
   * <code>string asset_type = 1;</code>
   *
   * @return The bytes for assetType.
   */
  com.google.protobuf.ByteString getAssetTypeBytes();

  /**
   *
   *
   * <pre>
   * Versioned resource representations of this attached resource. This is
   * repeated because there could be multiple versions of the attached resource
   * representations during version migration.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.VersionedResource versioned_resources = 3;</code>
   */
  java.util.List<com.google.cloud.asset.v1.VersionedResource> getVersionedResourcesList();
  /**
   *
   *
   * <pre>
   * Versioned resource representations of this attached resource. This is
   * repeated because there could be multiple versions of the attached resource
   * representations during version migration.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.VersionedResource versioned_resources = 3;</code>
   */
  com.google.cloud.asset.v1.VersionedResource getVersionedResources(int index);
  /**
   *
   *
   * <pre>
   * Versioned resource representations of this attached resource. This is
   * repeated because there could be multiple versions of the attached resource
   * representations during version migration.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.VersionedResource versioned_resources = 3;</code>
   */
  int getVersionedResourcesCount();
  /**
   *
   *
   * <pre>
   * Versioned resource representations of this attached resource. This is
   * repeated because there could be multiple versions of the attached resource
   * representations during version migration.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.VersionedResource versioned_resources = 3;</code>
   */
  java.util.List<? extends com.google.cloud.asset.v1.VersionedResourceOrBuilder>
      getVersionedResourcesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Versioned resource representations of this attached resource. This is
   * repeated because there could be multiple versions of the attached resource
   * representations during version migration.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.VersionedResource versioned_resources = 3;</code>
   */
  com.google.cloud.asset.v1.VersionedResourceOrBuilder getVersionedResourcesOrBuilder(int index);
}
