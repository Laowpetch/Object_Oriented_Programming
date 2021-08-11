/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab082;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Lab082 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Iradius = new Scanner(System.in);
        Scanner Iwidth = new Scanner(System.in);
        Scanner Iheight = new Scanner(System.in);
        Scanner Ibase = new Scanner(System.in);
        double radius,width,height,base;
        GeometricObject[] x = new GeometricObject[5];
        
        System.out.print("First Circle's radius is: ");
        radius = Iradius.nextDouble();
        x[0] = new Circle(radius,"NONE");
        ((Circle)x[0]).CalculateArea();
        System.out.print("Second Circle's radius is: ");
        radius = Iradius.nextDouble();
        x[1] = new Circle(radius,"NONE");
        ((Circle)x[1]).CalculateArea();
        
        System.out.print("First Rectangle's width is: ");
        width = Iwidth.nextDouble();
        System.out.print("First Rectangle's height is: ");
        height = Iheight.nextDouble();
        x[2] = new Rectangle(width,height,"NONE");
        ((Rectangle)x[2]).CalculateArea();
        
        System.out.print("Second Rectangle's width is: ");
        width = Iwidth.nextDouble();
        System.out.print("Second Rectangle's height is: ");
        height = Iheight.nextDouble();
        x[3] = new Rectangle(width,height,"NONE");
        ((Rectangle)x[3]).CalculateArea();
        
        System.out.print("Triangle's height is: ");
        height = Iheight.nextDouble();
        System.out.print("Triangle's base is: ");
        base = Ibase.nextDouble();
        x[4] = new Triangle(base,height,"NONE");
        ((Triangle)x[4]).CalculateArea();
        System.out.println("Summation of area is "+sumArea(x));
    }
    public static double sumArea(GeometricObject[] object){
        double sum = 0;
        for (int i=0;i<object.length;i++) {
            if(object[i] instanceof Circle){
                sum+=((Circle)object[i]).getArea();
            }
            else if(object[i] instanceof Rectangle){
                sum+=((Rectangle)object[i]).getArea();
            }
            else{
                sum+=((Triangle)object[i]).getArea();
            }
        }
        return sum;
    }
}
