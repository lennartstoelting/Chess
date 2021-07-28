package Pieces;
import logic.Piece;

public class Pawn extends Piece {

    public Pawn(boolean white) {
        super(white);
    }

    public String getFileName() {
        if (white) return "wp.png";
        else return "bp.png";
    }
}
