/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab073;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Lab073 {

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
        double balance,withdraw,deposit,amount;
        double interest;
                System.out.println("Saving");
                System.out.print("Title: ");
                title = input1.nextLine();
                System.out.print("Interest: ");
                interest = input2.nextDouble();
                System.out.print("Balance is  ");
                balance = input3.nextDouble();
                SavingAccount x = new SavingAccount(interest,title,balance);
                System.out.println("This account was created at "+now);
                System.out.print("Withdraw[1] or Deposit[2]: ");
                type = input5.nextInt();
                
                ArrayList<Transaction> xt = new ArrayList<>();
                
                switch(type){
                    case 1 -> {
                        System.out.print("amount: ");
                        withdraw = input1.nextDouble();
                        if(withdraw<=balance){
                            balance-=withdraw;
                            x.setBalance(balance);
                            xt.add(new Transaction(type,withdraw));
                            System.out.println("balance is "+x.getBalance());
                        }
                        else{
                            System.out.println("Cann't withdraw");
                        }
            }
                    case 2 -> {
                        System.out.print("amount :");
                        deposit = input1.nextDouble();
                        balance+=deposit;
                        x.setBalance(balance);
                        xt.add(new Transaction(type,deposit));
                        System.out.println("balance is "+x.getBalance());
            }
                    default -> System.out.println("You input the wrong number.");
                }
                System.out.println(xt.get(0).toString()+"       "+balance);
                for(int i=1;i<10;i++){
                    balance+=balance*interest;
                    x.setBalance(balance);
                    xt.add(new Transaction(1,balance*interest));
                    System.out.println(xt.get(i).toString()+"       "+balance);
                }
    }
    
}

