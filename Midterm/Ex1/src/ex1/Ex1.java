/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Random character are : ");
        
        int type;
        int num=0,ch=0;
        int xxx;
        boolean check = true;
        char[] x = new char[5];
        int[] y = new int[5];
        int[] charx = new int[5];
        for(int i=0;i<10;i++){
            if(i%2==0){
                xxx=rand.nextInt(10)+97;
                charx[ch] = xxx;
                x[ch] = (char)xxx;
                System.out.print(x[ch]+" ");
                ch++;
                
            }
            else{
                xxx=rand.nextInt(10);
                y[num] = xxx;
                System.out.print(y[num]+" ");
                num++;
            }
        }
        System.out.println("");
        System.out.print("Select group of character [1] character [2] numeric : ");
        type = input.nextInt();
            switch(type){
                case 1:
                    for(int i=0;i<10;i++){
                        for(int j=0;j<5;j++){
                            if((char)i+97==x[j]){
                                check = false;
                            }
                        }
                        if(check==true){
                            System.out.print((char)(i+97)+" ");
                        }
                        check=true;
                    }
                    System.out.println("");
                    break;
                case 2:
                    for(int i=0;i<10;i++){
                        for(int j=0;j<5;j++){
                            if(i==y[j]){
                                check = false;
                            }
                        }
                        if(check==true){
                            System.out.print(i+" ");
                            
                        }
                        check=true;
                    }
                    System.out.println("");
                    break;
                default:
                    System.out.println("You input the wrng number");
                    break;
            }
        }
    
}
