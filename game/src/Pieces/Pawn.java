package Pieces;
import logic.Piece;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Pawn extends Piece {

    public Pawn(boolean white) {
        super(white);
    }

    /**
     * first instance of attempt at loading the image of a black pawn from the assets folder
     * very static still
     *
     * intended to only call for graphic but never store for the actual algorithm
     * @return returns the image as a BufferedImage
     * @throws IOException if file wasn't found or couldn't correctly load
     */
    public BufferedImage getImg() throws IOException {
        BufferedImage img = ImageIO.read(new File("assets/Chess_piece_unformated/bp.png"));
        return resize(img, 60, 60);
    }

    public static BufferedImage resize(BufferedImage img, int newW, int newH) {
        Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
        BufferedImage dimg = new BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = dimg.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();

        return dimg;
    }
}
