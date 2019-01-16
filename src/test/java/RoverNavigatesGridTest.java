import RoverGrid.Coordinate;
import RoverGrid.Grid;
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
        Grid grid = new Grid();
        Rover rover = new Rover(grid);
        assertEquals(endLocation, rover.move(instructions));
    }

    private Object[] movesAroundTestParams() {
        return new Object[] {
                new Object[]{"MM", "0,2,N"},
                new Object[]{"RM", "1,0,E"},
                new Object[]{"RMM", "2,0,E"},
                new Object[]{"RMML", "2,0,N"},
                new Object[]{"RMMLMMM", "2,3,N"},
                new Object[]{"RMMLMMML", "2,3,W"},
                new Object[]{"RMMLMMMLMM", "0,3,W"},
                new Object[]{"RMMLMMMLMML", "0,3,S"},
                new Object[]{"RMMLMMMLMMLMMM", "0,0,S"},
                new Object[]{"RMMLMMMLMMLMMMRR", "0,0,N"},
        };
    }

    @Test
    @Parameters(method = "wrapsAroundGridBoundariesParams")
    public void rover_wraps_around_grid(String instructions, String endLocation) {
        Grid grid = new Grid();
        Rover rover = new Rover(grid);
        assertEquals(endLocation, rover.move(instructions));
    }

    private Object[] wrapsAroundGridBoundariesParams() {
        return new Object[] {
                new Object[]{"LM", "9,0,W"},
                new Object[]{"LLM", "0,9,S"},
                new Object[]{"LLMMMMMMRM", "9,4,W"},
                new Object[]{"LLMMMMMMRMRRM", "0,4,E"},
        };
    }

    @Test
    public void rover_stops_when_encountering_obstacle() {
        Coordinate obstableLocation = new Coordinate(0,2);
        Grid grid = new Grid();
        grid.addObstacleAt(obstableLocation);
        Rover rover = new Rover(grid);
        assertEquals("0,1,N", rover.move("MM"));
    }
}
