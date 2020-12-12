package pkgcreateprofile;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkglogin.UserJson;
import pkglogin.UserList;

/**
 *
 * @author Team Rho
 */
public class CreateProfile {

    private final CreateProfileUI profileUI;

    /**
     * Default constructor for the CreateProfile class.
     */
    public CreateProfile() {
        this.profileUI = new CreateProfileUI(this);
        initUI();
    }
    
    private void initUI() {
        this.profileUI.setVisible(true);
    }
    
    public int newUser(String username, String password, String dob, String address, String phoneNumber, String email) {
        int status = -1;
        UserList users;
        UserJson uj = new UserJson();
        try {
            uj.addMockUsers();
            users = uj.getUserList();
            status = 0;
            for (int i = 0; i < users.size(); i++) {
                if ((users.get(i).getUsername().equals(username)) || (users.get(i).getPW()).equals(password)) {
                    status=-1;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CreateProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
    
}
