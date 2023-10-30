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
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

package com.google.cloud.datalabeling.v1beta1;

public interface SearchEvaluationsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.SearchEvaluationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Evaluation search parent (project ID). Format:
   * "projects/&lt;var&gt;{project_id}&lt;/var&gt;"
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
   * Required. Evaluation search parent (project ID). Format:
   * "projects/&lt;var&gt;{project_id}&lt;/var&gt;"
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
   * Optional. To search evaluations, you can filter by the following:
   *
   * * evaluation&lt;span&gt;_&lt;/span&gt;job.evaluation_job_id (the last part of
   *   [EvaluationJob.name][google.cloud.datalabeling.v1beta1.EvaluationJob.name])
   * * evaluation&lt;span&gt;_&lt;/span&gt;job.model_id (the &lt;var&gt;{model_name}&lt;/var&gt; portion
   *   of [EvaluationJob.modelVersion][google.cloud.datalabeling.v1beta1.EvaluationJob.model_version])
   * * evaluation&lt;span&gt;_&lt;/span&gt;job.evaluation_job_run_time_start (Minimum
   *   threshold for the
   *   [evaluationJobRunTime][google.cloud.datalabeling.v1beta1.Evaluation.evaluation_job_run_time] that created
   *   the evaluation)
   * * evaluation&lt;span&gt;_&lt;/span&gt;job.evaluation_job_run_time_end (Maximum
   *   threshold for the
   *   [evaluationJobRunTime][google.cloud.datalabeling.v1beta1.Evaluation.evaluation_job_run_time] that created
   *   the evaluation)
   * * evaluation&lt;span&gt;_&lt;/span&gt;job.job_state ([EvaluationJob.state][google.cloud.datalabeling.v1beta1.EvaluationJob.state])
   * * annotation&lt;span&gt;_&lt;/span&gt;spec.display_name (the Evaluation contains a
   *   metric for the annotation spec with this
   *   [displayName][google.cloud.datalabeling.v1beta1.AnnotationSpec.display_name])
   *
   * To filter by multiple critiera, use the `AND` operator or the `OR`
   * operator. The following examples shows a string that filters by several
   * critiera:
   *
   * "evaluation&lt;span&gt;_&lt;/span&gt;job.evaluation_job_id =
   * &lt;var&gt;{evaluation_job_id}&lt;/var&gt; AND evaluation&lt;span&gt;_&lt;/span&gt;job.model_id =
   * &lt;var&gt;{model_name}&lt;/var&gt; AND
   * evaluation&lt;span&gt;_&lt;/span&gt;job.evaluation_job_run_time_start =
   * &lt;var&gt;{timestamp_1}&lt;/var&gt; AND
   * evaluation&lt;span&gt;_&lt;/span&gt;job.evaluation_job_run_time_end =
   * &lt;var&gt;{timestamp_2}&lt;/var&gt; AND annotation&lt;span&gt;_&lt;/span&gt;spec.display_name =
   * &lt;var&gt;{display_name}&lt;/var&gt;"
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. To search evaluations, you can filter by the following:
   *
   * * evaluation&lt;span&gt;_&lt;/span&gt;job.evaluation_job_id (the last part of
   *   [EvaluationJob.name][google.cloud.datalabeling.v1beta1.EvaluationJob.name])
   * * evaluation&lt;span&gt;_&lt;/span&gt;job.model_id (the &lt;var&gt;{model_name}&lt;/var&gt; portion
   *   of [EvaluationJob.modelVersion][google.cloud.datalabeling.v1beta1.EvaluationJob.model_version])
   * * evaluation&lt;span&gt;_&lt;/span&gt;job.evaluation_job_run_time_start (Minimum
   *   threshold for the
   *   [evaluationJobRunTime][google.cloud.datalabeling.v1beta1.Evaluation.evaluation_job_run_time] that created
   *   the evaluation)
   * * evaluation&lt;span&gt;_&lt;/span&gt;job.evaluation_job_run_time_end (Maximum
   *   threshold for the
   *   [evaluationJobRunTime][google.cloud.datalabeling.v1beta1.Evaluation.evaluation_job_run_time] that created
   *   the evaluation)
   * * evaluation&lt;span&gt;_&lt;/span&gt;job.job_state ([EvaluationJob.state][google.cloud.datalabeling.v1beta1.EvaluationJob.state])
   * * annotation&lt;span&gt;_&lt;/span&gt;spec.display_name (the Evaluation contains a
   *   metric for the annotation spec with this
   *   [displayName][google.cloud.datalabeling.v1beta1.AnnotationSpec.display_name])
   *
   * To filter by multiple critiera, use the `AND` operator or the `OR`
   * operator. The following examples shows a string that filters by several
   * critiera:
   *
   * "evaluation&lt;span&gt;_&lt;/span&gt;job.evaluation_job_id =
   * &lt;var&gt;{evaluation_job_id}&lt;/var&gt; AND evaluation&lt;span&gt;_&lt;/span&gt;job.model_id =
   * &lt;var&gt;{model_name}&lt;/var&gt; AND
   * evaluation&lt;span&gt;_&lt;/span&gt;job.evaluation_job_run_time_start =
   * &lt;var&gt;{timestamp_1}&lt;/var&gt; AND
   * evaluation&lt;span&gt;_&lt;/span&gt;job.evaluation_job_run_time_end =
   * &lt;var&gt;{timestamp_2}&lt;/var&gt; AND annotation&lt;span&gt;_&lt;/span&gt;spec.display_name =
   * &lt;var&gt;{display_name}&lt;/var&gt;"
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. Requested page size. Server may return fewer results than
   * requested. Default value is 100.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results for the server to return.
   * Typically obtained by the
   * [nextPageToken][google.cloud.datalabeling.v1beta1.SearchEvaluationsResponse.next_page_token] of the response
   * to a previous search request.
   *
   * If you don't specify this field, the API call requests the first page of
   * the search.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results for the server to return.
   * Typically obtained by the
   * [nextPageToken][google.cloud.datalabeling.v1beta1.SearchEvaluationsResponse.next_page_token] of the response
   * to a previous search request.
   *
   * If you don't specify this field, the API call requests the first page of
   * the search.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
