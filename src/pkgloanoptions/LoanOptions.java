package pkgloanoptions;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Team Rho
 */
public class LoanOptions {
    
    private List<String> optList;
    
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
        this.optList = new ArrayList<>();
    }
    
    /**
     * Calls method to update optList, then returns the list.
     * @return The list of loan options.
     */
    public List getOptList() {
        retrieveList();
        return this.optList;
    }
    
}
