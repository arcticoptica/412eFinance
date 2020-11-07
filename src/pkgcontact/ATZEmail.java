package pkgcontact;

/**
 *
 * @author Nick Meyer
 */
public class ATZEmail extends ContactDetailsDecorator {
    ContactDetails ContactDetail;
    
    public ATZEmail (ContactDetailsInterface newDetails) {
        super(newDetails);
    }
    
    @Override
    public String contactInformation() {
        return addDetails.contactInformation() + "What is ATZ Financial's Email?\n " + ContactDetail.getATZemail() + "\n";
    }
}
