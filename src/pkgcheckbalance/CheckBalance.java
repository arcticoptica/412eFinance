package pkgcheckbalance;

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
        this.balanceUI = new CheckBalanceUI();
        initUI();
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
     * Fills in info for CheckBalanceUI and displays it.
     */
    private void initUI() {
        //TODO fill info
        balanceUI.setCurrentField(String.valueOf(getBalance()));
        balanceUI.setUpcomingField(String.valueOf(getUpcoming()));
        balanceUI.setMinimumField("");
        balanceUI.setStatusField("");
        balanceUI.setPlanField("");
        this.balanceUI.setVisible(true);
    }
    
}
