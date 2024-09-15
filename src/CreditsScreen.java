
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rocco, Suchana, Cheliyan
 */
public class CreditsScreen extends javax.swing.JFrame {

    /**
     * Creates new form CreditsScreen
     */
    public CreditsScreen() {
        //setting up the credits screen 
        initComponents();
        showPanel();
        setLocationRelativeTo(this);
        pnlCreditsGameMakers.setVisible(false);
        pnlCreditsSong.setVisible(false);
       
    }
    
    
    /**
     * Delays the showing of the credits game maker panel and picture credits .
     * Pre: None
     * Post: After showing the song credits, waits 5 seconds then shows the creators credit screen.
     */
    public void showPanel(){         
        delay1 = new Timer(2500, new ActionListener(){
           
                @Override
                public void actionPerformed(ActionEvent e){
                    //Shows the panel then dissapers 
                    pnlCreditsSong.setVisible(true);
                    pnlCreditsPictures.setVisible(false);
                    delay1.stop();
                }
        });
        delay1.start();
            
        delay2 = new Timer(5000, new ActionListener(){
           
                @Override
                public void actionPerformed(ActionEvent e){
                    //Shows the panel then dissapear
                    pnlCreditsGameMakers.setVisible(true);
                    delay2.stop();
                }
        });
        delay2.start();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCreditsPictures = new javax.swing.JPanel();
        lblPicturesTitle = new javax.swing.JLabel();
        lblCreditsTitlePictures = new javax.swing.JLabel();
        lblDungeon = new javax.swing.JLabel();
        lblDungeonLink1 = new javax.swing.JLabel();
        lblDungeonLink2 = new javax.swing.JLabel();
        lblEnemyKnight = new javax.swing.JLabel();
        lblKnightLink = new javax.swing.JLabel();
        lblEnemyRagnarok = new javax.swing.JLabel();
        lblRagnarokLink = new javax.swing.JLabel();
        lblFireDemon = new javax.swing.JLabel();
        lblFireDemonLink = new javax.swing.JLabel();
        lblHero = new javax.swing.JLabel();
        lblArtist = new javax.swing.JLabel();
        pnlCreditsSong = new javax.swing.JPanel();
        lblCreditsTitleSong = new javax.swing.JLabel();
        lblSongs = new javax.swing.JLabel();
        lblWhosThereTitle = new javax.swing.JLabel();
        lblWhosThereDesc = new javax.swing.JLabel();
        lblWhosThereDesc2 = new javax.swing.JLabel();
        lblReachOutToTheTruthTitle = new javax.swing.JLabel();
        lblReachOutToTheTruthDesc = new javax.swing.JLabel();
        lblReachOutToTheTruthDesc2 = new javax.swing.JLabel();
        lblReachOutToTheTruthDesc3 = new javax.swing.JLabel();
        lblTimeToMakeHistoryTitle = new javax.swing.JLabel();
        lblTimeToMakeHistoryDesc = new javax.swing.JLabel();
        lblTimeToMakeHistoryDesc2 = new javax.swing.JLabel();
        lblTimeToMakeHistoryDesc3 = new javax.swing.JLabel();
        pnlCreditsGameMakers = new javax.swing.JPanel();
        lblCreditsGameMaker = new javax.swing.JLabel();
        lblRoccoFernandoName = new javax.swing.JLabel();
        lblCheliyanName = new javax.swing.JLabel();
        lblSuchanaName = new javax.swing.JLabel();
        lblCreators = new javax.swing.JLabel();
        lblDescription1 = new javax.swing.JLabel();
        lblDescription2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlCreditsPictures.setBackground(new java.awt.Color(153, 204, 255));
        pnlCreditsPictures.setMinimumSize(new java.awt.Dimension(1000, 690));
        pnlCreditsPictures.setPreferredSize(new java.awt.Dimension(1000, 720));
        pnlCreditsPictures.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPicturesTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblPicturesTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPicturesTitle.setText("Pictures:");
        pnlCreditsPictures.add(lblPicturesTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 220, 40));

