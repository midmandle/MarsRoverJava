import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RoverRotatesLeftAndRightTest {
    @Test
    public void rover_rotates_right() {
        Rover rover = new Rover();
        rover.move("R");
        assertEquals("0,0,E", rover.determineCurrentLocation());
    }
}
