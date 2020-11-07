package pkglogin;

/**
 *
 * @author Team Rho
 */
public class User {
    
    private int userID;
    private String username;
    private String password;
    
    /**
     * Default constructor of User class.
     * @param id User's ID number.
     * @param name User's name.
     * @param pw User's password.
     */
    public User(int id, String name, String pw) {
        this.userID = id;
        this.username = name;
        this.password = pw;
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
    public String getName() {
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
     * Public method to set user's ID.
     * @param id User's new ID number.
     */
    public void setID(int id) {
        this.userID = id;
    }
    
    /**
     * Public method to set user's name.
     * @param name User's new name.
     */
    public void setName(String name) {
        this.username = name;
    }
    
    /**
     * Public method to set user's password.
     * @param pw User's new password.
     */
    public void setPW(String pw) {
        this.password = pw;
    }
    
    /**
     * Override of toString that gives the user's information.
     * @return Summary of user's information.
     */
    @Override
    public String toString() {
        return "ID: " + userID + "; username: " + username + "; password: " + password;
    }
    
}
