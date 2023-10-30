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
// source: google/cloud/datacatalog/v1/datacatalog.proto

package com.google.cloud.datacatalog.v1;

public interface UpdateTagTemplateFieldRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.UpdateTagTemplateFieldRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the tag template field.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the tag template field.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The template to update.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.TagTemplateField tag_template_field = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the tagTemplateField field is set.
   */
  boolean hasTagTemplateField();
  /**
   *
   *
   * <pre>
   * Required. The template to update.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.TagTemplateField tag_template_field = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The tagTemplateField.
   */
  com.google.cloud.datacatalog.v1.TagTemplateField getTagTemplateField();
  /**
   *
   *
   * <pre>
   * Required. The template to update.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.TagTemplateField tag_template_field = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.v1.TagTemplateFieldOrBuilder getTagTemplateFieldOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Names of fields whose values to overwrite on an individual field
   * of a tag template. The following fields are modifiable:
   *
   * * `display_name`
   * * `type.enum_type`
   * * `is_required`
   *
   * If this parameter is absent or empty, all modifiable fields
   * are overwritten. If such fields are non-required and omitted in the request
   * body, their values are emptied with one exception: when updating an enum
   * type, the provided values are merged with the existing values. Therefore,
   * enum values can only be added, existing enum values cannot be deleted or
   * renamed.
   *
   * Additionally, updating a template field from optional to required is
   * *not* allowed.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Names of fields whose values to overwrite on an individual field
   * of a tag template. The following fields are modifiable:
   *
   * * `display_name`
   * * `type.enum_type`
   * * `is_required`
   *
   * If this parameter is absent or empty, all modifiable fields
   * are overwritten. If such fields are non-required and omitted in the request
   * body, their values are emptied with one exception: when updating an enum
   * type, the provided values are merged with the existing values. Therefore,
   * enum values can only be added, existing enum values cannot be deleted or
   * renamed.
   *
   * Additionally, updating a template field from optional to required is
   * *not* allowed.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Names of fields whose values to overwrite on an individual field
   * of a tag template. The following fields are modifiable:
   *
   * * `display_name`
   * * `type.enum_type`
   * * `is_required`
   *
   * If this parameter is absent or empty, all modifiable fields
   * are overwritten. If such fields are non-required and omitted in the request
   * body, their values are emptied with one exception: when updating an enum
   * type, the provided values are merged with the existing values. Therefore,
   * enum values can only be added, existing enum values cannot be deleted or
   * renamed.
   *
   * Additionally, updating a template field from optional to required is
   * *not* allowed.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
