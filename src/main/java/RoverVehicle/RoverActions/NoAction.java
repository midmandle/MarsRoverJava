package RoverVehicle.RoverActions;

import RoverVehicle.Location;

public class NoAction implements Action {
    public Location execute(Location location) {
        return location;
    }
}
