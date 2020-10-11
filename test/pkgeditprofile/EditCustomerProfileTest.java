/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgeditprofile;

import java.util.HashMap;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nick Meyer
 */
public class EditCustomerProfileTest {
    
    public EditCustomerProfileTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of editProfileInfo method, of class EditCustomerProfile.
     */
    @Test
    public void testEditProfileInfo() {
        System.out.println("editProfileInfo");
        HashMap<String, String> info = null;
        EditCustomerProfile instance = new EditCustomerProfile();
        instance.editProfileInfo(info);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class EditCustomerProfile.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        EditCustomerProfile instance = new EditCustomerProfile();
        int expResult = 0;
        int result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
