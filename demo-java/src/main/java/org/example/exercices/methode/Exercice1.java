package org.example.exercices.methode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

public class Exercice1 {

        public static void enterArray(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Entrez moi des nombres entiers séparés par un espace");
            String answer = sc.nextLine();

            String[] table = answer.split(" ");
            int[] nbTable = new int[table.length];

            for (int i = 0; i < table.length; i++) {
                nbTable[i] = parseInt(table[i]);
            }

            int max = findMaxIntInArray(nbTable);

            System.out.println("La valeur maximale du tableau " + Arrays.toString(nbTable) + " est " + max
            );
        }

        public static int findMaxIntInArray(int[] intArray) {
            int max = intArray[0];

            for (int i = 1; i < intArray.length; i++) {
                if(intArray[i] > max)
                {
                    max = intArray[i];
                }
            }
            return max;
        }

}
