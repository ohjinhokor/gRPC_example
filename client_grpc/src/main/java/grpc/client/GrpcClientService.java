package grpc.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.ByteString;
import grpc.bepi.lib.GRequest;
import grpc.bepi.lib.GResponse;
import grpc.bepi.lib.RestApiGrpc;
import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.netty.shaded.io.grpc.netty.NegotiationType;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GrpcClientService {

    private Channel channel;

    private RestApiGrpc.RestApiBlockingStub stub;

    private ObjectMapper objectMapper = new ObjectMapper();

    public String grpcGetMethod() {
        channel =
            ManagedChannelBuilder.forTarget("static://localhost" + ":" + 9090).usePlaintext().build();
        stub = RestApiGrpc.newBlockingStub(channel);

        RequestDto requestDto = new RequestDto();
        requestDto.setName("bepiiii");
        try {
            String stringRequestDto = objectMapper.writeValueAsString(requestDto);
            ByteString bytesRequestDto = ByteString.copyFromUtf8(stringRequestDto);
            GResponse gResponse = stub.get(GRequest.newBuilder().setPath("examplePath").setBody(bytesRequestDto).putHeaders("idd", "99").build());

            String responseBody = gResponse.getBody().toStringUtf8();
            System.err.println("8888888");
            return responseBody;
        } catch (IOException e) {
            return "fail";
        }
    }
    // @GrpcClient("test123")
    // private ShopliveApiGrpc.ShopliveApiBlockingStub stub;
    //
    // @GrpcClient("test12222")
    // private APIGrpc.APIBlockingStub exampleStub;
    //
    // public String sendMessage(final String path) {
    //     try {
    //         System.out.println("1");
    //         GResponse response = stub.get(GRequest.newBuilder().setPath(path).putBody("body", "body").build());
    //         System.out.println("2");
    //         return response.getStatus() + response.getHeadersMap().get("header1");
    //     } catch (StatusRuntimeException e) {
    //         System.out.println("3");
    //         return "fail";
    //     }
    // }
    // public String wil(final String path) {
    //     try {
    //
    //         // System.out.println("1");
    //         // GResponse response = stub.get(GRequest.newBuilder().setPath(path).putBody("body", "body").build());
    //         // System.out.println("2");
    //         // return response.getStatus() + response.getHeadersMap().get("header1");
    //         net.devh.boot.grpc.examples.lib.GRequest.newBuilder().setBody()
    //     } catch (StatusRuntimeException e) {
    //         System.out.println("3");
    //         return "fail";
    //     }
    // }
}
