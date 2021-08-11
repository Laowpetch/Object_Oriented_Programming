/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocklab041;

/**
 *
 * @author hp
 */
public class StockLab041 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stock ORCL = new Stock("ORCL","Oracle Coperation");
        ORCL.previousClosingPrice = 34.5;
        ORCL.currentPrice = 34.35;
        System.out.print("Symbol: ");
        System.out.println(ORCL.symbol);
        System.out.print("Name: ");
        System.out.println(ORCL.name);
        System.out.print("Previous Closing Price: ");
        System.out.println(ORCL.previousClosingPrice);
        System.out.print("Current Price: ");
        System.out.println(ORCL.currentPrice);
        System.out.print("Price Change: ");
        System.out.println(ORCL.getChangePercent());
    }
    
}
