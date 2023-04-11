package org.example.exercices.methode;

import java.util.Scanner;

public class Exercice3 {
    public static void AskText()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donnez moi un texte : ");

        String sentence = sc.nextLine();

        int word = getWordsAmount(sentence);

        System.out.printf("Le texte comporte %d mots", word);
    }

    public static int getWordsAmount(String sentence)
    {

        // \\s+ divise la chaîne donnée autour d’un espace blanc
        String[] words = sentence.split("\\s+");

        return words.length;
    }
}
