package RoverVehicle.RoverActions;

import RoverGrid.Coordinate;
import RoverVehicle.VehicleState;

public class MoveAction implements Action {
    public VehicleState execute(VehicleState vehicleState) throws Exception {
        Coordinate nextCoordinates = vehicleState.grid.determineNextLocation(vehicleState);
        if(vehicleState.grid.hasObstacleAt(nextCoordinates)) {
            throw new Exception("Obstacle ahead!");
        }
        return new VehicleState(nextCoordinates, vehicleState.direction, vehicleState.grid);
    }
}
