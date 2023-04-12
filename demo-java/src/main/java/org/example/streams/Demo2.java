package org.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

    public static void main() {

        System.out.println(" --- Demo : filter, map et collect ");

        List<Product> productList = new ArrayList<>(Arrays.asList(
                new Product("iphone",1000, 1234587),
                new Product("table",100, 1008587),
                new Product("pc",2000, 1038587),
                new Product("chaises",200, 1038577),
                new Product("PS5",600, 1430577)));

        List<Product> listModifie = productList.stream()
                .filter(product -> product.getReference()>=1038587)
                .map(product -> {
                    product.setPrice(product.getPrice()*1.20);
                    return product;
                }).collect(Collectors.toList());


        listModifie.stream().forEach(System.out::println);

        System.out.println("Demo : toMap");

        Cart cart0 = new Cart();
        Cart cart1 = new Cart();
        Cart cart2 = new Cart();

        cart0.setProductList(Arrays.asList(productList.get(0)));
        cart1.setProductList(Arrays.asList(productList.get(1),productList.get(2)));
        cart2.setProductList(Arrays.asList(productList.get(3),productList.get(4)));


        List<Cart> carts = new ArrayList<>(Arrays.asList(cart0, cart1, cart2));

        Product[] products = carts.stream()
                .flatMap(cart -> cart.getProductList().stream())
                        .filter(product -> product.getReference()>=1038587)
                        .map(product -> {
                            product.setPrice(product.getPrice()*1.50);
                            return product;
                        }).toArray(Product[]::new);

        Arrays.stream(products).forEach(System.out::println);


    }





}
