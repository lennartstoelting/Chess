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

    public void drawBlankTiles(int tileSize) {
        boolean white = true;
        for (int i = 1; i <= 8; i ++) {
            for (int j = 1; j <= 8; j ++) {
                if (white) g.setColor(LIGHT_TILE);
                else g.setColor(DARK_TILE);
                g.fillRect(i * tileSize, j * tileSize, tileSize, tileSize);
                white = !white;
            }
            white = !white;
        }
    }
}
