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
// source: google/cloud/contentwarehouse/v1/document_service_request.proto

package com.google.cloud.contentwarehouse.v1;

public interface SearchDocumentsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.SearchDocumentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent, which owns this collection of documents.
   * Format: projects/{project_number}/locations/{location}.
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
   * Required. The parent, which owns this collection of documents.
   * Format: projects/{project_number}/locations/{location}.
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
   * The meta information collected about the end user, used to enforce access
   * control and improve the search quality of the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 3;</code>
   *
   * @return Whether the requestMetadata field is set.
   */
  boolean hasRequestMetadata();
  /**
   *
   *
   * <pre>
   * The meta information collected about the end user, used to enforce access
   * control and improve the search quality of the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 3;</code>
   *
   * @return The requestMetadata.
   */
  com.google.cloud.contentwarehouse.v1.RequestMetadata getRequestMetadata();
  /**
   *
   *
   * <pre>
   * The meta information collected about the end user, used to enforce access
   * control and improve the search quality of the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 3;</code>
   */
  com.google.cloud.contentwarehouse.v1.RequestMetadataOrBuilder getRequestMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Query used to search against documents (keyword, filters, etc.).
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DocumentQuery document_query = 4;</code>
   *
   * @return Whether the documentQuery field is set.
   */
  boolean hasDocumentQuery();
  /**
   *
   *
   * <pre>
   * Query used to search against documents (keyword, filters, etc.).
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DocumentQuery document_query = 4;</code>
   *
   * @return The documentQuery.
   */
  com.google.cloud.contentwarehouse.v1.DocumentQuery getDocumentQuery();
  /**
   *
   *
   * <pre>
   * Query used to search against documents (keyword, filters, etc.).
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.DocumentQuery document_query = 4;</code>
   */
  com.google.cloud.contentwarehouse.v1.DocumentQueryOrBuilder getDocumentQueryOrBuilder();

  /**
   *
   *
   * <pre>
   * An integer that specifies the current offset (that is, starting result
   * location, amongst the documents deemed by the API as relevant) in search
   * results. This field is only considered if
   * [page_token][google.cloud.contentwarehouse.v1.SearchDocumentsRequest.page_token]
   * is unset.
   *
   * The maximum allowed value is 5000. Otherwise an error is thrown.
   *
   * For example, 0 means to  return results starting from the first matching
   * document, and 10 means to return from the 11th document. This can be used
   * for pagination, (for example, pageSize = 10 and offset = 10 means to return
   * from the second page).
   * </pre>
   *
   * <code>int32 offset = 5;</code>
   *
   * @return The offset.
   */
  int getOffset();

  /**
   *
   *
   * <pre>
   * A limit on the number of documents returned in the search results.
   * Increasing this value above the default value of 10 can increase search
   * response time. The value can be between 1 and 100.
   * </pre>
   *
   * <code>int32 page_size = 6;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The token specifying the current offset within search results.
   * See
   * [SearchDocumentsResponse.next_page_token][google.cloud.contentwarehouse.v1.SearchDocumentsResponse.next_page_token]
   * for an explanation of how to obtain the next set of query results.
   * </pre>
   *
   * <code>string page_token = 7;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * The token specifying the current offset within search results.
   * See
   * [SearchDocumentsResponse.next_page_token][google.cloud.contentwarehouse.v1.SearchDocumentsResponse.next_page_token]
   * for an explanation of how to obtain the next set of query results.
   * </pre>
   *
   * <code>string page_token = 7;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The criteria determining how search results are sorted. For non-empty
   * query, default is `"relevance desc"`. For empty query, default is
   * `"upload_date desc"`.
   *
   * Supported options are:
   *
   * * `"relevance desc"`: By relevance descending, as determined by the API
   *   algorithms.
   * * `"upload_date desc"`: By upload date descending.
   * * `"upload_date"`: By upload date ascending.
   * * `"update_date desc"`: By last updated date descending.
   * * `"update_date"`: By last updated date ascending.
   * * `"retrieval_importance desc"`: By retrieval importance of properties
   *   descending. This feature is still under development, please do not use
   *   unless otherwise instructed to do so.
   * </pre>
   *
   * <code>string order_by = 8;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * The criteria determining how search results are sorted. For non-empty
   * query, default is `"relevance desc"`. For empty query, default is
   * `"upload_date desc"`.
   *
   * Supported options are:
   *
   * * `"relevance desc"`: By relevance descending, as determined by the API
   *   algorithms.
   * * `"upload_date desc"`: By upload date descending.
   * * `"upload_date"`: By upload date ascending.
   * * `"update_date desc"`: By last updated date descending.
   * * `"update_date"`: By last updated date ascending.
   * * `"retrieval_importance desc"`: By retrieval importance of properties
   *   descending. This feature is still under development, please do not use
   *   unless otherwise instructed to do so.
   * </pre>
   *
   * <code>string order_by = 8;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();

  /**
   *
   *
   * <pre>
   * An expression specifying a histogram request against matching
   * documents. Expression syntax is an aggregation function call with
   * histogram facets and other options.
   *
   * The following aggregation functions are supported:
   *
   * * `count(string_histogram_facet)`: Count the number of matching entities
   * for each distinct attribute value.
   *
   * Data types:
   *
   * * Histogram facet (aka filterable properties): Facet names with format
   * &amp;lt;schema id&amp;gt;.&amp;lt;facet&amp;gt;. Facets will have the
   * format of: `[a-zA-Z][a-zA-Z0-9_:/-.]`. If the facet is a child
   * facet, then the parent hierarchy needs to be specified separated by
   * dots in the prefix after the schema id. Thus, the format for a multi-
   * level facet is: &amp;lt;schema id&amp;gt;.&amp;lt;parent facet name&amp;gt;.
   * &amp;lt;child facet name&amp;gt;. Example:
   * schema123.root_parent_facet.middle_facet.child_facet
   * * DocumentSchemaId: (with no schema id prefix) to get
   * histograms for each document type (returns the schema id path, e.g.
   * projects/12345/locations/us-west/documentSchemas/abc123).
   *
   * Example expression:
   *
   * * Document type counts:
   *   count('DocumentSchemaId')
   *
   * * For schema id, abc123, get the counts for MORTGAGE_TYPE:
   *   count('abc123.MORTGAGE_TYPE')
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.HistogramQuery histogram_queries = 9;</code>
   */
  java.util.List<com.google.cloud.contentwarehouse.v1.HistogramQuery> getHistogramQueriesList();
  /**
   *
   *
   * <pre>
   * An expression specifying a histogram request against matching
   * documents. Expression syntax is an aggregation function call with
   * histogram facets and other options.
   *
   * The following aggregation functions are supported:
   *
   * * `count(string_histogram_facet)`: Count the number of matching entities
   * for each distinct attribute value.
   *
   * Data types:
   *
   * * Histogram facet (aka filterable properties): Facet names with format
   * &amp;lt;schema id&amp;gt;.&amp;lt;facet&amp;gt;. Facets will have the
   * format of: `[a-zA-Z][a-zA-Z0-9_:/-.]`. If the facet is a child
   * facet, then the parent hierarchy needs to be specified separated by
   * dots in the prefix after the schema id. Thus, the format for a multi-
   * level facet is: &amp;lt;schema id&amp;gt;.&amp;lt;parent facet name&amp;gt;.
   * &amp;lt;child facet name&amp;gt;. Example:
   * schema123.root_parent_facet.middle_facet.child_facet
   * * DocumentSchemaId: (with no schema id prefix) to get
   * histograms for each document type (returns the schema id path, e.g.
   * projects/12345/locations/us-west/documentSchemas/abc123).
   *
   * Example expression:
   *
   * * Document type counts:
   *   count('DocumentSchemaId')
   *
   * * For schema id, abc123, get the counts for MORTGAGE_TYPE:
   *   count('abc123.MORTGAGE_TYPE')
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.HistogramQuery histogram_queries = 9;</code>
   */
  com.google.cloud.contentwarehouse.v1.HistogramQuery getHistogramQueries(int index);
  /**
   *
   *
   * <pre>
   * An expression specifying a histogram request against matching
   * documents. Expression syntax is an aggregation function call with
   * histogram facets and other options.
   *
   * The following aggregation functions are supported:
   *
   * * `count(string_histogram_facet)`: Count the number of matching entities
   * for each distinct attribute value.
   *
   * Data types:
   *
   * * Histogram facet (aka filterable properties): Facet names with format
   * &amp;lt;schema id&amp;gt;.&amp;lt;facet&amp;gt;. Facets will have the
   * format of: `[a-zA-Z][a-zA-Z0-9_:/-.]`. If the facet is a child
   * facet, then the parent hierarchy needs to be specified separated by
   * dots in the prefix after the schema id. Thus, the format for a multi-
   * level facet is: &amp;lt;schema id&amp;gt;.&amp;lt;parent facet name&amp;gt;.
   * &amp;lt;child facet name&amp;gt;. Example:
   * schema123.root_parent_facet.middle_facet.child_facet
   * * DocumentSchemaId: (with no schema id prefix) to get
   * histograms for each document type (returns the schema id path, e.g.
   * projects/12345/locations/us-west/documentSchemas/abc123).
   *
   * Example expression:
   *
   * * Document type counts:
   *   count('DocumentSchemaId')
   *
   * * For schema id, abc123, get the counts for MORTGAGE_TYPE:
   *   count('abc123.MORTGAGE_TYPE')
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.HistogramQuery histogram_queries = 9;</code>
   */
  int getHistogramQueriesCount();
  /**
   *
   *
   * <pre>
   * An expression specifying a histogram request against matching
   * documents. Expression syntax is an aggregation function call with
   * histogram facets and other options.
   *
   * The following aggregation functions are supported:
   *
   * * `count(string_histogram_facet)`: Count the number of matching entities
   * for each distinct attribute value.
   *
   * Data types:
   *
   * * Histogram facet (aka filterable properties): Facet names with format
   * &amp;lt;schema id&amp;gt;.&amp;lt;facet&amp;gt;. Facets will have the
   * format of: `[a-zA-Z][a-zA-Z0-9_:/-.]`. If the facet is a child
   * facet, then the parent hierarchy needs to be specified separated by
   * dots in the prefix after the schema id. Thus, the format for a multi-
   * level facet is: &amp;lt;schema id&amp;gt;.&amp;lt;parent facet name&amp;gt;.
   * &amp;lt;child facet name&amp;gt;. Example:
   * schema123.root_parent_facet.middle_facet.child_facet
   * * DocumentSchemaId: (with no schema id prefix) to get
   * histograms for each document type (returns the schema id path, e.g.
   * projects/12345/locations/us-west/documentSchemas/abc123).
   *
   * Example expression:
   *
   * * Document type counts:
   *   count('DocumentSchemaId')
   *
   * * For schema id, abc123, get the counts for MORTGAGE_TYPE:
   *   count('abc123.MORTGAGE_TYPE')
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.HistogramQuery histogram_queries = 9;</code>
   */
  java.util.List<? extends com.google.cloud.contentwarehouse.v1.HistogramQueryOrBuilder>
      getHistogramQueriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * An expression specifying a histogram request against matching
   * documents. Expression syntax is an aggregation function call with
   * histogram facets and other options.
   *
   * The following aggregation functions are supported:
   *
   * * `count(string_histogram_facet)`: Count the number of matching entities
   * for each distinct attribute value.
   *
   * Data types:
   *
   * * Histogram facet (aka filterable properties): Facet names with format
   * &amp;lt;schema id&amp;gt;.&amp;lt;facet&amp;gt;. Facets will have the
   * format of: `[a-zA-Z][a-zA-Z0-9_:/-.]`. If the facet is a child
   * facet, then the parent hierarchy needs to be specified separated by
   * dots in the prefix after the schema id. Thus, the format for a multi-
   * level facet is: &amp;lt;schema id&amp;gt;.&amp;lt;parent facet name&amp;gt;.
   * &amp;lt;child facet name&amp;gt;. Example:
   * schema123.root_parent_facet.middle_facet.child_facet
   * * DocumentSchemaId: (with no schema id prefix) to get
   * histograms for each document type (returns the schema id path, e.g.
   * projects/12345/locations/us-west/documentSchemas/abc123).
   *
   * Example expression:
   *
   * * Document type counts:
   *   count('DocumentSchemaId')
   *
   * * For schema id, abc123, get the counts for MORTGAGE_TYPE:
   *   count('abc123.MORTGAGE_TYPE')
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.HistogramQuery histogram_queries = 9;</code>
   */
  com.google.cloud.contentwarehouse.v1.HistogramQueryOrBuilder getHistogramQueriesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Controls if the search document request requires the return of a total size
   * of matched documents. See
   * [SearchDocumentsResponse.total_size][google.cloud.contentwarehouse.v1.SearchDocumentsResponse.total_size].
   *
   * Enabling this flag may adversely impact performance. Hint: If this is
   * used with pagination, set this flag on the initial query but set this
   * to false on subsequent page calls (keep the total count locally).
   *
   * Defaults to false.
   * </pre>
   *
   * <code>bool require_total_size = 10;</code>
   *
   * @return The requireTotalSize.
   */
  boolean getRequireTotalSize();

  /**
   *
   *
   * <pre>
   * Controls if the search document request requires the return of a total size
   * of matched documents. See
   * [SearchDocumentsResponse.total_size][google.cloud.contentwarehouse.v1.SearchDocumentsResponse.total_size].
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.SearchDocumentsRequest.TotalResultSize total_result_size = 12;
   * </code>
   *
   * @return The enum numeric value on the wire for totalResultSize.
   */
  int getTotalResultSizeValue();
  /**
   *
   *
   * <pre>
   * Controls if the search document request requires the return of a total size
   * of matched documents. See
   * [SearchDocumentsResponse.total_size][google.cloud.contentwarehouse.v1.SearchDocumentsResponse.total_size].
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.SearchDocumentsRequest.TotalResultSize total_result_size = 12;
   * </code>
   *
   * @return The totalResultSize.
   */
  com.google.cloud.contentwarehouse.v1.SearchDocumentsRequest.TotalResultSize getTotalResultSize();

  /**
   *
   *
   * <pre>
   * Experimental, do not use.
   * The limit on the number of documents returned for the question-answering
   * feature. To enable the question-answering feature, set
   * [DocumentQuery].[is_nl_query][] to true.
   * </pre>
   *
   * <code>int32 qa_size_limit = 11;</code>
   *
   * @return The qaSizeLimit.
   */
  int getQaSizeLimit();
}
