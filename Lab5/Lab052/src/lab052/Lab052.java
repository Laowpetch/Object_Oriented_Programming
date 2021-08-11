/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab052;

/**
 *
 * @author hp
 */
public class Lab052 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RegularPolygon A = new RegularPolygon();
        RegularPolygon B = new RegularPolygon(6,4);
        RegularPolygon C = new RegularPolygon(10,4,5.6,7.8);
        System.out.println("Polygon A");
        System.out.println("number of side: "+A.getN());
        System.out.println("size: "+A.getSide());
        System.out.println("x-coordinate: "+A.getX());
        System.out.println("y-coordinate: "+A.getY());
        System.out.println("Area: "+A.Findarea());
        System.out.println("");
        System.out.println("Polygon B");
        System.out.println("number of side: "+B.getN());
        System.out.println("size: "+B.getSide());
        System.out.println("x-coordinate: "+B.getX());
        System.out.println("y-coordinate: "+B.getY());
        System.out.println("Area: "+B.Findarea());
        System.out.println("");
        System.out.println("Polygon C");
        System.out.println("number of side: "+C.getN());
        System.out.println("size: "+C.getSide());
        System.out.println("x-coordinate: "+C.getX());
        System.out.println("y-coordinate: "+C.getY());
        System.out.println("Area: "+C.Findarea());
        
    }
    
}
