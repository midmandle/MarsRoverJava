package RoverVehicle.RoverActions;

import RoverVehicle.Location;
import RoverVehicle.Rover;

public class MoveAction implements Action {
    public void execute(Rover rover) throws Exception {
        Location nextLocation = rover.location.moveForward();

        if (rover.grid.hasObstacleAt(nextLocation.coordinate))
            throw new Exception("Hit obstacle");

        rover.location = nextLocation;
    }
}
