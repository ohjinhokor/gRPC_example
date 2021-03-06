package grpc.server.restapi;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Customer {
    private long key;
    private String name;

    public Customer(long key, String name) {
        this.key = key;
        this.name = name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return this.name;
    }
}
