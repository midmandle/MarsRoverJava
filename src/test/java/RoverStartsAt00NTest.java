import RoverVehicle.Rover;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RoverStartsAt00NTest {
    @Test
    public void rover_starts_at_location_00_facing_north() {
        Rover rover = new Rover();
        assertEquals("0,0,N", rover.determineCurrentLocation());
    }
}
