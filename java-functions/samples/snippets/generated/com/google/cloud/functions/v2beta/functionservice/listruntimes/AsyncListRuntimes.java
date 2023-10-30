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

package com.google.cloud.functions.v2beta.samples;

// [START cloudfunctions_v2beta_generated_FunctionService_ListRuntimes_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.functions.v2beta.FunctionServiceClient;
import com.google.cloud.functions.v2beta.ListRuntimesRequest;
import com.google.cloud.functions.v2beta.ListRuntimesResponse;
import com.google.cloud.functions.v2beta.LocationName;

public class AsyncListRuntimes {

  public static void main(String[] args) throws Exception {
    asyncListRuntimes();
  }

  public static void asyncListRuntimes() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (FunctionServiceClient functionServiceClient = FunctionServiceClient.create()) {
      ListRuntimesRequest request =
          ListRuntimesRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setFilter("filter-1274492040")
              .build();
      ApiFuture<ListRuntimesResponse> future =
          functionServiceClient.listRuntimesCallable().futureCall(request);
      // Do something.
      ListRuntimesResponse response = future.get();
    }
  }
}
// [END cloudfunctions_v2beta_generated_FunctionService_ListRuntimes_async]
