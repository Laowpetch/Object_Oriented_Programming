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
public class Triangle extends Shape{
    double height = 40;
    double base = 55;
    @Override
    public void calculateArea() {
        area = 0.5*base*height;
    }
    
}
