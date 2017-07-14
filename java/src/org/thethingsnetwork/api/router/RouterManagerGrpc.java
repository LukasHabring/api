package org.thethingsnetwork.api.router;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * The RouterManager service provides configuration and monitoring functionality
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.0-SNAPSHOT)",
    comments = "Source: github.com/TheThingsNetwork/api/router/router.proto")
public final class RouterManagerGrpc {

  private RouterManagerGrpc() {}

  public static final String SERVICE_NAME = "router.RouterManager";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.GatewayStatusRequest,
      org.thethingsnetwork.api.router.GatewayStatusResponse> METHOD_GATEWAY_STATUS =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.router.GatewayStatusRequest, org.thethingsnetwork.api.router.GatewayStatusResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "router.RouterManager", "GatewayStatus"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.router.GatewayStatusRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.router.GatewayStatusResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.router.StatusRequest,
      org.thethingsnetwork.api.router.Status> METHOD_GET_STATUS =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.router.StatusRequest, org.thethingsnetwork.api.router.Status>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "router.RouterManager", "GetStatus"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.router.StatusRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.router.Status.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RouterManagerStub newStub(io.grpc.Channel channel) {
    return new RouterManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RouterManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RouterManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RouterManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RouterManagerFutureStub(channel);
  }

  /**
   * <pre>
   * The RouterManager service provides configuration and monitoring functionality
   * </pre>
   */
  public static abstract class RouterManagerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Gateway owner or network operator requests Gateway status from Router Manager
     * Deprecated: Use monitor API (NOC) instead of this
     * </pre>
     */
    public void gatewayStatus(org.thethingsnetwork.api.router.GatewayStatusRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.GatewayStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GATEWAY_STATUS, responseObserver);
    }

    /**
     * <pre>
     * Network operator requests Router status
     * </pre>
     */
    public void getStatus(org.thethingsnetwork.api.router.StatusRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.Status> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_STATUS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GATEWAY_STATUS,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.router.GatewayStatusRequest,
                org.thethingsnetwork.api.router.GatewayStatusResponse>(
                  this, METHODID_GATEWAY_STATUS)))
          .addMethod(
            METHOD_GET_STATUS,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.router.StatusRequest,
                org.thethingsnetwork.api.router.Status>(
                  this, METHODID_GET_STATUS)))
          .build();
    }
  }

  /**
   * <pre>
   * The RouterManager service provides configuration and monitoring functionality
   * </pre>
   */
  public static final class RouterManagerStub extends io.grpc.stub.AbstractStub<RouterManagerStub> {
    private RouterManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouterManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouterManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouterManagerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gateway owner or network operator requests Gateway status from Router Manager
     * Deprecated: Use monitor API (NOC) instead of this
     * </pre>
     */
    public void gatewayStatus(org.thethingsnetwork.api.router.GatewayStatusRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.GatewayStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GATEWAY_STATUS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Network operator requests Router status
     * </pre>
     */
    public void getStatus(org.thethingsnetwork.api.router.StatusRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_STATUS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The RouterManager service provides configuration and monitoring functionality
   * </pre>
   */
  public static final class RouterManagerBlockingStub extends io.grpc.stub.AbstractStub<RouterManagerBlockingStub> {
    private RouterManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouterManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouterManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouterManagerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gateway owner or network operator requests Gateway status from Router Manager
     * Deprecated: Use monitor API (NOC) instead of this
     * </pre>
     */
    public org.thethingsnetwork.api.router.GatewayStatusResponse gatewayStatus(org.thethingsnetwork.api.router.GatewayStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GATEWAY_STATUS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Network operator requests Router status
     * </pre>
     */
    public org.thethingsnetwork.api.router.Status getStatus(org.thethingsnetwork.api.router.StatusRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_STATUS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The RouterManager service provides configuration and monitoring functionality
   * </pre>
   */
  public static final class RouterManagerFutureStub extends io.grpc.stub.AbstractStub<RouterManagerFutureStub> {
    private RouterManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouterManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouterManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouterManagerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gateway owner or network operator requests Gateway status from Router Manager
     * Deprecated: Use monitor API (NOC) instead of this
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.router.GatewayStatusResponse> gatewayStatus(
        org.thethingsnetwork.api.router.GatewayStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GATEWAY_STATUS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Network operator requests Router status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.router.Status> getStatus(
        org.thethingsnetwork.api.router.StatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_STATUS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GATEWAY_STATUS = 0;
  private static final int METHODID_GET_STATUS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RouterManagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RouterManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GATEWAY_STATUS:
          serviceImpl.gatewayStatus((org.thethingsnetwork.api.router.GatewayStatusRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.GatewayStatusResponse>) responseObserver);
          break;
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((org.thethingsnetwork.api.router.StatusRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.router.Status>) responseObserver);
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

  private static final class RouterManagerDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.thethingsnetwork.api.router.RouterProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RouterManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RouterManagerDescriptorSupplier())
              .addMethod(METHOD_GATEWAY_STATUS)
              .addMethod(METHOD_GET_STATUS)
              .build();
        }
      }
    }
    return result;
  }
}
