package Tasks;/*
Exercise 1

Write a program that, based on the variables: height - height (int) and weight - weight (float), checks whether a person can ride a roller coaster.
If a person is taller than 150cm and does not exceed 180kg, the program will write in the console  "Fasten your seatbelt!", Otherwise it will write in the console "I'm sorry, you can't go.".
Get the data from the user in the console using the Scanner class.
*/


import java.util.Scanner;

//program will assess height and weight params entered by user using Scanner class
// in order to make a decision whether a person is eligible to ride a roller coaster or not base on the provided requirements

public class Task1 {

    //MAIN
    public static void main(String[] args) {
        Scanner scanUser = new Scanner(System.in); //declaring Scanner class object

        //REQUESTING AND ASSESSING HEIGHT AND WEIGHT INPUT
        System.out.println("Please enter your height in centimeters.");
        int height = scanUser.nextInt();
        System.out.println("Please enter your weight in kilos.");
        float weight = scanUser.nextFloat();

        //making assessment in accordance with requirements
        if (height > 150 && weight <= 180.00f) {
            System.out.println("Fasten your seatbelt!");
        } else {
            System.out.println("I'm sorry you can't go!");
        }
    }
}


