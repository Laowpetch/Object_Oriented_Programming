/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab073;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Transaction {
    Date tDate = new Date();
    int type;
    double amount;
    
    public Transaction() {
    }
    //1 = withdraw 2 = deposit
    public Transaction(int type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        if(type==1){
            return tDate + "       " + 'W' + "         " + amount;
        }
        else{
            return tDate + "       " + 'D' + "         " + amount;
        }
    }
    
}
