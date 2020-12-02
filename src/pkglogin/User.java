package pkglogin;

/**
 *
 * @author Team Rho
 */
public class User {
    
    private int userID;
    private String username;
    private String password;
    private String email = "";
    private String firstName = "";
    private String lastName = "";
    private String DoB = "";
    /**
     * Default constructor of User class.
     * @param id User's ID number.
     * @param name User's name.
     * @param pw User's password.
     */
    public User(int id, String email, String username, String pw, String firstName, String lastName, String DoB) {
        
        this.userID = id;
        this.email = email;
        this.username = username;
        this.password = pw;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DoB = DoB;
    }
    
    
    /**
     * Public method to retrieve user's ID.
     * @return User's ID number.
     */
    public int getID() {
        return this.userID;
    }
    
    /**
     * Public method to retrieve user's name.
     * @return User's name.
     */
   
     /**
     * Gives the current email.
     * @return The value of email.
     */
    public String getEmail()
    {
        return email;
    }
    
    
    public String getUsername() {
        return this.username;
    }
    
    /**
     * Public method to retrieve user's password.
     * @return User's password.
     */
    public String getPW() {
        return this.password;
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
     * Gives the current lastName.
     * @return The value of lastName.
     */
    public String getLastName()
    {
        return lastName;
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
     * Passes info to system and sets the result status.
     * @param email Is the account identifier.
     * @param info The information provided by the user.
    
    /**
     * Public method to set user's ID.
     * @param id User's new ID number.
     */
    public void setID(int id) {
        this.userID = id;
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
     * Public method to set user's name.
     * @param name User's new name.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * Public method to set user's password.
     * @param pw User's new password.
     */
    public void setPW(String pw) {
        this.password = pw;
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
     * Changes value of lastName.
     * Set the entered value of lastName.
     */
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
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
     * Override of toString that gives the user's information.
     * @return Summary of user's information.
     */
    @Override
    public String toString() {
        return "ID: " + userID + "Email: "+ email + "; username: " + username + "; password: " + password 
                +"First name: " + firstName + "Last name: " + lastName + "Date of Birth: " + DoB;
    }
    
}
