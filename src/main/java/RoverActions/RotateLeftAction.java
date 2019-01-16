package RoverActions;

import RoverActions.Action;
import RoverVehicle.Location;

public class RotateLeftAction implements Action {
    public Location execute(Location location) {
        return location.rotateLeft();
    }
}
