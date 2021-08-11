/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Lab012 {
    public static void main(String[] args) {
        double a=3.4,b=50.2,c=2.1,d=0.55,e=44.5,f=5.9;
        double x=0,y=0;
        if((a*d-b*c)==0){
            System.out.println("Can't find result for these equations");
        }
        else{
            x = (e*d - b*f)/(a*d - b*c);
            y = (a*f - e*c)/(a*d - b*c);
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
    
}
