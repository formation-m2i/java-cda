package org.example.collections.map;

import org.example.collections.entity.Product;
import org.example.collections.entity.User;

import java.util.*;

public class MapDemo {

    public static void main() {

        Map<Integer, String> map = new HashMap<>();

      /*  map.put(2, "Maison");
        map.put(3, "Chalet");
        map.put(5, "Appartement");
        map.put(6, "Caravane");

        System.out.println("get un element da la map " + map.get(6));


        System.out.println("Iteration dans la map pour les clés :");

        for (Integer key: map.keySet()) {

            System.out.println("Key " + key);

        }

        System.out.println("Iteration dans la map pour récupérer les les valeurs et les clés : ");

        for (Map.Entry<Integer, String> entry: map.entrySet()) {

            System.out.println("Entry key : " + entry.getKey() + " Entry Value " + entry.getValue());

        }

        Map<User, Product> userProductMap = new HashMap<>();

        User user = new User();
        user.setFirstName("Eddy");
        user.setLastName("Mitchel");

        Product product = new Product();

        userProductMap.put(user,product);
        System.out.println();
        System.out.println("get product by user : " + userProductMap.get(user));*/

        User user1 = new User("Michel","Jonaz", "1234","michel@gmail.com");
        User user2 = new User("Jean-Louis","Aubert", "1234","jean-louis@gmail.com");
        User user3 = new User("Alain","Baschung","1234","alain@gmail.com");


        List<User> users = new ArrayList<>();

        users.addAll(Arrays.asList(user1,user2,user3));

        List<Product> products;

        Map<Integer,List<Product> > map2 = new HashMap<>();

        for (int i = 0; i < users.size(); i++) {
            products = new ArrayList<>();
            Product.addProduct(10, products);
            map2.put(users.get(i).getId(), products);
        }

        for (Map.Entry<Integer, List<Product>>entry: map2.entrySet()) {

            for (Product p : entry.getValue()) {
                System.out.println("User id " + entry.getKey() + " : " + p);

            }

        }


    }


}
