package interfaces;
import classes.Vehicle;
public interface OperateSubmarine extends OperateVehicle, VehicleCombat {
    void fireTorpedo(Vehicle vehicle);
}