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
public class Stock {
    String symbol ;
    String name ;
    double previousClosingPrice ;
    double currentPrice ;
    Stock(){}
    Stock(String newSymbol,String newName){
        symbol = newSymbol;
        name = newName;
    }
    double getChangePercent(){
      return (currentPrice - previousClosingPrice)/previousClosingPrice*100;
    }
}
