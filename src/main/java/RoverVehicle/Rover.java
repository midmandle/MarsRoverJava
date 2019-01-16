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

    public String generateCurrentLocationString() {
        return this.location.toString();
    }

    public String move(String instructions) {
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
        actionToExecute.execute(this);
    }

    public void moveInCurrentDirection() throws Exception {
        Location nextLocation = this.grid.determineNextLocation(this.location);
        if(this.grid.hasObstacleAt(nextLocation.coordinate)) {
            throw new Exception("Obstacle ahead!");
        }
        this.location = nextLocation;
    }
}
