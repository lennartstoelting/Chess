import Pieces.*;
import logic.Board;
import org.junit.jupiter.api.Test;

public class boardAndPiecesTest {

    @Test
    public void piecesInit() {
        Board b = new Board();
        b.positions[0][1] = new Knight(true);
        System.out.println(b.positions[0][1]);
        b.positions[1][1] = new King(false);
        System.out.println(b.positions[1][1]);
    }
}
