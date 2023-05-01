public class Submarine extends Vehicle{

    public Submarine() {
        this.type = "submarine";
    }
    public Submarine(String nation) {
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
    public void destroy() {

    }
}
