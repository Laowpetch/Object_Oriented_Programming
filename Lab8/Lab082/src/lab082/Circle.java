/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab082;

import static java.lang.Math.PI;

/**
 *
 * @author hp
 */
public class Circle extends GeometricObject {
    private double radius,area;

    public Circle() {
    }

    public Circle(String color) {
        super(color);
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }
    
    public void CalculateArea(){
        area = PI*radius*radius;
    }

    public double getArea() {
        return area;
    }
    
}
