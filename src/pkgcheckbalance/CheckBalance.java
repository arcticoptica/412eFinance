package pkgcheckbalance;

import java.awt.event.ActionEvent;

/**
 *
 * @author Team Rho
 */
public class CheckBalance {
    
    private int sessionID;
    private double balance;
    private double upcoming;
    private final CheckBalanceMain balanceMain;
    private final CheckBalanceUpcoming balanceUpcoming;
    private final CheckBalanceUI balanceUI;
    
    /**
     * Default constructor for the CheckBalance class.
     */
    public CheckBalance() {
        this.sessionID = -1;
        this.balance = -1;
        this.upcoming = -1;
        retrieveSessionID();
        this.balanceMain = new CheckBalanceMain();
        this.balanceUpcoming = new CheckBalanceUpcoming();
        this.balanceUI = new CheckBalanceUI(this);
        initUI();
        this.balanceUI.setVisible(true);
    }
    
    /**
     * Retrieves current session and sets variable sessionID.
     */
    private void retrieveSessionID() {
        this.sessionID = 12345;
        //mock sessionID = 12345
    }
    
    /**
     * Updates variable balance, then returns the value.
     * @return The account balance.
     */
    public double getBalance() {
        this.balance = balanceMain.getBalance(this.sessionID);
        return balance;
    }
    
    /**
     * Updates variable upcoming, then returns the value.
     * @return The upcoming payment.
     */
    public double getUpcoming() {
        this.upcoming = balanceUpcoming.getUpcoming(sessionID);
        return upcoming;
    }
    
    /**
     * Sets action listener for CheckBalanceUI's backButton and fills in info.
     */
    private void initUI() {
        balanceUI.setBackButtonListener((ActionEvent e) -> {
            //send UI to previous page: home
            System.out.println("Placeholder: Back button pressed.");
        });
        balanceUI.setContents(String.valueOf(getBalance()), String.valueOf(getUpcoming()));
    }
    
}
