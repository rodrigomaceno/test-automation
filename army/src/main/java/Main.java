// Soldier, Sailor, Airman have overridden methods
public class Main {
    public static void main(String[] args) {

        Army army1 = new Army();
        army1.createArmy();
        army1.createNavy();
        army1.createAirForce();


        Army army2 = new Army();
        army2.createArmy();
        army2.createNavy();
        army2.createAirForce();

        Soldier aSoldier = new Soldier();
        Marine aMarine = new Marine();


        Airman airman1 =  new Airman("US");
        Airman airman2 =  new Airman("Brazil");
        Airman.combat(airman1, airman2, new Revolver(), new Revolver());



    }
}
