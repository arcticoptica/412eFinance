package pkgcontact;

/**
 *
 * @author Team Rho
 */
public class ContactDetails {
    
    private String ATZphoneNumber = "";
    private String ATZemail = "";
    private String ATZaddress = "";
    
    /**
     * Default constructor for the ContactDetails class.
     */
    public ContactDetails(String ATZphoneNumber, String ATZemail, String ATZaddress) {
        this.ATZphoneNumber = ATZphoneNumber;
        this.ATZemail=ATZemail;
        this.ATZaddress=ATZaddress;
    }
    
    
    /**
     * Gives the current ATZ phone number.
     * @return The value of ATZ phone number.
     */
    public String getATZphoneNumber()
    {
        return ATZphoneNumber;
    }
    
    /**
     * Changes value of ATZ phone number.
     * Set the entered value of phone number.
     */
    public void setATZphoneNumber(String ATZphoneNumber)
    {
        this.ATZphoneNumber=ATZphoneNumber;
    }
    
    /**
     * Gives the current ATZ email.
     * @return The value of ATZ email.
     */
    public String getATZemail()
    {
        return ATZemail;
    }
    
    /**
     * Changes value of ATZ email.
     * Set the entered value of ATZ email.
     */
    public void setATZemail(String ATZemail)
    {
        this.ATZemail=ATZemail;
    }
    
    /**
     * Gives the current ATZ address.
     * @return The value of ATZ address.
     */
    public String getATZaddress()
    {
        return ATZaddress;
    }
    
    /**
     * Changes value of ATZ address.
     * Set the entered value of ATZ address.
     */
    public void setATZaddress(String ATZaddress)
    {
        this.ATZaddress=ATZaddress;
    }
    
    
    
    /**
     * Retrieves contact information and sets contactInfo.
     */
    //private void retrieveContactInfo() {
    //    this.contactInfo = "";
    //}
    
    /**
     * Calls method to update contactInfo, then returns the string.
     * @return A string containing contact information.
     */
    //public String getContactInfo() {
      //  retrieveContactInfo();
       // return this.contactInfo;
    //}
    
}
