package RoverVehicle.RoverActions;

import RoverVehicle.VehicleState;

public interface Action {
    VehicleState execute() throws Exception;
}
