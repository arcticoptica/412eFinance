package pkglogin;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Team Rho
 */
public class UserList {

    private final List<User> userList;

    /**
     * Default constructor for UserList class.
     */
    public UserList() {
        this.userList = new ArrayList<>();
    }

    /**
     * Public method to add elements to the user list.
     *
     * @param user Object of User type to be added to the list.
     */
    public void add(User user) {
        this.userList.add(user);
    }

    /**
     * Public method to retrieve User objects from the list.
     *
     * @param i Index of the target object.
     * @return Chosen object of User type.
     */
    public User get(int i) {
        return userList.get(i);
    }

    /**
     * Public method to print user list to console.
     */
    public void printResults() {
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));
        }
    }

    public int size() {
        return userList.size();
    }

    /**
     * Override of toString method that gives the userList.
     *
     * @return List summary of userList.
     */
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
