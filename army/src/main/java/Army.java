import java.util.Arrays;

public class Army {
    private Soldier[] soldiers;
    private Marine[] marines;
    private Airman[] airmen;
    private Tank[] tanks;
    private Warship[] warships;
    private Warplane[] warplanes;
    private Submarine[] submarines;

    public Army() {

    }



    public Soldier[] getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(Soldier[] soldiers) {
        this.soldiers = soldiers;
    }

    public Tank[] getTanks() {
        return tanks;
    }

    public void setTanks(Tank[] tanks) {
        this.tanks = tanks;
    }


    public Warship[] getWarships() { return warships; }

    public void setWarships(Warship[] warships) { this.warships = warships; }

    public Warplane[] getWarplanes() { return warplanes; }

    public void setWarplanes(Warplane[] warplanes) { this.warplanes = warplanes; }


    public Submarine[] getSubmarines() { return submarines; }

    public void setSubmarines(Submarine[] submarines) { this.submarines = submarines; }

    public Marine[] getSailors() { return marines; }

    public void setSailors(Marine[] marines) { this.marines = marines; }

    public Airman[] getAirmen() { return airmen; }

    public void setAirmen(Airman[] airmen) { this.airmen = airmen; }

    public void createArmy(){

        setSoldiers(new Soldier[200]);
        setTanks(new Tank[45]);
        createSoldiers(this.soldiers);
        createTanks(this.tanks);

    }
    public void createNavy(){
        setSailors(new Marine[200]);
        setSubmarines(new Submarine[50]);
        setWarships(new Warship[60]);
        createSailors(this.marines);
    }
    public void createAirForce(){
        setAirmen(new Airman[200]);
        setWarplanes(new Warplane[50]);
        createAirmen(this.airmen);
    }

    public void createSoldiers(Soldier[] soldiers) {
        Arrays.setAll(soldiers, count -> new Soldier());
        int i = 0;
        for (Soldier soldier : soldiers) {
            i++;
        }
    }

    public void createAirmen(Airman[] airmen) {
        Arrays.setAll(airmen, count -> new Airman());
    }
    public void createSailors(Marine[] marines) {
        Arrays.setAll(marines, count -> new Marine());
    }
    public void createTanks(Tank[] tanks) {
        Arrays.setAll(tanks, count -> new Tank());
    }


    public void createSubmarines(Submarine[] submarines) {
        Arrays.setAll(submarines, count -> new Submarine());
    }



}
