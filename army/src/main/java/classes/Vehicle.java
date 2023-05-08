package classes;
import interfaces.Destroy;

public abstract class Vehicle implements Destroy {
    protected String type;
    protected String nation;
    protected int damage = 0;

    public void destroy() {
        if (this.damage >= 100) {
            System.out.println(this.nation + " " + this.type + " was destroyed!");
        }
    }

}

