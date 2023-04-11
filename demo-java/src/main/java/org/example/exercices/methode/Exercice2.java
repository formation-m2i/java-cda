package org.example.exercices.methode;

import java.util.Scanner;

public class Exercice2 {
    public static void size()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Donnez moi la hauteur du rectangle :");
        int hauteur = sc.nextInt();

        System.out.println("Donnez moi la largeur du rectangle :");
        int largeur = sc.nextInt();

        drawRectangle(hauteur, largeur);
    }

    public static void drawRectangle(int hauteur, int largeur) {

        for (int i = 0; i < hauteur ; i++) {
            String result;
            if(i == 0 || i == hauteur-1)
            {
                result = new String(new char[largeur]).replace("\0", "*");
                System.out.println(result);
            }
            else
            {
                result = new String(new char[largeur]).replace("\0", " ");
                char[] line = result.toCharArray();

                line[0] = '*';
                line[largeur-1] = '*';

                result = new String(line);
                System.out.println(result);
            }

        }
    }
}
