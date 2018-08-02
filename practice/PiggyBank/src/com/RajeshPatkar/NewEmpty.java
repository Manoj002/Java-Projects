package com.RajeshPatkar;

//***Process of Taking the variables and the methods together of same function is called ENCAPSULATION  ***//

//***Such classes are also termed as MODULE and as well CLUSTER in some programming technologies***//
import javax.swing.*;

class C1 {
    
    private int balance;  //***Process of Hiding data from other class is called data hiding.***//
    private int lt;
    
    void dep(int v) {
        if(v > 0)
        {
            balance = balance + v;
            lt = v;
        }
        else {
            JOptionPane.showMessageDialog(null, "The amount you have entered is not valid");
        }
    }
    
    void withdraw(int v) {
        if(v > 0)
        {
            if(balance >= v)
        {
            balance = balance - v;
            lt = - v;
        }
            else {
                JOptionPane.showMessageDialog(null, "The amount you have entered is not valid");
            }
        }
    }
    
    void statement() {
        JOptionPane.showMessageDialog(null, "Balance = " + balance);
        JOptionPane.showMessageDialog(null, "Last_transaction = " + lt);
    }
}