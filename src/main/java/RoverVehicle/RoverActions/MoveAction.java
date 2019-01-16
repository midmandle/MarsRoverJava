package RoverVehicle.RoverActions;

import RoverVehicle.Location;
import RoverVehicle.Rover;

public class MoveAction implements Action {
    public void execute(Rover rover) throws Exception {
        rover.moveInCurrentDirection();
    }
}
