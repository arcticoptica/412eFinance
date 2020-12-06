package pkgcheckbalance;

/**
 *
 * @author Team Rho
 */
public class CheckBalance {
    
    private int sessionID;
    private double balance;
    private double upcoming;
    private double minimum;
    private String status;
    private String plan;
    private final CheckBalancePrimaryBal balanceMain;
    private final CheckBalanceUpcoming balanceUpcoming;
    private final CheckBalanceMinimum balanceMinimum;
    private final CheckBalanceStatus balanceStatus;
    private final CheckBalancePlan balancePlan;
    private final CheckBalanceUI balanceUI;
    
    /**
     * Default constructor for the CheckBalance class.
     */
    public CheckBalance() {
        this.sessionID = -1;
        this.balance = -1;
        this.upcoming = -1;
        this.minimum = -1;
        this.status = "";
        this.plan = "";
        retrieveSessionID();
        this.balanceMain = new CheckBalancePrimaryBal();
        this.balanceUpcoming = new CheckBalanceUpcoming();
        this.balanceMinimum = new CheckBalanceMinimum();
        this.balanceStatus = new CheckBalanceStatus();
        this.balancePlan = new CheckBalancePlan();
        this.balanceUI = new CheckBalanceUI();
        initUI();
    }
    
    /**
     * Retrieves current session and sets variable sessionID.
     */
    private void retrieveSessionID() {
        //Mock session ID
        this.sessionID = 12345;
    }
    
    /**
     * Fills in info for CheckBalanceUI and displays it.
     */
    private void initUI() {
        balanceUI.setCurrentField(String.valueOf(getBalance()));
        balanceUI.setUpcomingField(String.valueOf(getUpcoming()));
        balanceUI.setMinimumField(String.valueOf(getMinimum()));
        balanceUI.setStatusField(getStatus());
        balanceUI.setPlanField(getPlan());
        this.balanceUI.setVisible(true);
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
     * Updates variable minimum, then returns the value.
     * @return The minimum next payment.
     */
    public double getMinimum() {
        this.minimum = balanceMinimum.getMinimum(sessionID);
        return minimum;
    }
    
    /**
     * Updates variable status, then returns the value.
     * @return The account standing.
     */
    public String getStatus() {
        this.status = balanceStatus.getStatus(sessionID);
        return status;
    }
    
    /**
     * Updates variable plan, then returns the value.
     * @return The payment plan.
     */
    public String getPlan() {
        this.plan = balancePlan.getPlan(sessionID);
        return plan;
    }
}
