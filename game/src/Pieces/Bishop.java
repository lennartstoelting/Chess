package Pieces;
import logic.Piece;

public class Bishop extends Piece {

    public Bishop(boolean white) {
        super(white);
    }

    public String getFileName() {
        if (white) return "wb.png";
        else return "bb.png";
    }
}
