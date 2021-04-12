package com.anchal.kotdroid;

import java.util.*;

public class CollectionExample2 {
    public static void main(String[] args) {
        ArrayList<String>arrList=new ArrayList<>();
        //adding object to Arraylist
        arrList.add("Soli");
        arrList.add("Juli");
        arrList.add("Golu");
        arrList.add("Kajal");
        arrList.add("Kajal");
        arrList.add("Anchal");


        //adding element at given index
        arrList.add(1,"Nidhi");
        System.out.println(arrList);


        //remove given element
        boolean b= arrList.remove("Golu");
        System.out.println("Golu removed ? "+b);
        System.out.println(arrList);

        //remove given element at index
        String name= arrList.remove(3);
        System.out.println(name+" remove from the list.");
        System.out.println(arrList);

        //object of Scanner
        Scanner sc=new Scanner(System.in);
        System.out.println("how many brothers you have ?");
        int broCount=sc.nextInt();
        sc.nextLine();


        ArrayList<String> brotherList=new ArrayList<>();
        for(int i=0; i<broCount; i++){
            System.out.print("brother "+(i+1)+" : ");
            String naam= sc.nextLine();
            brotherList.add(naam);
        }
        //add one list to another list
        boolean c= arrList.addAll(brotherList);
        String d=c?"yes":"No";
        System.out.println("is the list added ?"+d);
        System.out.println(arrList);
        //using removeAll() method
        boolean r= arrList.removeAll(brotherList);
         System.out.println(r);
         System.out.println(arrList);

        // using method retainAll()
        // boolean t=arrList.retainAll(brotherList);
        //System.out.println(arrList);

        //using method contains

        boolean y= arrList.contains("Juli");
        String n=y?"yes":"No";
        System.out.println("is juli on this list "+n);
        System.out.println(arrList);


        // using method containsAll()
        boolean v=arrList.containsAll(brotherList);
        System.out.println(v);
        System.out.println(arrList);


        // converting List to Array
        Object[] str=arrList.toArray();
        for(int i=0; i<str.length; i++){
            System.out.println(str[i]);
        }
        //traversal using list iterator
        ListIterator<String> ltr=arrList.listIterator(arrList.size());

       while(ltr.hasPrevious()){
        String op= ltr.previous();
        System.out.println(op);
       }

       //using removeIf(Predicate f) function
       arrList.removeIf(data-> (data.length()>6));

        System.out.println("--------removeIf()---------");
        System.out.println(arrList);

        // using method equals()
        boolean e=arrList.equals(brotherList);
        System.out.println(e);
        boolean e2=arrList.equals(arrList);
        System.out.println(e2);

        //using method E set()
        String s=arrList.set(2,"Ritika");
        System.out.println(arrList);

        // using method indexOf
        arrList.add("Kajal");
        int a=arrList.indexOf("Kajal");
        System.out.println("index of Kajal in the list "+a);

        // using method lastIndexOf()
        int bb=arrList.lastIndexOf("Kajal");
        System.out.println("last Index Of Kajal in the list "+bb);

        //using method subList()
        List<String> st=arrList.subList(1,5);
        System.out.println(st);


    }
}
