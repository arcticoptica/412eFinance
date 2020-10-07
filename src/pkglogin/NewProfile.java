package pkglogin;

/**
 *
 * @author Team Rho
 */
public class NewProfile {
    
    private int status;
    
    /**
     * Default constructor for the NewProfile class.
     */
    public NewProfile() {
        this.status = -1;
    }
    
    /**
     * Checks if provided email is an existing customer and sets the result status.
     * @param email Is the account identifier.
     */
    public void checkEmail(String email) {
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
