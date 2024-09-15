
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rocco, Suchana, Cheliyan
 */
public class VictoryScreen extends javax.swing.JFrame {

    /**
     * Creates new form VictoryScreen
     */
    public VictoryScreen() {
        initComponents();
        setLocationRelativeTo(this);
        //playVictoryMusic("src\\wav\\5.Reach Out To The Truth -inst vesion-(P4).wav");
    }
    
     /**
     * Plays victory music
     * Pre: None 
     * Post: Plays victory music
     */
    public void playVictoryMusic(String musicLocation){
         try{
            File musicPath = new File(musicLocation); 
             
            if(musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);    
            }
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
         }
    }//end playDefateMusic

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        youWinBackPanel = new javax.swing.JPanel();
        lblYouWin = new javax.swing.JLabel();
        btnReturnEnemySelection = new javax.swing.JButton();
        btnReturnMenu = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        youWinBackPanel.setBackground(new java.awt.Color(153, 204, 255));
        youWinBackPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblYouWin.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblYouWin.setText("You Win!");
        youWinBackPanel.add(lblYouWin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        btnReturnEnemySelection.setBackground(new java.awt.Color(255, 204, 102));
        btnReturnEnemySelection.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnReturnEnemySelection.setText("Return To Enemy Selection");
        btnReturnEnemySelection.setActionCommand("Return To Enemy Selection");
        btnReturnEnemySelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnEnemySelectionActionPerformed(evt);
            }
        });
        youWinBackPanel.add(btnReturnEnemySelection, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        btnReturnMenu.setBackground(new java.awt.Color(255, 204, 102));
        btnReturnMenu.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnReturnMenu.setText("Return To Menu");
        btnReturnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnMenuActionPerformed(evt);
            }
        });
        youWinBackPanel.add(btnReturnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        btnQuit.setBackground(new java.awt.Color(255, 204, 102));
        btnQuit.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        youWinBackPanel.add(btnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(youWinBackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(youWinBackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        //Quit the game
        System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnReturnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnMenuActionPerformed
        //Returns player to the main menu
        new PixelHeroMenu().setVisible(true);
        this.setVisible(false);
        clip.stop();
    }//GEN-LAST:event_btnReturnMenuActionPerformed

    private void btnReturnEnemySelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnEnemySelectionActionPerformed
        //Returns to enemy selection menu
        new EnemySelectionScreen().setVisible(true);
        this.setVisible(false);
        clip.stop();    
    }//GEN-LAST:event_btnReturnEnemySelectionActionPerformed

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
            java.util.logging.Logger.getLogger(VictoryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VictoryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VictoryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VictoryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VictoryScreen().setVisible(true);
            }
        });
    }
    
    Clip clip;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnReturnEnemySelection;
    private javax.swing.JButton btnReturnMenu;
    private javax.swing.JLabel lblYouWin;
    private javax.swing.JPanel youWinBackPanel;
    // End of variables declaration//GEN-END:variables
}
