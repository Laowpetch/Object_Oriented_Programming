/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

/**
 *
 * @author hp
 */
public class Lab01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pop = 312032486;
        int secPerYear = 31536000;
        int bs = 0,ds = 0,ns = 0 ,bp = 0,dp = 0,np = 0;
        bp = secPerYear / 7;
        bs = secPerYear % 7;
        dp = secPerYear / 13;
        ds = secPerYear % 13;
        np = secPerYear / 45;
        ns = secPerYear % 45;
        pop = pop + bp - dp + np;
        System.out.println("Total population in 1st year is " + pop);
        bp = (secPerYear + bs) / 7;
        bs = (secPerYear + bs) % 7;
        dp = (secPerYear+ds) / 13;
        ds = (secPerYear+ds) % 13;
        np = (secPerYear+ns) / 45;
        ns = (secPerYear+ns) % 45;
        pop = pop + bp - dp + np;
        System.out.println("Total population in 2nd year is " + pop);
        bp = (secPerYear + bs) / 7;
        bs = (secPerYear + bs) % 7;
        dp = (secPerYear+ds) / 13;
        ds = (secPerYear+ds) % 13;
        np = (secPerYear+ns) / 45;
        ns = (secPerYear+ns) % 45;
        pop = pop + bp - dp + np;
        System.out.println("Total population in 3rd year is " + pop);
        bp = (secPerYear + bs) / 7;
        bs = (secPerYear + bs) % 7;
        dp = (secPerYear+ds) / 13;
        ds = (secPerYear+ds) % 13;
        np = (secPerYear+ns) / 45;
        ns = (secPerYear+ns) % 45;
        pop = pop + bp - dp + np;
        System.out.println("Total population in 4th year is " + pop);
        bp = (secPerYear + bs) / 7;
        bs = (secPerYear + bs) % 7;
        dp = (secPerYear+ds) / 13;
        ds = (secPerYear+ds) % 13;
        np = (secPerYear+ns) / 45;
        ns = (secPerYear+ns) % 45;
        pop = pop + bp - dp + np;
        System.out.println("Total population in 5th year is " + pop);
    }
    
}
