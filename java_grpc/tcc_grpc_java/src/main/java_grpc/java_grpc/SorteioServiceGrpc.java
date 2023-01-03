package java_grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: sorteio.proto")
public final class SorteioServiceGrpc {

  private SorteioServiceGrpc() {}

  public static final String SERVICE_NAME = "SorteioService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<java_grpc.Sorteio.IntervaloRequest,
      java_grpc.Sorteio.SorteadoResponse> getSortearNumeroMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SortearNumero",
      requestType = java_grpc.Sorteio.IntervaloRequest.class,
      responseType = java_grpc.Sorteio.SorteadoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java_grpc.Sorteio.IntervaloRequest,
      java_grpc.Sorteio.SorteadoResponse> getSortearNumeroMethod() {
    io.grpc.MethodDescriptor<java_grpc.Sorteio.IntervaloRequest, java_grpc.Sorteio.SorteadoResponse> getSortearNumeroMethod;
    if ((getSortearNumeroMethod = SorteioServiceGrpc.getSortearNumeroMethod) == null) {
      synchronized (SorteioServiceGrpc.class) {
        if ((getSortearNumeroMethod = SorteioServiceGrpc.getSortearNumeroMethod) == null) {
          SorteioServiceGrpc.getSortearNumeroMethod = getSortearNumeroMethod = 
              io.grpc.MethodDescriptor.<java_grpc.Sorteio.IntervaloRequest, java_grpc.Sorteio.SorteadoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SorteioService", "SortearNumero"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java_grpc.Sorteio.IntervaloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java_grpc.Sorteio.SorteadoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SorteioServiceMethodDescriptorSupplier("SortearNumero"))
                  .build();
          }
        }
     }
     return getSortearNumeroMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SorteioServiceStub newStub(io.grpc.Channel channel) {
    return new SorteioServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SorteioServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SorteioServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SorteioServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SorteioServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SorteioServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sortearNumero(java_grpc.Sorteio.IntervaloRequest request,
        io.grpc.stub.StreamObserver<java_grpc.Sorteio.SorteadoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSortearNumeroMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSortearNumeroMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                java_grpc.Sorteio.IntervaloRequest,
                java_grpc.Sorteio.SorteadoResponse>(
                  this, METHODID_SORTEAR_NUMERO)))
          .build();
    }
  }

  /**
   */
  public static final class SorteioServiceStub extends io.grpc.stub.AbstractStub<SorteioServiceStub> {
    private SorteioServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SorteioServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SorteioServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SorteioServiceStub(channel, callOptions);
    }

    /**
     */
    public void sortearNumero(java_grpc.Sorteio.IntervaloRequest request,
        io.grpc.stub.StreamObserver<java_grpc.Sorteio.SorteadoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSortearNumeroMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SorteioServiceBlockingStub extends io.grpc.stub.AbstractStub<SorteioServiceBlockingStub> {
    private SorteioServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SorteioServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SorteioServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SorteioServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java_grpc.Sorteio.SorteadoResponse sortearNumero(java_grpc.Sorteio.IntervaloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSortearNumeroMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SorteioServiceFutureStub extends io.grpc.stub.AbstractStub<SorteioServiceFutureStub> {
    private SorteioServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SorteioServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SorteioServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SorteioServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java_grpc.Sorteio.SorteadoResponse> sortearNumero(
        java_grpc.Sorteio.IntervaloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSortearNumeroMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SORTEAR_NUMERO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SorteioServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SorteioServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SORTEAR_NUMERO:
          serviceImpl.sortearNumero((java_grpc.Sorteio.IntervaloRequest) request,
              (io.grpc.stub.StreamObserver<java_grpc.Sorteio.SorteadoResponse>) responseObserver);
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

  private static abstract class SorteioServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SorteioServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return java_grpc.Sorteio.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SorteioService");
    }
  }

  private static final class SorteioServiceFileDescriptorSupplier
      extends SorteioServiceBaseDescriptorSupplier {
    SorteioServiceFileDescriptorSupplier() {}
  }

  private static final class SorteioServiceMethodDescriptorSupplier
      extends SorteioServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SorteioServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SorteioServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SorteioServiceFileDescriptorSupplier())
              .addMethod(getSortearNumeroMethod())
              .build();
        }
      }
    }
    return result;
  }
}
