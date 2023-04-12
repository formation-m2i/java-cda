package org.example.exercices.collections.exercice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoCercle {


    public static void main() {
        List<Cercle> cercles = new ArrayList<>();

        cercles.add(new Cercle(5, 3, 2.5));
        cercles.add(new Cercle(1, 7, 2.9));
        cercles.add(new Cercle(1, 7, 5.8));
        cercles.add(new Cercle(15, 10, 3.5));
        cercles.add(new Cercle(-3, 1, 2.4));

        for (Cercle c: cercles) {
            System.out.println(c);
        }

        Collections.sort(cercles, Cercle.ComparatorAbscisse);
        System.out.println();
        System.out.println("Tableau trié selon absciss");
        System.out.println();

        for (Cercle c: cercles) {
            System.out.println(c);
        }


        Collections.sort(cercles, Cercle.ComparatorRayon);
        System.out.println();
        System.out.println("Tableau trié selon rayon");
        System.out.println();

        for (Cercle c: cercles) {
            System.out.println(c);
        }
    }








}
