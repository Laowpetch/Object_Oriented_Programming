/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqre;

/**
 *
 * @author hp
 */
public class Square {
    private int dan,field;

    public Square() {
    }

    public Square(int dan) {
        this.dan = dan;
    }
    
    public void Calculate(){
        this.field = dan*dan;
    }
    
    public int show(){
        return field;
    }
}
