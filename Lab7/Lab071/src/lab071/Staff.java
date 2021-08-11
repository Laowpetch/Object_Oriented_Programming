/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab071;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Staff extends Employee{
    private String title;

    public Staff() {
    }

    public Staff(String title) {
        this.title = title;
    }

    public Staff(String title, String office, int salary, Date dateHired) {
        super(office, salary, dateHired);
        this.title = title;
    }

    public Staff(String title, String office, int salary, Date dateHired, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address, phoneNumber, emailAddress);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return super.toString()+"Staff{" + "title=" + title + '}';
    }
    
}
