/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgmanualpay;

/**
 *
 * @author Team Rho
 */
public class ManualPay {
    
    private int sessionID;
    private final ManualPayUI manualUI;
    
    public ManualPay() {
        this.manualUI = new ManualPayUI(this);
        retrieveSessionID();
        initUI();
    }
    
    private void retrieveSessionID() {
        //Mock session ID
        this.sessionID = 12345;
    }
    
    private void initUI() {
        this.manualUI.setVisible(true);
    }
    
    public int sendBankPay(String routing, String account, String accountConfirm, String amount) {
        int status;
        //Communicate with bank, sending information
        int mockCommStatus = 1;// 1 = pass, 0 = fail
        status = mockCommStatus;
        //mock status = 1
        return status;
    }
    
    public int sendCardPay(String card, String cardConfirm, String expiry, String cvv, String amount) {
        int status;
        //Communicate with bank, sending information
        int mockCommStatus = 1;// 1 = pass, 0 = fail
        status = mockCommStatus;
        //mock status = 1
        return status;
    }
    
}
