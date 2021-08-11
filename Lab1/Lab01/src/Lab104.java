
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
public class Lab104 {
    public static void main(String[] args) {
        double weight,height,bmi;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds : ");
        weight = input.nextDouble();
        System.out.print("Enter height in inches : ");
        height = input.nextDouble();
        weight *= 0.45359237;
        height *= 0.0254;
        bmi = weight / height / height;
        System.out.printf("BMI is %.3f\n",bmi);
    }
}
