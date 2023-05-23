package com.solvd.laba.classes;

// Functional interfaces in interfaces folders for FilterArmy, FilterPerson, Check
// Interface check uses generics
// lambdas in Army in methods filter1 and filter 2 use generics
// Streams in Class Army in method whoWon()
// Printable interface has static methods
// Airman, Soldier and Marine have static fields and overridden methods
// Weapon has a final property damageToTarget
// Army has collections
// Person and Vehicle are abstract
public class Main {

    public static void main(String[] args) throws InvalidAmountException {

        Army army1 = new Army("Country A", 30);
        Army army2 = new Army("Country B", 30);
        army1.combat(army2, (Army a1, Army a2) -> a1.getSize() == a2.getSize());


        // Here I tested running the application with arguments passed to main via IDE
        try {

            Army a = new Army(args[0], Integer.parseInt(args[1]));
            Army b = new Army(args[2], Integer.parseInt(args[3]));
            a.combat(b, (Army armyA, Army armyB) -> armyA.getSize() == armyB.getSize());


        } catch (ArrayIndexOutOfBoundsException e) {
            throw new InvalidArgumentException();
        }

    }
}
