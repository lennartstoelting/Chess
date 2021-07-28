import GUI_package.*;
import Pieces.*;
import logic.Board;

import org.junit.jupiter.api.Test;

public class GUI_test {

    /** currently tests very statically when a board is initialized
     * puts a pawn in top right corner, tries to show the finished board
     */
    @Test
    public void testEmptyBoard() {
        GUI test = new GUI();
        Board board = new Board();
        board.positions[0][0] = new Pawn(false);
        try {
            test.drawFilledBoard(board);
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Something definitely went wrong");
        }
    }

}
