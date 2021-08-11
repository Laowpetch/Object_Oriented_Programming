/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritances;

/**
 *
 * @author hp
 */
public class Inheritances {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        Geometric g1 = new Geometric();
        System.out.println(g1.getDateCreated());
        System.out.println(g1.toString());
        
        Circle c1 = new Circle();
        System.out.println(c1.toString());
    }
    
}
