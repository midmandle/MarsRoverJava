public class East implements CompassDirection {
    public CompassDirection rotateRight() {
        return new South();
    }

    public CompassDirection rotateLeft() {
        return new North();
    }

    public String getName() {
        return "E";
    }
}
