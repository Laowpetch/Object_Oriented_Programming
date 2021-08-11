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
public class Lab022 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("scissor (0), rock (1), paper (2): ");
        int playerPlay = input.nextInt();
        if(playerPlay<0||playerPlay>2){
            System.out.println("You entered wrong number");
        }
        else{
        int computerPlay = rand.nextInt(2);
        System.out.print("The computer is ");
        if(computerPlay==0){
            System.out.print("scissor. ");
        }
        else if(computerPlay==1){
            System.out.print("rock. ");
        }
        else{
            System.out.print("paper. ");
        }
        
        if(playerPlay==0){
            System.out.print("You are scissor");
        }
        else if(playerPlay==1){
            System.out.print("You are rock");
        }
        else{
            System.out.print("You are paper");
        }
        
        if(playerPlay==computerPlay){
            System.out.println(" too. It is a draw");
        }
        else if((playerPlay==0&&computerPlay==2)||(playerPlay==1&&computerPlay==0)||(playerPlay==2&&computerPlay==1)){
            System.out.println(". You won");
        }
        else{
            System.out.println(". You lose");
        }
    }
    }
}
