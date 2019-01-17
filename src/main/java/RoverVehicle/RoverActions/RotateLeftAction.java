package RoverVehicle.RoverActions;

import RoverVehicle.VehicleState;

public class RotateLeftAction implements Action {
    public VehicleState execute(VehicleState vehicleState) {
        vehicleState = vehicleState.rotateLeft();
        return vehicleState;
    }
}
