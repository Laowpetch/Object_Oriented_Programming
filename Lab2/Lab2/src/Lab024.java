
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Lab024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int loopNumber;
        System.out.print("Enter the first city: ");
        String firstCity =  input.nextLine();
        int numFirst = firstCity.length();
        System.out.print("Enter the second city: ");
        String secondCity =  input.nextLine();
        int numSecond = secondCity.length();
        System.out.print("Enter the third city: ");
        String thirdCity =  input.nextLine();
        int numThird = thirdCity.length();
        if(numFirst>=numSecond&&numFirst>=numThird){
            loopNumber = numFirst;
        }
        else if(numSecond>=numFirst&&numSecond>=numThird){
            loopNumber = numSecond;
        }
        else{
            loopNumber  = numThird;
        }
        for(int i=0;i<loopNumber;i++){
            
        }
        //System.out.println(firstCity.codePointAt(0));
        //System.out.println("The three cities in alphabetical order are ");
    }
    
}
