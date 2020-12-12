package pkgpopupmenu;

import java.awt.Point;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import main.eFinanceMainController;

/**
 *
 * @author Team Rho
 */
public class PopupMenu {
    
    private final JPopupMenu menu;
    private final JMenuItem home;
    private final JMenuItem autoPay;
    private final JMenuItem checkBal;
    private final JMenuItem manualPay;
    private final JMenuItem contact;
    private final JFrame parent;
    
    /**
     * Default constructor for PopupMenu class.
     * @param parent Parent JFrame that holds the pop up menu.
     */
    public PopupMenu(JFrame parent) {
        this.menu = new JPopupMenu("Menu");
        this.home = new JMenuItem("Home");
        this.autoPay = new JMenuItem("Auto Payment");
        this.checkBal = new JMenuItem("Account Balance");
        this.manualPay = new JMenuItem("Manual Payment");
        this.contact = new JMenuItem("Contact Us");
        this.parent = parent;
        menu.add(home);
        menu.add(checkBal);
        menu.add(autoPay);
        menu.add(manualPay);
        menu.add(contact);
        initAction();
    }
    
    /**
     * Set up action listeners for each JMenuItem element.
     */
    private void initAction() {
        home.addActionListener((ActionEvent e) -> {
            eFinanceMainController.showMainMenu();
            cleanUp();
        });
        autoPay.addActionListener((ActionEvent e) -> {
            eFinanceMainController.showAutoPayment();
            cleanUp();
        });
        checkBal.addActionListener((ActionEvent e) -> {
            eFinanceMainController.showCheckBalance();
            cleanUp();
        });
        manualPay.addActionListener((ActionEvent e) -> {
            eFinanceMainController.showManualPayment();
            cleanUp();
        });
        contact.addActionListener((ActionEvent e) -> {
            eFinanceMainController.showContactDetails();
            cleanUp();
        });
    }
    
    /**
     * Private method to close the pop up menu and its parent container.
     */
    private void cleanUp() {
        this.menu.setVisible(false);
        this.parent.dispose();
    }
    
    /**
     * Public method to retrieve built JPopupMenu.
     * @return Built JPopupMenu.
     */
    public JPopupMenu getPopupMenu() {
        return this.menu;
    }
    
    public void setPopupLocation(Point p) {
        this.menu.setLocation(p.x, p.y + 25);
    }
    
}
