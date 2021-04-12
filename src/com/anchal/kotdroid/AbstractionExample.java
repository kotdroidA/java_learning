package com.anchal.kotdroid;

public class AbstractionExample {
    public static void main(String[] args) {

        Car car = new Car();
        car.model = 12;
        car.start();

        Scooter scooter = new Scooter();
        scooter.model = 15;
        scooter.start();

        Truck truck = new Truck();
        truck.model = 16;
        truck.start();
    }
}

abstract class  Vehicle {
     int model;
     abstract void  start();
}

class Car extends Vehicle{

    @Override
    void start() {
        System.out.println("Model number: " + model);
        System.out.println("Start By Key");
    }
}

class Scooter extends  Vehicle {

    @Override
    void start() {
        System.out.println("Model number: " + model);
        System.out.println("Start with Kick");
    }
}

class Truck extends  Vehicle{

    @Override
    void start() {
        System.out.println("Model number: " + model);
        System.out.println("Start with Manual Power");
    }
}
