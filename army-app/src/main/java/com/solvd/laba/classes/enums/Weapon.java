package com.solvd.laba.classes.enums;

public enum Weapon {
    Rifle(50),
    Shotgun(40),
    Revolver(35);

    private final int damageToTarget;

    public int getDamageToTarget() {
        return damageToTarget;
    }

    Weapon(int damageToTarget) {
        this.damageToTarget = damageToTarget;
    }
}
