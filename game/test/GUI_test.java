import GUI_package.*;
import Pieces.*;
import logic.Board;

import org.junit.jupiter.api.Test;

public class GUI_test {

    /** currently tests very statically when a board is initialized
     * puts a pawn in top right corner, tries to show the finished board
     */
    @Test
    public void testExampleBoard() {
        GUI test = new GUI();
        Board board = new Board();
        board.boardPositionIndex[0] = new King(true);
        board.boardPositionIndex[1] = new King(false);
        board.boardPositionIndex[8] = new Queen(true);
        board.boardPositionIndex[9] = new Queen(false);
        board.boardPositionIndex[16] = new Bishop(true);
        board.boardPositionIndex[17] = new Bishop(false);
        board.boardPositionIndex[24] = new Knight(true);
        board.boardPositionIndex[25] = new Knight(false);
        board.boardPositionIndex[32] = new Rook(true);
        board.boardPositionIndex[33] = new Rook(false);
        board.boardPositionIndex[40] = new Pawn(true);
        board.boardPositionIndex[41] = new Pawn(false);
        try {
            test.drawFilledBoard(board);
            Thread.sleep(15000);
        } catch (Exception e) {
            System.out.println("Something definitely went wrong");
        }
    }

}
