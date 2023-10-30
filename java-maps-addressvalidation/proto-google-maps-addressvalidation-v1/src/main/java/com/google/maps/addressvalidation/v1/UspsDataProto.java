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
// source: google/maps/addressvalidation/v1/usps_data.proto

package com.google.maps.addressvalidation.v1;

public final class UspsDataProto {
  private UspsDataProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_addressvalidation_v1_UspsAddress_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_addressvalidation_v1_UspsAddress_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_addressvalidation_v1_UspsData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_addressvalidation_v1_UspsData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/maps/addressvalidation/v1/usps_"
          + "data.proto\022 google.maps.addressvalidatio"
          + "n.v1\"\332\001\n\013UspsAddress\022\032\n\022first_address_li"
          + "ne\030\001 \001(\t\022\014\n\004firm\030\002 \001(\t\022\033\n\023second_address"
          + "_line\030\003 \001(\t\022\024\n\014urbanization\030\004 \001(\t\022#\n\033cit"
          + "y_state_zip_address_line\030\005 \001(\t\022\014\n\004city\030\006"
          + " \001(\t\022\r\n\005state\030\007 \001(\t\022\020\n\010zip_code\030\010 \001(\t\022\032\n"
          + "\022zip_code_extension\030\t \001(\t\"\374\005\n\010UspsData\022K"
          + "\n\024standardized_address\030\001 \001(\0132-.google.ma"
          + "ps.addressvalidation.v1.UspsAddress\022\033\n\023d"
          + "elivery_point_code\030\002 \001(\t\022\"\n\032delivery_poi"
          + "nt_check_digit\030\003 \001(\t\022\030\n\020dpv_confirmation"
          + "\030\004 \001(\t\022\024\n\014dpv_footnote\030\005 \001(\t\022\020\n\010dpv_cmra"
          + "\030\006 \001(\t\022\022\n\ndpv_vacant\030\007 \001(\t\022\023\n\013dpv_no_sta"
          + "t\030\010 \001(\t\022\025\n\rcarrier_route\030\t \001(\t\022\037\n\027carrie"
          + "r_route_indicator\030\n \001(\t\022\024\n\014ews_no_match\030"
          + "\013 \001(\010\022\030\n\020post_office_city\030\014 \001(\t\022\031\n\021post_"
          + "office_state\030\r \001(\t\022\030\n\020abbreviated_city\030\016"
          + " \001(\t\022\030\n\020fips_county_code\030\017 \001(\t\022\016\n\006county"
          + "\030\020 \001(\t\022\023\n\013elot_number\030\021 \001(\t\022\021\n\telot_flag"
          + "\030\022 \001(\t\022\035\n\025lacs_link_return_code\030\023 \001(\t\022\033\n"
          + "\023lacs_link_indicator\030\024 \001(\t\022\037\n\027po_box_onl"
          + "y_postal_code\030\025 \001(\010\022\032\n\022suitelink_footnot"
          + "e\030\026 \001(\t\022\026\n\016pmb_designator\030\027 \001(\t\022\022\n\npmb_n"
          + "umber\030\030 \001(\t\022\033\n\023address_record_type\030\031 \001(\t"
          + "\022\027\n\017default_address\030\032 \001(\010\022\025\n\rerror_messa"
          + "ge\030\033 \001(\t\022\026\n\016cass_processed\030\034 \001(\010B\212\002\n$com"
          + ".google.maps.addressvalidation.v1B\rUspsD"
          + "ataProtoP\001ZXcloud.google.com/go/maps/add"
          + "ressvalidation/apiv1/addressvalidationpb"
          + ";addressvalidationpb\370\001\001\242\002\007GMPAVV1\252\002 Goog"
          + "le.Maps.AddressValidation.V1\312\002 Google\\Ma"
          + "ps\\AddressValidation\\V1\352\002#Google::Maps::"
          + "AddressValidation::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_maps_addressvalidation_v1_UspsAddress_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_maps_addressvalidation_v1_UspsAddress_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_addressvalidation_v1_UspsAddress_descriptor,
            new java.lang.String[] {
              "FirstAddressLine",
              "Firm",
              "SecondAddressLine",
              "Urbanization",
              "CityStateZipAddressLine",
              "City",
              "State",
              "ZipCode",
              "ZipCodeExtension",
            });
    internal_static_google_maps_addressvalidation_v1_UspsData_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_maps_addressvalidation_v1_UspsData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_addressvalidation_v1_UspsData_descriptor,
            new java.lang.String[] {
              "StandardizedAddress",
              "DeliveryPointCode",
              "DeliveryPointCheckDigit",
              "DpvConfirmation",
              "DpvFootnote",
              "DpvCmra",
              "DpvVacant",
              "DpvNoStat",
              "CarrierRoute",
              "CarrierRouteIndicator",
              "EwsNoMatch",
              "PostOfficeCity",
              "PostOfficeState",
              "AbbreviatedCity",
              "FipsCountyCode",
              "County",
              "ElotNumber",
              "ElotFlag",
              "LacsLinkReturnCode",
              "LacsLinkIndicator",
              "PoBoxOnlyPostalCode",
              "SuitelinkFootnote",
              "PmbDesignator",
              "PmbNumber",
              "AddressRecordType",
              "DefaultAddress",
              "ErrorMessage",
              "CassProcessed",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
