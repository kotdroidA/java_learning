package com.anchal.kotdroid;

abstract class Cream {

    int rate;
    int name;

    abstract void apply();

    abstract void apply1();

    void displayName() {
        System.out.println("Inside display Name function");
    }
}

class Joy extends Cream {
    @Override
    void apply() {
        System.out.println("Joy cream Face pe apply krte hain ");
    }

    @Override
    void apply1() {
    }

    @Override
    void displayName() {

        System.out.println("Ovverriden in Joy Class ");
        super.displayName();
    }
}

class Alovera extends Cream {
    @Override
    void apply() {
        System.out.println("Ye thandi me apply krte hain.");
    }

    @Override
    void apply1() {

    }
}

class CreamExample {
    public static void main(String[] args) {
        Cream joy = new Joy();
        joy.rate = 24;

        joy.apply();
        joy.displayName();

        Cream alovera = new Alovera();
        alovera.rate = 24;

        alovera.apply();
        alovera.displayName();
    }
}

