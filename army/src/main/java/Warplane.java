public class Warplane extends Vehicle {

    private Boolean isFlying;



    public Warplane(){

    }
    public Warplane(String type) {
        this.type = type;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Nation getNation() { return nation; }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Boolean getFlying() {
        return isFlying;
    }

    public void setFlying(Boolean flying) {
        isFlying = flying;
    }

    public Boolean getDamaged() {
        return isDamaged;
    }

    public void setDamaged(Boolean damaged) {
        isDamaged = damaged;
    }


    public void fly() {
        isFlying = true;
        System.out.println("Warplane is now flying");
    }

    public void land() {
        isFlying = false;
        System.out.println("Warplane has landed");
    }
}
