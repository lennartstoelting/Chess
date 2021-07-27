package logic;

/**
 * general Piece
 * always has attribute white or black
 */
public abstract class Piece {
    public boolean white;

    public Piece(boolean white) {
        this.white = white;
    }

    /**
     * just for nicer debugging, doesn't have a purpouse
     * @return good looking description of Piece
     */
    @Override
    public String toString() {
        Class<?> enclosingClass = getClass().getEnclosingClass();
        String tmp;
        if (enclosingClass != null) {
            tmp = enclosingClass.getName().replace("Pieces.","");
        } else {
            tmp = getClass().getName().replace("Pieces.","");
        }
        if (white) return "white " + tmp;
        else return "black " + tmp;
    }
}
