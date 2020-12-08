/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgautopayment;

import javax.swing.JOptionPane;
import main.eFinanceMainController;
import pkgpopupmenu.PopupMenu;

/**
 *
 * @author elitzageorgieva
 */
public class AutoPayUI extends javax.swing.JFrame {
    
    private final AutoPayment parent;
    private final PopupMenu popup;
    
    public AutoPayUI(AutoPayment parent) {
        this.parent = parent;
        this.popup = new PopupMenu(this);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        routingNumberText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        accountNumberText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        autoPayAmountText = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Set Up Automatic Payment");

        jLabel2.setText("Routing Number: ");

        routingNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routingNumberTextActionPerformed(evt);
            }
        });

        jLabel3.setText("Account Number: ");

        accountNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumberTextActionPerformed(evt);
            }
        });

        jLabel4.setText("Auto Pay Amount: $");

        autoPayAmountText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoPayAmountTextActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Menu");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Retrieve Existing");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(jToggleButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(routingNumberText)
                            .addComponent(accountNumberText, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(autoPayAmountText))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(28, 28, 28)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(submitButton)
                        .addGap(36, 36, 36)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jToggleButton1))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(routingNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(accountNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(autoPayAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void routingNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routingNumberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_routingNumberTextActionPerformed

    private void accountNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountNumberTextActionPerformed

    private void autoPayAmountTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoPayAmountTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autoPayAmountTextActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String routing = routingNumberText.getText();
        String account = accountNumberText.getText();
        String amount = autoPayAmountText.getText();
        if (routing.equals("") || account.equals("") || amount.equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out all fields.");
        } else {
            try {
                int status = this.parent.setAutoPay(routing, account, amount);
                switch (status) {
                    case 1:
                        JOptionPane.showMessageDialog(this, "Submission successful.");
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(this, "Submission failed.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "System error, please try again later.");
                        break;
                }
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers.");
            }
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        eFinanceMainController.showMainMenu();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (jToggleButton1.isSelected()) {
            this.popup.setPopupLocation(this.jToggleButton1.getLocationOnScreen());
            this.popup.getPopupMenu().setVisible(true);
        } else {
            this.popup.getPopupMenu().setVisible(false);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int status = this.parent.getExistingAutoPay();
        if (status == 0) {
            JOptionPane.showMessageDialog(this, "No existing auto pay found.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField accountNumberText;
    public javax.swing.JTextField autoPayAmountText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    public javax.swing.JTextField routingNumberText;
    public javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
    
    public void setRoutingField(String str) {
        this.routingNumberText.setText(str);
    }
    public void setAccountField(String str) {
        this.accountNumberText.setText(str);
    }
    public void setAmountField(String str) {
        this.autoPayAmountText.setText(str);
    }
}
