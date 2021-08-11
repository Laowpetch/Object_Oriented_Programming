/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab081;

import static java.lang.Math.sqrt;

/**
 *
 * @author hp
 */
public class Triangle extends GeometricObject {
    private String color;
    private double a,b,c,s;
    private boolean filled;

    public Triangle() {
    }
    
    public Triangle(String color, double a, double b, double c, boolean filled) {
        this.color = color;
        this.a = a;
        this.b = b;
        this.c = c;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
    
    @Override
    public void calculateArea() {
        s = (a+b+c)/2;
        area = sqrt(s*(s-a)*(s-b)*(s-c));
        if(a>b+c||b>a+c||c>a+b){
            area = -1;
        }
    }
    
}
