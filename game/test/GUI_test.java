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
        board.positions[0][0] = new King(true);
        board.positions[1][0] = new King(false);
        board.positions[0][1] = new Queen(true);
        board.positions[1][1] = new Queen(false);
        board.positions[0][2] = new Bishop(true);
        board.positions[1][2] = new Bishop(false);
        board.positions[0][3] = new Knight(true);
        board.positions[1][3] = new Knight(false);
        board.positions[0][4] = new Rook(true);
        board.positions[1][4] = new Rook(false);
        board.positions[0][5] = new Pawn(true);
        board.positions[1][5] = new Pawn(false);
        try {
            test.drawFilledBoard(board);
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Something definitely went wrong");
        }
    }

}
