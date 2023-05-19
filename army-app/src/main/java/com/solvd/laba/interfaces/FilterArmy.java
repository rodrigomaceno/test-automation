package com.solvd.laba.interfaces;

import com.solvd.laba.classes.Army;
import com.solvd.laba.classes.Person;

import java.util.List;

@FunctionalInterface
public interface FilterArmy {
    List<Person> filter(Army army);
}
