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
public class Faculty extends Employee{
    private int officeHour;
    private int rank;

    public Faculty() {
    }

    public Faculty(int officeHour, int rank) {
        this.officeHour = officeHour;
        this.rank = rank;
    }

    public Faculty(int officeHour, int rank, String office, int salary, Date dateHired) {
        super(office, salary, dateHired);
        this.officeHour = officeHour;
        this.rank = rank;
    }

    public Faculty(int officeHour, int rank, String office, int salary, Date dateHired, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address, phoneNumber, emailAddress);
        this.officeHour = officeHour;
        this.rank = rank;
    }

    public int getOfficeHour() {
        return officeHour;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return super.toString()+"Faculty{" + "officeHour=" + officeHour + ", rank=" + rank + '}';
    }

    
    
    
    
    
}
