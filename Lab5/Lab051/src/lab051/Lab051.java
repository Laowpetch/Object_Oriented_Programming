/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab051;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Lab051 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int withdraw;
        Scanner input = new Scanner(System.in);
        Account admin = new Account(1122,20000);
        admin.setAnnualInterestRate(4.5);
        System.out.print("Withdraw: ");
        withdraw = input.nextInt();
        if(withdraw<=admin.getBalance()){
            admin.withdraw(withdraw);
        }
        else{
            System.out.println("Cann't withdraw");
        }
        System.out.print("Deposit: ");
        admin.deposit(input.nextInt());
        System.out.println("balance: "+admin.getBalance());
        System.out.printf("Mounthly interest: %.2f\n",admin.getMonthlyInterestRate());
        System.out.println("Date created: "+admin.dataCreated);
    }
}
    
