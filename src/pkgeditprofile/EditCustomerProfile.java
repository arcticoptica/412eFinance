package pkgeditprofile;

import java.util.HashMap;

/**
 *
 * @author Team Rho
 */
public class EditCustomerProfile {
    
    private int status;
    
    /**
     * Default constructor for the EditCustomerProfile class.
     */
    public EditCustomerProfile() {
        this.status = -1;
    }
    
    /**
     * Passes info to system and sets the result status.
     * @param info HashMap indicating what is to be replaced.
     */
    public void editProfileInfo(HashMap<String, String> info) {
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
