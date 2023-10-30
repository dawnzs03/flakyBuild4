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
// source: google/cloud/translate/v3/translation_service.proto

package com.google.cloud.translate.v3;

public interface TranslateTextResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.TranslateTextResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Text translation responses with no glossary applied.
   * This field has the same length as
   * [`contents`][google.cloud.translation.v3.TranslateTextRequest.contents].
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.Translation translations = 1;</code>
   */
  java.util.List<com.google.cloud.translate.v3.Translation> getTranslationsList();
  /**
   *
   *
   * <pre>
   * Text translation responses with no glossary applied.
   * This field has the same length as
   * [`contents`][google.cloud.translation.v3.TranslateTextRequest.contents].
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.Translation translations = 1;</code>
   */
  com.google.cloud.translate.v3.Translation getTranslations(int index);
  /**
   *
   *
   * <pre>
   * Text translation responses with no glossary applied.
   * This field has the same length as
   * [`contents`][google.cloud.translation.v3.TranslateTextRequest.contents].
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.Translation translations = 1;</code>
   */
  int getTranslationsCount();
  /**
   *
   *
   * <pre>
   * Text translation responses with no glossary applied.
   * This field has the same length as
   * [`contents`][google.cloud.translation.v3.TranslateTextRequest.contents].
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.Translation translations = 1;</code>
   */
  java.util.List<? extends com.google.cloud.translate.v3.TranslationOrBuilder>
      getTranslationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Text translation responses with no glossary applied.
   * This field has the same length as
   * [`contents`][google.cloud.translation.v3.TranslateTextRequest.contents].
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.Translation translations = 1;</code>
   */
  com.google.cloud.translate.v3.TranslationOrBuilder getTranslationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Text translation responses if a glossary is provided in the request.
   * This can be the same as
   * [`translations`][google.cloud.translation.v3.TranslateTextResponse.translations]
   * if no terms apply. This field has the same length as
   * [`contents`][google.cloud.translation.v3.TranslateTextRequest.contents].
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.Translation glossary_translations = 3;</code>
   */
  java.util.List<com.google.cloud.translate.v3.Translation> getGlossaryTranslationsList();
  /**
   *
   *
   * <pre>
   * Text translation responses if a glossary is provided in the request.
   * This can be the same as
   * [`translations`][google.cloud.translation.v3.TranslateTextResponse.translations]
   * if no terms apply. This field has the same length as
   * [`contents`][google.cloud.translation.v3.TranslateTextRequest.contents].
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.Translation glossary_translations = 3;</code>
   */
  com.google.cloud.translate.v3.Translation getGlossaryTranslations(int index);
  /**
   *
   *
   * <pre>
   * Text translation responses if a glossary is provided in the request.
   * This can be the same as
   * [`translations`][google.cloud.translation.v3.TranslateTextResponse.translations]
   * if no terms apply. This field has the same length as
   * [`contents`][google.cloud.translation.v3.TranslateTextRequest.contents].
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.Translation glossary_translations = 3;</code>
   */
  int getGlossaryTranslationsCount();
  /**
   *
   *
   * <pre>
   * Text translation responses if a glossary is provided in the request.
   * This can be the same as
   * [`translations`][google.cloud.translation.v3.TranslateTextResponse.translations]
   * if no terms apply. This field has the same length as
   * [`contents`][google.cloud.translation.v3.TranslateTextRequest.contents].
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.Translation glossary_translations = 3;</code>
   */
  java.util.List<? extends com.google.cloud.translate.v3.TranslationOrBuilder>
      getGlossaryTranslationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Text translation responses if a glossary is provided in the request.
   * This can be the same as
   * [`translations`][google.cloud.translation.v3.TranslateTextResponse.translations]
   * if no terms apply. This field has the same length as
   * [`contents`][google.cloud.translation.v3.TranslateTextRequest.contents].
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.Translation glossary_translations = 3;</code>
   */
  com.google.cloud.translate.v3.TranslationOrBuilder getGlossaryTranslationsOrBuilder(int index);
}
