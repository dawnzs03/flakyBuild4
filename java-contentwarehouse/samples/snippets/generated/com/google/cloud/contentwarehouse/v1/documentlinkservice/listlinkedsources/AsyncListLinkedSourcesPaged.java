/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.contentwarehouse.v1.samples;

// [START contentwarehouse_v1_generated_DocumentLinkService_ListLinkedSources_Paged_async]
import com.google.cloud.contentwarehouse.v1.DocumentLink;
import com.google.cloud.contentwarehouse.v1.DocumentLinkServiceClient;
import com.google.cloud.contentwarehouse.v1.DocumentName;
import com.google.cloud.contentwarehouse.v1.ListLinkedSourcesRequest;
import com.google.cloud.contentwarehouse.v1.ListLinkedSourcesResponse;
import com.google.cloud.contentwarehouse.v1.RequestMetadata;
import com.google.common.base.Strings;

public class AsyncListLinkedSourcesPaged {

  public static void main(String[] args) throws Exception {
    asyncListLinkedSourcesPaged();
  }

  public static void asyncListLinkedSourcesPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DocumentLinkServiceClient documentLinkServiceClient = DocumentLinkServiceClient.create()) {
      ListLinkedSourcesRequest request =
          ListLinkedSourcesRequest.newBuilder()
              .setParent(
                  DocumentName.ofProjectLocationDocumentName(
                          "[PROJECT]", "[LOCATION]", "[DOCUMENT]")
                      .toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setRequestMetadata(RequestMetadata.newBuilder().build())
              .build();
      while (true) {
        ListLinkedSourcesResponse response =
            documentLinkServiceClient.listLinkedSourcesCallable().call(request);
        for (DocumentLink element : response.getDocumentLinksList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END contentwarehouse_v1_generated_DocumentLinkService_ListLinkedSources_Paged_async]
