package RoverActions;

import RoverActions.Action;
import RoverVehicle.Location;

public class RotateRightAction implements Action {
    public Location execute(Location location) {
        return location.rotateRight();
    }
}
