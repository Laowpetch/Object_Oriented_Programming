/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab084;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Lab084 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double side;
        System.out.print("Input side of square: ");
        side = input.nextDouble();
        System.out.println("Area is: "+side*side);
        Square s1 = new Square(side,side*side);
        s1.howToColor();
    }
    
}
