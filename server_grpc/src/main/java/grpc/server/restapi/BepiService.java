package grpc.server.restapi;

import org.springframework.stereotype.Service;

@Service
public class BepiService {
    public String getMethod(String id, String name) {
        StringBuilder sb = new StringBuilder();
        sb.append("id : " + id + "\n");
        sb.append("name : " + name);

        return sb.toString();
    }
}
