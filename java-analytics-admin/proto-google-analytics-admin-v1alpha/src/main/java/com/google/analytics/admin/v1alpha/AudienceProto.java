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
// source: google/analytics/admin/v1alpha/audience.proto

package com.google.analytics.admin.v1alpha;

public final class AudienceProto {
  private AudienceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_StringFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_StringFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_InListFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_InListFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_NumericValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_NumericValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_NumericFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_NumericFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_BetweenFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_BetweenFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_AudienceEventFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_AudienceEventFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_AudienceFilterExpression_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_AudienceFilterExpression_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_AudienceFilterExpressionList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_AudienceFilterExpressionList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_AudienceSimpleFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_AudienceSimpleFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_AudienceSequenceFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_AudienceSequenceFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_AudienceSequenceFilter_AudienceSequenceStep_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_AudienceSequenceFilter_AudienceSequenceStep_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_AudienceFilterClause_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_AudienceFilterClause_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_AudienceEventTrigger_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_AudienceEventTrigger_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_admin_v1alpha_Audience_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_admin_v1alpha_Audience_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/analytics/admin/v1alpha/audienc"
          + "e.proto\022\036google.analytics.admin.v1alpha\032"
          + "\037google/api/field_behavior.proto\032\031google"
          + "/api/resource.proto\032\036google/protobuf/dur"
          + "ation.proto\"\206\014\n\037AudienceDimensionOrMetri"
          + "cFilter\022e\n\rstring_filter\030\002 \001(\0132L.google."
          + "analytics.admin.v1alpha.AudienceDimensio"
          + "nOrMetricFilter.StringFilterH\000\022f\n\016in_lis"
          + "t_filter\030\003 \001(\0132L.google.analytics.admin."
          + "v1alpha.AudienceDimensionOrMetricFilter."
          + "InListFilterH\000\022g\n\016numeric_filter\030\004 \001(\0132M"
          + ".google.analytics.admin.v1alpha.Audience"
          + "DimensionOrMetricFilter.NumericFilterH\000\022"
          + "g\n\016between_filter\030\005 \001(\0132M.google.analyti"
          + "cs.admin.v1alpha.AudienceDimensionOrMetr"
          + "icFilter.BetweenFilterH\000\022\031\n\nfield_name\030\001"
          + " \001(\tB\005\342A\002\002\005\022\"\n\024at_any_point_in_time\030\006 \001("
          + "\010B\004\342A\001\001\022!\n\023in_any_n_day_period\030\007 \001(\005B\004\342A"
          + "\001\001\032\246\002\n\014StringFilter\022p\n\nmatch_type\030\001 \001(\0162"
          + "V.google.analytics.admin.v1alpha.Audienc"
          + "eDimensionOrMetricFilter.StringFilter.Ma"
          + "tchTypeB\004\342A\001\002\022\023\n\005value\030\002 \001(\tB\004\342A\001\002\022\034\n\016ca"
          + "se_sensitive\030\003 \001(\010B\004\342A\001\001\"q\n\tMatchType\022\032\n"
          + "\026MATCH_TYPE_UNSPECIFIED\020\000\022\t\n\005EXACT\020\001\022\017\n\013"
          + "BEGINS_WITH\020\002\022\r\n\tENDS_WITH\020\003\022\014\n\010CONTAINS"
          + "\020\004\022\017\n\013FULL_REGEXP\020\005\032B\n\014InListFilter\022\024\n\006v"
          + "alues\030\001 \003(\tB\004\342A\001\002\022\034\n\016case_sensitive\030\002 \001("
          + "\010B\004\342A\001\001\032J\n\014NumericValue\022\025\n\013int64_value\030\001"
          + " \001(\003H\000\022\026\n\014double_value\030\002 \001(\001H\000B\013\n\tone_va"
          + "lue\032\270\002\n\rNumericFilter\022p\n\toperation\030\001 \001(\016"
          + "2W.google.analytics.admin.v1alpha.Audien"
          + "ceDimensionOrMetricFilter.NumericFilter."
          + "OperationB\004\342A\001\002\022a\n\005value\030\002 \001(\0132L.google."
          + "analytics.admin.v1alpha.AudienceDimensio"
          + "nOrMetricFilter.NumericValueB\004\342A\001\002\"R\n\tOp"
          + "eration\022\031\n\025OPERATION_UNSPECIFIED\020\000\022\t\n\005EQ"
          + "UAL\020\001\022\r\n\tLESS_THAN\020\002\022\020\n\014GREATER_THAN\020\004\032\335"
          + "\001\n\rBetweenFilter\022f\n\nfrom_value\030\001 \001(\0132L.g"
          + "oogle.analytics.admin.v1alpha.AudienceDi"
          + "mensionOrMetricFilter.NumericValueB\004\342A\001\002"
          + "\022d\n\010to_value\030\002 \001(\0132L.google.analytics.ad"
          + "min.v1alpha.AudienceDimensionOrMetricFil"
          + "ter.NumericValueB\004\342A\001\002B\014\n\none_filter\"\233\001\n"
          + "\023AudienceEventFilter\022\031\n\nevent_name\030\001 \001(\t"
          + "B\005\342A\002\002\005\022i\n!event_parameter_filter_expres"
          + "sion\030\002 \001(\01328.google.analytics.admin.v1al"
          + "pha.AudienceFilterExpressionB\004\342A\001\001\"\317\003\n\030A"
          + "udienceFilterExpression\022Q\n\tand_group\030\001 \001"
          + "(\0132<.google.analytics.admin.v1alpha.Audi"
          + "enceFilterExpressionListH\000\022P\n\010or_group\030\002"
          + " \001(\0132<.google.analytics.admin.v1alpha.Au"
          + "dienceFilterExpressionListH\000\022R\n\016not_expr"
          + "ession\030\003 \001(\01328.google.analytics.admin.v1"
          + "alpha.AudienceFilterExpressionH\000\022e\n\032dime"
          + "nsion_or_metric_filter\030\004 \001(\0132?.google.an"
          + "alytics.admin.v1alpha.AudienceDimensionO"
          + "rMetricFilterH\000\022K\n\014event_filter\030\005 \001(\01323."
          + "google.analytics.admin.v1alpha.AudienceE"
          + "ventFilterH\000B\006\n\004expr\"t\n\034AudienceFilterEx"
          + "pressionList\022T\n\022filter_expressions\030\001 \003(\013"
          + "28.google.analytics.admin.v1alpha.Audien"
          + "ceFilterExpression\"\275\001\n\024AudienceSimpleFil"
          + "ter\022I\n\005scope\030\001 \001(\01623.google.analytics.ad"
          + "min.v1alpha.AudienceFilterScopeB\005\342A\002\002\005\022Z"
          + "\n\021filter_expression\030\002 \001(\01328.google.analy"
          + "tics.admin.v1alpha.AudienceFilterExpress"
          + "ionB\005\342A\002\002\005\"\263\004\n\026AudienceSequenceFilter\022I\n"
          + "\005scope\030\001 \001(\01623.google.analytics.admin.v1"
          + "alpha.AudienceFilterScopeB\005\342A\002\002\005\022B\n\031sequ"
          + "ence_maximum_duration\030\002 \001(\0132\031.google.pro"
          + "tobuf.DurationB\004\342A\001\001\022i\n\016sequence_steps\030\003"
          + " \003(\0132K.google.analytics.admin.v1alpha.Au"
          + "dienceSequenceFilter.AudienceSequenceSte"
          + "pB\004\342A\001\002\032\236\002\n\024AudienceSequenceStep\022I\n\005scop"
          + "e\030\001 \001(\01623.google.analytics.admin.v1alpha"
          + ".AudienceFilterScopeB\005\342A\002\002\005\022!\n\023immediate"
          + "ly_follows\030\002 \001(\010B\004\342A\001\001\022<\n\023constraint_dur"
          + "ation\030\003 \001(\0132\031.google.protobuf.DurationB\004"
          + "\342A\001\001\022Z\n\021filter_expression\030\004 \001(\01328.google"
          + ".analytics.admin.v1alpha.AudienceFilterE"
          + "xpressionB\005\342A\002\002\005\"\374\002\n\024AudienceFilterClaus"
          + "e\022M\n\rsimple_filter\030\002 \001(\01324.google.analyt"
          + "ics.admin.v1alpha.AudienceSimpleFilterH\000"
          + "\022Q\n\017sequence_filter\030\003 \001(\01326.google.analy"
          + "tics.admin.v1alpha.AudienceSequenceFilte"
          + "rH\000\022b\n\013clause_type\030\001 \001(\0162G.google.analyt"
          + "ics.admin.v1alpha.AudienceFilterClause.A"
          + "udienceClauseTypeB\004\342A\001\002\"T\n\022AudienceClaus"
          + "eType\022$\n AUDIENCE_CLAUSE_TYPE_UNSPECIFIE"
          + "D\020\000\022\013\n\007INCLUDE\020\001\022\013\n\007EXCLUDE\020\002B\010\n\006filter\""
          + "\365\001\n\024AudienceEventTrigger\022\030\n\nevent_name\030\001"
          + " \001(\tB\004\342A\001\002\022^\n\rlog_condition\030\002 \001(\0162A.goog"
          + "le.analytics.admin.v1alpha.AudienceEvent"
          + "Trigger.LogConditionB\004\342A\001\002\"c\n\014LogConditi"
          + "on\022\035\n\031LOG_CONDITION_UNSPECIFIED\020\000\022\023\n\017AUD"
          + "IENCE_JOINED\020\001\022\037\n\033AUDIENCE_MEMBERSHIP_RE"
          + "NEWED\020\002\"\240\005\n\010Audience\022\022\n\004name\030\001 \001(\tB\004\342A\001\003"
          + "\022\032\n\014display_name\030\002 \001(\tB\004\342A\001\002\022\031\n\013descript"
          + "ion\030\003 \001(\tB\004\342A\001\002\022\'\n\030membership_duration_d"
          + "ays\030\004 \001(\005B\005\342A\002\002\005\022)\n\033ads_personalization_"
          + "enabled\030\005 \001(\010B\004\342A\001\003\022Q\n\revent_trigger\030\006 \001"
          + "(\01324.google.analytics.admin.v1alpha.Audi"
          + "enceEventTriggerB\004\342A\001\001\022m\n\027exclusion_dura"
          + "tion_mode\030\007 \001(\0162F.google.analytics.admin"
          + ".v1alpha.Audience.AudienceExclusionDurat"
          + "ionModeB\004\342A\001\005\022T\n\016filter_clauses\030\010 \003(\01324."
          + "google.analytics.admin.v1alpha.AudienceF"
          + "ilterClauseB\006\342A\003\005\002\006\"\203\001\n\035AudienceExclusio"
          + "nDurationMode\0220\n,AUDIENCE_EXCLUSION_DURA"
          + "TION_MODE_UNSPECIFIED\020\000\022\027\n\023EXCLUDE_TEMPO"
          + "RARILY\020\001\022\027\n\023EXCLUDE_PERMANENTLY\020\002:W\352AT\n&"
          + "analyticsadmin.googleapis.com/Audience\022*"
          + "properties/{property}/audiences/{audienc"
          + "e}*\307\001\n\023AudienceFilterScope\022%\n!AUDIENCE_F"
          + "ILTER_SCOPE_UNSPECIFIED\020\000\022+\n\'AUDIENCE_FI"
          + "LTER_SCOPE_WITHIN_SAME_EVENT\020\001\022-\n)AUDIEN"
          + "CE_FILTER_SCOPE_WITHIN_SAME_SESSION\020\002\022-\n"
          + ")AUDIENCE_FILTER_SCOPE_ACROSS_ALL_SESSIO"
          + "NS\020\003Bu\n\"com.google.analytics.admin.v1alp"
          + "haB\rAudienceProtoP\001Z>cloud.google.com/go"
          + "/analytics/admin/apiv1alpha/adminpb;admi"
          + "npbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_descriptor,
            new java.lang.String[] {
              "StringFilter",
              "InListFilter",
              "NumericFilter",
              "BetweenFilter",
              "FieldName",
              "AtAnyPointInTime",
              "InAnyNDayPeriod",
              "OneFilter",
            });
    internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_StringFilter_descriptor =
        internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_StringFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_StringFilter_descriptor,
            new java.lang.String[] {
              "MatchType", "Value", "CaseSensitive",
            });
    internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_InListFilter_descriptor =
        internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_InListFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_InListFilter_descriptor,
            new java.lang.String[] {
              "Values", "CaseSensitive",
            });
    internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_NumericValue_descriptor =
        internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_NumericValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_NumericValue_descriptor,
            new java.lang.String[] {
              "Int64Value", "DoubleValue", "OneValue",
            });
    internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_NumericFilter_descriptor =
        internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_NumericFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_NumericFilter_descriptor,
            new java.lang.String[] {
              "Operation", "Value",
            });
    internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_BetweenFilter_descriptor =
        internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_BetweenFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_AudienceDimensionOrMetricFilter_BetweenFilter_descriptor,
            new java.lang.String[] {
              "FromValue", "ToValue",
            });
    internal_static_google_analytics_admin_v1alpha_AudienceEventFilter_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_analytics_admin_v1alpha_AudienceEventFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_AudienceEventFilter_descriptor,
            new java.lang.String[] {
              "EventName", "EventParameterFilterExpression",
            });
    internal_static_google_analytics_admin_v1alpha_AudienceFilterExpression_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_analytics_admin_v1alpha_AudienceFilterExpression_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_AudienceFilterExpression_descriptor,
            new java.lang.String[] {
              "AndGroup",
              "OrGroup",
              "NotExpression",
              "DimensionOrMetricFilter",
              "EventFilter",
              "Expr",
            });
    internal_static_google_analytics_admin_v1alpha_AudienceFilterExpressionList_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_analytics_admin_v1alpha_AudienceFilterExpressionList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_AudienceFilterExpressionList_descriptor,
            new java.lang.String[] {
              "FilterExpressions",
            });
    internal_static_google_analytics_admin_v1alpha_AudienceSimpleFilter_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_analytics_admin_v1alpha_AudienceSimpleFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_AudienceSimpleFilter_descriptor,
            new java.lang.String[] {
              "Scope", "FilterExpression",
            });
    internal_static_google_analytics_admin_v1alpha_AudienceSequenceFilter_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_analytics_admin_v1alpha_AudienceSequenceFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_AudienceSequenceFilter_descriptor,
            new java.lang.String[] {
              "Scope", "SequenceMaximumDuration", "SequenceSteps",
            });
    internal_static_google_analytics_admin_v1alpha_AudienceSequenceFilter_AudienceSequenceStep_descriptor =
        internal_static_google_analytics_admin_v1alpha_AudienceSequenceFilter_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_analytics_admin_v1alpha_AudienceSequenceFilter_AudienceSequenceStep_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_AudienceSequenceFilter_AudienceSequenceStep_descriptor,
            new java.lang.String[] {
              "Scope", "ImmediatelyFollows", "ConstraintDuration", "FilterExpression",
            });
    internal_static_google_analytics_admin_v1alpha_AudienceFilterClause_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_analytics_admin_v1alpha_AudienceFilterClause_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_AudienceFilterClause_descriptor,
            new java.lang.String[] {
              "SimpleFilter", "SequenceFilter", "ClauseType", "Filter",
            });
    internal_static_google_analytics_admin_v1alpha_AudienceEventTrigger_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_analytics_admin_v1alpha_AudienceEventTrigger_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_AudienceEventTrigger_descriptor,
            new java.lang.String[] {
              "EventName", "LogCondition",
            });
    internal_static_google_analytics_admin_v1alpha_Audience_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_analytics_admin_v1alpha_Audience_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_admin_v1alpha_Audience_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "MembershipDurationDays",
              "AdsPersonalizationEnabled",
              "EventTrigger",
              "ExclusionDurationMode",
              "FilterClauses",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
