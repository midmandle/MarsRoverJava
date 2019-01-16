package RoverVehicle;

import RoverGrid.CompassDirection;
import RoverGrid.Coordinate;
import RoverGrid.North;

public class Location {
    Coordinate coordinate;
    CompassDirection direction;

    public Location(Coordinate coordinate, CompassDirection direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }


    public Location moveForward() {
        Integer currentX = this.coordinate.xCoordinate;
        Integer currentY = this.coordinate.yCoordinate;

        if(this.direction.getName() == "N")
            currentY += 1;
        if(this.direction.getName() == "E")
            currentX += 1;
        if(this.direction.getName() == "S")
            currentY -= 1;
        if(this.direction.getName() == "W")
            currentX -= 1;

        if(currentX < 0)
            currentX = 9;
        if(currentY < 0)
            currentY = 9;

        Coordinate updatedCoordinate = new Coordinate(currentX, currentY);
        return new Location(updatedCoordinate, this.direction);
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
}