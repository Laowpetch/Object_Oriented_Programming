/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab061;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Lab061 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        int age;
        double weight,height;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter your weight in pounds: ");
        weight = input.nextDouble();
        System.out.print("Enter your height in inches: ");
        height = input.nextDouble();
        if(age<0||weight<0||height<0){
            System.out.println("You input wrongs data");
        }
        else{
            BMI admin = new BMI(name,age,height,weight);
            System.out.printf("Your BMI is %.2f\n",admin.calculate());
            System.out.println("Your are "+admin.interpretation());
        }
    }
    
}
