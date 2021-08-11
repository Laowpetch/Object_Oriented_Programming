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
public class Square extends GeometricObject implements Colorable {
    double side;

    public Square(double area) {
        super(area);
    }

    public Square(double side, double area) {
        super(area);
        this.side = side;
    }
    
    
    @Override
    public void howToColor() {
        System.out.println("Colored all four sides");
    }
    
}
