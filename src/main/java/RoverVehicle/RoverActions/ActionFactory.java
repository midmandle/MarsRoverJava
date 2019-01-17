package RoverVehicle.RoverActions;

import RoverGrid.Grid;
import RoverVehicle.VehicleState;

public class ActionFactory {
    private final Grid grid;
    private final VehicleState vehicleState;

    public ActionFactory(VehicleState vehicleState, Grid grid) {
        this.vehicleState = vehicleState;
        this.grid = grid;
    }

    public Action generate(Character action) {
        switch(action) {
            case 'M':
                return new MoveAction(this.vehicleState, this.grid);
            case 'R':
                return new RotateRightAction(this.vehicleState);
            case 'L':
                return new RotateLeftAction(this.vehicleState);
        }
        return new NoAction(this.vehicleState);
    }
}
