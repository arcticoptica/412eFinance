package pkgcontact;

/**
 *
 * @author Nick Meyer
 */
public class ATZAddress extends ContactDetailsDecorator{
    ContactDetails ContactDetail;
    
    public ATZAddress (ContactDetailsInterface newDetails) {
        super(newDetails);
    }
    
    @Override
    public String contactInformation() {
        return addDetails.contactInformation() + "What is ATZ Financial's Address?\n " + ContactDetail.getATZaddress() + "\n";
    }
}
