package RoverGrid;


import RoverVehicle.VehicleState;

import java.util.ArrayList;

public class Grid {
    private final int width;
    private final int height;
    private ArrayList<Coordinate> obstacles = new ArrayList<Coordinate>();

    public Grid() {
        this.width = 9;
        this.height = 9;
    }

    public Coordinate determineNextLocation(VehicleState roverVehicleState) {
        Coordinate nextCoordinates = this.getNextLocationInVehiclesDirection(roverVehicleState);

        if(nextCoordinates.xCoordinate > this.width)
            nextCoordinates = new Coordinate(0, nextCoordinates.yCoordinate);
        if(nextCoordinates.yCoordinate > this.height)
            nextCoordinates = new Coordinate(nextCoordinates.xCoordinate, 0);
        if(nextCoordinates.xCoordinate < 0)
            nextCoordinates = new Coordinate(this.width, nextCoordinates.yCoordinate);
        if(nextCoordinates.yCoordinate < 0)
            nextCoordinates = new Coordinate(nextCoordinates.xCoordinate, this.height);

        return nextCoordinates;
    }

    public void addObstacleAt(Coordinate obstacleCoordinate) {
        this.obstacles.add(obstacleCoordinate);
    }

    public boolean hasObstacleAt(Coordinate queryCoordinate) {
        return obstacles.contains(queryCoordinate);
    }

    private Coordinate getNextLocationInVehiclesDirection(VehicleState vehicleState) {
        Coordinate nextCoordinates = vehicleState.coordinate.getCoordinateInDirection(vehicleState.direction);
        return nextCoordinates;
    }
}
