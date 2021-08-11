/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab052;

/**
 *
 * @author hp
 */
public class RegularPolygon {
    private int n;
    private double side = 1;
    private double x;
    private double y;
    RegularPolygon(){
    }
    RegularPolygon(int n,double side){
        this.n=n;
        this.side=side;
    }
    RegularPolygon(int n,double side,double x,double y){
        this.x=x;
        this.y=y;
        this.n=n;
        this.side=side;
    }
    double Findarea(){
        return n*side*side/4*Math.tan(Math.PI/n);
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public int getN() {
        return n;
    }
    public double getSide() {
        return side;
    }
}
