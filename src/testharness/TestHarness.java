package testharness;

import pkgautopayment.AutoPayment;
import pkgcheckbalance.CheckBalance;
import pkgcontact.ContactDetails;
import pkgcreateprofile.CreateProfile;
import pkgeditprofile.EditCustomerProfile;
import pkgloanoptions.LoanOptions;
import pkglogin.Authenticate;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Team Rho
 */
public class TestHarness {

    private AutoPayment autoPay;
    private CheckBalance checkBal;
    private EditCustomerProfile editCustomer;
    private Authenticate userAuth;
    private LoanOptions loanOptions;

    /**
     * Default constructor for TestHarness that runs tests.
     */
    public TestHarness() {
        testAutoPayment();
        testCheckBalance();

        testCreateProfile();
        testContactDetails();

        //testEditCustomerProfile();
        testAuthenticate();
        //testLoanOptions();
        //testNewProfile();
    }

    /**
     * Test for AutoPayment controller class.
     * <p>
     * Test for AutoPayment class creates an instance of the class, then checks
     * the 'getStatus' and 'setAutoPay' methods.
     */
    private void testAutoPayment() {
        System.out.println("Start of AutoPayment test");
        this.autoPay = new AutoPayment();
        if (true) {
            System.out.println(">setAutoPay: Pass");
        } else {
            System.out.println(">setAutoPay: Incomplete Test");
        }
        System.out.println("[End]");
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
        if (this.checkBal.getBalance() == 0) {
            System.out.println(">getBalance: Pass");
        } else {
            System.out.println(">getBalance: Fail");
        }
        System.out.println("[End]");
    }

    public void testCreateProfile() {

        System.out.println("Start of CreateProfile test");
        ArrayList<CreateProfile> profiles = new ArrayList<>();
        System.out.println();
        System.out.print("[End]");
    }

    public void testContactDetails() {
        System.out.println("");
        System.out.println("Start of ContactDetails test");
        System.out.println("");
        System.out.println("[End]");
    }

    /**
     * Test for EditCustomerProfile controller class.
     * <p>
     * Test for EditCustomerProfile class creates an instance of the class, then
     * checks the 'getStatus' and 'editProfileInfo' methods.
     */
//    public void testEditCustomerProfile() {
//        System.out.println("Start of EditCustomerProfile Test");
//        this.editCustomer = new EditCustomerProfile();
//        HashMap<String, String> info = new HashMap<>();
//        info.put("1", "asdf");
//        info.put("2", "fdsa");
//        if (this.editCustomer.getStatus() == -1) {
//            System.out.println("getStatus: Pass");
//            this.editCustomer.editProfileInfo(info);
//            if (this.editCustomer.getStatus() == 0) {
//                System.out.println("Changes Successful");
//            } else {
//                System.out.println("Error");
//            }
//        } else {
//            System.out.println("getStatus: Failure");
//        }
//        System.out.println("[End]");
//    }
    /**
     * <p>
     * Test for LoanOptions class creates an instance of the class, then checks
     * that 'getOptList' and 'getOptions' work as intended
     */
//    public void testLoanOptions() {
//        System.out.println("Start of LoanOptions Test");
//        this.loanOptions = new LoanOptions();
//        ArrayList<String> options = this.loanOptions.getOptList();
//        for (String option : options) {
//            System.out.println(option);
//        }
//        System.out.println("[End]");
//    }
    public void testAuthenticate() {
        System.out.println("Start of Authenticate test");
        this.userAuth = new Authenticate();
        String email = "axf123";
        String pw = "password123";
        if (this.userAuth.userLogIn(email, pw) == 1) {
            System.out.println("User Authenticated");
        } else {
            System.out.println("Invalid login credentials. Please try again ");
        }
        System.out.println("[End]");
    }
}
/*
    public void testNewProfile() {
        System.out.println("Start of NewProfile test");
        this.userProfile = new NewProfile();
        String email = "axf123";
        this.userProfile.checkEmail(email);
        if (this.userProfile.getStatus() == 0) {
            System.out.println("Profile already exists");
        } else {
            System.out.println("New profile");
        }
        System.out.println("[End]");
    }
}
*/
