package pkgcheckbalance;

/**
 *
 * @author Team Rho
 */
public class CheckBalanceStatus {
    
    private String accountStatus;
    
    /**
     * Default constructor for the CheckBalanceStatus class.
     */
    public CheckBalanceStatus() {
        this.accountStatus = "";
    }
    
    /**
     * Sends the sessionID to the bank server and receives the current account standing.
     * @param sessionID Identifier for the current user/account.
     * @return The account standing.
     */
    public String getStatus(int sessionID) {
        //use sessionID and communicate with bank server
        //mock account status = good
        this.accountStatus = "Good";
        return this.accountStatus;
    }
    
}
