package pkglogin;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Team Rho
 */
public class Authenticate {
    
    private final NewLoginUI newloginUI;
    
    /**
     * Default constructor for the Authenticate class.
     */
    public Authenticate() {
        this.newloginUI = new NewLoginUI(this);
        initUI();
    }
    
    private void initUI() {
        this.newloginUI.setVisible(true);
    }
    
    /**
     * Checks login credentials and sets the result status.
     * @param username Is the account identifier.
     * @param pw Is the account password.
     * @return 0 for login fail, 1 for login success, -1 for error.
     */
    public int userLogIn(String username, String pw) {
        int status = -1;
        UserList users;
        UserJson uj = new UserJson();
        try {
            uj.addMockUsers();
            users = uj.getUserList();
            status = 0;
            for (int i = 0; i < users.size(); i++) {
                if ((users.get(i).getUsername().equals(username)) && (users.get(i).getPW()).equals(pw)) {
                    status = 1;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Authenticate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
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
            Logger.getLogger(Authenticate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    
}
