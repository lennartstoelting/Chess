package GUI_package;
import logic.Board;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/**
 * class for JPanel
 * sets size of panel
 * in paint Components, draws each thing after the other
 *
 * ActionListener and KeyListener are to be implemented because they need overrides in order to know how to react
 */
public class Panel extends JPanel implements ActionListener, KeyListener {

    private int tileSize = 64;
    public Board boardLayout;

    public Panel() {
        setPreferredSize(new Dimension(tileSize * 10, tileSize * 10));
        setBackground(Color.black);
    }

    public Panel(Board board) {
        setPreferredSize(new Dimension(tileSize * 10, tileSize * 10));
        setBackground(Color.black);
        boardLayout = board;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Tiles tiles = new Tiles(g);
        tiles.drawBlankTiles(tileSize);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
