package testharness;

import pkgautopayment.AutoPayment;
import pkgcheckbalance.CheckBalance;
import pkgcontact.ContactDetails;
import pkgcreateprofile.CreateProfile;
import pkgeditprofile.EditCustomerProfile;
import pkgloanoptions.LoanOptions;
import pkglogin.Authenticate;
import pkglogin.NewProfile;
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
    private NewProfile userProfile;
    private LoanOptions loanOptions;

    /**
     * Default constructor for TestHarness that runs tests.
     */
    public TestHarness() {
        testAutoPayment();
        testCheckBalance();

        testCreateProfile();
        testContactDetails();

        testEditCustomerProfile();

        testAuthenticate();
        testLoanOptions();
        testNewProfile();

        //CreateProfile Test Cases
        //Check for valid email
        CreateProfile profile1 = new CreateProfile("john123@gmail.com", "password1", "John", "Smith", "08/09/1987", 1);
        System.out.println(profile1.toString());

        //Get Email
        System.out.println("Email on profile: " + profile1.getEmail());

        //Get Password
        System.out.println("Password for profile: " + profile1.getPassword() + "\n");

        //get firstName
        System.out.println("First name on profile: " + profile1.getFirstName() + "\n");

        //get lastName
        System.out.println("Last name on profile: " + profile1.getLastName() + "\n");

        //get Date of Birth
        System.out.println("Date of birth on profile: " + profile1.getDoB() + "\n");

        //change email
        profile1.setEmail("smith123@gmail.com");
        System.out.println(profile1.toString());
        System.out.println();

        //change password
        profile1.setPassword("newPassword");
        System.out.println(profile1.toString());
        System.out.println();

        //change firstName
        profile1.setFirstName("Johnathan");
        System.out.println(profile1.toString());
        System.out.println();

        //change lastName
        profile1.setLastName("Doe");
        System.out.println(profile1.toString());
        System.out.println();

        //change date of birth
        profile1.setFirstName("10/09/1987");
        System.out.println(profile1.toString());
        System.out.println();

        //ContactDetails Test Cases
        ContactDetails contact1 = new ContactDetails("18001234567", "atzFinance@gmail.com", "1 Finance Road, Milwaukee, WI, 53201");
        System.out.println(profile1.toString());

        //Get ATZ phone number
        System.out.println("ATZ Finance Phone Number: " + contact1.getATZphoneNumber());

        //get ATZ email
        System.out.println("ATZ Finance Email: " + contact1.getATZemail());

        //get ATZ address
        System.out.println("ATZ Finance Address: " + contact1.getATZaddress());

        //change ATZ phone number
        contact1.setATZphoneNumber("18002223333");
        System.out.println(contact1.toString());
        System.out.println();

        //change ATZ email
        contact1.setATZemail("efinance@gmail.com");
        System.out.println(contact1.toString());
        System.out.println();

        //change ATZ address
        contact1.setATZaddress("100 Finance Road, Milwaukee, WI, 53202");
        System.out.println(contact1.toString());
        System.out.println();

    }

    /**
     * Test for AutoPayment controller class.
     * <p>
     * Test for AutoPayment class creates an instance of the class, then checks
     * the 'getStatus' and 'setAutoPay' methods.
     */
    
   
     private void testAutoPayment() {
       System.out.println("Start of AutoPayment test");
        this.autoPay = new AutoPayment("031000053", "111222333444", "100.00");
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

        CreateProfile profile1 = new CreateProfile("john123@gmail.com", "password1", "John", "Smith", "08/09/1987", 1);
        CreateProfile profile2 = new CreateProfile("jane456@gmail.com", "password2", "Jane", "Doe", "12/08/1992", 1);

        profiles.add(profile1);
        profiles.add(profile2);

        for (CreateProfile profile : profiles) {
            System.out.print(profile);
        }
        System.out.println();
        System.out.print("[End]");
    }

    public void testContactDetails() {
        System.out.println("");
        System.out.println("Start of ContactDetails test");

        ArrayList<ContactDetails> contacts = new ArrayList<>();

        ContactDetails contact1 = new ContactDetails("18001234567", "atzFinance@gmail.com", "1 Finance Road, Milwaukee, WI, 53201");

        contacts.add(contact1);

        for (ContactDetails contact : contacts) {
            System.out.print(contact);
        }
        System.out.println("");
        System.out.println("[End]");
    }

    /**
     * Test for EditCustomerProfile controller class.
     * <p>
     * Test for EditCustomerProfile class creates an instance of the class, then
     * checks the 'getStatus' and 'editProfileInfo' methods.
     */
    public void testEditCustomerProfile() {
        System.out.println("Start of EditCustomerProfile Test");
        this.editCustomer = new EditCustomerProfile();
        HashMap<String, String> info = new HashMap<>();
        info.put("1", "asdf");
        info.put("2", "fdsa");
        if (this.editCustomer.getStatus() == -1) {
            System.out.println("getStatus: Pass");
            this.editCustomer.editProfileInfo(info);
            if (this.editCustomer.getStatus() == 0) {
                System.out.println("Changes Successful");
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("getStatus: Failure");
        }
        System.out.println("[End]");
    }

    /**
     * <p>
     * Test for LoanOptions class creates an instance of the class, then checks
     * that 'getOptList' and 'getOptions' work as intended
     */
    public void testLoanOptions() {
        System.out.println("Start of LoanOptions Test");
        this.loanOptions = new LoanOptions();
        ArrayList<String> options = this.loanOptions.getOptList();
        for (String option : options) {
            System.out.println(option);
        }
        System.out.println("[End]");
    }

    public void testAuthenticate() {
        System.out.println("Start of Authenticate test");
        this.userAuth = new Authenticate();
        String email = "axf123";
        String pw = "password123";
        this.userAuth.userLogIn(email, pw);
        if (this.userAuth.getStatus() == 0) {
            System.out.println("User Authenticated");
        } else {
            System.out.println("Invalid login credentials. Please try again ");
        }
        System.out.println("[End]");
    }

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

