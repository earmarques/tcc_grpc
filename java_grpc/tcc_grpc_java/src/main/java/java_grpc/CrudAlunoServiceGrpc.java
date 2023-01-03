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
    comments = "Source: aluno.proto")
public final class CrudAlunoServiceGrpc {

  private CrudAlunoServiceGrpc() {}

  public static final String SERVICE_NAME = "CrudAlunoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<java_grpc.AlunoOuterClass.Aluno,
      java_grpc.AlunoOuterClass.Aluno> getCreateAlunoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAluno",
      requestType = java_grpc.AlunoOuterClass.Aluno.class,
      responseType = java_grpc.AlunoOuterClass.Aluno.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java_grpc.AlunoOuterClass.Aluno,
      java_grpc.AlunoOuterClass.Aluno> getCreateAlunoMethod() {
    io.grpc.MethodDescriptor<java_grpc.AlunoOuterClass.Aluno, java_grpc.AlunoOuterClass.Aluno> getCreateAlunoMethod;
    if ((getCreateAlunoMethod = CrudAlunoServiceGrpc.getCreateAlunoMethod) == null) {
      synchronized (CrudAlunoServiceGrpc.class) {
        if ((getCreateAlunoMethod = CrudAlunoServiceGrpc.getCreateAlunoMethod) == null) {
          CrudAlunoServiceGrpc.getCreateAlunoMethod = getCreateAlunoMethod = 
              io.grpc.MethodDescriptor.<java_grpc.AlunoOuterClass.Aluno, java_grpc.AlunoOuterClass.Aluno>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CrudAlunoService", "CreateAluno"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java_grpc.AlunoOuterClass.Aluno.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java_grpc.AlunoOuterClass.Aluno.getDefaultInstance()))
                  .setSchemaDescriptor(new CrudAlunoServiceMethodDescriptorSupplier("CreateAluno"))
                  .build();
          }
        }
     }
     return getCreateAlunoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      java_grpc.AlunoOuterClass.Alunos> getGetAllAlunosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllAlunos",
      requestType = com.google.protobuf.Empty.class,
      responseType = java_grpc.AlunoOuterClass.Alunos.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      java_grpc.AlunoOuterClass.Alunos> getGetAllAlunosMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, java_grpc.AlunoOuterClass.Alunos> getGetAllAlunosMethod;
    if ((getGetAllAlunosMethod = CrudAlunoServiceGrpc.getGetAllAlunosMethod) == null) {
      synchronized (CrudAlunoServiceGrpc.class) {
        if ((getGetAllAlunosMethod = CrudAlunoServiceGrpc.getGetAllAlunosMethod) == null) {
          CrudAlunoServiceGrpc.getGetAllAlunosMethod = getGetAllAlunosMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, java_grpc.AlunoOuterClass.Alunos>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CrudAlunoService", "GetAllAlunos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java_grpc.AlunoOuterClass.Alunos.getDefaultInstance()))
                  .setSchemaDescriptor(new CrudAlunoServiceMethodDescriptorSupplier("GetAllAlunos"))
                  .build();
          }
        }
     }
     return getGetAllAlunosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java_grpc.AlunoOuterClass.AlunoId,
      java_grpc.AlunoOuterClass.Aluno> getGetAlunoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAluno",
      requestType = java_grpc.AlunoOuterClass.AlunoId.class,
      responseType = java_grpc.AlunoOuterClass.Aluno.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java_grpc.AlunoOuterClass.AlunoId,
      java_grpc.AlunoOuterClass.Aluno> getGetAlunoMethod() {
    io.grpc.MethodDescriptor<java_grpc.AlunoOuterClass.AlunoId, java_grpc.AlunoOuterClass.Aluno> getGetAlunoMethod;
    if ((getGetAlunoMethod = CrudAlunoServiceGrpc.getGetAlunoMethod) == null) {
      synchronized (CrudAlunoServiceGrpc.class) {
        if ((getGetAlunoMethod = CrudAlunoServiceGrpc.getGetAlunoMethod) == null) {
          CrudAlunoServiceGrpc.getGetAlunoMethod = getGetAlunoMethod = 
              io.grpc.MethodDescriptor.<java_grpc.AlunoOuterClass.AlunoId, java_grpc.AlunoOuterClass.Aluno>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CrudAlunoService", "GetAluno"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java_grpc.AlunoOuterClass.AlunoId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java_grpc.AlunoOuterClass.Aluno.getDefaultInstance()))
                  .setSchemaDescriptor(new CrudAlunoServiceMethodDescriptorSupplier("GetAluno"))
                  .build();
          }
        }
     }
     return getGetAlunoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java_grpc.AlunoOuterClass.AlunoId,
      com.google.protobuf.Empty> getDeleteAlunoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAluno",
      requestType = java_grpc.AlunoOuterClass.AlunoId.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java_grpc.AlunoOuterClass.AlunoId,
      com.google.protobuf.Empty> getDeleteAlunoMethod() {
    io.grpc.MethodDescriptor<java_grpc.AlunoOuterClass.AlunoId, com.google.protobuf.Empty> getDeleteAlunoMethod;
    if ((getDeleteAlunoMethod = CrudAlunoServiceGrpc.getDeleteAlunoMethod) == null) {
      synchronized (CrudAlunoServiceGrpc.class) {
        if ((getDeleteAlunoMethod = CrudAlunoServiceGrpc.getDeleteAlunoMethod) == null) {
          CrudAlunoServiceGrpc.getDeleteAlunoMethod = getDeleteAlunoMethod = 
              io.grpc.MethodDescriptor.<java_grpc.AlunoOuterClass.AlunoId, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CrudAlunoService", "DeleteAluno"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java_grpc.AlunoOuterClass.AlunoId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new CrudAlunoServiceMethodDescriptorSupplier("DeleteAluno"))
                  .build();
          }
        }
     }
     return getDeleteAlunoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<java_grpc.AlunoOuterClass.Aluno,
      java_grpc.AlunoOuterClass.Aluno> getEditAlunoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditAluno",
      requestType = java_grpc.AlunoOuterClass.Aluno.class,
      responseType = java_grpc.AlunoOuterClass.Aluno.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<java_grpc.AlunoOuterClass.Aluno,
      java_grpc.AlunoOuterClass.Aluno> getEditAlunoMethod() {
    io.grpc.MethodDescriptor<java_grpc.AlunoOuterClass.Aluno, java_grpc.AlunoOuterClass.Aluno> getEditAlunoMethod;
    if ((getEditAlunoMethod = CrudAlunoServiceGrpc.getEditAlunoMethod) == null) {
      synchronized (CrudAlunoServiceGrpc.class) {
        if ((getEditAlunoMethod = CrudAlunoServiceGrpc.getEditAlunoMethod) == null) {
          CrudAlunoServiceGrpc.getEditAlunoMethod = getEditAlunoMethod = 
              io.grpc.MethodDescriptor.<java_grpc.AlunoOuterClass.Aluno, java_grpc.AlunoOuterClass.Aluno>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CrudAlunoService", "EditAluno"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java_grpc.AlunoOuterClass.Aluno.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  java_grpc.AlunoOuterClass.Aluno.getDefaultInstance()))
                  .setSchemaDescriptor(new CrudAlunoServiceMethodDescriptorSupplier("EditAluno"))
                  .build();
          }
        }
     }
     return getEditAlunoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CrudAlunoServiceStub newStub(io.grpc.Channel channel) {
    return new CrudAlunoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CrudAlunoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CrudAlunoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CrudAlunoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CrudAlunoServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CrudAlunoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createAluno(java_grpc.AlunoOuterClass.Aluno request,
        io.grpc.stub.StreamObserver<java_grpc.AlunoOuterClass.Aluno> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAlunoMethod(), responseObserver);
    }

    /**
     */
    public void getAllAlunos(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<java_grpc.AlunoOuterClass.Alunos> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllAlunosMethod(), responseObserver);
    }

    /**
     */
    public void getAluno(java_grpc.AlunoOuterClass.AlunoId request,
        io.grpc.stub.StreamObserver<java_grpc.AlunoOuterClass.Aluno> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAlunoMethod(), responseObserver);
    }

    /**
     */
    public void deleteAluno(java_grpc.AlunoOuterClass.AlunoId request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAlunoMethod(), responseObserver);
    }

    /**
     */
    public void editAluno(java_grpc.AlunoOuterClass.Aluno request,
        io.grpc.stub.StreamObserver<java_grpc.AlunoOuterClass.Aluno> responseObserver) {
      asyncUnimplementedUnaryCall(getEditAlunoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateAlunoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                java_grpc.AlunoOuterClass.Aluno,
                java_grpc.AlunoOuterClass.Aluno>(
                  this, METHODID_CREATE_ALUNO)))
          .addMethod(
            getGetAllAlunosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                java_grpc.AlunoOuterClass.Alunos>(
                  this, METHODID_GET_ALL_ALUNOS)))
          .addMethod(
            getGetAlunoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                java_grpc.AlunoOuterClass.AlunoId,
                java_grpc.AlunoOuterClass.Aluno>(
                  this, METHODID_GET_ALUNO)))
          .addMethod(
            getDeleteAlunoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                java_grpc.AlunoOuterClass.AlunoId,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_ALUNO)))
          .addMethod(
            getEditAlunoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                java_grpc.AlunoOuterClass.Aluno,
                java_grpc.AlunoOuterClass.Aluno>(
                  this, METHODID_EDIT_ALUNO)))
          .build();
    }
  }

  /**
   */
  public static final class CrudAlunoServiceStub extends io.grpc.stub.AbstractStub<CrudAlunoServiceStub> {
    private CrudAlunoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CrudAlunoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CrudAlunoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CrudAlunoServiceStub(channel, callOptions);
    }

    /**
     */
    public void createAluno(java_grpc.AlunoOuterClass.Aluno request,
        io.grpc.stub.StreamObserver<java_grpc.AlunoOuterClass.Aluno> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAlunoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllAlunos(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<java_grpc.AlunoOuterClass.Alunos> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllAlunosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAluno(java_grpc.AlunoOuterClass.AlunoId request,
        io.grpc.stub.StreamObserver<java_grpc.AlunoOuterClass.Aluno> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAlunoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAluno(java_grpc.AlunoOuterClass.AlunoId request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAlunoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editAluno(java_grpc.AlunoOuterClass.Aluno request,
        io.grpc.stub.StreamObserver<java_grpc.AlunoOuterClass.Aluno> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditAlunoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CrudAlunoServiceBlockingStub extends io.grpc.stub.AbstractStub<CrudAlunoServiceBlockingStub> {
    private CrudAlunoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CrudAlunoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CrudAlunoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CrudAlunoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java_grpc.AlunoOuterClass.Aluno createAluno(java_grpc.AlunoOuterClass.Aluno request) {
      return blockingUnaryCall(
          getChannel(), getCreateAlunoMethod(), getCallOptions(), request);
    }

    /**
     */
    public java_grpc.AlunoOuterClass.Alunos getAllAlunos(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllAlunosMethod(), getCallOptions(), request);
    }

    /**
     */
    public java_grpc.AlunoOuterClass.Aluno getAluno(java_grpc.AlunoOuterClass.AlunoId request) {
      return blockingUnaryCall(
          getChannel(), getGetAlunoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteAluno(java_grpc.AlunoOuterClass.AlunoId request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAlunoMethod(), getCallOptions(), request);
    }

    /**
     */
    public java_grpc.AlunoOuterClass.Aluno editAluno(java_grpc.AlunoOuterClass.Aluno request) {
      return blockingUnaryCall(
          getChannel(), getEditAlunoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CrudAlunoServiceFutureStub extends io.grpc.stub.AbstractStub<CrudAlunoServiceFutureStub> {
    private CrudAlunoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CrudAlunoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CrudAlunoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CrudAlunoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java_grpc.AlunoOuterClass.Aluno> createAluno(
        java_grpc.AlunoOuterClass.Aluno request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAlunoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java_grpc.AlunoOuterClass.Alunos> getAllAlunos(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllAlunosMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java_grpc.AlunoOuterClass.Aluno> getAluno(
        java_grpc.AlunoOuterClass.AlunoId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAlunoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAluno(
        java_grpc.AlunoOuterClass.AlunoId request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAlunoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<java_grpc.AlunoOuterClass.Aluno> editAluno(
        java_grpc.AlunoOuterClass.Aluno request) {
      return futureUnaryCall(
          getChannel().newCall(getEditAlunoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ALUNO = 0;
  private static final int METHODID_GET_ALL_ALUNOS = 1;
  private static final int METHODID_GET_ALUNO = 2;
  private static final int METHODID_DELETE_ALUNO = 3;
  private static final int METHODID_EDIT_ALUNO = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CrudAlunoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CrudAlunoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ALUNO:
          serviceImpl.createAluno((java_grpc.AlunoOuterClass.Aluno) request,
              (io.grpc.stub.StreamObserver<java_grpc.AlunoOuterClass.Aluno>) responseObserver);
          break;
        case METHODID_GET_ALL_ALUNOS:
          serviceImpl.getAllAlunos((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<java_grpc.AlunoOuterClass.Alunos>) responseObserver);
          break;
        case METHODID_GET_ALUNO:
          serviceImpl.getAluno((java_grpc.AlunoOuterClass.AlunoId) request,
              (io.grpc.stub.StreamObserver<java_grpc.AlunoOuterClass.Aluno>) responseObserver);
          break;
        case METHODID_DELETE_ALUNO:
          serviceImpl.deleteAluno((java_grpc.AlunoOuterClass.AlunoId) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_EDIT_ALUNO:
          serviceImpl.editAluno((java_grpc.AlunoOuterClass.Aluno) request,
              (io.grpc.stub.StreamObserver<java_grpc.AlunoOuterClass.Aluno>) responseObserver);
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

  private static abstract class CrudAlunoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CrudAlunoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return java_grpc.AlunoOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CrudAlunoService");
    }
  }

  private static final class CrudAlunoServiceFileDescriptorSupplier
      extends CrudAlunoServiceBaseDescriptorSupplier {
    CrudAlunoServiceFileDescriptorSupplier() {}
  }

  private static final class CrudAlunoServiceMethodDescriptorSupplier
      extends CrudAlunoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CrudAlunoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CrudAlunoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CrudAlunoServiceFileDescriptorSupplier())
              .addMethod(getCreateAlunoMethod())
              .addMethod(getGetAllAlunosMethod())
              .addMethod(getGetAlunoMethod())
              .addMethod(getDeleteAlunoMethod())
              .addMethod(getEditAlunoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
