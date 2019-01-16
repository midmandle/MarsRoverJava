package RoverGrid;

public class Coordinate {
    public final int yCoordinate;
    public final int xCoordinate;

    public Coordinate(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public String toString() {
        return xCoordinate + "," + yCoordinate;
    }
}
