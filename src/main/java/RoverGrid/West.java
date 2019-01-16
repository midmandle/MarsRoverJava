package RoverGrid;

public class West implements CompassDirection {
    public CompassDirection rotateRight() {
        return new North();
    }

    public CompassDirection rotateLeft() {
        return new South();
    }

    public String getName() {
        return "W";
    }
}
