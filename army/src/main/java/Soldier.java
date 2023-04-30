public class Soldier extends Person{
    private String rank;


    public Soldier() {
        this.setName("Soldier");
        this.setAge(20);
        this.rank = "private";
        this.setNation(new Nation("",""));
    }
    public Soldier(Nation nation) {
        this.nation = nation;
    }


    public Nation getNation() { return nation; }

    public void setNation(Nation nation) { this.nation = nation;}


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

    public void setRank(String rank) { this.rank = rank; }

    public Nation getNationality() {
        return nation;
    }

    public void setNationality(Nation nation) {
        this.nation = nation;
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if ((o instanceof Person && o instanceof Soldier)){
            return true;
        }
        else {
            System.out.println(o + " is not a soldier.");
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 1;
    }

//    public void enterTank(Tank tank) {
//        System.out.println("A sailor entered a submarine.");
//        tank.move();
//    }


}
