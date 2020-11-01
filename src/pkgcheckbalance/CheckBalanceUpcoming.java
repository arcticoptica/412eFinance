package pkgcheckbalance;

/**
 *
 * @author Team Rho
 */
public class CheckBalanceUpcoming {
    
    private double upcomingPayment;
    
    /**
     * Default constructor for the CheckBalanceUpcoming class.
     */
    public CheckBalanceUpcoming() {
        this.upcomingPayment = -1;
    }
    
    /**
     * Sends the sessionID to the bank server and receives the upcoming payment due, then returns the value.
     * @param sessionID Identifier for the current user/account.
     * @return The upcoming payment due.
     */
    public double getUpcoming(int sessionID) {
        //use sessionID and communicate with bank server
        //mock upcomingPayment = $143.85
        this.upcomingPayment = 143.85;
        return this.upcomingPayment;
    }
    
}
