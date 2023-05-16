package com.solvd.laba.interfaces;

import com.solvd.laba.classes.Army;

public interface PrintStatistics {

    static void print(Army army) {
        System.out.println(army.getSoldiers().get(0).getNation() + "\tCasualties: " + army.getNumOfCasualties());
        System.out.println("\t\t\tVehicles Lost: " + army.getNumOfVehiclesDestroyed());
    }

}
