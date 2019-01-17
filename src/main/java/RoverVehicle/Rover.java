package RoverVehicle;

import RoverGrid.CompassDirection;
import RoverGrid.Coordinate;
import RoverGrid.Grid;
import RoverGrid.North;
import RoverVehicle.RoverActions.Action;
import RoverVehicle.RoverActions.ActionFactory;

public class Rover {
    private VehicleState vehicleState;

    public Rover(Grid grid) {
        this.initialiseStartingLocation(grid);
    }

    private void initialiseStartingLocation(Grid grid) {
        Coordinate initialCoordinate = new Coordinate(0,0);
        CompassDirection initialDirection = new North();
        this.vehicleState = new VehicleState(initialCoordinate, initialDirection, grid);
    }

    public String generateCurrentLocationString() {
        return this.vehicleState.toString();
    }

    public String executeInstructions(String instructions) {
        try {
            for (Character action : instructions.toCharArray()) {
                executeAction(action);
            }
            return this.generateCurrentLocationString();
        } catch (Exception e) {
            return this.generateCurrentLocationString();
        }
    }

    private void executeAction(Character action) throws Exception {
        ActionFactory actionFactory = new ActionFactory();
        Action actionToExecute = actionFactory.generate(action);
        this.vehicleState = actionToExecute.execute(this.vehicleState);
    }
}
