import java.util.Arrays;

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
        Sailor aSailor = new Sailor();

        // Testing overridden equals method
        System.out.println(aSoldier.equals(aSailor));


    }
}
