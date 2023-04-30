public class Tank extends Vehicle implements OperateTank {

    public Tank() {
        this.setType("Tank");
    }
    public Tank(String type) {
        this.type = type;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Nation getNation() { return nation; }

    public void setNation(Nation nation) { this.nation = nation; }

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

    public Boolean getDamaged() {
        return isDamaged;
    }

    public void setDamaged(Boolean damaged) {
        isDamaged = damaged;
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
}
