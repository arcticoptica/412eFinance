package pkgcontact;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Nick Meyer
 */
public class ContactDetailsUI extends JFrame{
    
    private JPanel mainPanel;
    private JLabel contactsLabel;

    private final ContactDetailsInterface d_interface;
            
    public ContactDetailsUI (ContactDetailsInterface d_interface) {
        super();
        this.d_interface = d_interface;
        initWindow();
        initElements();
    }
    
    private void initWindow() {
        setTitle("eFinance - Contact Details");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainPanel = new JPanel();
        mainPanel.setBackground(Color.white);
        mainPanel.setLayout(new GridLayout(1,0));
        add(mainPanel);
    }
    
    private void initElements() {
        this.contactsLabel = new JLabel();
        contactsLabel.setText(new ATZAddress(new ATZEmail(new ATZPhoneNumber(new ContactDetailsInfo()))).toString());
        mainPanel.add(contactsLabel);
    }
    
}