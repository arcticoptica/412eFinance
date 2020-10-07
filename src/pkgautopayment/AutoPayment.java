package pkgautopayment;

/**
 *
 * @author Team Rho
 */
public class AutoPayment {
    
    private int status;
    
    /**
     * Default constructor for the AutoPayment class.
     */
    public AutoPayment() {
        this.status = -1;
    }
    
    /**
     * Passes info to system and sets the result status.
     * @param payMethod Information about the chosen method of payment.
     * @param frequency Indicates choice of weekly or monthly payments.
     * @param timePeriod Chosen amount of time for payments.
     */
    public void setAutoPay(String payMethod, int frequency, int timePeriod) {
        this.status = 0;
    }
    
    /**
     * Gives the current status.
     * @return The value of status.
     */
    public int getStatus() {
        return this.status;
    }
    
}
