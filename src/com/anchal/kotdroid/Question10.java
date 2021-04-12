package com.anchal.kotdroid;

class A1 {
    static int i = 1111;

    static {
        i = i-- - --i;
    }

    {
        i = i++ + ++i;
    }
}

class B extends A1 {
    static {
        i = --i - i--;
    }

    {
        i = ++i + i++;
    }
}


class A3 {
    int methodOfA() {
        return (true ? null : 0);
    }
}


public class Question10 {
    public static void main(String[] args) {
        B b = new B();

//        System.out.println(b.i);

        A3 a3 = new A3();

        System.out.println(a3.methodOfA());
    }
}
