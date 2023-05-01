// Soldier, Sailor, Airman have overridden methods
// Weapon, Person, Vehicle are all abstract
public class Main {
    public static void main(String[] args) {

        Army army1 = new Army();
        army1.createArmy("Country 1");
        army1.createNavy("Country 1");
        army1.createAirForce("Country 1");


        Army army2 = new Army();
        army2.createArmy("Country 2");
        army2.createNavy("Country 2");
        army2.createAirForce("Country 2");

        //test combat functionality
        Airman.combat(army1.getAirmen()[0], army2.getAirmen()[0], new Revolver(), new Revolver());

    }
}
