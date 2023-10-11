package Catalogo;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Order {
    private Long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;

    public Order( Customer customer, List<Product> products) {
        this.id = new Random().nextLong(0, 99999);
        this.orderDate = LocalDate.now();
        this.deliveryDate = this.orderDate.plusDays(7);
        this.customer = customer;
        this.status = "In Preparazione";
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", products=" + products +
                ", customer=" + customer +
                '}';
    }
}
