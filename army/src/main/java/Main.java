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

        Airman airman = new Airman("Country 1");
        Airman airman2 = new Airman("Country 2");
        Airman airman3 = new Airman("Country 1");
        Airman airman4 = new Airman("Country 2");
        Airman airman5 = new Airman("Country 1");
        Airman airman6 = new Airman("Country 2");

        // giving them the same gun allows for comparing whether random is working
        airman.setWeapon(new Revolver());
        airman2.setWeapon(new Revolver());

        // Country 2 has a better weapon, improved chance of surviving
        airman3.setWeapon(new Revolver());
        airman4.setWeapon(new Rifle());

        // // Country 1 has a better weapon, improved chance of surviving
        airman5.setWeapon(new Rifle());
        airman6.setWeapon(new Revolver());

        //testing combat functionality
        airman.combat(airman2);
        airman3.combat(airman4);
        airman5.combat(airman6);

    }


}
