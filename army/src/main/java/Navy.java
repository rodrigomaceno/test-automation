public class Navy {
    private Leader leader;
    private Marine[] marines;
    private Warship[] warships;
    private Submarine[] submarines;


    public Navy() {

    }
    public Navy(Leader leader) {
        this.leader = leader;
    }


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

    public Leader getLeader() { return leader; }

    public void setLeader(Leader leader) { this.leader = leader; }
}
