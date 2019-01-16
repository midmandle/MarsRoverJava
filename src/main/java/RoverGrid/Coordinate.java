package RoverGrid;

import java.util.Objects;

public class Coordinate {
    public final int yCoordinate;
    public final int xCoordinate;

    public Coordinate(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public Coordinate getCoordinateInDirection(CompassDirection direction) {
        if(direction instanceof North)
            return new Coordinate(xCoordinate, yCoordinate + 1);
        if(direction instanceof East)
            return new Coordinate(xCoordinate + 1, yCoordinate);
        if(direction instanceof South)
            return new Coordinate(xCoordinate, yCoordinate - 1);
        if(direction instanceof  West)
            return new Coordinate(xCoordinate - 1, yCoordinate);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return yCoordinate == that.yCoordinate &&
                xCoordinate == that.xCoordinate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(yCoordinate, xCoordinate);
    }

    @Override
    public String toString() {
        return xCoordinate + "," + yCoordinate;
    }
}
