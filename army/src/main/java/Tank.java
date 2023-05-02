import java.util.Random;

public class Tank extends Vehicle implements OperateTank, VehicleCombat {

    public Tank() {
        this.setType("Tank");
    }
    public Tank(String nation) {
        this.setType("Tank");
        this.nation = nation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNation() { return nation; }

    public void setNation(String nation) { this.nation = nation; }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Tank";
    }


    @Override
    public void drive() {

    }

    @Override
    public void fireTankGun(Vehicle enemy) {
        int accuracy = new Random().nextInt(2);

        if (accuracy == 1) {
            enemy.damage += 30;
        } else {}
    }

    @Override
    public void combat(Vehicle vehicle) {
        while(this.damage < 100 && vehicle.damage < 100) {
            fireTankGun(vehicle);
            fireTankGun(this);
        }
        if(this.damage >= 100) {
            this.destroy();
        } else { vehicle.destroy();}
    }
}
