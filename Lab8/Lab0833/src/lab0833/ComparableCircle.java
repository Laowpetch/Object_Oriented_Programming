/*.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0833;

/**
 *
 * @author hp
 */
public class ComparableCircle extends Circle  implements Comparable<ComparableCircle>,Cloneable {

    public ComparableCircle() {
    }
    
    public ComparableCircle(double radius, String color, double weight) {
        super(radius,color,weight);
        
    }
    
     @Override
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
        
    }

    @Override
    public int compareTo(ComparableCircle o) {
        return Double.compare(this.getArea(), o.getArea());
    }
    
    
    public boolean equals(ComparableCircle o) {
        return this.getColor()==o.getColor()&&(this.getArea()==o.getArea());
    }


    
    
}
