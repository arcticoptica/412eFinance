package main;

import pkglogin.LogInUI;

/**
 * 
 * @author Team Rho
 */
public class eFinanceMainController {
    
    /**
     * Default constructor for eFinanceMainController class.
     */
    public eFinanceMainController() {
        System.out.println("Welcome to Team Rho's eFinance app");
        
        java.awt.EventQueue.invokeLater(() -> {
            new LogInUI().setVisible(true);
        });
    }
    
}
