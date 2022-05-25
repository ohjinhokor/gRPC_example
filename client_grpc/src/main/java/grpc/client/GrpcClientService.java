package grpc.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.ByteString;
import grpc.bepi.lib.GRequest;
import grpc.bepi.lib.GResponse;
import grpc.bepi.lib.RestApiGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GrpcClientService {

    @GrpcClient("grpcService")
    private RestApiGrpc.RestApiBlockingStub stub;

    private ObjectMapper objectMapper = new ObjectMapper();


    public String grpcGetMethod() {

        RequestDto requestDto = new RequestDto();
        requestDto.setName("bepi");
        try {
            String stringRequestDto = objectMapper.writeValueAsString(requestDto);
            ByteString bytesRequestDto = ByteString.copyFromUtf8(stringRequestDto);
            GResponse gResponse = stub.get(GRequest.newBuilder().setPath("examplePath").setBody(bytesRequestDto).putHeaders("id", "6").build());

            String responseBody = gResponse.getBody().toStringUtf8();
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
