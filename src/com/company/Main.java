package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            int a = random.nextInt(100);
            arrayList.add(a);
            if (a % 2 == 0) {
                arrayList1.add(a);

            } else {
                arrayList2.add(a);
            }
        }
        System.out.println("Random sandar: " + arrayList);
        System.out.println("Jup sandar: " + arrayList1);
        System.out.println("Tak sandar: " + arrayList2);

    }

}
