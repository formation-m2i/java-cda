package org.example.collections;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class ListDemo {


    public static void test() {

        List<String> liste = new ArrayList<>();
        liste.add("Mihel");
        liste.add("Toto");
        liste.add("Paul");

        String prenom1  = liste.get(0);
        String prenom2 = liste.get(1);
        Object obj = liste.get(0);

        System.out.println(liste);

        List<Integer> liste2 = new ArrayList<>(Arrays.asList(2,3,5,8,912,454,8));

        List<Integer> liste3 = new ArrayList<>(Arrays.asList(45,35,56,88,912,44,8));


        Integer min = Collections.min(liste2);

        System.out.println("le minimum de la liste est : " + min);

        for (int i = 0; i < liste2.size(); i++) {

            System.out.println(liste.get(i));

        }

        for (Integer i: liste2) {

            System.out.println("Le nombre est : " + i);

        }

        liste2.addAll(liste3);

        for (Integer i: liste2) {

            System.out.println("Le nombre est : " + i);

        }

        liste2.add(5);


        for (Integer i: liste2) {

            System.out.println("Le nombre est : " + i);

        }

    }




}
