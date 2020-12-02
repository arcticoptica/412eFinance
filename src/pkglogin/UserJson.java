package pkglogin;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 *
 * @author Team Rho
 */
public class UserJson {
    
    private final String targetFile;
    private UserList userList;
    private final Gson gson;
    
    /**
     * Default constructor for UserJson class.
     */
    public UserJson() {
        this.targetFile = "src/pkglogin/users.json";
        this.userList = new UserList();
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }
    
    /**
     * Reads from json file and fills user list.
     * @throws FileNotFoundException If users.json does not exist.
     */
    public void fromJson() throws FileNotFoundException {
        userList = gson.fromJson(new FileReader(targetFile), userList.getClass());
    }
    
    /**
     * Reads from user list and writes to json file.
     * @throws FileNotFoundException If users.json does not exist.
     */
    public void toJson() throws FileNotFoundException {
        String jsonString = gson.toJson(userList);
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(targetFile, false))) {
            writer.print(jsonString);
        }
    }
    
    /**
     * Public method to retrieve user list.
     * @return The list of users.
     */
    public UserList getUserList() {
        return this.userList;
    }
    
    /**
     * Public method to add mock users to the user list (for testing purposes).
     * @throws FileNotFoundException If users.json does not exist.
     */
    public void addMockUsers() throws FileNotFoundException {
        User u1 = new User(00001, "steve01@gmail.com", "Steve", "pass1", "Steve", "Ryan", "11/02/1986");
        User u2 = new User(00002, "thomas@yahoo.com", "Thomas", "pass2", "Thomas", "Rodgers", "02/09/1997");
        User u3 = new User(00003, "mary76@hotmail.com","Mary", "pass3", "Mary", "Smith", "06/28/1976");
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
        this.toJson();
    }
    
}
