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
public class Employee extends Person{
    private String office;
    private int salary;
    private Date dateHired;

    public Employee() {
    }

    public Employee(String office, int salary, Date dateHired) {
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Employee(String office, int salary, Date dateHired, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public int getSalary() {
        return salary;
    }

    public Date getDateHired() {
        return dateHired;
    }
    
    @Override
    public String toString() {
        return "Employee{" + "name=" + super.getName() + ", address=" + super.getAddress() + ", phoneNumber=" + super.getPhoneNumber() + ", emailAddress=" + super.getEmailAddress()  + "office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + '}';
    }
    
}
