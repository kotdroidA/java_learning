package com.anchal.kotdroid;

public class InterfaceExample4{
    public static void main (String[] args){
        Gonda gonda=new Gonda();
        gonda.dishName="panipuri";
        gonda.famousDish();
        Lucknow lko=new Lucknow();
        lko.dishName="samosa";
        lko.famousDish();
    }

}
interface City{
    void famousDish();

}
class Gonda implements City{
    String dishName="";
    @Override

    public void famousDish(){
        System.out.println("gonda ki famous "+dishName);


    }
}
 class Lucknow implements City {
     String dishName="";

     @Override
     public void famousDish() {
         System.out.println("lucknow ki famous " + dishName);
     }
 }