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
public class Rectangle extends Shape{
    double width = 20;
    double height = 30;
    @Override
    public void calculateArea() {
        area = width * height;
    }
    
}
