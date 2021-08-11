 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0833;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Lab0833{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int type;
        double radius,weight,height,width;
        String color;
        try{
            Scanner inputType = new Scanner(System.in);
            Scanner inputRadius = new Scanner(System.in);
            Scanner inputWeight = new Scanner(System.in);
            Scanner inputColor = new Scanner(System.in);
            Scanner inputHeight = new Scanner(System.in);
            Scanner inputWidth = new Scanner(System.in);
            System.out.print("Menu(1=Circle, 2=Rectangle, 3=Exit): ");
            type = inputType.nextInt();
            switch(type){
                case 1->{
                    System.out.print("Circle c1 (radius color weight): ");
                    radius = inputRadius.nextDouble();
                    color = inputColor.nextLine();///////////////////////////////////////////////////////////////////////
                    weight = inputWeight.nextDouble();
                    ComparableCircle c1 = new ComparableCircle(radius ,color ,weight);
                    System.out.print("Circle c2 (radius color weight): ");
                    radius = inputRadius.nextDouble();
                    color = inputColor.nextLine();///////////////////////////////////////////////////////////////////////
                    weight = inputWeight.nextDouble();
                    ComparableCircle c2 = new ComparableCircle(radius ,color ,weight);
                    System.out.println("");
                    System.out.println("3.1 Find the larger object using max method : c1 c2");///////////////////////////
                    System.out.print("Answer: ");    
                    if(ComparableCircle.max(c1.getArea(),c2.getArea())==1){
                        System.out.println("c1"); 
                    }
                    else{
                        System.out.println("c2");
                    }
                    System.out.println("");
                    System.out.println("Cloning Circle c3 buy using c2");////////////////////////////////////////////////
                    ComparableCircle c3 = (ComparableCircle)c2.clone();
                    System.out.println("c2 == c3 is: "+(c2==c3));
                    System.out.println("c2.equals(c3) is "+c2.equals(c3));
                    System.out.println("");
                    System.out.println("3.2 Find the larger of 2 instance of comparable objects: c1 c3");
                    System.out.print("Answer: ");
                    switch (c1.compareTo(c3)) {
                        case 1 -> System.out.println("c1");
                        case -1 -> System.out.println("c3");
                        default -> System.out.println("They are equal");
                    }
                }
                case 2->{
                    System.out.println("Rectangle r1 (width height color weight): ");
                    width = inputWidth.nextDouble();
                    height = inputHeight.nextDouble();
                    color = inputColor.nextLine();///////////////////////////////////////////////////////////////////////
                    weight = inputWeight.nextDouble();
                    ComparableRectangle r1 = new ComparableRectangle(height, width, color, weight);
                    System.out.println("Rectangle r2 (width height color weight): ");
                    width = inputWidth.nextDouble();
                    height = inputHeight.nextDouble();
                    color = inputColor.nextLine();///////////////////////////////////////////////////////////////////////
                    weight = inputWeight.nextDouble();
                    ComparableRectangle r2 = new ComparableRectangle(height, width, color, weight);
                    System.out.println("");
                    System.out.println("3.1 Find the larger object using max method : r1 r2");///////////////////////////
                    System.out.print("Answer: ");    
                    if(ComparableRectangle.max(r1.getArea(),r2.getArea())==1){
                        System.out.println("r1"); 
                    }
                    else{
                        System.out.println("r2");
                    }
                    System.out.println("");
                    System.out.println("Cloning Rectangle r3 buy using r2");
                    ComparableRectangle r3 = (ComparableRectangle)r2.clone();
                    System.out.println("r2 == r3 is: "+(r2==r3));
                    System.out.println("r2.equals(r3) is "+r2.equals(r3));
                    System.out.println("");
                    System.out.println("3.2 Find the larger of 2 instance of comparable objects: r1 r3");////////////////
                    System.out.print("Answer: ");
                    switch (r1.compareTo(r3)) {
                        case 1 -> System.out.println("r1");
                        case -1 -> System.out.println("r3");
                        default -> System.out.println("They are equal");
                    }
                }
                case 3->{
                    System.exit(0);
                }
            }
        }
        catch(Exception x){
            System.out.println("ERROR");
        }
        
    }
    
}
