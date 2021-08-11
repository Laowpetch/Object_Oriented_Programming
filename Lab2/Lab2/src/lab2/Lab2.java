/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Lab2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Today=0,ElapsedDay=0,FutureDay=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        Today = input.nextInt();
        if(Today<0||Today>6){
            System.out.println("You input wrong number");
        }
        else{
        System.out.print("Enter the number of days elapsed since today: ");
        ElapsedDay = input.nextInt();
        FutureDay = (ElapsedDay+Today)%7;
        if(Today==0){
            System.out.print("Today is Sunday");
        }
        else if(Today==1){
            System.out.print("Today is Monday");
        }
        else if(Today==2){
            System.out.print("Today is Tuesday");
        }
        else if(Today==3){
            System.out.print("Today is Wendnesday");
        }
        else if(Today==4){
            System.out.print("Today is Thursday");
        }
        else if(Today==5){
            System.out.print("Today is Friday");
        }
        else {
            System.out.print("Today is Saturday");
        }
        if(FutureDay==0){
            System.out.println(" and the future day is Sunday");
        }
        else if(FutureDay==1){
            System.out.println(" and the future day is Monday");
        }
        else if(FutureDay==2){
            System.out.println(" and the future day is Tuesday");
        }
        else if(FutureDay==3){
            System.out.println(" and the future day is Wendnesday");
        }
        else if(FutureDay==4){
            System.out.println(" and the future day is Thursday");
        }
        else if(FutureDay==5){
            System.out.println(" 9"
                    + "and the future day is Friday");
        }
        }
    }
   
}
