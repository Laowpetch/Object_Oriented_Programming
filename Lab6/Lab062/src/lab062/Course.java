/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab062;

/**
 *
 * @author hp
 */
public class Course {
    private final String name;
    private String[] students;
    private int numberOfStudents;
    public Course(String name){
        this.name=name;
        students = new String[20];
    }
    public void addStudent(String student){
        if(numberOfStudents>=students.length){
            String[] temp = new String[students.length*2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public void dropStudent(String dropstudent){
        int i;
        for(i=0;i<students.length;i++){
            if (dropstudent.equals(students[i])) {
                students[i] = null;
                numberOfStudents--;
                while (i < numberOfStudents) {
                    students[i] = students[i + 1];
                    i++;
                }
                break;
            }
        }
        if(i==students.length){
            System.out.println("this name is not in this course");
        }
    }
    public void clear(){
        String[] students = new String[1];
        numberOfStudents = 0;
    }
    public String getName() {
        return name;
    }
    public String[] getStudents() {
        return students;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    } 
}
