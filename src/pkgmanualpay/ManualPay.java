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
    
    private final ManualPayUI manualUI;
    
    public ManualPay() {
        this.manualUI = new ManualPayUI();
        this.manualUI.setVisible(true);
    }
    
}
