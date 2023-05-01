import java.lang.annotation.Target;

public class Warplane extends Vehicle implements OperateWarplane{

    private Boolean isFlying;
    public Warplane(){

    }

    public Warplane(String nation) {
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

    public Boolean getFlying() {
        return isFlying;
    }

    public void setFlying(Boolean flying) {
        isFlying = flying;
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

    @Override
    public void fly() {
        isFlying = true;
    }

    @Override
    public void land() {
        isFlying = false;
    }

    @Override
    public void fireMachineGun() {

    }

    public void fireMachineGun(Warplane enemy) {

    }

    @Override
    public void destroy() {

    }
}
