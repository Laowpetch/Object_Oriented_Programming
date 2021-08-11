
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
public class Lab025 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int line = input.nextInt();
        if(line>0&&line<16){
            int nodline = line-1;
            for(int i=1;i<=line;i++){
                for(int j=nodline;j>0;j--){
                    System.out.print("  ");
                }
                for(int j=i;j!=0;j--){
                    System.out.print(" "+j);
                }
                for(int j=1;j<i;j++){
                    System.out.print(" "+(j+1));
                }
                System.out.println("");
                nodline--;
            }
        }
        else{
            System.out.println("You entered wrong number");
        }
    }
}
