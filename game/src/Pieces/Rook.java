package Pieces;
import logic.Piece;

public class Rook extends Piece {

    public Rook(boolean white) {
        super(white);
    }

    public String getFileName() {
        if (white) return "wr.png";
        else return "br.png";
    }
}
