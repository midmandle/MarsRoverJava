package RoverVehicle;

import RoverGrid.CompassDirection;
import RoverGrid.Coordinate;
import RoverGrid.Grid;

public class VehicleState {
    public final Grid grid;
    public Coordinate coordinate;
    public CompassDirection direction;

    public VehicleState(Coordinate coordinate, CompassDirection direction, Grid grid) {
        this.coordinate = coordinate;
        this.direction = direction;
        this.grid = grid;
    }

    public String getLocationString() {
        return coordinate.toString() + "," + direction.getName();
    }

}