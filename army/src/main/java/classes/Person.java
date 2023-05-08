package classes;
import interfaces.Die;
import interfaces.UseWeapon;

public abstract class Person implements UseWeapon, Die {
    private String name;
    private Integer age;
    private int health = 100;
    private String nation;
    private Weapon weapon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void die() {
        if (this.health <= 0) {
            System.out.println(this.nation + " " + this.name + " died!");
        }
    }
}
