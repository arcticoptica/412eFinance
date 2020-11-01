package pkgpopupmenu;

import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author Team Rho
 */
public class PopupMenu {
    
    private final JPopupMenu menu;
    private final JMenuItem home;
    private final JMenuItem autoPay;
    private final JMenuItem checkBal;
    private final JMenuItem profile;
    private final JMenuItem contact;
    
    /**
     * Default constructor for PopupMenu class.
     */
    public PopupMenu() {
        this.menu = new JPopupMenu("Menu");
        this.home = new JMenuItem("Home");
        this.autoPay = new JMenuItem("Auto Payment");
        this.checkBal = new JMenuItem("Account Balance");
        this.profile = new JMenuItem("Profile");
        this.contact = new JMenuItem("Contact Us");
        menu.add(home);
        menu.add(autoPay);
        menu.add(checkBal);
        menu.add(profile);
        menu.add(contact);
        initAction();
    }
    
    /**
     * Set up action listeners for each JMenuItem element.
     */
    private void initAction() {
        home.addActionListener((ActionEvent e) -> {
            //redirect to homepage
        });
        autoPay.addActionListener((ActionEvent e) -> {
            //redirect to autoPayment UI
        });
        checkBal.addActionListener((ActionEvent e) -> {
            //redirect to checkBalance UI
        });
        profile.addActionListener((ActionEvent e) -> {
            //redirect to editProfile UI
        });
        contact.addActionListener((ActionEvent e) -> {
            //redirect to contact UI
        });
    }
    
    /**
     * Public method to retrieve built JPopupMenu.
     * @return Built JPopupMenu.
     */
    public JPopupMenu getPopupMenu() {
        return this.menu;
    }
    
}
