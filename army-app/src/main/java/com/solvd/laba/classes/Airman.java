package com.solvd.laba.classes;

import com.solvd.laba.interfaces.Combat;
import com.solvd.laba.interfaces.UseWeapon;

import java.util.Random;


public class Airman extends Person implements UseWeapon, Combat {
    private String rank;


    // static property is not related to specific instance, but to class itself
    private static int count = 0;

    // final property can't be changed
    final private int id = count + 1;

    // class variable to keep track of number of Airman objects initialized


    public Airman() {
        this("");
    }

    // constructor that takes nation as parameter
    public Airman(String nation) {
        this.setName(randomFirstName().toString() + " " + randomLastName().toString());
        this.setWeapon(randomWeapon());
        this.setNation(nation);
        this.setDead(false);
        count++;
    }


    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }


    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }


    @Override
    public String toString() {
        return getName();
    }

    @Override
    public boolean equals(Object o) {
        if ((o instanceof Person)) {
            return true;
        } else {
            System.out.println(o + " is not an airman.");
            return false;
        }
    }

    // TODO: to finish
    @Override
    public int hashCode() {
        return 3;
    }

    @Override
    public void shoot(Weapon weapon, Person person) {
        int accuracy = new Random().nextInt(2);

        if (accuracy == 1) {
            person.setHealth(person.getHealth() - weapon.getDamageToTarget());
        }
        if (person.getHealth() <= 0) {
            person.die();
        }
    }


    public void combat(Person person) {

        while (!this.isDead() && !person.isDead()) {

            if (takeTurn() == 0) {
                if (!this.isDead() && !person.isDead()) {
                    shoot(this.getWeapon(), person);
                }
            } else {
                if (!this.isDead() && !person.isDead()) {
                    shoot(person.getWeapon(), this);
                }
            }
        }
    }
}
