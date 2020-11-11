package main;

import pkglogin.LogInUI;

/**
 *
 * @author Team Rho
 */
public class eFinanceMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Team Rho's eFinance app");
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LogInUI().setVisible(true);
            }
        });
    }
    
}
