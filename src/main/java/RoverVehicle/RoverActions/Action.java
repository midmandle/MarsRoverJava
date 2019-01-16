package RoverVehicle.RoverActions;

import RoverVehicle.Rover;

public interface Action {
    void execute(Rover rover) throws Exception;
}
