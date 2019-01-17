package RoverVehicle.RoverActions;

import RoverVehicle.VehicleState;

public class RotateLeftAction implements Action {
    public VehicleState execute(VehicleState vehicleState) {
        return new VehicleState(vehicleState.coordinate, vehicleState.direction.rotateLeft(), vehicleState.grid);
    }
}
