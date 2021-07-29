package logic;

/**
 * board with fixed dimensions
 * consisting of array of Pieces
 */
public class Board {

    public Piece[] boardPositionIndex;

    /**
     * constructor for an empty Board
     */
    public Board() {
        boardPositionIndex = new Piece[64];
    }

    /**
     * copy constructor next
     */

    /**
     * simple toString replacement so it's easier to look at in the debugger
     * @return String to be printed in debugger
     */
    @Override
    public String toString() {
        String horizontalLine = "+--+--+--+--+--+--+--+--+";
        StringBuilder tmpReturn = new StringBuilder(horizontalLine + "\n");
        for (int rank = 0; rank < 8; rank ++) {
            for (int file = 0; file < 8; file ++) {
                if (boardPositionIndex[rank * 8 + file] == null) tmpReturn.append("|  ");
                else tmpReturn.append("|").append(boardPositionIndex[rank * 8 + file]);
            }
            tmpReturn.append("|\n").append(horizontalLine).append("\n");
        }
        return tmpReturn.toString();
    }
}
