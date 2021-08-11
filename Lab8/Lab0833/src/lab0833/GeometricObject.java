/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0833;

/**
 *
 * @author hp
 */
public abstract class GeometricObject {
    private String color;
    private double weight;

    public GeometricObject() {
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }
    
    public static int max(double a1,double a2){
        if(a1>a2){
            return 1;
        }
        else {
            return -1;
        }
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }
    
    
}
