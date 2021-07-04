package com.prakash;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

class LinkedListGet {
    public static void main(String[] args) {
        ArrayList<Float> random = new ArrayList<Float>();
        LinkedList<Float> random1 = new LinkedList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99f);
        ListIterator<Float> it = random.listIterator(2);
        System.out.print(it.next());
        System.out.print(it.next());


        for (float i : random)
        random1.add(i);
        System.out.println("The third element of linked list is "+ random1.get(2));
    }
}