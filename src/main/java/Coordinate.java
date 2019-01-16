public class Coordinate {
    private final int yCoordinate;
    private final int xCoordinate;

    public Coordinate(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public String toString() {
        return xCoordinate + "," + yCoordinate;
    }
}
