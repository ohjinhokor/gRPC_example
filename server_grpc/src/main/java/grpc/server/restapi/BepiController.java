package grpc.server.restapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bepi")
public class BepiController {

    private final BepiService bepiService;

    @GetMapping("/get")
    public String getMethod(@RequestHeader(name = "id") String id, @RequestBody RequestDto dto) {
        return bepiService.getMethod(id, dto.getName());
    }
}
