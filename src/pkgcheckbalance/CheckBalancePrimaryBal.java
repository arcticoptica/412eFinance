package pkgcheckbalance;

/**
 *
 * @author Team Rho
 */
public class CheckBalancePrimaryBal {

    private double accountBalance;
    
    /**
     * Default constructor for the CheckBalancePrimaryBal class.
     */
    public CheckBalancePrimaryBal() {
        this.accountBalance = -1;
    }
    
    /**
     * Sends the sessionID to the bank server and receives the account balance, then returns the value.
     * @param sessionID Identifier for the current user/account.
     * @return The account balance.
     */
    public double getBalance(int sessionID) {
        //use sessionID and communicate with bank server
        //mock balance = $5,284.20
        this.accountBalance = 5284.20;
        return this.accountBalance;
    }

}
