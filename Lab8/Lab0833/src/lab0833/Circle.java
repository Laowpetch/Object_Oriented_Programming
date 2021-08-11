/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0833;

import static java.lang.Math.PI;

/**
 *
 * @author hp
 */
public class Circle extends GeometricObject{
   double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
    public double getArea(){
        return radius*radius*PI;
    }
    
}
