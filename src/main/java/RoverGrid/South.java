package RoverGrid;

public class South implements CompassDirection {
    public CompassDirection rotateRight() {
        return new West();
    }

    public CompassDirection rotateLeft() {
        return new East();
    }

    public String getName() {
        return "S";
    }
}
