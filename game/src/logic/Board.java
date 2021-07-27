package logic;

import java.util.Arrays;

/**
 * board with fixed dimensions
 * consisting of array of Pieces
 */
public class Board {

    public final int nX = 8;
    public final int nY = 8;
    public Piece[][] positions;

    /**
     * constructor for an empty Board
     */
    public Board() {
        positions = new Piece[nX][nY];
    }

    /**
     * copy constructor next
     */
}
