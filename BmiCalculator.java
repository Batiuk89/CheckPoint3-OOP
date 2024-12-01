/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifemetric;

/**
 *
 * @author Felipe Paneque
 */
public class BmiCalculator extends CalorieTrackerUser{
    private double bmi;
    private String output;
    
    //constructor
    public BmiCalculator(String gender, String biotype, String exercise, int age, double height, double weight, double bmi, String output) {
        super(gender, biotype, exercise, age, height, weight);
        this.bmi = bmi;
        this.output = output;
    }  
    public BmiCalculator() {
        bmi = 0;
        output = "";   
    }
    
    //getter

    public double getBmi() {
        return bmi;
    }
    public String getOutput() {
        return output;
    }
    
    //setter

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }
    public void setOutput(String output) {
        this.output = output;
    }
    
  
    public void compute(){
        
    }
    
}
