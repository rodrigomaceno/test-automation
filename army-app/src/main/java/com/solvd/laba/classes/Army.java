package com.solvd.laba.classes;

import com.solvd.laba.interfaces.Check;
import com.solvd.laba.interfaces.FilterArmy;
import com.solvd.laba.interfaces.FilterPerson;
import com.solvd.laba.interfaces.Printable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class Army {
    private String nation;
    private List<Soldier> soldiers = new ArrayList<>();
    private List<Marine> marines = new ArrayList<>();
    private List<Airman> airmen = new ArrayList<>();
    private List<Tank> tanks = new ArrayList<>();
    private List<Warship> warships = new ArrayList<>();
    private List<Warplane> warplanes = new ArrayList<>();
    private List<Submarine> submarines = new ArrayList<>();
    private int size;
    private static final Logger logger = LogManager.getLogger();


    public Army(String nation, int amount) throws InvalidAmountException {
        this.nation = nation;
        createArmy(nation, amount);
    }


    public String getNation() {
        return nation;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

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

    // Lambda
    static FilterArmy<Person, Army> filter1 = (Army army1) -> {
        List<Person> p = new ArrayList<>();
        p.addAll(army1.getSoldiers());
        p.addAll(army1.getAirmen());
        p.addAll(army1.getMarines());
        return p;
    };

    static FilterPerson<Person, Boolean> filter2 = (Person person) -> {
        if (person.isDead()) {
            return true;
        }
        return false;
    };


    public void createArmy(String nation, int size) throws InvalidAmountException {
        if (size < 10) {
            throw new InvalidAmountException("Armies need to be of size 10 or greater.");
        }
        this.size = size;
        createSoldiers(this.soldiers, nation);
        createTanks(this.tanks, nation);
        createMarines(this.marines, nation);
        createSubmarines(this.submarines, nation);
        createWarships(this.warships, nation);
        createAirmen(this.airmen, nation);
        createWarplanes(this.warplanes, nation);
    }

    public void createSoldiers(List<Soldier> soldiers, String nation) {
        for (int i = 0; i < size; i++) {
            soldiers.add(new Soldier(nation));
        }
    }

    public void createAirmen(List<Airman> airmen, String nation) {
        for (int i = 0; i < size; i++) {
            airmen.add(new Airman(nation));
        }
    }

    public void createMarines(List<Marine> marines, String nation) {
        for (int i = 0; i < size; i++) {
            marines.add(new Marine(nation));
        }
    }

    public void createTanks(List<Tank> tanks, String nation) {
        for (int i = 0; i < size; i++) {
            tanks.add(new Tank(nation));
        }
    }

    public void createWarships(List<Warship> warships, String nation) {
        for (int i = 0; i < size; i++) {
            warships.add(new Warship(nation));
        }
    }

    public void createWarplanes(List<Warplane> warplanes, String nation) {
        for (int i = 0; i < size; i++) {
            warplanes.add(new Warplane(nation));
        }
    }

    public void createSubmarines(List<Submarine> submarines, String nation) {
        for (int i = 0; i < size; i++) {
            submarines.add(new Submarine(nation));
        }
    }

    public int getNumOfCasualties() {
        int num = 0;
        for (Soldier soldier : soldiers) {
            if (soldier.isDead()) {
                num++;
            }
        }
        for (Airman airman : airmen) {
            if (airman.isDead()) {
                num++;
            }
        }
        for (Marine marine : marines) {
            if (marine.isDead()) {
                num++;
            }
        }
        return num;
    }

    public int getNumOfVehiclesDestroyed() {
        int num = 0;
        for (Tank tank : tanks) {
            if (tank.isDestroyed()) {
                num++;
            }
        }
        for (Submarine submarine : submarines) {
            if (submarine.isDestroyed()) {
                num++;
            }
        }
        for (Warplane warplane : warplanes) {
            if (warplane.isDestroyed()) {
                num++;
            }
        }
        for (Warship warship : warships) {
            if (warship.isDestroyed()) {
                num++;
            }
        }
        return num;
    }


    public static void whoWon(Army army1, Army army2) {
        Integer[] tally = {0, 0};
        {
            int[] tempTally = {0, 0};

            for (Soldier soldier : army1.getSoldiers()) {
                if (soldier.isDead()) {
                    tempTally[1]++;
                } else tempTally[0]++;
            }
            for (Marine marine : army1.getMarines()) {
                if (marine.isDead()) {
                    tempTally[1]++;
                } else tempTally[0]++;
            }
            for (Airman airman : army1.getAirmen()) {
                if (airman.isDead()) {
                    tempTally[1]++;
                } else tempTally[0]++;
            }

            for (Submarine submarine : army1.getSubmarines()) {
                if (submarine.isDestroyed()) {
                    tempTally[1]++;
                } else tempTally[0]++;
            }

            for (Warship warship : army1.getWarships()) {
                if (warship.isDestroyed()) {
                    tempTally[1]++;
                } else tempTally[0]++;
            }
            for (Tank tank : army1.getTanks()) {
                if (tank.isDestroyed()) {
                    tempTally[1]++;
                } else tempTally[0]++;
            }
            for (Warplane warplane : army1.getWarplanes()) {
                if (warplane.isDestroyed()) {
                    tempTally[1]++;
                } else tempTally[0]++;
            }

            if (tempTally[0] > tempTally[1]) {
                tally[0]++;
            } else if (tempTally[0] < tempTally[1]) {
                tally[1]++;
            }
        }

        // FINDING OUT OVERALL SCORE
        if (tally[0] > tally[1]) {
            logger.info("War ended!!! " + army1.getNation() + " WON!!!\n" + Printable.printStats(army1)
                    + Printable.printStats(army2) + "\n");

        } else if (tally[0] < tally[1]) {
            logger.info("War ended!!! " + army2.getNation() + " WON!!!\n" + Printable.printStats(army1)
                    + Printable.printStats(army2) + "\n");
        } else
            logger.info("Nobody WON!!! " + Printable.printStats(army1) + Printable.printStats(army2) + "\n"
            );

    }


    public static void combat(Army army1, Army army2, Check<Army> a) throws InvalidAmountException {
        if (a.check(army1, army2)) {
            for (int i = 0; i < army1.size; i++) {
                army1.getSoldiers().get(i).combat(army2.getSoldiers().get(i));
                army1.getMarines().get(i).combat(army2.getMarines().get(i));
                army1.getAirmen().get(i).combat(army2.getAirmen().get(i));
                army1.getTanks().get(i).combat(army2.getTanks().get(i));
                army1.getSubmarines().get(i).combat(army2.getSubmarines().get(i));
                army1.getWarplanes().get(i).combat(army2.getWarplanes().get(i));
                army1.getWarships().get(i).combat(army2.getWarships().get(i));
            }
            whoWon(army1, army2);
        } else throw new InvalidAmountException("Armies need to be of equal size.");

    }
}
