package RoverVehicle.RoverActions;

import RoverGrid.Coordinate;
import RoverGrid.Grid;
import RoverVehicle.VehicleState;

public class MoveAction implements Action {
    private final VehicleState vehicleState;
    private final Grid grid;

    public MoveAction(VehicleState vehicleState, Grid grid) {
        this.vehicleState = vehicleState;
        this.grid = grid;
    }

    public VehicleState execute() throws Exception {
        Coordinate nextCoordinates = this.grid.determineVehiclesNextValidLocation(this.vehicleState);
        return new VehicleState(nextCoordinates, this.vehicleState.direction);
    }
}
