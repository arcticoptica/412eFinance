package testharness;

import pkgautopayment.AutoPayment;
import pkgcheckbalance.CheckBalance;
import pkgcontact.ContactDetails;
import pkgcreateprofile.CreateProfile;
import pkgeditprofile.EditCustomerProfile;
import pkgloanoptions.LoanOptions;
import pkglogin.Authenticate;
import pkglogin.NewProfile;

/**
 *
 * @author Team Rho
 */
public class TestHarness {
    
    private AutoPayment autoPay;
    private CheckBalance checkBal;
    
    /**
     * Default constructor for TestHarness that runs tests.
     */
    public TestHarness() {
        testAutoPayment();
        testCheckBalance();
        
    }
    
    /**
     * Test for AutoPayment controller class.
     * <p>Test for AutoPayment class creates an instance of the class, then checks the 'getStatus' and 'setAutoPay' methods.
     */
    private void testAutoPayment() {
        System.out.println("Start of AutoPayment test");
        this.autoPay = new AutoPayment();
        if (this.autoPay.getStatus() == -1) {
            System.out.println(">getStatus: Pass");
            this.autoPay.setAutoPay("credit", 2, 3);
            if (this.autoPay.getStatus() == 0) {
                System.out.println(">setAutoPay: Pass");
            } else {
                System.out.println(">setAutoPay: Fail");
            }
        } else {
            System.out.println(">getStatus: Fail");
            System.out.println(">setAutoPay: Incomplete Test");
        }
        System.out.println("[End]");
    }
    
    /**
     * Test for CheckBalance controller class.
     * <p>Test for CheckBalance class creates an instance of the class, then checks the 'getBalance' method.
     */
    private void testCheckBalance() {
        System.out.println("Start of CheckBalance test");
        this.checkBal = new CheckBalance();
        if (this.checkBal.getBalance() == 0) {
            System.out.println(">getBalance: Pass");
        } else {
            System.out.println(">getBalance: Fail");
        }
        System.out.println("[End]");
    }
    
}
