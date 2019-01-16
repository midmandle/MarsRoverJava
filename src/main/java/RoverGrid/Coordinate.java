package RoverGrid;

import java.util.Objects;

public class Coordinate {
    public final int yCoordinate;
    public final int xCoordinate;

    public Coordinate(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
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
