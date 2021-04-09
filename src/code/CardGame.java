
package code;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class CardGame extends javax.swing.JFrame {

    CardDeck bookmaker[] = CardDeck.generateHand();
    CardDeck punter[] = CardDeck.generateHand();
    
    int sumBM = 0, sumP = 0;
    String winnerText;
   
    public CardGame() {
        initComponents();
        button1.setEnabled(true);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        button10.setEnabled(false);
    }
    
    public void getImage1(){
        ImageIcon cardImage = new ImageIcon(getClass().getResource("..\\card_images\\" + bookmaker[0].getCard().getName() + bookmaker[0].getSuit().getName() + ".png"));
        bm1.setIcon(cardImage);
    }
    
    public void getImage2(){
        ImageIcon cardImage = new ImageIcon(getClass().getResource("..\\card_images\\" + bookmaker[1].getCard().getName() + bookmaker[1].getSuit().getName() + ".png"));
        bm2.setIcon(cardImage);
    }
    
    public void getImage3(){
        ImageIcon cardImage = new ImageIcon(getClass().getResource("..\\card_images\\" + bookmaker[2].getCard().getName() + bookmaker[2].getSuit().getName() + ".png"));
        bm3.setIcon(cardImage);
    }
    
    public void getImage4(){
        ImageIcon cardImage = new ImageIcon(getClass().getResource("..\\card_images\\" + bookmaker[3].getCard().getName() + bookmaker[3].getSuit().getName() + ".png"));
        bm4.setIcon(cardImage);
    }
    
    public void getImage5(){
        ImageIcon cardImage = new ImageIcon(getClass().getResource("..\\card_images\\" + bookmaker[4].getCard().getName() + bookmaker[4].getSuit().getName() + ".png"));
        bm5.setIcon(cardImage);
    }
    
    public void getImage6(){
        ImageIcon cardImage = new ImageIcon(getClass().getResource("..\\card_images\\" + punter[0].getCard().getName() + punter[0].getSuit().getName() + ".png"));
        pun1.setIcon(cardImage);
    }
    
    public void getImage7(){
        ImageIcon cardImage = new ImageIcon(getClass().getResource("..\\card_images\\" + punter[1].getCard().getName() + punter[1].getSuit().getName() + ".png"));
        pun2.setIcon(cardImage);
    }
    
    public void getImage8(){
        ImageIcon cardImage = new ImageIcon(getClass().getResource("..\\card_images\\" + punter[2].getCard().getName() + punter[2].getSuit().getName() + ".png"));
        pun3.setIcon(cardImage);
    }
    
    public void getImage9(){
        ImageIcon cardImage = new ImageIcon(getClass().getResource("..\\card_images\\" + punter[3].getCard().getName() + punter[3].getSuit().getName() + ".png"));
        pun4.setIcon(cardImage);
    }
    
    public void getImage10(){
        ImageIcon cardImage = new ImageIcon(getClass().getResource("..\\card_images\\" + punter[4].getCard().getName() + punter[4].getSuit().getName() + ".png"));
        pun5.setIcon(cardImage);
    }
    
    public void sumPoints1(){
        if (bookmaker[0].getCard().getPoints() > punter[0].getCard().getPoints()){
            sumBM = bookmaker[0].getCard().getPoints() + punter[0].getCard().getPoints() + sumBM;
            PointsBM.setText(Integer.toString(sumBM));
        }else if(bookmaker[0].getCard().getPoints() < punter[0].getCard().getPoints()){
            sumP = bookmaker[0].getCard().getPoints() + punter[0].getCard().getPoints() + sumP;
            PointsP.setText(Integer.toString(sumP));
        }else{
            
        }
    }
    
    public void sumPoints2(){
        if (bookmaker[1].getCard().getPoints() > punter[1].getCard().getPoints()){
            sumBM = bookmaker[1].getCard().getPoints() + punter[1].getCard().getPoints() + sumBM;
            PointsBM.setText(Integer.toString(sumBM));
        }else if(bookmaker[1].getCard().getPoints() < punter[1].getCard().getPoints()){
            sumP = bookmaker[1].getCard().getPoints() + punter[1].getCard().getPoints() + sumP;
            PointsP.setText(Integer.toString(sumP));
        }else{
            
        }
    }
    
    public void sumPoints3(){
        if (bookmaker[2].getCard().getPoints() > punter[2].getCard().getPoints()){
            sumBM = bookmaker[2].getCard().getPoints() + punter[2].getCard().getPoints() + sumBM;
            PointsBM.setText(Integer.toString(sumBM));
        }else if(bookmaker[2].getCard().getPoints() < punter[2].getCard().getPoints()){
            sumP = bookmaker[2].getCard().getPoints() + punter[2].getCard().getPoints() + sumP;
            PointsP.setText(Integer.toString(sumP));
        }else{
            
        }
    }
    
    public void sumPoints4(){
        if (bookmaker[3].getCard().getPoints() > punter[3].getCard().getPoints()){
            sumBM = bookmaker[3].getCard().getPoints() + punter[3].getCard().getPoints() + sumBM;
            PointsBM.setText(Integer.toString(sumBM));
        }else if(bookmaker[3].getCard().getPoints() < punter[3].getCard().getPoints()){
            sumP = bookmaker[3].getCard().getPoints() + punter[3].getCard().getPoints() + sumP;
            PointsP.setText(Integer.toString(sumP));
        }else{
            
        }
    }
    
    public void sumPoints5(){
        if (bookmaker[4].getCard().getPoints() > punter[4].getCard().getPoints()){
            sumBM = bookmaker[4].getCard().getPoints() + punter[4].getCard().getPoints() + sumBM;
            PointsBM.setText(Integer.toString(sumBM));
        }else if(bookmaker[4].getCard().getPoints() < punter[4].getCard().getPoints()){
            sumP = bookmaker[4].getCard().getPoints() + punter[4].getCard().getPoints() + sumP;
            PointsP.setText(Integer.toString(sumP));
        }else{
            
        }
    }
    
    public void winner(){
        if(sumBM > sumP){
            winnerText = "The Bookmaker wins!";
        }else if (sumBM < sumP) {
            winnerText = "The Punter wins!";
        } else {
            winnerText = "Draw!";
        }
        JOptionPane.showMessageDialog(null, winnerText);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bm1 = new javax.swing.JLabel();
        pun1 = new javax.swing.JLabel();
        bm2 = new javax.swing.JLabel();
        pun2 = new javax.swing.JLabel();
        bm3 = new javax.swing.JLabel();
        pun3 = new javax.swing.JLabel();
        bm4 = new javax.swing.JLabel();
        pun4 = new javax.swing.JLabel();
        bm5 = new javax.swing.JLabel();
        pun5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button10 = new javax.swing.JButton();
        PointsBM = new javax.swing.JLabel();
        PointsP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel11.setText("Bookmaker points:");

        jLabel12.setText("Punter points:");

        button1.setText("Show Card");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setText("Show Card");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setText("Show Card");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setText("Show Card");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setText("Show Card");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setText("Show Card");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button7.setText("Show Card");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setText("Show Card");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button9.setText("Show Card");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        button10.setText("Show Card");
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });

        PointsBM.setText("0");

        PointsP.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bm1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bm2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bm3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bm4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button5)
                            .addComponent(bm5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pun1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pun2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pun3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pun4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button10)
                            .addComponent(pun5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PointsBM)
                    .addComponent(PointsP))
                .addContainerGap(489, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1)
                    .addComponent(button2)
                    .addComponent(button3)
                    .addComponent(button4)
                    .addComponent(button5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bm2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bm3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bm4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bm1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bm5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(PointsBM))
                .addGap(202, 202, 202)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button6)
                    .addComponent(button7)
                    .addComponent(button8)
                    .addComponent(button9)
                    .addComponent(button10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pun1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pun2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pun3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pun4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pun5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(PointsP))
                .addContainerGap(440, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        getImage1();
        button6.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        getImage2();
        button7.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        getImage3();
        button8.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        getImage4();
        button9.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        getImage5();
        button10.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        getImage6();
        button2.setEnabled(true);
        sumPoints1();
        // TODO add your handling code here:
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        getImage7();
        sumPoints2();
        button3.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        getImage8();
        sumPoints3();
        button4.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        getImage9();
        sumPoints4();
        button5.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_button9ActionPerformed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        getImage10();
        sumPoints5();
        winner();
        // TODO add your handling code here:
    }//GEN-LAST:event_button10ActionPerformed
      
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
            java.util.logging.Logger.getLogger(CardGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CardGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PointsBM;
    private javax.swing.JLabel PointsP;
    private javax.swing.JLabel bm1;
    private javax.swing.JLabel bm2;
    private javax.swing.JLabel bm3;
    private javax.swing.JLabel bm4;
    private javax.swing.JLabel bm5;
    private javax.swing.JButton button1;
    private javax.swing.JButton button10;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel pun1;
    private javax.swing.JLabel pun2;
    private javax.swing.JLabel pun3;
    private javax.swing.JLabel pun4;
    private javax.swing.JLabel pun5;
    // End of variables declaration//GEN-END:variables
}
