package pkgcheckbalance;

/**
 *
 * @author Team Rho
 */
public class CheckBalancePlan {
    
    private String paymentPlan;
    
    /**
     * Default constructor for the CheckBalanceStatus class.
     */
    public CheckBalancePlan() {
        this.paymentPlan = "";
    }
    
    /**
     * Sends the sessionID to the bank server and receives the account payment plan.
     * @param sessionID Identifier for the current user/account.
     * @return The account payment plan.
     */
    public String getPlan(int sessionID) {
        //use sessionID and communicate with bank server
        //mock payment plan = monthly
        this.paymentPlan = "Monthly";
        return this.paymentPlan;
    }
    
}
