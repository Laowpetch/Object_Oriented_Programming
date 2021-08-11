/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab063;

/**
 *
 * @author hp
 */
public class Lab063 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue queue = new Queue();

        int x = 8;
        for (int i = 1; i <= x ; i++) {
            System.out.print("");
            queue.enqueue(i);
        }
        queue.showQueue();
        for(int i = 1;i<=5;i++){
           System.out.println(queue.dequeue() + " is deleted "); 
        }
        
        queue.showQueue();
        
    }
    
}
