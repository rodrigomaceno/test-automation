package interfaces;
import classes.Vehicle;
public interface OperateWarship extends OperateVehicle, VehicleCombat {
    void fireArtillery(Vehicle vehicle);
}
