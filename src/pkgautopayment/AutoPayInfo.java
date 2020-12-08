package pkgautopayment;

import java.util.HashMap;

/**
 *
 * @author Team Rho
 */
public class AutoPayInfo {
    
    private int sessionID;
    private final HashMap<String, Double> currentInfo;
    
    /**
     * Default constructor for AutoPayInfo class.
     */
    public AutoPayInfo() {
        this.sessionID = -1;
        this.currentInfo = new HashMap<>();
    }
    
    /**
     * Sets sessionID.
     * @param id The provided session ID.
     */
    public void setSessionID(int id) {
        this.sessionID = id;
    }
    
    /**
     * Sends sessionID to bank, and returns the existing auto pay settings.
     * @return 
     */
    public HashMap getCurrentInfo() {
        //Send sessionID to bank, retrieve existing auto pay settings;
        double routing = 11112;
        double account = 12345;
        double amount = 102.56;
        //Mock values from bank
        this.currentInfo.put("routing", routing);
        this.currentInfo.put("account", account);
        this.currentInfo.put("amount", amount);
        this.currentInfo.put("status", (double) 1);
        return this.currentInfo;
    }
    
}
