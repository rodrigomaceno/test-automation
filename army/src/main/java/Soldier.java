import java.util.Random;

public class Soldier extends Person implements UseWeapon, Combat{
    private String rank;
    private Weapon weapon;

    public Soldier() {
        this.setName("Soldier");
        this.setAge(20);
        this.rank = "private";
        this.nation = "";
    }
    public Soldier(String nation) {
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

    public void setNation(String nation) { this.nation = nation;}


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


    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if ((o instanceof Person)){
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
    @Override
    public void shoot(Weapon weapon, Person person) {
        int accuracy = new Random().nextInt(2);

        if (accuracy == 1) {
            person.health -= weapon.damageToTarget;
        } else {}
    }


    public void combat(Person person) {

        while(this.health > 0 && person.health > 0) {
            shoot(this.getWeapon(), person);
            shoot(person.getWeapon(),this);
        }
        if(this.health <= 0) {
            this.die();
        } else { person.die();}
    }

}
