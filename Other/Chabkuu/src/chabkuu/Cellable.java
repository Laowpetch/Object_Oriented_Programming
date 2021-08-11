/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chabkuu;

/**
 *
 * @author hp
 */
public interface Cellable {
    public boolean match(Cellable another);
    public boolean isClosed();
    public void setClosed(boolean closed);
    public String toString();
}
