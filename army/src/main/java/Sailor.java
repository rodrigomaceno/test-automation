public class Sailor extends Person{
    private String rank;


    public Sailor() {
        this.setName("Sailor");
        this.setAge(24);
        this.rank = "seaman recruit";
        this.setNation(new Nation("",""));
    }

    public Sailor(Nation nation) {
        this.nation = nation;
    }

    public Nation getNation() { return nation; }

    public void setNation(Nation nation) { this.nation = nation; }


    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }



    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if ((o instanceof Person && o instanceof Sailor)){
            return true;
        }
        else {
            System.out.println(o + " is not a sailor.");
            return false;
        }
    }

    @Override
    public int hashCode() {
        return  2;
    }

    public void enterSubmarine() {
        System.out.println("A sailor entered a submarine.");
    }

    public void enterWarship() {
        System.out.println("A sailor has entered a warship.");
    }

//    public void attack(Target target) {
//        System.out.println("A sailor has attacked " + target);
//    }

}
