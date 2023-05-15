package com.solvd.laba.classes;

public class Navy {
    private Marine[] marines;
    private Warship[] warships;
    private Submarine[] submarines;


    public Marine[] getSailors() {
        return marines;
    }

    public void setSailors(Marine[] marines) {
        this.marines = marines;
    }

    public Warship[] getWarships() {
        return warships;
    }

    public void setWarships(Warship[] warships) {
        this.warships = warships;
    }

    public Submarine[] getSubmarines() {
        return submarines;
    }

    public void setSubmarines(Submarine[] submarines) {
        this.submarines = submarines;
    }

}
