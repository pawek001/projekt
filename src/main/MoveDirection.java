
public enum MoveDirection {
    UP,
    DOWN,
    RIGTH,
    LEFT,
    UPRIGHT,
    UPLEFT,
    DOWNRIGHT,
    DOWNLEFT;
    public Vector2d toUnitVector(){
        switch (this) {
            case UP:
                return new Vector2d(0,1);
            case DOWN:
                return new Vector2d(0,-1);
            case LEFT:
                return new Vector2d(-1,0);
            case RIGTH:
                return new Vector2d(1,0);
            case UPLEFT:
                return new Vector2d(-1,1);
            case UPRIGHT:
                return new Vector2d(1,1);
            case DOWNRIGHT:
                return new Vector2d(1,-1);
            case DOWNLEFT:
                return new Vector2d(-1,-1);
        }
        return null;
    }
    public MoveDirection toMoveDirection(Integer a){
        switch(a){
            case 0: return UP;
            case 1: return UPRIGHT;
            case 2: return RIGTH;
            case 3: return DOWNRIGHT;
            case 4: return DOWN;
            case 5: return DOWNLEFT;
            case 6: return LEFT;
            case 7: return UPLEFT;
        }
        return null;
    }
}
