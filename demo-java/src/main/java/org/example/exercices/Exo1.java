package org.example.exercices;

import java.util.Scanner;

public class Exo1 {

    public static void solutionExo1(){
        int nombre;
        int carre;
        System.out.println("Merci de saisir le nombre à caluler : ");
        Scanner sc = new Scanner(System.in);
        nombre = sc.nextInt();
        carre = nombre*nombre;
        System.out.println("Le carre du nombre " + nombre + " est " + carre);

    }

    public  void solutionExo2() {
        String nom = " ";
        System.out.println("Machine : Quel est votre prénom?");
        Scanner s = new Scanner(System.in);
        nom = s.next();
        System.out.print("Utilisateur :" + " " + nom + " " + "\nMachine : Bonjour," + " " + nom + "!");
    }


    public static void solutionExo3(){
        int prix = 0;
        int nombre = 0;
        float taux = 0;
        double total = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Quel est le prix de l'article HT?");
        prix = s.nextInt();
        System.out.println("Quel est le taux de TVA ?");
        taux = s.nextFloat();
        System.out.println("Quel est le nombre d'article?");
        nombre = s.nextInt();
        total = (prix * (1 + (taux/100))) * nombre;
        System.out.print("La prix total pour le produit au prix de" + " " + prix + " " + "euros HT, avec un taux de TVA de" + " " + taux +"% et une quantité de" + " " +  nombre + " " + "est de :" + " " + total +" "+"euros.");
        s.close();
    }



}
