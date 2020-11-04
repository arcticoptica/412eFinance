package pkglogin;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Team Rho
 */
public class UserList {
    
    private final List<User> userList;
    
    public UserList() {
        this.userList = new ArrayList<>();
    }
    
    public void add(User user) {
        this.userList.add(user);
    }
    
    public User get(int i) {
        return userList.get(i);
    }
    
    public void printResults() {
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));
        }
    }
    
    @Override
    public String toString() {
        String output = "[";
        for (int i = 0; i < userList.size() - 1; i++) {
            output += userList.get(i) + ", ";
        }
        output += userList.get(userList.size() - 1) + "]";
        return output;
    }
    
}
