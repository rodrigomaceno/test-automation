public class Navy {
    private Leader leader;
    private Sailor[] sailors;
    private Warship[] warships;
    private Submarine[] submarines;


    public Navy() {

    }
    public Navy(Leader leader) {
        this.leader = leader;
    }


    public Sailor[] getSailors() {
        return sailors;
    }

    public void setSailors(Sailor[] sailors) {
        this.sailors = sailors;
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

    public Leader getLeader() { return leader; }

    public void setLeader(Leader leader) { this.leader = leader; }
}
