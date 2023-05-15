package com.solvd.laba.interfaces;

import com.solvd.laba.classes.Army;


public interface Print {


    static void printAirmen(Army army) {
        System.out.println((army.getAirmen().toString()));
    }

    static void printSoldiers(Army army) {
        System.out.println(army.getSoldiers().toString());
    }

    static void printMarines(Army army) {
        System.out.println(army.getMarines().toString());
    }

    static void printArmy(Army army) {
        System.out.println(army.getAirmen().toString());
        System.out.println(army.getSoldiers().toString());
        System.out.println(army.getMarines().toString());

    }


}
