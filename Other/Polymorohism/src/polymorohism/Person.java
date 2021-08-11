/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorohism;

/**
 *
 * @author hp
 */
public class Person {
    String title;

    public Person() {
    }

    public Person(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + title + '}';
    }
    
}

class Student extends Person{
    int id;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }
    public Student(int id,String title) {
        super(title);
        this.id = id;
    }
    @Override
    public String toString() {
        return super.toString()+"Student{" + "id=" + id + '}';
    }
}

class Faculty extends Person{
    String work;
    public Faculty() {
    }
    public Faculty(String work) {
        this.work = work;
    }
    public Faculty(String work, String title) {
        super(title);
        this.work = work;
    }
    @Override
    public String toString() {
        return super.toString()+"Faculty{" + "work=" + work + '}';
    }
}
