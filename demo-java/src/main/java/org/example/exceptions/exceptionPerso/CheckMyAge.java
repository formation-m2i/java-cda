package org.example.exceptions.exceptionPerso;

import java.util.Scanner;

public class CheckMyAge {

    public static void main() {

        System.out.println("Quel votre age ? ");
        Scanner scanner = new Scanner(System.in);
        try{
            Integer age = scanner.nextInt();
            if(age<18){
                throw new MyException("Ce film n'est pas pour toi");
            }else{
                System.out.println("Vous êtes majeur ");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
            CheckMyAge.main();
        }

    }


}
