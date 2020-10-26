package pkgautopayment;

/**
 *
 * @author Elitza Georgieva
 */
public class AutoPayment {
    
    private int status;
    
    private String routingNumber = "";
    private String bankAccountNumber = "";
    private String paymentAmount;
    /**
     * Default constructor for the AutoPayment class.
     */
    public AutoPayment(String routingNumber, String bankAccountNumber, String paymentAmount) {
        //this.status = -1;
        
        this.routingNumber=routingNumber;
        this.bankAccountNumber=bankAccountNumber;
        this.paymentAmount=paymentAmount;
    }
    
     /**
     * Gives the current routing number.
     * @return The value of routing number.
     */
    public String getRoutingNumber()
    {
        return routingNumber;
    }
    
    /**
     * Changes value of routing number.
     * Set the entered value of routing number.
     */
    public void setRoutingNumber(String routingNumber)
    {
        this.routingNumber=routingNumber;
    }
   
     /**
     * Gives the current bank account number.
     * @return The value of bank account number.
     */
    public String getBankAccountNumber()
    {
        return bankAccountNumber;
    }
    
    /**
     * Changes value of bank account number.
     * Set the entered value of bank account number.
     */
    public void setBankAccountNumber(String bankAccountNumber)
    {
        this.bankAccountNumber=bankAccountNumber;
    }
    
     /**
     * Gives the current amount to be withdrawn every month for automatic payment (payAmount).
     * @return The value of the amount to be withdrawn every month for automatic payment (payAmount).
     */
    public String getPaymentAmount()
    {
        return paymentAmount;
    }
    
    /**
     * Changes value of the amount to be withdrawn every month for automatic payment (payAmount).
     * Set the entered value of the amount to be withdrawn every month for automatic payment (payAmount).
     */
    public void setPaymentAmount(String payAmount)
    {
        this.paymentAmount=paymentAmount;
    }
    
    
    /**
     * Passes info to system and sets the result status.
     * @param routingNumber Information about the routing number of the chosen bank account payment.
     * @param bankAccountNumber Information about the bank account number of the chosen bank account payment.
     * @param payAmount Chosen amount of time for payments.
     */
    public void setAutoPay(String routingNumber, int bankAccountNumber, int payAmount) {
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
