public class AirForce {
    private Leader leader;
    private Airman[] airmen;
    private Warplane[] warplanes;


    public AirForce() {

    }

    public AirForce(Leader leader) {
        this.leader = leader;
    }


    public Airman[] getAirmen() {
        return airmen;
    }

    public void setAirmen(Airman[] airmen) {
        this.airmen = airmen;
    }

    public Warplane[] getWarplanes() {
        return warplanes;
    }

    public void setWarplanes(Warplane[] warplanes) {
        this.warplanes = warplanes;
    }


}
