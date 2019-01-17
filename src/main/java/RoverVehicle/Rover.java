package RoverVehicle;

import RoverGrid.CompassDirection;
import RoverGrid.Coordinate;
import RoverGrid.Grid;
import RoverGrid.North;
import RoverVehicle.RoverActions.Action;
import RoverVehicle.RoverActions.ActionFactory;

public class Rover {
    private VehicleState vehicleState;
    private Grid grid;

    public Rover(Grid grid) {
        this.grid = grid;
        this.initialiseStartingLocation();
    }

    private void initialiseStartingLocation() {
        Coordinate initialCoordinate = new Coordinate(0,0);
        CompassDirection initialDirection = new North();
        this.vehicleState = new VehicleState(initialCoordinate, initialDirection);
    }

    private String generateCurrentLocationString() {
        return this.vehicleState.getLocationString();
    }

    public String executeInstructions(String instructions) {
        try {
            this.generateAndExecuteActionsForInstruction(instructions);
        } catch (Exception e) {
            return this.generateCurrentLocationString();
        }
        return this.generateCurrentLocationString();
    }

    private void generateAndExecuteActionsForInstruction(String instructions) throws Exception {
        for (Character action : instructions.toCharArray()) {
            this.generateAndExecuteAction(action);
        }
    }

    private void generateAndExecuteAction(Character action) throws Exception {
        ActionFactory actionFactory = new ActionFactory(this.vehicleState, this.grid);
        Action actionToExecute = actionFactory.generate(action);
        this.vehicleState = actionToExecute.execute();
    }
}
