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
public class Queue {
    private int[] elements;
    private int size;
    private final int defalutCapacity = 8;
    public Queue(){
        elements = new int[defalutCapacity];
    }
    public void enqueue(int v){
        if (this.size >= elements.length-1) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }
    public int dequeue() {
        int v = elements[0];
        int[] temp = new int[elements.length];
        System.arraycopy(elements, 1, temp, 0, size);
        elements = temp;
        size--;
        if(size<0){
            System.out.println("can't dequeue more than Queue");
            System.exit(0);
        }
        return v;
    }
    public void showQueue() {
      for(int i=0;i<elements.length;i++)
      {
           System.out.print(getElements()[i]+ " ");
           if(getElements()[i]==0)
           {break;}
      }
        System.out.println("");
    }
    public boolean empty() {
        return size == 0;
    }
    public int getSize() {
        return size;
    }
    public int[] getElements() {
        return elements;
    }
}
