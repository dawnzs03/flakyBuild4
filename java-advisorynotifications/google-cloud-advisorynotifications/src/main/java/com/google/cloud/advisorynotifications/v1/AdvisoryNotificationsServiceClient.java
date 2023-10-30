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

package com.google.cloud.advisorynotifications.v1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.advisorynotifications.v1.stub.AdvisoryNotificationsServiceStub;
import com.google.cloud.advisorynotifications.v1.stub.AdvisoryNotificationsServiceStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to manage Security and Privacy Notifications.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (AdvisoryNotificationsServiceClient advisoryNotificationsServiceClient =
 *     AdvisoryNotificationsServiceClient.create()) {
 *   NotificationName name = NotificationName.of("[ORGANIZATION]", "[LOCATION]", "[NOTIFICATION]");
 *   Notification response = advisoryNotificationsServiceClient.getNotification(name);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the AdvisoryNotificationsServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of
 * AdvisoryNotificationsServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AdvisoryNotificationsServiceSettings advisoryNotificationsServiceSettings =
 *     AdvisoryNotificationsServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AdvisoryNotificationsServiceClient advisoryNotificationsServiceClient =
 *     AdvisoryNotificationsServiceClient.create(advisoryNotificationsServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AdvisoryNotificationsServiceSettings advisoryNotificationsServiceSettings =
 *     AdvisoryNotificationsServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AdvisoryNotificationsServiceClient advisoryNotificationsServiceClient =
 *     AdvisoryNotificationsServiceClient.create(advisoryNotificationsServiceSettings);
 * }</pre>
 *
 * <p>To use REST (HTTP1.1/JSON) transport (instead of gRPC) for sending and receiving requests over
 * the wire:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AdvisoryNotificationsServiceSettings advisoryNotificationsServiceSettings =
 *     AdvisoryNotificationsServiceSettings.newHttpJsonBuilder().build();
 * AdvisoryNotificationsServiceClient advisoryNotificationsServiceClient =
 *     AdvisoryNotificationsServiceClient.create(advisoryNotificationsServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class AdvisoryNotificationsServiceClient implements BackgroundResource {
  private final AdvisoryNotificationsServiceSettings settings;
  private final AdvisoryNotificationsServiceStub stub;

  /** Constructs an instance of AdvisoryNotificationsServiceClient with default settings. */
  public static final AdvisoryNotificationsServiceClient create() throws IOException {
    return create(AdvisoryNotificationsServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AdvisoryNotificationsServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final AdvisoryNotificationsServiceClient create(
      AdvisoryNotificationsServiceSettings settings) throws IOException {
    return new AdvisoryNotificationsServiceClient(settings);
  }

  /**
   * Constructs an instance of AdvisoryNotificationsServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(AdvisoryNotificationsServiceSettings).
   */
  public static final AdvisoryNotificationsServiceClient create(
      AdvisoryNotificationsServiceStub stub) {
    return new AdvisoryNotificationsServiceClient(stub);
  }

  /**
   * Constructs an instance of AdvisoryNotificationsServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected AdvisoryNotificationsServiceClient(AdvisoryNotificationsServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub =
        ((AdvisoryNotificationsServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected AdvisoryNotificationsServiceClient(AdvisoryNotificationsServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AdvisoryNotificationsServiceSettings getSettings() {
    return settings;
  }

  public AdvisoryNotificationsServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists notifications under a given parent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdvisoryNotificationsServiceClient advisoryNotificationsServiceClient =
   *     AdvisoryNotificationsServiceClient.create()) {
   *   LocationName parent = LocationName.of("[ORGANIZATION]", "[LOCATION]");
   *   for (Notification element :
   *       advisoryNotificationsServiceClient.listNotifications(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent, which owns this collection of notifications. Must be of the
   *     form "organizations/{organization}/locations/{location}".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListNotificationsPagedResponse listNotifications(LocationName parent) {
    ListNotificationsRequest request =
        ListNotificationsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listNotifications(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists notifications under a given parent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdvisoryNotificationsServiceClient advisoryNotificationsServiceClient =
   *     AdvisoryNotificationsServiceClient.create()) {
   *   String parent = LocationName.of("[ORGANIZATION]", "[LOCATION]").toString();
   *   for (Notification element :
   *       advisoryNotificationsServiceClient.listNotifications(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent, which owns this collection of notifications. Must be of the
   *     form "organizations/{organization}/locations/{location}".
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListNotificationsPagedResponse listNotifications(String parent) {
    ListNotificationsRequest request =
        ListNotificationsRequest.newBuilder().setParent(parent).build();
    return listNotifications(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists notifications under a given parent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdvisoryNotificationsServiceClient advisoryNotificationsServiceClient =
   *     AdvisoryNotificationsServiceClient.create()) {
   *   ListNotificationsRequest request =
   *       ListNotificationsRequest.newBuilder()
   *           .setParent(LocationName.of("[ORGANIZATION]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setView(NotificationView.forNumber(0))
   *           .setLanguageCode("languageCode-2092349083")
   *           .build();
   *   for (Notification element :
   *       advisoryNotificationsServiceClient.listNotifications(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListNotificationsPagedResponse listNotifications(ListNotificationsRequest request) {
    return listNotificationsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists notifications under a given parent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdvisoryNotificationsServiceClient advisoryNotificationsServiceClient =
   *     AdvisoryNotificationsServiceClient.create()) {
   *   ListNotificationsRequest request =
   *       ListNotificationsRequest.newBuilder()
   *           .setParent(LocationName.of("[ORGANIZATION]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setView(NotificationView.forNumber(0))
   *           .setLanguageCode("languageCode-2092349083")
   *           .build();
   *   ApiFuture<Notification> future =
   *       advisoryNotificationsServiceClient.listNotificationsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Notification element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListNotificationsRequest, ListNotificationsPagedResponse>
      listNotificationsPagedCallable() {
    return stub.listNotificationsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists notifications under a given parent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdvisoryNotificationsServiceClient advisoryNotificationsServiceClient =
   *     AdvisoryNotificationsServiceClient.create()) {
   *   ListNotificationsRequest request =
   *       ListNotificationsRequest.newBuilder()
   *           .setParent(LocationName.of("[ORGANIZATION]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setView(NotificationView.forNumber(0))
   *           .setLanguageCode("languageCode-2092349083")
   *           .build();
   *   while (true) {
   *     ListNotificationsResponse response =
   *         advisoryNotificationsServiceClient.listNotificationsCallable().call(request);
   *     for (Notification element : response.getNotificationsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListNotificationsRequest, ListNotificationsResponse>
      listNotificationsCallable() {
    return stub.listNotificationsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a notification.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdvisoryNotificationsServiceClient advisoryNotificationsServiceClient =
   *     AdvisoryNotificationsServiceClient.create()) {
   *   NotificationName name = NotificationName.of("[ORGANIZATION]", "[LOCATION]", "[NOTIFICATION]");
   *   Notification response = advisoryNotificationsServiceClient.getNotification(name);
   * }
   * }</pre>
   *
   * @param name Required. A name of the notification to retrieve. Format:
   *     organizations/{organization}/locations/{location}/notifications/{notification}.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Notification getNotification(NotificationName name) {
    GetNotificationRequest request =
        GetNotificationRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getNotification(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a notification.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdvisoryNotificationsServiceClient advisoryNotificationsServiceClient =
   *     AdvisoryNotificationsServiceClient.create()) {
   *   String name =
   *       NotificationName.of("[ORGANIZATION]", "[LOCATION]", "[NOTIFICATION]").toString();
   *   Notification response = advisoryNotificationsServiceClient.getNotification(name);
   * }
   * }</pre>
   *
   * @param name Required. A name of the notification to retrieve. Format:
   *     organizations/{organization}/locations/{location}/notifications/{notification}.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Notification getNotification(String name) {
    GetNotificationRequest request = GetNotificationRequest.newBuilder().setName(name).build();
    return getNotification(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a notification.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdvisoryNotificationsServiceClient advisoryNotificationsServiceClient =
   *     AdvisoryNotificationsServiceClient.create()) {
   *   GetNotificationRequest request =
   *       GetNotificationRequest.newBuilder()
   *           .setName(
   *               NotificationName.of("[ORGANIZATION]", "[LOCATION]", "[NOTIFICATION]").toString())
   *           .setLanguageCode("languageCode-2092349083")
   *           .build();
   *   Notification response = advisoryNotificationsServiceClient.getNotification(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Notification getNotification(GetNotificationRequest request) {
    return getNotificationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a notification.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AdvisoryNotificationsServiceClient advisoryNotificationsServiceClient =
   *     AdvisoryNotificationsServiceClient.create()) {
   *   GetNotificationRequest request =
   *       GetNotificationRequest.newBuilder()
   *           .setName(
   *               NotificationName.of("[ORGANIZATION]", "[LOCATION]", "[NOTIFICATION]").toString())
   *           .setLanguageCode("languageCode-2092349083")
   *           .build();
   *   ApiFuture<Notification> future =
   *       advisoryNotificationsServiceClient.getNotificationCallable().futureCall(request);
   *   // Do something.
   *   Notification response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetNotificationRequest, Notification> getNotificationCallable() {
    return stub.getNotificationCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListNotificationsPagedResponse
      extends AbstractPagedListResponse<
          ListNotificationsRequest,
          ListNotificationsResponse,
          Notification,
          ListNotificationsPage,
          ListNotificationsFixedSizeCollection> {

    public static ApiFuture<ListNotificationsPagedResponse> createAsync(
        PageContext<ListNotificationsRequest, ListNotificationsResponse, Notification> context,
        ApiFuture<ListNotificationsResponse> futureResponse) {
      ApiFuture<ListNotificationsPage> futurePage =
          ListNotificationsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListNotificationsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListNotificationsPagedResponse(ListNotificationsPage page) {
      super(page, ListNotificationsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListNotificationsPage
      extends AbstractPage<
          ListNotificationsRequest,
          ListNotificationsResponse,
          Notification,
          ListNotificationsPage> {

    private ListNotificationsPage(
        PageContext<ListNotificationsRequest, ListNotificationsResponse, Notification> context,
        ListNotificationsResponse response) {
      super(context, response);
    }

    private static ListNotificationsPage createEmptyPage() {
      return new ListNotificationsPage(null, null);
    }

    @Override
    protected ListNotificationsPage createPage(
        PageContext<ListNotificationsRequest, ListNotificationsResponse, Notification> context,
        ListNotificationsResponse response) {
      return new ListNotificationsPage(context, response);
    }

    @Override
    public ApiFuture<ListNotificationsPage> createPageAsync(
        PageContext<ListNotificationsRequest, ListNotificationsResponse, Notification> context,
        ApiFuture<ListNotificationsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListNotificationsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListNotificationsRequest,
          ListNotificationsResponse,
          Notification,
          ListNotificationsPage,
          ListNotificationsFixedSizeCollection> {

    private ListNotificationsFixedSizeCollection(
        List<ListNotificationsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListNotificationsFixedSizeCollection createEmptyCollection() {
      return new ListNotificationsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListNotificationsFixedSizeCollection createCollection(
        List<ListNotificationsPage> pages, int collectionSize) {
      return new ListNotificationsFixedSizeCollection(pages, collectionSize);
    }
  }
}
