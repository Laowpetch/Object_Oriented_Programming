/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab083;

/**
 *
 * @author hp
 */
public class Circle extends GeometricObject implements Comparable {
    double radius,weight;
    String color;
    
    
    public Circle() {
    }
    
    public Circle(double radius, double weight, String color) {
        this.radius = radius;
        this.weight = weight;
        this.color = color;
    } 

    @Override
    public String max(Circle c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
