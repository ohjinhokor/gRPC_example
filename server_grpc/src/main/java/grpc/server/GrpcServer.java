package grpc.server;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.ByteString;
import grpc.bepi.lib.GRequest;
import grpc.bepi.lib.GResponse;
import grpc.bepi.lib.RestApiGrpc;
import grpc.server.restapi.BepiController;
import grpc.server.restapi.RequestDto;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

import java.io.IOException;

@GrpcService
@RequiredArgsConstructor
public class GrpcServer extends RestApiGrpc.RestApiImplBase {

    // Controller가 여러개라면 Map으로
    private final BepiController bepiController;
    private final ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public void get(GRequest request, StreamObserver<GResponse> responseObserver) {
        String id = request.getHeadersMap().get("id");
        ByteString body = request.getBody();

        //ByteString to String
        String bodyString = body.toStringUtf8();

        try {
            RequestDto requestDto = objectMapper.readValue(bodyString, RequestDto.class);
            String returnValue = bepiController.getMethod(id, requestDto);

            ByteString bodyBytes = ByteString.copyFromUtf8(returnValue);
            GResponse response = GResponse.newBuilder().setStatus(200).setBody(bodyBytes).build();

            responseObserver.onNext(response); responseObserver.onCompleted();
        } catch (IOException e) {
            ByteString bodyBytes = ByteString.copyFromUtf8("body is not appropriate");
            GResponse response = GResponse.newBuilder().setStatus(200).setBody(bodyBytes).build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
    // @Override
    // public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
    //     HelloReply helloReply = HelloReply.newBuilder()
    //         .setMessage("Hello ===> " + request.getName()).build();
    //
    //     responseObserver.onNext(helloReply);
    //     responseObserver.onCompleted();
    // }


    // @Override
    // public void get(Request request, StreamObserver<Response> responseObserver) {
    //     Response response = Response.newBuilder().setStatus(6).build();
    //
    //     responseObserver.onNext(response);
    //     responseObserver.onCompleted();
    // }
}