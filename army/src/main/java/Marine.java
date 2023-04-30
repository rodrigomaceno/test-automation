import java.util.Random;

public class Marine extends Person{
    private String rank;
    private int accuracy;

    public Marine() {
        this.setName("Sailor");
        this.setAge(24);
        this.rank = "seaman recruit";
        this.nation = "";
    }

    public Marine(String nation) {
        this.nation = nation;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
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


    public static void shoot(Weapon weapon, Person person) {
        int accuracy = new Random().nextInt(2);

        if (accuracy == 1) {
            person.health -= weapon.damageToTarget;
        } else {}
//        System.out.println("Airman shot " + person.name + " and caused damage of " + weapon.damageToTarget);
    }


    public static void combat(Person a, Person b, Weapon gun1, Weapon gun2) {
        final Person personDied;
        while(a.health > 0 && b.health > 0) {
            shoot(gun1,b);
            shoot(gun2,a);
        }
        if(a.health < 0) {
            personDied = a;
            a.die(a);
        } else { personDied = b;
                    b.die(b);}

    }


    public void die(Person person) {
        if(person.health <= 0){
            System.out.println(person.nation + " " + person.name + " died!");
        }
    }

}
