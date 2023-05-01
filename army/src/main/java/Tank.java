public class Tank extends Vehicle implements OperateTank {

    public Tank() {
        this.setType("Tank");
    }
    public Tank(String nation) {
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

    public void setDamaged(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Tank";
    }


    @Override
    public void fireTankGun() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void destroy() {

    }
}
