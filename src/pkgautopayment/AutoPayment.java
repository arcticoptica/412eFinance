package pkgautopayment;

import java.util.HashMap;

/**
 *
 * @author Team Rho
 */
public class AutoPayment {
    
    private int sessionID;
    private final AutoPayUI autopayUI;
    private final AutoPayInfo autopayInfo;
    
    /**
     * Default constructor for the AutoPayment class.
     */
    public AutoPayment() {
        this.sessionID = -1;
        this.autopayUI = new AutoPayUI(this);
        this.autopayInfo = new AutoPayInfo();
        retrieveSessionID();
        initUI();
    }
    
    private void retrieveSessionID() {
        //Mock session ID
        this.sessionID = 12345;
    }
    
    private void initUI() {
        this.autopayUI.setVisible(true);
    }
    
    /**
     * Passes info to bank and returns success status;
     * @param routingNumber The routing number of the chosen bank account.
     * @param bankAccountNumber The bank account number of the chosen bank account.
     * @param payAmount Chosen amount of money per payment.
     * @return Status of communication with servers.
     */
    public int setAutoPay(String routingNumber, String bankAccountNumber, String payAmount) {
        int status;
        double routing = Double.parseDouble(routingNumber);
        double bankAccount = Double.parseDouble(bankAccountNumber);
        double amount = Double.parseDouble(payAmount);
        //Communicate with bank, sending information
        int mockCommStatus = 1;// 1 = pass, 0 = fail
        //mock status = 1
        status = mockCommStatus;
        return status;
    }
    
    /**
     * Calls bank communication class and retrieves info, then sets UI text.
     * @return A status indicating whether an auto pay plan exists.
     */
    public int getExistingAutoPay() {
        int status;
        this.autopayInfo.setSessionID(sessionID);
        HashMap info = this.autopayInfo.getCurrentInfo();
        status = (int) ((double)(info.get("status")));
        if (status == 1) {
            this.autopayUI.setRoutingField(String.valueOf(info.get("routing")));
            this.autopayUI.setAccountField(String.valueOf(info.get("account")));
            this.autopayUI.setAmountField(String.valueOf(info.get("amount")));
        } else {
            this.autopayUI.setRoutingField("");
            this.autopayUI.setAccountField("");
            this.autopayUI.setAmountField("");
        }
        return status;
    }
    
}
