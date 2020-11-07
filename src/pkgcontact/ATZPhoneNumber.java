package pkgcontact;

/**
 *
 * @author Nick Meyer
 */
public class ATZPhoneNumber extends ContactDetailsDecorator {
    ContactDetails ContactDetail;
    
    public ATZPhoneNumber (ContactDetailsInterface newDetails) {
        super(newDetails);
    }
    
    @Override
    public String contactInformation() {
        return addDetails.contactInformation() + "What is ATZ Financial's Phone Number?\n " + ContactDetail.getATZphoneNumber() + "\n";
    }
      
}
