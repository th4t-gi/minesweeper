/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package judd_tarush.minesweeper;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author braujudd
 */
public class Minesweeper {

    public static void main(String[] args) {
        int rows = 6;
        int cols = 6;
        
        EventQueue.invokeLater(() -> {
            new Grid(rows, cols).setVisible(true);
        });
    }
}

public class Grid extends JFrame {
    int rows = 0;
    int cols = 0;
    private javax.swing.JPanel pane;
    Square[][] grid;

    
    public Grid(int rows, int cols) {
        super();
        this.rows = rows;
        this.cols = cols;
        = new Square[this.rows][this.cols];
        this.initSquares();
    }
    
    public void initSquares() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        pane = new JPanel();
        
        pane.setLayout(new GridLayout(6, 6, 1,1));
        
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                grid[i][j] = new Square(i, j, false);
                
                pane.add(grid[i][j]);
            }
        }
        
        pane.get
        
        layout.
        
    }
    

}

public class Square extends JButton {
    
    public Square(int i, int j, boolean isMine) {
        
    }
}