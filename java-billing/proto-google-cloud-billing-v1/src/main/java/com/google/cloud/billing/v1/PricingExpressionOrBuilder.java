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
// source: google/cloud/billing/v1/cloud_catalog.proto

package com.google.cloud.billing.v1;

public interface PricingExpressionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.v1.PricingExpression)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The short hand for unit of usage this pricing is specified in.
   * Example: usage_unit of "GiBy" means that usage is specified in "Gibi Byte".
   * </pre>
   *
   * <code>string usage_unit = 1;</code>
   *
   * @return The usageUnit.
   */
  java.lang.String getUsageUnit();
  /**
   *
   *
   * <pre>
   * The short hand for unit of usage this pricing is specified in.
   * Example: usage_unit of "GiBy" means that usage is specified in "Gibi Byte".
   * </pre>
   *
   * <code>string usage_unit = 1;</code>
   *
   * @return The bytes for usageUnit.
   */
  com.google.protobuf.ByteString getUsageUnitBytes();

  /**
   *
   *
   * <pre>
   * The recommended quantity of units for displaying pricing info. When
   * displaying pricing info it is recommended to display:
   * (unit_price * display_quantity) per display_quantity usage_unit.
   * This field does not affect the pricing formula and is for display purposes
   * only.
   * Example: If the unit_price is "0.0001 USD", the usage_unit is "GB" and
   * the display_quantity is "1000" then the recommended way of displaying the
   * pricing info is "0.10 USD per 1000 GB"
   * </pre>
   *
   * <code>double display_quantity = 2;</code>
   *
   * @return The displayQuantity.
   */
  double getDisplayQuantity();

  /**
   *
   *
   * <pre>
   * The list of tiered rates for this pricing. The total cost is computed by
   * applying each of the tiered rates on usage. This repeated list is sorted
   * by ascending order of start_usage_amount.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.v1.PricingExpression.TierRate tiered_rates = 3;</code>
   */
  java.util.List<com.google.cloud.billing.v1.PricingExpression.TierRate> getTieredRatesList();
  /**
   *
   *
   * <pre>
   * The list of tiered rates for this pricing. The total cost is computed by
   * applying each of the tiered rates on usage. This repeated list is sorted
   * by ascending order of start_usage_amount.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.v1.PricingExpression.TierRate tiered_rates = 3;</code>
   */
  com.google.cloud.billing.v1.PricingExpression.TierRate getTieredRates(int index);
  /**
   *
   *
   * <pre>
   * The list of tiered rates for this pricing. The total cost is computed by
   * applying each of the tiered rates on usage. This repeated list is sorted
   * by ascending order of start_usage_amount.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.v1.PricingExpression.TierRate tiered_rates = 3;</code>
   */
  int getTieredRatesCount();
  /**
   *
   *
   * <pre>
   * The list of tiered rates for this pricing. The total cost is computed by
   * applying each of the tiered rates on usage. This repeated list is sorted
   * by ascending order of start_usage_amount.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.v1.PricingExpression.TierRate tiered_rates = 3;</code>
   */
  java.util.List<? extends com.google.cloud.billing.v1.PricingExpression.TierRateOrBuilder>
      getTieredRatesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of tiered rates for this pricing. The total cost is computed by
   * applying each of the tiered rates on usage. This repeated list is sorted
   * by ascending order of start_usage_amount.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.v1.PricingExpression.TierRate tiered_rates = 3;</code>
   */
  com.google.cloud.billing.v1.PricingExpression.TierRateOrBuilder getTieredRatesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The unit of usage in human readable form.
   * Example: "gibi byte".
   * </pre>
   *
   * <code>string usage_unit_description = 4;</code>
   *
   * @return The usageUnitDescription.
   */
  java.lang.String getUsageUnitDescription();
  /**
   *
   *
   * <pre>
   * The unit of usage in human readable form.
   * Example: "gibi byte".
   * </pre>
   *
   * <code>string usage_unit_description = 4;</code>
   *
   * @return The bytes for usageUnitDescription.
   */
  com.google.protobuf.ByteString getUsageUnitDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The base unit for the SKU which is the unit used in usage exports.
   * Example: "By"
   * </pre>
   *
   * <code>string base_unit = 5;</code>
   *
   * @return The baseUnit.
   */
  java.lang.String getBaseUnit();
  /**
   *
   *
   * <pre>
   * The base unit for the SKU which is the unit used in usage exports.
   * Example: "By"
   * </pre>
   *
   * <code>string base_unit = 5;</code>
   *
   * @return The bytes for baseUnit.
   */
  com.google.protobuf.ByteString getBaseUnitBytes();

  /**
   *
   *
   * <pre>
   * The base unit in human readable form.
   * Example: "byte".
   * </pre>
   *
   * <code>string base_unit_description = 6;</code>
   *
   * @return The baseUnitDescription.
   */
  java.lang.String getBaseUnitDescription();
  /**
   *
   *
   * <pre>
   * The base unit in human readable form.
   * Example: "byte".
   * </pre>
   *
   * <code>string base_unit_description = 6;</code>
   *
   * @return The bytes for baseUnitDescription.
   */
  com.google.protobuf.ByteString getBaseUnitDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Conversion factor for converting from price per usage_unit to price per
   * base_unit, and start_usage_amount to start_usage_amount in base_unit.
   * unit_price / base_unit_conversion_factor = price per base_unit.
   * start_usage_amount * base_unit_conversion_factor = start_usage_amount in
   * base_unit.
   * </pre>
   *
   * <code>double base_unit_conversion_factor = 7;</code>
   *
   * @return The baseUnitConversionFactor.
   */
  double getBaseUnitConversionFactor();
}
