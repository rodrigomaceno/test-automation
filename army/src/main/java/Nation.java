public class Nation {
    private String name;
    private String leader;


    public Nation() {

    }
    public Nation(String name, String leader) {
        this.name = name;
        this.leader = leader;
    }


    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getLeader() { return leader; }

    public void setLeader(String leader) { this.leader = leader; }


}