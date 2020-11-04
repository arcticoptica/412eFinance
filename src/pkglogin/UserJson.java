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
    
    public UserJson() {
        this.targetFile = "src/pkglogin/users.json";
        this.userList = new UserList();
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }
    
    public void fromJson() throws FileNotFoundException {
        userList = gson.fromJson(new FileReader(targetFile), userList.getClass());
    }
    
    public void toJson() throws FileNotFoundException {
        String jsonString = gson.toJson(userList);
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(targetFile, false))) {
            writer.print(jsonString);
        }
    }
    
    public void addMockUsers() throws FileNotFoundException {
        User u1 = new User(00001, "Steve", "pass1");
        User u2 = new User(00002, "Thomas", "pass2");
        User u3 = new User(00003, "Mary", "pass3");
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
        this.toJson();
    }
    
}
