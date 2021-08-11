/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preex;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class PreEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int row=0,column=0,diagonal=0,subDiagonal=0,superDiagonal=0;
        boolean Row=false ,Column = false;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int num;
        System.out.print("Enter your Number : ");
        num = input.nextInt();
        int[][] Matrix = new int[num][num];
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                Matrix[i][j] = rand.nextInt(2);
                System.out.print(Matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        //checkRow
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                row+=Matrix[i][j];
                if(row==num){
                    System.out.println("All 1 in row "+i);
                    Row = true;
                }
            }
            if(row==0){
                    System.out.println("All 0 in row "+i);
                    Row = true;
                }
            row=0;
        }
        if(Row==false){
            System.out.println("No same number on a Row");
        }
        //checkColumn
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                column+=Matrix[j][i];
                if(column==num){
                    System.out.println("All 1 in column "+i);
                    Column = true;
                    }
            }
                if(column==0){
                    System.out.println("All 0 in column "+i);
                    Column = true;
                }
            column=0;
        }
        if(Column==false){
            System.out.println("No same number on a column");
        }
        
        //checkSubDiagonal
        for(int i=1;i<num;i++){
            subDiagonal+=Matrix[i][i-1];
        }
        if(subDiagonal==num-1){
            System.out.println("All 1 in subdiagonal");
        }
        else if(subDiagonal==0){
            System.out.println("All 0 in subdiagonal");
        }
        else{
            System.out.println("No same number on a subdiagonal");
        }
        //checkDiagonal
        for(int i=0;i<num;i++){
            diagonal+=Matrix[i][i];
        }
        if(diagonal==num){
            System.out.println("All 1 in diagonal");
        }
        else if(diagonal==0){
            System.out.println("All 0 in diagonal");
        }
        else{
            System.out.println("No same number on a diagonal");
        }
        //checkSuperDiagonal
        for(int i=1;i<num;i++){
            superDiagonal+=Matrix[i-1][i];
        }
        if(superDiagonal==num-1){
            System.out.println("All 1 in superdiagonal");
        }
        else if(superDiagonal==0){
            System.out.println("All 0 in superdiagonal");
        }
        else{
            System.out.println("No same number on a superdiagonal");
        }
    }
}
