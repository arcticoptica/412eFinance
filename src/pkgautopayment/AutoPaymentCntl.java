/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgautopayment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author elitzageorgieva
 */
public class AutoPaymentCntl implements ActionListener{
    
    AutoPaymentList theAutoPaymentList;
    ArrayList<AutoPayment> list = new ArrayList<>();
    public int listSize = list.size();
    AutoPayUI theAutoPayUI;

         /**
         * Set AutoPaymentUI to visible.
         */
    
    public AutoPaymentCntl()
    {
        theAutoPaymentList=new AutoPaymentList();
        list=theAutoPaymentList.getAutoPaymentList();
        
        
        theAutoPayUI=new AutoPayUI(list);
        theAutoPayUI.setVisible(true);
        theAutoPayUI.submitButton.addActionListener(this);

    }
    
    public AutoPayment getAutoPay(int row)
    {
        return list.get(row);
    }
    
    public ArrayList<AutoPayment> getList(){
        return list;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object action = e.getSource();

        /**
         * Submit button
         * When the submit button is pressed, the text entered in the three fields by the user for routing number,
         * bank account number, and payment amount will be added to the arrayList AutoPaymentList.
         */
        if(action==theAutoPayUI.submitButton)
        {
            
            String newRoutingNumber=theAutoPayUI.routingNumberText.getText();
            String newBankAccountNumber=theAutoPayUI.accountNumberText.getText();
            String newPaymentAmount=theAutoPayUI.autoPayAmountText.getText();
            
            list.get(theAutoPayUI.currentAutoPayment).setRoutingNumber(newRoutingNumber);
            list.get(theAutoPayUI.currentAutoPayment).setBankAccountNumber(newBankAccountNumber);
            list.get(theAutoPayUI.currentAutoPayment).setPaymentAmount(newPaymentAmount);
            
            theAutoPaymentList.setAutoPaymentList(list);
            AutoPayment ap4 = new AutoPayment("031000053", "123123123123", "150.00");
            list.add(ap4);
            theAutoPaymentList.setAutoPaymentList(list);

            
        }
    }
    
}
