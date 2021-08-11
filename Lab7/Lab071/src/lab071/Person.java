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
public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    
    public Person() {
    }

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress + '}';
    }
    
}