/*
Exercise 2

Write a program that based on the variable temperature in degrees Celsius - tempInCelsius (float),
will calculate the temperature in degrees Fahrenheit (degrees Fahrenheit = 1.8 * degrees Celsius + 32.0) and write it in the console.
Get the temperature from the user in the console using the Scanner class.
*/

import java.util.Scanner;

//Fahrenheit/Celsius converter (degrees Fahrenheit = 1.8 * degrees Celsius + 32.0)
public class Task2 {

    //MAIN
    public static void main(String[] args) {
        Scanner scanTemperature = new Scanner(System.in); // creating Scanner class object

        //USER INPUTTING CELSIUS TEMP
        System.out.println("Please enter temperature in degree Celsius.");
        float tempInCelsius = scanTemperature.nextFloat();
        //System.out.println(tempInCelsius);

        float tempFahrenheit = (tempInCelsius * 1.8f) + 32f; //applying formula as set in requirements
        System.out.println("It is " + tempFahrenheit + "F.");
    }
}
