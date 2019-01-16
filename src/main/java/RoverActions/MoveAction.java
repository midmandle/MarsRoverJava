package RoverActions;

import RoverActions.Action;
import RoverVehicle.Location;

public class MoveAction implements Action {
    public Location execute(Location location) {
        return location.moveForward();
    }
}
