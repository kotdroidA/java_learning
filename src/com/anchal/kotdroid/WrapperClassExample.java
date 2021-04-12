package com.anchal.kotdroid;

public class WrapperClassExample {
    public static void main(String[] args) {

        // primitive int data type
        int a = 20;

        // Boxing(Way 1)  converting primitive data type to it's wrapper object
        Integer ab1 = Integer.valueOf(a);
        System.out.println("Boxing Way 1 Integer.valueOf(a) : " + ab1);

        // Boxing(Way 2)  converting primitive data type to it's wrapper object
        Integer ab2 = new Integer(a);
        System.out.println("Boxing Way 2 new Integer(a) : " + ab2);

        // Auto Boxing
        Integer ab3 = a;   // here compiler will add Integer.valueOf(a);
        System.out.println("AutoBoxing Way a : " + ab3);


        // UnBoxing
        Integer a1 = new Integer(04);
        int au = a1.intValue();
        System.out.println("Unboxing by a1.intValue() :" + au);

        // Auto Unboxing
        int aub = a1; // here compiler will add a1.intValue()
        System.out.println("AutoUnboxing : " + aub);



        // primitive char data type
        char c='a';
        // Boxing(Way 1)  converting primitive data type to it's wrapper object
        Character c1=Character.valueOf(c);
        System.out.println("c1:"+c1);
        // Boxing(Way 2)  converting primitive data type to it's wrapper object
        Character c2=new Character(c);
        System.out.println("c2:"+c2);
        // Auto Boxing

        Character c3=c;// here compiler will add Character.valueOf(c);
        System.out.println("c3;"+c3);
                Character c4=new Character(c3);
        Character c5=c3.charValue();
        System.out.println("c3;"+c3);
        // Auto Unboxing
        // UnBoxing
        Character c6=c;   // here compiler will add c.charValue()
        System.out.println("c6:"+c6);

        // primitive float data type
        float f = 1.0f;
        // Boxing(Way 1)  converting primitive data type to it's wrapper object
        Float f1=Float.valueOf(f);
        System.out.println("f1;"+f1);
        // Boxing(Way 2)  converting primitive data type to it's wrapper object
        Float f2=new Float(f);
        System.out.println("f2:"+f2);
        // Auto Boxing
        Float f3=f;// here compiler will add Float.valueOf(f);
        System.out.println("f3:"+f3);
        // UnBoxing







    }
}

