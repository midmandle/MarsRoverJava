package RoverVehicle.RoverActions;

import RoverVehicle.VehicleState;

public class RotateRightAction implements Action {
    public VehicleState execute(VehicleState vehicleState) {
        vehicleState = vehicleState.rotateRight();
        return vehicleState;
    }
}
