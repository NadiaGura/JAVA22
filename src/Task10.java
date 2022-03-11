/*
Exercise 10

Write a program that takes an integer from the user and prints all its divisors in the console, each divisor in separate line.
For example, for the number 21, the program should write in the console the numbers: 1, 3, 7, 21 (in new line each).
Get the data from the user in the console using the Scanner class.
*/

import java.util.Scanner;

//program will print all number divisors
public class Task10 {
    //MAIN
    public static void main(String[] args) {
        //ASKING FOR USER INPUT
        Scanner n = new Scanner(System.in); // create new Scanner class object
        System.out.println("Please enter your number.");
        int userNumber = n.nextInt();

        //CALCULATING DIVISORS FOR USER INT INPUT

        //starting iterating while <= that user input number
        for (int i = 1; i <= userNumber; ++i)
            if (userNumber % i == 0) { // if modulo = 0 -> there is no remainder -> i = divisor
                System.out.println("Divisors are" + i);
            }
    }
}

