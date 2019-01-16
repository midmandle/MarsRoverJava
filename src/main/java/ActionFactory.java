public class ActionFactory {

    public Action generate(Character action) {
        switch(action) {
            case 'M':
                return new MoveAction();
            case 'R':
                return new RotateRightAction();
            case 'L':
                return new RotateLeftAction();
        }
        return new NoAction();
    }
}
