/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lifemetric;

/**
 *
 * @author Felipe Paneque
 */
public class CalorieTrackerUser {
        private String gender,biotype,exercise;
        private int age;
        private double height, weight;
        
        //constructor
        public CalorieTrackerUser(String gender, String biotype, String exercise, int age, double height, double weight) {
            this.gender = gender;
            this.biotype = biotype;
            this.exercise = exercise;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }
       
        public CalorieTrackerUser(){
            gender = biotype = exercise = "";
            age = 0;
            height = weight = 0.0;
        }
        
        //getter
        public String getGender() {
            return gender;
        }
        public String getBiotype() {
            return biotype;
        }
        public String getExercise() {
            return exercise;
        }
        public int getAge() {
            return age;
        }
        public double getHeight() {
            return height;
        }
        public double getWeight() {
            return weight;
        }
        
        //setter
        public void setGender(String gender) {
            this.gender = gender;
        }
        public void setBiotype(String biotype) {
            this.biotype = biotype;
        }
        public void setExercise(String exercise) {
            this.exercise = exercise;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void setHeight(double height) {
            this.height = height;
        }
        public void setWeight(double weight) {
            this.weight = weight;
        }
        
        
        
}
