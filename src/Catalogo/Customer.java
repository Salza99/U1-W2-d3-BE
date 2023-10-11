package Catalogo;

import java.util.Random;

public class Customer {
    private Long id;
    private String name;
    private int tier;

    public Customer(String name, int tier) {
        this.id = new Random().nextLong(0,99999);
        this.name = name;
        this.tier = tier;
    }
}
