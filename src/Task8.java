/*
Exercise 8

Write a program that takes numbers from the user as long as the number 0 is not given.
When the number 0 is given, the program calculates the sum of the numbers given and prints it in the console.
For example, for a series of given numbers: 3, 2, 5, 1, 0, the program should write the number 11 in the console.
Get the data from the user in the console using the Scanner class.
*/

import java.util.Scanner;

//while number != 0  do print it out, while number == 0 => sum all of numbers entered by the user
public class Task8 {

    //MAIN
    public static void main(String[] args) {

        Scanner takeNumber = new Scanner(System.in); // create new Scanner class object
        System.out.println("Please enter your number.");
        int n = takeNumber.nextInt();

        //CONDITION FOR USER INPUT
        int sum = 0;
        while (true) { //infinite loop
            sum += n; //calculating sum of the inputted numbers
            if (n == 0) { //if condition true (o is inputted)
                System.out.println("The sum is " + sum); // print our sum
                break; // to exit the loop
            } else {
                System.out.println("Please enter your number."); //continue asking for user data input
                n = takeNumber.nextInt();
            }
        }
    }
}