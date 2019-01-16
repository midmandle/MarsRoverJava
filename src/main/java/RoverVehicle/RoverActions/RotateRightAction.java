package RoverVehicle.RoverActions;

import RoverVehicle.Location;

public class RotateRightAction implements Action {
    public Location execute(Location location) {
        return location.rotateRight();
    }
}
