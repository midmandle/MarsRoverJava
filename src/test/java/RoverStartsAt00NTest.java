import RoverGrid.Grid;
import RoverVehicle.Rover;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RoverStartsAt00NTest {
    @Test
    public void rover_starts_at_location_00_facing_north() {
        Grid grid = new Grid();
        Rover rover = new Rover(grid);
        assertEquals("0,0,N", rover.executeInstructions(""));
    }
}
