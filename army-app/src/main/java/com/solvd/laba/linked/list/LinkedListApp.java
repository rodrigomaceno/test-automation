package com.solvd.laba.linked.list;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedListApp {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        MyLinkedList<Integer> list2 = new MyLinkedList<>();

        list.add("Rodrigo");
        list.add("Michael");
        list.add("Bob");

        list.addToStart("Jennifer");
        list.addAtIndex("Samantha", 2);
        list.addToStart("Sarah");

        logger.info(list);
        list.remove(4);
        logger.info(list);


        list.add("Susan");
        logger.info(list);

        list.remove(0);
        logger.info(list);


        list2.add(1);
        list2.add(2);
        list2.add(3);
        logger.info(list2);
        logger.info("The size is " + list2.getSize());


        list2.remove(0);
        logger.info(list2);
        logger.info("The size is " + list2.getSize());

        list2.remove(1);
        logger.info(list2);
        logger.info("The size is " + list2.getSize());

    }
}
