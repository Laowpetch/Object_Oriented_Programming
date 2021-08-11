/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab083;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Lab083 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stateinput = new  Scanner(System.in);
        Scanner radius1input = new  Scanner(System.in);
        Scanner color1input = new  Scanner(System.in);
        Scanner weight1input = new  Scanner(System.in);
        Scanner radius2input = new  Scanner(System.in);
        Scanner color2input = new  Scanner(System.in);
        Scanner weight2input = new  Scanner(System.in);
        try{
            int state;
            double radius1,weight1,radius2,weight2;
            String color1,color2;
            System.out.println("Menu (1=Circle, 2=Rectangle, 3=Triangle, 4=Exit)");
            state = stateinput.nextInt();
            switch(state){
                case 1:
                    System.out.print("Circle c1 (radius color weight) : ");
                    radius1 = radius1input.nextDouble();
                    color1 = color1input.nextLine();
                    weight1 = weight1input.nextDouble();
                    System.out.print("Circle c2 (radius color weight) : ");
                    radius2 = radius1input.nextDouble();
                    color2 = color1input.nextLine();
                    weight2 = weight1input.nextDouble();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("You input the wrong number.");
                    
            }
        }
        catch(Exception x){
            System.out.println("You put something wrong. Please try again.");
        }
    }
    
}
