package com.solvd.laba.classes;

import com.solvd.laba.interfaces.OperateSubmarine;

import java.util.Random;

public class Submarine extends Vehicle implements OperateSubmarine {

    public Submarine(String nation) {
        super(nation);
        this.setType("Submarine");
    }


    @Override
    public void fireTorpedo(Vehicle vehicle) {
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
                    fireTorpedo(vehicle);
                }
            } else {
                if (!this.isDestroyed() && !vehicle.isDestroyed()) {
                    fireTorpedo(this);
                }
            }
        }
    }

}
