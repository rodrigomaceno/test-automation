//import java.util.logging.Logger;
//import static java.util.logging.Logger.getLogger;

// Soldier, Marine, Airman have overridden methods
// Weapon, Person, Vehicle are all abstract
public class Main {
    public static void main(String[] args) {

//        Logger log = getLogger(Main.class.getName());
//        log.info("My message");

        Army army1 = new Army();
        army1.createArmy("Country 1");
        army1.createNavy("Country 1");
        army1.createAirForce("Country 1");


        Army army2 = new Army();
        army2.createArmy("Country 2");
        army2.createNavy("Country 2");
        army2.createAirForce("Country 2");


//      testing Vehicle combat functionality
        army1.getTanks()[0].combat(army2.getTanks()[0]);
        army1.getWarplanes()[0].combat(army2.getWarplanes()[0]);
        army1.getSubmarines()[0].combat(army2.getSubmarines()[0]);
        army1.getWarships()[0].combat(army2.getWarships()[0]);


//      testing Person combat functionality,
//      giving them the same gun allows for comparing whether random is working
        army1.getSoldiers()[0].setWeapon(new Revolver());
        army2.getSoldiers()[0].setWeapon(new Revolver());
        army1.getSoldiers()[0].combat(army2.getSoldiers()[0]);


//      Country 2 Soldier has a better weapon, improved chance of surviving
        army1.getSoldiers()[1].setWeapon(new Revolver());
        army2.getSoldiers()[1].setWeapon(new Rifle());
        army1.getSoldiers()[1].combat(army2.getSoldiers()[1]);

//      Country 1 has a better weapon, improved chance of surviving
        army1.getSoldiers()[2].setWeapon(new Rifle());
        army2.getSoldiers()[2].setWeapon(new Revolver());
        army1.getSoldiers()[2].combat(army2.getSoldiers()[2]);

    }
}
