package RoverVehicle.RoverActions;

import RoverVehicle.VehicleState;

public class NoAction implements Action {
    public VehicleState execute(VehicleState vehicleState) {
        return vehicleState;
    }
}
