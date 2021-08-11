/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab073;

/**
 *
 * @author hp
 */
public class SavingAccount extends Account {
    double interest;

    public SavingAccount() {
    }
    public SavingAccount(double interest) {
        this.interest = interest;
    }
    public SavingAccount(double interest, String title, double balance) {
        super(title, balance);
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    @Override
    public String toString() {
        return super.toString()+"SavingsAccount{" + "interest=" + interest + '}';
    }
}
