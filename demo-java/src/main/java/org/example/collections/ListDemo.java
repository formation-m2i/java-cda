package org.example.collections;

import org.example.collections.entity.RandomPerson;
import static org.example.collections.entity.RandomPerson.affichePerson;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static List<RandomPerson> listeDemo = new ArrayList<>();
    public static List<RandomPerson> listeDemo2 = new ArrayList<>();

    public static List<RandomPerson> listeDemo3 = new ArrayList<>();

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
        System.out.println("-- creation list demo random --- ");

        RandomPerson.addData(5, listeDemo);
        RandomPerson.affichePerson(listeDemo);

        System.out.println("-- ajout personne dans list demo random --- ");
        RandomPerson randomPerson = new RandomPerson();
        randomPerson.firstName ="Karim";
        listeDemo.add(2, randomPerson);
        RandomPerson randomPerson2 = new RandomPerson();
        randomPerson.firstName ="Theo";

        System.out.println("-- remplacement personne dans list demo random à l'emplacement d'une autre personne --- ");

        listeDemo.add(listeDemo.indexOf(randomPerson), randomPerson2);
        RandomPerson.affichePerson(listeDemo);

        System.out.println("-- suppression personne par objet et index dans list demo random --- ");
        listeDemo.remove(randomPerson);
        listeDemo.remove(2);

        System.out.println("-- ajoute listdemo2 dans listdemo --- ");

        RandomPerson.addData(7, listeDemo2);
        RandomPerson.affichePerson(listeDemo);
        listeDemo.addAll(listeDemo2);

        System.out.println("----- contains ------- ");

        System.out.println("Est ce que la liste listedemo contient listdemo2 " + listeDemo.containsAll(listeDemo2));

        listeDemo.remove(9);

        System.out.println("Est ce que la liste listedemo contient listdemo2 " + listeDemo.containsAll(listeDemo2));

        System.out.println("**** sous liste *****");

        System.out.println("sous liste de la liste demo de l'index 3 à 9 : ");

        listeDemo3 = listeDemo.subList(3,9);

        affichePerson(listeDemo3);


    }





}
