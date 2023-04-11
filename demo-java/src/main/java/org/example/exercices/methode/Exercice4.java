package org.example.exercices.methode;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercice4 {

    public static void askWords()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez moi des mots séparés par un espace");
        String answer = sc.nextLine();

        System.out.println("Quelle taille minimale doivent avoir les mots ? ");
        int nb = sc.nextInt();

        String[] table = answer.split(" ");

        ArrayList<String> filteredWord = filterWordsByLength(nb, table);
        System.out.println("Voici vos mots avec la longueur minimale de " + nb + " : " + filteredWord);



    }

    public static ArrayList<String> filterWordsByLength(int minLength, String[] mots) {

        ArrayList<String> filterTable = new ArrayList<String>();

        for (String word: mots) {
            if(word.length()>= minLength)
            {
                filterTable.add(word);
            }
        }

        return filterTable;
    }
}
