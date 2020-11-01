package pkgcheckbalance;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Team Rho
 */
public class CheckBalanceUI extends JFrame {
    
    private JPanel mainPanel;
    private JPanel northPanel;
    private JPanel southPanel;
    private JLabel balanceLabel;
    private JLabel upcomingLabel;
    private JTextField balanceField;
    private JTextField upcomingField;
    private JButton backButton;
    
    private final CheckBalance cntl;
    
    /**
     * Default constructor for the CheckBalance UI class.
     * @param cntl passes parent controller in.
     */
    public CheckBalanceUI (CheckBalance cntl) {
        super();
        this.cntl = cntl;
        initWindow();
        initElements();
    }
    
    /**
     * Initializes and sets up the window and adds in the JPanels.
     */
    private void initWindow() {
        setTitle("eFinance - Check Balance");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainPanel = new JPanel();
        mainPanel.setBackground(Color.white);
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.gridheight = 4;
        gbc1.weightx = 0.1;
        gbc1.weighty = 0.5;
        gbc1.fill = GridBagConstraints.BOTH;
        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.gridy = 4;
        gbc2.weightx = 0.1;
        gbc2.weighty = 0.1;
        gbc2.fill = GridBagConstraints.BOTH;
        this.northPanel = new JPanel();
        this.southPanel = new JPanel();
        mainPanel.add(northPanel, gbc1);
        mainPanel.add(southPanel, gbc2);
        add(mainPanel);
    }
    
    /**
     * Initializes and sets up the Swing elements on the JPanels.
     */
    private void initElements() {
        this.balanceLabel = new JLabel();
        balanceLabel.setText("Current Account Balance:");
        this.upcomingLabel = new JLabel();
        upcomingLabel.setText("Upcoming Payment Due:");
        this.balanceField = new JTextField();
        balanceField.setPreferredSize(new Dimension(200,30));
        balanceField.setEditable(false);
        this.upcomingField = new JTextField();
        upcomingField.setPreferredSize(new Dimension(200,30));
        upcomingField.setEditable(false);
        this.backButton = new JButton("Back");
        northPanel.add(balanceLabel);
        northPanel.add(balanceField);
        northPanel.add(upcomingLabel);
        northPanel.add(upcomingField);
        southPanel.add(backButton);
    }
    
    /**
     * Callable method that fills in the text fields.
     * @param balance String for current balance.
     * @param upcoming String for upcoming payment.
     */
    public void setContents(String balance, String upcoming) {
        this.balanceField.setText(balance);
        this.upcomingField.setText(upcoming);
    }
    
    /**
     * Callable method to add an action listener to the back button.
     * @param ae Provided action listener.
     */
    public void setBackButtonListener(ActionListener ae) {
        this.backButton.addActionListener(ae);
    }
    
}
