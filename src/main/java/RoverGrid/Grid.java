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

    public Coordinate determineVehiclesNextValidLocation(VehicleState roverVehicleState) throws Exception {
        Coordinate nextCoordinates = generateNextValidCoordinate(roverVehicleState);

        if(this.hasObstacleAt(nextCoordinates)) {
            throw new Exception("Obstacle ahead!");
        }

        return nextCoordinates;
    }

    private Coordinate generateNextValidCoordinate(VehicleState roverVehicleState) {
        Coordinate nextCoordinates = this.getNextLocationInVehiclesDirection(roverVehicleState);

        if(nextCoordinates.xCoordinate > this.width)
            nextCoordinates = wrapToLeftSide(nextCoordinates);

        if(nextCoordinates.yCoordinate > this.height)
            nextCoordinates = wrapToBottomSide(nextCoordinates);

        if(nextCoordinates.xCoordinate < 0)
            nextCoordinates = wrapToRightSide(nextCoordinates);

        if(nextCoordinates.yCoordinate < 0)
            nextCoordinates = wrapToTopSide(nextCoordinates);

        return nextCoordinates;
    }

    private Coordinate wrapToTopSide(Coordinate nextCoordinates) {
        return new Coordinate(nextCoordinates.xCoordinate, this.height);
    }

    private Coordinate wrapToRightSide(Coordinate nextCoordinates) {
        return new Coordinate(this.width, nextCoordinates.yCoordinate);
    }

    private Coordinate wrapToBottomSide(Coordinate nextCoordinates) {
        return new Coordinate(nextCoordinates.xCoordinate, 0);
    }

    private Coordinate wrapToLeftSide(Coordinate nextCoordinates) {
        return new Coordinate(0, nextCoordinates.yCoordinate);
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
