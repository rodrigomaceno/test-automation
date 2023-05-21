package com.solvd.laba.classes;


// Printable interface has static methods
// Airman, Soldier and Marine have static fields and overridden methods
// Weapon has a final property damageToTarget
// Army has static combat() and whoWon() methods
// Army has collections
// Person and Vehicle are abstract
public class Main {

    public static void main(String[] args) throws InvalidAmountException {


        Army a = new Army("Country A", 10);
        Army b = new Army("Country B", 10);
        Army.combat(a, b, (Army army1, Army army2) -> army1.getSize() == army2.getSize());


    }
}
