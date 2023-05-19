package com.solvd.laba.classes;

import com.solvd.laba.classes.enums.Weapon;
import com.solvd.laba.interfaces.Combat;
import com.solvd.laba.interfaces.UseWeapon;

import java.util.Random;


public class Airman extends Person implements UseWeapon, Combat {
    private Weapon weapon;
    private static int count = 0;

    private final int id = count + 1;
    

    // constructor that takes nation as parameter
    public Airman(String nation) {
        this.setName(randomFirstName().toString() + " " + randomLastName().toString());
        this.setWeapon(randomWeapon());
        this.setNation(nation);
        this.setAge(randomAge());
        this.setDead(false);
        count++;
    }


    public int getId() {
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
        return o instanceof Person && (this.hashCode() == o.hashCode());
    }


    @Override
    public int hashCode() {
        return 5 * this.getName().hashCode() * this.getId();
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
