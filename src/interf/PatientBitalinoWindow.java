/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interf;

import Utilities.FunctionsInterfaz;
import java.awt.Color;

/**
 *
 * @author carmen
 */
public class PatientBitalinoWindow extends javax.swing.JFrame {

    //prueba
    //public BITalino bi = new BITalino();
    //  public static String mac;
    /**
     * Creates new form PatientBitalinoWindow
     */
    public PatientBitalinoWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.MacError.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackBut = new javax.swing.JButton();
        AdqBut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MacInput = new javax.swing.JTextField();
        MacError = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SaveBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackBut.setText("Not now");
        BackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButActionPerformed(evt);
            }
        });

        AdqBut.setText("Adquire");
        AdqBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdqButActionPerformed(evt);
            }
        });

        jLabel1.setText("INSERT YOUR BITALINO MAC:");

        MacInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MacInputActionPerformed(evt);
            }
        });

        MacError.setText("This is not a MAC adress");

        jLabel3.setText("aa:aa:aa:aa:aa:aa");

        SaveBut.setText("Save");
        SaveBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(MacInput, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1)))
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BackBut)
                        .addGap(18, 18, 18)
                        .addComponent(SaveBut)
                        .addGap(45, 45, 45)
                        .addComponent(AdqBut)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(MacError)
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MacInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MacError)
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBut)
                    .addComponent(AdqBut)
                    .addComponent(SaveBut))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MacInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MacInputActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_MacInputActionPerformed

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
        PatientInsideWindow rd = new PatientInsideWindow();
        this.setVisible(false);
        rd.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BackButActionPerformed

    private void AdqButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdqButActionPerformed
        boolean e = checkMacInterface();
        if (!e) {
            // mac = this.MacInput.getText();
            PatientChooseSignal rd = new PatientChooseSignal();
            this.setVisible(false);
            rd.setVisible(true);
        }
        /*bitalino = new BITalino();
        int samplingRate = 0;
        boolean errorMac, errorSam = false;
        String macAddress = "";
        macAddress = this.MacInput.getText();
        String sampling = this.SamplingRateInput.getText();

        if (!FunctionsInterfaz.checkMac(macAddress)) {
            this.MacError.setForeground(Color.red);
            this.MacError.setVisible(true);
            errorMac = true;
        } else {
            this.MacError.setVisible(false);
            errorMac = false;
        }

        samplingRate = FunctionsInterfaz.checkSamping(sampling);
        if (samplingRate == 1) {
            this.SamplingError.setText("The sampling rate is a number");
            this.SamplingError.setForeground(Color.red);
            this.SamplingError.setVisible(true);
            errorSam = true;
        } else if (samplingRate == 2) {
            this.SamplingError.setText("The sampling rate has to be 10,100 or 1000");
            this.SamplingError.setForeground(Color.red);
            this.SamplingError.setVisible(true);
            errorSam = true;
        } else {
            errorSam = false;
        }
        boolean er;
        boolean errorOpen;
        if (!errorSam && !errorMac) {
            Main.patient.setBitalino(bitalino);
            errorOpen = FunctionsInterfaz.openBitalinoInInterface(macAddress, samplingRate);
            this.ErrorText.setVisible(false);
            int a = this.SignalInput.getSelectedIndex();
            er = FunctionsInterfaz.checkChannel(a, bitalino);
            if (errorOpen || er) {
                this.ErrorText.setForeground(Color.red);
                this.ErrorText.setText("Something went wrong");
                this.ErrorText.setVisible(true);
            } else {

            }

        }*/

    }//GEN-LAST:event_AdqButActionPerformed

    private void SaveButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButActionPerformed
        boolean e = checkMacInterface();
        if (!e) {
            PatientInsideWindow rd = new PatientInsideWindow();
            this.setVisible(false);
            rd.setVisible(true);
        }
    }//GEN-LAST:event_SaveButActionPerformed

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
            java.util.logging.Logger.getLogger(PatientBitalinoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientBitalinoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientBitalinoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientBitalinoWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientBitalinoWindow().setVisible(true);
            }
        });
    }

    public boolean checkMacInterface() {
        boolean errorMac = false;
        String macAddress = this.MacInput.getText();
        if (!FunctionsInterfaz.checkMac(macAddress)) {
            this.MacError.setForeground(Color.red);
            this.MacError.setVisible(true);
            errorMac = true;
        } else {
            this.MacError.setVisible(false);
            errorMac = false;
        }
        if (!errorMac) {
            PatientPrincipalWindow.patient.setMacBitalino(macAddress);
        }
        return errorMac;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdqBut;
    private javax.swing.JButton BackBut;
    private javax.swing.JLabel MacError;
    private javax.swing.JTextField MacInput;
    private javax.swing.JButton SaveBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}