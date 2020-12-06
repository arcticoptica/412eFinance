package main;

import pkgautopayment.AutoPaymentCntl;
import pkgcheckbalance.CheckBalance;
import pkglogin.LogInUI;

/**
 * 
 * @author Team Rho
 */
public class eFinanceMainController {
    
    static CheckBalance checkBalance;
    static AutoPaymentCntl autoPay;
    
    /**
     * Default constructor for eFinanceMainController class.
     */
    public eFinanceMainController() {
        System.out.println("Welcome to Team Rho's eFinance app");
        System.out.println("For testing -> (case sensitive) Username: Steve, Password: pass1");
        
        java.awt.EventQueue.invokeLater(() -> {
            new LogInUI().setVisible(true);
        });
    }
    
    public static void showMainMenu() {
        java.awt.EventQueue.invokeLater(() -> {
            new HomeMenuUI().setVisible(true);
        });
    }
    
    public static void showCheckBalance() {
        java.awt.EventQueue.invokeLater(() -> {
            eFinanceMainController.checkBalance = new CheckBalance();
        });
    }
    
    public static void showAutoPayment() {
        java.awt.EventQueue.invokeLater(() -> {
            eFinanceMainController.autoPay = new AutoPaymentCntl();
        });
    }
}
