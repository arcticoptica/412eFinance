package pkgloanoptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.List;

/**
 *
 * @author Team Rho
 */
public class LoanOptions {
    
    private final ArrayList<String> optList;
    
    /**
     * Default constructor for the LoanOptions class.
     */
    public LoanOptions() {
        this.optList = new ArrayList<>();
    }
    
    /**
     * Retrieves list of loan options and sets optList.
     */
    private void retrieveList() throws FileNotFoundException, IOException {
       BufferedReader readFile = new BufferedReader(new FileReader("loanOpt.txt"));
       
       String line = readFile.readLine();
       while (line != null) {
           optList.add(line);
           line = readFile.readLine();
       }
       
       readFile.close();
    }
    
    /**
     * Calls method to update optList, then returns the array list.
     * @return The list of loan options.
     */
    public ArrayList getOptList() throws IOException {
        retrieveList();
        return this.optList;
    }
    
}

