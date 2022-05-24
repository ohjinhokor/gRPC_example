package grpc.client;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("grpc")
public class Controller {

    private final GrpcClientService grpcClientService;

    @GetMapping()
    public String grpcGetMethod() {
        grpcClientService.
    }
    // @GetMapping("/test")
    // public String printMessage() {
    //     System.out.println("0");
    //     return grpcClientService.sendMessage("test");
    // }
    //
    // @GetMapping("/hihi")
    // public String hi() {
    //     return "hi";
    // }
}
