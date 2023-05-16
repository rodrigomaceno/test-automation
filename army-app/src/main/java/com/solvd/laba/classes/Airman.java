package com.solvd.laba.classes;

import com.solvd.laba.interfaces.Combat;
import com.solvd.laba.interfaces.UseWeapon;

import java.util.Random;


public class Airman extends Person implements UseWeapon, Combat {
    private Weapon weapon;
    private static int count = 1000000;

    final private String id = Integer.toHexString(count + 1);

    public Airman() {
        this("");
    }

    // constructor that takes nation as parameter
    public Airman(String nation) {
        this.setName(randomFirstName().toString() + " " + randomLastName().toString());
        this.setWeapon(randomWeapon());
        this.setNation(nation);
        this.setAge(randomAge());
        this.setDead(false);
        count++;
    }

    public String getId() {
        return id;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public boolean equals(Object o) {
        if ((o instanceof Person && (this.hashCode() == o.hashCode()))) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public int hashCode() {
        return 5 * Integer.parseInt(this.getName()) + Integer.parseInt(this.getId());
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
