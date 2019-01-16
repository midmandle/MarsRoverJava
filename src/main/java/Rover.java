public class Rover {
    private Coordinate currentLocation;
    private CompassDirection direction;

    public Rover() {
        this.currentLocation = new Coordinate(0,0);
        this.direction = CompassDirection.NORTH;
    }

    public String determineCurrentLocation() {
        return currentLocation.toString() + "," + direction.name().charAt(0);
    }

    public String move(String instructions) {
        this.currentLocation = new Coordinate(0,0);
        this.direction = CompassDirection.EAST;
        return this.determineCurrentLocation();
    }
}
