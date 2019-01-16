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
        for (Character action : instructions.toCharArray()) {
            if(action.equals('M'))
                this.moveForward();
            if(action.equals('R'))
                this.rotateRight();
            if(action.equals('L'))
                this.rotateLeft();
        }

        return this.determineCurrentLocation();
    }

    private void moveForward() {
        this.currentLocation = new Coordinate(0, 1);
    }

    private void rotateLeft() {
        switch (this.direction) {
            case NORTH:
                this.direction = CompassDirection.WEST;
                break;
            case EAST:
                this.direction = CompassDirection.NORTH;
                break;
            case SOUTH:
                this.direction = CompassDirection.EAST;
                break;
            case WEST:
                this.direction = CompassDirection.SOUTH;
                break;
        }
    }

    private void rotateRight() {
        switch(this.direction) {
            case NORTH:
                this.direction = CompassDirection.EAST;
                break;
            case EAST:
                this.direction = CompassDirection.SOUTH;
                break;
            case SOUTH:
                this.direction = CompassDirection.WEST;
                break;
            case WEST:
                this.direction = CompassDirection.NORTH;
                break;
        }
    }
}
