package com.solvd.laba.interfaces;

import com.solvd.laba.classes.Army;
import com.solvd.laba.classes.Soldier;

public interface Printable {

    static void printStats(Army army) {
        System.out.println(army.getSoldiers().get(0).getNation() + "\tCasualties: " + army.getNumOfCasualties());
        System.out.println("\t\t\tVehicles Lost: " + army.getNumOfVehiclesDestroyed());
    }

    // TODO: finish
    static void print(Army army) {
        for (Soldier soldier : army.getSoldiers()) {
            System.out.println("Country: " + soldier.getNation() + " \tName: " + soldier.getName() + " \t Age:" + soldier.getAge() + " \tHealth: " + soldier.getHealth());
        }
    }


}
