/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chabkuu;

import java.util.Random;

/**
 *
 * @author hp
 */
public class CharacterCell implements Cellable{
    char ch;
    int x;
    boolean closed;
    Random rand = new Random(); //26 + 65

    public CharacterCell() {
        ch = (char) (rand.nextInt(26)+65);
    }

    public CharacterCell(char ch) {
        this.ch = ch;
    }

    public char getCh() {
        return ch;
    }

    @Override
    public boolean match(Cellable another) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isClosed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setClosed(boolean closed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
