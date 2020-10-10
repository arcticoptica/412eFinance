package pkgcreateprofile;

/**
 *
 * @author Team Rho
 */
public class CreateProfile {
    
    private String email = "";
    private String password = "";
    private String firstName = "";
    private String lastName = "";
    private String DoB = "";
    private int status;
    
    /**
     * Default constructor for the CreateProfile class.
     */
    public CreateProfile(String email, String password, String firstName, String lastName,
    String DoB, int status) 
    {
        this.email=email;
        this.password = password;
        this.firstName=firstName;
        this.lastName=lastName;
        this.DoB= DoB;
        this.status = -1;
    }
    
     /**
     * Gives the current email.
     * @return The value of email.
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Changes value of email.
     * Set the entered value of email.
     */
    public void setEmail(String email)
    {
        this.email=email;
    }
    
    /**
     * Gives the current password.
     * @return The value of password.
     */
    public String getPassword()
    {
        return password;
    }
    
    /**
     * Changes value of password.
     * Set the entered value of password.
     */
    public void setPassword(String password)
    {
        this.password=password;
    }
    
    /**
     * Gives the current firstName.
     * @return The value of firstName.
     */
    public String getFirstName()
    {
        return firstName;
    }
    
     /**
     * Changes value of firstName.
     * Set the entered value of firstName.
     */
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    
    /**
     * Gives the current lastName.
     * @return The value of lastName.
     */
    public String getLastName()
    {
        return lastName;
    }
    
    /**
     * Changes value of lastName.
     * Set the entered value of lastName.
     */
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
     
    /**
     * Gives the current DoB.
     * @return The value of DoB.
     */
    public String getDoB()
    {
        return DoB;
    }
    
    /**
     * Changes value of DoB.
     * Set the entered value of DoB.
     */
    public void setDoB(String DoB)
    {
        this.DoB=DoB;
    }
    
    /**
     * Passes info to system and sets the result status.
     * @param email Is the account identifier.
     * @param info The information provided by the user.
     */
    public void createUserProfile(String email, String info) {
        this.status = 0;
    }
   
    /**
     * Returns the attributes of the CreateProfile class as a string.
     * @return The attributes of the CreateProfile class.
     */
    @Override
    public String toString()
    {
        return "Email: " + email + "\nPassword: " + password +
                "\nFirst Name: " + firstName + "\nLast Name: " + lastName +
                "\nDate of Birth: " + DoB + "/nStatus: " + status;
    }
    
    /**
     * Gives the current status.
     * @return The value of status.
     */
    public int getStatus() {
        return this.status;
    }
    
}
