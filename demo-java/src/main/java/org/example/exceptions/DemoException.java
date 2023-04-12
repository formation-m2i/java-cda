package org.example.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoException {


    public static void main() {
        System.out.println("****** division ******");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Donnez moi un nombre : ");
            Integer valeur = scanner.nextInt();
            System.out.println("Donnez moi un diviseur : ");
            Integer diviseur = scanner.nextInt();
            double resultat = valeur/diviseur;
            System.out.println("Resultat  : " + resultat);

        }catch (ArithmeticException | InputMismatchException e){
            e.printStackTrace();
        //    System.out.println("C'est une exception Arithmetic");
            DemoException.main();


        } /*catch (InputMismatchException e){
            e.printStackTrace();
           // System.out.println("C'est une exception InputMismatch");
            DemoException.main();
        }*/
        catch (Exception e){
            e.printStackTrace();
            DemoException.main();
        }


    }



}
