package com.solvd.laba.linked.list;

public class LinkedListApp {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        MyLinkedList<Integer> list2 = new MyLinkedList<>();

        list.add("Rodrigo");
        list.add("Michael");
        list.add("Bob");

        list.addToStart("Jennifer");
        list.addAtIndex("Samantha", 2);
        list.addToStart("Sarah");

        System.out.println(list);
        list.remove(4);
        System.out.println(list);


        list.add("Susan");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);


        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);
        System.out.println(list2.getSize());


        list2.remove(0);
        System.out.println(list2);
        System.out.println(list2.getSize());

        list2.remove(1);
        System.out.println(list2);
        System.out.println(list2.getSize());

    }
}
