
import java.util.Arrays;
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
public class Lab032 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start=0,stop,count=0;
        System.out.print("Enter list1: ");
        String  list1 = input.nextLine().concat(" ");
        System.out.print("Enter list2: ");
        String  list2 = input.nextLine().concat(" ");
        int num1=0,num2=0;
        for(int i=0;i<list1.length();i++){
            if(list1.charAt(i)==' '){
                num1++;
            }
        }
        int[] list1num = new int[num1];
        for(int i=0;i<list2.length();i++){
            if(list2.charAt(i)==' '){
                num2++;
            }
        }
        int[] list2num = new int[num2];
        for(int i=0;i<list1.length();i++){
            if(list1.charAt(i)==' '){
                stop=i;
                list1num[count]=Integer.parseInt(list1.substring(start,stop));
                count++;
                start=i+1;
            }
        }
        count=0;
        start=0;
        for(int i=0;i<list2.length();i++){
            if(list2.charAt(i)==' '){
                stop=i;
                list2num[count]=Integer.parseInt(list2.substring(start,stop));
                count++;
                start=i+1;
            }
        }
        int[] result = merge(list1num,list2num);
        Arrays.sort(result);
        System.out.print("The merge list is ");
        for(int i=0;i<result.length;i++){
            System.out.print(" "+result[i]);
        }
        System.out.println("");
    }
    public static int[] merge(int[] list1,int[] list2){
        int i;
        int[] result = new int[list2.length+list1.length];
        System.out.println(list2.length+list1.length);
        for(i=0;i<list1.length;i++){
            result[i] = list1[i];
        }
        for(int j=0;j<list2.length;j++){
            result[i] = list2[j];
            i++;
        }
        return result;
    }
}
