package com.solvd.laba.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Army {
    private List<Soldier> soldiers = new ArrayList<Soldier>();
    private List<Marine> marines = new ArrayList<Marine>();
    private List<Airman> airmen = new ArrayList<Airman>();
    private List<Tank> tanks = new ArrayList<Tank>();
    private List<Warship> warships = new ArrayList<Warship>();
    private List<Warplane> warplanes = new ArrayList<Warplane>();
    private List<Submarine> submarines = new ArrayList<Submarine>();

    private static int amount;

    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(List<Soldier> soldiers) {
        this.soldiers = soldiers;
    }

    public List<Marine> getMarines() {
        return marines;
    }

    public void setMarines(List<Marine> marines) {
        this.marines = marines;
    }

    public List<Airman> getAirmen() {
        return airmen;
    }

    public void setAirmen(List<Airman> airmen) {
        this.airmen = airmen;
    }

    public List<Tank> getTanks() {
        return tanks;
    }

    public void setTanks(List<Tank> tanks) {
        this.tanks = tanks;
    }

    public List<Warship> getWarships() {
        return warships;
    }

    public void setWarships(List<Warship> warships) {
        this.warships = warships;
    }

    public List<Warplane> getWarplanes() {
        return warplanes;
    }

    public void setWarplanes(List<Warplane> warplanes) {
        this.warplanes = warplanes;
    }

    public List<Submarine> getSubmarines() {
        return submarines;
    }

    public void setSubmarines(List<Submarine> submarines) {
        this.submarines = submarines;
    }

    public void createArmy(String nation, int amount) {
        Army.amount = amount;
        createSoldiers(this.soldiers, nation);
        createTanks(this.tanks, nation);
    }

    public void createNavy(String nation) {
        createMarines(this.marines, nation);
        createSubmarines(this.submarines, nation);
        createWarships(this.warships, nation);
    }

    public void createAirForce(String nation) {
        createAirmen(this.airmen, nation);
        createWarplanes(this.warplanes, nation);
    }

    public void createSoldiers(List<Soldier> soldiers, String nation) {
        for (int i = 0; i < amount; i++) {
            soldiers.add(new Soldier(nation));
        }
    }

    public void createAirmen(List<Airman> airmen, String nation) {
        for (int i = 0; i < amount; i++) {
            airmen.add(new Airman(nation));
        }
    }

    public void createMarines(List<Marine> marines, String nation) {
        for (int i = 0; i < amount; i++) {
            marines.add(new Marine(nation));
        }
    }

    public void createTanks(List<Tank> tanks, String nation) {
        for (int i = 0; i < amount; i++) {
            tanks.add(new Tank(nation));
        }
    }

    public void createWarships(List<Warship> warships, String nation) {
        for (int i = 0; i < amount; i++) {
            warships.add(new Warship(nation));
        }
    }

    public void createWarplanes(List<Warplane> warplanes, String nation) {
        for (int i = 0; i < amount; i++) {
            warplanes.add(new Warplane(nation));
        }
    }

    public void createSubmarines(List<Submarine> submarines, String nation) {
        for (int i = 0; i < amount; i++) {
            submarines.add(new Submarine(nation));
        }
    }

    public static void whoWon(Army army1, Army army2) {
        int[] tally = {0, 0};

        if (true) {
            int[] tempTally = {0, 0};

            for (int i = 0; i < amount; i++) {

                if (army1.getSubmarines().get(i).isDestroyed()) {
                    tempTally[1]++;
//
                } else {
                    tempTally[0]++;
//
                }
//
            }
            if (tempTally[0] > tempTally[1]) {
                tally[0]++;
            } else {
                tally[1]++;
            }


        }


        if (true) {
            int[] tempTally = {0, 0};

            for (int i = 0; i < amount; i++) {
                if (army1.getTanks().get(i).isDestroyed()) {
                    tempTally[1]++;

                } else {
                    tempTally[0]++;

                }

            }
            if (tempTally[0] > tempTally[1]) {
                tally[0]++;
            } else {
                tally[1]++;
            }

        }

        if (true) {
            int[] tempTally = {0, 0};
            for (int i = 0; i < amount; i++) {
                if (army1.getWarplanes().get(i).isDestroyed()) {
                    tempTally[1]++;

                } else {
                    tempTally[0]++;

                }

            }
            if (tempTally[0] > tempTally[1]) {
                tally[0]++;
            } else {
                tally[1]++;
            }

        }

        if (true) {
            int[] tempTally = {0, 0};
            for (int i = 0; i < amount; i++) {
                if (army1.getWarships().get(i).isDestroyed()) {
                    tempTally[1]++;

                } else {
                    tempTally[0]++;

                }

            }
            if (tempTally[0] > tempTally[1]) {
                tally[0]++;
            } else {
                tally[1]++;
            }

        }

        // SCORE FOR SOLDIERS, AIRMEN AND MARINES
        if (true) {
            int[] tempTally = {0, 0};
            for (int i = 0; i < amount; i++) {
                if (army1.getSoldiers().get(i).isDead()) {
                    tempTally[1]++;
//
                } else {
                    tempTally[0]++;
//
                }
//
            }
            if (tempTally[0] > tempTally[1]) {
                tally[0]++;
            } else {
                tally[1]++;
            }

        }

        if (true) {
            int[] tempTally = {0, 0};
            for (int i = 0; i < amount; i++) {
                if (army1.getAirmen().get(i).isDead()) {
                    tempTally[1]++;

                } else {
                    tempTally[0]++;

                }

            }
            if (tempTally[0] > tempTally[1]) {
                tally[0]++;
            } else {
                tally[1]++;
            }

        }

        if (true) {
            int[] tempTally = {0, 0};

            for (int i = 0; i < amount; i++) {
                if (army1.getMarines().get(i).isDead()) {
                    tempTally[1]++;

                } else {
                    tempTally[0]++;

                }

            }
            if (tempTally[0] > tempTally[1]) {
                tally[0]++;
            } else {
                tally[1]++;
            }

        }

        // FINDING OUT OVERALL SCORE
        if (tally[0] > tally[1]) {
            System.out.println("Army 1 WON!!!");
            System.out.println(Arrays.toString(tally));
        } else if (tally[0] < tally[1]) {
            System.out.println("Army 2 WON!!!");
            System.out.println(Arrays.toString(tally));
        } else {
            System.out.println("Nobody WON!!!");
        }


    }

    public static void combat(Army army1, Army army2) {
        for (int i = 0; i < amount; i++) {
            army1.getSoldiers().get(i).combat(army2.getSoldiers().get(i));
        }

        for (int i = 0; i < amount; i++) {
            army1.getMarines().get(i).combat(army2.getMarines().get(i));
        }

        for (int i = 0; i < amount; i++) {
            army1.getAirmen().get(i).combat(army2.getAirmen().get(i));
        }

        for (int i = 0; i < amount; i++) {
            army1.getTanks().get(i).combat(army2.getTanks().get(i));
        }

        for (int i = 0; i < amount; i++) {
            army1.getSubmarines().get(i).combat(army2.getSubmarines().get(i));
        }

        for (int i = 0; i < amount; i++) {
            army1.getWarplanes().get(i).combat(army2.getWarplanes().get(i));
        }

        for (int i = 0; i < amount; i++) {
            army1.getWarships().get(i).combat(army2.getWarships().get(i));
        }

        System.out.println("War ended!!!");

        Army.whoWon(army1, army2);

    }
}
