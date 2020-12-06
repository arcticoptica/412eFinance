package pkgautopayment;

/**
 *
 * @author Team Rho
 */
public class AutoPayment {
    
    private final AutoPayUI autopayUI;
    
    /**
     * Default constructor for the AutoPayment class.
     */
    public AutoPayment() {
        this.autopayUI = new AutoPayUI(this);
        initUI();
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
        int status = -1;
        double routing = Double.parseDouble(routingNumber);
        double bankAccount = Double.parseDouble(bankAccountNumber);
        double amount = Double.parseDouble(payAmount);
        //Communicate with bank, sending information
        int mockCommStatus = 1;// 1 = pass, 0 = fail
        //mock status = 1
        status = mockCommStatus;
        return status;
    }
    
}
