/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab062;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Lab062 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter course name: ");  
        Course course = new Course(input.nextLine());
        for (int i = 1; i < 4; i++) {
            System.out.print("No." + i + ": ");
            String stName = input.nextLine();
            course.addStudent(stName);
        }
        String[] students = course.getStudents();
        System.out.printf("Number of students in %s : %d%n", course.getName(), course.getNumberOfStudents());
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.printf("%s\n", students[i]);
        }
        System.out.print("Enter the name who want to drop : ");
        String dropstudent = input.nextLine();
        course.dropStudent(dropstudent);
        System.out.printf("Number of students in %s : %d%n", course.getName(), course.getNumberOfStudents());
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println(students[i]);
        }
        System.out.print("Do you want clear this course 1(yes) or 0(no) : ");
        int clear = input.nextInt();
        if (clear == 1) {
            course.clear();
            System.out.printf("Number of students in %s : %d%n", course.getName(), course.getNumberOfStudents());
            for (int i = 0; i < course.getNumberOfStudents(); i++) {
                System.out.printf("%s\n", students[i]);
            }
        } 
        else {
            System.out.printf("Number of students in %s : %d%n", course.getName(), course.getNumberOfStudents());
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.printf("%s\n", students[i]);
        }
        }
    }
    
}
