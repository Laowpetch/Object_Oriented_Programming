/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab081;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Lab081 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            int fill;
            double a,b,c,ax,ay,bx,by,cx,cy;
            String color = null;
            boolean filled = false;
            Scanner inputax = new Scanner(System.in);
            Scanner inputbx = new Scanner(System.in);
            Scanner inputcx = new Scanner(System.in);
            Scanner inputay = new Scanner(System.in);
            Scanner inputby = new Scanner(System.in);
            Scanner inputcy = new Scanner(System.in);
            Scanner inputco = new Scanner(System.in);
            Scanner inputfill = new Scanner(System.in);
            System.out.println("Create triangle");
            
            
            System.out.print("Input your first coordinate's x: ");
            ax = inputax.nextDouble();
            System.out.print("Input your first coordinate's y: ");
            ay = inputay.nextDouble();
            System.out.print("Input your second coordinate's x: ");
            bx = inputbx.nextDouble();
            System.out.print("Input your second coordinate's y: ");
            by = inputby.nextDouble();
            System.out.print("Input your third coordinate's x: ");
            cx = inputcx.nextDouble();
            System.out.print("Input your third coordinate's x: ");
            cy = inputcy.nextDouble();
            
            a = sqrt(((ax-bx)*(ax-bx))+((ay-by)*(ay-by)));
            b = sqrt(((cx-bx)*(cx-bx))+((cy-by)*(cy-by)));
            c = sqrt(((ax-cx)*(ax-cx))+((ay-cy)*(ay-cy)));
            
            System.out.print("Fill[1] or NotFill[2]: ");
            fill = inputfill.nextInt();
            if(fill==1||fill==2){
                switch(fill){
                    case 1 ->{
                        filled = true;
                        System.out.print("color: ");
                        color = inputco.nextLine();
                    }
                    case 2 ->{
                    }
                }
                Triangle t = new Triangle(color,a,b,c,filled);
                System.out.print("Area of triangle is: ");
                t.calculateArea();
                t.displayArea();
                if(t.isFilled()==true){
                    System.out.print("color is ");
                    System.out.println(t.getColor());
                }
                else{
                    System.out.println("None color");
                }
            }
            else{
                System.out.println("You input wrong number, please try again.");
            }
            }
        catch(Exception x){
            System.out.println("You input something wrong. Please try again.");
        }
    }
    
}
