package Pieces;
import logic.Piece;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Pawn extends Piece {

    private BufferedImage pawnImage;

    public Pawn(boolean white) {
        super(white);
    }

    private void loadImage() {
        try {
            if (!white) {
                pawnImage = ImageIO.read(new File("assets/Chess_pieces/bp.jpg"));
            }
        } catch (IOException exc) {
            System.out.println("Error opening image file: " + exc.getMessage());
        }
    }
}
