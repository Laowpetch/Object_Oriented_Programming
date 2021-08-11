/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab084;

/**
 *
 * @author hp
 */
public class GeometricObject {
    double area;

    public GeometricObject(double area) {
        this.area = area;
    }
    
    public void displayArea(){
        if(area==-1){
            System.out.println("Can't find area");
        }
        else{
            System.out.println(area);
        }
    }
}
