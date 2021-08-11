/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab071;

/**
 *
 * @author hp
 */
public class Student extends Person{
    private int status;

    public Student() {
    }

    public Student(int status) {
        this.status = status;
    }

    public Student(int status, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
    @Override
    public String toString() {
        
        return "Student{" + "name=" + super.getName() + ", address=" + super.getAddress() + ", phoneNumber=" + super.getPhoneNumber() + ", emailAddress=" + super.getEmailAddress()  + "status=" + status + '}';
    }
    
    
}
