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
// source: google/analytics/admin/v1alpha/resources.proto

package com.google.analytics.admin.v1alpha;

public interface SearchAds360LinkOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.SearchAds360Link)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name for this SearchAds360Link resource.
   * Format: properties/{propertyId}/searchAds360Links/{linkId}
   *
   * Note: linkId is not the Search Ads 360 advertiser ID
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name for this SearchAds360Link resource.
   * Format: properties/{propertyId}/searchAds360Links/{linkId}
   *
   * Note: linkId is not the Search Ads 360 advertiser ID
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Immutable. This field represents the Advertiser ID of the Search Ads 360
   * Advertiser. that has been linked.
   * </pre>
   *
   * <code>string advertiser_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The advertiserId.
   */
  java.lang.String getAdvertiserId();
  /**
   *
   *
   * <pre>
   * Immutable. This field represents the Advertiser ID of the Search Ads 360
   * Advertiser. that has been linked.
   * </pre>
   *
   * <code>string advertiser_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for advertiserId.
   */
  com.google.protobuf.ByteString getAdvertiserIdBytes();

  /**
   *
   *
   * <pre>
   * Immutable. Enables the import of campaign data from Search Ads 360 into the
   * GA4 property. After link creation, this can only be updated from the Search
   * Ads 360 product.
   * If this field is not set on create, it will be defaulted to true.
   * </pre>
   *
   * <code>
   * .google.protobuf.BoolValue campaign_data_sharing_enabled = 3 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the campaignDataSharingEnabled field is set.
   */
  boolean hasCampaignDataSharingEnabled();
  /**
   *
   *
   * <pre>
   * Immutable. Enables the import of campaign data from Search Ads 360 into the
   * GA4 property. After link creation, this can only be updated from the Search
   * Ads 360 product.
   * If this field is not set on create, it will be defaulted to true.
   * </pre>
   *
   * <code>
   * .google.protobuf.BoolValue campaign_data_sharing_enabled = 3 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The campaignDataSharingEnabled.
   */
  com.google.protobuf.BoolValue getCampaignDataSharingEnabled();
  /**
   *
   *
   * <pre>
   * Immutable. Enables the import of campaign data from Search Ads 360 into the
   * GA4 property. After link creation, this can only be updated from the Search
   * Ads 360 product.
   * If this field is not set on create, it will be defaulted to true.
   * </pre>
   *
   * <code>
   * .google.protobuf.BoolValue campaign_data_sharing_enabled = 3 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.protobuf.BoolValueOrBuilder getCampaignDataSharingEnabledOrBuilder();

  /**
   *
   *
   * <pre>
   * Immutable. Enables the import of cost data from Search Ads 360 to the GA4
   * property. This can only be enabled if campaign_data_sharing_enabled is
   * enabled. After link creation, this can only be updated from
   * the Search Ads 360 product.
   * If this field is not set on create, it will be defaulted to true.
   * </pre>
   *
   * <code>
   * .google.protobuf.BoolValue cost_data_sharing_enabled = 4 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the costDataSharingEnabled field is set.
   */
  boolean hasCostDataSharingEnabled();
  /**
   *
   *
   * <pre>
   * Immutable. Enables the import of cost data from Search Ads 360 to the GA4
   * property. This can only be enabled if campaign_data_sharing_enabled is
   * enabled. After link creation, this can only be updated from
   * the Search Ads 360 product.
   * If this field is not set on create, it will be defaulted to true.
   * </pre>
   *
   * <code>
   * .google.protobuf.BoolValue cost_data_sharing_enabled = 4 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The costDataSharingEnabled.
   */
  com.google.protobuf.BoolValue getCostDataSharingEnabled();
  /**
   *
   *
   * <pre>
   * Immutable. Enables the import of cost data from Search Ads 360 to the GA4
   * property. This can only be enabled if campaign_data_sharing_enabled is
   * enabled. After link creation, this can only be updated from
   * the Search Ads 360 product.
   * If this field is not set on create, it will be defaulted to true.
   * </pre>
   *
   * <code>
   * .google.protobuf.BoolValue cost_data_sharing_enabled = 4 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.protobuf.BoolValueOrBuilder getCostDataSharingEnabledOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The display name of the Search Ads 360 Advertiser.
   * Allows users to easily identify the linked resource.
   * </pre>
   *
   * <code>string advertiser_display_name = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The advertiserDisplayName.
   */
  java.lang.String getAdvertiserDisplayName();
  /**
   *
   *
   * <pre>
   * Output only. The display name of the Search Ads 360 Advertiser.
   * Allows users to easily identify the linked resource.
   * </pre>
   *
   * <code>string advertiser_display_name = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for advertiserDisplayName.
   */
  com.google.protobuf.ByteString getAdvertiserDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Enables personalized advertising features with this integration.
   * If this field is not set on create, it will be defaulted to true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue ads_personalization_enabled = 6;</code>
   *
   * @return Whether the adsPersonalizationEnabled field is set.
   */
  boolean hasAdsPersonalizationEnabled();
  /**
   *
   *
   * <pre>
   * Enables personalized advertising features with this integration.
   * If this field is not set on create, it will be defaulted to true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue ads_personalization_enabled = 6;</code>
   *
   * @return The adsPersonalizationEnabled.
   */
  com.google.protobuf.BoolValue getAdsPersonalizationEnabled();
  /**
   *
   *
   * <pre>
   * Enables personalized advertising features with this integration.
   * If this field is not set on create, it will be defaulted to true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue ads_personalization_enabled = 6;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getAdsPersonalizationEnabledOrBuilder();

  /**
   *
   *
   * <pre>
   * Enables export of site stats with this integration.
   * If this field is not set on create, it will be defaulted to true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue site_stats_sharing_enabled = 7;</code>
   *
   * @return Whether the siteStatsSharingEnabled field is set.
   */
  boolean hasSiteStatsSharingEnabled();
  /**
   *
   *
   * <pre>
   * Enables export of site stats with this integration.
   * If this field is not set on create, it will be defaulted to true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue site_stats_sharing_enabled = 7;</code>
   *
   * @return The siteStatsSharingEnabled.
   */
  com.google.protobuf.BoolValue getSiteStatsSharingEnabled();
  /**
   *
   *
   * <pre>
   * Enables export of site stats with this integration.
   * If this field is not set on create, it will be defaulted to true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue site_stats_sharing_enabled = 7;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getSiteStatsSharingEnabledOrBuilder();
}
