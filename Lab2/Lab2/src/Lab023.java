
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Lab023 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year=0, month=0,day=0,result=0;
        System.out.print("Enter year: (e.g., 2012): ");
        year = input.nextInt();
        if(year<1){
            System.out.println("You entered the wrong number.");
        }
        else{
            System.out.print("Enter mounth: 1-12: ");
            month = input.nextInt();
            if(month<1||month>12){
                System.out.println("You entered the wrong number.");
            }
            else{
                System.out.print("Enter the day of the month: 1-31: ");
                day = input.nextInt();
                
                if(((month==4||month==6||month==9||month==11)&&day==31)||(month==2&&day==30)){
                    System.out.println("You entered wrong date.");
                }
                else{
                   if(month==2&&day==29&&(year%4!=0||(year%4==0&&year%100==0&&year%400!=0))){
                       System.out.println("You entered wrong date");
                   }
                   else{
                       if(month==1){
                           month=13;
                           year-=1;
                       }
                       else if(month==2){
                           month=14;
                           year-=1;
                       }
                        result = (day + ((26*(month+1))/10) +(year%100)+((year%100)/4)+(year/400)+(5*(year/100)))%7;
                        System.out.print("Day of the week is ");
                        if(result==0){
                           System.out.println("Saturday");
                        }
                        else if(result==1){
                            System.out.println("Sunday");
                        }
                        else if(result==2){
                            System.out.println("Monday");
                        }
                        else if(result==3){
                            System.out.println("Tuesday");
                        }
                        else if(result==4){
                            System.out.println("Wednesday");
                        }
                        else if(result==5){
                            System.out.println("Thursday");
                        }
                        else{
                            System.out.println("Friday");
                        }
                    }
                }
            }
        }
    }
}
