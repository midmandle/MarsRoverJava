package RoverVehicle.RoverActions;

import RoverVehicle.VehicleState;

public class RotateLeftAction implements Action {
    private final VehicleState vehicleState;

    public RotateLeftAction(VehicleState vehicleState) {
        this.vehicleState = vehicleState;
    }

    public VehicleState execute() {
        return new VehicleState(this.vehicleState.coordinate, this.vehicleState.direction.rotateLeft());
    }
}
