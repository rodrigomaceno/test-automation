// Soldier, Sailor, Airman have overridden methods
public class Main {
    public static void main(String[] args) {

        Army army1 = new Army();
        army1.createArmy("US");
        army1.createNavy("US");
        army1.createAirForce("US");


        Army army2 = new Army();
        army2.createArmy("Brazil");
        army2.createNavy("Brazil");
        army2.createAirForce("Brazil");

        //test combat functionality
        Airman airman1 =  new Airman("US");
        Airman airman2 =  new Airman("Brazil");
        Airman.combat(airman1, airman2, new Revolver(), new Revolver());

    }
}
