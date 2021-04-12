package com.anchal.kotdroid;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {



        //  we can make collection object by  2 way

        //way 1 .type safe collection
        ArrayList<Integer> numList = new ArrayList<>();

        //adding object to Arraylist
        numList.add(10);
        numList.add(Integer.valueOf(5));
        numList.add(new Integer(6));
        System.out.println(numList);


        //way 2.type unsafe collection
        Vector num = new Vector();


        //adding object to vector
        num.add(4);
        num.add('f');
        num.add("bandar");
        num.add(1.0f);
        num.add(3.00);
        num.add(34545l);
        num.add(5 > 3);


        Student s = new Student(5, "bandar");
        num.add(s);
        System.out.println(num);

        // functions of collections

        // for list size
        System.out.println(num.size());  // 8

        // to get item at any index
        System.out.println(num.get(2));  //bandar


        // Now we are going to iterate vector using methods we studied

        // Way 1. using for Loop
        System.out.println("--------Iteration Via For Loop-------");
        for (int i = 0; i < num.size(); i++) {
            Object obj = num.get(i);
            System.out.println(obj);
        }

        // Way 2. Iteration Via Enhanced For Each Loop
        System.out.println("--------Iteration Via Enhanced-For Loop-------");
        for (Object i : num) {

            System.out.println(i);
        }

        // Way 3. while loop
        System.out.println("--------Iteration Via while Loop-------");
        int i = 0;
        while (i < num.size()) {
            Object obj = num.get(i);
            System.out.println(obj);
            i++;
        }

        //Way 4.do while loop
        System.out.println("--------Iteration Via do while Loop-------");
        int j = 0;
        do {
            Object obj = num.get(j);
            System.out.println(obj);
            j++;
        }
        while (j < num.size());

        ArrayList<LifeLine> lifeLineList = new ArrayList<>();
        LifeLine dii = new LifeLine(8344773480l, "Nidhi", "Banglore");
        lifeLineList.add(dii);
        LifeLine bandar = new LifeLine(853734968l, "Anchal", "GRP");
        lifeLineList.add(bandar);
        LifeLine pushi = new LifeLine(9876936279l, "Pushkar", "Chandigarh");
        lifeLineList.add(pushi);
        LifeLine julu = new LifeLine(39034304109l, "Juli", "Khajuri");
        lifeLineList.add(julu);
        LifeLine soli = new LifeLine(6387043485755l, "Richa", "GRP");
        lifeLineList.add(soli);
        LifeLine kajal = new LifeLine(96964343462094l, "Arpita", "Ludhiana");
        lifeLineList.add(kajal);
        LifeLine golu = new LifeLine(73981193434438l, "Ritika", "Basti");
        lifeLineList.add(golu);
        LifeLine beauty = new LifeLine(63908342322332728l, "Yshoda", "Majhawa");
        lifeLineList.add(beauty);
        LifeLine rishab = new LifeLine(92326700112462l, "Rishab", "Charsari");
        lifeLineList.add(rishab);
        LifeLine madhu = new LifeLine(83424424182241812l, "Madhukar", "Lko");
        lifeLineList.add(madhu);
        LifeLine sahil = new LifeLine(97928248343402l, "Vedansh", "Bhinga");
        lifeLineList.add(sahil);


        // Way 5. List Iteration using Iterator , ye forward direction me iteration krta hai.
        System.out.println("-------Iteration Using Iterator---------");
        Iterator<LifeLine> iterator = lifeLineList.iterator();
        while (iterator.hasNext()) {
            LifeLine lifeLine = iterator.next();
            System.out.print("Member Name : " + lifeLine.name);
            System.out.print(", Member Phone No. : " + lifeLine.number);
            System.out.println(", Member Address : " + lifeLine.address);
            System.out.println("---------------------------------------------------------------------------");
        }

        // Way 6. List Iteration using List Iterator , ye backward aur forward dono
        // direction me iteration kr skta hai
        System.out.println("-------Iteration Using List Iterator---------");
        ListIterator<LifeLine> lifeLineListIterator = lifeLineList.listIterator(lifeLineList.size());
        while (lifeLineListIterator.hasPrevious()){
            LifeLine lifeLine = lifeLineListIterator.previous();
            System.out.print("Member Name : " + lifeLine.name);
            System.out.print(", Member Phone No. : " + lifeLine.number);
            System.out.println(", Member Address : " + lifeLine.address);
            System.out.println("---------------------------------------------------------------------------");
        }

        // Way 6. List Iteration using forEach method
        System.out.println("-------Iteration Using forEach() method Iterator---------");
        lifeLineList.forEach(lifeLine -> {
            System.out.print("Member Name : " + lifeLine.name);
            System.out.print(", Member Phone No. : " + lifeLine.number);
            System.out.println(", Member Address : " + lifeLine.address);
            System.out.println("---------------------------------------------------------------------------");
        });


        // print detail of only julu from the lifeLine list
      LifeLine lull =lifeLineList.get(3);
        System.out.println(" Name:"+ lull.name+", Phone.no:"+lull.number+", address:"+lull.address);



    }
}

class LifeLine {
    String name, address;
    long number;

    LifeLine(long number, String name, String address) {
        this.address = address;
        this.name = name;
        this.number = number;
    }

}

class Student {
    String name;
    int standard;

    Student(int standard, String name) {
        this.standard = standard;
        this.name = name;
    }

}