package com.anchal.kotdroid;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {



      //  TreeSet ka instance
        TreeSet<String> st=new TreeSet<>();
        st.add("Antra");
        st.add("Mintra");
        st.add("tintra");
        st.add("tintra");
        st.add("tintra");
        st.add("ebay");
        System.out.println(st);

        //Set<Integer> s=new LinkedHashSet<>();  // order not maintain, set not sorted
        Set<Integer> s1=new HashSet<>();  // order not maintain, set sorted
        s1.add(5);
        s1.add(6);
        s1.add(7);
        s1.add(8);



        Set<Integer> s2=new HashSet<>();
        s2.add(5);
        s2.add(6);
        s2.add(1);
        s2.add(3);

        System.out.println("s1 : "+s1);
        System.out.println("s2 : "+s2);

        s1.retainAll(s2);//intersection of set
        System.out.println(s1);
        s1.addAll(s2);//union of set
        System.out.println(s1);
        s1.removeAll(s2);//difference of set
        System.out.println(s1);
        s2.removeAll(s1);//difference of set
        System.out.println(s2);






    }
}
