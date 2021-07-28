package Pieces;
import logic.Piece;

import javax.imageio.ImageIO;
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
        try {
            return ImageIO.read(new File("assets/Chess_pieces/bp.png"));
        } catch (IOException ex) {
            throw ex;
        }
    }
}
