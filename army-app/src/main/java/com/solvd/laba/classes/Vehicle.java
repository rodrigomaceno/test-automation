package com.solvd.laba.classes;

import com.solvd.laba.interfaces.Destroy;

public abstract class Vehicle implements Destroy {
    protected String type;
    protected String nation;
    protected int damage = 0;
    private boolean isDestroyed;

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

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isDestroyed() {
        return isDestroyed;
    }

    public void setDestroyed(boolean destroyed) {
        isDestroyed = destroyed;
    }

    public void destroy() {
        if (this.damage >= 100) {
            this.setDestroyed(true);
            //System.out.println(this.nation + " " + this.type + " was destroyed!");
        }
    }

}

