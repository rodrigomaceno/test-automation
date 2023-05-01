import java.util.Objects;

public abstract class Person implements UseWeapon, Die{
    protected String name;
    protected Integer age;
    protected int health = 100;
    protected String nation;
    private Weapon weapon;

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
