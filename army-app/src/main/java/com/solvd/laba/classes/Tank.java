package com.solvd.laba.classes;

import com.solvd.laba.interfaces.OperateTank;

import java.util.Random;

public class Tank extends Vehicle implements OperateTank {

    public Tank(String nation) {
        super(nation);
        this.setType("Tank");
    }


    @Override
    public String toString() {
        return "Tank";
    }


    @Override
    public void fireTankGun(Vehicle vehicle) {
        int accuracy = new Random().nextInt(2);

        if (accuracy == 1) {
            vehicle.damage += 30;
        }
        if (vehicle.damage >= 100) {
            vehicle.destroy();
        }
    }

    @Override
    public void combat(Vehicle vehicle) {

        while (!this.isDestroyed() && !vehicle.isDestroyed()) {

            if (Person.takeTurn() == 0) {
                if (!this.isDestroyed() && !vehicle.isDestroyed()) {
                    fireTankGun(vehicle);
                }
            } else {
                if (!this.isDestroyed() && !vehicle.isDestroyed()) {
                    fireTankGun(this);
                }
            }
        }
    }
}
