package Pieces;
import logic.Piece;

public class Knight extends Piece {

    public Knight(boolean white) {
        super(white);
    }

    public String getFileName() {
        if (white) return "wn.png";
        else return "bn.png";
    }
}
