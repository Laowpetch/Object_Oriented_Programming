/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int top=1,right=1,bottom=1,left=1;
        int size,row,column;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Input size of matrix : ");
        size = input.nextInt();
        if(size>=5){
            int[][] matrix = new int[size][size];
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    matrix[i][j] = rand.nextInt(6);
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.print("Input value of Row and Column : ");
            row = input.nextInt();
            column = input.nextInt();
            System.out.println("Selected member is "+matrix[row][column]);
            System.out.print("Top = ");
            if(row==0){
                System.out.println("No");
            }
            else{
                for(int i=row-1;i>=0;i--){
                    top*=matrix[i][column];
                }
                System.out.println(top);
            }
            
            System.out.print("Right = ");
            if(column==size-1){
                System.out.println("No");
            }
            else{
                for(int i=column+1;i<size;i++){
                    right*=matrix[row][i];
                }
                System.out.println(right);
            }
            
            System.out.print("Bottom : ");
            if(row==size-1){
                System.out.println("No");
            }
            else{
                for(int i=row+1;i<size;i++){
                    bottom*=matrix[i][column];
                }
                System.out.println(bottom);
            }
            
            System.out.print("Left = ");
            if(column==0){
                System.out.println("No");
            }
            else{
                for(int i=column-1;i>=0;i--){
                    left*=matrix[row][i];
                }
                System.out.println(left);
            }
                        
        }
        else{
            System.out.println("You input wrong number");
        }
    }
    
}
