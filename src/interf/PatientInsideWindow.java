/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interf;

import java.awt.Color;

/**
 *
 * @author carmen
 */
public class PatientInsideWindow extends javax.swing.JFrame {

    /**
     * Creates new form DoctorInsideWindow
     */
    public PatientInsideWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.ErrorBitText.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GetBut = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ExitBut = new javax.swing.JButton();
        OtherBitalinoBut = new javax.swing.JButton();
        ErrorBitText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GetBut.setText("GET DATA FROM MY BITALINO");
        GetBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetButActionPerformed(evt);
            }
        });

        jButton2.setText("SEE DATA");

        ExitBut.setText("Exit");
        ExitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButActionPerformed(evt);
            }
        });

        OtherBitalinoBut.setText("INTRODUCE MY BITALINO ");
        OtherBitalinoBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherBitalinoButActionPerformed(evt);
            }
        });

        ErrorBitText.setText("You have not register a BITalino yet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ExitBut))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GetBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OtherBitalinoBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ErrorBitText)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(GetBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrorBitText)
                .addGap(21, 21, 21)
                .addComponent(jButton2)
                .addGap(26, 26, 26)
                .addComponent(OtherBitalinoBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(ExitBut)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GetButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetButActionPerformed
        if (PatientPrincipalWindow.patient.getMacBitalino() != null) {
            PatientChooseSignal rd = new PatientChooseSignal();
            this.setVisible(false);
            rd.setVisible(true);
        } else {
            this.ErrorBitText.setForeground(Color.red);
            this.ErrorBitText.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_GetButActionPerformed

    private void ExitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButActionPerformed
        PatientPrincipalWindow rd = new PatientPrincipalWindow();
        this.setVisible(false);
        rd.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_ExitButActionPerformed

    private void OtherBitalinoButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherBitalinoButActionPerformed
        System.out.println("El id " + PatientPrincipalWindow.patient.getDocId());
        PatientBitalinoWindow rd = new PatientBitalinoWindow();
        this.setVisible(false);
        rd.setVisible(true);     // TODO add your handling code here:
    }//GEN-LAST:event_OtherBitalinoButActionPerformed

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
            java.util.logging.Logger.getLogger(PatientInsideWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientInsideWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientInsideWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientInsideWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new PatientInsideWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorBitText;
    private javax.swing.JButton ExitBut;
    private javax.swing.JButton GetBut;
    private javax.swing.JButton OtherBitalinoBut;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
