package RoverVehicle.RoverActions;

import RoverVehicle.VehicleState;

public class NoAction implements Action {
    private final VehicleState vehicleState;

    public NoAction(VehicleState vehicleState) {
        this.vehicleState = vehicleState;
    }

    public VehicleState execute() {
        return this.vehicleState;
    }
}
