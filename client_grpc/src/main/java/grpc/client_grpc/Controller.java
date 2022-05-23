package grpc.client_grpc;

import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("grpc")
public class Controller {

    private final GrpcClientService grpcClientService;

    @GetMapping("/test")
    public String printMessage() {
        System.out.println("0");
        return grpcClientService.sendMessage("test");
    }
}
