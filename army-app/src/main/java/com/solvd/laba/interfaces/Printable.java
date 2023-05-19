package com.solvd.laba.interfaces;

import com.solvd.laba.classes.Army;
import com.solvd.laba.classes.Person;

import java.util.List;

public interface Printable {


    static String printStats(Army army) {
        return "\t\t" + army.getSoldiers().get(0).getNation() + "\n" + "person combat: \tLost " + army.getNumOfCasualties() +
                "\n" + "vehicle combat: Lost " + army.getNumOfVehiclesDestroyed() + "\n";

    }

    static String printDead(Army army, FilterArmy<Person, Army> filterArmy, FilterPerson<Person, Boolean> filterPerson) {
        String msg = "";
        List<Person> p = filterArmy.filter(army);
        for (Person person : p) {
            if (filterPerson.filter(person)) {
                msg += person.getNation() + "\t" + person.getName() + " is dead.\n";
            }
        }
        return msg + "\n";
    }

}
