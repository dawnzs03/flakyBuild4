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

package com.google.cloud.speech.v2.samples;

// [START speech_v2_generated_Speech_UpdateConfig_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.speech.v2.Config;
import com.google.cloud.speech.v2.SpeechClient;
import com.google.cloud.speech.v2.UpdateConfigRequest;
import com.google.protobuf.FieldMask;

public class AsyncUpdateConfig {

  public static void main(String[] args) throws Exception {
    asyncUpdateConfig();
  }

  public static void asyncUpdateConfig() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (SpeechClient speechClient = SpeechClient.create()) {
      UpdateConfigRequest request =
          UpdateConfigRequest.newBuilder()
              .setConfig(Config.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      ApiFuture<Config> future = speechClient.updateConfigCallable().futureCall(request);
      // Do something.
      Config response = future.get();
    }
  }
}
// [END speech_v2_generated_Speech_UpdateConfig_async]
