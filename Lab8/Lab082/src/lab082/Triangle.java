/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab082;

/**
 *
 * @author hp
 */
public class Triangle extends GeometricObject {
    private double base,height,area;

    public Triangle() {
    }

    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }
    
    public void CalculateArea(){
        area = height*base/2;
    }

    public double getArea() {
        return area;
    }
}
