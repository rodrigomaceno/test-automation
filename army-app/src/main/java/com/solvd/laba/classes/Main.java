package com.solvd.laba.classes;

import com.solvd.laba.interfaces.PrintStatistics;

import java.util.logging.Logger;

// PrintStatistics interface has a static method
// Airman, Soldier and Marine have final and static fields and overridden methods
// Weapon has a final property damageToTarget
// Army has a static combat() and whoWon() methods
// Army has collections
// Person and Vehicle are abstract
public class Main {
    static final Logger logger = Logger.getLogger(Army.class.getName());

    public static void main(String[] args) throws InvalidAmountException {

        Army a = new Army();
        a.createArmy("Country 1", 200);
        a.createNavy("Country 1");
        a.createAirForce("Country 1");

        Army b = new Army();
        b.createArmy("Country 2", 200);
        b.createNavy("Country 2");
        b.createAirForce("Country 2");

        Army.combat(a, b);


        PrintStatistics.print(a);
        PrintStatistics.print(b);


    }
}
