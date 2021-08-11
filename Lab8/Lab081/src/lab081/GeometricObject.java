/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab081;

/**
 *
 * @author hp
 */
public abstract class GeometricObject {
    double area;
    public abstract void calculateArea();
    
    public void displayArea(){
        if(area==-1){
            System.out.println("Can't find area");
        }
        else{
            System.out.println(area);
        }
    }
}
