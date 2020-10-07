package pkgcheckbalance;

/**
 *
 * @author Team Rho
 */
public class CheckBalance {
    
    private double balance;
    
    /**
     * Default constructor for the CheckBalance class.
     */
    public CheckBalance() {
        this.balance = -1;
    }
    
    /**
     * Retrieves account balance and sets variable balance.
     */
    private void retrieveBalance() {
        this.balance = 0;
    }
    
    /**
     * Calls method to update balance, then returns the value.
     * @return The account balance.
     */
    public double getBalance() {
        retrieveBalance();
        return balance;
    }
    
}
