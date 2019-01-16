package RoverVehicle;

import RoverGrid.CompassDirection;
import RoverGrid.Coordinate;
import RoverGrid.Grid;
import RoverGrid.North;
import RoverVehicle.RoverActions.Action;
import RoverVehicle.RoverActions.ActionFactory;

public class Rover {
    public final Grid grid;
    public Location location;

    public Rover(Grid grid) {
        this.grid = grid;
        this.initialiseStartingLocation();
    }

    private void initialiseStartingLocation() {
        Coordinate initialCoordinate = new Coordinate(0,0);
        CompassDirection initialDirection = new North();
        this.location = new Location(initialCoordinate, initialDirection);
    }

    public String determineCurrentLocation() {
        return this.location.toString();
    }

    public String move(String instructions) {
        try {
            for (Character action : instructions.toCharArray()) {
                executeAction(action);
            }
            return this.location.toString();
        } catch (Exception e) {
            return this.location.toString();
        }
    }

    private void executeAction(Character action) throws Exception {
        ActionFactory actionFactory = new ActionFactory();
        Action actionToExecute = actionFactory.generate(action);
        actionToExecute.execute(this);
    }
}
