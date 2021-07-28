package logic;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * general Piece
 * always has attribute white or black
 */
public abstract class Piece {

    public boolean white;
    private BufferedImage Image;

    public Piece(boolean white) {
        this.white = white;
    }

    private void loadImage() {
        try {
            if (!white) {
                Image = ImageIO.read(new File("assets/Chess_pieces/bp.jpg"));
            }
        } catch (IOException exc) {
            System.out.println("Error opening image file: " + exc.getMessage());
        }
    }

    /**
     * just for nicer debugging, doesn't have a purpose
     * returns bK for black King and wN for white Knight (this case has to be made because of the same starting letters)
     * @return good looking description of Piece
     */
    @Override
    public String toString() {
        Class<?> enclosingClass = getClass().getEnclosingClass();
        String tmp;
        if (enclosingClass != null) {
            tmp = enclosingClass.getName().replace("Pieces.","").substring(0, 1);
        } else if (getClass().getName().equals("Pieces.Knight")) {
            tmp = "N";
        } else {
            tmp = getClass().getName().replace("Pieces.", "").substring(0, 1);
        }
        if (white) return "w" + tmp;
        else return "b" + tmp;
    }
}
