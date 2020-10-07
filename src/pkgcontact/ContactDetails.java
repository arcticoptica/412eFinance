package pkgcontact;

/**
 *
 * @author Team Rho
 */
public class ContactDetails {
    
    private String contactInfo;
    
    /**
     * Default constructor for the ContactDetails class.
     */
    public ContactDetails() {
        this.contactInfo = "";
    }
    
    /**
     * Retrieves contact information and sets contactInfo.
     */
    private void retrieveContactInfo() {
        this.contactInfo = "";
    }
    
    /**
     * Calls method to update contactInfo, then returns the string.
     * @return A string containing contact information.
     */
    public String getContactInfo() {
        retrieveContactInfo();
        return this.contactInfo;
    }
    
}
