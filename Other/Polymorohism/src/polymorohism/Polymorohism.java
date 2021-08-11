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
public class Polymorohism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1 = new Student(63010003,"somsak");
        Faculty f1 = new Faculty("lectuerer","aranya");
        
        Person s2 = new Person(); //datatype and objecttype
        //datatype called reference type
        //objectttyoe called actual type
        Person s3 = new Student();//casting auto || implific casting
        //Person = reference type
        //Student = actual type
        Person s4 = new Faculty();
        //Student s5 = s2; error some cannot be student
        Student s5 = (Student)s2;//explicit casting
        
//        display(s1);
//        display(f1);
//        display(s1);//pass object of subtype
    }
//    static void display(Student s){
//        s.toString();
//    }
//    static void display(Faculty f){
//        f.toString();
//    }
    static void display(Person p){
        System.out.println(p.toString());
    }
}
