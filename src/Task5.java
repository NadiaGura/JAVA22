/*
Exercise 5

Write a program that takes a positive integer from the user - number (int), and then
prints all positive odd numbers not greater than the given number in the console in order, each number in new line.
For example, for the number 15, the program should write in the console the numbers: 1, 3, 5, 7, 9, 11, 13, 15 (in new line each)
Get the data from the user in the console using the Scanner class.
*/

import java.util.Scanner;

//taking positive (>0) int from user and then printing all positive odd numbers (/2 !=0)
public class Task5 {

    //MAIN
    public static void main(String[] args) {
        Scanner insertNumber = new Scanner(System.in); // creating Scanner object

        //TAKING NUMBER FROM USER
        System.out.println("Please enter whole positive number.");
        int number = insertNumber.nextInt();
        //System.out.println(number);

        //PRINTING POSITIVE ODD NUMBERS < NUMBER
        for (int i = 0; i <= number; i++) { //traversing through the array of numbers set by the user
            if (i % 2 == 0) { // if number is even we continue traversing
                continue;
            } else {
                System.out.println(i); // if number is odd print it into the console

            }
        }
    }

}
