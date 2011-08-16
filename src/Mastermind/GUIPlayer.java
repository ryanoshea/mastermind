package Mastermind;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 * @author Ryan O'Shea
 *
 * Copyright © 2009-2011 Ryan O'Shea
 *
 * Copying Permissions: 
 * 	This file is part of Mastermind.
 *
 * 	Mastermind is free software: you can redistribute it and/or modify
 * 	it under the terms of the GNU General Public License as published by
 * 	the Free Software Foundation, either version 3 of the License, or
 * 	(at your option) any later version.
 * 
 * 	Mastermind is distributed in the hope that it will be useful,
 * 	but WITHOUT ANY WARRANTY; without even the implied warranty of
 * 	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * 	GNU General Public License for more details.
 *
 * 	You should have received a copy of the GNU General Public License
 *  along with Mastermind (see the "COPYING" file).  If not, see <http://www.gnu.org/licenses/>.
 */

public class GUIPlayer extends javax.swing.JFrame 
                       implements Player, ActionListener {

    /** Creates new form GUIPlayer */
    public GUIPlayer() {
        initComponents();
        this.jButtonSubmitInput.addActionListener(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jLabelTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelnDigits = new javax.swing.JLabel();
        jLabelRange = new javax.swing.JLabel();
        jLabelRemainingGuesses = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelrecGuesses = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonSubmitInput = new javax.swing.JButton();
        jPanelResults = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabelLastGuessReds = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelLastGuessWhites = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelLastGuess = new javax.swing.JLabel();
        jLabelgOverResult = new javax.swing.JLabel();
        jLabelgOver = new javax.swing.JLabel();
        jSpinnerInput1 = new javax.swing.JSpinner();
        jSpinnerInput2 = new javax.swing.JSpinner();
        jSpinnerInput3 = new javax.swing.JSpinner();
        jSpinnerInput4 = new javax.swing.JSpinner();
        jSpinnerInput5 = new javax.swing.JSpinner();
        jSpinnerInput6 = new javax.swing.JSpinner();
        jSpinnerInput7 = new javax.swing.JSpinner();
        jSpinnerInput8 = new javax.swing.JSpinner();
        jSpinnerInput9 = new javax.swing.JSpinner();
        jSpinnerInput10 = new javax.swing.JSpinner();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        setResizable(false);

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Mastermind");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("Game Rules");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("<html><p><strong>The object of the game is to guess a number, chosen at random.</strong> </p><p>Each guess will be compared to the target number. </p><p>A RED peg means that one of the numbers in your guess exists and is in the correct place in the target number. </p><p>A WHITE peg means that one of the numbers in your guess exists in the target number, but not in the same location as it is in your guess.</p></html>");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("Game Status");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelnDigits.setFont(new java.awt.Font("Segoe UI", 0, 12));
        jLabelnDigits.setText("BLANK digits in the number you're trying to guess.");

        jLabelRange.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabelRange.setText("Each digit ranges from 1-X");

        jLabelRemainingGuesses.setFont(new java.awt.Font("Segoe UI", 0, 12));
        jLabelRemainingGuesses.setText("You have X guesses left");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel4.setText("Your Guesses");

        jLabelrecGuesses.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabelrecGuesses.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelrecGuesses.setAutoscrolls(true);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Your Next Guess:");

        jButtonSubmitInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonSubmitInput.setText("Guess");
        jButtonSubmitInput.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Your Last Guess:");

        jLabelLastGuessReds.setFont(new java.awt.Font("Segoe UI", 0, 24));
        jLabelLastGuessReds.setForeground(new java.awt.Color(0, 153, 0));
        jLabelLastGuessReds.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelLastGuessReds.setText("0");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Reds:");

        jLabelLastGuessWhites.setFont(new java.awt.Font("Segoe UI", 0, 24));
        jLabelLastGuessWhites.setForeground(new java.awt.Color(153, 153, 153));
        jLabelLastGuessWhites.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelLastGuessWhites.setText("0");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 13));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Whites:");

        jLabelLastGuess.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelLastGuess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelResultsLayout = new javax.swing.GroupLayout(jPanelResults);
        jPanelResults.setLayout(jPanelResultsLayout);
        jPanelResultsLayout.setHorizontalGroup(
            jPanelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelResultsLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelLastGuessReds, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelLastGuessWhites, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelLastGuess, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))))
        );
        jPanelResultsLayout.setVerticalGroup(
            jPanelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLastGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabelLastGuessReds)
                    .addComponent(jLabel10)
                    .addComponent(jLabelLastGuessWhites))
                .addContainerGap())
        );

        jLabelgOverResult.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelgOverResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelgOverResult.setText("You Win!");

        jLabelgOver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelgOver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelgOver.setText("GAME OVER");

        jSpinnerInput1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jSpinnerInput1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        jSpinnerInput2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jSpinnerInput2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        jSpinnerInput3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jSpinnerInput3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        jSpinnerInput4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jSpinnerInput4.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        jSpinnerInput5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jSpinnerInput5.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        jSpinnerInput6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jSpinnerInput6.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        jSpinnerInput7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jSpinnerInput7.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        jSpinnerInput8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jSpinnerInput8.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        jSpinnerInput9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jSpinnerInput9.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        jSpinnerInput10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jSpinnerInput10.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 1155, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jSpinnerInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinnerInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(jSpinnerInput3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinnerInput4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinnerInput5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinnerInput6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanelResults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jSpinnerInput7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSpinnerInput8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSpinnerInput9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSpinnerInput10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonSubmitInput, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelgOverResult, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelgOver, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelRange, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelRemainingGuesses, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabelnDigits, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabelrecGuesses, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelnDigits)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRange)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRemainingGuesses)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelrecGuesses, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSubmitInput)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSpinnerInput1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSpinnerInput2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                .addComponent(jSpinnerInput4, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                .addComponent(jSpinnerInput5, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                .addComponent(jSpinnerInput6, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                .addComponent(jSpinnerInput7, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                .addComponent(jSpinnerInput8, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                .addComponent(jSpinnerInput9, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                .addComponent(jSpinnerInput10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                .addComponent(jSpinnerInput3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addComponent(jPanelResults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelgOver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelgOverResult, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel2.getAccessibleContext().setAccessibleName("");
        jLabel2.getAccessibleContext().setAccessibleDescription("");
        jPanelResults.setVisible(false);
        jLabelgOverResult.setVisible(false);
        jLabelgOver.setVisible(false);
        jSpinnerInput1.setVisible(false);
        jSpinnerInput2.setVisible(false);
        jSpinnerInput3.setVisible(false);
        jSpinnerInput4.setVisible(false);
        jSpinnerInput5.setVisible(false);
        jSpinnerInput6.setVisible(false);
        jSpinnerInput7.setVisible(false);
        jSpinnerInput8.setVisible(false);
        jSpinnerInput9.setVisible(false);
        jSpinnerInput10.setVisible(false);

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
            java.util.logging.Logger.getLogger(GUIPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GUIPlayer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSubmitInput;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelLastGuess;
    private javax.swing.JLabel jLabelLastGuessReds;
    private javax.swing.JLabel jLabelLastGuessWhites;
    private javax.swing.JLabel jLabelRange;
    private javax.swing.JLabel jLabelRemainingGuesses;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelgOver;
    private javax.swing.JLabel jLabelgOverResult;
    private javax.swing.JLabel jLabelnDigits;
    private javax.swing.JLabel jLabelrecGuesses;
    private javax.swing.JPanel jPanelResults;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerInput1;
    private javax.swing.JSpinner jSpinnerInput10;
    private javax.swing.JSpinner jSpinnerInput2;
    private javax.swing.JSpinner jSpinnerInput3;
    private javax.swing.JSpinner jSpinnerInput4;
    private javax.swing.JSpinner jSpinnerInput5;
    private javax.swing.JSpinner jSpinnerInput6;
    private javax.swing.JSpinner jSpinnerInput7;
    private javax.swing.JSpinner jSpinnerInput8;
    private javax.swing.JSpinner jSpinnerInput9;
    // End of variables declaration//GEN-END:variables

    GameState gs;
    String input = new String();
    
    public void acceptGameState(GameState gs) {
        this.gs = gs;
        
        if (gs.nDigits >= 1) {
            SpinnerModel model1 = new SpinnerNumberModel(1, 1, gs.range, 1);
            this.jSpinnerInput1.setModel(model1);
            this.jSpinnerInput1.setVisible(true);
        }
        if (gs.nDigits >= 2) {
            SpinnerModel model2 = new SpinnerNumberModel(1, 1, gs.range, 1);
            this.jSpinnerInput2.setModel(model2);
            this.jSpinnerInput2.setVisible(true);
        }
        if (gs.nDigits >= 3) {
            SpinnerModel model3 = new SpinnerNumberModel(1, 1, gs.range, 1);
            this.jSpinnerInput3.setModel(model3);
            this.jSpinnerInput3.setVisible(true);
        }
        if (gs.nDigits >= 4) {
            SpinnerModel model4 = new SpinnerNumberModel(1, 1, gs.range, 1);
            this.jSpinnerInput4.setModel(model4);
            this.jSpinnerInput4.setVisible(true);
        }
        if (gs.nDigits >= 5) {
            SpinnerModel model5 = new SpinnerNumberModel(1, 1, gs.range, 1);
            this.jSpinnerInput5.setModel(model5);
            this.jSpinnerInput5.setVisible(true);
        }
        if (gs.nDigits >= 6) {
            SpinnerModel model6 = new SpinnerNumberModel(1, 1, gs.range, 1);
            this.jSpinnerInput6.setModel(model6);
            this.jSpinnerInput6.setVisible(true);
        }
        if (gs.nDigits >= 7) {
            SpinnerModel model7 = new SpinnerNumberModel(1, 1, gs.range, 1);
            this.jSpinnerInput7.setModel(model7);
            this.jSpinnerInput7.setVisible(true);
        }
        if (gs.nDigits >= 8) {
            SpinnerModel model8 = new SpinnerNumberModel(1, 1, gs.range, 1);
            this.jSpinnerInput8.setModel(model8);
            this.jSpinnerInput8.setVisible(true);
        }
        if (gs.nDigits >= 9) {
            SpinnerModel model9 = new SpinnerNumberModel(1, 1, gs.range, 1);
            this.jSpinnerInput9.setModel(model9);
            this.jSpinnerInput9.setVisible(true);
        }
        if (gs.nDigits >= 10) {
            SpinnerModel model10 = new SpinnerNumberModel(1, 1, gs.range, 1);
            this.jSpinnerInput10.setModel(model10);
            this.jSpinnerInput10.setVisible(true);
        }
        
//        SpinnerModel model1 = new SpinnerNumberModel(1, 1, gs.range, 1);
//        SpinnerModel model2 = new SpinnerNumberModel(1, 1, gs.range, 1);
//        SpinnerModel model3 = new SpinnerNumberModel(1, 1, gs.range, 1);
//        SpinnerModel model4 = new SpinnerNumberModel(1, 1, gs.range, 1);
//        this.jSpinnerInput1.setModel(model1);
//        this.jSpinnerInput2.setModel(model2);
//        this.jSpinnerInput3.setModel(model3);
//        this.jSpinnerInput4.setModel(model4);
        
        dumpGameState(false);
    }

    public int[] getNextGuess() {
        int[] guess;
        char[] inputCharArray;
        
        dumpGameState(false);
        
        this.jButtonSubmitInput.setEnabled(true);
//        this.jSpinnerInput1.setEnabled(true);
//        this.jSpinnerInput2.setEnabled(true);
//        this.jSpinnerInput3.setEnabled(true);
//        this.jSpinnerInput4.setEnabled(true);
        
        while(input.toCharArray().length < gs.nDigits) { //creates infinite loop to wait until button is pressed and the jTextFieldInput has something it it
        }
        
        guess = new int[gs.nDigits];

        //inputCharArray = new char[gs.nDigits];
        inputCharArray = input.toCharArray();
        input = "";

        for(int i = 0; i < gs.nDigits; i++) {
            guess[i] = Integer.parseInt(String.valueOf(inputCharArray[i]));
        }

        return guess;
        
    }
    
    public void actionPerformed(ActionEvent e) {
        if (gs.nDigits >= 1) {
            input = this.jSpinnerInput1.getValue().toString();
        }
        if (gs.nDigits >= 2) {
            input = input + this.jSpinnerInput2.getValue().toString();
        }
        if (gs.nDigits >= 3) {
            input = input + this.jSpinnerInput3.getValue().toString();
        }
        if (gs.nDigits >= 4) {
            input = input + this.jSpinnerInput4.getValue().toString();
        }
        if (gs.nDigits >= 5) {
            input = input + this.jSpinnerInput5.getValue().toString();
        }
        if (gs.nDigits >= 6) {
            input = input + this.jSpinnerInput6.getValue().toString();
        }
        if (gs.nDigits >= 7) {
            input = input + this.jSpinnerInput7.getValue().toString();
        }
        if (gs.nDigits >= 8) {
            input = input + this.jSpinnerInput8.getValue().toString();
        }
        if (gs.nDigits >= 9) {
            input = input + this.jSpinnerInput9.getValue().toString();
        }
        if (gs.nDigits >= 10) {
            input = input + this.jSpinnerInput10.getValue().toString();
        }
    }
    
    public void dumpGameState(boolean gOver) {
        if(gOver == false) {
            
            this.jLabelnDigits.setText(gs.nDigits + " digits in the number you're trying to guess");
            this.jLabelRange.setText("Each digit ranges from 1-" + gs.range);
            this.jLabelRemainingGuesses.setText("You have "  + (gs.nGuesses - gs.idxGuess) + " guesses left of " + gs.nGuesses + " total");

            this.jLabelrecGuesses.setText("<html>");

            for(int i = 0; i < gs.idxGuess; i++) {

                for(int k = 0; k < gs.nDigits; k++) {
                    this.jLabelrecGuesses.setText("" + this.jLabelrecGuesses.getText() + gs.recGuesses[i][k]);
                }

                this.jLabelrecGuesses.setText(this.jLabelrecGuesses.getText() + " | Reds: " + gs.recRed[i] + " | Whites: " + gs.recWhite[i]);
                this.jLabelrecGuesses.setText(this.jLabelrecGuesses.getText() + "<br>");
            }

            this.jLabelrecGuesses.setText(this.jLabelrecGuesses.getText() + "</html>");
            
        } else if(gOver == true){
            this.jLabelnDigits.setText(gs.nDigits + " digits in the number you're trying to guess");
            this.jLabelRange.setText("Each digit ranges from 1-" + gs.range);
            this.jLabelRemainingGuesses.setText("You have "  + (gs.nGuesses - gs.idxGuess) + " guesses left of " + gs.nGuesses + " total");

            this.jLabelrecGuesses.setText("<html>");

            for(int i = 0; i < gs.idxGuess; i++) {

                for(int k = 0; k < gs.nDigits; k++) {
                    this.jLabelrecGuesses.setText("" + this.jLabelrecGuesses.getText() + gs.recGuesses[i][k]);
                }

                this.jLabelrecGuesses.setText(this.jLabelrecGuesses.getText() + " | Reds: " + gs.recRed[i] + " | Whites: " + gs.recWhite[i]);
                this.jLabelrecGuesses.setText(this.jLabelrecGuesses.getText() + "<br>");
            }

            this.jLabelrecGuesses.setText(this.jLabelrecGuesses.getText() + "</html>");
            
            this.jLabelgOver.setVisible(true);
            this.jLabelgOverResult.setVisible(true);
            if (gs.idxGuess >= gs.nGuesses) {
                this.jLabelgOverResult.setText("You Win!");
            }
            if (gs.idxGuess >= gs.nGuesses) {
                this.jLabelgOverResult.setText("You lose :(");
            }
        }
    }
    
    public void displayResult() {
        
        this.jPanelResults.setVisible(true);
        
        this.jLabelLastGuess.setText("");
        
        for(int k = 0; k < gs.nDigits; k++) {
            this.jLabelLastGuess.setText("" + this.jLabelLastGuess.getText() + gs.recGuesses[gs.idxGuess - 1][k]);
        }
        
        this.jLabelLastGuessReds.setText("" + gs.recRed[gs.idxGuess - 1]);
        this.jLabelLastGuessWhites.setText("" + gs.recWhite[gs.idxGuess - 1]);
        
    }
    
    public boolean isInteger(String in) {
        try {
            Integer.parseInt(in);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
