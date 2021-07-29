package GUI_package;
import logic.Board;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * class for JPanel
 * sets size of panel
 * in paint Components, draws each thing after the other
 *
 * ActionListener and KeyListener are to be implemented because they need overrides in order to know how to react
 */
public class Panel extends JPanel {

    private final int tileSize = 64;
    public Board boardLayout;

    /**
     * Constructor
     * (for an empty panel, will probably be deleted at some point)
     * creates a Panel with the size of an 8*8 field with a margin of one tile size around the corners
     */
    public Panel() {
        setPreferredSize(new Dimension(tileSize * 8, tileSize * 8));
        setBackground(Color.black);
    }

    /** Constructor
     * (for a panel filled with the pieces from board)
     * calls the general constructor for measurements, initializes the board to object variable
     */
    public Panel(Board board) {
        this();
        boardLayout = board;
    }

    /**
     * classic override
     * Creates Tiles object
     * checks if there is pieces on the board, displays any piece it can find
     * @param g
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Tiles tiles = new Tiles(g);
        tiles.drawBlankTiles(tileSize);

        for (int rank = 0; rank < 8; rank ++) {
            for (int file = 0; file < 8; file ++) {
                if (boardLayout.boardPositionIndex[rank * 8 + file] != null) {
                    try {
                        g.drawImage(boardLayout.boardPositionIndex[rank * 8 + file].getImage(), file * 64, rank * 64, null);
                    } catch (IOException e) {
                        System.out.println("Some piece didn't load correctly");
                    }
                }
            }
        }
    }
}
