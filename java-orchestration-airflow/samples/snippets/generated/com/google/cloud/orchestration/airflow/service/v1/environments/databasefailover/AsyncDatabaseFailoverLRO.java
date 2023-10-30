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

package com.google.cloud.orchestration.airflow.service.v1.samples;

// [START composer_v1_generated_Environments_DatabaseFailover_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.orchestration.airflow.service.v1.DatabaseFailoverRequest;
import com.google.cloud.orchestration.airflow.service.v1.DatabaseFailoverResponse;
import com.google.cloud.orchestration.airflow.service.v1.EnvironmentsClient;
import com.google.cloud.orchestration.airflow.service.v1.OperationMetadata;

public class AsyncDatabaseFailoverLRO {

  public static void main(String[] args) throws Exception {
    asyncDatabaseFailoverLRO();
  }

  public static void asyncDatabaseFailoverLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
      DatabaseFailoverRequest request =
          DatabaseFailoverRequest.newBuilder().setEnvironment("environment-85904877").build();
      OperationFuture<DatabaseFailoverResponse, OperationMetadata> future =
          environmentsClient.databaseFailoverOperationCallable().futureCall(request);
      // Do something.
      DatabaseFailoverResponse response = future.get();
    }
  }
}
// [END composer_v1_generated_Environments_DatabaseFailover_LRO_async]
