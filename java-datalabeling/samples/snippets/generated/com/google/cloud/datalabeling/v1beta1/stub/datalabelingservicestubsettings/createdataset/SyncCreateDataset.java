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

package com.google.cloud.datalabeling.v1beta1.stub.samples;

// [START datalabeling_v1beta1_generated_DataLabelingServiceStubSettings_CreateDataset_sync]
import com.google.cloud.datalabeling.v1beta1.stub.DataLabelingServiceStubSettings;
import java.time.Duration;

public class SyncCreateDataset {

  public static void main(String[] args) throws Exception {
    syncCreateDataset();
  }

  public static void syncCreateDataset() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    DataLabelingServiceStubSettings.Builder dataLabelingServiceSettingsBuilder =
        DataLabelingServiceStubSettings.newBuilder();
    dataLabelingServiceSettingsBuilder
        .createDatasetSettings()
        .setRetrySettings(
            dataLabelingServiceSettingsBuilder
                .createDatasetSettings()
                .getRetrySettings()
                .toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    DataLabelingServiceStubSettings dataLabelingServiceSettings =
        dataLabelingServiceSettingsBuilder.build();
  }
}
// [END datalabeling_v1beta1_generated_DataLabelingServiceStubSettings_CreateDataset_sync]
