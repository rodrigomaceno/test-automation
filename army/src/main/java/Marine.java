import java.util.Random;

public class Marine extends Person implements UseWeapon, Combat{
    private String rank;
    private Weapon weapon;

    public Marine() {
        this.setName("Sailor");
        this.setAge(24);
        this.rank = "seaman recruit";
        this.nation = "";
    }

    public Marine(String nation) {
        this.setName("Airman");
        this.setAge(30);
        this.rank = "Pilot";
        this.nation = nation;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    public String getNation() { return nation; }

    public void setNation(String nation) { this.nation = nation; }


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
        if ((o instanceof Person && o instanceof Marine)){
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


    @Override
    public void shoot(Weapon weapon, Person person) {
        int accuracy = new Random().nextInt(2);

        if (accuracy == 1) {
            person.health -= weapon.damageToTarget;
        } else {}
    }


    public void combat(Person person, Person enemy) {

        while(person.health > 0 && enemy.health > 0) {
            shoot(person.getWeapon(), enemy);
            shoot(enemy.getWeapon(),person);
        }
        if(this.health <= 0) {
            person.die();
        } else { enemy.die();}
    }

}
