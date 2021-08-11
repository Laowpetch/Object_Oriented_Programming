
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
public class Lab013 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num = 0 ,a=0,b=0,c=0;
       System.out.print("Enter a number between 0 and 1000 : ");
       num = input.nextInt();
       if(num>999||num<1){
           System.out.println("number isn't correct");
       }
       else{
        a=num%10;
        b=((num-a)%100)/10;
        c=((num-a-(b*10))%1000)/100;
        num = a+b+c;
        System.out.println("The sum of the digits is "+ num);
       }
    }
}
