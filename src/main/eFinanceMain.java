package main;

import pkglogin.LogInUI;

/**
 *
 * @author Team Rho
 */
public class eFinanceMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Team Rho's eFinance app");
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LogInUI().setVisible(true);
                
            }
        });
    }
    
}
