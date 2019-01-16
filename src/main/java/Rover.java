public class Rover {
    private Location location;

    public Rover() {
        this.initialiseStartingLocation();
    }

    private void initialiseStartingLocation() {
        Coordinate initialCoordinate = new Coordinate(0,0);
        CompassDirection initialDirection = new North();
        this.location = new Location(initialCoordinate, initialDirection);
    }

    public String determineCurrentLocation() {
        return this.location.toString();
    }

    public String move(String instructions) {
        for (Character action : instructions.toCharArray()) {
            if(action.equals('M'))
                this.location = this.location.moveForward();
            if(action.equals('R'))
                this.location = this.location.rotateRight();
            if(action.equals('L'))
                this.location = this.location.rotateLeft();
        }

        return this.location.toString();
    }
}
