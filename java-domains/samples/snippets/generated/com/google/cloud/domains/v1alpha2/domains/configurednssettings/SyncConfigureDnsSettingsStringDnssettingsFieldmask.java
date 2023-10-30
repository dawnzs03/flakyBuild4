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

package com.google.cloud.domains.v1alpha2.samples;

// [START domains_v1alpha2_generated_Domains_ConfigureDnsSettings_StringDnssettingsFieldmask_sync]
import com.google.cloud.domains.v1alpha2.DnsSettings;
import com.google.cloud.domains.v1alpha2.DomainsClient;
import com.google.cloud.domains.v1alpha2.Registration;
import com.google.cloud.domains.v1alpha2.RegistrationName;
import com.google.protobuf.FieldMask;

public class SyncConfigureDnsSettingsStringDnssettingsFieldmask {

  public static void main(String[] args) throws Exception {
    syncConfigureDnsSettingsStringDnssettingsFieldmask();
  }

  public static void syncConfigureDnsSettingsStringDnssettingsFieldmask() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DomainsClient domainsClient = DomainsClient.create()) {
      String registration =
          RegistrationName.of("[PROJECT]", "[LOCATION]", "[REGISTRATION]").toString();
      DnsSettings dnsSettings = DnsSettings.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      Registration response =
          domainsClient.configureDnsSettingsAsync(registration, dnsSettings, updateMask).get();
    }
  }
}
// [END domains_v1alpha2_generated_Domains_ConfigureDnsSettings_StringDnssettingsFieldmask_sync]
