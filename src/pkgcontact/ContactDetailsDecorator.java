package pkgcontact;


/**
 *
 * @author Nick Meyer
 */
public abstract class ContactDetailsDecorator implements ContactDetailsInterface{
    protected ContactDetailsInterface addDetails;

    public ContactDetailsDecorator(ContactDetailsInterface newDetails) {
        addDetails = newDetails;
    }
    
    @Override
    public String contactInformation() {
        return addDetails.contactInformation();
    }
}
