/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyingabstractclass;

/**
 *
 * @author hp
 */
public class StudyingAbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle r = new Rectangle();
        r.calculateArea();
        r.displayarea();
        
        Triangle t = new Triangle();
        t.calculateArea();
        t.displayarea();
    }
    
}
