public class City {
    private String name;
    private String underControlOf;


    public City() {

    }
    public City(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnderControlOf() {
        return underControlOf;
    }

    public void setUnderControlOf(String underControlOf) {
        this.underControlOf = underControlOf;
    }
}
