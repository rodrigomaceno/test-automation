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

    public Marine[] getMarines() { return marines; }

    public void setMarines(Marine[] marines) { this.marines = marines; }

    public Airman[] getAirmen() { return airmen; }

    public void setAirmen(Airman[] airmen) { this.airmen = airmen; }

    public void createArmy(String nation){
        setSoldiers(new Soldier[200]);
        setTanks(new Tank[45]);
        createSoldiers(this.soldiers, nation);
        createTanks(this.tanks, nation);
    }
    public void createNavy(String nation){
        setMarines(new Marine[200]);
        setSubmarines(new Submarine[50]);
        setWarships(new Warship[60]);
        createMarines(this.marines, nation);
        createSubmarines(this.submarines, nation);
        createWarships(this.warships, nation);
    }
    public void createAirForce(String nation){
        setAirmen(new Airman[200]);
        setWarplanes(new Warplane[50]);
        createAirmen(this.airmen, nation);
        createWarplanes(this.warplanes, nation);
    }

    public void createSoldiers(Soldier[] soldiers, String nation) { Arrays.setAll(soldiers, count -> new Soldier(nation)); }
    public void createAirmen(Airman[] airmen, String nation) {
        Arrays.setAll(airmen, count -> new Airman(nation));
    }
    public void createMarines(Marine[] marines, String nation) {
        Arrays.setAll(marines, count -> new Marine(nation));
    }
    public void createTanks(Tank[] tanks, String nation) {
        Arrays.setAll(tanks, count -> new Tank(nation));
    }
    public void createWarships(Warship[] warships, String nation) { Arrays.setAll(warships, count -> new Warship(nation)); }
    public void createWarplanes(Warplane[] warplanes, String nation) { Arrays.setAll(warplanes, count -> new Warplane(nation)); }
    public void createSubmarines(Submarine[] submarines, String nation) { Arrays.setAll(submarines, count -> new Submarine(nation)); }



}
