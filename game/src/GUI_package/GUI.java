package GUI_package;

import logic.Board;

import javax.swing.*;

/**
 * starter for each chess Game
 * can draw an empty board without pieces
 */
public class GUI extends JFrame{

    // constructor
    public GUI(Board board) {
        super("Chess");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel panel = new Panel(board);

        add(panel);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
