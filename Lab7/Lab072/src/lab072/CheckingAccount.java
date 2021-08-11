/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab072;

/**
 *
 * @author hp
 */
public class CheckingAccount extends Account{
    double overdraft;
    public CheckingAccount() {
    }
    public CheckingAccount(double overdraft) {
        this.overdraft = overdraft;
    }
    public CheckingAccount(double overdraft, String title, double balance) {
        super(title, balance);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    @Override
    public String toString() {
        return super.toString()+"CheckingAccount{" + "overdraft=" + overdraft + '}';
    }
    
}
