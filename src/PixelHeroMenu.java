/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rocco, Suchana, Cheliyan
 */
public class PixelHeroMenu extends javax.swing.JFrame {

    /**
     * Creates new form PixelHeroMenu
     */
    public PixelHeroMenu() {
        initComponents();
        setLocationRelativeTo(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBackPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();
        btnCredits = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        lblFireDemon = new javax.swing.JLabel();
        lblHero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        menuBackPanel.setBackground(new java.awt.Color(153, 204, 255));
        menuBackPanel.setPreferredSize(new java.awt.Dimension(1000, 720));
        menuBackPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        lblTitle.setText("Pixel Hero");
        menuBackPanel.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        btnPlay.setBackground(new java.awt.Color(255, 204, 102));
        btnPlay.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnPlay.setText("Play Game");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        menuBackPanel.add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 300, -1));

        btnCredits.setBackground(new java.awt.Color(255, 204, 102));
        btnCredits.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnCredits.setText("Credits");
        btnCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditsActionPerformed(evt);
            }
        });
        menuBackPanel.add(btnCredits, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 300, -1));

        btnQuit.setBackground(new java.awt.Color(255, 204, 102));
        btnQuit.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnQuit.setText("Quit");
        btnQuit.setActionCommand("Credits");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        menuBackPanel.add(btnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 300, -1));

        lblFireDemon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fire Demon.png"))); // NOI18N
        menuBackPanel.add(lblFireDemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 350, 410));

        lblHero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hero.png"))); // NOI18N
        menuBackPanel.add(lblHero, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, 450, 390, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuBackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuBackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        //Quitting the game
        System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        //Switching from menu to enemy selection:
        new EnemySelectionScreen().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditsActionPerformed
        //Going to credits
        new CreditsScreen().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCreditsActionPerformed

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
            java.util.logging.Logger.getLogger(PixelHeroMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PixelHeroMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PixelHeroMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PixelHeroMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PixelHeroMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCredits;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnQuit;
    private javax.swing.JLabel lblFireDemon;
    private javax.swing.JLabel lblHero;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel menuBackPanel;
    // End of variables declaration//GEN-END:variables
}
