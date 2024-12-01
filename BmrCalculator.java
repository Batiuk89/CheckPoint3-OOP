/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifemetric;

/**
 *
 * @author Felipe Paneque
 */
public class BmrCalculator extends CalorieTrackerUser{
    private double bmr;
    
    //constructor
    public BmrCalculator(String gender, String biotype, String exercise, int age, double height, double weight, double bmr) {
        super(gender, biotype, exercise, age, height, weight);
        this.bmr = bmr;
    }
    public BmrCalculator() {
        bmr = 0.0;
    }
    
    //getter
    public double getBmr(){
        return bmr;
    }
    
    //setter
    public void setBmr(double bmr){
        this.bmr = bmr;
    }
    
    public void compute(){
        
    }
    
}
