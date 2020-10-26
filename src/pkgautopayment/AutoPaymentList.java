/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgautopayment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author elitzageorgieva
 */
public class AutoPaymentList {
    
    ArrayList<AutoPayment> autoPaymentList = new ArrayList<>();
    public int autoPaymentListSize=autoPaymentList.size();
    private String autoPaymentFileName = "autoPaymentList.ser";
    
    public AutoPaymentList()
    {
        this.readAutoPaymentFile();
        if(autoPaymentList.isEmpty() || autoPaymentList == null){
        this.createAutoPaymentList();
        this.writeAutoPaymentFile();
        this.readAutoPaymentFile();
    }      
    this.printAutoPaymentList();
    }
    
   //A file "AutoPaymentFile Name" is read. If it does not exist, a new file is created.     
    public void readAutoPaymentFile()
    {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try { 
            fis = new FileInputStream(autoPaymentFileName);
            in = new ObjectInputStream(fis);
            autoPaymentList = (ArrayList)in.readObject();
            in.close();
            //checks if file autoPaymentFileName is empty
            if(!autoPaymentList.isEmpty()){
                System.out.println("The auto payment list is not empty");
            }
        }catch(FileNotFoundException ex){
            //If it does not exist, a new file is created. 
            System.out.println("Create new auto payment file");
        }catch(IOException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }       
    }
    
    //Allows user to make changes to the file "autoPaymentFileName".
    public void writeAutoPaymentFile()
    {
    FileOutputStream fos = null;
    ObjectOutputStream out = null;
    try {
        fos = new FileOutputStream(autoPaymentFileName);
        out = new ObjectOutputStream(fos);
        out.writeObject(autoPaymentList);
        out.close();
    }
    
    catch(IOException ex)
    {
        ex.printStackTrace();
    }
}
    // AutoPayment objects is created and they are added to the array list "autoPaymentList".
    public void createAutoPaymentList()
    {
        AutoPayment ap1 = new AutoPayment("031000053", "111222333444", "100.00");
        AutoPayment ap2 = new AutoPayment("031000503", "1234567890", "500.00");
        AutoPayment ap3 = new AutoPayment("036001808", "1212121212", "2000.00");
        
        autoPaymentList.add(ap1);
        autoPaymentList.add(ap2);
        autoPaymentList.add(ap3);
    }
    
     /**
     * Gives the current autoPayment list.
     * @return The current autoPayment list.
     */
    
    public ArrayList<AutoPayment> getAutoPaymentList()
    {
        return autoPaymentList;
    }
    
    /**
     * Changes value of the autoPayment list.
     * Set the entered value of the autoPayment list.
     */
    public void setAutoPaymentList(ArrayList<AutoPayment> getAutoPaymentList)
    {
        this.autoPaymentList=autoPaymentList;
    }
    
    //prints out the autoPayment list
    public void printAutoPaymentList()
    {
    System.out.println("The Auto Payment List has these automatic payments saved:");
    for(int i = 0; i < autoPaymentList.size(); i++){
        AutoPayment currentAutoPayment = (AutoPayment) autoPaymentList.get(i);
        System.out.println(currentAutoPayment.getRoutingNumber());
        System.out.println(currentAutoPayment.getBankAccountNumber());
        System.out.println(currentAutoPayment.getPaymentAmount());
    }
    
}
}
