package com.solvd.laba.classes;

import com.solvd.laba.interfaces.Destroy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Vehicle implements Destroy {
    protected String type;
    protected String nation;
    protected int damage;
    private boolean isDestroyed;
    private static final Logger logger = LogManager.getLogger();

    public Vehicle(String nation) {
        this.nation = nation;
        this.damage = 0;
        this.isDestroyed = false;
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
            logger.info(this.nation + " " + this.type + " was destroyed!");
        }
    }

}

