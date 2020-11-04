package pkglogin;

/**
 *
 * @author Team Rho
 */
public class User {
    
    private int userID;
    private String username;
    private String password;
    
    public User(int id, String name, String pw) {
        this.userID = id;
        this.username = name;
        this.password = pw;
    }
    
    public int getID() {
        return this.userID;
    }
    
    public String getName() {
        return this.username;
    }
    
    public String getPW() {
        return this.password;
    }
    
    public void setID(int id) {
        this.userID = id;
    }
    
    public void setName(String name) {
        this.username = name;
    }
    
    public void setPW(String pw) {
        this.password = pw;
    }
    
    @Override
    public String toString() {
        return "ID: " + userID + "; username: " + username + "; password: " + password;
    }
    
}
