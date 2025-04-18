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
public class Minesweeper extends JFrame {
    public JFrame mainFrame;
    
    public static void main(String[] args){
      Minesweeper app = new Minesweeper();  
      
      EventQueue.invokeLater(() -> {
          app.mainFrame.setVisible(true);
      });
   }

    public Minesweeper() {
        this.initComponents();
    }
    
    private void initComponents() {
        mainFrame = new JFrame("Mindsweeper");
        
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }
}


