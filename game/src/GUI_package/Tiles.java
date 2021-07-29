package GUI_package;
import java.awt.*;

/**
 * tiles to be drawn with set colors
 */
public class Tiles {

    private static final Color DARK_TILE = new Color(59, 80, 23);
    private static final Color LIGHT_TILE = new Color(100, 170, 100);

    private Graphics g;

    // constructor
    public Tiles(Graphics g) { this.g = g; }

    /**
     * loops through the 8x8 board to create alternating colored tiles
     * @param tileSize size of a tile so this can be adjusted later on
     */
    public void drawBlankTiles(int tileSize) {
        for (int rank = 0; rank < 8; rank ++) {
            for (int file = 0; file < 8; file ++) {
                if ((rank + file) % 2 == 0) g.setColor(LIGHT_TILE);
                else g.setColor(DARK_TILE);
                g.fillRect(file * tileSize, rank * tileSize, tileSize, tileSize);
            }
        }
    }
}
