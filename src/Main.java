
import java.awt.Color;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

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
       
       //creating Car objects 
       
       /*
       
       Car myCar = new Car(25.5,"1BC32E",Color.BLUE,true);
       
       Car sallyCar = new Car(13.9, "3D20BN",Color.BLACK,false);
       
       System.out.println("My Car's License Plate: " + myCar.licensePlate);
       System.out.println("Sally's License Plate: " + sallyCar.licensePlate);
       
       System.out.println(myCar.paintColor);
       myCar.changePaintColor(Color.RED);
       System.out.println(myCar.paintColor);
       
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
       
    }
}
