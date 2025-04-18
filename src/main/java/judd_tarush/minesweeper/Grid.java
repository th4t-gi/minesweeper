/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package judd_tarush.minesweeper;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author braujudd
 */
public class Grid extends JFrame {
    private int rows = 0;
    private int cols = 0;
    private javax.swing.JPanel pane;
    Square[][] grid;

    
    public Grid(int rows, int cols, int mines) {
        super();
        this.rows = rows;
        this.cols = cols;
//        = new Square[this.rows][this.cols];
        this.initSquares();
    }
    
    public void initSquares() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        pane = new JPanel();
        
        pane.setLayout(new GridLayout(6, 6, 1,1));
        
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
//                grid[i][j] = new Square(i, j, false);
                
                pane.add(grid[i][j]);
            }
        }
        
    }
    
    public int getRows() {
        return this.rows;
    }
    
    public int getCols() {
        return this.cols;
    }
    
    public Square getSquare(int i, int j) {
        if (i < 0 || i >= this.rows || j < 0 || j >= this.cols) {
            return null;
        }
        
        return this.grid[i][j];
    }

}