package RoverActions;

import RoverActions.Action;
import RoverVehicle.Location;

public class NoAction implements Action {
    public Location execute(Location location) {
        return location;
    }
}
