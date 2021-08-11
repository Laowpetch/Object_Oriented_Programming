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
public class ComparableRectangle extends Rectangle  implements Comparable<ComparableRectangle>,Cloneable {

    public ComparableRectangle() {
    }

    public ComparableRectangle(double height, double width) {
        super(height, width);
    }

    public ComparableRectangle(double height, double width, String color, double weight) {
        super(height, width, color, weight);
    }

    @Override
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
        
    }
    
    
    @Override
    public int compareTo(ComparableRectangle r) {
        return Double.compare(this.getArea(), r.getArea());
    }
    
     public boolean equals(ComparableRectangle r) {
        return this.getColor()==r.getColor()&&(this.getArea()==r.getArea());
    }
    
}
