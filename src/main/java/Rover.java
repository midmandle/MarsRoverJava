public class Rover {
    private Coordinate currentLocation;
    private CompassDirection direction;

    public Rover() {
        this.initialiseStartingLocation();
    }

    private void initialiseStartingLocation() {
        this.currentLocation = new Coordinate(0,0);
        this.direction = CompassDirection.NORTH;
    }

    public String determineCurrentLocation() {
        return currentLocation.toString() + "," + direction.name().charAt(0);
    }

    public String move(String instructions) {
        if(instructions.equals("R"))
            this.direction = CompassDirection.EAST;
        if(instructions.equals("L"))
            this.direction = CompassDirection.WEST;

        this.currentLocation = new Coordinate(0,0);
        return this.determineCurrentLocation();
    }
}
