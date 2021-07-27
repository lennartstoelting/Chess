import Pieces.Pawn;
import logic.Board;
import org.junit.jupiter.api.Test;

public class boardAndPiecestest {

    @Test
    public void piecesInit() {
        Board b = new Board();
        b.positions[0][1] = new Pawn(true);
        b.positions[1][1] = new Pawn(true);
    }
}
