package org.example.exercices;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class StructureIterativeEtTab {

    public void getMonnaieV1() {
        Integer prix = 1;
        Integer achat = 0;
        Integer paye = 0;
        Integer remise = 0;

        while (prix != 0) {
            System.out.println("Saisir le prix :");
            Scanner s6 = new Scanner(System.in);
            prix = s6.nextInt();
            System.out.println("prix :" + " " + prix);
            achat += prix;
            System.out.println("total :" + " " + achat);
        }
        System.out.println("Vous devez régler la somme de :" + " " + achat);
        System.out.println("Merci de saisir le montant de votre paiement");
        Scanner s7 = new Scanner(System.in);
        paye = s7.nextInt();
        remise = paye - achat;
        System.out.println("remise :" + " " + remise);


        while (remise / 10 >= 1) {
            System.out.println("10 euros");
            remise = remise - 10;
        }
        while (remise / 5 >= 1) {
            System.out.println("5 euros");
            remise = remise - 5;
        }
        while (remise / 1 >= 1) {
            System.out.println("1 euros");
            remise = remise - 1;
        }
    }

    public static void getMonnaieV2() {
        int achats = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Je vais prendre le montant de vos articles (entier finissant par 0), si vous n'en avez plus, tapez exit");
        String choice;
        do {
            System.out.println("Donnez moi le prix de votre article : ");
            choice = sc.next();
            try
            {
                int value = parseInt(choice);

                if((value%10) != 0)
                {
                    System.out.println("Prix incorrect, donnez moi le prix de votre article : ");
                    choice = sc.next();
                }
                else{
                    achats += value;
                }
            }catch(NumberFormatException e) {
                if(choice.equals("exit"))
                    break;
                else
                    System.out.println("Cette valeur n'est pas un chiffre, essaie encore !");

            }
        }while(!choice.equals("exit"));

        System.out.printf("Vous devez payer %d euros, combien me donnez-vous? ", achats);

        int sommeDonnee = sc.nextInt();

        while (sommeDonnee < achats)
        {
            System.out.println("Vous ne m'avez pas donné assez, vous m'avez donné " + sommeDonnee + " euros. Veuillez ajouter de l'argent svp");
            int erreur = sc.nextInt();
            sommeDonnee = sommeDonnee + erreur;
        }

        int sommeDue = sommeDonnee - achats;
        System.out.println("Je vous dois " + sommeDue + " euros" );

        while(sommeDue>=10)
        {
            sommeDue -= 10;
            System.out.println("10 euros");
        }
        while(sommeDue>=5)
        {
            sommeDue -= 5;
            System.out.println("5 euros");
        }
        while(sommeDue>=1)
        {
            sommeDue -= 1;
            System.out.println("1 euros");
        }
    }





}
