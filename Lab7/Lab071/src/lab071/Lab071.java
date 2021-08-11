/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab071;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Lab071 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date now = new Date();
        int ans;
        int status;
        int salary;
        int officeHour;
        int rank;
        String name;
        String address;
        String phoneNumber;
        String emailAddress;
        String office;
        String title;
        // TODO code application logic here
        System.out.println("This is Lab3 program");
        System.out.println("Person press 1");
        System.out.println("Student press 2");
        System.out.println("Employee press 3");
        System.out.println("Faculty press 4");
        System.out.println("Staff press 5");
        System.out.print("Answer is: ");
        Scanner input = new Scanner(System.in);
        ans = input.nextInt();
        switch (ans){
            case 1:
                System.out.println("Person");
                System.out.print("Name :");
                Scanner inputq = new Scanner(System.in);
                name = inputq.nextLine();
                System.out.print("Address :");
                Scanner inputw = new Scanner(System.in);
                address = inputw.nextLine();
                System.out.print("Phone Number :");
                Scanner inpute = new Scanner(System.in);
                phoneNumber = inpute.nextLine();
                System.out.print("Email Address :");
                Scanner inputr = new Scanner(System.in);
                emailAddress = inputr.nextLine();
                Person p1 = new Person(name,address,phoneNumber,emailAddress);
                System.out.println("");
                System.out.println(p1.toString());
                break;
            case 2:
                System.out.println("Student");
                System.out.print("Name :");
                Scanner inputa = new Scanner(System.in);
                name = inputa.nextLine();
                System.out.print("Address :");
                Scanner inputb = new Scanner(System.in);
                address = inputb.nextLine();
                System.out.print("Phone Number :");
                Scanner inputc = new Scanner(System.in);
                phoneNumber = inputc.nextLine();
                System.out.print("Email Address :");
                Scanner inputd = new Scanner(System.in);
                emailAddress = inputd.nextLine();
                System.out.print("Status :");
                Scanner inputf = new Scanner(System.in);
                status = inputf.nextInt();
                Student s1 = new Student(status,name,address,phoneNumber,emailAddress);
                System.out.println("");
                System.out.println(s1.toString());
                break;
            case 3:
                System.out.println("Empolyee");
                System.out.print("Name :");
                Scanner inputg = new Scanner(System.in);
                name = inputg.nextLine();
                System.out.print("Address :");
                Scanner inputh = new Scanner(System.in);
                address = inputh.nextLine();
                System.out.print("Phone Number :");
                Scanner inputi = new Scanner(System.in);
                phoneNumber = inputi.nextLine();
                System.out.print("Email Address :");
                Scanner inputj = new Scanner(System.in);
                emailAddress = inputj.nextLine();
                System.out.print("Office :");
                Scanner inputk = new Scanner(System.in);
                office = inputk.nextLine();
                System.out.print("Salary :");
                Scanner inputl = new Scanner(System.in);
                salary = inputl.nextInt();
                Employee e1 = new Employee(office,salary,now,name,address,phoneNumber,emailAddress);
                System.out.println(e1.toString());
                break;
            case 4:
                System.out.println("Faculty");
                System.out.print("Name :");
                Scanner inputm = new Scanner(System.in);
                name = inputm.nextLine();
                System.out.print("Address :");
                Scanner inputn = new Scanner(System.in);
                address = inputn.nextLine();
                System.out.print("Phone Number :");
                Scanner inputo = new Scanner(System.in);
                phoneNumber = inputo.nextLine();
                System.out.print("Email Address :");
                Scanner inputp = new Scanner(System.in);
                emailAddress = inputp.nextLine();
                System.out.print("Office :");
                Scanner input1 = new Scanner(System.in);
                office = input1.nextLine();
                System.out.print("Salary :");
                Scanner input2 = new Scanner(System.in);
                salary = input2.nextInt();
                System.out.print("Office hour :");
                Scanner input3 = new Scanner(System.in);
                officeHour = input3.nextInt();
                System.out.print("rank :");
                Scanner input4 = new Scanner(System.in);
                rank = input4.nextInt();
                Faculty f1 = new Faculty(officeHour,rank,office,salary,now,name,address,phoneNumber,emailAddress);
                System.out.println(f1.toString());
                break;
            case 5:
                System.out.println("Staff");
                System.out.print("Name :");
                Scanner input5 = new Scanner(System.in);
                name = input5.nextLine();
                System.out.print("Address :");
                Scanner input6 = new Scanner(System.in);
                address = input6.nextLine();
                System.out.print("Phone Number :");
                Scanner input7 = new Scanner(System.in);
                phoneNumber = input7.nextLine();
                System.out.print("Email Address :");
                Scanner input8 = new Scanner(System.in);
                emailAddress = input8.nextLine();
                System.out.print("Office :");
                Scanner input9 = new Scanner(System.in);
                office = input9.nextLine();
                System.out.print("Salary :");
                Scanner input10 = new Scanner(System.in);
                salary = input10.nextInt();
                System.out.print("Title :");
                Scanner input11 = new Scanner(System.in);
                title = input11.nextLine();
                Staff st1 = new Staff(title,office,salary,now,name,address,phoneNumber,emailAddress);
                System.out.println(st1.toString());
                break;
            default:
                System.out.println("You entered the wrong number");
        }
    }
    
}
