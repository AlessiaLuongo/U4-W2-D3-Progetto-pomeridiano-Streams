import entities.Customer;
import entities.Order;
import entities.Product;

import java.awt.color.ProfileDataException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Main {




    public static void main(String[] args) {
    Product product1 = new Product("Harry Potter e il prigioniero di Azkaban", "Book");
    Product product2 = new Product("La Storia del Rock", "Book");
    Product product3 = new Product("T-Shirt", "Boys");
    Product product4 = new Product("Pantaloni", "Boys");
    Product product5 = new Product("Biberon", "Baby");
    Product product6 = new Product("Culla", "Baby");
    Product product7 = new Product("Come smacchiare leopardi", "Book");
    Product product8 = new Product("Skateboard", "Boys");


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
    System.out.println("LISTA DI PRODOTTI DI CATEGORIA BOOK CON PREZZO >100: " + listFirstExcercise);
}else{
    System.out.println("Nothing found");
}

// LISTA DI ORDINI DI CATEGORIA BABY

        Customer customer1 = new Customer("Customer1", 1);
        Customer customer2 = new Customer("Customer2", 2);
        Customer customer3 = new Customer("Customer3",2);
        Customer customer4 = new Customer("Customer3",3);


        Order order1 = new Order("Delay", customer1);
        Order order2 = new Order("Success", customer1);
        Order order3 = new Order("Failure", customer2);
        Order order4 = new Order("Success", customer2);
        Order order5 = new Order("Success", customer2);


        order1.getProducts().add(product1);
        order1.getProducts().add(product2);
        order1.getProducts().add(product3);
        order2.getProducts().add(product4);
        order2.getProducts().add(product5);
        order3.getProducts().add(product5);
        order3.getProducts().add(product6);
        order3.getProducts().add(product6);

        List<Order> listOfOrders = new ArrayList<>();
        listOfOrders.add(order1);
        listOfOrders.add(order2);
        listOfOrders.add(order3);
        listOfOrders.stream().filter(order -> order.getProducts().stream().anyMatch(product -> product.getCategory().equals("Baby"))).toList();

        List<Order> listOfOrdersWithBabyProducts = listOfOrders.stream()
                .filter(order -> order.getProducts().stream()
                        .anyMatch(product -> product.getCategory().equals("Baby")))
                .toList();

        System.out.println("LISTA DI ORDINI DI CATEGORIA BABY: " + listOfOrdersWithBabyProducts);
        System.out.println(listOfOrdersWithBabyProducts.size());

//LISTA DI PRODOTTI DI CATEGORIA BOYS SCONTATI DEL 10%

        List<Product> listOfBoyProductsWithDiscount = listOfAllProducts.stream()
                .filter(product -> product.getCategory().equals("Boys"))
                .map(product -> new Product(product.getName(), product.getCategory(), product.getPrice() * 0.9))
                .collect(Collectors.toList());
        System.out.println("LISTA DI PRODOTTI DI CATEGORIA BOYS SCONTATI DEL 10%: " + listOfBoyProductsWithDiscount);

// LISTA DI PRODOTTI ORDINATI DA CLIENTE DI TIER 2 TRA L’01-FEB-2021 e L’01-APR-2021
// LISTA DI PRODOTTI ORDINATI DA CLIENTE DI TIER 2 TRA L’01-FEB-2021 e L’01-APR-2021

        LocalDate startDate = LocalDate.of(2021, 2, 1);
        LocalDate endDate = LocalDate.of(2021, 4, 1);

        List<Product> listOfProductsOrderedByTierTwo = listOfOrders.stream()
                .filter(order -> Objects.equals(order.getCustomer().getTier(), 2))
                .filter(order -> order.getOrderDate().isAfter(startDate) && order.getOrderDate().isBefore(endDate))
                .flatMap(order -> order.getProducts().stream())
                .collect(Collectors.toList());

    }}