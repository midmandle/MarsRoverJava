package RoverVehicle;

import RoverGrid.CompassDirection;
import RoverGrid.Coordinate;
import RoverGrid.North;

public class Location {
    public Coordinate coordinate;
    public CompassDirection direction;

    public Location(Coordinate coordinate, CompassDirection direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }

    public Location rotateLeft() {
        return new Location(this.coordinate, this.direction.rotateLeft());
    }

    public Location rotateRight() {
        return new Location(this.coordinate, this.direction.rotateRight());
    }

    @Override
    public String toString() {
        return coordinate.toString() + "," + direction.getName();
    }

    public Location getNextLocation() {
        Coordinate nextCoordinates = this.coordinate.getCoordinateInDirection(this.direction);
        return new Location(nextCoordinates, this.direction);
    }
}