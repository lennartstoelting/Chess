package Pieces;
import logic.Piece;

public class Queen extends Piece {

    public Queen(boolean white) {
        super(white);
    }

    public String getFileName() {
        if (white) return "wq.png";
        else return "bq.png";
    }
}
