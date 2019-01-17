package RoverVehicle.RoverActions;

import RoverVehicle.Location;
import RoverVehicle.Rover;

public class MoveAction implements Action {
    public void execute(Rover rover) throws Exception {
        Location nextLocation = rover.grid.determineNextLocation(rover.location);
        if(rover.grid.hasObstacleAt(nextLocation.coordinate)) {
            throw new Exception("Obstacle ahead!");
        }
        rover.location = nextLocation;
    }
}
