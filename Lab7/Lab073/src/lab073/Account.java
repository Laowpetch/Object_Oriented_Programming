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
public class Account{
    String title;
    private double balance;
    public Account() {
    }
    public Account(String title, double balance) {
        this.title = title;
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Account{" + "title=" + title + ", balance=" + balance + '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
}
