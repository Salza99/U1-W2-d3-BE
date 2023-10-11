import Catalogo.Customer;
import Catalogo.Order;
import Catalogo.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // clienti
        Customer a = new Customer("Marco", 1);
        Customer b = new Customer("Lucio", 1);
        Customer c = new Customer("Maria", 2);
        Customer d = new Customer("Angelo", 2);
        Customer e = new Customer("Sempronio", 1);
        // Categoria book
        Product bookA = new Product("La storia di Cesare","Books",24.99);
        Product bookB = new Product("Le armi medievali","Books",19.99);
        Product bookC = new Product("Roma: l'impero infinito","Books",240.99);
        Product bookD = new Product("Il guardiano degli innocenti","Books",14.99);
        Product bookE = new Product("La spada del destino","Books",160.99);
        Product bookF = new Product("Il sangue degli elfi","Books",12.99);
        Product bookG = new Product("Frakenstei","Books",240.99);
        Product bookH = new Product("Racconti del terrore","Books",19.99);
        Product bookI = new Product("L'incubo di Hill House","Books",9.99);
        Product bookL = new Product("Le guide del tramonto","Books",120.99);
        Product bookM = new Product("Cronache marziane","Books",16.99);
        //categoria Baby
        Product babyA = new Product("Pannolini","Baby",9.99);
        Product babyB = new Product("fasciatoio","Baby",196.99);
        Product babyC = new Product("Salviette","Baby",6.99);
        Product babyD = new Product("Carrozzina","Baby",186.99);
        Product babyE = new Product("Culla","Baby",124.99);
        //categoria boys
        Product boysA = new Product("t-shirt","Boys",12.99);
        Product boysB = new Product("airpods","Boys",19.99);
        Product boysC = new Product("watch","Boys", 29.99);
        Product boysD = new Product("skateboard","Boys", 29.99);
        Product boysE = new Product("profumo","Boys", 9.99);
        //liste di prodotti
        //libri
        List<Product> listOfBooksA = new ArrayList<>(List.of(bookA, bookB, bookC, bookD, bookE, bookF, bookG, bookH, bookI,bookL,bookM));
        List<Product> listOfBooksB = new ArrayList<>(List.of(bookA, bookB, bookC, bookD, bookE));
        //baby
        List<Product> listOfBabyA = new ArrayList<>(List.of(babyA,babyB,babyE));
        List<Product> listOfBabyB = new ArrayList<>(List.of(babyA,babyE,babyD));
        //boys
        List<Product> listOfBoysA = new ArrayList<>(List.of(boysA,boysC));
        List<Product> listOfBoysB = new ArrayList<>(List.of(boysE,boysA,boysD));

        //ordini
        Order orderA = new Order(LocalDate.of(2020,10,8),a,listOfBooksA);
        Order orderB = new Order(LocalDate.of(2020,10,8),a,listOfBabyB);
        Order orderC = new Order(LocalDate.of(2020,10,8),b,listOfBabyA);
        Order orderD = new Order(LocalDate.of(2020,10,8),c,listOfBooksB);
        Order orderE = new Order(LocalDate.of(2020,10,8),d, listOfBoysB);
        Order orderF = new Order(LocalDate.of(2020,10,8),e, listOfBooksA);
        //lista di ordini
        List<Order> listOfOrder = new ArrayList<>();
        listOfOrder.add(orderA);
        listOfOrder.add(orderB);
        listOfOrder.add(orderC);
        listOfOrder.add(orderD);
        //Esercizio 1
        System.out.println("---------------esercizio 1--------------");
        listOfBooksA.stream().filter(product -> product.getPrice() < 100 ).forEach(System.out::println);
        //Esercizio 2
        System.out.println("---------------esercizio 2--------------");
        List<Order> listOfBabyOrder = listOfOrder.stream().filter(order -> order.getProducts().stream().anyMatch(product -> product.getCategory().equals("Baby"))).toList();
        listOfBabyOrder.forEach(System.out::println);
        //Esercizio 3
        System.out.println("---------------esercizio 3--------------");
        listOfBoysB.stream().forEach(product -> product.setPrice(product.getPrice() * 90 / 100));
        System.out.println(listOfBoysB);
        //Esercizio 4
        System.out.println("---------------esercizio 4--------------");

    }
}