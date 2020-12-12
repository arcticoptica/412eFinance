package main;

import pkgautopayment.AutoPayment;
import pkgcheckbalance.CheckBalance;
import pkgcontact.ContactDetails;
import pkglogin.Authenticate;
import pkgmanualpay.ManualPay;

/**
 * 
 * @author Team Rho
 */
public class eFinanceMainController {
    
    static Authenticate authenticate;
    static CheckBalance checkBalance;
    static AutoPayment autoPay;
    static ManualPay manualPay;
    static ContactDetails contactDetails;
    
    /**
     * Default constructor for eFinanceMainController class.
     */
    public eFinanceMainController() {
        System.out.println("Welcome to Team Rho's eFinance app");
        System.out.println("For testing -> (case sensitive) Username: Steve, Password: pass1");
        
        showLogin();
    }
    
    public static void showLogin() {
        java.awt.EventQueue.invokeLater(() -> {
            eFinanceMainController.authenticate = new Authenticate();
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
            eFinanceMainController.autoPay = new AutoPayment();
        });
    }
    
    public static void showManualPayment() {
        java.awt.EventQueue.invokeLater(() -> {
            eFinanceMainController.manualPay = new ManualPay();
        });
    }
    
    public static void showContactDetails() {
        java.awt.EventQueue.invokeLater(() -> {
            eFinanceMainController.contactDetails = new ContactDetails();
        });
    }
}
