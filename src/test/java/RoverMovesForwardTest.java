import RoverVehicle.Rover;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RoverMovesForwardTest {
    @Test
    public void rover_moves_forward_one_space_from_starting_place() {
        Rover rover = new Rover();
        assertEquals("0,1,N", rover.move("M"));
    }
}
