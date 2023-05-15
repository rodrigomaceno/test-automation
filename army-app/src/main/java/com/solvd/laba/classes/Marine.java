package com.solvd.laba.classes;

import com.solvd.laba.interfaces.Combat;
import com.solvd.laba.interfaces.UseWeapon;

import java.util.Random;

public class Marine extends Person implements UseWeapon, Combat {
    private String rank;

    public Marine() {
        this("");
    }

    public Marine(String nation) {
        this.setName(randomFirstName().toString() + " " + randomLastName().toString());
        this.setWeapon(randomWeapon());
        this.setNation("");
        this.setDead(false);
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
            System.out.println(o + " is not a sailor.");
            return false;
        }
    }

    // TODO: to finish
    @Override
    public int hashCode() {
        return 2;
    }

    @Override
    public void shoot(Weapon weapon, Person person) {
        int accuracy = new Random().nextInt(2);

        if (accuracy == 1) {
            person.setHealth(person.getHealth() - weapon.getDamageToTarget());
            if (person.getHealth() <= 0) {
                person.die();
            }
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


