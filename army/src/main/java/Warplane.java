import java.lang.annotation.Target;
import java.util.Random;

public class Warplane extends Vehicle implements OperateWarplane, VehicleCombat{

    public Warplane(){
        this.setType("Warplane");
    }

    public Warplane(String nation) {
        this.setType("Warplane");
        this.nation = nation;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNation() { return nation; }

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

    public void fireMachineGun(Vehicle enemy) {
        int accuracy = new Random().nextInt(2);

        if (accuracy == 1) {
            enemy.damage += 30;
        } else {}
    }

    @Override
    public void combat(Vehicle vehicle) {
        while(this.damage < 100 && vehicle.damage < 100) {
            fireMachineGun(vehicle);
            fireMachineGun(this);
        }
        if(this.damage >= 100) {
            this.destroy();
        } else { vehicle.destroy();}
    }

}
