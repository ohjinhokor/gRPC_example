package grpc.client_grpc;

import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.examples.lib.HelloReply;
import net.devh.boot.grpc.examples.lib.HelloRequest;
import net.devh.boot.grpc.examples.lib.MyServiceGrpc;
import org.springframework.stereotype.Service;

@Service
public class GrpcClientService {

    @GrpcClient("test123")
    private MyServiceGrpc.MyServiceBlockingStub simpleStub;

    public String sendMessage(final String name) {
        try {
            System.out.println("1");
            HelloReply helloReply = simpleStub.sayHello(HelloRequest.newBuilder().setName(name).build());
            System.out.println("2");
            return helloReply.getMessage();
        } catch (StatusRuntimeException e) {
            System.out.println("3");
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }
}
