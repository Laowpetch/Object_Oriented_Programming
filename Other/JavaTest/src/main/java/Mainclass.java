
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
// Your First Program

class Mainclass {
    public static void main(String[] args) {
        int num , line;
        System.out.print("Input Nmber :");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        line = num;
        for(int i=1;i<=line;i++){
            for(int j=0;i<num-1;i++){
                System.out.print(" ");
            }
            for(int j=0;j<line;j++)
            System.out.println("");
        }
    }
}