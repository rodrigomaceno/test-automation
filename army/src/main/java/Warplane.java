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
}
