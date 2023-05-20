package com.solvd.laba.classes;

import com.solvd.laba.interfaces.OperateWarplane;

import java.util.Random;

public class Warplane extends Vehicle implements OperateWarplane {

    public Warplane(String nation) {
        super(nation);
        this.setType("Warplane");
    }

    @Override
    public void fireMachineGun(Vehicle vehicle) {
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
                    fireMachineGun(vehicle);
                }
            } else {
                if (!this.isDestroyed() && !vehicle.isDestroyed()) {
                    fireMachineGun(this);
                }
            }
        }
    }

}
