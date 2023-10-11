import Catalogo.Customer;
import Catalogo.Order;
import Catalogo.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Map<Customer, List<Order>> mapOfCustomerwithOrders = new HashMap<>();
        Customer a = new Customer("Marco", 1);
        Customer b = new Customer("Lucio", 1);
        Customer c = new Customer("Maria", 2);
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

        List<Product> listOfBooks = new ArrayList<>(List.of(new Product[]{bookA, bookB, bookC, bookD, bookE, bookF, bookG, bookH, bookI,bookL,bookM}));

        listOfBooks.stream().filter(product -> product.getPrice() < 100 ).forEach(System.out::println);
        Order orderA = new Order(a,listOfBooks);



    }
}