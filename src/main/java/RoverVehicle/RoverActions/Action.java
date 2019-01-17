package RoverVehicle.RoverActions;

import RoverVehicle.VehicleState;

public interface Action {
    VehicleState execute(VehicleState vehicleState) throws Exception;
}
