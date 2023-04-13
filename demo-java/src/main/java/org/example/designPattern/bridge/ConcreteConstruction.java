package org.example.designPattern.bridge;

public class ConcreteConstruction implements Construction{
    @Override
    public void constructionFoundation() {
        System.out.println("Fondation en bêton");
    }

    @Override
    public void constructWalls() {
        System.out.println("Les murs en bêton");
    }

    @Override
    public void constructRoof() {
        System.out.println("Le toit en tuile");
    }
}
