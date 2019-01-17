package RoverVehicle.RoverActions;

import RoverVehicle.VehicleState;

public class RotateRightAction implements Action {
    public VehicleState execute(VehicleState vehicleState) {
        return new VehicleState(vehicleState.coordinate, vehicleState.direction.rotateRight(), vehicleState.grid);
    }
}
