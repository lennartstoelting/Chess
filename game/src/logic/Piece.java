package logic;

import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * general Piece
 * always has attribute white or black
 */
public abstract class Piece {

    public boolean white;

    public Piece(boolean white) {
        this.white = white;
    }

    /**
     * standard getImg() for the individual pieces to override
     */
    public BufferedImage getImg() throws IOException {
        return null;
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
