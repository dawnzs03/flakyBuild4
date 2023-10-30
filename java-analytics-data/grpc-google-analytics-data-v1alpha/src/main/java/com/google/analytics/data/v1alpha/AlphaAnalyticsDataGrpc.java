/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.analytics.data.v1alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 *
 *
 * <pre>
 * Google Analytics reporting data service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/analytics/data/v1alpha/analytics_data_api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AlphaAnalyticsDataGrpc {

  private AlphaAnalyticsDataGrpc() {}

  public static final String SERVICE_NAME = "google.analytics.data.v1alpha.AlphaAnalyticsData";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.analytics.data.v1alpha.RunFunnelReportRequest,
          com.google.analytics.data.v1alpha.RunFunnelReportResponse>
      getRunFunnelReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RunFunnelReport",
      requestType = com.google.analytics.data.v1alpha.RunFunnelReportRequest.class,
      responseType = com.google.analytics.data.v1alpha.RunFunnelReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.analytics.data.v1alpha.RunFunnelReportRequest,
          com.google.analytics.data.v1alpha.RunFunnelReportResponse>
      getRunFunnelReportMethod() {
    io.grpc.MethodDescriptor<
            com.google.analytics.data.v1alpha.RunFunnelReportRequest,
            com.google.analytics.data.v1alpha.RunFunnelReportResponse>
        getRunFunnelReportMethod;
    if ((getRunFunnelReportMethod = AlphaAnalyticsDataGrpc.getRunFunnelReportMethod) == null) {
      synchronized (AlphaAnalyticsDataGrpc.class) {
        if ((getRunFunnelReportMethod = AlphaAnalyticsDataGrpc.getRunFunnelReportMethod) == null) {
          AlphaAnalyticsDataGrpc.getRunFunnelReportMethod =
              getRunFunnelReportMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.analytics.data.v1alpha.RunFunnelReportRequest,
                          com.google.analytics.data.v1alpha.RunFunnelReportResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RunFunnelReport"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.analytics.data.v1alpha.RunFunnelReportRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.analytics.data.v1alpha.RunFunnelReportResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new AlphaAnalyticsDataMethodDescriptorSupplier("RunFunnelReport"))
                      .build();
        }
      }
    }
    return getRunFunnelReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.analytics.data.v1alpha.CreateAudienceListRequest,
          com.google.longrunning.Operation>
      getCreateAudienceListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAudienceList",
      requestType = com.google.analytics.data.v1alpha.CreateAudienceListRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.analytics.data.v1alpha.CreateAudienceListRequest,
          com.google.longrunning.Operation>
      getCreateAudienceListMethod() {
    io.grpc.MethodDescriptor<
            com.google.analytics.data.v1alpha.CreateAudienceListRequest,
            com.google.longrunning.Operation>
        getCreateAudienceListMethod;
    if ((getCreateAudienceListMethod = AlphaAnalyticsDataGrpc.getCreateAudienceListMethod)
        == null) {
      synchronized (AlphaAnalyticsDataGrpc.class) {
        if ((getCreateAudienceListMethod = AlphaAnalyticsDataGrpc.getCreateAudienceListMethod)
            == null) {
          AlphaAnalyticsDataGrpc.getCreateAudienceListMethod =
              getCreateAudienceListMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.analytics.data.v1alpha.CreateAudienceListRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAudienceList"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.analytics.data.v1alpha.CreateAudienceListRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new AlphaAnalyticsDataMethodDescriptorSupplier("CreateAudienceList"))
                      .build();
        }
      }
    }
    return getCreateAudienceListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.analytics.data.v1alpha.QueryAudienceListRequest,
          com.google.analytics.data.v1alpha.QueryAudienceListResponse>
      getQueryAudienceListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryAudienceList",
      requestType = com.google.analytics.data.v1alpha.QueryAudienceListRequest.class,
      responseType = com.google.analytics.data.v1alpha.QueryAudienceListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.analytics.data.v1alpha.QueryAudienceListRequest,
          com.google.analytics.data.v1alpha.QueryAudienceListResponse>
      getQueryAudienceListMethod() {
    io.grpc.MethodDescriptor<
            com.google.analytics.data.v1alpha.QueryAudienceListRequest,
            com.google.analytics.data.v1alpha.QueryAudienceListResponse>
        getQueryAudienceListMethod;
    if ((getQueryAudienceListMethod = AlphaAnalyticsDataGrpc.getQueryAudienceListMethod) == null) {
      synchronized (AlphaAnalyticsDataGrpc.class) {
        if ((getQueryAudienceListMethod = AlphaAnalyticsDataGrpc.getQueryAudienceListMethod)
            == null) {
          AlphaAnalyticsDataGrpc.getQueryAudienceListMethod =
              getQueryAudienceListMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.analytics.data.v1alpha.QueryAudienceListRequest,
                          com.google.analytics.data.v1alpha.QueryAudienceListResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryAudienceList"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.analytics.data.v1alpha.QueryAudienceListRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.analytics.data.v1alpha.QueryAudienceListResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new AlphaAnalyticsDataMethodDescriptorSupplier("QueryAudienceList"))
                      .build();
        }
      }
    }
    return getQueryAudienceListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.analytics.data.v1alpha.GetAudienceListRequest,
          com.google.analytics.data.v1alpha.AudienceList>
      getGetAudienceListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAudienceList",
      requestType = com.google.analytics.data.v1alpha.GetAudienceListRequest.class,
      responseType = com.google.analytics.data.v1alpha.AudienceList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.analytics.data.v1alpha.GetAudienceListRequest,
          com.google.analytics.data.v1alpha.AudienceList>
      getGetAudienceListMethod() {
    io.grpc.MethodDescriptor<
            com.google.analytics.data.v1alpha.GetAudienceListRequest,
            com.google.analytics.data.v1alpha.AudienceList>
        getGetAudienceListMethod;
    if ((getGetAudienceListMethod = AlphaAnalyticsDataGrpc.getGetAudienceListMethod) == null) {
      synchronized (AlphaAnalyticsDataGrpc.class) {
        if ((getGetAudienceListMethod = AlphaAnalyticsDataGrpc.getGetAudienceListMethod) == null) {
          AlphaAnalyticsDataGrpc.getGetAudienceListMethod =
              getGetAudienceListMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.analytics.data.v1alpha.GetAudienceListRequest,
                          com.google.analytics.data.v1alpha.AudienceList>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAudienceList"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.analytics.data.v1alpha.GetAudienceListRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.analytics.data.v1alpha.AudienceList.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new AlphaAnalyticsDataMethodDescriptorSupplier("GetAudienceList"))
                      .build();
        }
      }
    }
    return getGetAudienceListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.analytics.data.v1alpha.ListAudienceListsRequest,
          com.google.analytics.data.v1alpha.ListAudienceListsResponse>
      getListAudienceListsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAudienceLists",
      requestType = com.google.analytics.data.v1alpha.ListAudienceListsRequest.class,
      responseType = com.google.analytics.data.v1alpha.ListAudienceListsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.analytics.data.v1alpha.ListAudienceListsRequest,
          com.google.analytics.data.v1alpha.ListAudienceListsResponse>
      getListAudienceListsMethod() {
    io.grpc.MethodDescriptor<
            com.google.analytics.data.v1alpha.ListAudienceListsRequest,
            com.google.analytics.data.v1alpha.ListAudienceListsResponse>
        getListAudienceListsMethod;
    if ((getListAudienceListsMethod = AlphaAnalyticsDataGrpc.getListAudienceListsMethod) == null) {
      synchronized (AlphaAnalyticsDataGrpc.class) {
        if ((getListAudienceListsMethod = AlphaAnalyticsDataGrpc.getListAudienceListsMethod)
            == null) {
          AlphaAnalyticsDataGrpc.getListAudienceListsMethod =
              getListAudienceListsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.analytics.data.v1alpha.ListAudienceListsRequest,
                          com.google.analytics.data.v1alpha.ListAudienceListsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAudienceLists"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.analytics.data.v1alpha.ListAudienceListsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.analytics.data.v1alpha.ListAudienceListsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new AlphaAnalyticsDataMethodDescriptorSupplier("ListAudienceLists"))
                      .build();
        }
      }
    }
    return getListAudienceListsMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static AlphaAnalyticsDataStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlphaAnalyticsDataStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<AlphaAnalyticsDataStub>() {
          @java.lang.Override
          public AlphaAnalyticsDataStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new AlphaAnalyticsDataStub(channel, callOptions);
          }
        };
    return AlphaAnalyticsDataStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AlphaAnalyticsDataBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlphaAnalyticsDataBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<AlphaAnalyticsDataBlockingStub>() {
          @java.lang.Override
          public AlphaAnalyticsDataBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new AlphaAnalyticsDataBlockingStub(channel, callOptions);
          }
        };
    return AlphaAnalyticsDataBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static AlphaAnalyticsDataFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlphaAnalyticsDataFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<AlphaAnalyticsDataFutureStub>() {
          @java.lang.Override
          public AlphaAnalyticsDataFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new AlphaAnalyticsDataFutureStub(channel, callOptions);
          }
        };
    return AlphaAnalyticsDataFutureStub.newStub(factory, channel);
  }

  /**
   *
   *
   * <pre>
   * Google Analytics reporting data service.
   * </pre>
   */
  public interface AsyncService {

    /**
     *
     *
     * <pre>
     * Returns a customized funnel report of your Google Analytics event data. The
     * data returned from the API is as a table with columns for the requested
     * dimensions and metrics.
     * Funnel exploration lets you visualize the steps your users take to complete
     * a task and quickly see how well they are succeeding or failing at each
     * step. For example, how do prospects become shoppers and then become buyers?
     * How do one time buyers become repeat buyers? With this information, you can
     * improve inefficient or abandoned customer journeys. To learn more, see [GA4
     * Funnel Explorations](https://support.google.com/analytics/answer/9327974).
     * This method is introduced at alpha stability with the intention of
     * gathering feedback on syntax and capabilities before entering beta. To give
     * your feedback on this API, complete the [Google Analytics Data API Funnel
     * Reporting
     * Feedback](https://docs.google.com/forms/d/e/1FAIpQLSdwOlQDJAUoBiIgUZZ3S_Lwi8gr7Bb0k1jhvc-DEg7Rol3UjA/viewform).
     * </pre>
     */
    default void runFunnelReport(
        com.google.analytics.data.v1alpha.RunFunnelReportRequest request,
        io.grpc.stub.StreamObserver<com.google.analytics.data.v1alpha.RunFunnelReportResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getRunFunnelReportMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates an audience list for later retrieval. This method quickly returns
     * the audience list's resource name and initiates a long running asynchronous
     * request to form an audience list. To list the users in an audience list,
     * first create the audience list through this method and then send the
     * audience resource name to the `QueryAudienceList` method.
     * An audience list is a snapshot of the users currently in the audience at
     * the time of audience list creation. Creating audience lists for one
     * audience on different days will return different results as users enter and
     * exit the audience.
     * Audiences in Google Analytics 4 allow you to segment your users in the ways
     * that are important to your business. To learn more, see
     * https://support.google.com/analytics/answer/9267572. Audience lists contain
     * the users in each audience.
     * </pre>
     */
    default void createAudienceList(
        com.google.analytics.data.v1alpha.CreateAudienceListRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getCreateAudienceListMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Retrieves an audience list of users. After creating an audience, the users
     * are not immediately available for listing. First, a request to
     * `CreateAudienceList` is necessary to create an audience list of users, and
     * then second, this method is used to retrieve the users in the audience.
     * Audiences in Google Analytics 4 allow you to segment your users in the ways
     * that are important to your business. To learn more, see
     * https://support.google.com/analytics/answer/9267572.
     * </pre>
     */
    default void queryAudienceList(
        com.google.analytics.data.v1alpha.QueryAudienceListRequest request,
        io.grpc.stub.StreamObserver<com.google.analytics.data.v1alpha.QueryAudienceListResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getQueryAudienceListMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets configuration metadata about a specific audience list. This method
     * can be used to understand an audience list after it has been created.
     * </pre>
     */
    default void getAudienceList(
        com.google.analytics.data.v1alpha.GetAudienceListRequest request,
        io.grpc.stub.StreamObserver<com.google.analytics.data.v1alpha.AudienceList>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getGetAudienceListMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists all audience lists for a property. This method can be used for you to
     * find and reuse existing audience lists rather than creating unnecessary new
     * audience lists. The same audience can have multiple audience lists that
     * represent the list of users that were in an audience on different days.
     * </pre>
     */
    default void listAudienceLists(
        com.google.analytics.data.v1alpha.ListAudienceListsRequest request,
        io.grpc.stub.StreamObserver<com.google.analytics.data.v1alpha.ListAudienceListsResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getListAudienceListsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AlphaAnalyticsData.
   *
   * <pre>
   * Google Analytics reporting data service.
   * </pre>
   */
  public abstract static class AlphaAnalyticsDataImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return AlphaAnalyticsDataGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AlphaAnalyticsData.
   *
   * <pre>
   * Google Analytics reporting data service.
   * </pre>
   */
  public static final class AlphaAnalyticsDataStub
      extends io.grpc.stub.AbstractAsyncStub<AlphaAnalyticsDataStub> {
    private AlphaAnalyticsDataStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlphaAnalyticsDataStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlphaAnalyticsDataStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Returns a customized funnel report of your Google Analytics event data. The
     * data returned from the API is as a table with columns for the requested
     * dimensions and metrics.
     * Funnel exploration lets you visualize the steps your users take to complete
     * a task and quickly see how well they are succeeding or failing at each
     * step. For example, how do prospects become shoppers and then become buyers?
     * How do one time buyers become repeat buyers? With this information, you can
     * improve inefficient or abandoned customer journeys. To learn more, see [GA4
     * Funnel Explorations](https://support.google.com/analytics/answer/9327974).
     * This method is introduced at alpha stability with the intention of
     * gathering feedback on syntax and capabilities before entering beta. To give
     * your feedback on this API, complete the [Google Analytics Data API Funnel
     * Reporting
     * Feedback](https://docs.google.com/forms/d/e/1FAIpQLSdwOlQDJAUoBiIgUZZ3S_Lwi8gr7Bb0k1jhvc-DEg7Rol3UjA/viewform).
     * </pre>
     */
    public void runFunnelReport(
        com.google.analytics.data.v1alpha.RunFunnelReportRequest request,
        io.grpc.stub.StreamObserver<com.google.analytics.data.v1alpha.RunFunnelReportResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRunFunnelReportMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates an audience list for later retrieval. This method quickly returns
     * the audience list's resource name and initiates a long running asynchronous
     * request to form an audience list. To list the users in an audience list,
     * first create the audience list through this method and then send the
     * audience resource name to the `QueryAudienceList` method.
     * An audience list is a snapshot of the users currently in the audience at
     * the time of audience list creation. Creating audience lists for one
     * audience on different days will return different results as users enter and
     * exit the audience.
     * Audiences in Google Analytics 4 allow you to segment your users in the ways
     * that are important to your business. To learn more, see
     * https://support.google.com/analytics/answer/9267572. Audience lists contain
     * the users in each audience.
     * </pre>
     */
    public void createAudienceList(
        com.google.analytics.data.v1alpha.CreateAudienceListRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAudienceListMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Retrieves an audience list of users. After creating an audience, the users
     * are not immediately available for listing. First, a request to
     * `CreateAudienceList` is necessary to create an audience list of users, and
     * then second, this method is used to retrieve the users in the audience.
     * Audiences in Google Analytics 4 allow you to segment your users in the ways
     * that are important to your business. To learn more, see
     * https://support.google.com/analytics/answer/9267572.
     * </pre>
     */
    public void queryAudienceList(
        com.google.analytics.data.v1alpha.QueryAudienceListRequest request,
        io.grpc.stub.StreamObserver<com.google.analytics.data.v1alpha.QueryAudienceListResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryAudienceListMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets configuration metadata about a specific audience list. This method
     * can be used to understand an audience list after it has been created.
     * </pre>
     */
    public void getAudienceList(
        com.google.analytics.data.v1alpha.GetAudienceListRequest request,
        io.grpc.stub.StreamObserver<com.google.analytics.data.v1alpha.AudienceList>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAudienceListMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists all audience lists for a property. This method can be used for you to
     * find and reuse existing audience lists rather than creating unnecessary new
     * audience lists. The same audience can have multiple audience lists that
     * represent the list of users that were in an audience on different days.
     * </pre>
     */
    public void listAudienceLists(
        com.google.analytics.data.v1alpha.ListAudienceListsRequest request,
        io.grpc.stub.StreamObserver<com.google.analytics.data.v1alpha.ListAudienceListsResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAudienceListsMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AlphaAnalyticsData.
   *
   * <pre>
   * Google Analytics reporting data service.
   * </pre>
   */
  public static final class AlphaAnalyticsDataBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AlphaAnalyticsDataBlockingStub> {
    private AlphaAnalyticsDataBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlphaAnalyticsDataBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlphaAnalyticsDataBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Returns a customized funnel report of your Google Analytics event data. The
     * data returned from the API is as a table with columns for the requested
     * dimensions and metrics.
     * Funnel exploration lets you visualize the steps your users take to complete
     * a task and quickly see how well they are succeeding or failing at each
     * step. For example, how do prospects become shoppers and then become buyers?
     * How do one time buyers become repeat buyers? With this information, you can
     * improve inefficient or abandoned customer journeys. To learn more, see [GA4
     * Funnel Explorations](https://support.google.com/analytics/answer/9327974).
     * This method is introduced at alpha stability with the intention of
     * gathering feedback on syntax and capabilities before entering beta. To give
     * your feedback on this API, complete the [Google Analytics Data API Funnel
     * Reporting
     * Feedback](https://docs.google.com/forms/d/e/1FAIpQLSdwOlQDJAUoBiIgUZZ3S_Lwi8gr7Bb0k1jhvc-DEg7Rol3UjA/viewform).
     * </pre>
     */
    public com.google.analytics.data.v1alpha.RunFunnelReportResponse runFunnelReport(
        com.google.analytics.data.v1alpha.RunFunnelReportRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRunFunnelReportMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates an audience list for later retrieval. This method quickly returns
     * the audience list's resource name and initiates a long running asynchronous
     * request to form an audience list. To list the users in an audience list,
     * first create the audience list through this method and then send the
     * audience resource name to the `QueryAudienceList` method.
     * An audience list is a snapshot of the users currently in the audience at
     * the time of audience list creation. Creating audience lists for one
     * audience on different days will return different results as users enter and
     * exit the audience.
     * Audiences in Google Analytics 4 allow you to segment your users in the ways
     * that are important to your business. To learn more, see
     * https://support.google.com/analytics/answer/9267572. Audience lists contain
     * the users in each audience.
     * </pre>
     */
    public com.google.longrunning.Operation createAudienceList(
        com.google.analytics.data.v1alpha.CreateAudienceListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAudienceListMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Retrieves an audience list of users. After creating an audience, the users
     * are not immediately available for listing. First, a request to
     * `CreateAudienceList` is necessary to create an audience list of users, and
     * then second, this method is used to retrieve the users in the audience.
     * Audiences in Google Analytics 4 allow you to segment your users in the ways
     * that are important to your business. To learn more, see
     * https://support.google.com/analytics/answer/9267572.
     * </pre>
     */
    public com.google.analytics.data.v1alpha.QueryAudienceListResponse queryAudienceList(
        com.google.analytics.data.v1alpha.QueryAudienceListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryAudienceListMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets configuration metadata about a specific audience list. This method
     * can be used to understand an audience list after it has been created.
     * </pre>
     */
    public com.google.analytics.data.v1alpha.AudienceList getAudienceList(
        com.google.analytics.data.v1alpha.GetAudienceListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAudienceListMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists all audience lists for a property. This method can be used for you to
     * find and reuse existing audience lists rather than creating unnecessary new
     * audience lists. The same audience can have multiple audience lists that
     * represent the list of users that were in an audience on different days.
     * </pre>
     */
    public com.google.analytics.data.v1alpha.ListAudienceListsResponse listAudienceLists(
        com.google.analytics.data.v1alpha.ListAudienceListsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAudienceListsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AlphaAnalyticsData.
   *
   * <pre>
   * Google Analytics reporting data service.
   * </pre>
   */
  public static final class AlphaAnalyticsDataFutureStub
      extends io.grpc.stub.AbstractFutureStub<AlphaAnalyticsDataFutureStub> {
    private AlphaAnalyticsDataFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlphaAnalyticsDataFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlphaAnalyticsDataFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Returns a customized funnel report of your Google Analytics event data. The
     * data returned from the API is as a table with columns for the requested
     * dimensions and metrics.
     * Funnel exploration lets you visualize the steps your users take to complete
     * a task and quickly see how well they are succeeding or failing at each
     * step. For example, how do prospects become shoppers and then become buyers?
     * How do one time buyers become repeat buyers? With this information, you can
     * improve inefficient or abandoned customer journeys. To learn more, see [GA4
     * Funnel Explorations](https://support.google.com/analytics/answer/9327974).
     * This method is introduced at alpha stability with the intention of
     * gathering feedback on syntax and capabilities before entering beta. To give
     * your feedback on this API, complete the [Google Analytics Data API Funnel
     * Reporting
     * Feedback](https://docs.google.com/forms/d/e/1FAIpQLSdwOlQDJAUoBiIgUZZ3S_Lwi8gr7Bb0k1jhvc-DEg7Rol3UjA/viewform).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.analytics.data.v1alpha.RunFunnelReportResponse>
        runFunnelReport(com.google.analytics.data.v1alpha.RunFunnelReportRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRunFunnelReportMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates an audience list for later retrieval. This method quickly returns
     * the audience list's resource name and initiates a long running asynchronous
     * request to form an audience list. To list the users in an audience list,
     * first create the audience list through this method and then send the
     * audience resource name to the `QueryAudienceList` method.
     * An audience list is a snapshot of the users currently in the audience at
     * the time of audience list creation. Creating audience lists for one
     * audience on different days will return different results as users enter and
     * exit the audience.
     * Audiences in Google Analytics 4 allow you to segment your users in the ways
     * that are important to your business. To learn more, see
     * https://support.google.com/analytics/answer/9267572. Audience lists contain
     * the users in each audience.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        createAudienceList(com.google.analytics.data.v1alpha.CreateAudienceListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAudienceListMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Retrieves an audience list of users. After creating an audience, the users
     * are not immediately available for listing. First, a request to
     * `CreateAudienceList` is necessary to create an audience list of users, and
     * then second, this method is used to retrieve the users in the audience.
     * Audiences in Google Analytics 4 allow you to segment your users in the ways
     * that are important to your business. To learn more, see
     * https://support.google.com/analytics/answer/9267572.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.analytics.data.v1alpha.QueryAudienceListResponse>
        queryAudienceList(com.google.analytics.data.v1alpha.QueryAudienceListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryAudienceListMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets configuration metadata about a specific audience list. This method
     * can be used to understand an audience list after it has been created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.analytics.data.v1alpha.AudienceList>
        getAudienceList(com.google.analytics.data.v1alpha.GetAudienceListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAudienceListMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists all audience lists for a property. This method can be used for you to
     * find and reuse existing audience lists rather than creating unnecessary new
     * audience lists. The same audience can have multiple audience lists that
     * represent the list of users that were in an audience on different days.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.analytics.data.v1alpha.ListAudienceListsResponse>
        listAudienceLists(com.google.analytics.data.v1alpha.ListAudienceListsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAudienceListsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RUN_FUNNEL_REPORT = 0;
  private static final int METHODID_CREATE_AUDIENCE_LIST = 1;
  private static final int METHODID_QUERY_AUDIENCE_LIST = 2;
  private static final int METHODID_GET_AUDIENCE_LIST = 3;
  private static final int METHODID_LIST_AUDIENCE_LISTS = 4;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RUN_FUNNEL_REPORT:
          serviceImpl.runFunnelReport(
              (com.google.analytics.data.v1alpha.RunFunnelReportRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.analytics.data.v1alpha.RunFunnelReportResponse>)
                  responseObserver);
          break;
        case METHODID_CREATE_AUDIENCE_LIST:
          serviceImpl.createAudienceList(
              (com.google.analytics.data.v1alpha.CreateAudienceListRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_QUERY_AUDIENCE_LIST:
          serviceImpl.queryAudienceList(
              (com.google.analytics.data.v1alpha.QueryAudienceListRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.analytics.data.v1alpha.QueryAudienceListResponse>)
                  responseObserver);
          break;
        case METHODID_GET_AUDIENCE_LIST:
          serviceImpl.getAudienceList(
              (com.google.analytics.data.v1alpha.GetAudienceListRequest) request,
              (io.grpc.stub.StreamObserver<com.google.analytics.data.v1alpha.AudienceList>)
                  responseObserver);
          break;
        case METHODID_LIST_AUDIENCE_LISTS:
          serviceImpl.listAudienceLists(
              (com.google.analytics.data.v1alpha.ListAudienceListsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.analytics.data.v1alpha.ListAudienceListsResponse>)
                  responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
            getRunFunnelReportMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.analytics.data.v1alpha.RunFunnelReportRequest,
                    com.google.analytics.data.v1alpha.RunFunnelReportResponse>(
                    service, METHODID_RUN_FUNNEL_REPORT)))
        .addMethod(
            getCreateAudienceListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.analytics.data.v1alpha.CreateAudienceListRequest,
                    com.google.longrunning.Operation>(service, METHODID_CREATE_AUDIENCE_LIST)))
        .addMethod(
            getQueryAudienceListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.analytics.data.v1alpha.QueryAudienceListRequest,
                    com.google.analytics.data.v1alpha.QueryAudienceListResponse>(
                    service, METHODID_QUERY_AUDIENCE_LIST)))
        .addMethod(
            getGetAudienceListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.analytics.data.v1alpha.GetAudienceListRequest,
                    com.google.analytics.data.v1alpha.AudienceList>(
                    service, METHODID_GET_AUDIENCE_LIST)))
        .addMethod(
            getListAudienceListsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.analytics.data.v1alpha.ListAudienceListsRequest,
                    com.google.analytics.data.v1alpha.ListAudienceListsResponse>(
                    service, METHODID_LIST_AUDIENCE_LISTS)))
        .build();
  }

  private abstract static class AlphaAnalyticsDataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AlphaAnalyticsDataBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.analytics.data.v1alpha.AnalyticsDataApiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AlphaAnalyticsData");
    }
  }

  private static final class AlphaAnalyticsDataFileDescriptorSupplier
      extends AlphaAnalyticsDataBaseDescriptorSupplier {
    AlphaAnalyticsDataFileDescriptorSupplier() {}
  }

  private static final class AlphaAnalyticsDataMethodDescriptorSupplier
      extends AlphaAnalyticsDataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AlphaAnalyticsDataMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AlphaAnalyticsDataGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new AlphaAnalyticsDataFileDescriptorSupplier())
                      .addMethod(getRunFunnelReportMethod())
                      .addMethod(getCreateAudienceListMethod())
                      .addMethod(getQueryAudienceListMethod())
                      .addMethod(getGetAudienceListMethod())
                      .addMethod(getListAudienceListsMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
