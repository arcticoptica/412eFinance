package pkgloanoptions;

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
    private void retrieveList() {
       //what is best way to retrieve in future? Maybe utilize a text file if we have 5+ loan options
        optList.add("opt1");
        optList.add("opt2");
    }
    
    /**
     * Calls method to update optList, then returns the array list.
     * @return The list of loan options.
     */
    public ArrayList getOptList() {
        retrieveList();
        return this.optList;
    }
    
}

