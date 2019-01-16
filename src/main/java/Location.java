public class Location {
    Coordinate coordinate;
    CompassDirection direction;

    public Location(Coordinate coordinate, CompassDirection direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }


    Location moveForward() {
        Coordinate updatedCoordinate = new Coordinate(0, 1);
        return new Location(updatedCoordinate, this.direction);
    }

    Location rotateLeft() {
        return new Location(this.coordinate, this.direction.rotateLeft());
    }

    Location rotateRight() {
        return new Location(this.coordinate, this.direction.rotateRight());
    }

    @Override
    public String toString() {
        return coordinate.toString() + "," + direction.getName();
    }
}