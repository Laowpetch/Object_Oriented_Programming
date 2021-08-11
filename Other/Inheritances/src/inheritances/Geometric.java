/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritances;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Geometric {
    private String Color;
    private Date dateCreated;
    
    public Geometric() {
        this.dateCreated = new Date();
    }
    
    public Geometric(String Color, Date dateCreated) {
        this.Color = Color;
        this.dateCreated = new Date();
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Geometric{" + "Color=" + Color + ", dateCreated=" + dateCreated + '}';
    }
    
}
