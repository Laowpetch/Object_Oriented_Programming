/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Lab033 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean checkRow = true, row = false;
        boolean checkColumn = true, column = false;
        boolean superdiagonal = true, diagonal = true, subdiagonal = true;
        System.out.print("Enter the size for the matrix: ");
        int num = input.nextInt();
        if (num < 1) {
            System.out.println("You input the wrong number.");
        } else {
            int[][] data = new int[num][num];
            int[] check = new int[num];
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    data[i][j] = rand.nextInt(2);
                    System.out.print(data[i][j]);
                }
                System.out.println("");
            }
            //checkRow
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num - 1; j++) {
                    if (data[i][j] != data[i][j + 1]) {
                        checkRow = false;
                    }
                }
                if (checkRow == true) {
                    System.out.println("All " + data[i][0] + "s on row " + i);
                    row = true;
                } else {
                    checkRow = true;
                }
            }
            if (row == false) {
                System.out.println("No same number on a row");
            }
            //checkcolumn
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num - 1; j++) {
                    if (data[j][i] != data[j + 1][i]) {
                        checkColumn = false;
                    }
                }
                if (checkColumn == true) {
                    System.out.println("All " + data[0][i] + "s on column");
                    column = true;
                } else {
                    checkColumn = true;
                }
            }
            if (column == false) {
                System.out.println("No same number on a column");
            }
            //checksuperdiagonal
            for (int i = 0; i < num - 2; i++) {
                if (data[i][i + 1] != data[i + 1][i + 2]) {
                    superdiagonal = false;
                }
            }
            if (superdiagonal == true) {
                System.out.println("All " + data[0][1] + "s on superdiagonal");
            } else {
                System.out.println("No same number on a superdiagonal");
            }
            //checkdiagonal
            for (int i = 0; i < num - 1; i++) {
                if (data[i][i] != data[i + 1][i + 1]) {
                    diagonal = false;
                }
            }
            if (diagonal == true) {
                System.out.println("All " + data[0][0] + "s on diagonal");
            } else {
                System.out.println("No same number on a diagonal");
            }
            //checksubdiagonal
            for (int i = 0; i < num - 2; i++) {
                if (data[i + 1][i] != data[i + 2][i + 1]) {
                    subdiagonal = false;
                }
            }
            if (subdiagonal == true) {
                System.out.println("All " + data[1][0] + "s on subdiagonal");
            } else {
                System.out.println("No same number on a subdiagonal");
            }
        }
    }
}
