package logic;

/**
 * board with fixed dimensions
 * consisting of array of Pieces
 */
public class Board {

    public final int nX = 8;
    public final int nY = 8;
    public Piece[][] boardPositionIndex;

    /**
     * constructor for an empty Board
     */
    public Board() {
        boardPositionIndex = new Piece[nX][nY];
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
        StringBuilder tmpReturn = new StringBuilder("Board of Dimension" + nX + "x" + nY + "\n" + horizontalLine + "\n");
        for (int i = 0; i < nY; i ++) {
            for (int j = 0; j < nX; j ++) {
                if (boardPositionIndex[j][i] == null) tmpReturn.append("|  ");
                else tmpReturn.append("|").append(boardPositionIndex[j][i]);
            }
            tmpReturn.append("|\n").append(horizontalLine).append("\n");
        }
        return tmpReturn.toString();
    }
}
