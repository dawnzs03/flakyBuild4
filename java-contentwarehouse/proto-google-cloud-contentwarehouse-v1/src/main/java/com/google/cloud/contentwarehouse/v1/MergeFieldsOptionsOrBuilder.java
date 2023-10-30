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
// source: google/cloud/contentwarehouse/v1/common.proto

package com.google.cloud.contentwarehouse.v1;

public interface MergeFieldsOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.MergeFieldsOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * When merging message fields, the default behavior is to merge
   * the content of two message fields together. If you instead want to use
   * the field from the source message to replace the corresponding field in
   * the destination message, set this flag to true. When this flag is set,
   * specified submessage fields that are missing in source will be cleared in
   * destination.
   * </pre>
   *
   * <code>optional bool replace_message_fields = 1;</code>
   *
   * @return Whether the replaceMessageFields field is set.
   */
  boolean hasReplaceMessageFields();
  /**
   *
   *
   * <pre>
   * When merging message fields, the default behavior is to merge
   * the content of two message fields together. If you instead want to use
   * the field from the source message to replace the corresponding field in
   * the destination message, set this flag to true. When this flag is set,
   * specified submessage fields that are missing in source will be cleared in
   * destination.
   * </pre>
   *
   * <code>optional bool replace_message_fields = 1;</code>
   *
   * @return The replaceMessageFields.
   */
  boolean getReplaceMessageFields();

  /**
   *
   *
   * <pre>
   * When merging repeated fields, the default behavior is to append
   * entries from the source repeated field to the destination repeated field.
   * If you instead want to keep only the entries from the source repeated
   * field, set this flag to true.
   *
   * If you want to replace a repeated field within a message field on the
   * destination message, you must set both replace_repeated_fields and
   * replace_message_fields to true, otherwise the repeated fields will be
   * appended.
   * </pre>
   *
   * <code>optional bool replace_repeated_fields = 2;</code>
   *
   * @return Whether the replaceRepeatedFields field is set.
   */
  boolean hasReplaceRepeatedFields();
  /**
   *
   *
   * <pre>
   * When merging repeated fields, the default behavior is to append
   * entries from the source repeated field to the destination repeated field.
   * If you instead want to keep only the entries from the source repeated
   * field, set this flag to true.
   *
   * If you want to replace a repeated field within a message field on the
   * destination message, you must set both replace_repeated_fields and
   * replace_message_fields to true, otherwise the repeated fields will be
   * appended.
   * </pre>
   *
   * <code>optional bool replace_repeated_fields = 2;</code>
   *
   * @return The replaceRepeatedFields.
   */
  boolean getReplaceRepeatedFields();
}
