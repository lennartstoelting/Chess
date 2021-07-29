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
        board.boardPositionIndex[0][0] = new King(true);
        board.boardPositionIndex[1][0] = new King(false);
        board.boardPositionIndex[0][1] = new Queen(true);
        board.boardPositionIndex[1][1] = new Queen(false);
        board.boardPositionIndex[0][2] = new Bishop(true);
        board.boardPositionIndex[1][2] = new Bishop(false);
        board.boardPositionIndex[0][3] = new Knight(true);
        board.boardPositionIndex[1][3] = new Knight(false);
        board.boardPositionIndex[0][4] = new Rook(true);
        board.boardPositionIndex[1][4] = new Rook(false);
        board.boardPositionIndex[0][5] = new Pawn(true);
        board.boardPositionIndex[1][5] = new Pawn(false);
        try {
            test.drawFilledBoard(board);
            Thread.sleep(15000);
        } catch (Exception e) {
            System.out.println("Something definitely went wrong");
        }
    }

}
