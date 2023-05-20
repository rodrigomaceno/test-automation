package com.solvd.laba.classes;

import com.solvd.laba.interfaces.OperateWarship;

import java.util.Random;

public class Warship extends Vehicle implements OperateWarship {

    public Warship(String nation) {
        super(nation);
        this.setType("Warship");
    }
    

    @Override
    public void fireArtillery(Vehicle vehicle) {
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
                    fireArtillery(vehicle);
                }
            } else {
                if (!this.isDestroyed() && !vehicle.isDestroyed()) {
                    fireArtillery(this);
                }
            }
        }
    }
}
