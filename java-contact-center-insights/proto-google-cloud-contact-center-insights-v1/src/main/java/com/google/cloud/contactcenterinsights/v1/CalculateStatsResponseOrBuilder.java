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
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

package com.google.cloud.contactcenterinsights.v1;

public interface CalculateStatsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.CalculateStatsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The average duration of all conversations. The average is calculated using
   * only conversations that have a time duration.
   * </pre>
   *
   * <code>.google.protobuf.Duration average_duration = 1;</code>
   *
   * @return Whether the averageDuration field is set.
   */
  boolean hasAverageDuration();
  /**
   *
   *
   * <pre>
   * The average duration of all conversations. The average is calculated using
   * only conversations that have a time duration.
   * </pre>
   *
   * <code>.google.protobuf.Duration average_duration = 1;</code>
   *
   * @return The averageDuration.
   */
  com.google.protobuf.Duration getAverageDuration();
  /**
   *
   *
   * <pre>
   * The average duration of all conversations. The average is calculated using
   * only conversations that have a time duration.
   * </pre>
   *
   * <code>.google.protobuf.Duration average_duration = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getAverageDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * The average number of turns per conversation.
   * </pre>
   *
   * <code>int32 average_turn_count = 2;</code>
   *
   * @return The averageTurnCount.
   */
  int getAverageTurnCount();

  /**
   *
   *
   * <pre>
   * The total number of conversations.
   * </pre>
   *
   * <code>int32 conversation_count = 3;</code>
   *
   * @return The conversationCount.
   */
  int getConversationCount();

  /**
   *
   *
   * <pre>
   * A map associating each smart highlighter display name with its respective
   * number of matches in the set of conversations.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; smart_highlighter_matches = 4;</code>
   */
  int getSmartHighlighterMatchesCount();
  /**
   *
   *
   * <pre>
   * A map associating each smart highlighter display name with its respective
   * number of matches in the set of conversations.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; smart_highlighter_matches = 4;</code>
   */
  boolean containsSmartHighlighterMatches(java.lang.String key);
  /** Use {@link #getSmartHighlighterMatchesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer> getSmartHighlighterMatches();
  /**
   *
   *
   * <pre>
   * A map associating each smart highlighter display name with its respective
   * number of matches in the set of conversations.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; smart_highlighter_matches = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.Integer> getSmartHighlighterMatchesMap();
  /**
   *
   *
   * <pre>
   * A map associating each smart highlighter display name with its respective
   * number of matches in the set of conversations.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; smart_highlighter_matches = 4;</code>
   */
  int getSmartHighlighterMatchesOrDefault(java.lang.String key, int defaultValue);
  /**
   *
   *
   * <pre>
   * A map associating each smart highlighter display name with its respective
   * number of matches in the set of conversations.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; smart_highlighter_matches = 4;</code>
   */
  int getSmartHighlighterMatchesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * A map associating each custom highlighter resource name with its respective
   * number of matches in the set of conversations.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; custom_highlighter_matches = 5;</code>
   */
  int getCustomHighlighterMatchesCount();
  /**
   *
   *
   * <pre>
   * A map associating each custom highlighter resource name with its respective
   * number of matches in the set of conversations.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; custom_highlighter_matches = 5;</code>
   */
  boolean containsCustomHighlighterMatches(java.lang.String key);
  /** Use {@link #getCustomHighlighterMatchesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer> getCustomHighlighterMatches();
  /**
   *
   *
   * <pre>
   * A map associating each custom highlighter resource name with its respective
   * number of matches in the set of conversations.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; custom_highlighter_matches = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.Integer> getCustomHighlighterMatchesMap();
  /**
   *
   *
   * <pre>
   * A map associating each custom highlighter resource name with its respective
   * number of matches in the set of conversations.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; custom_highlighter_matches = 5;</code>
   */
  int getCustomHighlighterMatchesOrDefault(java.lang.String key, int defaultValue);
  /**
   *
   *
   * <pre>
   * A map associating each custom highlighter resource name with its respective
   * number of matches in the set of conversations.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; custom_highlighter_matches = 5;</code>
   */
  int getCustomHighlighterMatchesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * A map associating each issue resource name with its respective number of
   * matches in the set of conversations. Key has the format:
   * `projects/&lt;Project-ID&gt;/locations/&lt;Location-ID&gt;/issueModels/&lt;Issue-Model-ID&gt;/issues/&lt;Issue-ID&gt;`
   * Deprecated, use `issue_matches_stats` field instead.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; issue_matches = 6 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  int getIssueMatchesCount();
  /**
   *
   *
   * <pre>
   * A map associating each issue resource name with its respective number of
   * matches in the set of conversations. Key has the format:
   * `projects/&lt;Project-ID&gt;/locations/&lt;Location-ID&gt;/issueModels/&lt;Issue-Model-ID&gt;/issues/&lt;Issue-ID&gt;`
   * Deprecated, use `issue_matches_stats` field instead.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; issue_matches = 6 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  boolean containsIssueMatches(java.lang.String key);
  /** Use {@link #getIssueMatchesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer> getIssueMatches();
  /**
   *
   *
   * <pre>
   * A map associating each issue resource name with its respective number of
   * matches in the set of conversations. Key has the format:
   * `projects/&lt;Project-ID&gt;/locations/&lt;Location-ID&gt;/issueModels/&lt;Issue-Model-ID&gt;/issues/&lt;Issue-ID&gt;`
   * Deprecated, use `issue_matches_stats` field instead.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; issue_matches = 6 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer> getIssueMatchesMap();
  /**
   *
   *
   * <pre>
   * A map associating each issue resource name with its respective number of
   * matches in the set of conversations. Key has the format:
   * `projects/&lt;Project-ID&gt;/locations/&lt;Location-ID&gt;/issueModels/&lt;Issue-Model-ID&gt;/issues/&lt;Issue-ID&gt;`
   * Deprecated, use `issue_matches_stats` field instead.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; issue_matches = 6 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  int getIssueMatchesOrDefault(java.lang.String key, int defaultValue);
  /**
   *
   *
   * <pre>
   * A map associating each issue resource name with its respective number of
   * matches in the set of conversations. Key has the format:
   * `projects/&lt;Project-ID&gt;/locations/&lt;Location-ID&gt;/issueModels/&lt;Issue-Model-ID&gt;/issues/&lt;Issue-ID&gt;`
   * Deprecated, use `issue_matches_stats` field instead.
   * </pre>
   *
   * <code>map&lt;string, int32&gt; issue_matches = 6 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  int getIssueMatchesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * A map associating each issue resource name with its respective number of
   * matches in the set of conversations. Key has the format:
   * `projects/&lt;Project-ID&gt;/locations/&lt;Location-ID&gt;/issueModels/&lt;Issue-Model-ID&gt;/issues/&lt;Issue-ID&gt;`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.contactcenterinsights.v1.IssueModelLabelStats.IssueStats&gt; issue_matches_stats = 8;
   * </code>
   */
  int getIssueMatchesStatsCount();
  /**
   *
   *
   * <pre>
   * A map associating each issue resource name with its respective number of
   * matches in the set of conversations. Key has the format:
   * `projects/&lt;Project-ID&gt;/locations/&lt;Location-ID&gt;/issueModels/&lt;Issue-Model-ID&gt;/issues/&lt;Issue-ID&gt;`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.contactcenterinsights.v1.IssueModelLabelStats.IssueStats&gt; issue_matches_stats = 8;
   * </code>
   */
  boolean containsIssueMatchesStats(java.lang.String key);
  /** Use {@link #getIssueMatchesStatsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String,
          com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats.IssueStats>
      getIssueMatchesStats();
  /**
   *
   *
   * <pre>
   * A map associating each issue resource name with its respective number of
   * matches in the set of conversations. Key has the format:
   * `projects/&lt;Project-ID&gt;/locations/&lt;Location-ID&gt;/issueModels/&lt;Issue-Model-ID&gt;/issues/&lt;Issue-ID&gt;`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.contactcenterinsights.v1.IssueModelLabelStats.IssueStats&gt; issue_matches_stats = 8;
   * </code>
   */
  java.util.Map<
          java.lang.String,
          com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats.IssueStats>
      getIssueMatchesStatsMap();
  /**
   *
   *
   * <pre>
   * A map associating each issue resource name with its respective number of
   * matches in the set of conversations. Key has the format:
   * `projects/&lt;Project-ID&gt;/locations/&lt;Location-ID&gt;/issueModels/&lt;Issue-Model-ID&gt;/issues/&lt;Issue-ID&gt;`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.contactcenterinsights.v1.IssueModelLabelStats.IssueStats&gt; issue_matches_stats = 8;
   * </code>
   */
  /* nullable */
  com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats.IssueStats
      getIssueMatchesStatsOrDefault(
          java.lang.String key,
          /* nullable */
          com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats.IssueStats defaultValue);
  /**
   *
   *
   * <pre>
   * A map associating each issue resource name with its respective number of
   * matches in the set of conversations. Key has the format:
   * `projects/&lt;Project-ID&gt;/locations/&lt;Location-ID&gt;/issueModels/&lt;Issue-Model-ID&gt;/issues/&lt;Issue-ID&gt;`
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.contactcenterinsights.v1.IssueModelLabelStats.IssueStats&gt; issue_matches_stats = 8;
   * </code>
   */
  com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats.IssueStats
      getIssueMatchesStatsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * A time series representing the count of conversations created over time
   * that match that requested filter criteria.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.CalculateStatsResponse.TimeSeries conversation_count_time_series = 7;
   * </code>
   *
   * @return Whether the conversationCountTimeSeries field is set.
   */
  boolean hasConversationCountTimeSeries();
  /**
   *
   *
   * <pre>
   * A time series representing the count of conversations created over time
   * that match that requested filter criteria.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.CalculateStatsResponse.TimeSeries conversation_count_time_series = 7;
   * </code>
   *
   * @return The conversationCountTimeSeries.
   */
  com.google.cloud.contactcenterinsights.v1.CalculateStatsResponse.TimeSeries
      getConversationCountTimeSeries();
  /**
   *
   *
   * <pre>
   * A time series representing the count of conversations created over time
   * that match that requested filter criteria.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.CalculateStatsResponse.TimeSeries conversation_count_time_series = 7;
   * </code>
   */
  com.google.cloud.contactcenterinsights.v1.CalculateStatsResponse.TimeSeriesOrBuilder
      getConversationCountTimeSeriesOrBuilder();
}
