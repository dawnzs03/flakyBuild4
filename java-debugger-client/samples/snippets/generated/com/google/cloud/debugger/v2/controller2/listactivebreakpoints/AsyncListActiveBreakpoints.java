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

package com.google.cloud.debugger.v2.samples;

// [START clouddebugger_v2_generated_Controller2_ListActiveBreakpoints_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.debugger.v2.Controller2Client;
import com.google.devtools.clouddebugger.v2.ListActiveBreakpointsRequest;
import com.google.devtools.clouddebugger.v2.ListActiveBreakpointsResponse;

public class AsyncListActiveBreakpoints {

  public static void main(String[] args) throws Exception {
    asyncListActiveBreakpoints();
  }

  public static void asyncListActiveBreakpoints() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (Controller2Client controller2Client = Controller2Client.create()) {
      ListActiveBreakpointsRequest request =
          ListActiveBreakpointsRequest.newBuilder()
              .setDebuggeeId("debuggeeId-1833285553")
              .setWaitToken("waitToken-984229500")
              .setSuccessOnTimeout(true)
              .build();
      ApiFuture<ListActiveBreakpointsResponse> future =
          controller2Client.listActiveBreakpointsCallable().futureCall(request);
      // Do something.
      ListActiveBreakpointsResponse response = future.get();
    }
  }
}
// [END clouddebugger_v2_generated_Controller2_ListActiveBreakpoints_async]
