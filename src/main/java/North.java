public class North implements CompassDirection {
    public CompassDirection rotateRight() {
        return new East();
    }

    public CompassDirection rotateLeft() {
        return new West();
    }

    public String getName() {
        return "N";
    }
}
