package logic;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
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

    public String getFileName() {
        return null;
    }

    /**
     * first instance of attempt at loading the image of a black pawn from the assets folder
     * very static still
     *
     * intended to only call for graphic but never store for the actual algorithm
     * @return returns the image as a BufferedImage
     * @throws IOException if file wasn't found or couldn't correctly load
     */
    public BufferedImage getImage() throws IOException {
        BufferedImage img = ImageIO.read(new File("assets/Chess_pieces/" + this.getFileName()));
        // return resize(img, 64, 64);          // bad runtime, change ^pathname^ if playing around with it
        return img;
    }

    /**
     * function to resize any png so that a varying board size can be accounted for
     *
     * currently very bad runtime when trying to render board
     * @param img Image to be resized
     * @param newW new Width
     * @param newH new Hight
     * @return resized Image
     */
    public static BufferedImage resize(BufferedImage img, int newW, int newH) {
        Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
        BufferedImage dimg = new BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = dimg.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();

        return dimg;
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
