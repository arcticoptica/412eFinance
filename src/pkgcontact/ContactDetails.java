package pkgcontact;

/**
 *
 * @author Team Rho
 */
public class ContactDetails {
    
    private String ATZphoneNumber;
    private String ATZemail;
    private String ATZaddress;
    private final ContactDetailsUI contactUI;
    
    /**
     * Default constructor for the ContactDetails class.
     */
    public ContactDetails() {
        this.ATZphoneNumber = "";
        this.ATZemail = "";
        this.ATZaddress = "";
        this.contactUI = new ContactDetailsUI();
        initUI();
    }
    
    private void initUI() {
        this.contactUI.setPhoneField(getPhoneNumber());
        this.contactUI.setEmailField(getEmail());
        this.contactUI.setAddressField(getAddress());
        this.contactUI.setVisible(true);
    }
    
    /**
     * Retrieves the ATZ phone number, then returns it.
     * @return The value of ATZ phone number.
     */
    public String getPhoneNumber() {
        //Mock phone number
        this.ATZphoneNumber = "1-800-111-2222";
        return ATZphoneNumber;
    }
    
    /**
     * Retrieves the ATZ email, then returns it.
     * @return The value of ATZ email.
     */
    public String getEmail() {
        this.ATZemail = "atzfinance@email.com";
        return ATZemail;
    }
    
    /**
     * Retrieves the ATZ office address, then returns it.
     * @return The value of ATZ address.
     */
    public String getAddress() {
        this.ATZaddress = "10 Some Street, New York";
        return ATZaddress;
    }
    
}
