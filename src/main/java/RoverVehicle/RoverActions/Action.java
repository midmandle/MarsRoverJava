package RoverVehicle.RoverActions;

import RoverVehicle.Location;

public interface Action {
    Location execute(Location location);
}
