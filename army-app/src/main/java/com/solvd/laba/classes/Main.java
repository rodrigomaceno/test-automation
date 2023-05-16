package com.solvd.laba.classes;

import com.solvd.laba.interfaces.Printable;

import java.util.logging.Logger;

// Printable interface has a static method
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

        Army b = new Army();
        b.createArmy("Country 2", 200);

        Army.combat(a, b);

        Printable.printStats(a);
        Printable.printStats(b);

    }
}
