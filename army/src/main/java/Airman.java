public class Airman extends Person implements UseWeapon {
    private String rank;
    public Airman() {
        this.setName("Airman");
        this.setAge(30);
        this.rank = "Pilot";
        this.setNation(new Nation("",""));
    }

    public Airman(Nation nation) {
        this.nation = nation;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

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

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if ((o instanceof Person && o instanceof Airman)){
            return true;
        }
        else {
            System.out.println(o + " is not an airman.");
            return false;
        }
    }

    @Override
    public int hashCode() {
        return  3;
    }

    public void enterWarplane() {
        System.out.println("An airman entered a warplane.");
    }

    @Override
    public int shoot(Weapon weapon, Person person) {
        System.out.println("Airman shot " + person.name + " and caused damage of " + weapon.damageToTarget);
        person.health -= weapon.damageToTarget;
        return weapon.damageToTarget;
    }

}
