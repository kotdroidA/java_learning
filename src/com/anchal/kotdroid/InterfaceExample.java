package com.anchal.kotdroid;

public class InterfaceExample {

    public static void main(String[] args) {
        Child child = new Child();
        child.name ="Anchal Srivastava";

        child.printOccupation();
        child.printMotherName();
        child.printGrandMotherName();

    }



}

class Father {
    String name = "";

    void printOccupation() {
        System.out.println("Court Work");
    }
}

interface Mother {
    void printMotherName();
}

interface GrandMother {
    void printGrandMotherName();
}

class Child extends Father implements Mother, GrandMother {

    @Override
    public void printMotherName() {
        System.out.println("Mamta");
    }

    @Override
    public void printGrandMotherName() {
        System.out.println("Geeta Devi");
    }
}


