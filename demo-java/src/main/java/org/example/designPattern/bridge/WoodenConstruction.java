package org.example.designPattern.bridge;

public class WoodenConstruction implements Construction{
    @Override
    public void constructionFoundation() {
        System.out.println("Fondation en bois");
    }

    @Override
    public void constructWalls() {
        System.out.println("Les murs en bois");
    }

    @Override
    public void constructRoof() {
        System.out.println("Le toit en bois");
    }
}
