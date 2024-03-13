import entities.Order;
import entities.Product;

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

List<Product> listFirstExcercise = listOfAllProducts.stream().filter(product -> product.getCategory().equals("book") && product.getPrice() > 100).toList();
if (!listFirstExcercise.isEmpty()){
    System.out.println(listFirstExcercise);
}else{
    System.out.println("Nothing found");
}





    }


}