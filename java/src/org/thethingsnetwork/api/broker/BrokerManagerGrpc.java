package org.thethingsnetwork.api.broker;

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
 * The BrokerManager service provides configuration and monitoring functionality
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: github.com/TheThingsNetwork/api/broker/broker.proto")
public final class BrokerManagerGrpc {

  private BrokerManagerGrpc() {}

  public static final String SERVICE_NAME = "broker.BrokerManager";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.ApplicationHandlerRegistration,
      com.google.protobuf.Empty> METHOD_REGISTER_APPLICATION_HANDLER =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.ApplicationHandlerRegistration, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "broker.BrokerManager", "RegisterApplicationHandler"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.broker.ApplicationHandlerRegistration.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.broker.StatusRequest,
      org.thethingsnetwork.api.broker.Status> METHOD_GET_STATUS =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.broker.StatusRequest, org.thethingsnetwork.api.broker.Status>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "broker.BrokerManager", "GetStatus"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.broker.StatusRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.broker.Status.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BrokerManagerStub newStub(io.grpc.Channel channel) {
    return new BrokerManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BrokerManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BrokerManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BrokerManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BrokerManagerFutureStub(channel);
  }

  /**
   * <pre>
   * The BrokerManager service provides configuration and monitoring functionality
   * </pre>
   */
  public static abstract class BrokerManagerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Handler announces a new application to Broker. This is a temporary method that will be removed
     * when we can push updates from the Discovery service to the routing services.
     * </pre>
     */
    public void registerApplicationHandler(org.thethingsnetwork.api.broker.ApplicationHandlerRegistration request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_APPLICATION_HANDLER, responseObserver);
    }

    /**
     * <pre>
     * Network operator requests Broker status
     * </pre>
     */
    public void getStatus(org.thethingsnetwork.api.broker.StatusRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.Status> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_STATUS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_REGISTER_APPLICATION_HANDLER,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.ApplicationHandlerRegistration,
                com.google.protobuf.Empty>(
                  this, METHODID_REGISTER_APPLICATION_HANDLER)))
          .addMethod(
            METHOD_GET_STATUS,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.broker.StatusRequest,
                org.thethingsnetwork.api.broker.Status>(
                  this, METHODID_GET_STATUS)))
          .build();
    }
  }

  /**
   * <pre>
   * The BrokerManager service provides configuration and monitoring functionality
   * </pre>
   */
  public static final class BrokerManagerStub extends io.grpc.stub.AbstractStub<BrokerManagerStub> {
    private BrokerManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrokerManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrokerManagerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Handler announces a new application to Broker. This is a temporary method that will be removed
     * when we can push updates from the Discovery service to the routing services.
     * </pre>
     */
    public void registerApplicationHandler(org.thethingsnetwork.api.broker.ApplicationHandlerRegistration request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_APPLICATION_HANDLER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Network operator requests Broker status
     * </pre>
     */
    public void getStatus(org.thethingsnetwork.api.broker.StatusRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_STATUS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The BrokerManager service provides configuration and monitoring functionality
   * </pre>
   */
  public static final class BrokerManagerBlockingStub extends io.grpc.stub.AbstractStub<BrokerManagerBlockingStub> {
    private BrokerManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrokerManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrokerManagerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Handler announces a new application to Broker. This is a temporary method that will be removed
     * when we can push updates from the Discovery service to the routing services.
     * </pre>
     */
    public com.google.protobuf.Empty registerApplicationHandler(org.thethingsnetwork.api.broker.ApplicationHandlerRegistration request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_APPLICATION_HANDLER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Network operator requests Broker status
     * </pre>
     */
    public org.thethingsnetwork.api.broker.Status getStatus(org.thethingsnetwork.api.broker.StatusRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_STATUS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The BrokerManager service provides configuration and monitoring functionality
   * </pre>
   */
  public static final class BrokerManagerFutureStub extends io.grpc.stub.AbstractStub<BrokerManagerFutureStub> {
    private BrokerManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrokerManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrokerManagerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Handler announces a new application to Broker. This is a temporary method that will be removed
     * when we can push updates from the Discovery service to the routing services.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> registerApplicationHandler(
        org.thethingsnetwork.api.broker.ApplicationHandlerRegistration request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_APPLICATION_HANDLER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Network operator requests Broker status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.broker.Status> getStatus(
        org.thethingsnetwork.api.broker.StatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_STATUS, getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_APPLICATION_HANDLER = 0;
  private static final int METHODID_GET_STATUS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BrokerManagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BrokerManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_APPLICATION_HANDLER:
          serviceImpl.registerApplicationHandler((org.thethingsnetwork.api.broker.ApplicationHandlerRegistration) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((org.thethingsnetwork.api.broker.StatusRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.broker.Status>) responseObserver);
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

  private static final class BrokerManagerDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.thethingsnetwork.api.broker.BrokerProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BrokerManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BrokerManagerDescriptorSupplier())
              .addMethod(METHOD_REGISTER_APPLICATION_HANDLER)
              .addMethod(METHOD_GET_STATUS)
              .build();
        }
      }
    }
    return result;
  }
}
