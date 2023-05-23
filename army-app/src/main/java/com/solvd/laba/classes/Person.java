package com.solvd.laba.classes;

import com.solvd.laba.classes.enums.FirstName;
import com.solvd.laba.classes.enums.LastName;
import com.solvd.laba.classes.enums.Weapon;
import com.solvd.laba.interfaces.Die;
import com.solvd.laba.interfaces.UseWeapon;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public abstract class Person implements UseWeapon, Die {
    private String name;
    private Integer age;
    private int health;
    private String nation;
    private boolean isDead;
    private static final Logger logger = LogManager.getLogger();

    public Person() {
    }

    public Person(String nation) {
        this.nation = nation;
        this.health = 100;
        this.name = randomFirstName().toString() + " " + randomLastName().toString();
        this.age = randomAge();
        this.setDead(false);
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public FirstName randomFirstName() {

        int num = new Random().nextInt(FirstName.values().length);
        return FirstName.values()[num];
    }

    public LastName randomLastName() {

        int num = new Random().nextInt(LastName.values().length);
        return LastName.values()[num];
    }

    public int randomAge() {
        int min = 19;
        int max = 45;
        Random num = new Random();
        return num.nextInt(max - min) + min;
    }

    public Weapon randomWeapon() {

        int num = new Random().nextInt(Weapon.values().length);
        return Weapon.values()[num];
    }


    public void die() {
        this.setHealth(0);
        this.setDead(true);
        logger.info((this.nation + " " + this.name + " died!"));
    }

    public static int takeTurn() {
        return new Random().nextInt(2);
    }


}
