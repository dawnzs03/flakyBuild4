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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface BulkInsertInstanceResourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.BulkInsertInstanceResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The maximum number of instances to create.
   * </pre>
   *
   * <code>optional int64 count = 94851343;</code>
   *
   * @return Whether the count field is set.
   */
  boolean hasCount();
  /**
   *
   *
   * <pre>
   * The maximum number of instances to create.
   * </pre>
   *
   * <code>optional int64 count = 94851343;</code>
   *
   * @return The count.
   */
  long getCount();

  /**
   *
   *
   * <pre>
   * The instance properties defining the VM instances to be created. Required if sourceInstanceTemplate is not provided.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceProperties instance_properties = 215355165;
   * </code>
   *
   * @return Whether the instanceProperties field is set.
   */
  boolean hasInstanceProperties();
  /**
   *
   *
   * <pre>
   * The instance properties defining the VM instances to be created. Required if sourceInstanceTemplate is not provided.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceProperties instance_properties = 215355165;
   * </code>
   *
   * @return The instanceProperties.
   */
  com.google.cloud.compute.v1.InstanceProperties getInstanceProperties();
  /**
   *
   *
   * <pre>
   * The instance properties defining the VM instances to be created. Required if sourceInstanceTemplate is not provided.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceProperties instance_properties = 215355165;
   * </code>
   */
  com.google.cloud.compute.v1.InstancePropertiesOrBuilder getInstancePropertiesOrBuilder();

  /**
   *
   *
   * <pre>
   * Policy for chosing target zone. For more information, see Create VMs in bulk .
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.LocationPolicy location_policy = 465689852;</code>
   *
   * @return Whether the locationPolicy field is set.
   */
  boolean hasLocationPolicy();
  /**
   *
   *
   * <pre>
   * Policy for chosing target zone. For more information, see Create VMs in bulk .
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.LocationPolicy location_policy = 465689852;</code>
   *
   * @return The locationPolicy.
   */
  com.google.cloud.compute.v1.LocationPolicy getLocationPolicy();
  /**
   *
   *
   * <pre>
   * Policy for chosing target zone. For more information, see Create VMs in bulk .
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.LocationPolicy location_policy = 465689852;</code>
   */
  com.google.cloud.compute.v1.LocationPolicyOrBuilder getLocationPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * The minimum number of instances to create. If no min_count is specified then count is used as the default value. If min_count instances cannot be created, then no instances will be created and instances already created will be deleted.
   * </pre>
   *
   * <code>optional int64 min_count = 523228386;</code>
   *
   * @return Whether the minCount field is set.
   */
  boolean hasMinCount();
  /**
   *
   *
   * <pre>
   * The minimum number of instances to create. If no min_count is specified then count is used as the default value. If min_count instances cannot be created, then no instances will be created and instances already created will be deleted.
   * </pre>
   *
   * <code>optional int64 min_count = 523228386;</code>
   *
   * @return The minCount.
   */
  long getMinCount();

  /**
   *
   *
   * <pre>
   * The string pattern used for the names of the VMs. Either name_pattern or per_instance_properties must be set. The pattern must contain one continuous sequence of placeholder hash characters (#) with each character corresponding to one digit of the generated instance name. Example: a name_pattern of inst-#### generates instance names such as inst-0001 and inst-0002. If existing instances in the same project and zone have names that match the name pattern then the generated instance numbers start after the biggest existing number. For example, if there exists an instance with name inst-0050, then instance names generated using the pattern inst-#### begin with inst-0051. The name pattern placeholder #...# can contain up to 18 characters.
   * </pre>
   *
   * <code>optional string name_pattern = 413815260;</code>
   *
   * @return Whether the namePattern field is set.
   */
  boolean hasNamePattern();
  /**
   *
   *
   * <pre>
   * The string pattern used for the names of the VMs. Either name_pattern or per_instance_properties must be set. The pattern must contain one continuous sequence of placeholder hash characters (#) with each character corresponding to one digit of the generated instance name. Example: a name_pattern of inst-#### generates instance names such as inst-0001 and inst-0002. If existing instances in the same project and zone have names that match the name pattern then the generated instance numbers start after the biggest existing number. For example, if there exists an instance with name inst-0050, then instance names generated using the pattern inst-#### begin with inst-0051. The name pattern placeholder #...# can contain up to 18 characters.
   * </pre>
   *
   * <code>optional string name_pattern = 413815260;</code>
   *
   * @return The namePattern.
   */
  java.lang.String getNamePattern();
  /**
   *
   *
   * <pre>
   * The string pattern used for the names of the VMs. Either name_pattern or per_instance_properties must be set. The pattern must contain one continuous sequence of placeholder hash characters (#) with each character corresponding to one digit of the generated instance name. Example: a name_pattern of inst-#### generates instance names such as inst-0001 and inst-0002. If existing instances in the same project and zone have names that match the name pattern then the generated instance numbers start after the biggest existing number. For example, if there exists an instance with name inst-0050, then instance names generated using the pattern inst-#### begin with inst-0051. The name pattern placeholder #...# can contain up to 18 characters.
   * </pre>
   *
   * <code>optional string name_pattern = 413815260;</code>
   *
   * @return The bytes for namePattern.
   */
  com.google.protobuf.ByteString getNamePatternBytes();

  /**
   *
   *
   * <pre>
   * Per-instance properties to be set on individual instances. Keys of this map specify requested instance names. Can be empty if name_pattern is used.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties&gt; per_instance_properties = 108502267;
   * </code>
   */
  int getPerInstancePropertiesCount();
  /**
   *
   *
   * <pre>
   * Per-instance properties to be set on individual instances. Keys of this map specify requested instance names. Can be empty if name_pattern is used.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties&gt; per_instance_properties = 108502267;
   * </code>
   */
  boolean containsPerInstanceProperties(java.lang.String key);
  /** Use {@link #getPerInstancePropertiesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String,
          com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties>
      getPerInstanceProperties();
  /**
   *
   *
   * <pre>
   * Per-instance properties to be set on individual instances. Keys of this map specify requested instance names. Can be empty if name_pattern is used.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties&gt; per_instance_properties = 108502267;
   * </code>
   */
  java.util.Map<
          java.lang.String,
          com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties>
      getPerInstancePropertiesMap();
  /**
   *
   *
   * <pre>
   * Per-instance properties to be set on individual instances. Keys of this map specify requested instance names. Can be empty if name_pattern is used.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties&gt; per_instance_properties = 108502267;
   * </code>
   */
  /* nullable */
  com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties
      getPerInstancePropertiesOrDefault(
          java.lang.String key,
          /* nullable */
          com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties defaultValue);
  /**
   *
   *
   * <pre>
   * Per-instance properties to be set on individual instances. Keys of this map specify requested instance names. Can be empty if name_pattern is used.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties&gt; per_instance_properties = 108502267;
   * </code>
   */
  com.google.cloud.compute.v1.BulkInsertInstanceResourcePerInstanceProperties
      getPerInstancePropertiesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Specifies the instance template from which to create instances. You may combine sourceInstanceTemplate with instanceProperties to override specific values from an existing instance template. Bulk API follows the semantics of JSON Merge Patch described by RFC 7396. It can be a full or partial URL. For example, the following are all valid URLs to an instance template: - https://www.googleapis.com/compute/v1/projects/project /global/instanceTemplates/instanceTemplate - projects/project/global/instanceTemplates/instanceTemplate - global/instanceTemplates/instanceTemplate This field is optional.
   * </pre>
   *
   * <code>optional string source_instance_template = 332423616;</code>
   *
   * @return Whether the sourceInstanceTemplate field is set.
   */
  boolean hasSourceInstanceTemplate();
  /**
   *
   *
   * <pre>
   * Specifies the instance template from which to create instances. You may combine sourceInstanceTemplate with instanceProperties to override specific values from an existing instance template. Bulk API follows the semantics of JSON Merge Patch described by RFC 7396. It can be a full or partial URL. For example, the following are all valid URLs to an instance template: - https://www.googleapis.com/compute/v1/projects/project /global/instanceTemplates/instanceTemplate - projects/project/global/instanceTemplates/instanceTemplate - global/instanceTemplates/instanceTemplate This field is optional.
   * </pre>
   *
   * <code>optional string source_instance_template = 332423616;</code>
   *
   * @return The sourceInstanceTemplate.
   */
  java.lang.String getSourceInstanceTemplate();
  /**
   *
   *
   * <pre>
   * Specifies the instance template from which to create instances. You may combine sourceInstanceTemplate with instanceProperties to override specific values from an existing instance template. Bulk API follows the semantics of JSON Merge Patch described by RFC 7396. It can be a full or partial URL. For example, the following are all valid URLs to an instance template: - https://www.googleapis.com/compute/v1/projects/project /global/instanceTemplates/instanceTemplate - projects/project/global/instanceTemplates/instanceTemplate - global/instanceTemplates/instanceTemplate This field is optional.
   * </pre>
   *
   * <code>optional string source_instance_template = 332423616;</code>
   *
   * @return The bytes for sourceInstanceTemplate.
   */
  com.google.protobuf.ByteString getSourceInstanceTemplateBytes();
}
