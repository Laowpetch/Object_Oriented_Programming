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
public class Rectangle extends GeometricObject {
    private double width,height,area;

    public Rectangle() {
    }

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }
    
    public void CalculateArea(){
        area = width*height;
    }

    public double getArea() {
        return area;
    }
    
    
}
