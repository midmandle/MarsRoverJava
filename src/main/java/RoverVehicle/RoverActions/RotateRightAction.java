package RoverVehicle.RoverActions;

import RoverVehicle.Location;
import RoverVehicle.Rover;

public class RotateRightAction implements Action {
    public void execute(Rover rover) {
        rover.location = rover.location.rotateRight();
    }
}
