/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author hp
 */
public class Lab03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        render();
    }
    public static void render() {
        int count,numberCount=0;
        int a,b,c;
        boolean palindrome=true;
        for(int i=1;i<=100;i++){
            count=0;
            for(int j=1;j<=i;j++){
                if((i%j)==0){
                    count++;
                }
            }
            
            if(i<10){
                palindrome = true;
            }
            else if(i<100){
                c=i%10;
                b=(i/10)%10;
                if(b==c){
                    palindrome = true;
                }
                else{
                    palindrome = false;
                }
            }
            else if(i<1000){
                c=i%10;
                a=(i/100)%10;
                if(a==c){
                    palindrome = true;
                }
                else{
                    palindrome = false;
                }
            }
            
            
            
            else{
                palindrome = false;
            }
            if(count==2&&palindrome==true){
                System.out.print(i+" ");
                numberCount++;
            }
            if(numberCount%10==0&&numberCount!=0){
                System.out.println("");
                numberCount=0;
            }
        }
    }
    
}
