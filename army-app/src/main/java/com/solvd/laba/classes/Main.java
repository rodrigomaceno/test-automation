package com.solvd.laba.classes;

// Weapon has a final property damageToTarget
// Army has a static combat method
// Airman has final and static fields
// Soldier, Marine, Airman have overridden methods
// Weapon, Person, Vehicle are all abstract
public class Main {
    public static void main(String[] args) {

        Army a = new Army();
        a.createArmy("Country 1", 100);
        a.createNavy("Country 1");
        a.createAirForce("Country 1");

        Army b = new Army();
        b.createArmy("Country 2", 100);
        b.createNavy("Country 2");
        b.createAirForce("Country 2");

        Army.combat(a, b);

    }
}
