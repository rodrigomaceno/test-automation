import java.util.Random;

public class Warship extends Vehicle implements OperateWarship{

    public Warship() {
        this.setType("Warship");
    }
    public Warship(String nation) {
        this.setType("Warship");
        this.nation = nation;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamaged(int damage) {
        this.damage = damage;
    }

    @Override
    public void drive() {

    }

    public void sail() {

    }

    @Override
    public void fireArtillery(Vehicle enemy) {
        int accuracy = new Random().nextInt(2);

        if (accuracy == 1) {
            enemy.damage += 30;
        } else {}
    }

    @Override
    public void combat(Vehicle vehicle) {
        while(this.damage < 100 && vehicle.damage < 100) {
            fireArtillery(vehicle);
            fireArtillery(this);
        }
        if(this.damage >= 100) {
            this.destroy();
        } else { vehicle.destroy();}
    }
}
