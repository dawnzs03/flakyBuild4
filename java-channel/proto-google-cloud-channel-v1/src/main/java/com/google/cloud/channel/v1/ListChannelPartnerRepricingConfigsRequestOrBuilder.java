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
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

public interface ListChannelPartnerRepricingConfigsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.ListChannelPartnerRepricingConfigsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the account's
   * [ChannelPartnerLink][google.cloud.channel.v1.ChannelPartnerLink]. Parent
   * uses the format:
   * accounts/{account_id}/channelPartnerLinks/{channel_partner_id}.
   * Supports accounts/{account_id}/channelPartnerLinks/- to retrieve configs
   * for all channel partners.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the account's
   * [ChannelPartnerLink][google.cloud.channel.v1.ChannelPartnerLink]. Parent
   * uses the format:
   * accounts/{account_id}/channelPartnerLinks/{channel_partner_id}.
   * Supports accounts/{account_id}/channelPartnerLinks/- to retrieve configs
   * for all channel partners.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of repricing configs to return. The service
   * may return fewer than this value. If unspecified, returns a maximum of 50
   * rules. The maximum value is 100; values above 100 will be coerced to 100.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results beyond the first page.
   * Obtained through
   * [ListChannelPartnerRepricingConfigsResponse.next_page_token][google.cloud.channel.v1.ListChannelPartnerRepricingConfigsResponse.next_page_token]
   * of the previous
   * [CloudChannelService.ListChannelPartnerRepricingConfigs][google.cloud.channel.v1.CloudChannelService.ListChannelPartnerRepricingConfigs]
   * call.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results beyond the first page.
   * Obtained through
   * [ListChannelPartnerRepricingConfigsResponse.next_page_token][google.cloud.channel.v1.ListChannelPartnerRepricingConfigsResponse.next_page_token]
   * of the previous
   * [CloudChannelService.ListChannelPartnerRepricingConfigs][google.cloud.channel.v1.CloudChannelService.ListChannelPartnerRepricingConfigs]
   * call.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. A filter for
   * [CloudChannelService.ListChannelPartnerRepricingConfigs] results
   * (channel_partner_link only). You can use this filter when you support a
   * BatchGet-like query. To use the filter, you must set
   * `parent=accounts/{account_id}/channelPartnerLinks/-`.
   *
   * Example: `channel_partner_link =
   * accounts/account_id/channelPartnerLinks/c1` OR `channel_partner_link =
   * accounts/account_id/channelPartnerLinks/c2`.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. A filter for
   * [CloudChannelService.ListChannelPartnerRepricingConfigs] results
   * (channel_partner_link only). You can use this filter when you support a
   * BatchGet-like query. To use the filter, you must set
   * `parent=accounts/{account_id}/channelPartnerLinks/-`.
   *
   * Example: `channel_partner_link =
   * accounts/account_id/channelPartnerLinks/c1` OR `channel_partner_link =
   * accounts/account_id/channelPartnerLinks/c2`.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
