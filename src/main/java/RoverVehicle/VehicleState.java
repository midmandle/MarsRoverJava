package RoverVehicle;

import RoverGrid.CompassDirection;
import RoverGrid.Coordinate;

public class VehicleState {
    public Coordinate coordinate;
    public CompassDirection direction;

    public VehicleState(Coordinate coordinate, CompassDirection direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }

    public String getLocationString() {
        return coordinate.toString() + "," + direction.getName();
    }

}