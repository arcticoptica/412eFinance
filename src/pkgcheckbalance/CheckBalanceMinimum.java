package pkgcheckbalance;

/**
 *
 * @author Team Rho
 */
public class CheckBalanceMinimum {
    
    private double minimumPayment;
    
    /**
     * Default constructor for the CheckBalanceMinimum class.
     */
    public CheckBalanceMinimum() {
        this.minimumPayment = -1;
    }
    
    /**
     * Sends the sessionID to the bank server and receives the next minimum payment.
     * @param sessionID Identifier for the current user/account.
     * @return The next minimum payment.
     */
    public double getMinimum(int sessionID) {
        //use sessionID and communicate with bank server
        //mock minimum payment = $25
        this.minimumPayment = 25;
        return this.minimumPayment;
    }
    
}
