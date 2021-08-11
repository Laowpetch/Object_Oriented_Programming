/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab061;

/**
 *
 * @author hp
 */
public class BMI {
    private String name;
    private double height,weight;
    private double BMI;
    private int age;
    final double kpp = 0.45359237;
    final double ipm = 0.0254;
    public BMI(){
    }
    public BMI(String name,int age,double height,double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.height*=ipm;
        this.weight*=kpp;
    }
    double calculate(){
        BMI = weight/height/height;
        return BMI;
    }
    String interpretation(){
        if(BMI<18.5){
            return "Underweight";
        }
        else if(BMI<25.){
            return "Normal";
        }
        else if(BMI<30.){
            return "Overweight";
        }
        else{
            return "obese";
        }
    }
    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getBMI() {
        return BMI;
    }

    public int getAge() {
        return age;
    }

    public double getKpp() {
        return kpp;
    }

    public double getIpm() {
        return ipm;
    }
    
}
