package RoverGrid;


import RoverVehicle.Location;

import java.util.ArrayList;

public class Grid {
    private ArrayList<Coordinate> obstacles = new ArrayList<Coordinate>();

    public Grid() {
    }

    public void addObstacleAt(Coordinate obstacleCoordinate) {
        this.obstacles.add(obstacleCoordinate);
    }

    public boolean hasObstacleAt(Coordinate queryCoordinate) {
        return obstacles.contains(queryCoordinate);
    }
}
