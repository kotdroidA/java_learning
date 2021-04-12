package com.anchal.kotdroid;

public class InterfaceExample2 {

    public static void main(String[] args) {

        Bike2 bike = new Bike2();

        bike.bikeName = "apache";

        bike.speedUp(20);
        bike.printStatus();  //

        bike.applyBreak(10);
        bike.printStatus(); //


        Car2 car = new Car2();
        car.carName = "BMW";

        car.speedUp(100);
        car.printStatus();

        car.applyBreak(20);
        car.printStatus();

    }

}


interface Vehicle2 {


    void speedUp(int speed);

    void applyBreak(int breakDown);

}

class Bike2 implements Vehicle2 {

    int speed = 0;
    String bikeName;


    @Override
    public void speedUp(int speed1) {
        speed = speed + speed1;
    }

    @Override
    public void applyBreak(int breakDown) {
        speed = speed - breakDown;
    }

    void printStatus() {
        System.out.println("The" + bikeName + " Bike's speed is " + speed + "Km/h");
    }
}

class Car2 implements Vehicle2 {
    int speed = 0;
    String carName;

    @Override
    public void speedUp(int speed1) {
        speed = speed + speed1;
    }

    @Override
    public void applyBreak(int breakDown) {
        speed = speed - breakDown;
    }

    void printStatus() {
        System.out.println("The " + carName + " car's speed is " + speed + "Km/h");
    }
}
