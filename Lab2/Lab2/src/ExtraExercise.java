/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class ExtraExercise {
    public static void main(String[] args) {
        int x=1,y=3,fx=2;
        for(int i=0;i<10;i++){
            if(i%2==0){
                System.out.print(x+", ");
                x+=fx;
                fx+=2;
            }
            else{
                if(i==9){
                    System.out.println(y);
                }
                else{
                    System.out.print(y+", ");
                }                
                y+=3;
            }
        }
    }
}
