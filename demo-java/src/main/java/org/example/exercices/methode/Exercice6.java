package org.example.exercices.methode;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Exercice6 {
    public static void askNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez moi deux nombres séparés par un espace");
        String answer = sc.nextLine();

        String[] table = answer.split(" ");
        int[] nbTable = new int[table.length];

        for (int i = 0; i < table.length; i++) {
            nbTable[i] = parseInt(table[i]);
        }

        int nbPgcd = gcdRecursive(nbTable[0], nbTable[1]);
        System.out.printf("Le plus grand diviseur commun de %d et %d est %d", nbTable[0], nbTable[1], nbPgcd);
    }

    public static int gcdRecursive(int firstNumber, int secondNumber) {

        int nbPgcd = 0;
        int i = Math.min(firstNumber, secondNumber);

        //Best Performance => reverse loop

        for(int j = i; i >= 1; i--)
        {
            if(firstNumber%i==0 && secondNumber%i==0)
                nbPgcd = i; break;
        }

        return nbPgcd;
    }
}
