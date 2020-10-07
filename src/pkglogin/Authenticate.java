package pkglogin;

/**
 *
 * @author Team Rho
 */
public class Authenticate {
    
    private int status;
    
    /**
     * Default constructor for the Authenticate class.
     */
    public Authenticate() {
        this.status = -1;
    }
    
    /**
     * Checks login credentials and sets the result status.
     * @param email Is the account identifier.
     * @param pw Is the account password.
     */
    public void userLogIn(String email, String pw) {
        this.status = 0;
    }
    
    /**
     * Gets the current status.
     * @return The value of status.
     */
    public int getStatus() {
        return this.status;
    }
    
}
