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

    @Test
    public void rover_rotates_turn_to_face_opposite_direction() {
        Rover rover = new Rover();
        assertEquals("0,0,S", rover.move("RR"));
        assertEquals("0,0,N", rover.move("LL"));
    }

    @Test
    public void rover_rotates_full_circle(){
        Rover rover = new Rover();
        assertEquals("0,0,N", rover.move("LLLL"));
        assertEquals("0,0,N", rover.move("RRRR"));
    }
}
