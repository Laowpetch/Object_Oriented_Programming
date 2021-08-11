/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyinginterface;

/**
 *
 * @author hp
 */
public class Car extends Vehicle implements AirCondition /*, Navigator*/{
    private int numPassenger;

    public Car() {
    }

    @Override
    public void switchOn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
