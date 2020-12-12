package testharness;

import pkgautopayment.AutoPayment;
import pkgcheckbalance.CheckBalance;
import pkgcreateprofile.CreateProfile;
import pkglogin.Authenticate;
import pkgcontact.ContactDetails;

/**
 *
 * @author Team Rho
 */
public class TestHarness {

    private AutoPayment autoPay;
    private CheckBalance checkBal;
    private CreateProfile createProfile;
    private ContactDetails contactDetails;
    private Authenticate userAuth;

    /**
     * Default constructor for TestHarness that runs tests.
     */
    public TestHarness() {
        testAutoPayment();
        testCheckBalance();
        testCreateProfile();
        testContactDetails();
        testAuthenticate();
    }

    /**
     * Test for AutoPayment controller class.
     * <p>
     * Test for AutoPayment class creates an instance of the class, then checks
     * the 'setAutoPay' and 'getExistingAutoPay' methods.
     */
    private void testAutoPayment() {
        System.out.println("Start of AutoPayment test");
        this.autoPay = new AutoPayment();
        if (autoPay.setAutoPay("0000", "1111", "150") == 1) {
            System.out.println(">setAutoPay: Pass");
        } else {
            System.out.println(">setAutoPay: Fail");
        }
        if (autoPay.getExistingAutoPay() == 1) {
            System.out.println(">getExistingAutoPay: Pass");
        } else {
            System.out.println(">getExistingAutoPay: Fail");
        }
        System.out.println("[End]");
        System.out.println("");
    }
    
    /**
     * Test for CheckBalance controller class.
     * <p>
     * Test for CheckBalance class creates an instance of the class, then checks
     * the 'getBalance' method.
     */
    private void testCheckBalance() {
        System.out.println("Start of CheckBalance test");
        this.checkBal = new CheckBalance();
        if (this.checkBal.getBalance() != -1) {
            System.out.println(">getBalance: Pass");
        } else {
            System.out.println(">getBalance: Fail");
        }
        System.out.println("[End]");
        System.out.println("");
    }

    private void testCreateProfile() {
        System.out.println("Start of CreateProfile test");
        this.createProfile = new CreateProfile();
        if (createProfile.newUser("TestUser", "Password", "Date", "Address", "0000000000", "Test@email.com") == 0) {
            System.out.println(">newUser: Pass");
        } else {
            System.out.println(">newUser: Fail");
        }
        System.out.print("[End]");
        System.out.println("");
    }

    private void testContactDetails() {
        System.out.println("Start of ContactDetails test");
        this.contactDetails = new ContactDetails();
        if (contactDetails.getPhoneNumber().equals("1-800-111-2222")) {
            System.out.println(">getPhoneNumber: Pass");
        } else {
            System.out.println(">getPhoneNumber: Fail");
        }
        if (contactDetails.getEmail().equals("atzfinance@email.com")) {
            System.out.println(">getEmail: Pass");
        } else {
            System.out.println(">getEmail: Fail");
        }
        if (contactDetails.getAddress().equals("10 Some Street, New York")) {
            System.out.println(">getAddress: Pass");
        } else {
            System.out.println(">getAddress: Fail");
        }
        System.out.println("[End]");
        System.out.println("");
    }
    
    private void testAuthenticate() {
        System.out.println("Start of Authenticate test");
        this.userAuth = new Authenticate();
        String username = "Steve";
        String pw = "pass1";
        if (this.userAuth.userLogIn(username, pw) == 1) {
            System.out.println(">userLogIn: Pass");
        } else {
            System.out.println(">userLogIn: Fail");
        }
        System.out.println("[End]");
        System.out.println("");
    }
}
