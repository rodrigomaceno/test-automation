package interfaces;
import classes.Vehicle;
public interface OperateTank extends OperateVehicle {
    void fireTankGun(Vehicle enemy);
}
