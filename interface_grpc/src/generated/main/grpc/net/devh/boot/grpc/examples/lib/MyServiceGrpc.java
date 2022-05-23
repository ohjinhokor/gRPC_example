package net.devh.boot.grpc.examples.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: simple.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MyServiceGrpc {

  private MyServiceGrpc() {}

  public static final String SERVICE_NAME = "MyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.Empty,
      net.devh.boot.grpc.examples.lib.Response> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ping",
      requestType = net.devh.boot.grpc.examples.lib.Empty.class,
      responseType = net.devh.boot.grpc.examples.lib.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.Empty,
      net.devh.boot.grpc.examples.lib.Response> getPingMethod() {
    io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.Empty, net.devh.boot.grpc.examples.lib.Response> getPingMethod;
    if ((getPingMethod = MyServiceGrpc.getPingMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getPingMethod = MyServiceGrpc.getPingMethod) == null) {
          MyServiceGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<net.devh.boot.grpc.examples.lib.Empty, net.devh.boot.grpc.examples.lib.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.boot.grpc.examples.lib.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.boot.grpc.examples.lib.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.Request,
      net.devh.boot.grpc.examples.lib.Response> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = net.devh.boot.grpc.examples.lib.Request.class,
      responseType = net.devh.boot.grpc.examples.lib.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.Request,
      net.devh.boot.grpc.examples.lib.Response> getGetMethod() {
    io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.Request, net.devh.boot.grpc.examples.lib.Response> getGetMethod;
    if ((getGetMethod = MyServiceGrpc.getGetMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getGetMethod = MyServiceGrpc.getGetMethod) == null) {
          MyServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<net.devh.boot.grpc.examples.lib.Request, net.devh.boot.grpc.examples.lib.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.boot.grpc.examples.lib.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.boot.grpc.examples.lib.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.Request,
      net.devh.boot.grpc.examples.lib.Response> getPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "post",
      requestType = net.devh.boot.grpc.examples.lib.Request.class,
      responseType = net.devh.boot.grpc.examples.lib.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.Request,
      net.devh.boot.grpc.examples.lib.Response> getPostMethod() {
    io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.Request, net.devh.boot.grpc.examples.lib.Response> getPostMethod;
    if ((getPostMethod = MyServiceGrpc.getPostMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getPostMethod = MyServiceGrpc.getPostMethod) == null) {
          MyServiceGrpc.getPostMethod = getPostMethod =
              io.grpc.MethodDescriptor.<net.devh.boot.grpc.examples.lib.Request, net.devh.boot.grpc.examples.lib.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "post"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.boot.grpc.examples.lib.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.boot.grpc.examples.lib.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("post"))
              .build();
        }
      }
    }
    return getPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.Request,
      net.devh.boot.grpc.examples.lib.Response> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "put",
      requestType = net.devh.boot.grpc.examples.lib.Request.class,
      responseType = net.devh.boot.grpc.examples.lib.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.Request,
      net.devh.boot.grpc.examples.lib.Response> getPutMethod() {
    io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.Request, net.devh.boot.grpc.examples.lib.Response> getPutMethod;
    if ((getPutMethod = MyServiceGrpc.getPutMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getPutMethod = MyServiceGrpc.getPutMethod) == null) {
          MyServiceGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<net.devh.boot.grpc.examples.lib.Request, net.devh.boot.grpc.examples.lib.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.boot.grpc.examples.lib.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.boot.grpc.examples.lib.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.Request,
      net.devh.boot.grpc.examples.lib.Response> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = net.devh.boot.grpc.examples.lib.Request.class,
      responseType = net.devh.boot.grpc.examples.lib.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.Request,
      net.devh.boot.grpc.examples.lib.Response> getDeleteMethod() {
    io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.Request, net.devh.boot.grpc.examples.lib.Response> getDeleteMethod;
    if ((getDeleteMethod = MyServiceGrpc.getDeleteMethod) == null) {
      synchronized (MyServiceGrpc.class) {
        if ((getDeleteMethod = MyServiceGrpc.getDeleteMethod) == null) {
          MyServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<net.devh.boot.grpc.examples.lib.Request, net.devh.boot.grpc.examples.lib.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.boot.grpc.examples.lib.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.boot.grpc.examples.lib.Response.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceMethodDescriptorSupplier("delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyServiceStub>() {
        @java.lang.Override
        public MyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyServiceStub(channel, callOptions);
        }
      };
    return MyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyServiceBlockingStub>() {
        @java.lang.Override
        public MyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyServiceBlockingStub(channel, callOptions);
        }
      };
    return MyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyServiceFutureStub>() {
        @java.lang.Override
        public MyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyServiceFutureStub(channel, callOptions);
        }
      };
    return MyServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class MyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void ping(net.devh.boot.grpc.examples.lib.Empty request,
        io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     */
    public void get(net.devh.boot.grpc.examples.lib.Request request,
        io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void post(net.devh.boot.grpc.examples.lib.Request request,
        io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostMethod(), responseObserver);
    }

    /**
     */
    public void put(net.devh.boot.grpc.examples.lib.Request request,
        io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     */
    public void delete(net.devh.boot.grpc.examples.lib.Request request,
        io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.devh.boot.grpc.examples.lib.Empty,
                net.devh.boot.grpc.examples.lib.Response>(
                  this, METHODID_PING)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.devh.boot.grpc.examples.lib.Request,
                net.devh.boot.grpc.examples.lib.Response>(
                  this, METHODID_GET)))
          .addMethod(
            getPostMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.devh.boot.grpc.examples.lib.Request,
                net.devh.boot.grpc.examples.lib.Response>(
                  this, METHODID_POST)))
          .addMethod(
            getPutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.devh.boot.grpc.examples.lib.Request,
                net.devh.boot.grpc.examples.lib.Response>(
                  this, METHODID_PUT)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                net.devh.boot.grpc.examples.lib.Request,
                net.devh.boot.grpc.examples.lib.Response>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class MyServiceStub extends io.grpc.stub.AbstractAsyncStub<MyServiceStub> {
    private MyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void ping(net.devh.boot.grpc.examples.lib.Empty request,
        io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(net.devh.boot.grpc.examples.lib.Request request,
        io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void post(net.devh.boot.grpc.examples.lib.Request request,
        io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void put(net.devh.boot.grpc.examples.lib.Request request,
        io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(net.devh.boot.grpc.examples.lib.Request request,
        io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class MyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MyServiceBlockingStub> {
    private MyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public net.devh.boot.grpc.examples.lib.Response ping(net.devh.boot.grpc.examples.lib.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.devh.boot.grpc.examples.lib.Response get(net.devh.boot.grpc.examples.lib.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.devh.boot.grpc.examples.lib.Response post(net.devh.boot.grpc.examples.lib.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.devh.boot.grpc.examples.lib.Response put(net.devh.boot.grpc.examples.lib.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.devh.boot.grpc.examples.lib.Response delete(net.devh.boot.grpc.examples.lib.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class MyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MyServiceFutureStub> {
    private MyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<net.devh.boot.grpc.examples.lib.Response> ping(
        net.devh.boot.grpc.examples.lib.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.devh.boot.grpc.examples.lib.Response> get(
        net.devh.boot.grpc.examples.lib.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.devh.boot.grpc.examples.lib.Response> post(
        net.devh.boot.grpc.examples.lib.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.devh.boot.grpc.examples.lib.Response> put(
        net.devh.boot.grpc.examples.lib.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.devh.boot.grpc.examples.lib.Response> delete(
        net.devh.boot.grpc.examples.lib.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_POST = 2;
  private static final int METHODID_PUT = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((net.devh.boot.grpc.examples.lib.Empty) request,
              (io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.Response>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((net.devh.boot.grpc.examples.lib.Request) request,
              (io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.Response>) responseObserver);
          break;
        case METHODID_POST:
          serviceImpl.post((net.devh.boot.grpc.examples.lib.Request) request,
              (io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.Response>) responseObserver);
          break;
        case METHODID_PUT:
          serviceImpl.put((net.devh.boot.grpc.examples.lib.Request) request,
              (io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.Response>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((net.devh.boot.grpc.examples.lib.Request) request,
              (io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.Response>) responseObserver);
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

  private static abstract class MyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.devh.boot.grpc.examples.lib.SimpleProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MyService");
    }
  }

  private static final class MyServiceFileDescriptorSupplier
      extends MyServiceBaseDescriptorSupplier {
    MyServiceFileDescriptorSupplier() {}
  }

  private static final class MyServiceMethodDescriptorSupplier
      extends MyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MyServiceFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .addMethod(getGetMethod())
              .addMethod(getPostMethod())
              .addMethod(getPutMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
