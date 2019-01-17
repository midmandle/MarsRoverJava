package RoverVehicle.RoverActions;

import RoverVehicle.VehicleState;

public class MoveAction implements Action {
    public VehicleState execute(VehicleState vehicleState) throws Exception {
        VehicleState nextVehicleState = vehicleState.grid.determineNextLocation(vehicleState);
        if(vehicleState.grid.hasObstacleAt(nextVehicleState.coordinate)) {
            throw new Exception("Obstacle ahead!");
        }
        return nextVehicleState;
    }
}
