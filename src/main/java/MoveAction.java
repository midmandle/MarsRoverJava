public class MoveAction implements Action{
    public Location execute(Location location) {
        return location.moveForward();
    }
}