        lblCreditsTitlePictures.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblCreditsTitlePictures.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreditsTitlePictures.setText("Credits");
        pnlCreditsPictures.add(lblCreditsTitlePictures, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 180, 40));

        lblDungeon.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDungeon.setText("Dungeon Background:  ");
        pnlCreditsPictures.add(lblDungeon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 320, 60));

        lblDungeonLink1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDungeonLink1.setText("https://www.123rf.com/photo_110106214_interface-8-bit-game-pixel-art-platformer-mobile-and");
        pnlCreditsPictures.add(lblDungeonLink1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 920, 30));

        lblDungeonLink2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDungeonLink2.setText("-desktop-version-appearance-of-level-in-dark-dun.html?vti=novnyth0zxtak7n33a-1-2");
        pnlCreditsPictures.add(lblDungeonLink2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 920, 20));

        lblEnemyKnight.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblEnemyKnight.setText("Enemy Knight: ");
        pnlCreditsPictures.add(lblEnemyKnight, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 320, 30));

        lblKnightLink.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblKnightLink.setText("https://www.cleanpng.com/png-dungeon-boss-pixel-dungeon-pixel-art-pixel-889967/");
        pnlCreditsPictures.add(lblKnightLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 920, 30));

        lblEnemyRagnarok.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblEnemyRagnarok.setText("Enemy Ragnarok:");
        pnlCreditsPictures.add(lblEnemyRagnarok, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 320, 30));

        lblRagnarokLink.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRagnarokLink.setText("https://imgbin.com/png/6cz5v3ZY/dungeon-crawl-pixel-dungeon-boss-pixel-art-png");
        pnlCreditsPictures.add(lblRagnarokLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 920, 30));

        lblFireDemon.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblFireDemon.setText("Enemy Fire Demon: ");
        pnlCreditsPictures.add(lblFireDemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 320, 30));

        lblFireDemonLink.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFireDemonLink.setText("https://www.pngkey.com/maxpic/u2q8r5q8o0a9w7w7/");
        pnlCreditsPictures.add(lblFireDemonLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 920, 30));

        lblHero.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHero.setText("Hero: ");
        pnlCreditsPictures.add(lblHero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 320, 30));

        lblArtist.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblArtist.setText("By: Suchana Regmi ");
        pnlCreditsPictures.add(lblArtist, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 920, 30));

        pnlCreditsSong.setBackground(new java.awt.Color(153, 204, 255));
        pnlCreditsSong.setPreferredSize(new java.awt.Dimension(1000, 720));
        pnlCreditsSong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCreditsTitleSong.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblCreditsTitleSong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreditsTitleSong.setText("Credits");
        pnlCreditsSong.add(lblCreditsTitleSong, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 190, 40));

        lblSongs.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblSongs.setText("Songs: ");
        pnlCreditsSong.add(lblSongs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 220, 60));

        lblWhosThereTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblWhosThereTitle.setText("1. Who's There?");
        pnlCreditsSong.add(lblWhosThereTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 220, 60));

        lblWhosThereDesc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblWhosThereDesc.setText("Album: Persona 4 Golden (Steam) Digital Deluxe Soundtrack");
        pnlCreditsSong.add(lblWhosThereDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 560, 20));

        lblWhosThereDesc2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblWhosThereDesc2.setText("Composed & Arranged By: Shoji Meguro ");
        pnlCreditsSong.add(lblWhosThereDesc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        lblReachOutToTheTruthTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblReachOutToTheTruthTitle.setText("2. Reach Out to the Truth -inst version-  ");
        pnlCreditsSong.add(lblReachOutToTheTruthTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 490, 60));

        lblReachOutToTheTruthDesc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblReachOutToTheTruthDesc.setText("Album: Persona 4 Golden (Steam) Digital Deluxe Soundtrack ");
        pnlCreditsSong.add(lblReachOutToTheTruthDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 570, 20));

        lblReachOutToTheTruthDesc2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblReachOutToTheTruthDesc2.setText("Composed & Arranged By: Shoji Meguro");
        pnlCreditsSong.add(lblReachOutToTheTruthDesc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        lblReachOutToTheTruthDesc3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblReachOutToTheTruthDesc3.setText("Performed By: Shihoko Hirata");
        pnlCreditsSong.add(lblReachOutToTheTruthDesc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        lblTimeToMakeHistoryTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTimeToMakeHistoryTitle.setText("3. Time to Make History");
        pnlCreditsSong.add(lblTimeToMakeHistoryTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 310, 60));

        lblTimeToMakeHistoryDesc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTimeToMakeHistoryDesc.setText("Album: Persona 4 Golden (Steam) Digital Deluxe Soundtrack ");
        pnlCreditsSong.add(lblTimeToMakeHistoryDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 560, 20));

        lblTimeToMakeHistoryDesc2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTimeToMakeHistoryDesc2.setText("Composed & Arranged By: Shoji Meguro");
        pnlCreditsSong.add(lblTimeToMakeHistoryDesc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, -1, -1));

        lblTimeToMakeHistoryDesc3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTimeToMakeHistoryDesc3.setText("Performed By: Shihoko Hirata");
        pnlCreditsSong.add(lblTimeToMakeHistoryDesc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, -1, -1));

        pnlCreditsGameMakers.setBackground(new java.awt.Color(153, 204, 255));
        pnlCreditsGameMakers.setPreferredSize(new java.awt.Dimension(1000, 720));
        pnlCreditsGameMakers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCreditsGameMaker.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblCreditsGameMaker.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreditsGameMaker.setText("Credits");
        pnlCreditsGameMakers.add(lblCreditsGameMaker, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 220, 40));

        lblRoccoFernandoName.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblRoccoFernandoName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRoccoFernandoName.setText(" Rocco Fernando Gadista");
        pnlCreditsGameMakers.add(lblRoccoFernandoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 550, 60));

        lblCheliyanName.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblCheliyanName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCheliyanName.setText(" Cheliyan Sabesan ");
        pnlCreditsGameMakers.add(lblCheliyanName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 400, 60));

        lblSuchanaName.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblSuchanaName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSuchanaName.setText(" Suchana Regmi");
        pnlCreditsGameMakers.add(lblSuchanaName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 310, 60));

        lblCreators.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblCreators.setText("Creators: ");
        pnlCreditsGameMakers.add(lblCreators, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 220, 60));

        lblDescription1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblDescription1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription1.setText("*Our game is based on the game Persona 4 ");
        pnlCreditsGameMakers.add(lblDescription1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 850, 60));

        lblDescription2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblDescription2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription2.setText("and Pokémon*");
        pnlCreditsGameMakers.add(lblDescription2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, 280, 60));

        btnExit.setBackground(new java.awt.Color(255, 204, 102));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnExit.setText("X");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        pnlCreditsGameMakers.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 20, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCreditsSong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlCreditsPictures, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlCreditsGameMakers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCreditsSong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlCreditsPictures, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlCreditsGameMakers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        //takes player back to main menu
        new PixelHeroMenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(CreditsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreditsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreditsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreditsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreditsScreen().setVisible(true);
            }
        });
    }
    Timer delay1, delay2;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel lblArtist;
    private javax.swing.JLabel lblCheliyanName;
    private javax.swing.JLabel lblCreators;
    private javax.swing.JLabel lblCreditsGameMaker;
    private javax.swing.JLabel lblCreditsTitlePictures;
    private javax.swing.JLabel lblCreditsTitleSong;
    private javax.swing.JLabel lblDescription1;
    private javax.swing.JLabel lblDescription2;
    private javax.swing.JLabel lblDungeon;
    private javax.swing.JLabel lblDungeonLink1;
    private javax.swing.JLabel lblDungeonLink2;
    private javax.swing.JLabel lblEnemyKnight;
    private javax.swing.JLabel lblEnemyRagnarok;
    private javax.swing.JLabel lblFireDemon;
    private javax.swing.JLabel lblFireDemonLink;
    private javax.swing.JLabel lblHero;
    private javax.swing.JLabel lblKnightLink;
    private javax.swing.JLabel lblPicturesTitle;
    private javax.swing.JLabel lblRagnarokLink;
    private javax.swing.JLabel lblReachOutToTheTruthDesc;
    private javax.swing.JLabel lblReachOutToTheTruthDesc2;
    private javax.swing.JLabel lblReachOutToTheTruthDesc3;
    private javax.swing.JLabel lblReachOutToTheTruthTitle;
    private javax.swing.JLabel lblRoccoFernandoName;
    private javax.swing.JLabel lblSongs;
    private javax.swing.JLabel lblSuchanaName;
    private javax.swing.JLabel lblTimeToMakeHistoryDesc;
    private javax.swing.JLabel lblTimeToMakeHistoryDesc2;
    private javax.swing.JLabel lblTimeToMakeHistoryDesc3;
    private javax.swing.JLabel lblTimeToMakeHistoryTitle;
    private javax.swing.JLabel lblWhosThereDesc;
    private javax.swing.JLabel lblWhosThereDesc2;
    private javax.swing.JLabel lblWhosThereTitle;
    private javax.swing.JPanel pnlCreditsGameMakers;
    private javax.swing.JPanel pnlCreditsPictures;
    private javax.swing.JPanel pnlCreditsSong;
    // End of variables declaration//GEN-END:variables
}
