package org.example.designPattern.bridge;

public class DemoBridge {


    public static void main() {
        System.out.println("Construction en bois :");
        System.out.println();
        WoodenConstruction woodenConstruction = new WoodenConstruction();
        WoodenHouse woodenHouse = new WoodenHouse(woodenConstruction);
        woodenHouse.build();
        System.out.println();
        System.out.println("Construction en bêton : ");
        System.out.println();
        ConcreteConstruction concreteConstruction = new ConcreteConstruction();
        ConcreteHouse concreteHouse = new ConcreteHouse(concreteConstruction);
        concreteHouse.build();


    }


}
