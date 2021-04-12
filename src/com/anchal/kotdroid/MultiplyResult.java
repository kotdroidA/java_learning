package com.anchal.kotdroid;
import java.util.*;
public class MultiplyResult {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("hwo many numbers in list1");
        int size1=sc.nextInt();
        sc.nextLine();


        System.out.println("please enter numbers in list1");
        Stack<Integer> list1=new Stack<>();
        for(int i=0; i<size1; i++){
            list1.add(sc.nextInt());
        }

        System.out.println("hwo many numbers in list2");
        int size2=sc.nextInt();
        sc.nextLine();

        System.out.println("please enter numbers in list2");
        Stack<Integer> list2=new Stack<>();
        for(int i=0; i<size2; i++){
            list2.add(sc.nextInt());
        }
        Stack<Integer> result=new Stack<>();
        for(int i=0; i<size1; i++){
           int multiplication = list1.get(i)*list2.get(i);
           result.add(multiplication);
        }


        result.forEach(data->{
            System.out.println(data);
        });




    }
}
