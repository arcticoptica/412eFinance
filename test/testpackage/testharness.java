package testpackage;

import java.util.ArrayList;
import pkgcontact.ContactDetails;
import pkgcreateprofile.CreateProfile;
/**
 *
 * @author 
 */
public class testharness {
    
    public testharness()
    {
        testCreateProfile();
        testContactDetails();
        
        //CreateProfile Test Cases
        //Check for valid email
        CreateProfile profile1 = new CreateProfile("john123@gmail.com","password1","John", "Smith", "08/09/1987", 1);
        System.out.println(profile1.toString());
        
        //Get Email
        System.out.println("Email on profile: "+profile1.getEmail());
        
        //Get Password
        System.out.println("Password for profile: "+profile1.getPassword()+"\n");
        
        //get firstName
        System.out.println("First name on profile: "+profile1.getFirstName()+"\n");
        
        //get lastName
        System.out.println("Last name on profile: "+profile1.getLastName()+"\n");
        
        //get Date of Birth
        System.out.println("Date of birth on profile: "+profile1.getDoB()+"\n");
        
        //change email
        profile1.setEmail("smith123@gmail.com");
        System.out.println(profile1.toString());
        System.out.println();
        
        //change password
        profile1.setPassword("newPassword");
        System.out.println(profile1.toString());
        System.out.println();
        
        //change firstName
        profile1.setFirstName("Johnathan");
        System.out.println(profile1.toString());
        System.out.println();
        
        //change lastName
        profile1.setLastName("Doe");
        System.out.println(profile1.toString());
        System.out.println();
        
        //change date of birth
        profile1.setFirstName("10/09/1987");
        System.out.println(profile1.toString());
        System.out.println();
        
        
        
        //ContactDetails Test Cases
        ContactDetails contact1 = new ContactDetails("18001234567","atzFinance@gmail.com","1 Finance Road, Milwaukee, WI, 53201");
        System.out.println(profile1.toString());
        
        //Get ATZ phone number
        System.out.println("ATZ Finance Phone Number: "+contact1.getATZphoneNumber());
        
        //get ATZ email
        System.out.println("ATZ Finance Email: "+contact1.getATZemail());
        
        //get ATZ address
        System.out.println("ATZ Finance Address: "+contact1.getATZaddress());
        
        //change ATZ phone number
        contact1.setATZphoneNumber("18002223333");
        System.out.println(contact1.toString());
        System.out.println();
        
        //change ATZ email
        contact1.setATZemail("efinance@gmail.com");
        System.out.println(contact1.toString());
        System.out.println();
        
        //change ATZ address
        contact1.setATZaddress("100 Finance Road, Milwaukee, WI, 53202");
        System.out.println(contact1.toString());
        System.out.println();
        
    }
    
    public void testCreateProfile()
        {
            ArrayList<CreateProfile> profiles= new ArrayList<>();
            
            CreateProfile profile1 = new CreateProfile("john123@gmail.com","password1","John", "Smith", "08/09/1987", 1);
            CreateProfile profile2 = new CreateProfile("jane456@gmail.com","password2","Jane", "Doe", "12/08/1992", 1);
   
            profiles.add(profile1);
            profiles.add(profile2);
            
            for(CreateProfile profile: profiles)
            {
               System.out.print(profile);
            }
        }
    
    public void testContactDetails()
        {
            ArrayList<ContactDetails> contacts= new ArrayList<>();
            
            ContactDetails contact1 = new ContactDetails("18001234567","atzFinance@gmail.com","1 Finance Road, Milwaukee, WI, 53201");
             
            contacts.add(contact1);

            for(ContactDetails contact: contacts)
            {
               System.out.print(contact);
            }
        }
    
}
