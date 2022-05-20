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
            HelloReply helloReply = simpleStub.sayHello(HelloRequest.newBuilder().setName("Bepi").build());
            return helloReply.getMessage();
        } catch (StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }
}
