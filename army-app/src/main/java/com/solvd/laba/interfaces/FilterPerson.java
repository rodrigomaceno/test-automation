package com.solvd.laba.interfaces;

import com.solvd.laba.classes.Person;

@FunctionalInterface
public interface FilterPerson {
    boolean filter(Person person);
}
