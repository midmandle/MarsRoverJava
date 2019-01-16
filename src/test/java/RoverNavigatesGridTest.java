import RoverVehicle.Rover;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class RoverNavigatesGridTest {
    @Test
    @Parameters(method = "movesAroundTestParams")
    public void rover_moves_around_grid(String instructions, String endLocation) {
        Rover rover = new Rover();
        assertEquals(endLocation, rover.move(instructions));
    }

    private Object[] movesAroundTestParams() {
        return new Object[] {
                new Object[]{"MM", "0,2,N"},
                new Object[]{"RM", "1,0,E"},
        };
    }

    @Parameters(method = "wrapsAroundGridBoundariesParams")
    public void rover_wraps_around_grid(String instructions, String endLocation) {
        Rover rover = new Rover();
        assertEquals(endLocation, rover.move(instructions));
    }

    private Object[] wrapsAroundGridBoundariesParams() {
        return new Object[] {
                new Object[]{"LM", "0,9,W"},
        };
    }
}
