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

    public VehicleState rotateLeft() {
        return new VehicleState(this.coordinate, this.direction.rotateLeft(), this.grid);
    }

    public VehicleState rotateRight() {
        return new VehicleState(this.coordinate, this.direction.rotateRight(), this.grid);
    }

    @Override
    public String toString() {
        return coordinate.toString() + "," + direction.getName();
    }

    public VehicleState getNextLocation() {
        Coordinate nextCoordinates = this.coordinate.getCoordinateInDirection(this.direction);
        return new VehicleState(nextCoordinates, this.direction, this.grid);
    }
}