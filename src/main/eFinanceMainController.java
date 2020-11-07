package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import pkgcheckbalance.CheckBalanceUI;

public class eFinanceMainController {
    
    private JButton checkBalanceButton;
    private CheckBalanceUI CheckBalanceCall;
    
    public eFinanceMainController() {
        
    }
    
    public void setButtonListener(ActionListener ae) {
        checkBalanceButton.addActionListener(ae);
    }
    
    public void callUI() {
        CheckBalanceCall.setBackButtonListener((ActionEvent e) -> {
            System.out.println("Placeholder: Check Balance button pressed.");
        });
    }
    
}
