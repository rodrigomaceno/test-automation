package com.solvd.laba.interfaces;

import com.solvd.laba.classes.Person;
import com.solvd.laba.classes.Weapon;

public interface UseWeapon {
    void shoot(Weapon weapon, Person person);

    Weapon getWeapon();

}
