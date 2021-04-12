package com.anchal.kotdroid;

public class InterfaceExample3 {

    public static void main(String[] args) {

        // Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.length = 3;
        rectangle.breadth = 5;
        rectangle.calculateArea();
        rectangle.calculateCircumference();

        // Circle
        Circle circle = new Circle();
        circle.radius = 5;
        circle.calculateArea();
        circle.calculateCircumference();
    }
}


interface Shape {
    void calculateArea();

    void calculateCircumference();
}

class Rectangle implements Shape {

    int length;
    int breadth;


    @Override
    public void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of rectangle having length " + length + " and breadth " + breadth + " is " + area);
    }

    @Override
    public void calculateCircumference() {

        int circum = 2 * (length + breadth);
        System.out.println("Circumference of rectangle having length " + length + " and breadth " + breadth + " is " + circum);
    }
}

class Circle implements Shape {

    int radius;

    @Override
    public void calculateArea() {
        float area = 3.14f * radius * radius;
        System.out.println("Area of Circle having radius " + radius + " is " + area);

    }

    @Override
    public void calculateCircumference() {

        float circum = 2 * 3.14f * radius;
        System.out.println("Circumference of Circle having radius " + radius + " is " + circum);

    }
}
