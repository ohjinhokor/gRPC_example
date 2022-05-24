package grpc.client;

import grpc.bepi.lib.GRequest;
import grpc.bepi.lib.RestApiGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class GrpcClientService {

    @GrpcClient("grpcService")
    private RestApiGrpc.RestApiBlockingStub stub;

    public String grpcGetMethod(String path, Map<String, String> headers, RequestDto body) {

        stub.get(GRequest.newBuilder().setPath("examplePath").setBody())
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
