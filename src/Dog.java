/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Peter
 */
public class Dog {
    
    int dogAge;
    String dogName;
    String dogColor;
   
    public Dog(int inputDogAge, String inputDogName, String inputDogColor){
        this.dogAge = inputDogAge;
        this.dogName = inputDogName;
        this.dogColor = inputDogColor;
    }
    
    public String bark(String targetOfBark){
        String statement = this.dogName + " barks at " + targetOfBark;
        return statement;
    }
    
    public String getsOlder(int ageAmount){
        this.dogAge += ageAmount;
        String statement = this.dogName + " is now " + this.dogAge + " years old!";
        return statement;
    }
    
    public String changesColor(String newColor){
        this.dogColor = newColor;
        String statement = this.dogName + " is now the color " + this.dogColor + "!??!";
        return statement;
    }
    
}
