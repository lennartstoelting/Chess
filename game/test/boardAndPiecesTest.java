import Pieces.*;
import logic.Board;
import org.junit.jupiter.api.Test;

public class boardAndPiecesTest {

    /**
     * tests if the pieces get constructed correctly and if they are in the right spot on the board
     */
    @Test
    public void piecesInit() {
        Board b = new Board();
        b.boardPositionIndex[0][1] = new Knight(true);
        System.out.println(b.boardPositionIndex[0][1]);
        b.boardPositionIndex[1][1] = new King(false);
        System.out.println(b.boardPositionIndex[1][1]);
    }
}
