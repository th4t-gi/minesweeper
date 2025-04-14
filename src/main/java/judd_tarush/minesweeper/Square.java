/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package judd_tarush.minesweeper;
import javax.swing.*;

/**
 *
 * @author braujudd
 */
public class Square extends JButton {

    private final int ROW;
    private final int COL;
    private final boolean ISMINE;
    
    private boolean revealed = false;
    private boolean isMarked = false;
    private int neighboringMines;
    private Grid grid;
    
    /**
     * Creates new form Square
     */
    public Square(int row, int col, Grid grid, boolean isMine) {
        this.ROW = row;
        this.COL = col;
        this.ISMINE = isMine;
        this.grid = grid;
        
        //calculate neighbors
        this.neighboringMines = 0;
        
        initComponents();
    }
    
    public boolean isMine() {
        return this.ISMINE;
    }
  
    
    public void reveal() {
        if (this.ISMINE) {
            //game over
        }
        
        if (this.revealed) {
            return;
        }
        
        if (this.neighboringMines == 0) {
            //reveal neighbors
            for (int i = this.ROW-1; i <= row+1; i++) {
                for (int j = col-1; j <=col+1; j++) {
                    Square s = this.grid.getSquare(i, j);
                    if (s != null && !s.isRevealed()) {
                        this.grid.getSquare(i, j).reveal();
                    }
                }
            }        
        } else {
            this.revealed = true;
        }
    }
    
    public void onRightClick() {
        this.isMarked = true;
    }
    
    public boolean isRevealed() {
        return this.revealed;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout());

        jPanel2.setLayout(new java.awt.GridLayout(6, 6));

        jButton1.setText("jButton1");
        jPanel2.add(jButton1);

        jButton2.setText("jButton2");
        jPanel2.add(jButton2);

        jButton3.setText("jButton3");
        jPanel2.add(jButton3);

        jButton4.setText("jButton4");
        jPanel2.add(jButton4);

        jButton5.setText("jButton5");
        jPanel2.add(jButton5);

        jButton6.setText("jButton5");
        jPanel2.add(jButton6);

        jButton7.setText("jButton5");
        jPanel2.add(jButton7);

        jButton8.setText("jButton5");
        jPanel2.add(jButton8);

        jButton9.setText("jButton5");
        jPanel2.add(jButton9);

        jButton10.setText("jButton5");
        jPanel2.add(jButton10);

        jButton11.setText("jButton5");
        jPanel2.add(jButton11);

        jButton12.setText("jButton5");
        jPanel2.add(jButton12);

        jButton13.setText("jButton5");
        jPanel2.add(jButton13);

        jButton14.setText("jButton5");
        jPanel2.add(jButton14);

        jButton15.setText("jButton5");
        jPanel2.add(jButton15);

        jButton16.setText("jButton5");
        jPanel2.add(jButton16);

        jButton17.setText("jButton5");
        jPanel2.add(jButton17);

        jButton18.setText("jButton5");
        jPanel2.add(jButton18);

        jButton19.setText("jButton5");
        jPanel2.add(jButton19);

        jButton20.setText("jButton5");
        jPanel2.add(jButton20);

        jButton21.setText("jButton5");
        jPanel2.add(jButton21);

        jButton22.setText("jButton5");
        jPanel2.add(jButton22);

        jButton23.setText("jButton5");
        jPanel2.add(jButton23);

        jButton24.setText("jButton5");
        jPanel2.add(jButton24);

        jButton25.setText("jButton5");
        jPanel2.add(jButton25);

        jButton26.setText("jButton5");
        jPanel2.add(jButton26);

        jButton27.setText("jButton5");
        jPanel2.add(jButton27);

        jButton28.setText("jButton5");
        jPanel2.add(jButton28);

        jButton29.setText("jButton5");
        jPanel2.add(jButton29);

        jButton30.setText("jButton5");
        jPanel2.add(jButton30);

        jButton31.setText("jButton5");
        jPanel2.add(jButton31);

        jButton32.setText("jButton5");
        jPanel2.add(jButton32);

        jButton33.setText("jButton5");
        jPanel2.add(jButton33);

        jButton34.setText("jButton5");
        jPanel2.add(jButton34);

        jButton35.setText("jButton5");
        jPanel2.add(jButton35);

        jButton36.setText("jButton5");
        jPanel2.add(jButton36);

        jButton37.setText("jButton5");
        jPanel2.add(jButton37);

        jButton38.setText("jButton5");
        jPanel2.add(jButton38);

        jButton39.setText("jButton5");
        jPanel2.add(jButton39);

        jButton40.setText("jButton5");
        jPanel2.add(jButton40);

        jButton41.setText("jButton5");
        jPanel2.add(jButton41);

        jButton42.setText("jButton5");
        jPanel2.add(jButton42);

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Square.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Square.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Square.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Square.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Square().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
