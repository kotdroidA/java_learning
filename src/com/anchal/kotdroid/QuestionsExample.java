package com.anchal.kotdroid;

public class QuestionsExample {
    public static void main(String[] args) {

        A a = new A();

        // static
        a.staticMethod();               // Static Method
        System.out.println(a.bName);    // Srivastava


        // non-static
        a.nonStaticMethod();            // Non Static Method
        System.out.println(a.aName);    // Pushkar
    }

}

class A {
    String aName = "Pushkar";               //  instance variable
    public static String bName = "Srivastava";    // static variable

    void nonStaticMethod() {
        System.out.println("Non Static Method");
    }

    static void staticMethod() {
        System.out.println("Static Method");
    }
}

