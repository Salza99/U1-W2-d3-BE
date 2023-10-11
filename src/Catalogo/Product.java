package Catalogo;

import java.util.Random;

public class Product {
    private Long id;
    private String name;
    private String category;
    private Double price;

    public Product(String name, String category, Double price) {
        this.id = new Random().nextLong(0,99999);
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
