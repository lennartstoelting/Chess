package Pieces;
import logic.Piece;

public class King extends Piece {

    public King(boolean white) {
        super(white);
    }

    public String getFileName() {
        if (white) return "wk.png";
        else return "bk.png";
    }
}
