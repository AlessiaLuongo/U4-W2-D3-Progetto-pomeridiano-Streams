import entities.Customer;
import entities.Order;
import entities.Product;

import java.awt.color.ProfileDataException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {




    public static void main(String[] args) {
    Product product1 = new Product("Harry Potter e il prigioniero di Azkaban", "Book");
    Product product2 = new Product("La Storia del Rock", "Book");
    Product product3 = new Product("T-Shirt", "Abbigliamento");
    Product product4 = new Product("Pantaloni", "Abbigliamento");
    Product product5 = new Product("Biberon", "Baby");
    Product product6 = new Product("Culla", "Baby");
    Product product7 = new Product("Come smacchiare leopardi", "Book");
    Product product8 = new Product("Ciuccio", "Baby");

    List<Product> listOfAllProducts = new ArrayList<>();
        listOfAllProducts.add(product1);
        listOfAllProducts.add(product2);
        listOfAllProducts.add(product3);
        listOfAllProducts.add(product4);
        listOfAllProducts.add(product5);
        listOfAllProducts.add(product6);
        listOfAllProducts.add(product7);
        listOfAllProducts.add(product8);

// LISTA DI PRODOTTI DI CATEGORIA BOOK CON PREZZO >100

List<Product> listFirstExcercise = listOfAllProducts.stream().filter(product -> product.getCategory().equals("book") && product.getPrice() > 100).toList();
if (!listFirstExcercise.isEmpty()){
    System.out.println(listFirstExcercise);
}else{
    System.out.println("Nothing found");
}

// LISTA DI ORDINI DI CATEGORIA BABY

        Customer customer1 = new Customer("Customer1");
        Customer customer2 = new Customer("Customer2");
        Customer customer3 = new Customer("Customer3");

        Order order1 = new Order("Harry Potter e il prigioniero di Azkaban", customer1);
        Order order2 = new Order("La Storia del Rock", customer1);
        Order order3 = new Order("T-Shirt", customer2);
        Order order4 = new Order("Pantaloni", customer2);
        Order order5 = new Order("Biberon", customer3);
        Order order6 = new Order("Culla", customer3);
        Order order7 = new Order("Come smacchiare leopardi", customer1);
        Order order8 = new Order("Ciuccio", customer2);

        order1.getProducts().add(product1);
        order2.getProducts().add(product2);
        order3.getProducts().add(product3);
        order4.getProducts().add(product4);
        order5.getProducts().add(product5);
        order6.getProducts().add(product6);
        order7.getProducts().add(product7);
        order8.getProducts().add(product8);

        


}}