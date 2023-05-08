package classes;
import interfaces.OperateSubmarine;

import java.util.Random;

public class Submarine extends Vehicle implements OperateSubmarine {

    public Submarine() {
        this.type = "Submarine";
    }

    public Submarine(String nation) {
        this.setType("Submarine");
        this.nation = nation;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamaged(int damage) {
        this.damage = damage;
    }

    @Override
    public void drive() {

    }

    @Override
    public void fireTorpedo(Vehicle enemy) {
        int accuracy = new Random().nextInt(2);

        if (accuracy == 1) {
            enemy.damage += 30;
        } else {
        }
    }

    @Override
    public void combat(Vehicle vehicle) {
        while (this.damage < 100 && vehicle.damage < 100) {
            fireTorpedo(vehicle);
            fireTorpedo(this);
        }
        if (this.damage >= 100) {
            this.destroy();
        } else {
            vehicle.destroy();
        }
    }

}
