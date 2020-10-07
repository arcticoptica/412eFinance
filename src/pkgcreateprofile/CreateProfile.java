package pkgcreateprofile;

/**
 *
 * @author Team Rho
 */
public class CreateProfile {
    
    private int status;
    
    /**
     * Default constructor for the CreateProfile class.
     */
    public CreateProfile() {
        this.status = -1;
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
     * Gives the current status.
     * @return The value of status.
     */
    public int getStatus() {
        return this.status;
    }
    
}
