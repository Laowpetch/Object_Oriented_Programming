/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studying;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author hp
 */
public class Studying {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 //      demoFileWriter();
        demoFileReader();
    }
    public static void demoFileWriter(){
        try {
            FileWriter w = new FileWriter("c:/abc/output1.txt");
            w.write("Hello");
            w.close();
        } catch (IOException ex) {
            Logger.getLogger(Studying.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void demoFileReader(){
        try {
            FileReader r = new FileReader("c:/abc/output1.txt");
            int data;
            while((data = r.read()) != -1){
                System.out.printf("%c",data);
            }
            System.out.println("");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Studying.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Studying.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
