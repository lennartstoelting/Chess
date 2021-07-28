package GUI_package;

import logic.Board;

import javax.swing.*;

/**
 * starter for each chess Game
 * can draw an empty board without pieces
 */
public class GUI {

    public String nameOfGame = "Schach";

    // constructor
    public GUI() {
    }

    /**
     * creates the Frame for empty Board with all customizations to a frame
     * and creates a new Panel to draw in
     */
    public void drawEmptyBoard() {
        JFrame frame = new JFrame(nameOfGame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel panel = new Panel();

        frame.add(panel);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * initializes the drawing of a board that is passed
     * @param board
     */
    public void drawFilledBoard(Board board) {
        JFrame frame = new JFrame(nameOfGame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel panel = new Panel(board);

        frame.add(panel);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
