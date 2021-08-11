/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergetest;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class MergeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int xNum=0,yNum=0,ixNum=0,iyNum=0;
        int start=0,stop;
        String x,y;
        System.out.print("Enter list 1: ");
        x = input.nextLine().concat(" ");
        System.out.print("Enter list 2: ");
        y = input.nextLine().concat(" ");
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)==' '){
                xNum++;
            }
        }
        for(int i=0;i<y.length();i++){
            if(y.charAt(i)==' '){
                yNum++;
            }
        }
        int[] list1 = new int[xNum];
        int[] list2 = new int[yNum];
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)==' '){
                stop=i;
                list1[ixNum]=Integer.parseInt(x.substring(start, stop));
                ixNum++;
                start=i+1;
                
            }
        }
        start=0;
        for(int i=0;i<y.length();i++){
            if(y.charAt(i)==' '){
                stop=i;
                list2[iyNum]=Integer.parseInt(y.substring(start, stop));
                iyNum++;
                start=i+1;
            }
        }
        int[] result = new int[list1.length+list2.length];
        result = merge(list1,list2);
        Arrays.sort(result);
        System.out.print("The merge list is ");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }
    
    public static int[] merge(int[] list1 , int[] list2){
        int count=0;
        int[] result = new int[list1.length+list2.length];
        for(int i=0;i<list1.length;i++){
            result[count] = list1[i];
            count++;
        }
        for(int i=0;i<list2.length;i++){
            result[count] = list2[i];
            count++;
        }
        return result;
    }
}
