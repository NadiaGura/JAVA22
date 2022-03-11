/*
Exercise 11

Write a program that takes an integer greater than 1 from the user and checks if the number is a prime number.
In the case when this number is a prime number, the program will write a message "Yes" in the console, otherwise it will write a message "No" in the console.
If the user gives a number less than or equal to 1, the program will write in the console the message: Get the data from the user in the console using the   class.
 */

import java.util.Scanner;

//program will take an int from user that is greater than 1 and will check whether inputted int is prime.
public class Task11 {
    //MAIN
    public static void main(String[] args) {

        //ASKING FOR USER INPUT
        Scanner sc = new Scanner(System.in); // create new Scanner class object
        System.out.println("Please enter number that is greater than 1.");
        int input = sc.nextInt();

        //CONDITIONS FOR USER INPUT
        if (input <= 1) {
            System.out.println("Number entered is not valid, please enter number that is greater or equal to 1. Get the data from the user in the console using the Scanner class.");
        }

        for (int i = 2; i <= input / 2; ++i) {
            if (input % i == 0) {
                System.out.println("NO" + input);
            } else {
                System.out.println("YES" + input);
            }
        }
    }
}

