/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package judd_tarush.minesweeper;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author braujudd
 */
public class Square extends JButton {

    private final int ROW;
    private final int COL;
    private boolean ISMINE;
    
    private boolean revealed = false;
    private boolean isMarked = false;
    private int neighboringMines;
    private GridForm grid;
    
    /**
     * Creates new form Square
     */
    public Square(int row, int col, GridForm grid, boolean isMine) {
        this.ROW = row;
        this.COL = col;
        this.ISMINE = isMine;
        this.grid = grid;
        
        this.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        
        //calculate neighbors
        this.neighboringMines = 0;
        
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                Square s = (Square) evt.getComponent();

                if (SwingUtilities.isRightMouseButton(evt)) {
                    //marking square as a bomb
                    if(s.isMarked) {
                        s.setBorder(BorderFactory.createRaisedSoftBevelBorder());
                        s.setText("");
                        grid.setMineCounter(1);
                    } else {
                        s.setBorder(BorderFactory.createLineBorder(Color.black, 1));
                        s.setMarked();
                        s.setText("⚑");
                        grid.setMineCounter(-1);
                    }
                } else if (SwingUtilities.isLeftMouseButton(evt)) {
                    //reveal
                    s.reveal();
                    System.out.println("I am " + s.isMine() + " " + s.getRow() + s.getCol());
                    
                }
                
            }
        });
        
    }
    
    public boolean isMine() {
        return this.ISMINE;
    }
    
    public void setMine() {
        this.ISMINE = true;
    }
    
    public void setMarked() {
        this.isMarked = true;
    }
    
    public int getRow() {
        return this.ROW;
    }
    
    public int getCol() {
        return this.COL;
    }
    
    public int getNeighboringMines() {
        return this.neighboringMines;
    }
    
    public void setNeighbouringMines() {
        for (int i = this.ROW - 1; i <= this.ROW + 1; i++) {
            for (int j = this.COL - 1; j <= this.COL + 1; j++) {
                Square s = grid.getSquare(i, j);
                if(s != null && s.isMine())
                    this.neighboringMines++;
            }
        }
    }
  
    
    public void reveal() {
        if (this.ISMINE) {
            //game over
            int r = JOptionPane.showConfirmDialog(this, "Uh Oh! You loose", "Game Over", JOptionPane.DEFAULT_OPTION);
            System.out.println("" + r);
            
            MinesweeperForm mp = new MinesweeperForm();
            mp.setVisible(true);
            this.grid.setVisible(false);
        } else if (this.revealed) {
            return;
        }
        
        this.revealed = true;
        this.setText("" + this.neighboringMines);

        //reveal neighbors
        for (int i = this.ROW - 1; i <= this.ROW + 1; i++) {
            for (int j = this.COL - 1; j <= this.COL + 1; j++) {
                Square s = this.grid.getSquare(i, j);

                if ( s != null && s.getNeighboringMines() == 0) {
                    s.reveal();
                } else if (this.getNeighboringMines() == 0 && s != null && !s.isRevealed()) {
                    s.reveal();
                }
            }
        }

    }
    
    
    public boolean isRevealed() {
        return this.revealed;
    }
    
    

}
