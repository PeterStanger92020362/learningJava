
import java.awt.Color;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Peter
 */
public class Main {
    
    public static void main(String[] args) {
       
        /*
       Car myCar = new Car(25.5,"1BC32E",Color.BLUE,true);
       
       Car sallyCar = new Car(13.9, "3D20BN",Color.BLACK,false);
       
       System.out.println("My Car's License Plate: " + myCar.licensePlate);
       System.out.println("Sally's License Plate: " + sallyCar.licensePlate);
       
       System.out.println(myCar.paintColor);
       myCar.changePaintColor(Color.RED);
       System.out.println(myCar.paintColor);
       
       
       double myCarSpeed = 50;
       myCarSpeed = myCar.speedingUp(myCarSpeed);
       System.out.println(myCarSpeed);
       */   
        
       //System.out.println("Enter a word:");
       
       /*
       Scanner sc = new Scanner(System.in);
       int userNumber = sc.nextInt();
       System.out.println(userNumber);
       double userNumber2 = sc.nextDouble();
       System.out.println(userNumber2);
       */
       
       /*
       String userInput = sc.next();
       String uppercased = userInput.toUpperCase();

       System.out.println(userInput);
       System.out.println(uppercased);
       
       char firstCharacter = userInput.charAt(0);
       System.out.println(firstCharacter);
       
       System.out.println("Contains: " + 
               userInput.contains("Enter".toLowerCase()));
       
       */
       /*
       // 31, 45, 22, 98, 10
       int[] numbers = new int[5];
       
       
       int[] numbers2 = {31, 45, 22, 98 ,10};
       Arrays.sort(numbers2);
       System.out.println(Arrays.toString(numbers2));
       
       String[] myFavoriteCandyBars = {"Twix", "Hershey's", "Crunch"};
       System.out.println("Index 1: " + myFavoriteCandyBars[1]);
       myFavoriteCandyBars[2] = "Butterfinger";
       System.out.println("Index 2: " + myFavoriteCandyBars[2]);
       System.out.println("Length: " + myFavoriteCandyBars.length);
       
       System.out.println(Array.get(myFavoriteCandyBars, 2));
       */
       
       /*
       String s = "dog";
       String replacedF = s.replace("d","f");
       System.out.println(replacedF);
       */
       
       // Challenge: Create a Blueprint and an Instance
       /*
       Dog rover = new Dog(4,"Rover","Brown");
       System.out.println(rover.bark("the cat!"));
       
       System.out.println(rover.getsOlder(3));
       
       System.out.println(rover.changesColor("purple"));
       */
       
       
       // Decision making with IF
       /*
       System.out.println("Enter an age:");
       Scanner in = new Scanner(System.in);
       int age = in.nextInt();
       
       if (age >= 0 && age <= 5) {
           System.out.println("Baby");
       } else if (age >= 6 && age <= 11) {
           System.out.println("Kid");
       } else if (age >= 12 && age <= 17) {
           System.out.println("Teen");
       } else if (age >= 18) {
           System.out.println("Adult");
       } else {
           System.out.println("Invalid");
       }
       
       System.out.println("Thanks for using this program!");
       */
       
       // Using libraries
       /*
       double power = Math.pow(5, 3);
       System.out.println(power);
       
       double squareRoot = Math.sqrt(64);
       System.out.println(squareRoot);
       
       Random rand = new Random();
       int randomNumber = rand.nextInt();
       int randomNumberWithBound = rand.nextInt(10);
       System.out.println(randomNumber);
       System.out.println(randomNumberWithBound);
       */
       
       //Debugging with Print Statements
       
       Coin c = new Coin();
       System.out.println("Initial: " + c.getFaceUp());
       
       for(int i=0; i<10; i++) {
           c.flip();
           System.out.println("After Flip: " + c.getFaceUp());
       }
       
    }
}
