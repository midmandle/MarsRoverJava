package RoverVehicle;

import RoverGrid.CompassDirection;
import RoverGrid.Coordinate;
import RoverGrid.North;
import RoverVehicle.RoverActions.Action;
import RoverVehicle.RoverActions.ActionFactory;

public class Rover {
    private Location location;

    public Rover() {
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
        for (Character action : instructions.toCharArray()) {
            executeAction(action);
        }

        return this.location.toString();
    }

    private void executeAction(Character action) {
        ActionFactory actionFactory = new ActionFactory();
        Action actionToExecute = actionFactory.generate(action);
        this.location = actionToExecute.execute(this.location);
    }
}
