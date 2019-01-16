package RoverVehicle.RoverActions;

import RoverVehicle.Location;

public class RotateLeftAction implements Action {
    public Location execute(Location location) {
        return location.rotateLeft();
    }
}
