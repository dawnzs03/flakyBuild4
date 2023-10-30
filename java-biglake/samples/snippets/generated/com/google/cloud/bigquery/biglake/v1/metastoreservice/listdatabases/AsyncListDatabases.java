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

package com.google.cloud.bigquery.biglake.v1.samples;

// [START biglake_v1_generated_MetastoreService_ListDatabases_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.bigquery.biglake.v1.CatalogName;
import com.google.cloud.bigquery.biglake.v1.Database;
import com.google.cloud.bigquery.biglake.v1.ListDatabasesRequest;
import com.google.cloud.bigquery.biglake.v1.MetastoreServiceClient;

public class AsyncListDatabases {

  public static void main(String[] args) throws Exception {
    asyncListDatabases();
  }

  public static void asyncListDatabases() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (MetastoreServiceClient metastoreServiceClient = MetastoreServiceClient.create()) {
      ListDatabasesRequest request =
          ListDatabasesRequest.newBuilder()
              .setParent(CatalogName.of("[PROJECT]", "[LOCATION]", "[CATALOG]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      ApiFuture<Database> future =
          metastoreServiceClient.listDatabasesPagedCallable().futureCall(request);
      // Do something.
      for (Database element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END biglake_v1_generated_MetastoreService_ListDatabases_async]
