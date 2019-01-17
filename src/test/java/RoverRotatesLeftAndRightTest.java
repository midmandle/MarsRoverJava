import RoverGrid.Grid;
import RoverVehicle.Rover;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class RoverRotatesLeftAndRightTest {
    @Test
    public void rover_rotates_right() {
        Grid grid = new Grid();
        Rover rover = new Rover(grid);
        assertEquals("0,0,E", rover.executeInstructions("R"));
    }

    @Test
    public void rover_rotates_left() {
        Grid grid = new Grid();
        Rover rover = new Rover(grid);
        assertEquals("0,0,W", rover.executeInstructions("L"));
    }

    @Test
    public void rover_rotates_turn_to_face_opposite_direction() {
        Grid grid = new Grid();
        Rover rover = new Rover(grid);
        assertEquals("0,0,S", rover.executeInstructions("RR"));
        assertEquals("0,0,N", rover.executeInstructions("LL"));
    }

    @Test
    public void rover_rotates_full_circle(){
        Grid grid = new Grid();
        Rover rover = new Rover(grid);
        assertEquals("0,0,N", rover.executeInstructions("LLLL"));
        assertEquals("0,0,N", rover.executeInstructions("RRRR"));
    }
}
