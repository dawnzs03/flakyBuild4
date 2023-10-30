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

package com.google.cloud.dialogflow.cx.v3.samples;

// [START dialogflow_v3_generated_Flows_CreateFlow_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dialogflow.cx.v3.AgentName;
import com.google.cloud.dialogflow.cx.v3.CreateFlowRequest;
import com.google.cloud.dialogflow.cx.v3.Flow;
import com.google.cloud.dialogflow.cx.v3.FlowsClient;

public class AsyncCreateFlow {

  public static void main(String[] args) throws Exception {
    asyncCreateFlow();
  }

  public static void asyncCreateFlow() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (FlowsClient flowsClient = FlowsClient.create()) {
      CreateFlowRequest request =
          CreateFlowRequest.newBuilder()
              .setParent(AgentName.of("[PROJECT]", "[LOCATION]", "[AGENT]").toString())
              .setFlow(Flow.newBuilder().build())
              .setLanguageCode("languageCode-2092349083")
              .build();
      ApiFuture<Flow> future = flowsClient.createFlowCallable().futureCall(request);
      // Do something.
      Flow response = future.get();
    }
  }
}
// [END dialogflow_v3_generated_Flows_CreateFlow_async]
