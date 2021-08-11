/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab051;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    final Date dataCreated = new Date();
    Account(){
    }
    Account(int id,double balance){
        this.id=id;
        this.balance=balance;
    }
    void withdraw(int withdraw){
        balance -= withdraw;
    }
    void deposit(int deposit){
        balance += deposit;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDataCreated() {
        return dataCreated;
    }
    double getMonthlyInterestRate() {
        return annualInterestRate/12;
    }
}
