package classes;
import interfaces.Combat;
import interfaces.UseWeapon;

import java.util.Random;

public class Marine extends Person implements UseWeapon, Combat {
    private String rank;
    private Weapon weapon;

    public Marine() {
        this.setName("Marine");
        this.setAge(24);
        this.rank = "private";

    }

    public Marine(String nation) {
        this.setNation("");;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
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

    @Override
    public int hashCode() {
        return 2;
    }


    @Override
    public void shoot(Weapon weapon, Person person) {
        int accuracy = new Random().nextInt(2);

        if (accuracy == 1) {
            person.setHealth(person.getHealth() - weapon.damageToTarget);
        } else {
        }
    }


    public void combat(Person person) {

        while (this.getHealth() > 0 && person.getHealth() > 0) {
            shoot(this.getWeapon(), person);
            shoot(person.getWeapon(), this);
        }
        if (this.getHealth() <= 0) {
            this.die();
        } else {
            person.die();
        }
    }

}
