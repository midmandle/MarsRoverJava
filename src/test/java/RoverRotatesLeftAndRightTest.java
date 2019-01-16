import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class RoverRotatesLeftAndRightTest {
    @Test
    public void rover_rotates_right() {
        Rover rover = new Rover();
        assertEquals("0,0,E", rover.move("R"));
    }

    @Test
    public void rover_rotates_left() {
        Rover rover = new Rover();
        assertEquals("0,0,W", rover.move("L"));
    }
}
