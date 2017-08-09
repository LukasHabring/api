package org.thethingsnetwork.api.networkserver;

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
 * The NetworkServerManager service provides configuration and monitoring
 * functionality
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: github.com/TheThingsNetwork/api/networkserver/networkserver.proto")
public final class NetworkServerManagerGrpc {

  private NetworkServerManagerGrpc() {}

  public static final String SERVICE_NAME = "networkserver.NetworkServerManager";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.api.networkserver.StatusRequest,
      org.thethingsnetwork.api.networkserver.Status> METHOD_GET_STATUS =
      io.grpc.MethodDescriptor.<org.thethingsnetwork.api.networkserver.StatusRequest, org.thethingsnetwork.api.networkserver.Status>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "networkserver.NetworkServerManager", "GetStatus"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.networkserver.StatusRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.thethingsnetwork.api.networkserver.Status.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NetworkServerManagerStub newStub(io.grpc.Channel channel) {
    return new NetworkServerManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NetworkServerManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NetworkServerManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NetworkServerManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NetworkServerManagerFutureStub(channel);
  }

  /**
   * <pre>
   * The NetworkServerManager service provides configuration and monitoring
   * functionality
   * </pre>
   */
  public static abstract class NetworkServerManagerImplBase implements io.grpc.BindableService {

    /**
     */
    public void getStatus(org.thethingsnetwork.api.networkserver.StatusRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.networkserver.Status> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_STATUS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_STATUS,
            asyncUnaryCall(
              new MethodHandlers<
                org.thethingsnetwork.api.networkserver.StatusRequest,
                org.thethingsnetwork.api.networkserver.Status>(
                  this, METHODID_GET_STATUS)))
          .build();
    }
  }

  /**
   * <pre>
   * The NetworkServerManager service provides configuration and monitoring
   * functionality
   * </pre>
   */
  public static final class NetworkServerManagerStub extends io.grpc.stub.AbstractStub<NetworkServerManagerStub> {
    private NetworkServerManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkServerManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServerManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkServerManagerStub(channel, callOptions);
    }

    /**
     */
    public void getStatus(org.thethingsnetwork.api.networkserver.StatusRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.api.networkserver.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_STATUS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The NetworkServerManager service provides configuration and monitoring
   * functionality
   * </pre>
   */
  public static final class NetworkServerManagerBlockingStub extends io.grpc.stub.AbstractStub<NetworkServerManagerBlockingStub> {
    private NetworkServerManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkServerManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServerManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkServerManagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.thethingsnetwork.api.networkserver.Status getStatus(org.thethingsnetwork.api.networkserver.StatusRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_STATUS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The NetworkServerManager service provides configuration and monitoring
   * functionality
   * </pre>
   */
  public static final class NetworkServerManagerFutureStub extends io.grpc.stub.AbstractStub<NetworkServerManagerFutureStub> {
    private NetworkServerManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkServerManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServerManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkServerManagerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.api.networkserver.Status> getStatus(
        org.thethingsnetwork.api.networkserver.StatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_STATUS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STATUS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NetworkServerManagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NetworkServerManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((org.thethingsnetwork.api.networkserver.StatusRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.api.networkserver.Status>) responseObserver);
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

  private static final class NetworkServerManagerDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.thethingsnetwork.api.networkserver.MonitorProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NetworkServerManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NetworkServerManagerDescriptorSupplier())
              .addMethod(METHOD_GET_STATUS)
              .build();
        }
      }
    }
    return result;
  }
}
