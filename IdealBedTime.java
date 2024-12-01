/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifemetric;

/**
 *IdealBedTime.java
 *@author Murilo Carlos Batiuk
 * November 21st 2024
 */
public class IdealBedTime extends SleepTracker {
    
    //variables
    private int wakeUpTime, bedTime;
    private String message;
    
    //constructors
    public IdealBedTime(int age) {
        super (age);
//        this.wakeUpTime = wakeUpTime;
//        this.bedTime = bedTime;
    }

    public void setWakeUpTime(int wakeUpTime) {
        this.wakeUpTime = wakeUpTime;
    }

    public void setBedTime(int bedTime) {
        this.bedTime = bedTime;
    }

    // compute method   
    public String wakeUpAt(){
        
        //Toddlers (1–2 years)
        if (age >= 1 && age <= 2){
            bedTime = wakeUpTime - 12;
            return message = "You should go to bed at least at " + bedTime + ":00";
        }
        
        //Preschoolers (3–5 years)
        if (age >= 3 && age <= 5){
            bedTime = wakeUpTime - 11;
            return message = "You should go to bed at least at " + bedTime + ":00";
        }
        
        //School-age children (6–13 years)
        if (age >= 6 && age <= 13){
            bedTime = wakeUpTime - 10;
            return message = "You should go to bed at least at " + bedTime + ":00";
        }
        
        //Teenagers (14–17 years): 8–10 hours
        if (age >= 14 && age <= 17){
            bedTime = wakeUpTime - 9;
            return message = "You should go to bed at least at " + bedTime + ":00";
        }
        
        //Young adults (18–25 years) and Adults (26–64 years)
        if (age >= 18 && age <= 64){
            bedTime = wakeUpTime - 8;
            return message = "You should go to bed at least at " + bedTime + ":00";
        }
        
        //Older adults (65+ years)
        if (age < 64){
            bedTime = wakeUpTime - 7;
            return message = "You should go to bed at least at " + bedTime + ":00";
        }
       
        return message;
    }
        
 
    //get method
    public String getMessage() {
        return message;
    }
       
}
