/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab072;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Lab072 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date now = new Date();
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        Scanner input5 = new Scanner(System.in);
        int type;
        String title;
        double balance,withdraw;
        double interest,overdraft;
        System.out.println("Select your account");
        System.out.print("[1]Saving [2]Checking: ");
        type = input5.nextInt();
        switch(type){
            case 1:
                System.out.println("Saving");
                System.out.print("Title: ");
                title = input1.nextLine();
                System.out.print("Interest: ");
                interest = input2.nextDouble();
                System.out.print("Balance is  ");
                balance = input3.nextDouble();
                SavingsAccount x = new SavingsAccount(interest,title,balance);
                System.out.print("Withdraw: ");
                withdraw = input4.nextDouble();
                if(withdraw>balance){
                    System.out.println("Cann't with draw");
                }
                else{
                    balance-=withdraw;
                    x.setBalance(balance);
                    System.out.println("Balance is "+balance);
                }
                System.out.println("This account was created at "+now);
                break;
            case 2:
                System.out.println("Checking");
                System.out.print("Title: ");
                title = input1.nextLine();
                System.out.print("Overdraft Limit: ");
                overdraft = input2.nextDouble();
                System.out.print("Balance is  ");
                balance = input3.nextDouble();
                CheckingAccount y = new CheckingAccount(overdraft,title,balance);
                System.out.print("Withdraw: ");
                withdraw = input4.nextDouble();
                if(withdraw>balance+overdraft){
                    System.out.println("Cann't with draw");
                }
                else{
                    balance-=withdraw;
                    y.setBalance(balance);
                    System.out.println("Balance is "+balance);
                    System.out.println("This account was created at "+now);
                }
                break;
            default:
                System.out.println("You input wrong number.");
                break;
        }
    }
    
}
