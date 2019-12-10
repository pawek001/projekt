public enum MapDirection {
    NORTH,
    SOUTH,
    SOUTHEAST,
    WEST,
    EAST,
    SOUTHWEST,
    NORTHWEST,
    NORTHEAST;
    public String toString() {
        switch (this) {
            case  NORTH:
                return "Polnoc";
            case SOUTH:
                return "Poludnie";
            case WEST:
                return "Zachod";
            case EAST:
                return "Wschod";
            case NORTHWEST:
                return "Polnocny zachod";
            case NORTHEAST:
                return "Polnocny wschod";
            case SOUTHEAST:
                return "Poludniowy wschod";
            case SOUTHWEST:
                return "Poludniowy zachod";
        }
        return null;
    }
    public Integer toInteger(){
        switch (this) {
            case NORTH:
                return 0;
            case SOUTH:
                return 4;
            case WEST:
                return 6;
            case EAST:
                return 2;
            case NORTHWEST:
                return 7;
            case NORTHEAST:
                return  1;
            case SOUTHEAST:U:
                return 3;
            case SOUTHWEST:
                return 5;
        }
        return null;
    }
    public MapDirection toMapDirection(Integer a){
        switch (a){
            case 0: return NORTH;
            case 1: return NORTHEAST;
            case 2: return EAST;
            case 3: return SOUTHEAST;
            case 4: return SOUTH;
            case 5: return SOUTHWEST;
            case 6: return WEST;
            case 7: return NORTHWEST;
        }
        return null;
    }
}
